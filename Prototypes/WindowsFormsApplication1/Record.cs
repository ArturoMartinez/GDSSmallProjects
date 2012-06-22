using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using GDS.Definition;
using System.Windows.Forms;

namespace GDS.Execution
{
    public class Id : DefinitionId, IComparable<Id>
    {
        internal int _iIteration;

        public Id(DefinitionId def, int iIteration)
            : base(def.type, def.id)
        {
            _iIteration = iIteration;
        }

        public override string ToString()
        {
            return type + "/" + id + "/" + _iIteration;
        }

        public virtual int CompareTo(Id obj)
        {
            int i = CompareTo((DefinitionId)obj);
            if (i != 0)
                return i;

            if (_iIteration < obj._iIteration)
                return -1;
            else if (_iIteration > obj._iIteration)
                return 1;
            else
                return 0;
        }

        public override bool Equals(object obj)
        {
            if (obj is Id)
                return CompareTo((Id)obj) == 0;
            else
                return base.Equals(obj);
        }

        public override int GetHashCode()
        {
            return base.GetHashCode() + _iIteration;
        }
    }

    public class Entity
    {
        protected Entity _parent;
        internal Id _id;
        protected TreeNode _treeNode;
        internal int _iteration { get; set; }

        public Entity(Entity parent, Id id)
        {
            _parent = parent;
            _id = id;
            _iteration = 1;
        }

        public virtual TreeNode toTreeNode()
        {
            _treeNode = new TreeNode() {
                Text = this.ToString()
            };

            return _treeNode;
        }

        public Id getInstanceId()
        {
            return _id;
        }

        public override string ToString()
        {
            DefinitionEntity entity = DefinitionId.getEntityInfo(new DefinitionId(_id.type, _id.id));
            return _id.ToString() + ":" + entity.name;
        }
    }

    public class Node : Entity
    {
        public List<Entity> _listChildren;
        private Dictionary<Id, Entity> _mapChildren;

        public Node(Entity parent, Id id)
            : base(parent, id)
        {
            _listChildren = new List<Entity>();
            _mapChildren = new Dictionary<Id, Entity>();
        }

        public String name { get; private set; }

        public int nextEntityIteration(DefinitionId id)
        {
            for (int i = 1; ; i++)
            {
                if (!_mapChildren.Keys.Contains(new Id(id, i)))
                    return i;
            }
        }

        public Node copyNode(Node node)
        {
            Node newNode = new Node(this, new Id(node._id, nextEntityIteration(node._id)));
            _mapChildren.Add(newNode._id, newNode);
            _listChildren.Add(newNode);

            foreach(Entity e in node._listChildren)
            {
                if (e is Node)
                    newNode.copyNode((Node)e);
                else if (e is Field)
                    newNode.copyField((Field)e);
            }

            if (_treeNode == null)
                _treeNode = toTreeNode();
            _treeNode.Nodes.Add(newNode.toTreeNode());

            return newNode;
        }

        public Field copyField(Field field)
        {
            Field newField = new Field(this, new Id(field._id, nextEntityIteration(field._id)), field.value);
            _mapChildren.Add(newField._id, newField);
            _listChildren.Add(newField);

            if (_treeNode == null)
                _treeNode = toTreeNode();
            _treeNode.Nodes.Add(newField.toTreeNode());

            return newField;   
        }
        
        public Node appendNode(Node node)
        {
            _listChildren.Add(node);
            if (_treeNode == null)
                _treeNode = toTreeNode();
            _treeNode.Nodes.Add(node.toTreeNode());

            _mapChildren.Add(new Id(node._id, nextEntityIteration(node._id)), node);
            return node;
        }

        public Field appendField(Field field)
        {
            _listChildren.Add(field);
            if (_treeNode == null)
                _treeNode = toTreeNode();
            _treeNode.Nodes.Add(field.toTreeNode());
            _mapChildren.Add(new Id(field._id, nextEntityIteration(field._id)), field);
            return field;
        }

        public override TreeNode toTreeNode()
        {
            TreeNode node = base.toTreeNode();
            foreach (Entity entity in _listChildren)
                node.Nodes.Add(entity.toTreeNode());

            return node;
        }

        public Field findField(DefinitionId id)
        {
            Entity e = findEntity(id);
            if (e is Field)
                return (Field)e;
            else
                return null;
        }

        public Node findNode(DefinitionId id)
        {
            Entity e = findEntity(id);
            if (e is Node)
                return (Node)e;
            else
                return null;
        }

        public Entity findEntity(DefinitionId id)
        {
            Id executionId = new Id(id, 1);
            if (_mapChildren.Keys.Contains(executionId))
                return _mapChildren[executionId];
            else
                return null;
        }

        public Entity findEntity(Id id)
        {
            if (id._iIteration == -1)
            {
                //find latest
                Id executionId = new Id(id, countChildren(id));
                if (_mapChildren.Keys.Contains(executionId))
                    return _mapChildren[executionId];
                else
                    return null;
            }
            else
                return findEntity((DefinitionId)id);
        }

        public int countChildren(DefinitionId id)
        {
            int iMax = 0;
            for(int i = 1;;i++)
            {
                if (_mapChildren.Keys.Contains(new Id(id, i)))
                    iMax = i;
                else
                    break;
            }
            return iMax;
        }
    
    }

    public class Field : Entity
    {
        private String strValue;

        public String value
        {
            get {return strValue;}
            set {
                strValue = value;
                if(_treeNode != null)
                    _treeNode.Text = this.ToString();
            }
        }

        public Field(Entity parent, Id id, String strValue)
            : base(parent, id)
        {
            value = strValue;
        }

        public override string ToString()
        {
            return base.ToString() + " (" + strValue + ")";
        }
    }

    public class Record : Node
    {
        public Record()
            : base(null, new Id(DefinitionId.ROOT_ROOT, 1))
        {
        }
    }
}
