package org.opendatakit.httpclientandroidlib.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.opendatakit.httpclientandroidlib.HttpHost;
/* loaded from: classes.dex */
public class HttpInetSocketAddress extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    private final HttpHost httphost;

    public HttpInetSocketAddress(HttpHost httphost, InetAddress addr, int port) {
        super(addr, port);
        if (httphost == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.httphost = httphost;
    }

    public HttpHost getHttpHost() {
        return this.httphost;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.httphost.getHostName() + ":" + getPort();
    }
}
