/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style.web.controllers;

import com.gdslink.style.Application;
import com.gdslink.style.BureauData;
import com.gdslink.style.web.service.Applicant;
import com.gdslink.style.web.service.BDMService;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
public class BureauDataController extends AbstractController
{
    private static final Logger log = Logger.getLogger(BureauDataController.class);

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

        Map<String, Object> mapModel = new HashMap<String, Object>();

        try
        {
            String strBDPType = getParameter(servletRequest, "bdp_type", false);
            String strFacade = Application.instance().getFacade();
            String strCompany = Application.instance().getCompany();

            List<BureauData> listBureauData;

            //Activity 4_15 – Rule: Single Report?
            if(strBDPType != null && !strBDPType.isEmpty())
            {
                String strCallType = getParameter(servletRequest, "call_type", false);
                if((strCallType == null || strCallType.isEmpty()) && Application.instance().hasDefaultCallType())
                    strCallType = Application.instance().getDefaultCallType();

                String strBureauName = getParameter(servletRequest, "bureau_name", false);
                if((strBureauName == null || strBureauName.isEmpty()) && Application.instance().hasDefaultBureauName())
                    strBureauName = Application.instance().getDefaultBureauName();

                String strValidity = getParameter(servletRequest, "validity", false);
                if((strValidity == null || strValidity.isEmpty()) && Application.instance().hasDefaultValidity())
                    strValidity = Application.instance().getDefaultValidity();

                int iBDPCode = Integer.parseInt(getParameter(servletRequest, "bdp_code", true));

                List<Applicant> listApplicants = new LinkedList<Applicant>();

                listApplicants.add(new Applicant(strValidity, strBDPType,iBDPCode, new String[] {strBureauName}));
               

                //getCurrentReport
                listBureauData = BDMService.getCurrentReport(strFacade, strCompany, strCallType, 
                        listApplicants.toArray(new Applicant[listApplicants.size()]));
            }
            else
            {
                long   iRecordId = Long.parseLong(getParameter(servletRequest, "record_id", true));
                //getRawAllBureaus
                listBureauData = BDMService.getAllReports(strFacade, strCompany, iRecordId);
            }

            if(listBureauData.isEmpty())
                throw new Exception("No data to display");
            
            mapModel.put("data", listBureauData);
        }
        catch(Exception e)
        {
            log.error("Exception caught: " + e.getMessage(), e);
            log.info("returning error to be rendered");
            mapModel.put("error", e.getMessage());
            return new ModelAndView("error", mapModel);
        }

        log.info("Returning response for rendering");

        return new ModelAndView("data", mapModel);
    }

}
