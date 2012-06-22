using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Windows.Forms;

namespace GDS.Definition
{
    public class DefinitionField : DefinitionEntity
    {
        public enum FIELD_TYPE
        {
            STRING,
            NUMBER
        }

        public int length { get; set; }
        public FIELD_TYPE type { get; set; }

        public DefinitionField(String strName, DefinitionId id, DefinitionEntity parent)
            : base(parent)
        {
            this.id = id;
            this.name = strName;
            this.length = 50;
            this.type = FIELD_TYPE.STRING;
        }

        public DefinitionField(XmlNode xmlNode, DefinitionEntity parent)
            : base(parent)
        {
            foreach (XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch (xmlChild.Name.ToUpper())
                {
                    case "NAME":
                        this.name = xmlChild.InnerText;
                        break;
                    case "TYPE":
                        switch (xmlChild.InnerText)
                        {
                            case "Numeric":
                                type = FIELD_TYPE.NUMBER;
                                break;
                            default: 
                                type = FIELD_TYPE.STRING;
                                break;
                        }
                        break;
                    case "LENGTH":
                        this.length = Int32.Parse(xmlChild.InnerText);
                        break;
                    case "ID":
                        this.id = DefinitionId.useId(parent.id.type, Int32.Parse(xmlChild.InnerText));
                        break;
                    case "DISCARDABLE":
                        this.discardable = Boolean.Parse(xmlChild.InnerText);
                        break;
                }
            }
        }

        public override XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = base.toXml(xmlDoc);
            switch (type)
            {
                case FIELD_TYPE.STRING:
                    xmlNode.AppendChild(xmlDoc.CreateElement("Type")).InnerText = "String";
                    break;
                case FIELD_TYPE.NUMBER:
                    xmlNode.AppendChild(xmlDoc.CreateElement("Type")).InnerText = "Numeric";
                    break;
            }

            xmlNode.AppendChild(xmlDoc.CreateElement("Length")).InnerText = length.ToString();

            return xmlNode;
        }

        protected override String getXmlElementName()
        {
            return "FIELD";
        }

        public override TreeNode toTreeNode()
        {
            _treeNode = new TreeNode()
            {
                Text = name,
                Tag = this,
            };

            setTreeImage();

            return _treeNode;
        }

        protected override void setTreeImage()
        {
            _treeNode.ImageIndex = (int)(discardable ? TREE_IMAGE.NOENTRY : TREE_IMAGE.FIELD);
            _treeNode.SelectedImageIndex = _treeNode.ImageIndex;
        }

    }
}
