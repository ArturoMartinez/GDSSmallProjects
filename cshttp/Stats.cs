using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics;

namespace cshttp
{
    public class Stats
    {
        private int _iErrors;
        private long _lSlowest;
        private long _lFastest;
        private long _lTotal;
        private int _iIterations;

        public int getErrors()
        {
            return _iErrors;
        }

        public long getSlowest()
        {
            return _lSlowest;
        }

        public long getFastest()
        {
            return _lFastest;
        }
        public long getTotal()
        {
            return _lTotal;
        }

        public long getAverage()
        {
            double dTotal = (double)_lTotal;
            double dIterations = (double)_iIterations;

            return (long)(dTotal / dIterations);
        }

        public int getCount()
        {
            return _iIterations;
        }
        
        public override String ToString()
        {        
            StringBuilder str = new StringBuilder();
            str.Append("Errors: ").Append(getErrors()).Append("\r\n");
            str.Append("Slowest: ").Append(getSlowest()).Append("\r\n");
            str.Append("Fastest: ").Append(getFastest()).Append("\r\n");
            str.Append("Total Time: ").Append(getTotal()).Append("\r\n");
            str.Append("Count: ").Append(getCount()).Append("\r\n");
            str.Append("Average: ").Append(getAverage()).Append("\r\n");
            return str.ToString();
        }

        public Stats()
        {
            _iErrors = 0;
            _lSlowest = long.MinValue;
            _lFastest = long.MaxValue;
            _lTotal = 0;
            _iIterations = 0;
        }

        public void complete(bool bError, Stopwatch timer)
        {
            long lElapsed = timer.ElapsedMilliseconds;
            
            _iIterations++;
            if(bError)
                _iErrors++;

            _lTotal += lElapsed;
            
            if(lElapsed > _lSlowest)
                _lSlowest = lElapsed;

            if(lElapsed < _lFastest)
                _lFastest = lElapsed;
        }

        public void add(Stats stats)
        {
            _iErrors += stats._iErrors;
            if (stats._lSlowest > _lSlowest)
                _lSlowest = stats._lSlowest;

            if (stats._lFastest < _lFastest)
                _lFastest = stats._lFastest;

            _lTotal += stats._lTotal;
            _iIterations += stats._iIterations;
        }

        public Stopwatch getTimer()
        {
            return Stopwatch.StartNew();
        }        
    }
}
