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

static jclass   cls_MPWrapData = NULL;
static jfieldID fld_Inmcfg = NULL;
static jfieldID fld_Inccfg = NULL;
static jfieldID fld_Ver = NULL;
static jfieldID fld_Stylesheet = NULL;
static jfieldID fld_LicenseData = NULL;
static jfieldID fld_LogLevel = NULL;
static jfieldID fld_TuIn = NULL;
static jfieldID fld_XpnIn = NULL;
static jfieldID fld_EfxIn = NULL;
static jfieldID fld_TuIn2 = NULL;
static jfieldID fld_XpnIn2 = NULL;
static jfieldID fld_EfxIn2 = NULL;
static jfieldID fld_Settings = NULL;

std::string getString(JNIEnv* env, jobject objData, jfieldID fldId)
{
    std::string strResult;
    
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
    return strResult;
}

char* getBytes(JNIEnv* env, jobject objData, jfieldID fldId)
{
    char* szReturn = NULL;

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
                env->ReleaseByteArrayElements((jbyteArray)jarr, szBuffer, JNI_ABORT);
            }                       
        }       
    }

    return szReturn;
}

bool initialize(JNIEnv* env)
{
    cls_MPWrapData = env->FindClass("com/gdslink/mpmerge/MPWrapData");
    if(cls_MPWrapData == NULL)
        return false;

    fld_Inmcfg = env->GetFieldID(cls_MPWrapData, "_strInmcfg", "Ljava/lang/String;");
    if(fld_Inmcfg == NULL)
        return false;

    fld_Inccfg = env->GetFieldID(cls_MPWrapData, "_strInccfg", "Ljava/lang/String;");
    if(fld_Inccfg == NULL)
        return false;

    fld_Ver = env->GetFieldID(cls_MPWrapData, "_strVer", "Ljava/lang/String;");
    if(fld_Ver == NULL)
        return false;

    fld_Stylesheet = env->GetFieldID(cls_MPWrapData, "_strStylesheet", "Ljava/lang/String;");
    if(fld_Stylesheet == NULL)
        return false;
    
    fld_LicenseData = env->GetFieldID(cls_MPWrapData, "_aLicenseData", "[B");    
    if(fld_LicenseData == NULL)
        return false;
    
    fld_LogLevel = env->GetFieldID(cls_MPWrapData, "_strLogLevel", "Ljava/lang/String;");
    if(fld_LogLevel == NULL)
        return false;
    
    fld_TuIn = env->GetFieldID(cls_MPWrapData, "_strTuIn", "Ljava/lang/String;");
    if(fld_TuIn == NULL)
        return false;

    fld_XpnIn = env->GetFieldID(cls_MPWrapData, "_strXpnIn", "Ljava/lang/String;");
    if(fld_XpnIn == NULL)
        return false;

    fld_EfxIn = env->GetFieldID(cls_MPWrapData, "_strEfxIn", "Ljava/lang/String;");
    if(fld_EfxIn == NULL)
        return false;

    fld_TuIn2 = env->GetFieldID(cls_MPWrapData, "_strTuIn2", "Ljava/lang/String;");
    if(fld_TuIn2 == NULL)
        return false;

    fld_XpnIn2 = env->GetFieldID(cls_MPWrapData, "_strXpnIn2", "Ljava/lang/String;");
    if(fld_XpnIn2 == NULL)
        return false;

    fld_EfxIn2 = env->GetFieldID(cls_MPWrapData, "_strEfxIn2", "Ljava/lang/String;");
    if(fld_EfxIn2 == NULL)
        return false;

    fld_Settings = env->GetFieldID(cls_MPWrapData, "_strSettings", "Ljava/lang/String;");
    if(fld_Settings == NULL)
        return false;

    return true;

}

JNIEXPORT jstring JNICALL Java_com_gdslink_mpmerge_MPMergeJNI_test(JNIEnv* env, jobject objJNI, jobject objData)
{
    char* szLicenseData = NULL;

    try
    {
        if(cls_MPWrapData == NULL)
        {
            if(!initialize(env))
                return env->NewStringUTF("An error occurred while initializing the MPMerge library");
        }

        std::string strInmcfg = getString(env, objData, fld_Inmcfg);
        std::string strInccfg = getString(env, objData, fld_Inccfg);
        std::string strVer = getString(env, objData, fld_Ver);
        std::string strStylesheet = getString(env, objData, fld_Stylesheet);
        szLicenseData = getBytes(env, objData, fld_LicenseData);
        std::string strLogLevel = getString(env, objData, fld_LogLevel);
        std::string strTuIn = getString(env, objData, fld_TuIn);
        std::string strXpnIn = getString(env, objData, fld_XpnIn);
        std::string strEfxIn = getString(env, objData, fld_EfxIn);
        std::string strTuIn2 = getString(env, objData, fld_TuIn2);
        std::string strXpnIn2 = getString(env, objData, fld_XpnIn2);
        std::string strEfxIn2 = getString(env, objData, fld_EfxIn2);
        std::string strExtraArgs = getString(env, objData, fld_Settings);

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

        jstring jsReturn = env->NewStringUTF(szResult);
        free(szResult);

        delete[] szLicenseData;
        return jsReturn;
    }
    catch(...)
    {
        delete[] szLicenseData;
        return env->NewStringUTF("An exception occurred in the MPMerge dll");
    }
}

