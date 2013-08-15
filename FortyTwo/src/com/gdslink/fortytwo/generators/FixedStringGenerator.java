/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo.generators;

import com.gdslink.fortytwo.Settings;
import java.nio.charset.Charset;

/**
 *
 * @author simon.smith
 */
public class FixedStringGenerator extends Generator
{
    private static final String PROP_FIXED_STRING = "generator.fixedstring.string";
    private String _strFixedString;

    public FixedStringGenerator(Settings settings) throws Exception
    {
        super(settings);

        _strFixedString = settings.getProperties().getProperty(PROP_FIXED_STRING);
        if(_strFixedString == null)
            throw new Exception("No valid fixed string specified for FixedStringGenerator");
    }
    
    @Override
    public byte[] getResponseData(String strKey) throws Exception
    {
        return _strFixedString.getBytes(Charset.forName("UTF-8"));
    }

}
