/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.common.utilities;

/**
 *
 * @author simon
 */
public class OS
{
    public static String getOSName()
    {
         return System.getProperty("os.name").toLowerCase();
    }

    public static boolean isWindows()
    {
        return getOSName().indexOf("win") >= 0;
    }

    public static boolean isLinux()
    {
        return getOSName().indexOf("linux") >= 0;
    }

    public static boolean is32Bit()
    {
        String strBits = System.getProperty("sun.arch.data.model");
        return strBits.equals("32");
    }

    public static boolean is64Bit()
    {
        String strBits = System.getProperty("sun.arch.data.model");
        return strBits.equals("64");
    }

    public static String getOSPath() throws Exception
    {
        StringBuilder strOSName = new StringBuilder();

        //os

        if(isWindows())
            strOSName.append("win");
        else if(isLinux())
            strOSName.append("linux");
        else
            throw new Exception("Unrecognized OS, " + getOSName() + ", Expected windows or linux");

        //bits
        if(is32Bit())
            strOSName.append("32");
        else if(is64Bit())
            strOSName.append("64");
        else
            throw new Exception("Cannot determine 32 or 64 bit JVM");

        return strOSName.toString();
    }
}
