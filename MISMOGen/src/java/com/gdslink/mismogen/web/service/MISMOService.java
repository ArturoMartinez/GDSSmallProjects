/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen.web.service;

import com.gdslink.mismogen.Application;
import com.sun.xml.bind.StringInputStream;
import java.io.*;
import java.net.URL;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class MISMOService
{
    private static final Logger log = Logger.getLogger(MISMOService.class);

    public static String getMismo(String strId) throws Exception
    {
        log.info("Fetching mismo");

        URL url = MISMOService.class.getResource("/Test_Data.xml");
        if(url == null)
            throw new Exception("File not found Test_Data.xml");

        return readWholeFile(url.getPath());
    }

    private static Transformer getStyleSheet() throws Exception
    {
        log.info("Reading Stylesheet");

        InputStream streamIn = MISMOService.class.getResourceAsStream(Application.instance().getStylesheetFilename());
        if(streamIn == null)
            throw new Exception("Stylesheet not found");

        TransformerFactory factoryTransformer = TransformerFactory.newInstance();
        return factoryTransformer.newTransformer(new StreamSource(streamIn));
    }

    public static String getConvertedMISMO(String strId) throws Exception
    {
        String strMismo = getMismo(strId);

        StringWriter writerResult = new StringWriter();

        log.info("Transforming mismo");
        
        getStyleSheet().transform(
                new StreamSource(new StringInputStream(strMismo)),
                new StreamResult(writerResult));

        return writerResult.toString();
    }

    private static String readWholeFile(String strFilename) throws Exception
    {
        try
        {
            File file = new File(strFilename);
            StringBuilder builder = new StringBuilder((int)file.length());

            BufferedReader reader =  new BufferedReader(new FileReader(file));
            try
            {
                String strLine;
                while((strLine = reader.readLine()) != null)
                    builder.append(strLine);
            }
            finally
            {
                reader.close();
            }

            return builder.toString();
        }
        catch(Exception e)
        {
            log.error("Failed to read input from file", e);
            throw new Exception("Failed to read a necessary file", e);
        }
    }

}
