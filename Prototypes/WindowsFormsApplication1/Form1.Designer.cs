namespace WindowsFormsApplication1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.buttonLoadSystem = new System.Windows.Forms.Button();
            this.treeView1 = new System.Windows.Forms.TreeView();
            this.imagesTree = new System.Windows.Forms.ImageList(this.components);
            this.buttonSaveSystem = new System.Windows.Forms.Button();
            this.contextMenuforTreeView = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.addSourceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.RemoveSourceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addInputNodeToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addFieldToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.splitContainer2 = new System.Windows.Forms.SplitContainer();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.splitContainer3 = new System.Windows.Forms.SplitContainer();
            this.listBoxSequence = new System.Windows.Forms.ListBox();
            this.panelSequenceLayout = new System.Windows.Forms.Panel();
            this.tabPage4 = new System.Windows.Forms.TabPage();
            this.splitContainer6 = new System.Windows.Forms.SplitContainer();
            this.splitContainer7 = new System.Windows.Forms.SplitContainer();
            this.buttonScriptCreate = new System.Windows.Forms.Button();
            this.listBoxScripts = new System.Windows.Forms.ListBox();
            this.textBoxScript = new System.Windows.Forms.TextBox();
            this.tabPage5 = new System.Windows.Forms.TabPage();
            this.splitContainer8 = new System.Windows.Forms.SplitContainer();
            this.splitContainer10 = new System.Windows.Forms.SplitContainer();
            this.buttonMappingDegrade = new System.Windows.Forms.Button();
            this.buttonCreateMapping = new System.Windows.Forms.Button();
            this.splitContainer12 = new System.Windows.Forms.SplitContainer();
            this.listBoxMappings = new System.Windows.Forms.ListBox();
            this.listBoxMappingObjects = new System.Windows.Forms.ListBox();
            this.splitContainer9 = new System.Windows.Forms.SplitContainer();
            this.treeViewMappingInput = new System.Windows.Forms.TreeView();
            this.splitContainer11 = new System.Windows.Forms.SplitContainer();
            this.panelMappingArea = new System.Windows.Forms.Panel();
            this.treeViewMappingOutput = new System.Windows.Forms.TreeView();
            this.tabPage3 = new System.Windows.Forms.TabPage();
            this.splitContainer5 = new System.Windows.Forms.SplitContainer();
            this.buttonExecStop = new System.Windows.Forms.Button();
            this.buttonExecStep = new System.Windows.Forms.Button();
            this.buttonExecStart = new System.Windows.Forms.Button();
            this.splitContainer4 = new System.Windows.Forms.SplitContainer();
            this.treeViewRecord = new System.Windows.Forms.TreeView();
            this.listBoxTrace = new System.Windows.Forms.ListBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.panel2 = new System.Windows.Forms.Panel();
            this.contextMenuforTreeView.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.splitContainer2.Panel1.SuspendLayout();
            this.splitContainer2.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.splitContainer3.Panel1.SuspendLayout();
            this.splitContainer3.Panel2.SuspendLayout();
            this.splitContainer3.SuspendLayout();
            this.tabPage4.SuspendLayout();
            this.splitContainer6.Panel1.SuspendLayout();
            this.splitContainer6.Panel2.SuspendLayout();
            this.splitContainer6.SuspendLayout();
            this.splitContainer7.Panel1.SuspendLayout();
            this.splitContainer7.Panel2.SuspendLayout();
            this.splitContainer7.SuspendLayout();
            this.tabPage5.SuspendLayout();
            this.splitContainer8.Panel1.SuspendLayout();
            this.splitContainer8.Panel2.SuspendLayout();
            this.splitContainer8.SuspendLayout();
            this.splitContainer10.Panel1.SuspendLayout();
            this.splitContainer10.Panel2.SuspendLayout();
            this.splitContainer10.SuspendLayout();
            this.splitContainer12.Panel1.SuspendLayout();
            this.splitContainer12.Panel2.SuspendLayout();
            this.splitContainer12.SuspendLayout();
            this.splitContainer9.Panel1.SuspendLayout();
            this.splitContainer9.Panel2.SuspendLayout();
            this.splitContainer9.SuspendLayout();
            this.splitContainer11.Panel1.SuspendLayout();
            this.splitContainer11.Panel2.SuspendLayout();
            this.splitContainer11.SuspendLayout();
            this.tabPage3.SuspendLayout();
            this.splitContainer5.Panel1.SuspendLayout();
            this.splitContainer5.Panel2.SuspendLayout();
            this.splitContainer5.SuspendLayout();
            this.splitContainer4.Panel1.SuspendLayout();
            this.splitContainer4.Panel2.SuspendLayout();
            this.splitContainer4.SuspendLayout();
            this.panel1.SuspendLayout();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // buttonLoadSystem
            // 
            this.buttonLoadSystem.Location = new System.Drawing.Point(12, 12);
            this.buttonLoadSystem.Name = "buttonLoadSystem";
            this.buttonLoadSystem.Size = new System.Drawing.Size(130, 28);
            this.buttonLoadSystem.TabIndex = 0;
            this.buttonLoadSystem.Text = "&Load System";
            this.buttonLoadSystem.UseVisualStyleBackColor = true;
            this.buttonLoadSystem.Click += new System.EventHandler(this.buttonLoadSystem_Click);
            // 
            // treeView1
            // 
            this.treeView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.treeView1.ImageIndex = 0;
            this.treeView1.ImageList = this.imagesTree;
            this.treeView1.Location = new System.Drawing.Point(0, 0);
            this.treeView1.Name = "treeView1";
            this.treeView1.SelectedImageIndex = 0;
            this.treeView1.Size = new System.Drawing.Size(738, 488);
            this.treeView1.TabIndex = 1;
            this.treeView1.NodeMouseDoubleClick += new System.Windows.Forms.TreeNodeMouseClickEventHandler(this.treeView1_NodeMouseDoubleClick);
            this.treeView1.MouseUp += new System.Windows.Forms.MouseEventHandler(this.treeView1_MouseUp);
            // 
            // imagesTree
            // 
            this.imagesTree.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imagesTree.ImageStream")));
            this.imagesTree.TransparentColor = System.Drawing.Color.Transparent;
            this.imagesTree.Images.SetKeyName(0, "field.bmp");
            this.imagesTree.Images.SetKeyName(1, "folder.bmp");
            this.imagesTree.Images.SetKeyName(2, "noentry.bmp");
            // 
            // buttonSaveSystem
            // 
            this.buttonSaveSystem.Location = new System.Drawing.Point(148, 12);
            this.buttonSaveSystem.Name = "buttonSaveSystem";
            this.buttonSaveSystem.Size = new System.Drawing.Size(120, 28);
            this.buttonSaveSystem.TabIndex = 2;
            this.buttonSaveSystem.Text = "&Save System";
            this.buttonSaveSystem.UseVisualStyleBackColor = true;
            this.buttonSaveSystem.Click += new System.EventHandler(this.buttonSaveSystem_Click);
            // 
            // contextMenuforTreeView
            // 
            this.contextMenuforTreeView.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.addSourceToolStripMenuItem,
            this.RemoveSourceToolStripMenuItem,
            this.addInputNodeToolStripMenuItem,
            this.addFieldToolStripMenuItem});
            this.contextMenuforTreeView.Name = "contextMenuforTreeView";
            this.contextMenuforTreeView.Size = new System.Drawing.Size(182, 100);
            // 
            // addSourceToolStripMenuItem
            // 
            this.addSourceToolStripMenuItem.Name = "addSourceToolStripMenuItem";
            this.addSourceToolStripMenuItem.Size = new System.Drawing.Size(181, 24);
            this.addSourceToolStripMenuItem.Tag = "Sources";
            this.addSourceToolStripMenuItem.Text = "Add Source";
            this.addSourceToolStripMenuItem.Click += new System.EventHandler(this.addSourceToolStripMenuItem_Click);
            // 
            // RemoveSourceToolStripMenuItem
            // 
            this.RemoveSourceToolStripMenuItem.Name = "RemoveSourceToolStripMenuItem";
            this.RemoveSourceToolStripMenuItem.Size = new System.Drawing.Size(181, 24);
            this.RemoveSourceToolStripMenuItem.Text = "Remove Source";
            // 
            // addInputNodeToolStripMenuItem
            // 
            this.addInputNodeToolStripMenuItem.Name = "addInputNodeToolStripMenuItem";
            this.addInputNodeToolStripMenuItem.Size = new System.Drawing.Size(181, 24);
            this.addInputNodeToolStripMenuItem.Tag = "Input";
            this.addInputNodeToolStripMenuItem.Text = "Add Node";
            this.addInputNodeToolStripMenuItem.Click += new System.EventHandler(this.addInputNodeToolStripMenuItem_Click);
            // 
            // addFieldToolStripMenuItem
            // 
            this.addFieldToolStripMenuItem.Name = "addFieldToolStripMenuItem";
            this.addFieldToolStripMenuItem.Size = new System.Drawing.Size(181, 24);
            this.addFieldToolStripMenuItem.Tag = "Input";
            this.addFieldToolStripMenuItem.Text = "Add Field";
            this.addFieldToolStripMenuItem.Click += new System.EventHandler(this.addInputFieldToolStripMenuItem_Click);
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Controls.Add(this.tabPage4);
            this.tabControl1.Controls.Add(this.tabPage5);
            this.tabControl1.Controls.Add(this.tabPage3);
            this.tabControl1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tabControl1.Location = new System.Drawing.Point(0, 0);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(1115, 523);
            this.tabControl1.TabIndex = 3;
            this.tabControl1.Selecting += new System.Windows.Forms.TabControlCancelEventHandler(this.tabControl1_Selecting);
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.splitContainer2);
            this.tabPage1.Location = new System.Drawing.Point(4, 25);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(1107, 494);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Dictionary";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // splitContainer2
            // 
            this.splitContainer2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer2.FixedPanel = System.Windows.Forms.FixedPanel.Panel2;
            this.splitContainer2.IsSplitterFixed = true;
            this.splitContainer2.Location = new System.Drawing.Point(3, 3);
            this.splitContainer2.Name = "splitContainer2";
            // 
            // splitContainer2.Panel1
            // 
            this.splitContainer2.Panel1.Controls.Add(this.treeView1);
            // 
            // splitContainer2.Panel2
            // 
            this.splitContainer2.Panel2.BackColor = System.Drawing.SystemColors.ControlLight;
            this.splitContainer2.Size = new System.Drawing.Size(1101, 488);
            this.splitContainer2.SplitterDistance = 738;
            this.splitContainer2.TabIndex = 2;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.splitContainer3);
            this.tabPage2.Location = new System.Drawing.Point(4, 25);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(1107, 494);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "Sequence";
            this.tabPage2.UseVisualStyleBackColor = true;
            // 
            // splitContainer3
            // 
            this.splitContainer3.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer3.Location = new System.Drawing.Point(3, 3);
            this.splitContainer3.Name = "splitContainer3";
            // 
            // splitContainer3.Panel1
            // 
            this.splitContainer3.Panel1.Controls.Add(this.listBoxSequence);
            // 
            // splitContainer3.Panel2
            // 
            this.splitContainer3.Panel2.Controls.Add(this.panelSequenceLayout);
            this.splitContainer3.Size = new System.Drawing.Size(1101, 488);
            this.splitContainer3.SplitterDistance = 339;
            this.splitContainer3.TabIndex = 0;
            // 
            // listBoxSequence
            // 
            this.listBoxSequence.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxSequence.FormattingEnabled = true;
            this.listBoxSequence.ItemHeight = 16;
            this.listBoxSequence.Location = new System.Drawing.Point(0, 0);
            this.listBoxSequence.Name = "listBoxSequence";
            this.listBoxSequence.Size = new System.Drawing.Size(339, 484);
            this.listBoxSequence.TabIndex = 0;
            this.listBoxSequence.MouseDown += new System.Windows.Forms.MouseEventHandler(this.listBoxSequence_MouseDown);
            // 
            // panelSequenceLayout
            // 
            this.panelSequenceLayout.AllowDrop = true;
            this.panelSequenceLayout.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panelSequenceLayout.Location = new System.Drawing.Point(0, 0);
            this.panelSequenceLayout.Name = "panelSequenceLayout";
            this.panelSequenceLayout.Size = new System.Drawing.Size(758, 488);
            this.panelSequenceLayout.TabIndex = 0;
            this.panelSequenceLayout.Paint += new System.Windows.Forms.PaintEventHandler(this.panelSequenceLayout_Paint);
            this.panelSequenceLayout.MouseMove += new System.Windows.Forms.MouseEventHandler(this.panelSequenceLayout_MouseMove);
            this.panelSequenceLayout.DragDrop += new System.Windows.Forms.DragEventHandler(this.panelSequenceLayout_DragDrop);
            this.panelSequenceLayout.MouseDown += new System.Windows.Forms.MouseEventHandler(this.panelSequenceLayout_MouseDown);
            this.panelSequenceLayout.DragEnter += new System.Windows.Forms.DragEventHandler(this.panelSequenceLayout_DragEnter);
            // 
            // tabPage4
            // 
            this.tabPage4.Controls.Add(this.splitContainer6);
            this.tabPage4.Location = new System.Drawing.Point(4, 25);
            this.tabPage4.Name = "tabPage4";
            this.tabPage4.Size = new System.Drawing.Size(1107, 494);
            this.tabPage4.TabIndex = 3;
            this.tabPage4.Text = "Script";
            this.tabPage4.UseVisualStyleBackColor = true;
            // 
            // splitContainer6
            // 
            this.splitContainer6.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer6.Location = new System.Drawing.Point(0, 0);
            this.splitContainer6.Name = "splitContainer6";
            // 
            // splitContainer6.Panel1
            // 
            this.splitContainer6.Panel1.Controls.Add(this.splitContainer7);
            // 
            // splitContainer6.Panel2
            // 
            this.splitContainer6.Panel2.Controls.Add(this.textBoxScript);
            this.splitContainer6.Size = new System.Drawing.Size(1107, 494);
            this.splitContainer6.SplitterDistance = 326;
            this.splitContainer6.TabIndex = 0;
            // 
            // splitContainer7
            // 
            this.splitContainer7.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer7.FixedPanel = System.Windows.Forms.FixedPanel.Panel1;
            this.splitContainer7.Location = new System.Drawing.Point(0, 0);
            this.splitContainer7.Name = "splitContainer7";
            this.splitContainer7.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer7.Panel1
            // 
            this.splitContainer7.Panel1.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.splitContainer7.Panel1.Controls.Add(this.buttonScriptCreate);
            // 
            // splitContainer7.Panel2
            // 
            this.splitContainer7.Panel2.Controls.Add(this.listBoxScripts);
            this.splitContainer7.Size = new System.Drawing.Size(326, 494);
            this.splitContainer7.SplitterDistance = 43;
            this.splitContainer7.TabIndex = 0;
            // 
            // buttonScriptCreate
            // 
            this.buttonScriptCreate.Location = new System.Drawing.Point(8, 11);
            this.buttonScriptCreate.Name = "buttonScriptCreate";
            this.buttonScriptCreate.Size = new System.Drawing.Size(75, 23);
            this.buttonScriptCreate.TabIndex = 0;
            this.buttonScriptCreate.Text = "Create";
            this.buttonScriptCreate.UseVisualStyleBackColor = true;
            this.buttonScriptCreate.Click += new System.EventHandler(this.buttonScriptCreate_Click);
            // 
            // listBoxScripts
            // 
            this.listBoxScripts.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxScripts.FormattingEnabled = true;
            this.listBoxScripts.ItemHeight = 16;
            this.listBoxScripts.Location = new System.Drawing.Point(0, 0);
            this.listBoxScripts.Name = "listBoxScripts";
            this.listBoxScripts.Size = new System.Drawing.Size(326, 436);
            this.listBoxScripts.TabIndex = 0;
            this.listBoxScripts.SelectedIndexChanged += new System.EventHandler(this.listBoxScripts_SelectedIndexChanged);
            // 
            // textBoxScript
            // 
            this.textBoxScript.Dock = System.Windows.Forms.DockStyle.Fill;
            this.textBoxScript.Font = new System.Drawing.Font("Courier New", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxScript.Location = new System.Drawing.Point(0, 0);
            this.textBoxScript.Multiline = true;
            this.textBoxScript.Name = "textBoxScript";
            this.textBoxScript.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBoxScript.Size = new System.Drawing.Size(777, 494);
            this.textBoxScript.TabIndex = 0;
            this.textBoxScript.TextChanged += new System.EventHandler(this.textBoxScript_TextChanged);
            this.textBoxScript.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBoxScript_KeyPress);
            // 
            // tabPage5
            // 
            this.tabPage5.Controls.Add(this.splitContainer8);
            this.tabPage5.Location = new System.Drawing.Point(4, 25);
            this.tabPage5.Name = "tabPage5";
            this.tabPage5.Size = new System.Drawing.Size(1107, 494);
            this.tabPage5.TabIndex = 4;
            this.tabPage5.Text = "Mapping";
            this.tabPage5.UseVisualStyleBackColor = true;
            // 
            // splitContainer8
            // 
            this.splitContainer8.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer8.Location = new System.Drawing.Point(0, 0);
            this.splitContainer8.Name = "splitContainer8";
            // 
            // splitContainer8.Panel1
            // 
            this.splitContainer8.Panel1.Controls.Add(this.splitContainer10);
            // 
            // splitContainer8.Panel2
            // 
            this.splitContainer8.Panel2.Controls.Add(this.splitContainer9);
            this.splitContainer8.Size = new System.Drawing.Size(1107, 494);
            this.splitContainer8.SplitterDistance = 237;
            this.splitContainer8.TabIndex = 0;
            // 
            // splitContainer10
            // 
            this.splitContainer10.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer10.FixedPanel = System.Windows.Forms.FixedPanel.Panel1;
            this.splitContainer10.IsSplitterFixed = true;
            this.splitContainer10.Location = new System.Drawing.Point(0, 0);
            this.splitContainer10.Name = "splitContainer10";
            this.splitContainer10.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer10.Panel1
            // 
            this.splitContainer10.Panel1.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.splitContainer10.Panel1.Controls.Add(this.buttonMappingDegrade);
            this.splitContainer10.Panel1.Controls.Add(this.buttonCreateMapping);
            // 
            // splitContainer10.Panel2
            // 
            this.splitContainer10.Panel2.Controls.Add(this.splitContainer12);
            this.splitContainer10.Size = new System.Drawing.Size(237, 494);
            this.splitContainer10.SplitterDistance = 42;
            this.splitContainer10.TabIndex = 1;
            // 
            // buttonMappingDegrade
            // 
            this.buttonMappingDegrade.Location = new System.Drawing.Point(144, 12);
            this.buttonMappingDegrade.Name = "buttonMappingDegrade";
            this.buttonMappingDegrade.Size = new System.Drawing.Size(75, 23);
            this.buttonMappingDegrade.TabIndex = 1;
            this.buttonMappingDegrade.Text = "Degrade";
            this.buttonMappingDegrade.UseVisualStyleBackColor = true;
            this.buttonMappingDegrade.Click += new System.EventHandler(this.buttonMappingDegrade_Click);
            // 
            // buttonCreateMapping
            // 
            this.buttonCreateMapping.Location = new System.Drawing.Point(9, 12);
            this.buttonCreateMapping.Name = "buttonCreateMapping";
            this.buttonCreateMapping.Size = new System.Drawing.Size(75, 23);
            this.buttonCreateMapping.TabIndex = 0;
            this.buttonCreateMapping.Text = "Create";
            this.buttonCreateMapping.UseVisualStyleBackColor = true;
            this.buttonCreateMapping.Click += new System.EventHandler(this.buttonCreateMapping_Click);
            // 
            // splitContainer12
            // 
            this.splitContainer12.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer12.Location = new System.Drawing.Point(0, 0);
            this.splitContainer12.Name = "splitContainer12";
            this.splitContainer12.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer12.Panel1
            // 
            this.splitContainer12.Panel1.Controls.Add(this.listBoxMappings);
            // 
            // splitContainer12.Panel2
            // 
            this.splitContainer12.Panel2.Controls.Add(this.listBoxMappingObjects);
            this.splitContainer12.Size = new System.Drawing.Size(237, 448);
            this.splitContainer12.SplitterDistance = 224;
            this.splitContainer12.TabIndex = 1;
            // 
            // listBoxMappings
            // 
            this.listBoxMappings.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxMappings.FormattingEnabled = true;
            this.listBoxMappings.ItemHeight = 16;
            this.listBoxMappings.Location = new System.Drawing.Point(0, 0);
            this.listBoxMappings.Name = "listBoxMappings";
            this.listBoxMappings.Size = new System.Drawing.Size(237, 212);
            this.listBoxMappings.TabIndex = 0;
            this.listBoxMappings.SelectedIndexChanged += new System.EventHandler(this.listBoxMappings_SelectedIndexChanged);
            // 
            // listBoxMappingObjects
            // 
            this.listBoxMappingObjects.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxMappingObjects.FormattingEnabled = true;
            this.listBoxMappingObjects.ItemHeight = 16;
            this.listBoxMappingObjects.Location = new System.Drawing.Point(0, 0);
            this.listBoxMappingObjects.Name = "listBoxMappingObjects";
            this.listBoxMappingObjects.Size = new System.Drawing.Size(237, 212);
            this.listBoxMappingObjects.TabIndex = 0;
            this.listBoxMappingObjects.MouseDown += new System.Windows.Forms.MouseEventHandler(this.listBoxMappingObjects_MouseDown);
            // 
            // splitContainer9
            // 
            this.splitContainer9.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer9.Location = new System.Drawing.Point(0, 0);
            this.splitContainer9.Name = "splitContainer9";
            // 
            // splitContainer9.Panel1
            // 
            this.splitContainer9.Panel1.Controls.Add(this.treeViewMappingInput);
            // 
            // splitContainer9.Panel2
            // 
            this.splitContainer9.Panel2.Controls.Add(this.splitContainer11);
            this.splitContainer9.Size = new System.Drawing.Size(866, 494);
            this.splitContainer9.SplitterDistance = 220;
            this.splitContainer9.TabIndex = 0;
            // 
            // treeViewMappingInput
            // 
            this.treeViewMappingInput.Dock = System.Windows.Forms.DockStyle.Fill;
            this.treeViewMappingInput.Location = new System.Drawing.Point(0, 0);
            this.treeViewMappingInput.Name = "treeViewMappingInput";
            this.treeViewMappingInput.Size = new System.Drawing.Size(220, 494);
            this.treeViewMappingInput.TabIndex = 0;
            this.treeViewMappingInput.MouseDown += new System.Windows.Forms.MouseEventHandler(this.treeViewMappingInput_MouseDown);
            this.treeViewMappingInput.MouseLeave += new System.EventHandler(this.treeViewMappingInput_MouseLeave);
            // 
            // splitContainer11
            // 
            this.splitContainer11.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer11.Location = new System.Drawing.Point(0, 0);
            this.splitContainer11.Name = "splitContainer11";
            // 
            // splitContainer11.Panel1
            // 
            this.splitContainer11.Panel1.Controls.Add(this.panelMappingArea);
            // 
            // splitContainer11.Panel2
            // 
            this.splitContainer11.Panel2.Controls.Add(this.treeViewMappingOutput);
            this.splitContainer11.Size = new System.Drawing.Size(642, 494);
            this.splitContainer11.SplitterDistance = 413;
            this.splitContainer11.TabIndex = 1;
            // 
            // panelMappingArea
            // 
            this.panelMappingArea.AllowDrop = true;
            this.panelMappingArea.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panelMappingArea.Location = new System.Drawing.Point(0, 0);
            this.panelMappingArea.Name = "panelMappingArea";
            this.panelMappingArea.Size = new System.Drawing.Size(413, 494);
            this.panelMappingArea.TabIndex = 0;
            this.panelMappingArea.Paint += new System.Windows.Forms.PaintEventHandler(this.panelMappingArea_Paint);
            this.panelMappingArea.MouseMove += new System.Windows.Forms.MouseEventHandler(this.panelMappingArea_MouseMove);
            this.panelMappingArea.DragDrop += new System.Windows.Forms.DragEventHandler(this.panelMappingArea_DragDrop);
            this.panelMappingArea.MouseDown += new System.Windows.Forms.MouseEventHandler(this.panelMappingArea_MouseDown);
            this.panelMappingArea.DragEnter += new System.Windows.Forms.DragEventHandler(this.panelMappingArea_DragEnter);
            // 
            // treeViewMappingOutput
            // 
            this.treeViewMappingOutput.AllowDrop = true;
            this.treeViewMappingOutput.Dock = System.Windows.Forms.DockStyle.Fill;
            this.treeViewMappingOutput.Location = new System.Drawing.Point(0, 0);
            this.treeViewMappingOutput.Name = "treeViewMappingOutput";
            this.treeViewMappingOutput.Size = new System.Drawing.Size(225, 494);
            this.treeViewMappingOutput.TabIndex = 0;
            this.treeViewMappingOutput.DragDrop += new System.Windows.Forms.DragEventHandler(this.treeViewMappingOutput_DragDrop);
            this.treeViewMappingOutput.DragEnter += new System.Windows.Forms.DragEventHandler(this.treeViewMappingOutput_DragEnter);
            this.treeViewMappingOutput.MouseLeave += new System.EventHandler(this.treeViewMappingOutput_MouseLeave);
            // 
            // tabPage3
            // 
            this.tabPage3.Controls.Add(this.splitContainer5);
            this.tabPage3.Location = new System.Drawing.Point(4, 25);
            this.tabPage3.Name = "tabPage3";
            this.tabPage3.Size = new System.Drawing.Size(1107, 494);
            this.tabPage3.TabIndex = 2;
            this.tabPage3.Text = "Execute";
            this.tabPage3.UseVisualStyleBackColor = true;
            // 
            // splitContainer5
            // 
            this.splitContainer5.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer5.Location = new System.Drawing.Point(0, 0);
            this.splitContainer5.Name = "splitContainer5";
            this.splitContainer5.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer5.Panel1
            // 
            this.splitContainer5.Panel1.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.splitContainer5.Panel1.Controls.Add(this.buttonExecStop);
            this.splitContainer5.Panel1.Controls.Add(this.buttonExecStep);
            this.splitContainer5.Panel1.Controls.Add(this.buttonExecStart);
            // 
            // splitContainer5.Panel2
            // 
            this.splitContainer5.Panel2.Controls.Add(this.splitContainer4);
            this.splitContainer5.Size = new System.Drawing.Size(1107, 494);
            this.splitContainer5.SplitterDistance = 40;
            this.splitContainer5.TabIndex = 3;
            // 
            // buttonExecStop
            // 
            this.buttonExecStop.Enabled = false;
            this.buttonExecStop.Location = new System.Drawing.Point(171, 9);
            this.buttonExecStop.Name = "buttonExecStop";
            this.buttonExecStop.Size = new System.Drawing.Size(75, 23);
            this.buttonExecStop.TabIndex = 2;
            this.buttonExecStop.Text = "Stop";
            this.buttonExecStop.UseVisualStyleBackColor = true;
            this.buttonExecStop.Click += new System.EventHandler(this.buttonExecStop_Click);
            // 
            // buttonExecStep
            // 
            this.buttonExecStep.Location = new System.Drawing.Point(89, 9);
            this.buttonExecStep.Name = "buttonExecStep";
            this.buttonExecStep.Size = new System.Drawing.Size(75, 23);
            this.buttonExecStep.TabIndex = 1;
            this.buttonExecStep.Text = "Step";
            this.buttonExecStep.UseVisualStyleBackColor = true;
            this.buttonExecStep.Click += new System.EventHandler(this.buttonExecStep_Click);
            // 
            // buttonExecStart
            // 
            this.buttonExecStart.Location = new System.Drawing.Point(8, 9);
            this.buttonExecStart.Name = "buttonExecStart";
            this.buttonExecStart.Size = new System.Drawing.Size(75, 23);
            this.buttonExecStart.TabIndex = 0;
            this.buttonExecStart.Text = "Run";
            this.buttonExecStart.UseVisualStyleBackColor = true;
            this.buttonExecStart.Click += new System.EventHandler(this.buttonExecStart_Click);
            // 
            // splitContainer4
            // 
            this.splitContainer4.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer4.Location = new System.Drawing.Point(0, 0);
            this.splitContainer4.Name = "splitContainer4";
            // 
            // splitContainer4.Panel1
            // 
            this.splitContainer4.Panel1.Controls.Add(this.treeViewRecord);
            // 
            // splitContainer4.Panel2
            // 
            this.splitContainer4.Panel2.Controls.Add(this.listBoxTrace);
            this.splitContainer4.Size = new System.Drawing.Size(1107, 450);
            this.splitContainer4.SplitterDistance = 368;
            this.splitContainer4.TabIndex = 2;
            // 
            // treeViewRecord
            // 
            this.treeViewRecord.Dock = System.Windows.Forms.DockStyle.Fill;
            this.treeViewRecord.Location = new System.Drawing.Point(0, 0);
            this.treeViewRecord.Name = "treeViewRecord";
            this.treeViewRecord.Size = new System.Drawing.Size(368, 450);
            this.treeViewRecord.TabIndex = 0;
            // 
            // listBoxTrace
            // 
            this.listBoxTrace.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxTrace.FormattingEnabled = true;
            this.listBoxTrace.ItemHeight = 16;
            this.listBoxTrace.Location = new System.Drawing.Point(0, 0);
            this.listBoxTrace.Name = "listBoxTrace";
            this.listBoxTrace.Size = new System.Drawing.Size(735, 436);
            this.listBoxTrace.TabIndex = 0;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.splitContainer1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(1115, 574);
            this.panel1.TabIndex = 4;
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.FixedPanel = System.Windows.Forms.FixedPanel.Panel1;
            this.splitContainer1.IsSplitterFixed = true;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            this.splitContainer1.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.panel2);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.tabControl1);
            this.splitContainer1.Size = new System.Drawing.Size(1115, 574);
            this.splitContainer1.SplitterDistance = 47;
            this.splitContainer1.TabIndex = 4;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.buttonLoadSystem);
            this.panel2.Controls.Add(this.buttonSaveSystem);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(1115, 47);
            this.panel2.TabIndex = 5;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1115, 574);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.contextMenuforTreeView.ResumeLayout(false);
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.splitContainer2.Panel1.ResumeLayout(false);
            this.splitContainer2.ResumeLayout(false);
            this.tabPage2.ResumeLayout(false);
            this.splitContainer3.Panel1.ResumeLayout(false);
            this.splitContainer3.Panel2.ResumeLayout(false);
            this.splitContainer3.ResumeLayout(false);
            this.tabPage4.ResumeLayout(false);
            this.splitContainer6.Panel1.ResumeLayout(false);
            this.splitContainer6.Panel2.ResumeLayout(false);
            this.splitContainer6.Panel2.PerformLayout();
            this.splitContainer6.ResumeLayout(false);
            this.splitContainer7.Panel1.ResumeLayout(false);
            this.splitContainer7.Panel2.ResumeLayout(false);
            this.splitContainer7.ResumeLayout(false);
            this.tabPage5.ResumeLayout(false);
            this.splitContainer8.Panel1.ResumeLayout(false);
            this.splitContainer8.Panel2.ResumeLayout(false);
            this.splitContainer8.ResumeLayout(false);
            this.splitContainer10.Panel1.ResumeLayout(false);
            this.splitContainer10.Panel2.ResumeLayout(false);
            this.splitContainer10.ResumeLayout(false);
            this.splitContainer12.Panel1.ResumeLayout(false);
            this.splitContainer12.Panel2.ResumeLayout(false);
            this.splitContainer12.ResumeLayout(false);
            this.splitContainer9.Panel1.ResumeLayout(false);
            this.splitContainer9.Panel2.ResumeLayout(false);
            this.splitContainer9.ResumeLayout(false);
            this.splitContainer11.Panel1.ResumeLayout(false);
            this.splitContainer11.Panel2.ResumeLayout(false);
            this.splitContainer11.ResumeLayout(false);
            this.tabPage3.ResumeLayout(false);
            this.splitContainer5.Panel1.ResumeLayout(false);
            this.splitContainer5.Panel2.ResumeLayout(false);
            this.splitContainer5.ResumeLayout(false);
            this.splitContainer4.Panel1.ResumeLayout(false);
            this.splitContainer4.Panel2.ResumeLayout(false);
            this.splitContainer4.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonLoadSystem;
        private System.Windows.Forms.TreeView treeView1;
        private System.Windows.Forms.Button buttonSaveSystem;
        private System.Windows.Forms.ImageList imagesTree;
        private System.Windows.Forms.ContextMenuStrip contextMenuforTreeView;
        private System.Windows.Forms.ToolStripMenuItem addSourceToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem RemoveSourceToolStripMenuItem;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.SplitContainer splitContainer2;
        private System.Windows.Forms.SplitContainer splitContainer3;
        private System.Windows.Forms.ListBox listBoxSequence;
        private System.Windows.Forms.Panel panelSequenceLayout;
        private System.Windows.Forms.TabPage tabPage3;
        private System.Windows.Forms.SplitContainer splitContainer5;
        private System.Windows.Forms.SplitContainer splitContainer4;
        private System.Windows.Forms.ListBox listBoxTrace;
        private System.Windows.Forms.Button buttonExecStart;
        private System.Windows.Forms.TreeView treeViewRecord;
        private System.Windows.Forms.ToolStripMenuItem addInputNodeToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem addFieldToolStripMenuItem;
        private System.Windows.Forms.TabPage tabPage4;
        private System.Windows.Forms.SplitContainer splitContainer6;
        private System.Windows.Forms.SplitContainer splitContainer7;
        private System.Windows.Forms.Button buttonScriptCreate;
        private System.Windows.Forms.ListBox listBoxScripts;
        private System.Windows.Forms.TextBox textBoxScript;
        private System.Windows.Forms.TabPage tabPage5;
        private System.Windows.Forms.SplitContainer splitContainer8;
        private System.Windows.Forms.ListBox listBoxMappings;
        private System.Windows.Forms.SplitContainer splitContainer9;
        private System.Windows.Forms.Panel panelMappingArea;
        private System.Windows.Forms.TreeView treeViewMappingInput;
        private System.Windows.Forms.SplitContainer splitContainer10;
        private System.Windows.Forms.Button buttonCreateMapping;
        private System.Windows.Forms.SplitContainer splitContainer11;
        private System.Windows.Forms.TreeView treeViewMappingOutput;
        private System.Windows.Forms.SplitContainer splitContainer12;
        private System.Windows.Forms.ListBox listBoxMappingObjects;
        private System.Windows.Forms.Button buttonExecStop;
        private System.Windows.Forms.Button buttonExecStep;
        private System.Windows.Forms.Button buttonMappingDegrade;
    }
}

