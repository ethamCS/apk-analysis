package org.opendatakit.httpclientandroidlib.impl.client;

import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy;
/* loaded from: classes.dex */
public class NullBackoffStrategy implements ConnectionBackoffStrategy {
    @Override // org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(Throwable t) {
        return false;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(HttpResponse resp) {
        return false;
    }
}
