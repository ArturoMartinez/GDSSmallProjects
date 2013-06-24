using System;
using System.Collections;
using System.Collections.Specialized;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Reflection;
using System.Text;
using System.Threading;
using System.Text.RegularExpressions;

class Program
{
    static void Main()
    {
        try
        {
            HttpListener listener = new HttpListener();
            listener.Prefixes.Add("http://*:8081/");
            listener.Start();
            Console.WriteLine("Listening...");
            for (; ; )
            {
                HttpListenerContext ctx = listener.GetContext();
                new Thread(new Worker(ctx).ProcessRequest).Start();
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
        }
    }

    class Worker
    {
        private HttpListenerContext _context;
        private Encoding _encoding = new UTF8Encoding(false);


        public Worker(HttpListenerContext context)
        {
            this._context = context;
        }

        public void ProcessRequest()
        {
            try
            {

                string strMessage = _context.Request.HttpMethod + " " + _context.Request.Url;
                Console.WriteLine(strMessage);

                byte[] aResponseBytes;
                if (strMessage.EndsWith("?wsdl"))
                {
                    aResponseBytes = getWSDL();
                }
                else
                {
                    aResponseBytes = getResponse(strMessage);
                }

                writeResponse(aResponseBytes);
                _context.Response.ContentLength64 = aResponseBytes.Length;
                _context.Response.OutputStream.Write(aResponseBytes, 0, aResponseBytes.Length);
                _context.Response.OutputStream.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Worker Error: " + e.Message);
            }
        }

        private byte[] getResponse(String strMessage)
        {            
            StringBuilder sb = new StringBuilder();
            sb.Append("<message>" + strMessage + "</message>");

            sb.Append("<headers>");
            foreach (String strKey in _context.Request.Headers.Keys)
            {
                sb.Append("<header>");
                String strValue = _context.Request.Headers[strKey];
                Console.WriteLine(strKey + ": " + strValue);

                if (strKey.Equals("content-type", StringComparison.OrdinalIgnoreCase) && strValue.Contains("charset"))
                {
                    String strEncoding = strValue.Substring(strValue.IndexOf("charset") + 7).Replace('=', ' ').Trim();
                    _encoding = System.Text.Encoding.GetEncoding(strEncoding);
                }


                sb.Append("<name>" + strKey + "</name>");
                sb.Append("<value>" + strValue + "</value>");
                sb.Append("</header>");
            }
            sb.Append("</headers>");

            byte[] aBytes = getRequestData();

            //check for BOM for UTF-16
            if (_encoding is UnicodeEncoding && aBytes.Length > 1)
            {
                if (aBytes[0] == 0xFE && aBytes[1] == 0xFF)
                    _encoding = new System.Text.UnicodeEncoding(true, true);
                else if(aBytes[0] == 0xFF && aBytes[1] == 0xFE)
                    _encoding = new System.Text.UnicodeEncoding(false, true);
            }            
            
            writeRequest(aBytes);
            String strRequest = _encoding.GetString(aBytes);

            Console.WriteLine(strRequest);

            sb.Append("<request><![CDATA[")
                .Append(strRequest)
                .Append("]]></request>");

            //look to see if it was a SOAP request, and if so return a SOAP response

            String strContent = sb.ToString();
            StringBuilder sbWrapped = new StringBuilder();

            if (strRequest.Contains("http://schemas.xmlsoap.org/soap/envelope/"))
            {
                sbWrapped.Append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:gds=\"http://gdslink.com/\">\n");
                sbWrapped.Append("  <soapenv:Header/>\n");
                sbWrapped.Append("    <soapenv:Body>\n");
                sbWrapped.Append("       <gds:ReflectResponse>\n");
                sbWrapped.Append("          <gds:ReflectResult>");
                sbWrapped.Append(sb.ToString());
                sbWrapped.Append("</gds:ReflectResult>\n");
                sbWrapped.Append("    </gds:ReflectResponse>\n");
                sbWrapped.Append("  </soapenv:Body>\n");
                sbWrapped.Append("</soapenv:Envelope>");
            }
            else
            {
                sbWrapped.Append("<?xml version=\"1.0\"?><response>");
                sbWrapped.Append(sb.ToString());
                sbWrapped.Append("</response>");
            }

            return _encoding.GetBytes(sbWrapped.ToString());
        }

        private byte[] getRequestData()
        {
            int iContentLength = -1;
            if (_context.Request.Headers["Content-Length"] != null)
                iContentLength = Int32.Parse(_context.Request.Headers["Content-Length"]);

            byte[] aBytes;

            if (iContentLength > 0)
            {
                aBytes = new byte[iContentLength];
                _context.Request.InputStream.Read(aBytes, 0, iContentLength);
            }
            else
            {
                List<byte> listBytes = new List<byte>();
                int b = -1;
                do
                {
                    b = _context.Request.InputStream.ReadByte();
                    if (b != -1)
                        listBytes.Add((byte)b);
                }
                while (b != -1);

                aBytes = listBytes.ToArray();
            }

            return aBytes;
        }

        private void writeResponse(byte[] aBytes)
        {
            writeFile("response_", aBytes);
        }

        private void writeRequest(byte[] aBytes)
        {
            writeFile("request_", aBytes);
        }

        private void writeFile(String strPrefix, byte[] aBytes)
        {
            DateTime time = DateTime.Now;

            StringBuilder strFilename = new StringBuilder();
            strFilename.Append("c:\\arfs\\")
                .Append("reflector_")
                .Append(time.Year).Append(time.Month).Append(time.Day).Append("_")
                .Append(time.Hour).Append(time.Minute).Append(time.Second).Append(time.Millisecond)
                .Append(strPrefix).Append(".txt");

            try
            {
                using (FileStream file = File.Create(strFilename.ToString(), 1024, FileOptions.WriteThrough))
                {
                    file.Write(aBytes, 0, aBytes.Length);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error creating file " + e.Message);               
            }
            
        }

        private byte[] getWSDL()
        {
            String strWSDL = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                                "<wsdl:definitions xmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" xmlns:tm=\"http://microsoft.com/wsdl/mime/textMatching/\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:mime=\"http://schemas.xmlsoap.org/wsdl/mime/\" xmlns:tns=\"http://gdslink.com/\" xmlns:s=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://schemas.xmlsoap.org/wsdl/soap12/\" xmlns:http=\"http://schemas.xmlsoap.org/wsdl/http/\" targetNamespace=\"http://gdslink.com/\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\">" +
                                "  <wsdl:types>" +
                                "    <s:schema elementFormDefault=\"qualified\" targetNamespace=\"http://gdslink.com/\">" +
                                "      <s:element name=\"Reflect\">" +
                                "        <s:complexType>" +
                                "          <s:sequence>" +
                                "            <s:element minOccurs=\"0\" maxOccurs=\"1\" name=\"Request\" type=\"s:string\" />" +
                                "          </s:sequence>" +
                                "        </s:complexType>" +
                                "      </s:element>" +
                                "      <s:element name=\"ReflectResponse\">" +
                                "        <s:complexType>" +
                                "          <s:sequence>" +
                                "            <s:element minOccurs=\"0\" maxOccurs=\"1\" name=\"ReflectResult\" type=\"s:string\" />" +
                                "          </s:sequence>" +
                                "        </s:complexType>" +
                                "      </s:element>" +
                                "    </s:schema>" +
                                "  </wsdl:types>" +
                                "  <wsdl:message name=\"ReflectSoapIn\">" +
                                "    <wsdl:part name=\"parameters\" element=\"tns:Reflect\" />" +
                                "  </wsdl:message>" +
                                "  <wsdl:message name=\"ReflectSoapOut\">" +
                                "    <wsdl:part name=\"parameters\" element=\"tns:ReflectResponse\" />" +
                                "  </wsdl:message>" +
                                "  <wsdl:portType name=\"ReflectorSoap\">" +
                                "    <wsdl:operation name=\"Reflect\">" +
                                "      <wsdl:input message=\"tns:ReflectSoapIn\" />" +
                                "      <wsdl:output message=\"tns:ReflectSoapOut\" />" +
                                "    </wsdl:operation>" +
                                "  </wsdl:portType>" +
                                "  <wsdl:binding name=\"ReflectorSoap\" type=\"tns:ReflectorSoap\">" +
                                "    <soap:binding transport=\"http://schemas.xmlsoap.org/soap/http\" />" +
                                "    <wsdl:operation name=\"Reflect\">" +
                                "      <soap:operation soapAction=\"http://gdslink.com/Reflect\" style=\"document\" />" +
                                "      <wsdl:input>" +
                                "        <soap:body use=\"literal\" />" +
                                "      </wsdl:input>" +
                                "      <wsdl:output>" +
                                "        <soap:body use=\"literal\" />" +
                                "      </wsdl:output>" +
                                "    </wsdl:operation>" +
                                "  </wsdl:binding>" +
                                "  <wsdl:binding name=\"ReflectorSoap12\" type=\"tns:ReflectorSoap\">" +
                                "    <soap12:binding transport=\"http://schemas.xmlsoap.org/soap/http\" />" +
                                "    <wsdl:operation name=\"Reflect\">" +
                                "      <soap12:operation soapAction=\"http://gdslink.com/Reflect\" style=\"document\" />" +
                                "      <wsdl:input>" +
                                "        <soap12:body use=\"literal\" />" +
                                "      </wsdl:input>" +
                                "      <wsdl:output>" +
                                "        <soap12:body use=\"literal\" />" +
                                "      </wsdl:output>" +
                                "    </wsdl:operation>" +
                                "  </wsdl:binding>" +
                                "  <wsdl:service name=\"Reflector\">" +
                                "    <wsdl:port name=\"ReflectorSoap\" binding=\"tns:ReflectorSoap\">" +
                                "      <soap:address location=\"http://localhost:52523/Reflector.asmx\" />" +
                                "    </wsdl:port>" +
                                "    <wsdl:port name=\"ReflectorSoap12\" binding=\"tns:ReflectorSoap12\">" +
                                "      <soap12:address location=\"http://localhost:52523/Reflector.asmx\" />" +
                                "    </wsdl:port>" +
                                "  </wsdl:service>" +
                                "</wsdl:definitions>";

            return Encoding.UTF8.GetBytes(strWSDL);
        }
    }
}