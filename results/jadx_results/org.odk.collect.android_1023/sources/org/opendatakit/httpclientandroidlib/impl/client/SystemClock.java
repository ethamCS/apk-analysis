package org.opendatakit.httpclientandroidlib.impl.client;
/* loaded from: classes.dex */
class SystemClock implements Clock {
    @Override // org.opendatakit.httpclientandroidlib.impl.client.Clock
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
