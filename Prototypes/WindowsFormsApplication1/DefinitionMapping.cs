using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Windows.Forms;
using System.Drawing;
using GDS.Script;
using GDS.Execution;

namespace GDS.Definition
{
    public class MappingLink
    {
        public TreeNode _node;
        public String strPath;
        public MappingLink(TreeNode node)
        {
            _node = node;
            strPath = ((DefinitionEntity)node.Tag).getPath();
        }

        public MappingLink(XmlNode xmlNode)
        {
            strPath = xmlNode.InnerText;
        }

        public bool drawable()
        {
            return _node.Bounds.Top > 0;
        }

        public virtual void draw(PaintEventArgs e, DefinitionMappingObject obj, int x)
        {
            if (drawable())
            {
                Point to = new Point(x, _node.Bounds.Top + 13);
                e.Graphics.DrawLine(new Pen(Brushes.Black, 2), obj.getCenterPoint(), to);
            }
            else
            {
                Point from = obj.getCenterPoint();
                Point to = new Point(x, from.Y);
                e.Graphics.DrawLine(new Pen(Brushes.LightSlateGray, 1), from, to);
            }
        }
    }

    public abstract class DefinitionMappingObject : Drawable<DefinitionMappingObject>
    {        
        public static readonly String[] OBJECTS = {"copy", "latest"};
        private static int __ID = 1;

        private static int nextId()
        {
            return __ID++;
        }
        private static int useId(int iId)
        {
            if (iId >= __ID)
                __ID = iId + 1;

            return iId;
        }
        
        
        private List<MappingLink> _listInput;
        private List<MappingLink> _listOutput;
        public int id { get; private set; }

        public static DefinitionMappingObject create(String strName)
        {
            switch(strName)
            {
                case "copy":
                    return new DefinitionMappingObjCopy();
                case "latest":
                    return new DefinitionMappingObjLatest();
            }

            throw new Exception("Unknown mapping object type " + strName);
        }

        public static DefinitionMappingObject create(String strName, XmlNode xmlNode)
        {
            switch (strName)
            {
                case "copy":
                    return new DefinitionMappingObjCopy(xmlNode);
                case "latest":
                    return new DefinitionMappingObjLatest(xmlNode);
            }

            throw new Exception("Unknown mapping object type " + strName);
        }

        public DefinitionMappingObject()
            : base()
        {
            _listInput = new List<MappingLink>();
            _listOutput = new List<MappingLink>();
            id = nextId();
        }

        public DefinitionMappingObject(XmlNode xmlNode)
            : base()
        {
            _listInput = new List<MappingLink>();
            _listOutput = new List<MappingLink>();

            foreach (XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch (xmlChild.Name.ToUpper())
                {
                    case "INPUTS":
                        foreach(XmlNode xmlGrandChild in xmlChild.ChildNodes)
                        {
                            if (xmlGrandChild.Name.ToUpper() == "LINK")
                                addInput(new MappingLink(xmlGrandChild));
                        }
                        break;
                    case "OUTPUTS":
                        foreach (XmlNode xmlGrandChild in xmlChild.ChildNodes)
                        {
                            if (xmlGrandChild.Name.ToUpper() == "LINK")
                                addOutput(new MappingLink(xmlGrandChild));
                        }
                        break;
                    case "X":
                        x = Int32.Parse(xmlChild.InnerText);
                        break;
                    case "Y":
                        y = Int32.Parse(xmlChild.InnerText);
                        break;
                    case "SIZE":
                        size = Int32.Parse(xmlChild.InnerText);
                        break;
                    case "ID":
                        id = useId(Int32.Parse(xmlChild.InnerText));
                        break;
                }
            }
        }       
        
        public abstract String getName();
        public abstract void execute(ScriptHelper helper);
        public abstract String getCode();

        public override string ToString()
        {
            return getName();
        }

        public virtual MappingLink addInput(MappingLink link)
        {
            _listInput.Add(link);
            return link;
        }

        public virtual MappingLink addOutput(MappingLink link)
        {
            _listOutput.Add(link);
            return link;
        }

        public virtual void removeInput(MappingLink link)
        {
            _listInput.Remove(link);
        }

        public virtual void removeOutput(MappingLink link)
        {
            _listOutput.Remove(link);
        }

        public MappingLink[] getInputs()
        {
            return _listInput.ToArray();
        }

