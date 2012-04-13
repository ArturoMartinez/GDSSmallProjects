/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen;

import com.gdslink.mismogen.web.service.MISMOService;
import com.gdslink.mpmerge.santander.soap.MTXWSPortTypeHTTP;
import com.gdslink.mpmerge.santander.soap.MTXWSService;
import java.net.URL;
import javax.xml.ws.BindingProvider;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

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

    protected Application()
    {
        DOMConfigurator.configure(Application.class.getResource("/log4j.xml"));
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
