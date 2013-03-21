/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.style.web.service;

/**
 *
 * @author simon.smith
 */
public class Applicant
{
    private String      _strValidity = "VALIDITY";
    private String      _strPersonType = "PERSON_TYPE";
    private int         _iPersonCode = 999;
    private String[]    _aBureauNames = new String[] {"BUREAU_NAME_1"};

    public Applicant(String strValidity, String strPersonType, int iPersonCode, String[] aBureauNames)
    {
        _strValidity = strValidity;
        _strPersonType = strPersonType;
        _iPersonCode = iPersonCode;
        _aBureauNames = aBureauNames;
    }

    public String getValidity()
    {
        return _strValidity;
    }

    //this is the BDP Type
    public String getPersonType()
    {
        return _strPersonType;
    }

    public int getPersonCode()
    {
        return _iPersonCode;
    }

    public String[] getBureauNames()
    {
        return _aBureauNames;
    }
}
