/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo.datasources;

import com.gdslink.fortytwo.HTTPProcessor;
import com.gdslink.fortytwo.Settings;
import com.gdslink.fortytwo.generators.Generator;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author simon.smith
 */
public class ECalsProcessor extends HTTPProcessor
{
    private static final Logger log = Logger.getLogger(ECalsProcessor.class.getName());

    public ECalsProcessor(Socket clientSocket, Settings settings, Generator generator) throws Exception
    {
        super(clientSocket, settings, generator);
    }

    @Override
    protected String getInputKey() throws Exception
    {
        log.info("Responding to ecals request");
        return "";
    }

    @Override
    protected void sendResponse(byte[] aResponseData) throws Exception
    {
        StringEntity entityResponse = new StringEntity(new String(aResponseData, Charset.forName("UTF-8")), ContentType.TEXT_PLAIN);
        getHttpResponse().setEntity(entityResponse);
    }

    @Override
    protected void sendErrorResponse(String strMessage)
    {
        try
        {
            log.warning("Returning default response to Net Connect request");

            getHttpResponse().setStatusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            StringEntity entity = new StringEntity(
                            "Invalid response! " + strMessage,
                            ContentType.TEXT_PLAIN);

            getHttpResponse().setEntity(entity);
        }
        catch(Exception ex)
        {
            log.log(Level.SEVERE, "Returning default response caused an exception", ex);
        }
    }

}
