/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.smith
 */
public class Listener implements Runnable
{
    private static final Logger log = Logger.getLogger(Listener.class.getName());

    private Settings _settings;
    private ServerSocket _serverSocket;
    private volatile boolean _bStop;
    private ProcessorFactory _processorFactory;

    public Listener(Settings settings, ProcessorFactory processorFactory) throws IOException
    {
        _settings = settings;
        _processorFactory = processorFactory;

        log.log(Level.INFO, "Opening port {0} for listening", _settings.getPort());
        _serverSocket = new ServerSocket(_settings.getPort());
        _serverSocket.setSoTimeout(2000);
    }

    @Override
    public void run()
    {
        log.info("Starting listening");
        _bStop = false;
        try
        {
            while(!_bStop)
            {
                try
                {
                    Socket clientSocket = _serverSocket.accept();
                    Processor processor = _processorFactory.newProcessor(clientSocket);
                    (new Thread(processor)).start();
                }
                catch (SocketTimeoutException e)
                {
                    //chance for loop to end
                }
            }
        }
        catch(Exception e)
        {
            log.log(Level.SEVERE, "An exception occurred on the listening socket", e);
        }

        log.info("Stopped listening");
    }

    public void stop()
    {
        _bStop = true;
    }
}
