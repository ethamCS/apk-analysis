package org.opendatakit.httpclientandroidlib.impl.client;

import java.util.HashMap;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.auth.AuthScheme;
import org.opendatakit.httpclientandroidlib.client.AuthCache;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicAuthCache implements AuthCache {
    private final HashMap<HttpHost, AuthScheme> map = new HashMap<>();

    @Override // org.opendatakit.httpclientandroidlib.client.AuthCache
    public void put(HttpHost host, AuthScheme authScheme) {
        if (host == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.map.put(host, authScheme);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.AuthCache
    public AuthScheme get(HttpHost host) {
        if (host == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        return this.map.get(host);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.AuthCache
    public void remove(HttpHost host) {
        if (host == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.map.remove(host);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.AuthCache
    public void clear() {
        this.map.clear();
    }

    public String toString() {
        return this.map.toString();
    }
}
