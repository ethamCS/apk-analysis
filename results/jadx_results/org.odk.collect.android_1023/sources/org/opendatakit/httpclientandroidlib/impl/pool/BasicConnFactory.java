package org.opendatakit.httpclientandroidlib.impl.pool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import org.opendatakit.httpclientandroidlib.HttpClientConnection;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.impl.DefaultHttpClientConnection;
import org.opendatakit.httpclientandroidlib.params.HttpConnectionParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.pool.ConnFactory;
@Immutable
/* loaded from: classes.dex */
public class BasicConnFactory implements ConnFactory<HttpHost, HttpClientConnection> {
    private final HttpParams params;
    private final SSLSocketFactory sslfactory;

    public BasicConnFactory(SSLSocketFactory sslfactory, HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP params may not be null");
        }
        this.sslfactory = sslfactory;
        this.params = params;
    }

    public BasicConnFactory(HttpParams params) {
        this(null, params);
    }

    protected HttpClientConnection create(Socket socket, HttpParams params) throws IOException {
        DefaultHttpClientConnection conn = new DefaultHttpClientConnection();
        conn.bind(socket, params);
        return conn;
    }

    public HttpClientConnection create(HttpHost host) throws IOException {
        String scheme = host.getSchemeName();
        Socket socket = null;
        if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme)) {
            socket = new Socket();
        }
        if ("https".equalsIgnoreCase(scheme) && this.sslfactory != null) {
            socket = this.sslfactory.createSocket();
        }
        if (socket == null) {
            throw new IOException(scheme + " scheme is not supported");
        }
        int connectTimeout = HttpConnectionParams.getConnectionTimeout(this.params);
        int soTimeout = HttpConnectionParams.getSoTimeout(this.params);
        socket.setSoTimeout(soTimeout);
        socket.connect(new InetSocketAddress(host.getHostName(), host.getPort()), connectTimeout);
        return create(socket, this.params);
    }
}
