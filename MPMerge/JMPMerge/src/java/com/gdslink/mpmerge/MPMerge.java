/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import com.gdslink.common.resourcethread.ResourceThreadFactory;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.*;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author simon
 */
@WebService(serviceName = "Service1", portName = "Service1Soap", endpointInterface = "org.gdsmpws.Service1Soap", targetNamespace = "http://gdsmpws.org/", wsdlLocation = "WEB-INF/wsdl/MPMerge/mpmerge.wsdl")
//@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/") //SOAP 1.2
public class MPMerge
{
    static final Logger log = Logger.getLogger(MPMerge.class);

    @Resource
    private WebServiceContext _context;

    private static ExecutorService __threadPool;
    private static int __iMaxThreads;
    private static int __iTimeout;
    private static boolean __bInitialized;

    public MPMerge()
    {

    }

    private synchronized void initialize()
    {
        if(__bInitialized)
            return;

        try
        {
            DOMConfigurator.configure(MPMerge.class.getResource("/log4j.xml"));

            log.info("Initializing MPMerge Web Service");
            logVersion();
            log.debug("Loading configuration");

            MessageContext ctxMessage = _context.getMessageContext();
            ServletContext ctxServlet = (ServletContext) ctxMessage.get(MessageContext.SERVLET_CONTEXT);

            __iMaxThreads = Integer.parseInt(ctxServlet.getInitParameter("dll_count"));
            __iTimeout = Integer.parseInt(ctxServlet.getInitParameter("mpmerge_timeout"));

            log.debug("Max Threads = " + __iMaxThreads);
            log.debug("Timeout = " + __iTimeout);
          
            List<IMPMerge> listResources = MPMergeJNIFactory.createJNIResources(__iMaxThreads);

            ResourceThreadFactory<IMPMerge> factoryThread = new ResourceThreadFactory(listResources);
            __threadPool  = Executors.newFixedThreadPool(listResources.size(), factoryThread);

            __bInitialized = true;
            log.info("Initialized successfully");
        }
        catch(Exception e)
        {
            log.error("Initialization failed: " + e.getMessage(), e);
            throw new RuntimeException("Failed to initialize web service: " + e.getMessage(), e);
        }
    }

    private void logVersion()
    {
        URL res = getClass().getResource(com.gdslink.mpmerge.MPMerge.class.getSimpleName() + ".class");
        String strVersion = "Unknown";

        try
        {
            Manifest mf = null;
            if(res.openConnection() instanceof JarURLConnection)
            {
                JarURLConnection conn = (JarURLConnection) res.openConnection();
                mf = conn.getManifest();
            }
            else
            {
                InputStream stream = getClass().getResourceAsStream("/META-INF/MANIFEST.MF");
                mf = new Manifest(stream);
            }

            Attributes atts = mf.getMainAttributes();
            if(atts.containsKey("Implementation-Version"))
                strVersion = atts.getValue("Implementation-Version");
            else
                strVersion = "No version in MANIFEST.MF";
        }
        catch(Exception e)
        {

        }

        log.info("MPMerge Implementation version: " + strVersion);
    }

    public java.lang.String mergeBureauReports( java.lang.String inputExperian1, java.lang.String inputEquifax1, java.lang.String inputTU1, java.lang.String inputExperian2, java.lang.String inputEquifax2, java.lang.String inputTU2, java.lang.String inmcfg, java.lang.String inccfg, java.lang.String stylesheet)
    {
        try
        {
            //initialize if not already (synchronized)
            initialize();

            log.info("Received call to mergeBureauReports");

            MPWrapData data = new MPWrapData();

            data.setXpnIn(inputExperian1);
            data.setEfxIn(inputEquifax1);
            data.setTuIn(inputTU1);
            data.setXpnIn2(inputExperian2);
            data.setEfxIn2(inputEquifax2);
            data.setTuIn2(inputTU2);
            data.setInmcfg(getFullPath(inmcfg));
            data.setInccfg(getFullPath(inccfg));
            data.setStylesheet(getFullPath(stylesheet));
            data.setLogLevel("YES");
            data.setVer("2.4");
            data.setLicenseData(getFullPath("MPWrap.lic"));
            

            log.info("Submitting call to worker thread");

            MPMergeCallable call = new MPMergeCallable(data);
            Future<String> futureResult = __threadPool.submit(call);

            try
            {
                log.info("Waiting for merge result");
                String strResult = futureResult.get(__iTimeout, TimeUnit.MILLISECONDS);

                if(strResult.startsWith("<"))
                {
                    log.info("Got merge result, returning SOAP response");
                    log.debug(strResult);
                    return strResult;
                }
                else
                {
                    log.error("Got non-xml merge result, returning error as xml");
                    log.error(strResult);
                    return errorToXML(strResult);
                }
            }
            catch (InterruptedException e)
            {
                throw new Exception("Interrupted Exception: " + e.getMessage());
            }
            catch (ExecutionException e)
            {
                throw new Exception("Execution Exception: " + e.getMessage());
            }
            catch (TimeoutException e)
            {
                throw new Exception("Timeout Exception: " + e.getMessage());
            }
        }
        catch(Exception e)
        {
            log.error("Call Failed: " + e.getMessage(), e);
            throw new RuntimeException("Call Failed: " + e.getMessage());
        }
        finally
        {
            log.info("Finished call to mergeBureauReports");
        }
    }

    private String errorToXML(String strError)
    {
        return strError;
    }

    private String getFullPath(String strFilename) throws Exception
    {
        if(strFilename == null || strFilename.trim().length() == 0)
            return null;

        URL url = MPMerge.class.getResource("/" + strFilename);
        if(url == null)
            throw new Exception("File not found: " + strFilename);

        return url.getPath();
    }

}
