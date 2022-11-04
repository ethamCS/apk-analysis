package org.opendatakit.httpclientandroidlib.impl;

import org.opendatakit.httpclientandroidlib.ConnectionReuseStrategy;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    @Override // org.opendatakit.httpclientandroidlib.ConnectionReuseStrategy
    public boolean keepAlive(HttpResponse response, HttpContext context) {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (context == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        return false;
    }
}
