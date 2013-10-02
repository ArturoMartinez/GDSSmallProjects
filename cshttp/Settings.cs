using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.IO;

namespace cshttp
{
    public class Settings
    {
        private String _strURL;
        private String _strMethod;
        private String _strAcceptsEncoding;
        private String _strSOAPAction;
        private String _strHost;
        private String _strUserAgent;
        private String _strContentType;
        private string _strRootPath;
        private int _iThreads;
        private int _iIterationsPerThread;
        private bool _bWriteGoodResults;
        private byte[] _aWrapper;

        private String _strInputPath;
        private String _strOutputPath;
        private String _strComparisonPath;

        private bool _bXMLConversions;
        private string _strInnerXML;
        private Dictionary<String, String> _mapNamespaces;
        private Dictionary<String, String> _mapReplacements;

        public Settings(string strFilename)
        {
            _strMethod = "POST";
            _strAcceptsEncoding = "gzip,deflate";
            _strUserAgent = "Jakarta Commons-HttpClient/3.1";
            _strContentType = "text/xml;charset=UTF-8";

            _iThreads = 16;
            _iIterationsPerThread = 10;
            _bWriteGoodResults = false;

            _bXMLConversions = false;

            _strRootPath = (new FileInfo(strFilename)).DirectoryName;

            _mapNamespaces = new Dictionary<string, string>();
            _mapReplacements = new Dictionary<string, string>();
            loadXML(strFilename);
        }

        private void loadXML(string strFilename)
        {
            XmlDocument xmlDoc = new XmlDocument();
            xmlDoc.Load(strFilename);

            XmlNode xmlNode = xmlDoc.SelectSingleNode("/cshttp/url");
            if (xmlNode != null)
                _strURL = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/method");
            if (xmlNode != null)
                _strMethod = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/acceptsencoding");
            if (xmlNode != null)
                _strAcceptsEncoding = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/soapaction");
            if (xmlNode != null)
                _strSOAPAction = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/host");
            if (xmlNode != null)
                _strHost = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/useragent");
            if (xmlNode != null)
                _strUserAgent = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/contenttype");
            if (xmlNode != null)
                _strContentType = xmlNode.InnerText;

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/threads");
            if (xmlNode != null)
                _iThreads = Int32.Parse(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/iterationsperthread");
            if (xmlNode != null)
                _iIterationsPerThread = Int32.Parse(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/writegoodresults");
            if (xmlNode != null)
                _bWriteGoodResults = Boolean.Parse(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/inputpath");
            if (xmlNode != null)
                _strInputPath = getFullPath(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/outputpath");
            if (xmlNode != null)
                _strOutputPath = getFullPath(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/comparepath");
            if (xmlNode != null)
                _strComparisonPath = getFullPath(xmlNode.InnerText);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/xmlconversions");
            if (xmlNode != null)
                loadXMLConversions(xmlNode);

            xmlNode = xmlDoc.SelectSingleNode("/cshttp/wrapper");
            if(xmlNode != null && xmlNode.InnerText.Length != 0)
                _aWrapper = File.ReadAllBytes(getFullPath(xmlNode.InnerText));
        }

        private String getFullPath(String strFile)
        {
            if (Path.IsPathRooted(strFile))
                return strFile;
            else
                return Path.Combine(_strRootPath, strFile);
        }

        private void loadXMLConversions(XmlNode xmlNode)
        {
            _bXMLConversions = true;
            XmlNode xmlChild = xmlNode.SelectSingleNode("./innerxml");
            if (xmlChild != null)
                _strInnerXML = xmlChild.InnerText;

            //namespaces
            xmlChild = xmlNode.SelectSingleNode("./namespaces");
            if (xmlChild != null)
            {
                foreach (XmlNode xmlNameSpace in xmlChild.SelectNodes("./namespace"))
                {
                    XmlNode xmlName = xmlNameSpace.SelectSingleNode("./name");
                    XmlNode xmlSpace = xmlNameSpace.SelectSingleNode("./value");

                    if (xmlName != null && xmlSpace != null)
                        _mapNamespaces.Add(xmlName.InnerText, xmlSpace.InnerText);
                }
            }

            //replacements
            xmlChild = xmlNode.SelectSingleNode("./replacements");
            if (xmlChild != null)
            {
                foreach (XmlNode xmlReplacement in xmlChild.SelectNodes("./replacement"))
                {
                    XmlNode xmlXpath = xmlReplacement.SelectSingleNode("./xpath");
                    XmlNode xmlValue = xmlReplacement.SelectSingleNode("./value");

                    if (xmlXpath != null && xmlValue != null)
                        _mapReplacements.Add(xmlXpath.InnerText, xmlValue.InnerText);
                }
            }
        }

        public IDictionary<String, String> getNamespaces()
        {
            return _mapNamespaces;
        }

        public IDictionary<String, String> getReplacements()
        {
            return _mapReplacements;
        }

        public bool hasXMLConversions()
        {
            return _bXMLConversions;
        }

        public String getInnerXML()
        {
            return _strInnerXML;
        }
                
        public String getInputPath()
        {
            return _strInputPath;
        }

        public String getOutputPath()
        {
            return _strOutputPath;
        }

        public String getComparisonPath()
        {
            return _strComparisonPath;
        }

        public int getNoThreads()
        {
            return _iThreads;
        }

        public int getIterationsPerThread()
        {
            return _iIterationsPerThread;
        }

        public bool isWriteGoodResults()
        {
            return _bWriteGoodResults;
        }

        public String getURL()
        {
            return _strURL;
        }

        public String getMethod()
        {
            return _strMethod;
        }

        public String getAcceptsEncoding()
        {
            return _strAcceptsEncoding;
        }

        public String getSOAPAction()
        {
            return _strSOAPAction;
        }

        public String getHost()
        {
            return _strHost;
        }

        public String getUserAgent()
        {
            return _strUserAgent;
        }

        public String getContentType()
        {
            return _strContentType;
        }

        public byte[] getWrapper()
        {
            return _aWrapper;
        }

        public bool hasWrapper()
        {
            return _aWrapper != null;
        }
    }
}
