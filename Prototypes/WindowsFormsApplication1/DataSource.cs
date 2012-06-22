using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.IO;
using System.Windows.Forms;

namespace GDS.Definition
{
    public class DefinitionSource : DefinitionEntity
    {
        private DefinitionInputNode _nodeInput;
        private DefinitionOutputNode _nodeOutput;

        public DefinitionSource(DefinitionEntity parent, String strPath)
            : base(parent)
        {
            XmlDocument xmlDoc = new XmlDocument();
            xmlDoc.Load(strPath);

            this.name = Path.GetFileNameWithoutExtension(strPath);

            XmlNode xmlNode = xmlDoc.SelectSingleNode("/SOURCE/TYPE");
            if (xmlNode == null)
                this.id = DefinitionId.newSourceType();
            else
                this.id = DefinitionId.useId(Int32.Parse(xmlNode.InnerText), 1);

            //output
            xmlNode = xmlDoc.SelectSingleNode("/CONNECTOR/OUTPUT_DLD/DLD");

            if (xmlNode == null)
                xmlNode = xmlDoc.SelectSingleNode("SOURCE/OUTPUT");

            if(xmlNode == null)
                throw new Exception("Invalid input file, no structure found");

            if(xmlNode != null)
                _nodeOutput = new DefinitionOutputNode(xmlNode, this);

            //input

            xmlNode = xmlDoc.SelectSingleNode("/CONNECTOR/INPUT_DLD/DLD");

            if (xmlNode == null)
                xmlNode = xmlDoc.SelectSingleNode("SOURCE/INPUT");

            if (xmlNode == null)
                throw new Exception("Invalid input file, no structure found");

            if (xmlNode != null)
                _nodeInput = new DefinitionInputNode(xmlNode, this);
        }

        public DefinitionNode getOutputNode()
        {
            return _nodeOutput;
        }

        public DefinitionNode getInputNode()
        {
            return _nodeInput;
        }

        public override XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = base.toXml(xmlDoc);
            xmlNode.AppendChild(xmlDoc.CreateElement("TYPE")).InnerText = id.type.ToString();
            xmlNode.AppendChild(_nodeInput.toXml(xmlDoc));
            xmlNode.AppendChild(_nodeOutput.toXml(xmlDoc));

            return xmlNode;
        }

        protected override string getXmlElementName()
        {
            return "SOURCE";
        }

        public override TreeNode toTreeNode()
        {
            _treeNode = new TreeNode()
            {
                Text = name,
                Tag = this,
            };

            setTreeImage();

            _treeNode.Nodes.Add(_nodeInput.toTreeNode());
            _treeNode.Nodes.Add(_nodeOutput.toTreeNode());
            return _treeNode;
        }

        protected override void setTreeImage()
        {
            _treeNode.ImageIndex = (int)(discardable ? TREE_IMAGE.NOENTRY : TREE_IMAGE.FOLDER);
            _treeNode.SelectedImageIndex = _treeNode.ImageIndex;
        }

        public void save(String strPath)
        {
            XmlDocument xmlDoc = new XmlDocument();
            xmlDoc.AppendChild(toXml(xmlDoc));
            xmlDoc.Save(Path.Combine(strPath, name + ".xml"));
        }
    }
}
