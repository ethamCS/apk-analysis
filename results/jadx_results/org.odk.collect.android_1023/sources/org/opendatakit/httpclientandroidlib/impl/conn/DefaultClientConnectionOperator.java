package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator;
import org.opendatakit.httpclientandroidlib.conn.DnsResolver;
import org.opendatakit.httpclientandroidlib.conn.HttpHostConnectException;
import org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.scheme.Scheme;
import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeLayeredSocketFactory;
import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeRegistry;
import org.opendatakit.httpclientandroidlib.params.HttpConnectionParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@ThreadSafe
/* loaded from: classes.dex */
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final DnsResolver dnsResolver;
    private final Log log = LogFactory.getLog(getClass());
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemes) {
        if (schemes == null) {
            throw new IllegalArgumentException("Scheme registry amy not be null");
        }
        this.schemeRegistry = schemes;
        this.dnsResolver = new SystemDefaultDnsResolver();
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemes, DnsResolver dnsResolver) {
        if (schemes == null) {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
        if (dnsResolver == null) {
            throw new IllegalArgumentException("DNS resolver may not be null");
        }
        this.schemeRegistry = schemes;
        this.dnsResolver = dnsResolver;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openConnection(org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection r19, org.opendatakit.httpclientandroidlib.HttpHost r20, java.net.InetAddress r21, org.opendatakit.httpclientandroidlib.protocol.HttpContext r22, org.opendatakit.httpclientandroidlib.params.HttpParams r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.impl.conn.DefaultClientConnectionOperator.openConnection(org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection, org.opendatakit.httpclientandroidlib.HttpHost, java.net.InetAddress, org.opendatakit.httpclientandroidlib.protocol.HttpContext, org.opendatakit.httpclientandroidlib.params.HttpParams):void");
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection conn, HttpHost target, HttpContext context, HttpParams params) throws IOException {
        if (conn == null) {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (target == null) {
            throw new IllegalArgumentException("Target host may not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        if (!conn.isOpen()) {
            throw new IllegalStateException("Connection must be open");
        }
        Scheme schm = this.schemeRegistry.getScheme(target.getSchemeName());
        if (!(schm.getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory)) {
            throw new IllegalArgumentException("Target scheme (" + schm.getName() + ") must have layered socket factory.");
        }
        SchemeLayeredSocketFactory lsf = (SchemeLayeredSocketFactory) schm.getSchemeSocketFactory();
        try {
            Socket sock = lsf.createLayeredSocket(conn.getSocket(), target.getHostName(), schm.resolvePort(target.getPort()), params);
            prepareSocket(sock, context, params);
            conn.update(sock, target, lsf.isSecure(sock), params);
        } catch (ConnectException ex) {
            throw new HttpHostConnectException(target, ex);
        }
    }

    protected void prepareSocket(Socket sock, HttpContext context, HttpParams params) throws IOException {
        sock.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(params));
        sock.setSoTimeout(HttpConnectionParams.getSoTimeout(params));
        int linger = HttpConnectionParams.getLinger(params);
        if (linger >= 0) {
            sock.setSoLinger(linger > 0, linger);
        }
    }

    protected InetAddress[] resolveHostname(String host) throws UnknownHostException {
        return this.dnsResolver.resolve(host);
    }
}
