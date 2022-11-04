package org.opendatakit.httpclientandroidlib.conn.routing;

import java.net.InetAddress;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo;
import org.opendatakit.httpclientandroidlib.util.LangUtils;
@Immutable
/* loaded from: classes.dex */
public final class HttpRoute implements RouteInfo, Cloneable {
    private static final HttpHost[] EMPTY_HTTP_HOST_ARRAY = new HttpHost[0];
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost[] proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    private HttpRoute(InetAddress local, HttpHost target, HttpHost[] proxies, boolean secure, RouteInfo.TunnelType tunnelled, RouteInfo.LayerType layered) {
        if (target == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (proxies == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        }
        if (tunnelled == RouteInfo.TunnelType.TUNNELLED && proxies.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        }
        tunnelled = tunnelled == null ? RouteInfo.TunnelType.PLAIN : tunnelled;
        layered = layered == null ? RouteInfo.LayerType.PLAIN : layered;
        this.targetHost = target;
        this.localAddress = local;
        this.proxyChain = proxies;
        this.secure = secure;
        this.tunnelled = tunnelled;
        this.layered = layered;
    }

    public HttpRoute(HttpHost target, InetAddress local, HttpHost[] proxies, boolean secure, RouteInfo.TunnelType tunnelled, RouteInfo.LayerType layered) {
        this(local, target, toChain(proxies), secure, tunnelled, layered);
    }

    public HttpRoute(HttpHost target, InetAddress local, HttpHost proxy, boolean secure, RouteInfo.TunnelType tunnelled, RouteInfo.LayerType layered) {
        this(local, target, toChain(proxy), secure, tunnelled, layered);
    }

    public HttpRoute(HttpHost target, InetAddress local, boolean secure) {
        this(local, target, EMPTY_HTTP_HOST_ARRAY, secure, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost target) {
        this((InetAddress) null, target, EMPTY_HTTP_HOST_ARRAY, false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost target, InetAddress local, HttpHost proxy, boolean secure) {
        this(local, target, toChain(proxy), secure, secure ? RouteInfo.TunnelType.TUNNELLED : RouteInfo.TunnelType.PLAIN, secure ? RouteInfo.LayerType.LAYERED : RouteInfo.LayerType.PLAIN);
        if (proxy == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
    }

    private static HttpHost[] toChain(HttpHost proxy) {
        return proxy == null ? EMPTY_HTTP_HOST_ARRAY : new HttpHost[]{proxy};
    }

    private static HttpHost[] toChain(HttpHost[] proxies) {
        if (proxies == null || proxies.length < 1) {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        for (HttpHost proxy : proxies) {
            if (proxy == null) {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        HttpHost[] result = new HttpHost[proxies.length];
        System.arraycopy(proxies, 0, result, 0, proxies.length);
        return result;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final int getHopCount() {
        return this.proxyChain.length + 1;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final HttpHost getHopTarget(int hop) {
        if (hop < 0) {
            throw new IllegalArgumentException("Hop index must not be negative: " + hop);
        }
        int hopcount = getHopCount();
        if (hop >= hopcount) {
            throw new IllegalArgumentException("Hop index " + hop + " exceeds route length " + hopcount);
        }
        if (hop < hopcount - 1) {
            HttpHost result = this.proxyChain[hop];
            return result;
        }
        HttpHost result2 = this.targetHost;
        return result2;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final HttpHost getProxyHost() {
        if (this.proxyChain.length == 0) {
            return null;
        }
        return this.proxyChain[0];
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.routing.RouteInfo
    public final boolean isSecure() {
        return this.secure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute that = (HttpRoute) obj;
        return this.secure == that.secure && this.tunnelled == that.tunnelled && this.layered == that.layered && LangUtils.equals(this.targetHost, that.targetHost) && LangUtils.equals(this.localAddress, that.localAddress) && LangUtils.equals((Object[]) this.proxyChain, (Object[]) that.proxyChain);
    }

    public final int hashCode() {
        int hash = LangUtils.hashCode(17, this.targetHost);
        int hash2 = LangUtils.hashCode(hash, this.localAddress);
        for (int i = 0; i < this.proxyChain.length; i++) {
            hash2 = LangUtils.hashCode(hash2, this.proxyChain[i]);
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hash2, this.secure), this.tunnelled), this.layered);
    }

    public final String toString() {
        StringBuilder cab = new StringBuilder((getHopCount() * 30) + 50);
        if (this.localAddress != null) {
            cab.append(this.localAddress);
            cab.append("->");
        }
        cab.append('{');
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            cab.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            cab.append('l');
        }
        if (this.secure) {
            cab.append('s');
        }
        cab.append("}->");
        HttpHost[] arr$ = this.proxyChain;
        for (HttpHost aProxyChain : arr$) {
            cab.append(aProxyChain);
            cab.append("->");
        }
        cab.append(this.targetHost);
        return cab.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