        public MappingLink[] getOutputs()
        {
            return _listOutput.ToArray();
        }
        
        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            foreach (MappingLink link in _listInput)
                link.draw(e, this, 0);

            foreach (MappingLink link in _listOutput)
                link.draw(e, this, e.ClipRectangle.Width);
        }

        public virtual XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = xmlDoc.CreateElement("OBJECT");
            xmlNode.Attributes.Append(xmlDoc.CreateAttribute("name")).InnerText = getName();

            xmlNode.AppendChild(xmlDoc.CreateElement("X")).InnerText = x.ToString();
            xmlNode.AppendChild(xmlDoc.CreateElement("Y")).InnerText = y.ToString();
            xmlNode.AppendChild(xmlDoc.CreateElement("SIZE")).InnerText = size.ToString();
            xmlNode.AppendChild(xmlDoc.CreateElement("ID")).InnerText = id.ToString();

            XmlNode xmlInputs = xmlNode.AppendChild(xmlDoc.CreateElement("INPUTS"));
            XmlNode xmlOutputs = xmlNode.AppendChild(xmlDoc.CreateElement("OUTPUTS"));

            foreach (MappingLink link in getInputs())
                xmlInputs.AppendChild(xmlDoc.CreateElement("LINK")).InnerText = link.strPath;

            foreach (MappingLink link in getOutputs())
                xmlOutputs.AppendChild(xmlDoc.CreateElement("LINK")).InnerText = link.strPath;

