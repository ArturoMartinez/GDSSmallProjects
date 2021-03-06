package com.gdslink.style;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    private String _strBureauName;
    private String _strRaw;
    private boolean _bRecognized;

    private boolean _bMixed;

    public BureauData(String strDate, String strRaw)
    {
        _strEncodedRaw = strRaw;
        _strDate = strDate;
        _strRaw = decodeBase64(_strEncodedRaw);
        calculateBureauName();

        _strRaw = "<RawBureauData>" + _strRaw + "</RawBureauData>";
        _strEncodedRaw = DatatypeConverter.printBase64Binary(_strRaw.getBytes(Charset.forName("UTF-8")));
    }

    private void calculateBureauName()
    {
        _strBureauName = "Unknown Data";
        _bRecognized = false;
        
        /*
         * Arturo Martínez <arturo.martinez@gdsmodellica.com>
         * Added support for DirectorData
         * 2013/12/17
         * 
         * KEY POOINT: If RAW (decoded) from server (BDM) is MIXED type
         * (DirectorData+ConsumerOutput) bureau info must be separated.
         * If not, template must be searched and applied.
         */
        _bMixed = (_strRaw.matches(Application.REGEX_MIXED));
        if (!_bMixed){
           
            for(String strRegexp : Application.instance().regularExpressions())
            {
                if(_strRaw.matches(strRegexp))
                {
                   _bRecognized = true;               
                   _strBureauName = Application.instance().getNameFor(strRegexp);
                   break;                
                }
            } 
        }
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
        return _strBureauName;
    }

    public String getBase64Raw()
    {
        return _strEncodedRaw;
    }

    public boolean isRecognized()
    {
        return _bRecognized;
    }

    public boolean isMixed(){
       return _bMixed;
    }
    
    public String getCompressedBase64Raw() throws IOException
    {
        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(out);
            gzip.write(DatatypeConverter.parseBase64Binary(_strEncodedRaw));
            gzip.close();
            return Base64.encodeBase64String(out.toByteArray());
        }
        catch(IOException e)
        {
            log.error("Error compressing data", e);
            throw e;
        }
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
    
    
   /*
   * Arturo Martínez <arturo.martinez@gdsmodellica.com>
   * 2013/12/17
   * Added support for DirectorData.
   * Both director and consumer RAW reports could have
   *    [] Single DirectorData data
   *    [] Single ConsumerOutput data
   *    [] Mixed DirectorData+ConsumerOutput data
   * 
   * Following functions:
   *     - extractDirector()
   *     - extractConsumer()
   * 
   * Extract from MIXED RAW just the part of DirectorData or ConsumerOutput
   * based on a pattern.
   */
    
    public BureauData extractDirector() throws UnsupportedEncodingException{
       
       BureauData rBureau = null;
       
       Pattern pattern = Pattern.compile("\\<DirectorData\\>.*\\</DirectorData\\>");
       Matcher matcher = pattern.matcher(_strRaw);
       if (matcher.find()){
         rBureau = new BureauData(_strDate, Base64.encodeBase64String(matcher.group(0).getBytes()));
       }
       
       return rBureau;
    }
    
    public BureauData extractConsumer() throws UnsupportedEncodingException{
       
       BureauData rBureau = null;
       
       Pattern pattern = Pattern.compile("\\<ConsumerOutput\\>.*\\</ConsumerOutput\\>");
       Matcher matcher = pattern.matcher(_strRaw);
       if (matcher.find()){
         rBureau = new BureauData(_strDate, Base64.encodeBase64String(matcher.group(0).getBytes()));
       }
       
       return rBureau;
    }
}
