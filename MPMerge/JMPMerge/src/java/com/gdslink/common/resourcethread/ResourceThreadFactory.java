/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.common.resourcethread;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 *
 * @author simon
 */
public class ResourceThreadFactory<T> implements ThreadFactory
{
    private final Object _lock;
    private volatile Iterator<T> _itResource;

    public ResourceThreadFactory(List<T> resources)
    {
        _lock = new Object();
        _itResource = resources.iterator();
    }

    @Override
    public Thread newThread(Runnable r)
    {
        synchronized (_lock) {
            if(_itResource.hasNext())
                return new ResourceThread<T>(_itResource.next(), r);
            else
                return null;
        }
    }
}
