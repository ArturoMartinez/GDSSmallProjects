/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import com.gdslink.fortytwo.generators.Generator;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.smith
 */
public class FortyTwo
{
    private static final Logger log = Logger.getLogger(FortyTwo.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        if(args.length == 1)
        {
            try 
            {
                FortyTwo fortyTwo = new FortyTwo(args[0]);
                fortyTwo.run();
            }
            catch (Exception ex)
            {
                log.log(Level.SEVERE, "An Exception occurred", ex);
            }
        }
        else
            System.out.println("Usage: fortytwo <config file>");
    }

    private Settings _settings;

    public FortyTwo(String strConfigFile) throws Exception
    {
        _settings = new Settings(strConfigFile);
    }

    private Generator createGenerator() throws Exception
    {
        String strGeneratorName = _settings.getGeneratorName();

        log.log(Level.INFO, "Creating new generator {0}", strGeneratorName);

        Class clazz = Class.forName(strGeneratorName);

        if(!Generator.class.isAssignableFrom(clazz) || Modifier.isAbstract( clazz.getModifiers() ))
              throw new Exception(strGeneratorName + " is not a Generator class");

        Constructor constructor = clazz.getConstructor(Settings.class);
        return (Generator)constructor.newInstance(_settings);
    }

    public void run()
    {
        try
        {
            Generator _generator = createGenerator();
            ProcessorFactory processorFactory = new ProcessorFactory(_settings, _generator);
            Listener listener = new Listener(_settings, processorFactory);

            Thread listenerThread = new Thread(listener);

            listenerThread.start();

            System.out.println("Press any key to stop");
            System.in.read();

            listener.stop();
            listenerThread.join();
        }
        catch (InterruptedException ex)
        {
            log.log(Level.SEVERE, "Error waiting for listener to stop", ex);
        }
        catch (IOException ex)
        {
            log.log(Level.SEVERE, "Error starting listening", ex);
        }
        catch(Exception ex)
        {
            log.log(Level.SEVERE, "Start up exception", ex);
        }
    }
}
