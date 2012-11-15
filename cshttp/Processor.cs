using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Threading;
using System.Diagnostics;
using System.Net;

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
                    String strInputFile = getNextInputFile();
                    String strComparisonFile = _program.getComparisonFile(strInputFile);

                    String strOutputFile = Path.Combine(_program.getSettings().getOutputPath(), Thread.CurrentThread.ManagedThreadId.ToString() + "_" + i.ToString() + ".xml");

                    Stopwatch timer = _stats.getTimer();

                    _stats.complete(!ProcessFile(strInputFile, strOutputFile, strComparisonFile, i), timer);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception on {0}: {1}", Thread.CurrentThread.ManagedThreadId.ToString(), e.Message);
            }
        }

        private bool ProcessFile(string strInput, string strOutput, string strComparisonFile, int iIteration)
        {
            bool bError = true;
            try
            {
                string strData = File.ReadAllText(strInput);
                UTF8Encoding encoding = new UTF8Encoding();
                byte[] aData = encoding.GetBytes(strData);

                HTTPCall http = new HTTPCall(_program.getSettings(), aData);

                HttpWebResponse response = (HttpWebResponse)http.getResponse();

                StreamReader reader = new StreamReader(http.getResponse().GetResponseStream(), Encoding.UTF8);
                String strResponse = reader.ReadToEnd();

                if (strResponse.Length > 0)
                {
                    if(File.Exists(strComparisonFile))
                    {
                        String strCompareData = File.ReadAllText(strComparisonFile);

                        if (!strCompareData.Equals(strResponse))
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
                        File.WriteAllText(strComparisonFile, strResponse);
                    }

                    if (_program.getSettings().isWriteGoodResults() || bError)
                        File.WriteAllText(strOutput, strResponse);
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
    }
}
