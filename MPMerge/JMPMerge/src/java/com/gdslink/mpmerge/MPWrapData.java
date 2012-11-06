/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class MPWrapData
{   
    static final Logger log = Logger.getLogger(MPWrapData.class);

    private String _strInmcfg;
    private String _strInccfg;
    private String _strVer;
    private String _strStylesheet;
    private byte[] _aLicenseData;
    private String _strLogLevel;
    private String _strTuIn;
    private String _strXpnIn;
    private String _strEfxIn;
    private String _strTuIn2;
    private String _strXpnIn2;
    private String _strEfxIn2;

  /*  private String readWholeFile(String strFilename) throws Exception
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
    }*/

    private byte[] readWholeBinaryFile(String strFilename) throws Exception
    {
        try
        {
            File file = new File(strFilename);

            byte[] bytes = new byte[(int)file.length()];

            FileInputStream is = new FileInputStream(file);
            try
            {
                is.read(bytes);
            }
            finally
            {
                is.close();
            }

            return bytes;
        }
        catch(Exception e)
        {
            log.error("Failed to read input from binary file", e);
            throw new Exception("Failed to read a necessary file", e);
        }
    }


    public void setInmcfg(String strFilename) throws Exception
    {
        if(strFilename != null)
        {
            log.debug("Reading mcfg from file: " + strFilename);
            _strInmcfg = new String(readWholeBinaryFile(strFilename));
        }
    }

    public void setInccfg(String strFilename) throws Exception
    {
        if(strFilename != null)
        {
            log.debug("Reading ccfg from file: " + strFilename);
            _strInccfg = new String(readWholeBinaryFile(strFilename));
        }
    }

    public void setStylesheet(String strFilename) throws Exception
    {
        if(strFilename != null)
        {
            log.debug("Reading stylesheet from file: " + strFilename);
            _strStylesheet = new String(readWholeBinaryFile(strFilename));
        }
    }

    public void setLicenseData(String strFilename) throws Exception
    {
        if(strFilename != null)
        {
            log.debug("Setting license file to:" + strFilename);
            _aLicenseData = readWholeBinaryFile(strFilename);
        }
    }

    public void setVer(String strVersion)
    {
        if(strVersion != null)
        {
            log.debug("Setting Version to:" + strVersion);
            _strVer = strVersion;
        }
    }

    public void setLogLevel(String strLevel)
    {
        if(strLevel != null)
        {
            log.debug("Setting LogLevel to:" + strLevel);
            _strLogLevel = strLevel;
        }
    }

    public void setTuIn(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting TU In to:" + strData);
            _strTuIn = strData;
        }
    }

    public void setXpnIn(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting XPN In to:" + strData);
            _strXpnIn = strData;
        }
    }

    public void setEfxIn(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting EFX In to:" + strData);
            _strEfxIn = strData;
        }
    }

    public void setTuIn2(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting TU In 2 to:" + strData);
            _strTuIn2 = strData;
        }
    }

    public void setXpnIn2(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting XPN In 2 to:" + strData);
            _strXpnIn2 = strData;
        }
    }

    public void setEfxIn2(String strData)
    {
        if(strData != null)
        {
            log.debug("Setting EFX In 2 to:" + strData);
            _strEfxIn2 = strData;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("INCFG: ").append(_strInccfg != null ? _strInccfg : "EMPTY").append("\n");
        strBuilder.append("VER: ").append(_strVer != null ? _strVer : "EMPTY").append("\n");
        strBuilder.append("STYLESHEET: ").append(_strStylesheet != null ? _strStylesheet : "EMPTY").append("\n");
        //private byte[] _aLicenseData;
        strBuilder.append("LOGLEVEL: ").append(_strLogLevel != null ? _strLogLevel : "EMPTY").append("\n");
        strBuilder.append("TU: ").append(_strTuIn != null ? _strTuIn : "EMPTY").append("\n");
        strBuilder.append("XPN: ").append(_strXpnIn != null ? _strXpnIn : "EMPTY").append("\n");
        strBuilder.append("EFX: ").append(_strEfxIn != null ? _strEfxIn : "EMPTY").append("\n");
        strBuilder.append("TU 2: ").append(_strTuIn2 != null ? _strTuIn2 : "EMPTY").append("\n");
        strBuilder.append("XPN 2: ").append(_strXpnIn2 != null ? _strXpnIn2 : "EMPTY").append("\n");
        strBuilder.append("EFX 2: ").append(_strEfxIn2 != null ? _strEfxIn2 : "EMPTY").append("\n");

        return strBuilder.toString();
    }
}
