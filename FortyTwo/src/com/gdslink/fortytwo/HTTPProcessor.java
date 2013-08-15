/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdslink.fortytwo;

import com.gdslink.fortytwo.generators.Generator;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.DefaultBHttpServerConnectionFactory;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;
import org.apache.http.protocol.ResponseDate;
import org.apache.http.protocol.ResponseServer;
import org.apache.http.protocol.UriHttpRequestHandlerMapper;

/**
 *
 * @author simon.smith
 */
public abstract class HTTPProcessor extends Processor implements HttpRequestHandler
{
    private static final Logger log = Logger.getLogger(HTTPProcessor.class.getName());

    private HttpRequest _httpRequest;
    private HttpResponse _httpResponse;
    private HttpContext _httpContext;

    public HTTPProcessor(Socket clientSocket, Settings settings, Generator generator)
    {
        super(clientSocket, settings, generator);
    }

    protected HttpRequest getHttpRequest()
    {
        return _httpRequest;
    }

    protected HttpResponse getHttpResponse()
    {
        return _httpResponse;
    }

    protected HttpContext getHttpContext()
    {
        return _httpContext;
    }

    @Override
    public void handleConnection() throws Exception
    {
        HttpServerConnection conn = DefaultBHttpServerConnectionFactory.INSTANCE.createConnection(getSocket());
        try
        {
            HttpProcessor httpProc = HttpProcessorBuilder.create()
                .add(new ResponseDate())
                .add(new ResponseServer("FortyTwo v1.0"))
                .add(new ResponseContent())
                .add(new ResponseConnControl()).build();
            
            UriHttpRequestHandlerMapper requestMapper = new UriHttpRequestHandlerMapper();
            requestMapper.register("*", this);
            HttpService httpService = new HttpService(httpProc, requestMapper);                        
            
            HttpContext context = new BasicHttpContext(null);
            while(conn.isOpen())         
            {
                httpService.handleRequest(conn, context);
            }
        }
        catch (ConnectionClosedException ex)
        {
            log.log(Level.FINE, "Client closed connection", ex);
        }
        catch (IOException ex)
        {
            log.log(Level.WARNING, "I/O error: ", ex);
            throw ex;
        }
        catch (HttpException ex)
        {
            log.log(Level.WARNING, "Unrecoverable HTTP protocol violation: ", ex);
            throw ex;
        }
        finally
        {
            try
            {
                conn.shutdown();
            }
            catch (IOException ignore) {}
        }
    }

    @Override
    public void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException
    {
        _httpRequest = httpRequest;
        _httpResponse = httpResponse;
        _httpContext = httpContext;

        try
        {
            String strKey = getInputKey();
            byte[] aResponseData = getResponseData(strKey);
            sendResponse(aResponseData);
        }
        catch(Exception e)
        {
            log.log(Level.WARNING, "Failed to handle transaction", e);
            sendErrorResponse(e.getMessage());
        }
    }

    //this is likely to be the same for most of the http processors
    @Override
    protected void sendResponse(byte[] aResponseData) throws Exception
    {
        _httpResponse.setStatusCode(HttpStatus.SC_OK);

        StringEntity entityResponse = new StringEntity(
                    new String(aResponseData, Charset.forName("UTF-8")),
                    ContentType.create("text/html", "UTF-8"));

        _httpResponse.setEntity(entityResponse);
    }

}
