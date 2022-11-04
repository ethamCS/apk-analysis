package org.opendatakit.httpclientandroidlib.client.protocol;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpRequestInterceptor;
import org.opendatakit.httpclientandroidlib.ProtocolException;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.CookieStore;
import org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest;
import org.opendatakit.httpclientandroidlib.client.params.HttpClientParams;
import org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieOrigin;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpec;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpecRegistry;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie2;
import org.opendatakit.httpclientandroidlib.protocol.ExecutionContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    @Override // org.opendatakit.httpclientandroidlib.HttpRequestInterceptor
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
        URI requestURI;
        Header header;
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (context == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        String method = request.getRequestLine().getMethod();
        if (!method.equalsIgnoreCase("CONNECT")) {
            CookieStore cookieStore = (CookieStore) context.getAttribute(ClientContext.COOKIE_STORE);
            if (cookieStore == null) {
                this.log.debug("Cookie store not specified in HTTP context");
                return;
            }
            CookieSpecRegistry registry = (CookieSpecRegistry) context.getAttribute(ClientContext.COOKIESPEC_REGISTRY);
            if (registry == null) {
                this.log.debug("CookieSpec registry not specified in HTTP context");
                return;
            }
            HttpHost targetHost = (HttpHost) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
            if (targetHost == null) {
                this.log.debug("Target host not set in the context");
                return;
            }
            HttpRoutedConnection conn = (HttpRoutedConnection) context.getAttribute(ExecutionContext.HTTP_CONNECTION);
            if (conn == null) {
                this.log.debug("HTTP connection not set in the context");
                return;
            }
            String policy = HttpClientParams.getCookiePolicy(request.getParams());
            if (this.log.isDebugEnabled()) {
                this.log.debug("CookieSpec selected: " + policy);
            }
            if (request instanceof HttpUriRequest) {
                requestURI = ((HttpUriRequest) request).getURI();
            } else {
                try {
                    requestURI = new URI(request.getRequestLine().getUri());
                } catch (URISyntaxException ex) {
                    throw new ProtocolException("Invalid request URI: " + request.getRequestLine().getUri(), ex);
                }
            }
            String hostName = targetHost.getHostName();
            int port = targetHost.getPort();
            if (port < 0) {
                HttpRoute route = conn.getRoute();
                if (route.getHopCount() == 1) {
                    port = conn.getRemotePort();
                } else {
                    String scheme = targetHost.getSchemeName();
                    if (scheme.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
                        port = 80;
                    } else if (scheme.equalsIgnoreCase("https")) {
                        port = 443;
                    } else {
                        port = 0;
                    }
                }
            }
            CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, requestURI.getPath(), conn.isSecure());
            CookieSpec cookieSpec = registry.getCookieSpec(policy, request.getParams());
            List<Cookie> cookies = new ArrayList<>(cookieStore.getCookies());
            List<Cookie> matchedCookies = new ArrayList<>();
            Date now = new Date();
            for (Cookie cookie : cookies) {
                if (!cookie.isExpired(now)) {
                    if (cookieSpec.match(cookie, cookieOrigin)) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Cookie " + cookie + " match " + cookieOrigin);
                        }
                        matchedCookies.add(cookie);
                    }
                } else if (this.log.isDebugEnabled()) {
                    this.log.debug("Cookie " + cookie + " expired");
                }
            }
            if (!matchedCookies.isEmpty()) {
                List<Header> headers = cookieSpec.formatCookies(matchedCookies);
                for (Header header2 : headers) {
                    request.addHeader(header2);
                }
            }
            int ver = cookieSpec.getVersion();
            if (ver > 0) {
                boolean needVersionHeader = false;
                for (Cookie cookie2 : matchedCookies) {
                    if (ver != cookie2.getVersion() || !(cookie2 instanceof SetCookie2)) {
                        needVersionHeader = true;
                    }
                }
                if (needVersionHeader && (header = cookieSpec.getVersionHeader()) != null) {
                    request.addHeader(header);
                }
            }
            context.setAttribute(ClientContext.COOKIE_SPEC, cookieSpec);
            context.setAttribute(ClientContext.COOKIE_ORIGIN, cookieOrigin);
        }
    }
}
