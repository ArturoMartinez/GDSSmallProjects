/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen.web.controllers;

import com.gdslink.mismogen.web.service.MISMOService;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author simon
 */
public class MISMOController extends AbstractController
{
    private static final Logger log = Logger.getLogger(MISMOController.class);

    private String getParameter(HttpServletRequest servletRequest, String strName, boolean bMandatory) throws Exception
    {
        String strValue = servletRequest.getParameter(strName);
        if(strValue == null || strValue.trim().length() == 0)
        {
            if(bMandatory)
                throw new Exception("The parameter '" + strName + "' is missing from the request");
            else
                return "";
        }
        else
            return strValue;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception
    {
        log.info("Request received");

        Map<String, String> mapModel = new HashMap<String, String>();

        try
        {
            String strId = getParameter(servletRequest, "id", true);
                        
            String strMismo = MISMOService.getConvertedMISMO(strId);

            log.debug("Mismo found is: " + strMismo);

            mapModel.put("mismo", strMismo);
        }
        catch(Exception e)
        {
            log.error("Exception caught: " + e.getMessage(), e);
            log.info("returning error to be rendered");
            mapModel.put("error", e.getMessage());
            return new ModelAndView("error", mapModel);
        }

        log.info("Returning response for rendering");

        return new ModelAndView("mismo", mapModel);
    }

}
