/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
public class MPMergeJNIFactory
{
    static final Logger log = Logger.getLogger(MPMergeJNIFactory.class);

    static boolean _bAllocated = false;

    public static synchronized List<IMPMerge> createJNIResources(Integer iMaxResources) throws Exception
    {
        if(!_bAllocated)
        {
            log.info("Loading JNI resources");
            _bAllocated = true;

            List<IMPMerge> listResources = new ArrayList<IMPMerge>();
            for(int i = 1;i <= iMaxResources;i++)
                listResources.add(getJNI(i));

            return listResources;
        }
        else
            throw new Exception("Attempt to allocated JNI resources twice");
    }

    private static IMPMerge getJNI(Integer iVersion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception
    {
        log.info("Loading JNI resource, version " + iVersion);
        VersionedClassLoader<Class<? extends IMPMerge>> loader = new VersionedClassLoader(iVersion, "com.gdslink.mpmerge.MPMergeJNI");
        Class<? extends IMPMerge> clazz = loader.loadCustomClass();

        IMPMerge inst = clazz.newInstance();
        inst.initialize(iVersion);
        return inst;
    }
}
