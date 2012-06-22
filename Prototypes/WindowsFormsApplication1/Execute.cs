using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using GDS.Definition;

namespace GDS.Execution
{
    public class Execute
    {
        private ListBox _listBoxTrace;
        private TreeView _treeViewRecord;
        private DefinitionSequence _nextSequence;
        private Record _record;
        private Trace _trace;
        private DefinitionSystem _system;

        public Execute(ListBox listBoxTrace, TreeView treeViewRecord, DefinitionSystem system)
        {
            _listBoxTrace = listBoxTrace;
            _treeViewRecord = treeViewRecord;
            _system = system;
            _trace = new Trace(listBoxTrace);
        }

        public bool next()
        {
            if (_nextSequence == null)
            {
                _record = new Record();
                _listBoxTrace.Items.Clear();
                _treeViewRecord.Nodes.Clear();
                _treeViewRecord.Nodes.Add(_record.toTreeNode());

                //find starting point
                foreach (DefinitionSequence sequence in _system.listSequences)
                {
                    if (sequence is SequenceStart)
                    {
                        _nextSequence = sequence;
                        break;
                    }
                }

                if (_nextSequence == null)
                {
                    MessageBox.Show("No start sequence is defined");
                    return false;
                }            
            }

            _nextSequence = _nextSequence.execute(_record, _trace, _system);
            return _nextSequence != null;
        }

        public void run()
        {
            while (next()) ;
        }

        public void stop()
        {
            _nextSequence = null;
        }
    }
}
