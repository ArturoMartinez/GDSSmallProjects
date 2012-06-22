using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Windows.Forms;

namespace GDS.Definition
{
    public class DefinitionNode : DefinitionEntity
    {
        private List<DefinitionEntity> listEntities;

        public DefinitionNode(String strName, DefinitionId id, DefinitionEntity parent)
            : base(parent)
        {
            listEntities = new List<DefinitionEntity>();
            this.id = id;
            this.name = strName;
        }
        
        public DefinitionNode(XmlNode xmlNode, DefinitionEntity parent)
            : base(parent)
        {
            listEntities = new List<DefinitionEntity>();
                                           
            foreach(XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch(xmlChild.Name.ToUpper())
                {
                    case "NAME":
                        this.name = xmlChild.InnerText;
                        break;
                    case "NODE":
                        listEntities.Add(new DefinitionNode(xmlChild, this));
                        break;
                    case "FIELD":
                        listEntities.Add(new DefinitionField(xmlChild, this));
                        break;
                    case "DISCARDABLE":
                        this.discardable = Boolean.Parse(xmlChild.InnerText);
                        break;
                    case "ID":
                        this.id = DefinitionId.useId(parent.id.type, Int32.Parse(xmlChild.InnerText));
                        break;
                }          
            }
        }

        protected override string getXmlElementName()
        {
            return "NODE";                
        }

        public override XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = base.toXml(xmlDoc);

            foreach (DefinitionEntity entity in listEntities)
                xmlNode.AppendChild(entity.toXml(xmlDoc));

            return xmlNode;
        }

        public IEnumerable<DefinitionEntity> getChildren()
        {
            return listEntities;
        }

        public override TreeNode toTreeNode()
        {
            _treeNode = new TreeNode()
            {
                Text = name,
                Tag = this,
            };

            setTreeImage();

            foreach (DefinitionEntity entity in listEntities)
                _treeNode.Nodes.Add(entity.toTreeNode());

            return _treeNode;
        }

        protected override void setTreeImage()
        {
            _treeNode.ImageIndex = (int)(discardable ? TREE_IMAGE.NOENTRY : TREE_IMAGE.FOLDER);
            _treeNode.SelectedImageIndex = _treeNode.ImageIndex;
        }

        protected override void checkDiscardable()
        {
            discardable = true;
            foreach (DefinitionEntity entity in listEntities)
            {
                if (!entity.discardable)
                {
                    discardable = false;
                    break;
                }
            }

            base.checkDiscardable();
        }

        public DefinitionEntity AddEntity(DefinitionEntity entity)
        {
            listEntities.Add(entity);
            if (_treeNode != null)
                _treeNode.Nodes.Add(entity.toTreeNode());

            return entity;
        }
    }

    class DefinitionInputNode : DefinitionNode
    {
        public DefinitionInputNode(XmlNode xmlNode, DefinitionEntity parent)
            : base(xmlNode, parent)
        {
            this.name = "Input";
        }

        protected override string getXmlElementName()
        {
            return "INPUT";
        }
    }

    class DefinitionOutputNode : DefinitionNode
    {
        public DefinitionOutputNode(XmlNode xmlNode, DefinitionEntity parent)
            : base(xmlNode, parent)
        {
            this.name = "Output";
        }

        protected override string getXmlElementName()
        {
            return "OUTPUT";
        }
    }


}
