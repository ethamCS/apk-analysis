package org.opendatakit.httpclientandroidlib.impl.client;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.opendatakit.httpclientandroidlib.ConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpRequestInterceptor;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.auth.AuthSchemeRegistry;
import org.opendatakit.httpclientandroidlib.auth.AuthScope;
import org.opendatakit.httpclientandroidlib.auth.AuthState;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.client.params.AuthPolicy;
import org.opendatakit.httpclientandroidlib.client.params.HttpClientParams;
import org.opendatakit.httpclientandroidlib.client.protocol.ClientContext;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestClientConnControl;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestProxyAuthentication;
import org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.entity.BufferedHttpEntity;
import org.opendatakit.httpclientandroidlib.impl.DefaultConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.impl.DefaultHttpClientConnection;
import org.opendatakit.httpclientandroidlib.impl.auth.BasicSchemeFactory;
import org.opendatakit.httpclientandroidlib.impl.auth.DigestSchemeFactory;
import org.opendatakit.httpclientandroidlib.impl.auth.NTLMSchemeFactory;
import org.opendatakit.httpclientandroidlib.message.BasicHttpRequest;
import org.opendatakit.httpclientandroidlib.params.BasicHttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpProtocolParams;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext;
import org.opendatakit.httpclientandroidlib.protocol.ExecutionContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpProcessor;
import org.opendatakit.httpclientandroidlib.protocol.HttpRequestExecutor;
import org.opendatakit.httpclientandroidlib.protocol.ImmutableHttpProcessor;
import org.opendatakit.httpclientandroidlib.protocol.RequestContent;
import org.opendatakit.httpclientandroidlib.protocol.RequestTargetHost;
import org.opendatakit.httpclientandroidlib.protocol.RequestUserAgent;
import org.opendatakit.httpclientandroidlib.util.EntityUtils;
/* loaded from: classes.dex */
public class ProxyClient {
    private final AuthSchemeRegistry authSchemeRegistry;
    private final HttpAuthenticator authenticator;
    private final HttpProcessor httpProcessor;
    private final HttpParams params;
    private final AuthState proxyAuthState;
    private final ProxyAuthenticationStrategy proxyAuthStrategy;
    private final HttpRequestExecutor requestExec;
    private final ConnectionReuseStrategy reuseStrategy;

    public ProxyClient(HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.httpProcessor = new ImmutableHttpProcessor(new HttpRequestInterceptor[]{new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(), new RequestProxyAuthentication()});
        this.requestExec = new HttpRequestExecutor();
        this.proxyAuthStrategy = new ProxyAuthenticationStrategy();
        this.authenticator = new HttpAuthenticator();
        this.proxyAuthState = new AuthState();
        this.authSchemeRegistry = new AuthSchemeRegistry();
        this.authSchemeRegistry.register(AuthPolicy.BASIC, new BasicSchemeFactory());
        this.authSchemeRegistry.register(AuthPolicy.DIGEST, new DigestSchemeFactory());
        this.authSchemeRegistry.register(AuthPolicy.NTLM, new NTLMSchemeFactory());
        this.reuseStrategy = new DefaultConnectionReuseStrategy();
        this.params = params;
    }

    public ProxyClient() {
        this(new BasicHttpParams());
    }

    public HttpParams getParams() {
        return this.params;
    }

    public AuthSchemeRegistry getAuthSchemeRegistry() {
        return this.authSchemeRegistry;
    }

    public Socket tunnel(HttpHost proxy, HttpHost target, Credentials credentials) throws IOException, HttpException {
        HttpResponse response;
        ProxyConnection conn = new ProxyConnection(new HttpRoute(proxy));
        HttpContext context = new BasicHttpContext();
        while (true) {
            if (!conn.isOpen()) {
                Socket socket = new Socket(proxy.getHostName(), proxy.getPort());
                conn.bind(socket, this.params);
            }
            String host = target.getHostName();
            int port = target.getPort();
            if (port < 0) {
                port = 80;
            }
            StringBuilder buffer = new StringBuilder(host.length() + 6);
            buffer.append(host);
            buffer.append(':');
            buffer.append(Integer.toString(port));
            String authority = buffer.toString();
            ProtocolVersion ver = HttpProtocolParams.getVersion(this.params);
            HttpRequest connect = new BasicHttpRequest("CONNECT", authority, ver);
            connect.setParams(this.params);
            BasicCredentialsProvider credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(new AuthScope(proxy), credentials);
            context.setAttribute(ExecutionContext.HTTP_TARGET_HOST, target);
            context.setAttribute(ExecutionContext.HTTP_PROXY_HOST, proxy);
            context.setAttribute(ExecutionContext.HTTP_CONNECTION, conn);
            context.setAttribute(ExecutionContext.HTTP_REQUEST, connect);
            context.setAttribute(ClientContext.PROXY_AUTH_STATE, this.proxyAuthState);
            context.setAttribute(ClientContext.CREDS_PROVIDER, credsProvider);
            context.setAttribute(ClientContext.AUTHSCHEME_REGISTRY, this.authSchemeRegistry);
            this.requestExec.preProcess(connect, this.httpProcessor, context);
            response = this.requestExec.execute(connect, conn, context);
            response.setParams(this.params);
            this.requestExec.postProcess(response, this.httpProcessor, context);
            int status = response.getStatusLine().getStatusCode();
            if (status < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + response.getStatusLine());
            }
            if (HttpClientParams.isAuthenticating(this.params)) {
                if (!this.authenticator.isAuthenticationRequested(proxy, response, this.proxyAuthStrategy, this.proxyAuthState, context) || !this.authenticator.authenticate(proxy, response, this.proxyAuthStrategy, this.proxyAuthState, context)) {
                    break;
                } else if (this.reuseStrategy.keepAlive(response, context)) {
                    EntityUtils.consume(response.getEntity());
                } else {
                    conn.close();
                }
            }
        }
        int status2 = response.getStatusLine().getStatusCode();
        if (status2 > 299) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                response.setEntity(new BufferedHttpEntity(entity));
            }
            conn.close();
            throw new TunnelRefusedException("CONNECT refused by proxy: " + response.getStatusLine(), response);
        }
        return conn.getSocket();
    }

    /* loaded from: classes.dex */
    static class ProxyConnection extends DefaultHttpClientConnection implements HttpRoutedConnection {
        private final HttpRoute route;

        ProxyConnection(HttpRoute route) {
            this.route = route;
        }

        @Override // org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
        public HttpRoute getRoute() {
            return this.route;
        }

        @Override // org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
        public boolean isSecure() {
            return false;
        }

        @Override // org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
        public SSLSession getSSLSession() {
            return null;
        }

        @Override // org.opendatakit.httpclientandroidlib.impl.SocketHttpClientConnection
        public Socket getSocket() {
            return super.getSocket();
        }
    }
}
