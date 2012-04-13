// JNITest.cpp : Defines the exported functions for the DLL application.
//

#include "com_gdslink_mpmerge_MPMergeJNI.h"
#include <string>

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

JNIEXPORT jstring JNICALL Java_com_gdslink_mpmerge_MPMergeJNI_test(JNIEnv* env, jobject objJNI, jobject objData)
{
	std::string strInmcfg = getString(env, objData, "_strInmcfg");
        std::string strInccfg = getString(env, objData, "_strInccfg");
        std::string strVer = getString(env, objData, "_strVer");
        std::string strStylesheet = getString(env, objData, "_strStylesheet");
        std::string strLicenseData = getString(env, objData, "_strLicenseData");
        std::string strLogLevel = getString(env, objData, "_strLogLevel");
        std::string strTuIn = getString(env, objData, "_strTuIn");
        std::string strXpnIn = getString(env, objData, "_strXpnIn");
        std::string strEfxIn = getString(env, objData, "_strEfxIn");
        std::string strTuIn2 = getString(env, objData, "_strTuIn2");
        std::string strXpnIn2 = getString(env, objData, "_strXpnIn2");
        std::string strEfxIn2 = getString(env, objData, "_strEfxIn2");

	std::string strResult = strInmcfg + " : " + 
							strInccfg + " : " + 
							strVer + " : " + 
							strStylesheet + " : " + 
							strLicenseData + " : " + 
							strLogLevel + " : " + 
							strTuIn + " : " + 
							strXpnIn + " : " + 
							strEfxIn + " : " + 
							strTuIn2 + " : " + 
							strXpnIn2 + " : " + 
							strEfxIn2;

	return env->NewStringUTF(strResult.c_str());
}



