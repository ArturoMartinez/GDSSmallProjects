/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import com.gdslink.fortytwo.generators.Generator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.smith
 */
public class ProcessorFactory
{
    private static final Logger log = Logger.getLogger(ProcessorFactory.class.getName());

    private Settings _settings;
    private Generator _generator;

    public ProcessorFactory(Settings settings, Generator generator)
    {
        _settings = settings;
        _generator = generator;
    }
    
    public Processor newProcessor(Socket clientSocket) throws Exception
    {
        String strProcessorName = _settings.getProcessorName();

        log.log(Level.FINE, "Creating new processor {0}", strProcessorName);

        Class clazz = Class.forName(strProcessorName);

        if(!Processor.class.isAssignableFrom(clazz) || Modifier.isAbstract( clazz.getModifiers() ))
              throw new Exception(strProcessorName + " is not a Processor class");

        Constructor constructor = clazz.getConstructor(Socket.class, Settings.class, Generator.class);
        return (Processor)constructor.newInstance(clientSocket, _settings, _generator);
    }
}
