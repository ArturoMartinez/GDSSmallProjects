/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mismogen;

/**
 *
 * @author simon
 */
public class Mismo
{
    private String _strBody;
    private String _strHeader;
    private String _strTitle;
    private String _strId;

    public Mismo(String strMismoHTML, int iIndex)
    {
        _strId = "mismo_" + iIndex;

        String strLowerMismo = strMismoHTML.toLowerCase();

        _strHeader = strMismoHTML.substring(strLowerMismo.indexOf("<head>")+6, strLowerMismo.indexOf("</head>"));
        _strBody = strMismoHTML.substring(strLowerMismo.indexOf("<body>")+6, strLowerMismo.indexOf("</body>"));

        if(strLowerMismo.indexOf("<title>") != -1)
            _strTitle = strMismoHTML.substring(strLowerMismo.indexOf("<title>")+7, strLowerMismo.indexOf("</title>"));

        if(_strTitle == null || _strTitle.trim().length() == 0)
            _strTitle = "Record " + (iIndex + 1);
    }

    public String getBody()
    {
        return _strBody;
    }

    public String getHeader()
    {
        return _strHeader;
    }
    public String getTitle()
    {
        return _strTitle;
    }

    public String getId()
    {
        return _strId;
    }

}
