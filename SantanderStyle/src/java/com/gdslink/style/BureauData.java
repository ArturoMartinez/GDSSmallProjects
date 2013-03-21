package com.gdslink.style;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author simon.smith
 */
public class BureauData
{
    private String _strRaw;
    private String _strDate;
    private String _strBureau;

    public BureauData(String strDate, String strRaw, String strBureau)
    {
        _strRaw = strRaw;
        _strDate = strDate;
        _strBureau = strBureau;
    }

    public String getRaw()
    {
        return _strRaw;
    }

    public String getDate()
    {
        return _strDate;
    }

    public String getBureau()
    {
        return _strBureau;
    }

    public String getBase64Raw()
    {
        return Base64.encodeBase64String(_strRaw.getBytes(Charset.forName("UTF-8")));
    }

    public String getCompressedBase64Raw() throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(_strRaw.getBytes(Charset.forName("UTF-8")));
        gzip.close();
        return Base64.encodeBase64String(out.toByteArray());
    }
}
