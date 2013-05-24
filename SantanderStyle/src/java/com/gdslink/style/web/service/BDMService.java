/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style.web.service;

import com.gdslink.santanderuk.soap.*;
import com.gdslink.style.Application;
import com.gdslink.style.BureauData;
import java.lang.Exception;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class BDMService
{
    private static final Logger log = Logger.getLogger(BDMService.class);

    public static List<BureauData> getAllReports(String strFacade, String strCompany, long iRecordId) throws Exception
    {
        try
        {
            BUREAUIDMTXType bureauId = new BUREAUIDMTXType();
            bureauId.setEMPRESA(strCompany);
            bureauId.setNUMEXPEDIENTE(iRecordId);

            ComBanestoAlMtxscuGestionEFCbCBKBureauIdType bureauType = new ComBanestoAlMtxscuGestionEFCbCBKBureauIdType();
            bureauType.setBureauId(bureauId);

            GetRawAllBureaus input = new GetRawAllBureaus();
            input.setFacade(strFacade);
            input.setBureauId(bureauType);

            GetRawAllBureausResponse response = getRawAllBureaus(input);

            if(response != null && response.getMethodResult() != null)
            {
                if(response.getMethodResult().getRawList() != null && response.getMethodResult().getRawList().getRawData() != null)
                {
                    log.debug("Number of raw sections returned: " + response.getMethodResult().getRawList().getRawData().size());

                    List<BureauData> listBureauData = new LinkedList<BureauData>();

                    for(ComBanestoAlMtxscuGestionEFCbCBKRawListType result : response.getMethodResult().getRawList().getRawData())
                    {
                        if(result.getBdpId() != null)
                        {
                            log.debug("BPDId/CODIGODEPERSONA = " + result.getBdpId().getCODIGODEPERSONA());
                            log.debug("BPDId/TIPODEPERSONA = " + result.getBdpId().getTIPODEPERSONA());
                        }

                        String strData = result.getRawData();

                        if(strData != null && strData.length() > 0)
                        {
                            BureauData bureauData = new BureauData(result.getDate().toString(), strData);

                            log.debug("Report = " + bureauData.getRaw());
                            log.debug("Bureau = " + bureauData.getBureau());

                            if(bureauData.isRecognized())
                                listBureauData.add(bureauData);
                        }
                    }
                
                    return listBureauData;
                }
                else if(response.getMethodResult().getMessage() != null)
                {
                    log.warn("Error message from BDM: " + response.getMethodResult().getMessage());
                    throw new Exception(response.getMethodResult().getMessage());
                }
            }

            throw new Exception("No valid response returned from web service");
        }
        catch(GetRawAllBureausFault e)
        {
            log.error("An error occurred while retrieving the report: " + e.getMessage());

            try
            {
                for(Faultreason reason : e.getFaultInfo().getReasons().getReason()) {
                    log.error("Reason: " + reason.getText());
                }

                log.error("Additional info: " + e.getFaultInfo().getAdditionalInfo());
                log.error("Fault code: " + e.getFaultInfo().getFaultCode());
            }
            catch(Exception ex)
            {
                log.error("Error occurred while retriving error message, Exception: " + ex.getMessage());
            }

            throw new Exception("An error occurred while retrieving the report: " + e.getMessage());
        }
    }

    public static List<BureauData> getCurrentReport(
                String strFacade,
                String strCompany,
                String strCallType,
                Applicant[] aApplicants) throws Exception
    {
        try
        {
            ComBanestoAlMtxscuGestionEFCbCBIApplicantBureauType appBureauType = new ComBanestoAlMtxscuGestionEFCbCBIApplicantBureauType();
            for(Applicant applicant : aApplicants)
            {
                NUMPERSONACLIENTEType clientType = new NUMPERSONACLIENTEType();
                clientType.setTIPODEPERSONA(applicant.getPersonType());
                clientType.setCODIGODEPERSONA(applicant.getPersonCode());

                ComBanestoAlMtxscuGestionEFCbCBIBureauNamesType bureauNames = new ComBanestoAlMtxscuGestionEFCbCBIBureauNamesType();
                bureauNames.getBureauName().addAll(Arrays.asList(applicant.getBureauNames()));

                ComBanestoAlMtxscuGestionEFCbCBKApplicantBureauType appBureauTypeK = new ComBanestoAlMtxscuGestionEFCbCBKApplicantBureauType();
                appBureauTypeK.setBdpId(clientType);
                if(applicant.getValidity() != null && !applicant.getValidity().isEmpty())
                    appBureauTypeK.setValidity(applicant.getValidity());
                appBureauTypeK.setBureauNames(bureauNames);
               
                appBureauType.getApplicant().add(appBureauTypeK);
            }

            ComBanestoAlMtxscuGestionEFCbCBKCurrentBureauDataINType inType = new ComBanestoAlMtxscuGestionEFCbCBKCurrentBureauDataINType();

            inType.setCompany(strCompany);
            if(strCallType != null && !strCallType.isEmpty())
                inType.setCallType(strCallType);

            inType.setApplicants(appBureauType);

            GetCurrentBureauData input = new GetCurrentBureauData();
            input.setFacade(strFacade);
            input.setCurrentBureauData(inType);
            GetCurrentBureauDataResponse response = getCurrentBureauData(input);

            if(response != null && response.getMethodResult() != null)
            {
                if(response.getMethodResult().getApplicants() != null &&
                    response.getMethodResult().getApplicants().getApplicant() != null)
                {
                    log.debug("Number of data sections returned: " + response.getMethodResult().getApplicants().getApplicant().size());

                    List<BureauData> listBureauData = new LinkedList<BureauData>();

                    for(ComBanestoAlMtxscuGestionEFCbCBKRawApplicantBureauType result : response.getMethodResult().getApplicants().getApplicant())
                    {
                        if(result.getBdpId() != null)
                        {
                            log.debug("BPDId/CODIGODEPERSONA = " + result.getBdpId().getCODIGODEPERSONA());
                            log.debug("BPDId/TIPODEPERSONA = " + result.getBdpId().getTIPODEPERSONA());
                        }

                        //date type? typo?
                        if(result.getRawData() != null)
                        {
                            for(ComBanestoAlMtxscuGestionEFCbCBKRawDateType data : result.getRawData().getRaw())
                            {
                                String strRawInfo = data.getRawInfo();
                                if(strRawInfo != null && strRawInfo.length() > 0)
                                {
                                    BureauData bureauData = new BureauData(data.getDate().toString(), data.getRawInfo());

                                    log.debug("Report = " + bureauData.getRaw());
                                    log.debug("Bureau = " + bureauData.getBureau());

                                    if(bureauData.isRecognized())
                                        listBureauData.add(bureauData);
                                }
                            }
                        }
                    }

                    return listBureauData;
                }
                else if(response.getMethodResult().getMessage() != null)
                {
                    log.warn("Error message from BDM: " + response.getMethodResult().getMessage());
                    throw new Exception(response.getMethodResult().getMessage());
                }
            }

            throw new Exception("No response returned from web service");
        }
        catch(GetCurrentBureauDataFault e)
        {
            log.error("An error occurred while retrieving the report: " + e.getMessage());

            try
            {
                for(Faultreason reason : e.getFaultInfo().getReasons().getReason()) {
                    log.error("Reason: " + reason.getText());
                }

                log.error("Additional info: " + e.getFaultInfo().getAdditionalInfo());
                log.error("Fault code: " + e.getFaultInfo().getFaultCode());
            }
            catch(Exception ex)
            {
                log.error("Error occurred while retriving error message, Exception: " + ex.getMessage());
            }

            throw new Exception("An error occurred while retrieving the report: " + e.getMessage());
        }
    }

    private static GetRawAllBureausResponse getRawAllBureaus(GetRawAllBureaus getRawAllBureausInputPart) throws GetRawAllBureausComBanestoAlMtxscuGestionEFExcGeneralExceptionFault, GetRawAllBureausComBanestoAlMtxscuGestionEFExcGeneralExceptionFault, GetRawAllBureausFault, Exception
    {
        return Application.instance().getSOAPPort().getRawAllBureaus(getRawAllBureausInputPart);
    }

    private static GetCurrentBureauDataResponse getCurrentBureauData(GetCurrentBureauData getCurrentBureauDataInputPart) throws GetCurrentBureauDataComBanestoAlMtxscuGestionEFExcGeneralExceptionFault, GetCurrentBureauDataFault, Exception
    {
        return Application.instance().getSOAPPort().getCurrentBureauData(getCurrentBureauDataInputPart);
    }
}
