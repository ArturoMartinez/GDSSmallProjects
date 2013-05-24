package com.gdslink.style;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/**
 *
 * @author simon.smith
 */
public class BureauData
{
    private static Logger log = Logger.getLogger(BureauData.class);

    private String _strEncodedRaw;
    private String _strDate;
    private String _strBureau;

    public BureauData(String strDate, String strRaw, String strBureau)
    {
        _strEncodedRaw = strRaw;
        _strDate = strDate;
        _strBureau = strBureau;
    }

    public String getRaw()
    {
        return decodeBase64(_strEncodedRaw);
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
        return _strEncodedRaw;
    }

    public String getCompressedBase64Raw() throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(DatatypeConverter.parseBase64Binary(_strEncodedRaw));
        gzip.close();
        return Base64.encodeBase64String(out.toByteArray());
    }

    private static String decodeBase64(String strData)
    {
        try
        {
            byte[] aBytes = DatatypeConverter.parseBase64Binary(strData);
            String strDecoded = new String(aBytes, Charset.forName("UTF-8"));
            log.debug("Decoded Data = " + strDecoded);
            return strDecoded;
        }
        catch(Exception e)
        {
            log.debug("Data was not convertible to valid xml from base 64, assuming not base64 encoded");
            log.debug("Exception = " + e.getMessage());
            return strData;
        }
    }
}
