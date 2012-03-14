/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import com.gdslink.common.utilities.OS;
import java.net.URL;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class MPMergeJNI implements IMPMerge
{
    static final Logger log = Logger.getLogger(MPMergeJNI.class);
    boolean __bInitialized = false;

    @Override
    public synchronized void initialize(Integer iVersion) throws Exception
    {
        if(!__bInitialized)
        {
            __bInitialized = true;
            String strLibrary = "/dll/" + OS.getOSPath() + "/MPMerge." + iVersion + ".dll";
            URL url = MPMergeJNI.class.getResource(strLibrary);

            if(url == null)
                throw new Exception("File not found in WAR, " + strLibrary);

            log.debug("Loading library: " + url.getPath());
            try
            {
                System.load(url.getPath());
            }
            catch(Exception e)
            {
                log.error("Error loading DLL," + e.getClass() + ", " + e.getMessage());
                throw e;
            }
        }
        else
            log.warn("Trying to initialise MPMerge JNI twice");
    }


    @Override
    public native String test(MPWrapData data);
}
