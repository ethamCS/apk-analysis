package org.opendatakit.httpclientandroidlib.impl.io;

import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    @Override // org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void setBytesTransferred(long count) {
        this.bytesTransferred = count;
    }

    public void incrementBytesTransferred(long count) {
        this.bytesTransferred += count;
    }

    @Override // org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics
    public void reset() {
        this.bytesTransferred = 0L;
    }
}
