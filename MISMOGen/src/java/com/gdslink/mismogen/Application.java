/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen;

import com.gdslink.mpmerge.santander.soap.MTXSOVWSPortTypeHTTP;
import com.gdslink.mpmerge.santander.soap.MTXSOVWSService;
import javax.xml.ws.BindingProvider;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author simon
 */
public class Application
{
    //singleton

    private static Application __instance = null;

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
    private MTXSOVWSPortTypeHTTP _soapPort = null;

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
        _filenameStylesheet = string;
    }
        
    public String getBdmUrl()
    {
        return _strBdmUrl;
    }

    public void setBdmUrl(String string)
    {
        _strBdmUrl = string;

        MTXSOVWSService service = new MTXSOVWSService();
               
        MTXSOVWSPortTypeHTTP port = service.getMTXSOVWSPortHTTP();

        BindingProvider bp = (BindingProvider)port;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Application.instance().getBdmUrl());
        
        _soapPort = port;
    }

    public synchronized MTXSOVWSPortTypeHTTP getSOAPPort()
    {
        return _soapPort;
    }

}
