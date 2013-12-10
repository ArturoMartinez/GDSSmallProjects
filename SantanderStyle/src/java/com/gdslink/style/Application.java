/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style;

import com.gdslink.santanderuk.soap.MTXUDVWSPortTypeHTTP;
import com.gdslink.santanderuk.soap.MTXUDVWSService;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.BindingProvider;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author simon
 */
public class Application 
{
    public static final String REGEX_CONSUMER = "^.*\\<ConsumerOutput\\>.*$";
    public static final String REGEX_LTD = "^.*\\<LtdCompanyData\\>.*$";
    public static final String REGEX_NONLTD = "^.*\\<NonLtdBusinessData\\>.*$";
    //public static final String REGEX_DIRECTOR = "^.*\\<DirectorData\\>.*$";


    //singleton

    private static Application __instance = null;
    private static final Logger log = Logger.getLogger(Application.class);

    public static Application instance()
    {
        if(__instance == null)
            throw new RuntimeException("Application has not been initialized");

        return __instance;
    }

    public static Application create()
    {
        if(__instance != null)
            throw new RuntimeException("Application initialized twice");

        return __instance = new Application();
    }

    //getters/setters

    private MTXUDVWSPortTypeHTTP _soapPort = null;
    private String      _strBdmUrl = null;
    private String      _strCompany = "";
    private String      _strFacade;
    private String      _strDefaultBureauName;
    private String      _strDefaultCallType;
    private String      _strDefaultValidity;
    private Map<String, Templates> _mapTemplates = new HashMap<String, Templates>();
    private Map<String, String> _mapNames = new HashMap<String, String>();

    protected Application()
    {
        try
        {
            DOMConfigurator.configure(Application.class.getResource("/log4j.xml"));
            logVersion();
        }
        catch(Exception e)
        {
            System.out.println("Error initializing logging " + e.getMessage());
            throw new Error(e);
        }

        try
        {
            log.info("Reading Stylesheet");

            //ltd

            InputStream streamIn = Application.class.getResourceAsStream("/LtdGoldReport/XSL_GOLD_REPORT.xsl");
            if(streamIn == null)
                throw new Exception("Stylesheet \"XML_GOLD_REPORT\" not found");

            TransformerFactory factoryTransformer = TransformerFactory.newInstance();
            factoryTransformer.setURIResolver(new CPURIResolver("/LtdGoldReport/"));
            _mapTemplates.put(REGEX_LTD, factoryTransformer.newTemplates(new StreamSource(streamIn)));
            _mapNames.put(REGEX_LTD, "Ltd Company");

            //non ltd

            streamIn = Application.class.getResourceAsStream("/NonLimitedXSL.1.1/XSL_NONLIMITED_REPORT.xsl");
            if(streamIn == null)
                throw new Exception("Stylesheet \"XSL_NONLIMITED_REPORT\" not found");

            factoryTransformer = TransformerFactory.newInstance();
            factoryTransformer.setURIResolver(new CPURIResolver("/NonLimitedXSL.1.1/"));
            _mapTemplates.put(REGEX_NONLTD, factoryTransformer.newTemplates(new StreamSource(streamIn)));
            _mapNames.put(REGEX_NONLTD, "Non-Ltd Company");

            //consumer

            streamIn = Application.class.getResourceAsStream("/NonLtdProprietor/XSL_NONLIMITED_PROPRIETOR_REPORT.xsl");
            if(streamIn == null)
                throw new Exception("Stylesheet \"XSL_NONLIMITED_PROPIETOR_REPORT\" not found");

            factoryTransformer = TransformerFactory.newInstance();
            factoryTransformer.setURIResolver(new CPURIResolver("/NonLtdProprietor/"));
            _mapTemplates.put(REGEX_CONSUMER, factoryTransformer.newTemplates(new StreamSource(streamIn)));
            _mapNames.put(REGEX_CONSUMER, "Non-Ltd Proprietor");
            
            //director
            /*
            streamIn = Application.class.getResourceAsStream("/DirectorReport/XSL_DIRECTOR_REPORT.xsl");
            if(streamIn == null)
               throw new Exception("Stylesheet \"XSL_DIRECTOR_REPORT\" not found");
            
            factoryTransformer = TransformerFactory.newInstance();
            factoryTransformer.setURIResolver(new CPURIResolver("/DirectorReport/"));
            _mapTemplates.put(REGEX_DIRECTOR, factoryTransformer.newTemplates(new StreamSource(streamIn)));
            _mapNames.put(REGEX_DIRECTOR, "Director");
            */ 
        }
        catch(Exception e)
        {
            log.error("Error initializing style sheets " + e.getMessage());
            throw new Error(e);
        }
    }

