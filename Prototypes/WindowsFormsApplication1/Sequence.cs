using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;
using System.Xml;
using GDS.Execution;
using System.Reflection;
using CSScriptLibrary;
using GDS.Script;

namespace GDS.Definition
{
    public abstract class Drawable<T> where T : Drawable<T>
    {
        internal int _id;
        public int x;
        public int y;
        protected int size = 30;

        protected DefinitionPath<T> _path;
        private DefinitionPath<T> _linkedPath;

        virtual public void addLinkedPath(DefinitionPath<T> path)
        {
            _linkedPath = path;
        }

        virtual public void deletePath()
        {
            if (_path != null)
            {
                _path._endPoint._linkedPath = null;
                _path = null;
            }
        }

        virtual public void delete()
        {
            if (_linkedPath != null)
                _linkedPath._startPoint.deletePath();
        }

        virtual public void draw(PaintEventArgs e)
        {
            e.Graphics.SmoothingMode = SmoothingMode.AntiAlias;
            if (_path != null)
                _path.draw(e);
        }

        virtual public bool isHit(Point location)
        {
            return !(location.X < x || location.Y < y || location.X > (x + size) || location.Y > (y + size));
        }

        virtual public void moveTo(Point p)
        {
            x = p.X;
            y = p.Y;
        }

        public virtual bool acceptsPath() { return _linkedPath == null; }
        public virtual bool canCreatePath() { return _path == null; }

        public virtual DefinitionPath<T> createPath()
        {
            return new DefinitionPath<T>((T)this);
        }

        public virtual void setPath(DefinitionPath<T> path)
        {
            _path = path;
        }

        public virtual Point getCenterPoint()
        {
            return new Point(x + (size / 2), y + (size / 2));
        }

    }

    public abstract class DefinitionSequence : Drawable<DefinitionSequence>
    {
        private static readonly string ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static readonly string NUMBERS = "0123456789";
        private static Random __random = new Random();
        private static int __id = 1;
        private static Dictionary<String, Object[]> __mapSequenceTypes = new Dictionary<string, object[]>();

        public static void Clear()
        {
            __id = 1;
            __mapSequenceTypes.Clear();
        }

        public static String[] SEQUENCE_NAMES 
        { 
            get 
            {
                return __mapSequenceTypes.Keys.ToArray();
            } 
            private set{}
        }
        
        public static void AddSequenceType(Type type, object[] args, String strName)
        {
            List<Object> listArgs = new List<object>();
            listArgs.Add(type);
            listArgs.AddRange(args);            
            __mapSequenceTypes.Add(strName, listArgs.ToArray());
        }       
       
        public static DefinitionSequence create(XmlNode xmlNode)
        {
            String strSequenceType = xmlNode.Attributes.GetNamedItem("name").InnerText;
            DefinitionSequence sequence = create(strSequenceType);
            sequence.loadFromXml(xmlNode);

            if (__id <= sequence._id)
                __id = sequence._id + 1;

            return sequence;
        }
        
        public static DefinitionSequence create(String strName)
        {
            if (!SEQUENCE_NAMES.Contains(strName))
                throw new Exception("Unrecognized sequence type '" + strName + "'");

            Object[] aAll = __mapSequenceTypes[strName];

            Type t = (Type)aAll[0];           
            Object[] aArgs = new Object[aAll.Length - 1];
            Type[] aTypes = new Type[aAll.Length-1];

            for (int i = 1; i < aAll.Length; i++)
            {
                aArgs[i-1] = aAll[i];
                aTypes[i-1] = aAll[i].GetType();
            }

            ConstructorInfo constructor = t.GetConstructor(aTypes);

            DefinitionSequence seq = (DefinitionSequence)constructor.Invoke(aArgs);
            return seq;                        
        }

        protected DefinitionSequence()
        {
            _id = __id++;

            x = 20;
            y = 20;
        }

        abstract public String name {get;protected set;}
        abstract public DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system);
        
        public virtual XmlNode toXML(XmlDocument xmlDoc)
        {
            XmlNode xmlSequence = xmlDoc.CreateElement("SEQUENCE");

            xmlSequence.Attributes.Append(xmlDoc.CreateAttribute("name")).InnerText = name;

            xmlSequence.AppendChild(xmlDoc.CreateElement("ID")).InnerText = _id.ToString();
            xmlSequence.AppendChild(xmlDoc.CreateElement("X")).InnerText = x.ToString();
            xmlSequence.AppendChild(xmlDoc.CreateElement("Y")).InnerText = y.ToString();
            xmlSequence.AppendChild(xmlDoc.CreateElement("SIZE")).InnerText = size.ToString();
            
            if (_path != null) 
                xmlSequence.AppendChild(_path.toXML(xmlDoc));
            
            return xmlSequence;
        }

