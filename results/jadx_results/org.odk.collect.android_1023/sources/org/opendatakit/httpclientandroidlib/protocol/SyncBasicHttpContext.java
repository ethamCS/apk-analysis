package org.opendatakit.httpclientandroidlib.protocol;
@Deprecated
/* loaded from: classes.dex */
public class SyncBasicHttpContext extends BasicHttpContext {
    public SyncBasicHttpContext(HttpContext parentContext) {
        super(parentContext);
    }

    public SyncBasicHttpContext() {
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext, org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public synchronized Object getAttribute(String id) {
        return super.getAttribute(id);
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext, org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public synchronized void setAttribute(String id, Object obj) {
        super.setAttribute(id, obj);
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext, org.opendatakit.httpclientandroidlib.protocol.HttpContext
    public synchronized Object removeAttribute(String id) {
        return super.removeAttribute(id);
    }

    @Override // org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext
    public synchronized void clear() {
        super.clear();
    }
}
