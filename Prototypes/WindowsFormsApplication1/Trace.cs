using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace GDS.Execution
{
    public class Trace
    {
        private ListBox _listBox;
        public Trace(ListBox listBox)
        {
            _listBox = listBox;
        }

        public void info(String strMessage)
        {
            _listBox.Items.Add("[INFO ] " + strMessage);
        }

        public void error(String strMessage)
        {
            _listBox.Items.Add("[ERROR] " + strMessage);
        }
    }
}
