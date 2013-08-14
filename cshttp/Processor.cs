using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Threading;
using System.Diagnostics;
using System.Net;
using System.Xml;

namespace cshttp
{
    public class Processor
    {
        private Program _program;
        private Stats _stats;
        private int _iIterations;
        private IEnumerator<String> _itInputFiles;
        private IList<String> _listInputFiles;

        public Processor(Program program, int iIterations)
        {
            _program = program;
            _stats = new Stats();
            _iIterations = iIterations;
            _listInputFiles = new List<String>();
        }

        public void addFile(String strFilename)
        {
            _listInputFiles.Add(strFilename);
        }

        private String getNextInputFile()
        {
            if (_listInputFiles.Count == 0)
                throw new Exception("No input files");

            while (!_itInputFiles.MoveNext())
                _itInputFiles.Reset();

            return _itInputFiles.Current;
        }

        public Stats getResults()
        {
            return _stats;
        }

        public void process()
        {
            _itInputFiles = _listInputFiles.GetEnumerator();
            try
            {
                for (int i = 0; i < _iIterations; i++)
                {
                    Stopwatch timer = null;
                    try
                    {
                        String strInputFile = getNextInputFile();
                        String strComparisonFile = _program.getComparisonFile(strInputFile);
                        String strInputFilename = Path.GetFileNameWithoutExtension(strInputFile);
                        String strOutputFile = Path.Combine(_program.getSettings().getOutputPath(), strInputFilename + "_" + Thread.CurrentThread.ManagedThreadId.ToString() + "_" + i.ToString() + ".xml");

                        timer = _stats.getTimer();

                        _stats.complete(ProcessFile(strInputFile, strOutputFile, strComparisonFile, i), timer);
                    }
                    catch (Exception ex)
                    {
                        if (timer == null)
                            timer = _stats.getTimer();

                        Console.WriteLine("Outer exception on {0}: {1}",  Thread.CurrentThread.ManagedThreadId.ToString(), ex.Message);
                        _stats.complete(true, timer);
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Fatal Exception on {0}: {1}", Thread.CurrentThread.ManagedThreadId.ToString(), e.Message);
            }
        }

        
        private bool ProcessFile(string strInput, string strOutput, string strComparisonFile, int iIteration)
        {
            bool bError = true;
            try
            {
                Console.WriteLine("Executing test {0}", strInput);

                string strData = File.ReadAllText(strInput);
                UTF8Encoding encoding = new UTF8Encoding();
                byte[] aData = encoding.GetBytes(strData);

                HTTPCall http = new HTTPCall(_program.getSettings(), aData);

                HttpWebResponse response = (HttpWebResponse)http.getResponse();

                StreamReader reader = new StreamReader(http.getResponse().GetResponseStream(), Encoding.UTF8);
                String strResponse = reader.ReadToEnd();

                if (strResponse.Length > 0)
                {
                    if (_program.getSettings().hasXMLConversions())
                    {
                        strResponse = convertXML(strResponse);
                    }

                    byte[] aResponse = Encoding.UTF8.GetBytes(strResponse);

                    if(File.Exists(strComparisonFile))
                    {
                        byte[] aCompareData = File.ReadAllBytes(strComparisonFile);

                        //String strCompareData = File.ReadAllText(strComparisonFile);
                        //if (!strCompareData.Equals(strResponse))
                        if(!aResponse.SequenceEqual(aCompareData))
                        {
                            Console.WriteLine("Thread {0} iteration {1} did not  match comparison {2}", Thread.CurrentThread.ManagedThreadId, iIteration, strComparisonFile);
                        }
                        else
                        {
                            //Console.WriteLine("Success");
                            bError = false;
                        }
                    }
                    else
                    {
                        Console.WriteLine("Missing comparison file {0}, creating it now", strComparisonFile);
                        File.WriteAllBytes(strComparisonFile, aResponse);
                    }

                    if (_program.getSettings().isWriteGoodResults() || bError)
                        File.WriteAllBytes(strOutput, aResponse);
                }
                else
                {
                    Console.WriteLine("No Data in Response");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            return bError;
        }

        private XmlDocument extractInner(XmlDocument doc, XmlNamespaceManager namespaceManager)
        {
            if (_program.getSettings().getInnerXML() != null)
            {                
                XmlNode xmlNode = doc.SelectSingleNode(_program.getSettings().getInnerXML(), namespaceManager);
                if (xmlNode != null)
                {
                    XmlDocument newDoc = new XmlDocument(doc.NameTable);
                    newDoc.LoadXml(xmlNode.InnerText);
                    return newDoc;
                }
                else
                    throw new Exception("Invalid XPATH location for inner xml");
            }
            else
                return doc;
        }

        private XmlDocument xmlReplacements(XmlDocument doc, XmlNamespaceManager namespaceManager)
        {
            foreach (KeyValuePair<String, String> entry in _program.getSettings().getReplacements())
            {
                try
                {
                    foreach(XmlNode xmlNode in doc.SelectNodes(entry.Key))
                    {
                        xmlNode.InnerText = entry.Value;
                    }
                }
                catch (Exception)
                {
                }
            }

            return doc;
        }

        private String convertXML(String strInputXML)
        {
            try
            {
                XmlDocument doc = new XmlDocument();
                doc.LoadXml(strInputXML);

                XmlNamespaceManager namespaceManager = new XmlNamespaceManager(doc.NameTable);

                foreach(KeyValuePair<String, String> entry in _program.getSettings().getNamespaces())
                {
                    namespaceManager.AddNamespace(entry.Key, entry.Value);
                }

                XmlDocument xmlDoc = extractInner(doc, namespaceManager);
                xmlDoc = xmlReplacements(xmlDoc, namespaceManager);
                
                using(MemoryStream stream = new MemoryStream())
                using (XmlTextWriter writer = new XmlTextWriter(stream, Encoding.UTF8))
                {
                    writer.Formatting = Formatting.Indented;
                    xmlDoc.WriteContentTo(writer);
                    writer.Flush();
                    stream.Flush();

                    return Encoding.UTF8.GetString(stream.ToArray());
                }
            }
            catch (Exception e)
            {
                Console.Out.WriteLine("Error parsing XML response: " + e.Message);
                return strInputXML;
            }
        }
    }
}
