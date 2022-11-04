package org.opendatakit.httpclientandroidlib.conn.routing;

import java.net.InetAddress;
import org.opendatakit.httpclientandroidlib.HttpHost;
/* loaded from: classes.dex */
public interface RouteInfo {

    /* loaded from: classes.dex */
    public enum LayerType {
        PLAIN,
        LAYERED
    }

    /* loaded from: classes.dex */
    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }

    int getHopCount();

    HttpHost getHopTarget(int i);

    LayerType getLayerType();

    InetAddress getLocalAddress();

    HttpHost getProxyHost();

    HttpHost getTargetHost();

    TunnelType getTunnelType();

    boolean isLayered();

    boolean isSecure();

    boolean isTunnelled();
}