        protected virtual void loadFromXml(XmlNode xmlNode)
        {
            foreach (XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch (xmlChild.Name.ToUpper())
                {
                    case "ID":
                        _id = Int32.Parse(xmlChild.InnerText);
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
                }
            }
        }

        protected string generate(DefinitionField field)
        {
            string strData = "";

            for (int i = 0; i < field.length; i++)
            {
                if (field.type == DefinitionField.FIELD_TYPE.STRING)
                {
                    strData += ALPHABET[__random.Next(0, 25)];
                }
                else
                {
                    strData += NUMBERS[__random.Next(0, 9)];
                }
            }

            return strData;
        }
    }

    public class DefinitionPath<T> where T : Drawable<T>
    {
        internal T _endPoint;
        internal T _startPoint;

        internal DefinitionPath(T startPoint)
        {
            _startPoint = startPoint;
        }

        public virtual void confirm(T endPoint)
        {
            _endPoint = endPoint;
            _endPoint.addLinkedPath(this);
            _startPoint.setPath(this);
        }

        public virtual void draw(PaintEventArgs e)
        {
            e.Graphics.DrawLine(new Pen(Brushes.Black, 2),_startPoint.getCenterPoint(), _endPoint.getCenterPoint());
        }

        public virtual XmlNode toXML(XmlDocument xmlDoc)
        {
            XmlNode xmlPath = xmlDoc.CreateElement("PATH");

            xmlPath.AppendChild(xmlDoc.CreateElement("INPUT_ID")).InnerText = _startPoint._id.ToString();
            xmlPath.AppendChild(xmlDoc.CreateElement("OUTPUT_ID")).InnerText = _endPoint._id.ToString();

            return xmlPath;
        }

        public static void loadPathsFromXml(XmlNode xmlNode, Dictionary<int, T> mapSequences)
        {
            XmlNode xmlPath = xmlNode.SelectSingleNode("./PATH");

            if (xmlPath != null)
            {
                int iInputId = Int32.Parse(xmlPath.SelectSingleNode("./INPUT_ID").InnerText);
                int iOutputId = Int32.Parse(xmlPath.SelectSingleNode("./OUTPUT_ID").InnerText);

                DefinitionPath<T> path = new DefinitionPath<T>(mapSequences[iInputId]);
                path.confirm(mapSequences[iOutputId]);
            }
        }
    }

    public class SequenceStart : DefinitionSequence
    {
        public override string name
        {
            get{return "Start";}
            protected set{throw new NotImplementedException();}
        }

        public override bool acceptsPath()
        {
            return false;
        }

        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            e.Graphics.FillEllipse(Brushes.Green, new Rectangle(x, y, size, size));
        }

        private void copyNode(Node to, DefinitionNode from, bool bGenerate)
        {
            foreach (DefinitionEntity child in from.getChildren())
            {
                if (child is DefinitionNode)
                    copyNode(to.appendNode(new Node(to, new Id(child.id, 1))), (DefinitionNode)child, bGenerate);
                else if (child is DefinitionField)
                    to.appendField(new Field(to, new Id(child.id, 1), bGenerate ? generate((DefinitionField)child) : ""));
            }
        }

        public override DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system)
        {
            trace.info("Sequence Start");

            Node input = record.appendNode(new Node(record, new Id(DefinitionId.ROOT_INPUT, 1)));
            Node output = record.appendNode(new Node(record, new Id(DefinitionId.ROOT_OUTPUT, 1)));
            Node work = record.appendNode(new Node(record, new Id(DefinitionId.ROOT_WORK, 1)));
            record.appendNode(new Node(record, new Id(DefinitionId.ROOT_SOURCES, 1)));

            copyNode(input, (DefinitionNode)system.getEntity(DefinitionId.ROOT_INPUT), true);
            copyNode(output, (DefinitionNode)system.getEntity(DefinitionId.ROOT_OUTPUT), false);
            copyNode(work, (DefinitionNode)system.getEntity(DefinitionId.ROOT_WORK), false);
            
            if (_path != null)
                return _path._endPoint;
            else
                return null;
        }
    }

    public class SequenceEnd : DefinitionSequence
    {
        public override string name
        {
            get { return "End"; }
            protected set { throw new NotImplementedException(); }
        }

        public override void  draw(PaintEventArgs e)
        {
 	        base.draw(e);
            e.Graphics.FillEllipse(Brushes.Red, new Rectangle(x, y, size, size));
        }

        public override bool canCreatePath()
        {
            return false;
        }

        public override DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system)
        {
            trace.info("Sequence End");
            return null;
        }
    }

    public class SequenceCall : DefinitionSequence
    {
        private DefinitionSource _source;

        public SequenceCall(DefinitionSource source)
            : base()
        {
            _source = source;
        }
        
        public override string name
        {
            get { return "Call - " + _source.name; }
            protected set { }
        }

        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            e.Graphics.FillEllipse(new SolidBrush(Color.FromArgb(Math.Abs((this.name.GetHashCode()/3)% 255), Math.Abs((this.name.GetHashCode()/7)% 255), Math.Abs(this.name.GetHashCode())% 255)),
                new Rectangle(x, y, size, size));
        }

        private Node getDummySourceData(DefinitionNode nodeSource, Node parent)
        {
            Node nodeTarget = new Node(parent, new Id(nodeSource.id, parent.nextEntityIteration(nodeSource.id)));

            foreach(DefinitionEntity entity in nodeSource.getChildren())
            {
                if (!entity.discardable)
                {
                    if (entity is DefinitionNode)
                        nodeTarget.appendNode(getDummySourceData((DefinitionNode)entity, nodeTarget));
                    else
                        nodeTarget.appendField(new Field(nodeTarget, new Id(entity.id, nodeTarget.nextEntityIteration(entity.id)), generate((DefinitionField)entity)));
                }
            }

            return nodeTarget;
        }

        public override DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system)
        {
            trace.info("Calling Source " + _source.name);

            Node nodeSource = record.findNode(DefinitionId.ROOT_SOURCES);

            nodeSource.appendNode(new Node(nodeSource, new Id(_source.id, nodeSource.nextEntityIteration(_source.id))))
                .appendNode(getDummySourceData(_source.getOutputNode(), nodeSource));

            if (_path != null)
                return _path._endPoint;
            else
                return null;
        }
    }

    public class SequenceScript : DefinitionSequence
    {
        private DefinitionScript _script;

        public SequenceScript(DefinitionScript script)
            : base()
        {
            _script = script;
        }

        public override string name
        {
            get { return "Script - " + _script.name; }
            protected set { throw new NotImplementedException(); }
        }

        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            e.Graphics.FillEllipse(Brushes.Yellow, new Rectangle(x, y, size, size));
        }

        public override DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system)
        {
            trace.info("Sequence Script - " + _script.name);

            try
            {
                ScriptHelper helper = new ScriptHelper(record, system);

                Assembly script = CSScript.LoadCode(_script.script);
                var o = script.CreateObject("Script" + _script.name);
                MethodInfo method = o.GetType().GetMethod("execute");
                method.Invoke(o, new Object[] {helper});
            }
            catch(Exception e)
            {
                trace.error("Script failed");
                trace.error(e.Message);
                return null;
            }

            if (_path != null)
                return _path._endPoint;
            else
                return null;

        }
    }

    public class SequenceMapping : DefinitionSequence
    {
        private DefinitionMapping  _mapping;

        public SequenceMapping(DefinitionMapping mapping)
            : base()
        {
            _mapping = mapping;
        }

        public override string name
        {
            get { return "Mapping - " + _mapping.name; }
            protected set { throw new NotImplementedException(); }
        }

        public override void draw(PaintEventArgs e)
        {
            base.draw(e);
            e.Graphics.FillEllipse(Brushes.HotPink, new Rectangle(x, y, size, size));
        }

        public override DefinitionSequence execute(Record record, Trace trace, DefinitionSystem system)
        {
            trace.info("Sequence Mapping - " + _mapping.name);

            ScriptHelper helper = new ScriptHelper(record, system);

            foreach(DefinitionMappingObject obj in _mapping.listObjects)
                obj.execute(helper);
            
            if (_path != null)
                return _path._endPoint;
            else
                return null;
        }
    }

}
