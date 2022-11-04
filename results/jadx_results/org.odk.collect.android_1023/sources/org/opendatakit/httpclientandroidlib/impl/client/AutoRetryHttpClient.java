package org.opendatakit.httpclientandroidlib.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.client.ResponseHandler;
import org.opendatakit.httpclientandroidlib.client.ServiceUnavailableRetryStrategy;
import org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@ThreadSafe
/* loaded from: classes.dex */
public class AutoRetryHttpClient implements HttpClient {
    private final HttpClient backend;
    private final Log log;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public AutoRetryHttpClient(HttpClient client, ServiceUnavailableRetryStrategy retryStrategy) {
        this.log = LogFactory.getLog(getClass());
        if (client == null) {
            throw new IllegalArgumentException("HttpClient may not be null");
        }
        if (retryStrategy == null) {
            throw new IllegalArgumentException("ServiceUnavailableRetryStrategy may not be null");
        }
        this.backend = client;
        this.retryStrategy = retryStrategy;
    }

    public AutoRetryHttpClient() {
        this(new DefaultHttpClient(), new DefaultServiceUnavailableRetryStrategy());
    }

    public AutoRetryHttpClient(ServiceUnavailableRetryStrategy config) {
        this(new DefaultHttpClient(), config);
    }

    public AutoRetryHttpClient(HttpClient client) {
        this(client, new DefaultServiceUnavailableRetryStrategy());
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpHost target, HttpRequest request) throws IOException {
        return execute(target, request, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(target, request, responseHandler, null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException {
        HttpResponse resp = execute(target, request, context);
        return responseHandler.handleResponse(resp);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpUriRequest request) throws IOException {
        return execute(request, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException {
        URI uri = request.getURI();
        HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        return execute(httpHost, request, context);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(request, responseHandler, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException {
        HttpResponse resp = execute(request, context);
        return responseHandler.handleResponse(resp);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
        int c = 1;
        while (true) {
            HttpResponse response = this.backend.execute(target, request, context);
            if (this.retryStrategy.retryRequest(response, c, context)) {
                long nextInterval = this.retryStrategy.getRetryInterval();
                try {
                    this.log.trace("Wait for " + nextInterval);
                    Thread.sleep(nextInterval);
                    c++;
                } catch (InterruptedException e) {
                    throw new InterruptedIOException(e.getMessage());
                }
            } else {
                return response;
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.backend.getConnectionManager();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpParams getParams() {
        return this.backend.getParams();
    }
}
