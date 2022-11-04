package org.opendatakit.httpclientandroidlib.conn;

import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeRegistry;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
/* loaded from: classes.dex */
public interface ClientConnectionManagerFactory {
    ClientConnectionManager newInstance(HttpParams httpParams, SchemeRegistry schemeRegistry);
}
