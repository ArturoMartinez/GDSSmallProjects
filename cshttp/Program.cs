using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.IO;
using System.Threading;
using System.Runtime.CompilerServices;

namespace cshttp
{
    public class Program
    {
        private Settings _settings;

        private Program(String[] args)
        {
            if (args.Length == 0)
                throw new Exception("Usage: cshttp <input folder>");

            _settings = new Settings(args[0]);

            checkPaths();
        }

        public Settings getSettings()
        {
            return _settings;
        }

        public bool checkPaths()
        {
            if (!Directory.Exists(_settings.getInputPath()))
            {
                Console.WriteLine("Folder {0} doesn't exist", _settings.getInputPath());
                return false;
            }

            if (!Directory.Exists(_settings.getOutputPath()))
                Directory.CreateDirectory(_settings.getOutputPath());

            if (!Directory.Exists(_settings.getComparisonPath()))
                Directory.CreateDirectory(_settings.getComparisonPath());

            return true;
        }

        private int processFiles()
        {
            ServicePointManager.DefaultConnectionLimit = 1000;
            Thread[] aThreads = new Thread[_settings.getNoThreads()];
            Processor[] aProcessors = new Processor[_settings.getNoThreads()];

            for (int i = 0; i < _settings.getNoThreads(); i++)
                aProcessors[i] = new Processor(this, _settings.getIterationsPerThread());

            int iProcessorIndex = 0;
            foreach (String strFilename in Directory.GetFiles(_settings.getInputPath()))
            {
                aProcessors[iProcessorIndex].addFile(strFilename);
                iProcessorIndex = (iProcessorIndex+1) % _settings.getNoThreads();
            }

            for (int i = 0; i < _settings.getNoThreads(); i++)
            {
                aThreads[i] = new Thread(new ThreadStart(aProcessors[i].process));
                aThreads[i].Start();
            }

            Stats statsTotal = new Stats();

            for (int i = 0; i < _settings.getNoThreads(); i++)
            {
                aThreads[i].Join();
                Console.WriteLine("Completed processing thread");
                Console.WriteLine(aProcessors[i].getResults().ToString());
                statsTotal.add(aProcessors[i].getResults());
            }

            Console.WriteLine("Total Stats");
            Console.WriteLine(statsTotal.ToString());

            return statsTotal.getErrors();
        }

        public String getComparisonFile(String strInputFile)
        {
            return Path.Combine(_settings.getComparisonPath(), Path.GetFileName(strInputFile));
        }
                
        static int Main(string[] args)
        {
            try
            {
                Console.WriteLine("CSHTTP Version 1.0");
                Program program = new Program(args);
                return program.processFiles();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return 99;
            }
        }
    }
}
