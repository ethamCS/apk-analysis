package org.opendatakit.httpclientandroidlib.protocol;

import java.util.HashMap;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicHttpContext implements HttpContext {
    private Map<String, Object> map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this(null);
    }

    public BasicHttpContext(HttpContext parentContext) {
        this.map = null;
        this.parentContext = parentContext;
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public Object getAttribute(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = null;
        if (this.map != null) {
            obj = this.map.get(id);
        }
        if (obj == null && this.parentContext != null) {
            return this.parentContext.getAttribute(id);
        }
        return obj;
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public void setAttribute(String id, Object obj) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.map == null) {
            this.map = new HashMap();
        }
        this.map.put(id, obj);
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public Object removeAttribute(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.map == null) {
            return null;
        }
        return this.map.remove(id);
    }

    public void clear() {
        if (this.map != null) {
            this.map.clear();
        }
    }

    public String toString() {
        return this.map != null ? this.map.toString() : "{}";
    }
}
