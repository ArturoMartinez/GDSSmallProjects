/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo.generators;

import com.gdslink.fortytwo.Settings;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author simon.smith
 */
public class FileGenerator extends Generator
{
    private static final String PROP_FILE_PATH = "generator.file.path";
    private String _strFilePath;

    public FileGenerator(Settings settings) throws Exception
    {
        super(settings);

        _strFilePath = settings.getProperties().getProperty(PROP_FILE_PATH);
        if(_strFilePath == null)
            throw new Exception("No valid file path specified for FixedStringGenerator");
    }
    
    @Override
    public byte[] getResponseData(String strKey) throws Exception
    {
        String strFilename = String.format(_strFilePath, strKey);
                
        File file = new File(strFilename);

        FileInputStream s = new FileInputStream(file);
        byte[] aData = new byte[(int)file.length()];
        try
        {
            s.read(aData);
        }
        finally
        {
            s.close();
        }
        return aData;
    }
}
