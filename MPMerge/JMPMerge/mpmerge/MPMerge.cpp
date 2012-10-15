// JNITest.cpp : Defines the exported functions for the DLL application.
//

#include "com_gdslink_mpmerge_MPMergeJNI.h"

#include <string.h>
#include <string>
#include <stdlib.h>

#ifdef __cplusplus
  extern "C" {
#endif

char *merge(char *, char *, char *, char *, char *, char *, char *, char *, char *, char *, char *);

#ifdef __cplusplus
  }
#endif

std::string getString(JNIEnv* env, jobject objData, const std::string& strName)
{
	std::string strResult;
	
	jclass clsData = env->GetObjectClass(objData);
	jfieldID fldId = env->GetFieldID(clsData, strName.c_str(), "Ljava/lang/String;");
	if(fldId)
	{
		jobject jstr = env->GetObjectField(objData, fldId);
		if(jstr)
		{
			jsize jLength = env->GetStringUTFLength((jstring)jstr);
			if(jLength > 0)
			{
				const char* szBuffer = env->GetStringUTFChars((jstring)jstr, NULL);
				if(szBuffer)
				{
					strResult = szBuffer;
					env->ReleaseStringUTFChars((jstring)jstr, szBuffer);
				}						
			}		
		}
	}
	return strResult;
}

char* getBytes(JNIEnv* env, jobject objData, const std::string& strName)
{
	char* szReturn = NULL;

	jclass clsData = env->GetObjectClass(objData);
	jfieldID fldId = env->GetFieldID(clsData, strName.c_str(), "[B");
	if(fldId)
	{
		jobject jarr = env->GetObjectField(objData, fldId);
		if(jarr)
		{
			jsize jLength = env->GetArrayLength((jarray)jarr);
			if(jLength > 0)
			{
				jbyte* szBuffer = env->GetByteArrayElements((jbyteArray)jarr, NULL);
				if(szBuffer)
				{
					szReturn = new char[jLength + 1];
					::memcpy(szReturn, szBuffer, jLength);
					szReturn[jLength] = 0;
					env->ReleaseByteArrayElements((jbyteArray)jarr, szBuffer, 0);
				}						
			}		
		}
	}

	return szReturn;
}

JNIEXPORT jstring JNICALL Java_com_gdslink_mpmerge_MPMergeJNI_test(JNIEnv* env, jobject objJNI, jobject objData)
{
    char* szLicenseData = NULL;

    try
    {
	 std::string strInmcfg = getString(env, objData, "_strInmcfg");
        std::string strInccfg = getString(env, objData, "_strInccfg");
        std::string strVer = getString(env, objData, "_strVer");
        std::string strStylesheet = getString(env, objData, "_strStylesheet");
        szLicenseData = getBytes(env, objData, "_aLicenseData");
        std::string strLogLevel = getString(env, objData, "_strLogLevel");
        std::string strTuIn = getString(env, objData, "_strTuIn");
        std::string strXpnIn = getString(env, objData, "_strXpnIn");
        std::string strEfxIn = getString(env, objData, "_strEfxIn");
        std::string strTuIn2 = getString(env, objData, "_strTuIn2");
        std::string strXpnIn2 = getString(env, objData, "_strXpnIn2");
        std::string strEfxIn2 = getString(env, objData, "_strEfxIn2");

        std::string strExtraArgs = "Logging=\"";
        strExtraArgs += strLogLevel + "\"";
        strExtraArgs += " SortType=\"5\" RatingCodeType=\"Experian\" ShowBurCodes=\"YES\" MiscVars=\"Santander,Late90_derog\" DeDupe=\"NO\"";

        if(!szLicenseData)
             return env->NewStringUTF("No license data has been specified");
 
        char* szResult = merge(szLicenseData,
                               const_cast<char*>(strInmcfg.c_str()),
				   const_cast<char*>(strXpnIn.c_str()),
                               const_cast<char*>(strTuIn.c_str()),
                               const_cast<char*>(strEfxIn.c_str()),
                               const_cast<char*>(strExtraArgs.c_str()),
                               NULL,
				   const_cast<char*>(strXpnIn2.c_str()),
                               const_cast<char*>(strTuIn2.c_str()),
                               const_cast<char*>(strEfxIn2.c_str()),
                               NULL);

        std::string strResult(szResult);
        free(szResult);

        delete[] szLicenseData;
        return env->NewStringUTF(strResult.c_str());
    }
    catch(...)
    {
        delete[] szLicenseData;
        return env->NewStringUTF("An exception occurred in the MPMerge dll");
    }
}



