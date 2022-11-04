package org.opendatakit.httpclientandroidlib.impl.client;

import java.net.ProxySelector;
import org.opendatakit.httpclientandroidlib.ConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoutePlanner;
import org.opendatakit.httpclientandroidlib.impl.DefaultConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.impl.NoConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.impl.conn.PoolingClientConnectionManager;
import org.opendatakit.httpclientandroidlib.impl.conn.ProxySelectorRoutePlanner;
import org.opendatakit.httpclientandroidlib.impl.conn.SchemeRegistryFactory;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@ThreadSafe
/* loaded from: classes.dex */
public class SystemDefaultHttpClient extends DefaultHttpClient {
    public SystemDefaultHttpClient(HttpParams params) {
        super(null, params);
    }

    public SystemDefaultHttpClient() {
        super(null, null);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    protected ClientConnectionManager createClientConnectionManager() {
        PoolingClientConnectionManager connmgr = new PoolingClientConnectionManager(SchemeRegistryFactory.createSystemDefault());
        String s = System.getProperty("http.keepAlive");
        if ("true".equalsIgnoreCase(s)) {
            String s2 = System.getProperty("http.maxConnections", "5");
            int max = Integer.parseInt(s2);
            connmgr.setDefaultMaxPerRoute(max);
            connmgr.setMaxTotal(max * 2);
        }
        return connmgr;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    protected HttpRoutePlanner createHttpRoutePlanner() {
        return new ProxySelectorRoutePlanner(getConnectionManager().getSchemeRegistry(), ProxySelector.getDefault());
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    protected ConnectionReuseStrategy createConnectionReuseStrategy() {
        String s = System.getProperty("http.keepAlive");
        return "true".equalsIgnoreCase(s) ? new DefaultConnectionReuseStrategy() : new NoConnectionReuseStrategy();
    }
}
