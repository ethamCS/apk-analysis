package org.opendatakit.httpclientandroidlib.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@ThreadSafe
/* loaded from: classes.dex */
public final class AuthSchemeRegistry {
    private final ConcurrentHashMap<String, AuthSchemeFactory> registeredSchemes = new ConcurrentHashMap<>();

    public void register(String name, AuthSchemeFactory factory) {
        if (name == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (factory == null) {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
        this.registeredSchemes.put(name.toLowerCase(Locale.ENGLISH), factory);
    }

    public void unregister(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.registeredSchemes.remove(name.toLowerCase(Locale.ENGLISH));
    }

    public AuthScheme getAuthScheme(String name, HttpParams params) throws IllegalStateException {
        if (name == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        AuthSchemeFactory factory = this.registeredSchemes.get(name.toLowerCase(Locale.ENGLISH));
        if (factory != null) {
            return factory.newInstance(params);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + name);
    }

    public List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    public void setItems(Map<String, AuthSchemeFactory> map) {
        if (map != null) {
            this.registeredSchemes.clear();
            this.registeredSchemes.putAll(map);
        }
    }
}
