/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import com.gdslink.common.resourcethread.ResourceThread;
import java.util.concurrent.Callable;
import org.apache.log4j.Logger;

/**
 *
 * @author simon
 */
class MPMergeCallable implements Callable<String>
{
    static final Logger log = Logger.getLogger(MPMergeJNI.class);

    MPWrapData _data;

    public MPMergeCallable(MPWrapData data)
    {
        _data = data;
    }

    @Override
    public String call() throws Exception
    {
        Thread threadCurrent = Thread.currentThread();

        if(threadCurrent instanceof ResourceThread)
        {
            log.info("Calling MPMerge library on thread: " + threadCurrent.getId() + " with data : " + _data.hashCode());
            IMPMerge t = ((ResourceThread<IMPMerge>)threadCurrent).getResource();
            return t.test(_data);
        }
        else
            throw new Exception("Resource not available for thread");
    }
}
