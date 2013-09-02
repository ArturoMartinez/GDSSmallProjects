/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo.datasources;

import com.gdslink.fortytwo.HTTPProcessor;
import com.gdslink.fortytwo.Settings;
import com.gdslink.fortytwo.generators.Generator;
import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.w3c.dom.Document;
/**
 *
 * @author GDS Link Asia
 */
public class MersProcessor extends HTTPProcessor{
    
     private static final Logger log = Logger.getLogger(NetConnectProcessor.class.getName());

    public MersProcessor(Socket clientSocket, Settings settings, Generator generator)
    {
        super(clientSocket, settings, generator);
    }
    
    @Override
    protected String getInputKey() throws Exception
    {
        log.info("Responding to Mers request");

        HttpRequest httpRequest = getHttpRequest();

        log.fine(httpRequest.getClass().getName());

        if(!(httpRequest instanceof BasicHttpEntityEnclosingRequest))
            throw new Exception("Input request has no POST data");

        log.fine("Getting post data");
        HttpEntity entityRequest = ((BasicHttpEntityEnclosingRequest)httpRequest).getEntity();

        byte[] aPostData = IOUtils.toByteArray(entityRequest.getContent());

        log.fine(new String(aPostData, Charset.forName("UTF-8")));

        log.fine("Building DOM document");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        ByteArrayInputStream stream = new ByteArrayInputStream(aPostData);
        //stream.skip("&NETCONNECT_TRANSACTION=".length());
        Document document = builder.parse(stream);

        log.fine("Building XPath");
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        XPathExpression expr = xpath.compile("/REQUEST_GROUP/REQUEST/REQUEST_DATA/MERS_RESIDENTIAL_REGISTRATION_REQUEST/BORROWER/_FirstName");

        log.fine("Extracting FirtsName");
        String strFNAME = expr.evaluate(document);

        log.log(Level.INFO, "FirstName = {0}", strFNAME);

        return strFNAME;
    }

    @Override
    protected void sendErrorResponse(String strMessage)
    {
        try
        {
            log.warning("Returning default response to Mers request");

            getHttpResponse().setStatusCode(HttpStatus.SC_OK);
            StringEntity entity = new StringEntity(
                            "Invalid response! " + strMessage,
                            ContentType.create("text/html", "UTF-8"));

            getHttpResponse().setEntity(entity);
        }
        catch(Exception ex)
        {
            log.log(Level.SEVERE, "Returning default response caused an exception", ex);
        }
    }
}
