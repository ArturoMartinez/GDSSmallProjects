/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author simon.smith
 */
public class Settings
{
    private static final Logger log = Logger.getLogger(Settings.class.getName());

    private static String PROPERTY_PORT = "fortytwo.port";
    private static String PROPERTY_PROCESSOR = "fortytwo.processor";
    private static String PROPERTY_GENERATOR = "fortytwo.generator";

    private Properties _properties;

    public Settings(String strSettingsFile) throws FileNotFoundException, IOException, Exception
    {
        _properties = new Properties();

        InputStream stream = new FileInputStream(strSettingsFile);
        try
        {
            _properties.load(stream);
        }
        finally
        {
            stream.close();
        }

        if(!_properties.containsKey(PROPERTY_PORT) || 
                !_properties.containsKey(PROPERTY_PROCESSOR) ||
                !_properties.containsKey(PROPERTY_GENERATOR))
            throw new Exception("Missing properties in configuration file");
    }

    public int getPort()
    {
        return Integer.parseInt(_properties.getProperty(PROPERTY_PORT));
    }

    public String getProcessorName()
    {
        return _properties.getProperty(PROPERTY_PROCESSOR);
    }

    public String getGeneratorName()
    {
        return _properties.getProperty(PROPERTY_GENERATOR);
    }

    public Properties getProperties()
    {
        return _properties;
    }
}
