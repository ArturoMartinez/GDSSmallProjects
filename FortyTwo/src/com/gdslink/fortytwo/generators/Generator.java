/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo.generators;

import com.gdslink.fortytwo.Settings;

/**
 *
 * @author simon.smith
 */
public abstract class Generator
{
    private Settings _settings;

    public Generator(Settings settings) throws Exception
    {
        _settings = settings;
    }

    protected Settings getSettings()
    {
        return _settings;
    }

    public abstract byte[] getResponseData(String strKey) throws Exception;
}
