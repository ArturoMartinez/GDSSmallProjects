/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.mpmerge;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import org.apache.log4j.Logger;

public class VersionedClassLoader<T extends Class> extends ClassLoader
{
    static final Logger log = Logger.getLogger(VersionedClassLoader.class);

    private Integer _iVersion;
    private String  _strClassName;
    private T       _instance;

    public VersionedClassLoader(Integer iVersion, String strClassName)
    {
        super(VersionedClassLoader.class.getClassLoader());
        log.debug("Creating class loader for: " + strClassName + ", version " + iVersion);
        _iVersion = iVersion;
        _strClassName = strClassName;
    }

    public T loadCustomClass() throws ClassNotFoundException
    {
        try
        {
            if(_instance != null)
                return _instance;

            log.debug("Loading versioned class");

            findClass();

            if(_instance != null)
            {
                log.debug("Initializing Custom class");

                //Class types[] = {Integer.class};
                //Object values[] = {_iVersion};

                //for(Method m : _instance.getDeclaredMethods())
                //{
                  //  if(m.getName().equals("initialize"))
                    //    m.invoke(null, values);
               // }
//                Method m = _instance.getMethod("initialize", types)
  //              if(m == null)
    //                log.error("Method not found");
                        
      //          m.invoke(null, values);
            }

            return _instance;
        }
        catch(Exception e)
        {
            log.debug("Failed to load versioned class: " + e.getMessage(), e);
            log.debug("Ensure versioned DLL's are on the path, and also note that the web server must be restarted, not just the deployed application");
            throw new ClassNotFoundException("Class not found:" + _strClassName, e);
        }
    }

    public void findClass() throws ClassNotFoundException
    {
        try
        {
            URL urlResource = VersionedClassLoader.class.getClassLoader().getResource(_strClassName.replace('.','/')+".class");
            String strClassPath = urlResource.getPath();
            log.debug("Loading versioned from " + strClassPath);

            byte classByte[] = loadClassData(strClassPath);
            _instance = (T)defineClass(_strClassName,classByte,0,classByte.length,null);
        }
        catch(Exception e)
        {
            log.error("Failed to load class: " + e.getMessage(), e);
            throw new ClassNotFoundException("Class not found:" + _strClassName, e);
        }
    }

    private byte[] loadClassData(String strClassPath) throws IOException
    {
        File f ;
        f = new File(strClassPath);
        int size = (int)f.length();
        byte buff[] = new byte[size];
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        dis.readFully(buff);
        dis.close();
        return buff;
    }
}
