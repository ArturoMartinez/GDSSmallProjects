/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author simon.smith
 */
public class CPURIResolver implements URIResolver
{
    private String _strBasePath;

    public CPURIResolver(String strBasePath)
    {
        _strBasePath = strBasePath;
    }

    @Override
    public Source resolve(String href, String base) throws TransformerException
    {
        StreamSource source = new StreamSource(Application.class.getResourceAsStream(_strBasePath + href));
        source.setSystemId(href);
        return source;
    }
}
