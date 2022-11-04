package org.opendatakit.httpclientandroidlib.impl.client;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy;
/* loaded from: classes.dex */
public class DefaultBackoffStrategy implements ConnectionBackoffStrategy {
    @Override // org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(Throwable t) {
        return (t instanceof SocketTimeoutException) || (t instanceof ConnectException);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(HttpResponse resp) {
        return resp.getStatusLine().getStatusCode() == 503;
    }
}
