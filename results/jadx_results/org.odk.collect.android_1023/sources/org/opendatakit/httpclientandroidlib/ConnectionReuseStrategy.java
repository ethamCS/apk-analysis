package org.opendatakit.httpclientandroidlib;

import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public interface ConnectionReuseStrategy {
    boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext);
}
