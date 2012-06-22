using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace GDS.Definition
{
    public class DefinitionId : IComparable<DefinitionId>
    {
        public enum ID_TYPE
        {
            SYSTEM = 0,
            INPUT = 1,
            OUTPUT = 2,
            WORK = 3,
            SOURCE = 50
        }

        public int type {get;set;}
        public int id {get; set;}

        public static readonly DefinitionId ROOT_ROOT = new DefinitionId((int)ID_TYPE.SYSTEM, 0);
        public static readonly DefinitionId ROOT_INPUT = new DefinitionId((int)ID_TYPE.INPUT, 1);
        public static readonly DefinitionId ROOT_OUTPUT = new DefinitionId((int)ID_TYPE.OUTPUT, 2);
        public static readonly DefinitionId ROOT_WORK = new DefinitionId((int)ID_TYPE.WORK, 3);
        public static readonly DefinitionId ROOT_SOURCES = new DefinitionId((int)ID_TYPE.SYSTEM, 4);

        public static void Clear()
        {
            __mapIds.Clear();
            __mapEntities.Clear();
        }

        private static IDictionary<int, int> __mapIds = new Dictionary<int, int>();
        private static Dictionary<DefinitionId, DefinitionEntity> __mapEntities = new Dictionary<DefinitionId,DefinitionEntity>();

        public static DefinitionEntity getEntityInfo(DefinitionId id)
        {
            if (__mapEntities.ContainsKey(id))
                return __mapEntities[id];
            else
                return null;
        }

        public static DefinitionEntity addEntityInfo(DefinitionEntity entity)
        {
            __mapEntities[entity.id] = entity;
            return entity;
        }

        public DefinitionId(int iType, int iId)
        {
            type = iType;
            id = iId;
        }
        
        #region IComparable Members

        public override bool Equals(object obj)
        {
            if (obj is DefinitionId)
                return CompareTo((DefinitionId)obj) == 0;
            else
                return base.Equals(obj);
        }

        public int CompareTo(DefinitionId obj)
        {
            if (obj == null)
                return 1;

            if (type < obj.type)
                return -1;
            else if(type > obj.type)
                return 1;
            else
            {
                if(id < obj.id)
                    return -1;
                else if(id > obj.id)
                    return -1;
                else
                    return 0;
            }
        }

        public override int GetHashCode()
        {
            return (id * 10000) + (type * 100);
        }

        #endregion

        public static DefinitionId next(int iType)
        {
            lock (__mapIds)
            {
                if (!__mapIds.ContainsKey(iType))
                    __mapIds.Add(iType, 1);

                int i = __mapIds[iType];
                __mapIds[iType] = i + 1;
                return new DefinitionId(iType, i + 1);
            }
        }

        public static DefinitionId useId(int iType, int iId)
        {
            lock (__mapIds)
            {
                if (!__mapIds.ContainsKey(iType))
                    __mapIds.Add(iType, iId);

                int i = __mapIds[iType];
                if (i < iId)
                    __mapIds[iType] = iId;

                return new DefinitionId(iType, iId);
            }
        }

        public static DefinitionId newSourceType()
        {
            lock (__mapIds)
            {
                int iType = 0;
                
                if(__mapIds.Count > 0)
                    iType = __mapIds.Keys.Max();

                if (iType < (int)ID_TYPE.SOURCE)
                    iType = (int)ID_TYPE.SOURCE;

                __mapIds.Add(iType + 1, 1);
                return new DefinitionId(iType + 1, 1);
            }
        }

        public override string ToString()
        {
            return type + ":" + id;
        }
    }
}
