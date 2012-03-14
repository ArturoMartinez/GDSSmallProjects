/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import com.gdslink.common.resourcethread.ResourceThread;
import java.util.concurrent.Callable;

/**
 *
 * @author simon
 */
class MPMergeCallable implements Callable<String>
{
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
            IMPMerge t = ((ResourceThread<IMPMerge>)threadCurrent).getResource();
            return t.test(_data);
        }
        else
            throw new Exception("Resource not available for thread");
    }
}
