/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen.web.service;

import com.gdslink.mismogen.Application;
import com.gdslink.mpmerge.santander.soap.ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsINType;
import com.gdslink.mpmerge.santander.soap.GetMISMOAllApplicantsResponse;
import com.gdslink.mpmerge.santander.soap.GetMISMOAllApplicants;
import com.gdslink.mpmerge.santander.soap.ComBanestoAlMtxcorGestionMFCbCBKMISMOType;
import com.gdslink.mpmerge.santander.soap.GetMISMOAllApplicantsFault;
import com.gdslink.mpmerge.santander.soap.Faultreason;
import com.gdslink.mpmerge.santander.soap.ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsINType;
import com.sun.xml.bind.StringInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class MISMOService
{
    private static final Logger log = Logger.getLogger(MISMOService.class);

    public static String getMismo(String strId) throws Exception 
    {
        log.info("Fetching mismo");

        GetMISMOAllApplicantsResponse response = null;

        try
        {
            ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsINType inputInner = new ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsINType();
            inputInner.setBureauId(Long.parseLong(strId));

            GetMISMOAllApplicants input = new GetMISMOAllApplicants();
            input.setGetMismoIN(inputInner);
            input.setFacade("MTXWS");
            response = getMISMOAllApplicants(input);

            if(response != null && response.getMethodResult() != null)
            {
                if(response.getMethodResult().getMISMOApplicantLevel() != null &&
                    response.getMethodResult().getMISMOApplicantLevel().getMismoInfo() != null)
                {
                    String strFirstMISMO = null;

                    log.debug("Number of mismos returned: " + response.getMethodResult().getMISMOApplicantLevel().getMismoInfo().size());

                    for(ComBanestoAlMtxcorGestionMFCbCBKMISMOType result : response.getMethodResult().getMISMOApplicantLevel().getMismoInfo())
                    {
                        if(result.getBDPId() != null)
                        {
                            log.debug("BPDId/CODIGODEPERSONA = " + result.getBDPId().getCODIGODEPERSONA());
                            log.debug("BPDId/TIPODEPERSONA = " + result.getBDPId().getTIPODEPERSONA());
                        }

                        log.debug("MISMO = " + result.getMismo());

                        if(strFirstMISMO == null)
                            strFirstMISMO = result.getMismo();
                        else
                            log.warn("additional MISMO in results, not returned to stylesheet processor");
                    }

                    if(strFirstMISMO != null)
                        return strFirstMISMO;
                }
                else if(response.getMethodResult().getMensaje() != null)
                {
                    log.warn("Error message from TBM: " + response.getMethodResult().getMensaje());
                    throw new Exception(response.getMethodResult().getMensaje());
                }
            }

            throw new Exception("No response returned from web service");
        }
        catch(NumberFormatException e)
        {
            log.warn("The 'id' parameter is not a valid number:" + strId);
            throw new Exception("The 'id' parameter is not a valid number:" + strId);
        }
        catch(GetMISMOAllApplicantsFault e)
        {
            log.error("An error occurred while retrieving the MISMO: " + e.getMessage());

            StringBuilder strReasons = new StringBuilder();
            try
            {
                for(Faultreason reason : e.getFaultInfo().getReasons().getReason())
                    log.error("Reason: " + reason.getText());
             
                log.error("Additional info: " + e.getFaultInfo().getAdditionalInfo());
                log.error("Fault code: " + e.getFaultInfo().getFaultCode());
            }
            catch(Exception ex)
            {
                log.error("Error occurred while retriving error message");
            }

            throw new Exception("An error occurred while retrieving the MISMO: " + e.getMessage());
        }
    }

    private static Transformer getStyleSheet() throws java.lang.Exception
    {
        log.info("Reading Stylesheet");

        InputStream streamIn = MISMOService.class.getResourceAsStream(Application.instance().getStylesheetFilename());
        if(streamIn == null)
            throw new java.lang.Exception("Stylesheet not found");

        TransformerFactory factoryTransformer = TransformerFactory.newInstance();
        return factoryTransformer.newTransformer(new StreamSource(streamIn));
    }

    public static String getConvertedMISMO(String strId) throws Exception
    {
        String strMismo = getMismo(strId);

        StringWriter writerResult = new StringWriter();

        log.info("Transforming mismo");
        
        getStyleSheet().transform(
                new StreamSource(new StringInputStream(strMismo)),
                new StreamResult(writerResult));

        return writerResult.toString();
    }

    private static GetMISMOAllApplicantsResponse getMISMOAllApplicants(GetMISMOAllApplicants getMISMOAllApplicantsInputPart) throws GetMISMOAllApplicantsFault, Exception
    {
        return Application.instance().getSOAPPort().getMISMOAllApplicants(getMISMOAllApplicantsInputPart);
    }
}
