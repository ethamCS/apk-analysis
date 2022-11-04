package org.opendatakit.httpclientandroidlib.params;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final HashMap<String, Object> parameters = new HashMap<>();

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public Object getParameter(String name) {
        return this.parameters.get(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setParameter(String name, Object value) {
        this.parameters.put(name, value);
        return this;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public boolean removeParameter(String name) {
        if (this.parameters.containsKey(name)) {
            this.parameters.remove(name);
            return true;
        }
        return false;
    }

    public void setParameters(String[] names, Object value) {
        for (String str : names) {
            setParameter(str, value);
        }
    }

    public boolean isParameterSet(String name) {
        return getParameter(name) != null;
    }

    public boolean isParameterSetLocally(String name) {
        return this.parameters.get(name) != null;
    }

    public void clear() {
        this.parameters.clear();
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    @Deprecated
    public HttpParams copy() {
        try {
            return (HttpParams) clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpParams clone = (BasicHttpParams) super.clone();
        copyParams(clone);
        return clone;
    }

    public void copyParams(HttpParams target) {
        for (Map.Entry<String, Object> me2 : this.parameters.entrySet()) {
            if (me2.getKey() instanceof String) {
                target.setParameter(me2.getKey(), me2.getValue());
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.params.AbstractHttpParams, org.opendatakit.httpclientandroidlib.params.HttpParamsNames
    public Set<String> getNames() {
        return new HashSet(this.parameters.keySet());
    }
}
