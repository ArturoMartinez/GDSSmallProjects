using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Xml;

using GDS.Definition;
using GDS.Execution;
using CSScriptLibrary;
using System.Reflection;
using GDS.Script;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {      
        private DefinitionSystem _system;
        private Execute _execute;

        public Form1()
        {
            InitializeComponent();
        }

        private void buttonLoadSystem_Click(object sender, EventArgs evt)
        {
            try
            {
                OpenFileDialog dlg = new OpenFileDialog();
                dlg.FileName = "C:\\Data\\DataView360\\Systems\\Mapping";
                if (dlg.ShowDialog() == DialogResult.OK)
                {
                    _system = new DefinitionSystem(dlg.FileName);
                    showSystem(_system, this.treeView1);
                    _execute = new Execute(listBoxTrace,treeViewRecord, _system);
                }
            }
            catch (Exception e)
            {
                MessageBox.Show(e.Message);
            }
        }

        private void buttonSaveSystem_Click(object sender, EventArgs evt)
        {
            try
            {
                if (_system == null)
                    throw new Exception("System not loaded");

                _system.save();
            }
            catch (Exception e)
            {
                MessageBox.Show(e.Message);
            }
        }

        //display source as tree

        private void showSystem(DefinitionSystem system, TreeView view)
        {
            view.Nodes.Clear();
            view.Nodes.Add(system.toTreeNode());

            treeViewMappingInput.Nodes.Clear();
            treeViewMappingOutput.Nodes.Clear();

            listBoxScripts.Items.Clear();
            foreach (DefinitionScript script in system.listScripts)
                listBoxScripts.Items.Add(script.name);

            listBoxMappings.Items.Clear();
            foreach (DefinitionMapping mapping in system.listMappings)
                listBoxMappings.Items.Add(mapping);

            listBoxMappingObjects.Items.Clear();
            foreach (String obj in DefinitionMappingObject.OBJECTS)
                listBoxMappingObjects.Items.Add(obj);
        }

        private void treeView1_NodeMouseDoubleClick(object sender, TreeNodeMouseClickEventArgs evt)
        {
            if (evt.Node.Tag is DefinitionField)
                ((DefinitionField)(evt.Node.Tag)).toggleDiscardable();
        }

        private void addSourceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            OpenFileDialog dlg = new OpenFileDialog();
            dlg.FileName = _system.getSystemFolder();
            if (dlg.ShowDialog() == DialogResult.OK)
            {
                DefinitionSource source = new DefinitionSource(_system.getEntity(DefinitionId.ROOT_SOURCES), dlg.FileName);
                _system.addSource(source);
            }
        }

        private void treeView1_MouseUp(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Right)
            {
                // Select the clicked node
                TreeNode nodeClicked = treeView1.GetNodeAt(e.X, e.Y);

                if (nodeClicked != null)
                {
                    foreach (ToolStripItem item in contextMenuforTreeView.Items)
                        item.Visible = false;

                    foreach (ToolStripItem item in contextMenuforTreeView.Items)
                    {
                        if (
                            ((DefinitionEntity)nodeClicked.Tag).id == DefinitionId.ROOT_ROOT ||
                            ((DefinitionEntity)nodeClicked.Tag).id == DefinitionId.ROOT_SOURCES && item.Text == "Add Source" ||
                            item.Text == "Add Node" || item.Text == "Add Field"
                            )
                        {
                            item.Tag = nodeClicked.Tag;
                            item.Visible = true;
                        }
                    }                   

                    contextMenuforTreeView.Show(treeView1, e.Location);
                }
            }
        }

        private void panelSequenceLayout_Paint(object sender, PaintEventArgs e)
        {
            if (_system == null)
                return;

            foreach(DefinitionSequence sequence in _system.listSequences)
                sequence.draw(e);
        }

        private void panelSequenceLayout_MouseMove(object sender, MouseEventArgs e)
        {
            if (_system == null)
                return;

            bool bFound = false;

            foreach (DefinitionSequence sequence in _system.listSequences)
            {
                if (sequence.isHit(e.Location))
                {
                    bFound = true;
                    break;
                }
            }

            panelSequenceLayout.Cursor = bFound ? Cursors.Hand : Cursors.Default;
        }

        private void panelSequenceLayout_MouseDown(object sender, MouseEventArgs e)
        {
            if (_system == null)
                return;

            if(e.Button == MouseButtons.Left) //Move
            {
                foreach (DefinitionSequence sequence in _system.listSequences)
                {
                    if (sequence.isHit(e.Location))
                    {
                        if (Control.ModifierKeys == Keys.Control)
                        {
                            _system.deleteSequence(sequence);
                            panelSequenceLayout.Invalidate();
                        }
                        else
                            panelSequenceLayout.DoDragDrop(sequence, DragDropEffects.Move);

                        break;
                    }
                }
            }
            else //Create Path
            {
                foreach (DefinitionSequence sequence in _system.listSequences)
                {
                    if (sequence.isHit(e.Location))
                    {
                        if (Control.ModifierKeys == Keys.Control)
                        {
                            sequence.deletePath();
                            panelSequenceLayout.Invalidate();
                        }
                        else if(sequence.canCreatePath())
                        {
                            panelSequenceLayout.DoDragDrop(sequence.createPath(), DragDropEffects.Link);
                        }

                        break;
                    }
                }               
            }            
        }

        private void panelSequenceLayout_DragDrop(object sender, DragEventArgs e)
        {
            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionSequence)
            {
                DefinitionSequence sequence = (DefinitionSequence)obj;

                if (e.AllowedEffect == DragDropEffects.Copy && _system != null)
                    _system.addSequence(sequence);

                sequence.moveTo(panelSequenceLayout.PointToClient(new Point(e.X, e.Y)));
                panelSequenceLayout.Invalidate();
            }
            else if (obj is DefinitionPath<DefinitionSequence>)
            {
                DefinitionPath<DefinitionSequence> path = (DefinitionPath<DefinitionSequence>)obj;

                foreach (DefinitionSequence sequence in _system.listSequences)
                {
                    if (sequence.isHit(panelSequenceLayout.PointToClient(new Point(e.X, e.Y))) && 
                        sequence.acceptsPath() && 
                        sequence != path._startPoint)
                    {
                        path.confirm(sequence);
                        panelSequenceLayout.Invalidate();
                        break;
                    }
                }               
            }
        }

        private void panelSequenceLayout_DragEnter(object sender, DragEventArgs e)
        {
            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionSequence || obj is DefinitionPath<DefinitionSequence>)
                e.Effect = e.AllowedEffect;
        }

        private void listBoxSequence_MouseDown(object sender, MouseEventArgs e)
        {
            int iIndex = listBoxSequence.IndexFromPoint(e.Location);
            if (iIndex != ListBox.NoMatches)
            {
                DefinitionSequence seq = DefinitionSequence.create(listBoxSequence.Items[iIndex].ToString());
                listBoxSequence.DoDragDrop(seq, DragDropEffects.Copy);
            }
        }


        private void tabControl1_Selecting(object sender, TabControlCancelEventArgs e)
        {
            listBoxSequence.Items.Clear();
            foreach (String strName in DefinitionSequence.SEQUENCE_NAMES)
                listBoxSequence.Items.Add(strName);
        }

        private void addInputFieldToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ToolStripMenuItem item = (ToolStripMenuItem)sender;
            if (item.Tag is DefinitionNode)
            {
                DefinitionNode node = (DefinitionNode)item.Tag;

                if (Prompt.ShowDialog("Please enter a name for the field", "Enter a name") == DialogResult.OK && Prompt.Text.Trim().Length > 0)
                    node.AddEntity(new DefinitionField(Prompt.Text, DefinitionId.next(node.id.type), node)).toggleDiscardable();
            }
        }

        private void addInputNodeToolStripMenuItem_Click(object sender, EventArgs e)        
        {
            ToolStripMenuItem item = (ToolStripMenuItem)sender;
            if(item.Tag is DefinitionNode)
            {
                DefinitionNode node = (DefinitionNode)item.Tag;
            
                if (Prompt.ShowDialog("Please enter a name for the node", "Enter a name") == DialogResult.OK && Prompt.Text.Trim().Length>0)
                    node.AddEntity(new DefinitionNode(Prompt.Text, DefinitionId.next(node.id.type), node)).toggleDiscardable();
            }
        }

        private void buttonScriptCreate_Click(object sender, EventArgs e)
        {
            if (_system == null)
            {
                MessageBox.Show("Please load a system first");
                return;
            }

            if (Prompt.ShowDialog("Please enter a name for the script sequence", "Enter a name") == DialogResult.OK && Prompt.Text.Trim().Length > 0)
            {
                DefinitionScript script = new DefinitionScript(Prompt.Text);
                _system.addScript(script);
                int iIndex = listBoxScripts.Items.Add(script.name);
                listBoxScripts.SelectedIndex = iIndex;
            }
        }

        private void listBoxScripts_SelectedIndexChanged(object sender, EventArgs e)
        {
            foreach (DefinitionScript script in _system.listScripts)
            {
                if (((ListBox)sender).SelectedItem.ToString() == script.name)
                {
                    textBoxScript.Tag = script;
                    textBoxScript.Text = script.script;
                    break;
                }
            }

            textBoxScript.Focus();
        }

        private void textBoxScript_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(((TextBox)sender).Tag != null)
            {
                DefinitionScript script = (DefinitionScript)((TextBox)sender).Tag;
                script.script = ((TextBox)sender).Text;
            }
        }

        private void textBoxScript_TextChanged(object sender, EventArgs e)
        {
            if (((TextBox)sender).Tag != null)
            {
                DefinitionScript script = (DefinitionScript)((TextBox)sender).Tag;
                script.script = ((TextBox)sender).Text;
            }
        }

        private void buttonCreateMapping_Click(object sender, EventArgs e)
        {
            if (_system == null)
            {
                MessageBox.Show("Please load a system first");
                return;
            }

            if (Prompt.ShowDialog("Please enter a name for the mapping", "Enter a name") == DialogResult.OK && Prompt.Text.Trim().Length > 0)
            {
                DefinitionMapping mapping = new DefinitionMapping(Prompt.Text);
                _system.addMapping(mapping);
                int iIndex = listBoxMappings.Items.Add(mapping);
                listBoxMappings.SelectedIndex = iIndex;
            }

        }

        private void listBoxMappings_SelectedIndexChanged(object sender, EventArgs e)
        {
            //find the rght mapping
            DefinitionMapping mapping = null;

            if (((ListBox)sender).SelectedIndex == ListBox.NoMatches)
                return;

            foreach(DefinitionMapping item in _system.listMappings)
            {
                if (((ListBox)sender).SelectedItem.ToString() == item.name)
                {
                    mapping = item;
                    break;
                }
            }

            if (mapping == null)
                return;

            //display it

            treeViewMappingInput.Nodes.Clear();
            treeViewMappingInput.Nodes.Add(copyTreeNode(null, _system.getTreeNode()));

            treeViewMappingOutput.Nodes.Clear();
            treeViewMappingOutput.Nodes.Add(copyTreeNode(null, _system.getTreeNode()));

            foreach (DefinitionMappingObject obj in mapping.listObjects)
            {
                foreach(MappingLink link in obj.getInputs())
                {
                    link._node = pathToNode(treeViewMappingInput, link.strPath);

                    if (link._node == null)
                        obj.removeInput(link);
                }

                foreach (MappingLink link in obj.getOutputs())
                {
                    link._node = pathToNode(treeViewMappingOutput, link.strPath);

                    if (link._node == null)
                        obj.removeOutput(link);
                }
            }

            panelMappingArea.Invalidate();
        }

        public TreeNode pathToNode(TreeView view, String strPath)
        {
            Id[] aIds = ScriptHelper.getDefinitions(strPath);

            TreeNode parent = null;

            foreach (Id id in aIds)
            {
                if (parent == null)
                {
                    parent = view.Nodes[0];
                    if (!((DefinitionEntity)parent.Tag).id.Equals(new DefinitionId(id.type, id.id)))
                        return null;
                }
                else
                {
                    bool bFound = false;
                    foreach (TreeNode node in parent.Nodes)
                    {
                        if (((DefinitionEntity)node.Tag).id.Equals(new DefinitionId(id.type, id.id)))
                        {
                            parent = node;
                            bFound = true;
                            break;
                        }
                    }
                    if(!bFound)
                        return null;
                }
            }

            return parent;
        }


        public TreeNode copyTreeNode(TreeNode parent, TreeNode from)
        {
            TreeNode copy = new TreeNode(from.Text, from.ImageIndex, from.ImageIndex);
            copy.Tag = from.Tag;
            if(parent != null)
                parent.Nodes.Add(copy);

            foreach (TreeNode child in from.Nodes)
                copyTreeNode(copy, child);

            return copy;
        }

        private void listBoxMappingObjects_MouseDown(object sender, MouseEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            int iIndex = listBoxMappingObjects.IndexFromPoint(e.Location);
            if (iIndex != ListBox.NoMatches)
            {
                DefinitionMappingObject obj = DefinitionMappingObject.create((String)listBoxMappingObjects.SelectedItem);
                listBoxMappingObjects.DoDragDrop(obj, DragDropEffects.Copy);
            }
        }

        private void panelMappingArea_Paint(object sender, PaintEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;
            mapping.draw(e);
        }

        private void panelMappingArea_DragDrop(object sender, DragEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;

            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionMappingObject)
            {
                DefinitionMappingObject mObj = (DefinitionMappingObject)obj;

                if (e.AllowedEffect == DragDropEffects.Copy)
                    mapping.addObject(mObj);

                Point to = panelMappingArea.PointToClient(new Point(e.X, e.Y));
                if(!mObj.isHit(to))
                    mObj.moveTo(to);
            }
            else if (obj is MappingLink)
            {
                foreach (DefinitionMappingObject mobj in mapping.listObjects)
                {
                    if (mobj.isHit(panelMappingArea.PointToClient(new Point(e.X, e.Y))))
                    {
                        mobj.addInput((MappingLink)obj);
                        break;
                    }
                }                               
            }
            panelMappingArea.Invalidate();
        }

        private void panelMappingArea_DragEnter(object sender, DragEventArgs e)
        {
            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionMappingObject || obj is MappingLink)
                e.Effect = e.AllowedEffect;
        }

        private void panelMappingArea_MouseDown(object sender, MouseEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;
            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;

            if (e.Button == MouseButtons.Left) //Move
            {
                foreach (DefinitionMappingObject obj in mapping.listObjects)
                {
                    if (obj.isHit(e.Location))
                    {
                        if (Control.ModifierKeys == Keys.Alt)
                        {
                            MessageBox.Show("Properties dialog for " + obj.getName() + " (" + obj.id + ")");
                        }
                        else
                        {
                            foreach (MappingLink link in obj.getInputs())
                                link._node.EnsureVisible();

                            foreach (MappingLink link in obj.getOutputs())
                                link._node.EnsureVisible();

                            panelMappingArea.DoDragDrop(obj, DragDropEffects.Move);
                            break;
                        }
                    }
                }
            }
        }

        private void panelMappingArea_MouseMove(object sender, MouseEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;
            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;

            bool bFound = false;

            foreach (DefinitionMappingObject obj in mapping.listObjects)
            {
                if (obj.isHit(e.Location))
                {
                    bFound = true;
                    break;
                }
            }

            panelMappingArea.Cursor = bFound ? Cursors.Hand : Cursors.Default;
        }

        private void treeViewMappingInput_MouseDown(object sender, MouseEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            TreeNode node = treeViewMappingInput.GetNodeAt(e.Location);
            if (node == null ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_INPUT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_OUTPUT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_ROOT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_SOURCES ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_WORK)
            {
                return;
            }

            listBoxMappingObjects.DoDragDrop(new MappingLink(node), DragDropEffects.Link);
        }

        private void treeViewMappingInput_MouseLeave(object sender, EventArgs e)
        {
            panelMappingArea.Invalidate();
        }

        private void treeViewMappingOutput_DragEnter(object sender, DragEventArgs e)
        {
            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionMappingObject || obj is MappingLink)
                e.Effect = e.AllowedEffect;
        }

        private void treeViewMappingOutput_DragDrop(object sender, DragEventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;

            TreeNode node = treeViewMappingOutput.GetNodeAt(treeViewMappingOutput.PointToClient(new Point(e.X, e.Y)));
            if (node == null ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_INPUT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_OUTPUT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_ROOT ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_SOURCES ||
                ((DefinitionEntity)node.Tag).id == DefinitionId.ROOT_WORK)
            {
                return;
            }
           
            object obj = e.Data.GetData(e.Data.GetFormats()[0]);
            if (obj is DefinitionMappingObject)
            {
                DefinitionMappingObject mObj = (DefinitionMappingObject)obj;
                mObj.addOutput(new MappingLink(node));
            }
            else if (obj is MappingLink)
            {
                DefinitionMappingObject mObj = DefinitionMappingObject.create("copy");
                MappingLink input = mObj.addInput((MappingLink)obj);
                mObj.addOutput(new MappingLink(node));
                mObj.moveTo(new Point(
                    50,
                    input._node.Bounds.Top + 10
                    ));

                mapping.addObject(mObj);
            }

            panelMappingArea.Invalidate();
        }

        private void treeViewMappingOutput_MouseLeave(object sender, EventArgs e)
        {
            panelMappingArea.Invalidate();
        }

        private void buttonExecStop_Click(object sender, EventArgs e)
        {
            if (_system == null)
            {
                MessageBox.Show("Please load a system first");
                return;
            }

            _execute.stop();

            buttonExecStart.Enabled = true;
            buttonExecStep.Enabled = true;
            buttonExecStop.Enabled = false;

        }

        private void buttonExecStep_Click(object sender, EventArgs e)
        {
            if (_system == null)
            {
                MessageBox.Show("Please load a system first");
                return;
            }

            buttonExecStart.Enabled = false;
            buttonExecStep.Enabled = true;
            buttonExecStop.Enabled = true;

            if (!_execute.next())
            {
                buttonExecStart.Enabled = true;
                buttonExecStep.Enabled = true;
                buttonExecStop.Enabled = false;
            }
        }

        private void buttonExecStart_Click(object sender, EventArgs e)
        {
            if (_system == null)
            {
                MessageBox.Show("Please load a system first");
                return;
            }

            _execute.run();
        }

        private void buttonMappingDegrade_Click(object sender, EventArgs e)
        {
            if (listBoxMappings.SelectedIndex == ListBox.NoMatches)
                return;

            DefinitionMapping mapping = (DefinitionMapping)listBoxMappings.SelectedItem;

            String strName = "Map" + mapping.name;
            String strScript =
                      "using System;\r\n" +
                      "using GDS.Script;\r\n" +
                      "using GDS.Definition;\r\n" +
                      "using GDS.Execution;\r\n\r\n" +
                      "public class Script" + strName + "\r\n" +
                      "{\r\n" +
                      "    public void execute(ScriptHelper helper)\r\n" +
                      "    {\r\n" +
                      mapping.getCode() +
                      "    }\r\n" +
                      "}\r\n";


            DefinitionScript script = new DefinitionScript(strName, strScript);
            _system.addScript(script);
            listBoxScripts.Items.Add(script.name);
        }


    }
}
