using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Windows.Forms;

namespace GDS.Definition
{
    public abstract class DefinitionEntity
    {
        public enum TREE_IMAGE
        {
            FIELD = 0,
            FOLDER = 1,
            NOENTRY = 2
        };

        protected DefinitionEntity _parent;
        protected TreeNode _treeNode;

        public bool discardable { get; set; }
        public String name { get; set; }

        private DefinitionId _id;

        public DefinitionId id 
        { 
            get { return _id; } 
            protected set 
            { 
                _id = value; 
                DefinitionId.addEntityInfo(this); 
            } 
        }

        public DefinitionEntity(DefinitionEntity parent)
        {
            _parent = parent;
            discardable = true;
        }

        public virtual XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = xmlDoc.CreateElement(getXmlElementName());

            xmlNode.AppendChild(xmlDoc.CreateElement("ID")).InnerText = id.id.ToString();
            xmlNode.AppendChild(xmlDoc.CreateElement("DISCARDABLE")).InnerText = discardable.ToString();
            xmlNode.AppendChild(xmlDoc.CreateElement("NAME")).InnerText = name;

            return xmlNode;
        }

        protected abstract String getXmlElementName();
        public abstract TreeNode toTreeNode();
        protected abstract void setTreeImage();

        public void toggleDiscardable()
        {
            discardable ^= true;
            checkDiscardable();
        }

        protected virtual void checkDiscardable()
        {
            setTreeImage();
            if (_parent != null)
                _parent.checkDiscardable();   
        }

        public TreeNode getTreeNode()
        {
            return _treeNode;
        }

        public virtual String getPath()
        {
            if (_parent != null)
            {
                return _parent.getPath() + id.type + "/" + id.id + ";";
            }
            else
                return id.type + "/" + id.id + ";";
        }
    }
}
