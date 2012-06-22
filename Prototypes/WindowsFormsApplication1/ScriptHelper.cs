using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using GDS.Definition;
using GDS.Execution;

namespace GDS.Script
{
    public class ScriptHelper
    {
        private Record _record;
        private DefinitionSystem _system;

        public ScriptHelper(Record record, DefinitionSystem system)
        {
            _record = record;
            _system = system;
        }

        public int countRecord(int iType, int iId)
        {
            return countRecord(new DefinitionId(iType, iId));
        }

        public int countRecord(DefinitionId id)
        {
            return 0;            
        }

        public static Id[] getDefinitions(String strPath)
        {
            int iPreviousType = -1;
            String[] aParts = strPath.Split(';');
            List<Id> listIds = new List<Id>();
            foreach (String strPart in aParts)
            {
                if (strPart != null && strPart.Trim().Length > 0)
                {
                    String[] aIds = strPart.Split('/');
                    if (aIds.Length == 1)
                        listIds.Add(new Id(new DefinitionId(iPreviousType, Int32.Parse(aIds[0])), 1));
                    else if (aIds.Length == 2)
                    {
                        iPreviousType = Int32.Parse(aIds[0]);
                        listIds.Add(new Id(new DefinitionId(Int32.Parse(aIds[0]), Int32.Parse(aIds[1])), 1));
                    }
                    else if (aIds.Length == 3)
                    {
                        iPreviousType = Int32.Parse(aIds[0]);
                        listIds.Add(new Id(new DefinitionId(Int32.Parse(aIds[0]), Int32.Parse(aIds[1])), Int32.Parse(aIds[2])));
                    }
                }
            }
            return listIds.ToArray();
        }

        public Field selectField(String strPath)
        {
            Entity entity = selectEntity(strPath);
            if (entity is Field)
                return (Field)entity;
            else
                return null;
        }

        public Node selectNode(String strPath)
        {
            Entity entity = selectEntity(strPath);
            if (entity is Node)
                return (Node)entity;
            else
                return null;
        }

        public Entity selectEntity(String strPath)
        {
            Id[] ids = getDefinitions(strPath);

            Entity entity = null;
            for(int i = 0;i < ids.Length;i++)
            {
                if (i == 0 &&
                    (ids[i].Equals(new Id(DefinitionId.ROOT_ROOT, 1)) ||
                    ids[i].Equals(new Id(DefinitionId.ROOT_ROOT, -1))))
                {
                    continue;
                }

                if (entity == null)
                {
                    entity = _record.findEntity(ids[i]);
                    if (entity == null)
                        return null;
                }
                else
                {
                    if (entity is Field)
                        return null;
                    else if (entity is Node)
                    {
                        entity = ((Node)entity).findEntity(ids[i]);
                        if (entity == null)
                            return null;
                    }
                }
            }

            return entity;
        }

        public void copyNode(String strPathTo, String strPathFrom)
        {
            copyNode(selectNode(strPathTo), selectEntity(strPathFrom));
        }

        public void copyNode(Node to, Entity from)
        {
            if (to == null || from == null)
                return;

            if (from is Field)
                to.copyField((Field)from);
            else
                to.copyNode((Node)from);
        }

        public DefinitionMapping findMapping(int iMappingId)
        {
            foreach (DefinitionMapping mapping in _system.listMappings)
            {
                if (mapping.id == iMappingId)
                    return mapping;
            }

            return null;
        }

    }
}
