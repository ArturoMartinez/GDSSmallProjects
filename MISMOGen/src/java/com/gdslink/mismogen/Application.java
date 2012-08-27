/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen;

import com.gdslink.mpmerge.santander.soap.MTXWSPortTypeHTTP;
import com.gdslink.mpmerge.santander.soap.MTXWSService;
import java.io.IOException;
import javax.xml.ws.BindingProvider;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.lang.Package;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/**
 *
 * @author simon
 */
public class Application
{
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

    private String _filenameStylesheet = null;
    private String _strBdmUrl = null;
    private MTXWSPortTypeHTTP _soapPort = null;
    private String _strTabTitles = null;
    //private String _strDefaultCompany = "";

    protected Application()
    {
        DOMConfigurator.configure(Application.class.getResource("/log4j.xml"));
        logVersion();
    }

    private void logVersion()
    {
        URL res = getClass().getResource(com.gdslink.mismogen.Application.class.getSimpleName() + ".class");
        String strVersion = "Unknown";

        try
        {
            if(res.openConnection() instanceof JarURLConnection)
            {
                JarURLConnection conn = (JarURLConnection) res.openConnection();
                Manifest mf = conn.getManifest();
                Attributes atts = mf.getMainAttributes();
                if(atts.containsKey("Implementation-Version"))
                    strVersion = atts.getValue("Implementation-Version");
                else
                    strVersion = "No version in MANIFEST.MF";
            }
        }
        catch(IOException e)
        {

        }

        log.info("MISMOGen Implementation version: " + strVersion);
    }

    public String getStylesheetFilename()
    {
        return _filenameStylesheet;
    }

    public void setStylesheetFilename(String string)
    {
        log.debug("Set Stylesheet to: " + string);
        _filenameStylesheet = string;
    }
        
    public String getBdmUrl()
    {
        return _strBdmUrl;
    }

    public void setBdmUrl(String string)
    {
        log.debug("Set BDM Url to: " + string);
        _strBdmUrl = string;
    }

    public void setTabTitles(String strTitles)
    {
        log.debug("Set Tab Titles to: " + strTitles);
        _strTabTitles = strTitles;
    }

    public String getTabTitles()
    {
        return _strTabTitles;
    }

    public String[] getTabTitlesArray()
    {
        return getTabTitles().split(";");
    }
/*
    public String getDefaultCompany()
    {
        return _strDefaultCompany;
    }

    public void setDefaultCompany(String strCompany)
    {
        _strDefaultCompany = strCompany;
    }
*/
    public synchronized MTXWSPortTypeHTTP getSOAPPort() throws Exception
    {
        if(_soapPort == null)
        {
            try
            {
                log.debug("Initializing web service");

                MTXWSService service = new MTXWSService();

                MTXWSPortTypeHTTP port = service.getMTXWSPortHTTP();

                log.debug("Setting correct BDM Url");
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
