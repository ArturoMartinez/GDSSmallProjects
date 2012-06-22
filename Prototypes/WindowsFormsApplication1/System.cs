using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Xml;
using System.Windows.Forms;

namespace GDS.Definition
{
    public class DefinitionSystem : DefinitionEntity
    {
        private XmlDocument _xmlSystem;
        private DefinitionNode _nodeInput;
        private DefinitionNode _nodeOutput;
        private DefinitionNode _nodeWork;
        private DefinitionNode _nodeSources;
        private String _strSystemFolder;        

        public List<DefinitionSequence> listSequences { get; private set; }
        public List<DefinitionScript> listScripts { get; private set; }
        public List<DefinitionMapping> listMappings { get; private set; }

        public DefinitionSystem(String strSystemFilename)
            : base(null)
        {
            //clear all statics

            DefinitionSequence.Clear();
            DefinitionId.Clear();

            //load system

            DefinitionSequence.AddSequenceType(typeof(SequenceStart), new Object[] { }, "Start");
            DefinitionSequence.AddSequenceType(typeof(SequenceEnd), new Object[] { }, "End");
            
            _strSystemFolder = Path.GetDirectoryName(strSystemFilename);
            listSequences = new List<DefinitionSequence>();
            listScripts = new List<DefinitionScript>();
            listMappings = new List<DefinitionMapping>();
            name = "System";
            discardable = false;

            id = DefinitionId.ROOT_ROOT;
            _nodeInput = new DefinitionNode("Input", DefinitionId.ROOT_INPUT, this);
            _nodeOutput = new DefinitionNode("Output", DefinitionId.ROOT_OUTPUT, this);
            _nodeWork = new DefinitionNode("Work", DefinitionId.ROOT_WORK, this);
            _nodeSources = new DefinitionNode("Sources", DefinitionId.ROOT_SOURCES, this);

            _xmlSystem = new XmlDocument();
            _xmlSystem.Load(strSystemFilename);

            foreach (XmlNode xmlNode in _xmlSystem.SelectNodes("/SYSTEM/SOURCES/SOURCE"))
            {
                DefinitionSource source = new DefinitionSource(_nodeSources, Path.Combine(_strSystemFolder, xmlNode.InnerText + ".xml"));
                this.addSource(source);
            }

            foreach (XmlNode xmlNode in _xmlSystem.SelectNodes("/SYSTEM/SCRIPTS/SCRIPT"))
            {
                DefinitionScript script = new DefinitionScript(xmlNode);
                this.addScript(script);
            }

            foreach (XmlNode xmlNode in _xmlSystem.SelectNodes("/SYSTEM/MAPPINGS/MAPPING"))
            {
                DefinitionMapping mapping = new DefinitionMapping(xmlNode);
                this.addMapping(mapping);
            }
            
            Dictionary<int, DefinitionSequence> mapSequences = new Dictionary<int,DefinitionSequence>();
            foreach (XmlNode xmlNode in _xmlSystem.SelectNodes("/SYSTEM/SEQUENCES/SEQUENCE"))
            {
                DefinitionSequence sequence = DefinitionSequence.create(xmlNode);
                mapSequences.Add(sequence._id, sequence);
                this.addSequence(sequence);
            }

            foreach (XmlNode xmlNode in _xmlSystem.SelectNodes("/SYSTEM/SEQUENCES/SEQUENCE"))
                DefinitionPath<DefinitionSequence>.loadPathsFromXml(xmlNode, mapSequences);

            foreach (XmlNode xmlNode in _xmlSystem.SelectSingleNode("/SYSTEM/INPUT/NODE").ChildNodes)
            {
                if(xmlNode.Name.ToUpper() == "NODE")
                    _nodeInput.AddEntity(new DefinitionNode(xmlNode, _nodeInput));
                else if(xmlNode.Name.ToUpper() == "FIELD")
                    _nodeInput.AddEntity(new DefinitionField(xmlNode, _nodeInput));
            }

            foreach (XmlNode xmlNode in _xmlSystem.SelectSingleNode("/SYSTEM/OUTPUT/NODE").ChildNodes)
            {
                if (xmlNode.Name.ToUpper() == "NODE")
                    _nodeOutput.AddEntity(new DefinitionNode(xmlNode, _nodeOutput));
                else if (xmlNode.Name.ToUpper() == "FIELD")
                    _nodeOutput.AddEntity(new DefinitionField(xmlNode, _nodeOutput));
            }

            foreach (XmlNode xmlNode in _xmlSystem.SelectSingleNode("/SYSTEM/WORK/NODE").ChildNodes)
            {
                if (xmlNode.Name.ToUpper() == "NODE")
                    _nodeWork.AddEntity(new DefinitionNode(xmlNode, _nodeWork));
                else if (xmlNode.Name.ToUpper() == "FIELD")
                    _nodeWork.AddEntity(new DefinitionField(xmlNode, _nodeWork));
            }
        }

