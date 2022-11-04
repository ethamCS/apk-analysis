package org.opendatakit.httpclientandroidlib.client.protocol;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpRequestInterceptor;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.protocol.ExecutionContext;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class RequestClientConnControl implements HttpRequestInterceptor {
    private static final String PROXY_CONN_DIRECTIVE = "Proxy-Connection";
    private final Log log = LogFactory.getLog(getClass());

    @Override // org.opendatakit.httpclientandroidlib.HttpRequestInterceptor
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        String method = request.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("CONNECT")) {
            request.setHeader(PROXY_CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            return;
        }
        HttpRoutedConnection conn = (HttpRoutedConnection) context.getAttribute(ExecutionContext.HTTP_CONNECTION);
        if (conn == null) {
            this.log.debug("HTTP connection not set in the context");
            return;
        }
        HttpRoute route = conn.getRoute();
        if ((route.getHopCount() == 1 || route.isTunnelled()) && !request.containsHeader("Connection")) {
            request.addHeader("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        if (route.getHopCount() == 2 && !route.isTunnelled() && !request.containsHeader(PROXY_CONN_DIRECTIVE)) {
            request.addHeader(PROXY_CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
        }
    }
}
