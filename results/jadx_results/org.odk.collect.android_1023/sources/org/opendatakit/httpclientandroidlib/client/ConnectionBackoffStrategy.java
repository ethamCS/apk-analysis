package org.opendatakit.httpclientandroidlib.client;

import org.opendatakit.httpclientandroidlib.HttpResponse;
/* loaded from: classes.dex */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(Throwable th);

    boolean shouldBackoff(HttpResponse httpResponse);
}
