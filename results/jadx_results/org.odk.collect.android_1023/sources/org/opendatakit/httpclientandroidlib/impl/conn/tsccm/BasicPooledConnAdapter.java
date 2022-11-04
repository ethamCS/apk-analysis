package org.opendatakit.httpclientandroidlib.impl.conn.tsccm;

import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.impl.conn.AbstractPoolEntry;
import org.opendatakit.httpclientandroidlib.impl.conn.AbstractPooledConnAdapter;
@Deprecated
/* loaded from: classes.dex */
public class BasicPooledConnAdapter extends AbstractPooledConnAdapter {
    public BasicPooledConnAdapter(ThreadSafeClientConnManager tsccm, AbstractPoolEntry entry) {
        super(tsccm, entry);
        markReusable();
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.AbstractClientConnAdapter
    public ClientConnectionManager getManager() {
        return super.getManager();
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.AbstractPooledConnAdapter
    public AbstractPoolEntry getPoolEntry() {
        return super.getPoolEntry();
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.AbstractPooledConnAdapter, org.opendatakit.httpclientandroidlib.impl.conn.AbstractClientConnAdapter
    public void detach() {
        super.detach();
    }
}
