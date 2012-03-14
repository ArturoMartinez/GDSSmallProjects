/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.common.resourcethread;

/**
 *
 * @author simon
 */
public class ResourceThread<T> extends Thread
{
    private T _resource;

    public ResourceThread(T resource, Runnable runnable)
    {
        super(runnable);
        _resource = resource;
    }

    public T getResource()
    {
        return _resource;
    }
}

