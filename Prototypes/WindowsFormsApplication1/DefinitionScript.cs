using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace GDS.Definition
{
    public class DefinitionScript
    {
        public DefinitionScript(String strName)
        {
            name = strName;
            script = "using System;\r\n" +
                      "using GDS.Script;\r\n" +
                      "using GDS.Execution;\r\n\r\n" +
                      "public class Script" + strName + "\r\n" +
                      "{\r\n" +
                      "    public void execute(ScriptHelper helper)\r\n" +
                      "    {\r\n" +
                      "    }\r\n" +
                      "}\r\n";
        }

        public DefinitionScript(String strName, String strScript)
        {
            name = strName;
            script = strScript;
        }

        public DefinitionScript(XmlNode xmlNode)
        {
            foreach (XmlNode xmlChild in xmlNode.ChildNodes)
            {
                switch (xmlChild.Name.ToUpper())
                {
                    case "NAME":
                        name = xmlChild.InnerText;
                        break;
                    case "SCRIPT":
                        script = xmlChild.InnerText;
                        break;
                }
            }
        }

        public String name { get; set; }
        public String script { get; set; }

        public XmlNode toXml(XmlDocument xmlDoc)
        {
            XmlNode xmlNode = xmlDoc.CreateElement("SCRIPT");
            xmlNode.AppendChild(xmlDoc.CreateElement("NAME")).InnerText = name;
            xmlNode.AppendChild(xmlDoc.CreateElement("SCRIPT")).AppendChild(xmlDoc.CreateCDataSection(script));
            return xmlNode;
        }
    }
}
