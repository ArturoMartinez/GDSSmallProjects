using System;
using System.Collections;
using System.ComponentModel;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Web.Services.Protocols;
using System.Xml.Linq;
using System.IO;
using System.Threading;
using System.Configuration;
using System.Web.Configuration;
using System.Text;

namespace MPMerge
{
    /// <summary>
    /// Summary description for Service1
    /// </summary>
    [WebService(Namespace = "http://gdsmpws.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    public class Service1 : System.Web.Services.WebService
    {

        private static readonly string LICENSE_FILENAME = "MPWrap.lic";
        private static readonly Object lockObject = new Object();
        private string strRootPath = "";

        public Service1()
        {
            strRootPath = ConfigurationManager.AppSettings["MPMergePath"];

            if (strRootPath == null || strRootPath.Length == 0)
                throw new Exception("MPMergePath setting is missing from web.config");
        }

        [WebMethod]
        public string MergeBureauReports(string inputExperian1, string inputEquifax1, string inputTU1, string inputExperian2, string inputEquifax2, string inputTU2, string inmcfg, string inccfg, string stylesheet)
        {
            try
            {
                MPWrap.Merge ul = new MPWrap.Merge();

                ul.strInmcfg = File.ReadAllText(pathJoin(strRootPath, inmcfg));
                ul.strInccfg = File.ReadAllText(pathJoin(strRootPath, inccfg));
                ul.strVer = "2.4";
                ul.strStylesheet = File.ReadAllText(pathJoin(strRootPath, stylesheet));
                ul.strLicenseData = pathJoin(strRootPath, LICENSE_FILENAME);
                ul.strLogLevel = "YES";
                ul.strTuIn = inputTU1 ?? "";
                ul.strXpnIn = inputExperian1 ?? "";
                ul.strEfxIn = inputEquifax1 ?? "";
                ul.strTuIn2 = inputTU2 ?? "";
                ul.strXpnIn2 = inputExperian2 ?? "";
                ul.strEfxIn2 = inputEquifax2 ?? "";

                lock (lockObject)
                {
                    return ul.runMPMerge();
                }
            }
            catch (Exception ex)
            {
                //throw error instead of returning it. Causes SOAP fault
                throw new Exception("Error in runMP_UL_WithFiles() :" + ex.Message);
            }
        }


        private String pathJoin(String strStart, String strEnd)
        {
            StringBuilder strPath = new StringBuilder(strStart.Trim());

            if (strPath.Length > 0)
            {
                while (strPath[strPath.Length - 1] == '/' || strPath[strPath.Length - 1] == '\\')
                    strPath.Remove(strPath.Length - 1, 1);
            }

            String strEndTrimmed = strEnd.Trim();

            for (int i = 0; i < strEndTrimmed.Length; i++)
            {
                if (strEndTrimmed[i] != '/' && strEndTrimmed[i] != '\\')
                {
                    if(strPath.Length > 0)
                        strPath.Append("\\");

                    strPath.Append(strEndTrimmed.Substring(i));
                    break;
                }
            }

            return strPath.ToString();
        }
    }
}