    public String getNameFor(String strRegexp)
    {
        return _mapNames.get(strRegexp);
    }

    private void logVersion()
    {
        URL res = getClass().getResource(com.gdslink.style.Application.class.getSimpleName() + ".class");
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

        log.info("MISMOGen Implementation version: " + strVersion);
    }

    public Set<String> regularExpressions()
    {
        return _mapTemplates.keySet();
    }

    public synchronized Transformer getStylesheet(String strRegexp) throws Exception
    {
        return _mapTemplates.get(strRegexp).newTransformer();
    }
        
    public String getBdmUrl()
    {
        return _strBdmUrl;
    }

    public void setBdmUrl(String string) throws Exception
    {
        log.debug("Set BDM Url to: " + string);
        _strBdmUrl = string;
        try {
            getSOAPPort();
        } 
        catch (Exception ex)
        {
            log.error("Failed to initialise the web service port", ex);
            throw ex;
        }
    }

    public String getCompany()
    {
        return _strCompany;
    }

    public void setCompany(String strCompany)
    {
        log.debug("Set Company to: " + strCompany);
        _strCompany = strCompany;
    }

    public String getFacade()
    {
        return _strFacade;
    }

    public void setFacade(String strFacade)
    {
        log.debug("Set Facade to: " + strFacade);
        _strFacade = strFacade;
    }
    public void setDefaultBureauName(String strBureauName)
    {
        log.debug("Set default bureau name to: " + strBureauName);
        _strDefaultBureauName = strBureauName;
    }

    public String getDefaultBureauName()
    {
        return _strDefaultBureauName;
    }

    public boolean hasDefaultBureauName()
    {
        return _strDefaultBureauName != null && !_strDefaultBureauName.isEmpty();
    }

    public void setDefaultCallType(String strCallType)
    {
        log.debug("Set default call type to: " + strCallType);
        _strDefaultCallType = strCallType;
    }

    public String getDefaultCallType()
    {
        return _strDefaultCallType;
    }

    public boolean hasDefaultCallType()
    {
        return _strDefaultCallType != null & !_strDefaultCallType.isEmpty();
    }

    public void setDefaultValidity(String strValidity)
    {
        log.debug("Set default validity to:" + strValidity);
        _strDefaultValidity = strValidity;
    }

    public String getDefaultValidity()
    {
        return _strDefaultValidity;
    }

    public boolean hasDefaultValidity()
    {
        return _strDefaultValidity != null && !_strDefaultValidity.isEmpty();
    }
    
    public synchronized MTXUDVWSPortTypeHTTP getSOAPPort() throws Exception
    {
        if(_soapPort == null)
        {
            try
            {
                log.debug("Initializing web service");

                MTXUDVWSService service = new MTXUDVWSService();

                MTXUDVWSPortTypeHTTP port = service.getMTXUDVWSPortHTTP();

                log.debug("Setting correct BDM Url");
                //use of this port should be threadsafe as long as we dont use security tokens or modify the context again.
                BindingProvider bp = (BindingProvider)port;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, _strBdmUrl);

                _soapPort = port;
                log.debug("Initialization complete");
            }
            catch(Exception e)
            {
                log.error("Exception caught:" + e.getMessage(), e);
                throw new Exception("Error creating web service client", e);
            }
        }

        return _soapPort;
    }
}