        public void save(String strFolderName)
        {
            _strSystemFolder = strFolderName;

            //each source

            XmlDocument xmlDoc = new XmlDocument();
            foreach (DefinitionSource source in _nodeSources.getChildren())
                source.save(_strSystemFolder);

            //system 

            xmlDoc = new XmlDocument();
            XmlNode xmlSystem = xmlDoc.AppendChild(xmlDoc.CreateElement("SYSTEM"));
            
            //system - source list
            
            XmlNode xmlSources = xmlSystem.AppendChild(xmlDoc.CreateElement("SOURCES"));

            foreach (DefinitionSource source in _nodeSources.getChildren())
                xmlSources.AppendChild(xmlDoc.CreateElement("SOURCE")).InnerText = source.name;

            //system - script list

            XmlNode xmlScripts = xmlSystem.AppendChild(xmlDoc.CreateElement("SCRIPTS"));
            foreach (DefinitionScript script in listScripts)
                xmlScripts.AppendChild(script.toXml(xmlDoc));

            //system - mapping list

            XmlNode xmlMappings = xmlSystem.AppendChild(xmlDoc.CreateElement("MAPPINGS"));
            foreach (DefinitionMapping mapping in listMappings)
                xmlMappings.AppendChild(mapping.toXml(xmlDoc));

            //system - each sequence

            XmlNode xmlSequences = xmlSystem.AppendChild(xmlDoc.CreateElement("SEQUENCES"));

            foreach (DefinitionSequence sequence in listSequences)
                xmlSequences.AppendChild(sequence.toXML(xmlDoc));

            //system - input/work/output node

            XmlNode xmlInput = xmlSystem.AppendChild(xmlDoc.CreateElement("INPUT"))
                .AppendChild(_nodeInput.toXml(xmlDoc));

            XmlNode xmlOutput = xmlSystem.AppendChild(xmlDoc.CreateElement("OUTPUT"))
                .AppendChild(_nodeOutput.toXml(xmlDoc));

            XmlNode xmlWork = xmlSystem.AppendChild(xmlDoc.CreateElement("WORK"))
                .AppendChild(_nodeWork.toXml(xmlDoc));

            xmlDoc.Save(Path.Combine(_strSystemFolder, "SYSTEM.XML"));        
        }

        public void deleteSequence(DefinitionSequence sequence)
        {
            listSequences.Remove(sequence);
            sequence.delete();
        }

        public String getSystemFolder()
        {
            return _strSystemFolder;
        }

        public void save()
        {
            save(_strSystemFolder);
        }

        public override TreeNode toTreeNode()
        {
            _treeNode = new TreeNode()
            {
                Text = name,
                Tag = this,
                SelectedImageIndex = -1                
            };

            _treeNode.Nodes.Add(_nodeInput.toTreeNode());
            _treeNode.Nodes.Add(_nodeOutput.toTreeNode());
            _treeNode.Nodes.Add(_nodeWork.toTreeNode());
            _treeNode.Nodes.Add(_nodeSources.toTreeNode());
                        
            setTreeImage();

            return _treeNode;
        }

        protected override void setTreeImage()
        {
            _treeNode.ImageIndex = (int)(TREE_IMAGE.FIELD);
        }

        protected override string getXmlElementName()
        {
            return "system";
        }

        public void addSource(DefinitionSource source)
        {
            _nodeSources.AddEntity(source);
            DefinitionSequence.AddSequenceType(typeof(SequenceCall), new Object[] { source }, "Call - " + source.name);
        }

        public void addScript(DefinitionScript script)
        {
            listScripts.Add(script);
            DefinitionSequence.AddSequenceType(typeof(SequenceScript), new Object[] { script }, "Script - " + script.name);
        }

        public void addMapping(DefinitionMapping mapping)
        {
            listMappings.Add(mapping);
            DefinitionSequence.AddSequenceType(typeof(SequenceMapping), new Object[] { mapping }, "Mapping - " + mapping.name);
        }

        public void addSequence(DefinitionSequence sequence)
        {
            listSequences.Add(sequence);
        }

        public DefinitionEntity getEntity(DefinitionId id)
        {
            if(id == _nodeInput.id) return _nodeInput;
            if(id == _nodeOutput.id) return _nodeOutput;
            if(id == _nodeWork.id) return _nodeWork;
            if(id == _nodeSources.id) return _nodeSources;
            throw new Exception("Unrecognized System node");
        }
    }
}
