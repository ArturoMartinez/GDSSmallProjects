/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

/**
 *
 * @author simon
 */
public interface IMPMerge
{
    public void initialize(Integer iVersion) throws Exception;
    public String test(MPWrapData data);
}
