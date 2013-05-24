/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style.web.controllers;

import com.gdslink.style.Application;
import com.sun.xml.bind.StringInputStream;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author simon
 */
public class StylesController extends AbstractController
{
    private static final Logger log = Logger.getLogger(StylesController.class);

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
            byte[] aBytes = Base64.decodeBase64(getParameter(servletRequest, "page", true));

            GZIPInputStream gzip = new GZIPInputStream(new ByteArrayInputStream(aBytes));
            byte[] aDecompressed = IOUtils.toByteArray(gzip);
            gzip.close();

            String strPage = transformPage(aDecompressed);
            log.debug("Transformed into: " + strPage);

            mapModel.put("page", strPage);

            log.info("Returning response for rendering");
            return new ModelAndView("style", mapModel);
        }
        catch(Exception e)
        {
            log.error("Exception caught: " + e.getMessage(), e);
            log.info("returning error to be rendered");
            mapModel.put("error", e.getMessage());
            return new ModelAndView("error", mapModel);
        }
    }

    private String transformPage(byte[] aData) throws Exception
    {
        log.info("Transforming data");

        for(String strRegexp : Application.instance().regularExpressions())
        {
            String strData = new String(aData, Charset.forName("UTF-8"));

            log.debug("Data to transform:" + strData);

            if(strData.matches(strRegexp))
            {
                StringWriter writerResult = new StringWriter();

                Transformer transformer = Application.instance().getStylesheet(strRegexp);
                log.debug("Transformer class: " + transformer.getClass().toString());

                transformer.transform(
                    new StreamSource(new ByteArrayInputStream(aData)),
                    new StreamResult(writerResult));
                return writerResult.toString();
            }
        }

        throw new Exception("The input data was not ina recognized format");
    }
}
