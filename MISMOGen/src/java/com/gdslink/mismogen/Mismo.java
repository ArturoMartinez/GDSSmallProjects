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

    public Mismo(String strMismoHTML, int iIndex, String strTitle) throws Exception
    {
        _strId = "mismo_" + iIndex;

        if(strMismoHTML == null || strMismoHTML.isEmpty())
            throw new Exception("Page returned from stylesheet is blank");

        String strLowerMismo = strMismoHTML.toLowerCase();

        if(strLowerMismo.indexOf("<head>") == -1 || strLowerMismo.indexOf("<body>") == -1)
            throw new Exception("Page returned from stylesheet has no header or body section");

        _strHeader = strMismoHTML.substring(strLowerMismo.indexOf("<head>")+6, strLowerMismo.indexOf("</head>"));
        _strBody = strMismoHTML.substring(strLowerMismo.indexOf("<body>")+6, strLowerMismo.indexOf("</body>"));

        _strTitle = strTitle;
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
