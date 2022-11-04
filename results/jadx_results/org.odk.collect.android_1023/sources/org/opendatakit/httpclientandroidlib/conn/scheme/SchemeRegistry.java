package org.opendatakit.httpclientandroidlib.conn.scheme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
@ThreadSafe
/* loaded from: classes.dex */
public final class SchemeRegistry {
    private final ConcurrentHashMap<String, Scheme> registeredSchemes = new ConcurrentHashMap<>();

    public final Scheme getScheme(String name) {
        Scheme found = get(name);
        if (found == null) {
            throw new IllegalStateException("Scheme '" + name + "' not registered.");
        }
        return found;
    }

    public final Scheme getScheme(HttpHost host) {
        if (host == null) {
            throw new IllegalArgumentException("Host must not be null.");
        }
        return getScheme(host.getSchemeName());
    }

    public final Scheme get(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null.");
        }
        Scheme found = this.registeredSchemes.get(name);
        return found;
    }

    public final Scheme register(Scheme sch) {
        if (sch == null) {
            throw new IllegalArgumentException("Scheme must not be null.");
        }
        Scheme old = this.registeredSchemes.put(sch.getName(), sch);
        return old;
    }

    public final Scheme unregister(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null.");
        }
        Scheme gone = this.registeredSchemes.remove(name);
        return gone;
    }

    public final List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    public void setItems(Map<String, Scheme> map) {
        if (map != null) {
            this.registeredSchemes.clear();
            this.registeredSchemes.putAll(map);
        }
    }
}
