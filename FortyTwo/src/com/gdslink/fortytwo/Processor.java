/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import com.gdslink.fortytwo.generators.Generator;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.smith
 */
public abstract class Processor implements Runnable
{
    private static final Logger log = Logger.getLogger(Processor.class.getName());

    private Settings _settings;
    private Socket _clientSocket;
    private Generator _generator;

    public Processor(Socket clientSocket, Settings settings, Generator generator)
    {
        _settings = settings;
        _clientSocket = clientSocket;
        _generator = generator;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void run()
    {
        try
        {
            handleConnection();
        }
        catch(Exception e)
        {
            log.log(Level.WARNING, "Unknown Exception occurred while processing connection", e);
        }
    }

    public void handleConnection() throws Exception
    {
        try
        {
            String strKey = getInputKey();    
            byte[] aResponseData = getResponseData(strKey);
            sendResponse(aResponseData);
        }
        catch(Exception e)
        {
            log.log(Level.WARNING, "Failed to handle transaction", e); 
            sendErrorResponse(e.getMessage());
        }
    }

    protected abstract String getInputKey() throws Exception;
    protected abstract void sendResponse(byte[] aResponseData) throws Exception;
    protected abstract void sendErrorResponse(String strMessage);

    protected byte[] getResponseData(String strKey) throws Exception
    {
        return _generator.getResponseData(strKey);
    }

    protected Socket getSocket()
    {
        return _clientSocket;
    }
    
    protected Settings getSettings()
    {
        return _settings;
    }

    protected Generator getGenerator()
    {
        return _generator;
    }

}