            return xmlNode;
        }

        public void doCopy(ScriptHelper helper, String strInputPath, String strOutputPath)
        {
            Entity inEntity = helper.selectEntity(strInputPath);
            Entity outEntity = helper.selectEntity(strOutputPath);

            if (inEntity == null || outEntity == null)
                return;
            else if (inEntity is Field && outEntity is Field)
                ((Field)outEntity).value = ((Field)inEntity).value;
            else if (inEntity is Field && outEntity is Node)
                ((Node)outEntity).copyField((Field)inEntity);
            else if (inEntity is Node && outEntity is Node)
                ((Node)outEntity).copyNode((Node)inEntity);
        }

        protected virtual bool drawable()
        {
            return (getInputs().Length == 0 && getOutputs().Length == 0) || 
                    getInputs().Any(l => l.drawable()) || 
                    getOutputs().Any(l => l.drawable());
        }
    }

    public class DefinitionMappingObjCopy : DefinitionMappingObject
    {
        public DefinitionMappingObjCopy()
            : base()
        {

        }

        public DefinitionMappingObjCopy(XmlNode xmlNode)
            : base(xmlNode)
        {

        }       

        public override String getName()
        {
            return "copy";
        }
    
        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            if (drawable())
                e.Graphics.FillEllipse(Brushes.Green, new Rectangle(x, y, size, size));
            else
            {
                Point center = this.getCenterPoint();
                e.Graphics.FillEllipse(Brushes.LightSlateGray, new Rectangle(center.X-1, center.Y-1, 3, 3));
            }
        }

        public override void execute(ScriptHelper helper)
        {
            MappingLink input = getInputs()[0];
            MappingLink output = getOutputs()[0];

            if (input != null && output != null)
                doCopy(helper, input.strPath, output.strPath);
        }

        public override string getCode()
        {
            String strCode =
            "            MappingLink input = ___object.getInputs()[0];\r\n" +
            "            MappingLink output = ___object.getOutputs()[0];\r\n" +
            "            if (input != null && output != null)\r\n" +
            "                ___object.doCopy(helper, input.strPath, output.strPath);\r\n" +
            "\r\n";

 	        return strCode;
        }
    }

    public class DefinitionMappingObjLatest : DefinitionMappingObject
    {
        public DefinitionMappingObjLatest()
            : base()
        {

        }

        public DefinitionMappingObjLatest(XmlNode xmlNode)
            : base(xmlNode)
        {

        }       

        public override String getName()
        {
            return "latest";
        }

        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            if (drawable())
                e.Graphics.FillEllipse(Brushes.Yellow, new Rectangle(x, y, size, size));
            else
            {
                Point center = this.getCenterPoint();
                e.Graphics.FillEllipse(Brushes.LightSlateGray, new Rectangle(center.X - 1, center.Y - 1, 3, 3));
            }
        }

        public override void execute(ScriptHelper helper)
        {
            MappingLink input = getInputs()[0];
            MappingLink output = getOutputs()[0];

            if (input != null && output != null)
            {
                Id[] aIds = ScriptHelper.getDefinitions(input.strPath);

                String strInputPath = "";

                foreach (Id id in aIds)
                {
                    strInputPath += (new Id(new DefinitionId(id.type, id.id), -1)).ToString() + ";";
                }

                doCopy(helper, strInputPath, output.strPath);
            }
        }

        public override string getCode()
        {
            String strCode = 
            "            MappingLink input = ___object.getInputs()[0];\r\n" +
            "            MappingLink output = ___object.getOutputs()[0];\r\n" +

            "            if (input != null && output != null)\r\n" +
            "            {\r\n" +
            "                Id[] aIds = ScriptHelper.getDefinitions(input.strPath);\r\n" +

            "                String strInputPath = \"\";\r\n" +

            "                foreach (Id id in aIds)\r\n" +
            "                {\r\n" +
            "                    strInputPath += (new Id(new DefinitionId(id.type, id.id), -1)).ToString() + \";\";\r\n" +
            "                }\r\n" +

            "                ___object.doCopy(helper, strInputPath, output.strPath);\r\n" +
            "            }\r\n" +
            "\r\n";

 	        return strCode;
        }

    }    

    public class DefinitionMapping 
    {
        private static int __ID = 1;

        private static int nextId()
        {
            return __ID++;
        }
        private static int useId(int iId)
        {
            if (iId >= __ID)
                __ID = iId + 1;

            return iId;
        }

        public List<DefinitionMappingObject> listObjects {get;private set;}
        public string name { get; set; }
        public int id { get; private set; }

        public DefinitionMapping(String strName)
        {
            name = strName;
            listObjects = new List<DefinitionMappingObject>();
            id = nextId();
        }

        public DefinitionMapping(XmlNode xmlNode)
        {
            listObjects = new List<DefinitionMappingObject>();
            foreach (XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch (xmlChild.Name.ToUpper())
                {
                    case "NAME":
                        name = xmlChild.InnerText;
                        break;
                    case "ID":
                        id = useId(Int32.Parse(xmlChild.InnerText));
                        break;
                }
            }

            foreach (XmlNode xmlObject in xmlNode.SelectNodes("./OBJECT"))
            {
                String strName = xmlObject.Attributes.GetNamedItem("name").InnerText;
                listObjects.Add(DefinitionMappingObject.create(strName, xmlObject));
            }
        }

        public XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = xmlDoc.CreateElement("MAPPING");
            xmlNode.AppendChild(xmlDoc.CreateElement("NAME")).InnerText = name;
            xmlNode.AppendChild(xmlDoc.CreateElement("ID")).InnerText = id.ToString();

            foreach(DefinitionMappingObject obj in listObjects)
                xmlNode.AppendChild(obj.toXml(xmlDoc));

            return xmlNode;
        }

        public DefinitionMappingObject addObject(DefinitionMappingObject obj)
        {
            listObjects.Add(obj);
            return obj;
        }

        public void draw(PaintEventArgs e)
        {
            foreach (DefinitionMappingObject obj in listObjects)
                obj.draw(e);
        }

        public override string ToString()
        {
            return name;
        }

        public String getCode()
        {
            String strCode = "";

            strCode += "        DefinitionMapping ___mapping = helper.findMapping(" + id + ");\r\n";
            strCode += "        if(___mapping == null)\r\n";
            strCode += "            return;\r\n";

            foreach(DefinitionMappingObject obj in listObjects)
            {
                strCode += "        // " + obj.getName() + "\r\n\r\n";
                strCode += "        {\r\n";
                strCode += "        DefinitionMappingObject ___object = ___mapping.findObject(" + obj.id + ");\r\n";
                strCode += "        if(___object != null)\r\n";
                strCode += "        {\r\n";
                //strCode += "            ___object.execute(helper);\r\n";
                strCode += obj.getCode();
                strCode += "        }\r\n}\r\n\r\n";
            }

            return strCode;
        }

        public DefinitionMappingObject findObject(int iObjectId)
        {
            foreach (DefinitionMappingObject obj in listObjects)
            {
                if (obj.id == iObjectId)
                    return obj;
            }
            return null;
        }
    }
}
