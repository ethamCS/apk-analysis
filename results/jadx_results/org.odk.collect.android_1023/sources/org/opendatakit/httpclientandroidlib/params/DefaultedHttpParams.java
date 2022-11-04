package org.opendatakit.httpclientandroidlib.params;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class DefaultedHttpParams extends AbstractHttpParams {
    private final HttpParams defaults;
    private final HttpParams local;

    public DefaultedHttpParams(HttpParams local, HttpParams defaults) {
        if (local == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.local = local;
        this.defaults = defaults;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    @Deprecated
    public HttpParams copy() {
        HttpParams clone = this.local.copy();
        return new DefaultedHttpParams(clone, this.defaults);
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public Object getParameter(String name) {
        Object obj = this.local.getParameter(name);
        if (obj == null && this.defaults != null) {
            return this.defaults.getParameter(name);
        }
        return obj;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public boolean removeParameter(String name) {
        return this.local.removeParameter(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setParameter(String name, Object value) {
        return this.local.setParameter(name, value);
    }

    @Deprecated
    public HttpParams getDefaults() {
        return this.defaults;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.AbstractHttpParams, org.opendatakit.httpclientandroidlib.params.HttpParamsNames
    public Set<String> getNames() {
        Set<String> combined = new HashSet<>(getNames(this.defaults));
        combined.addAll(getNames(this.local));
        return combined;
    }

    public Set<String> getDefaultNames() {
        return new HashSet(getNames(this.defaults));
    }

    public Set<String> getLocalNames() {
        return new HashSet(getNames(this.local));
    }

    private Set<String> getNames(HttpParams params) {
        if (params instanceof HttpParamsNames) {
            return ((HttpParamsNames) params).getNames();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }
}
