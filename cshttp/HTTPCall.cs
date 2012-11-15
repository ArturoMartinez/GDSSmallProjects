using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;

namespace cshttp
{
    public class HTTPCall
    {
        private Settings _settings;
        private  WebResponse _httpResponse;

        public HTTPCall(Settings settings, byte[] aData)
        {
            _settings = settings;
            call(aData);
        }

        public void call(byte[] aData)
        {
            HttpWebRequest httpRequest = createWebRequest();
            httpRequest.AutomaticDecompression = DecompressionMethods.GZip | DecompressionMethods.Deflate;
            httpRequest.ContentLength = aData.Length;
            httpRequest.GetRequestStream().Write(aData, 0, aData.Length);

            _httpResponse = httpRequest.GetResponse();
        }

        public WebResponse getResponse()
        {
            return _httpResponse;
        }

        protected HttpWebRequest createWebRequest()
        {
            HttpWebRequest httpRequest = (HttpWebRequest)WebRequest.Create(_settings.getURL());
            httpRequest.Method = _settings.getMethod();
            httpRequest.Headers.Add("Accept-Encoding", _settings.getAcceptsEncoding());
            httpRequest.Headers.Add("SOAPAction", _settings.getSOAPAction());
            httpRequest.Host = _settings.getHost();
            httpRequest.UserAgent = _settings.getUserAgent();
            httpRequest.ContentType = _settings.getContentType();
            return httpRequest;
        }

    }
}
