package org.opendatakit.httpclientandroidlib.conn;

import javax.net.ssl.SSLSession;
import org.opendatakit.httpclientandroidlib.HttpInetConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
/* loaded from: classes.dex */
public interface HttpRoutedConnection extends HttpInetConnection {
    HttpRoute getRoute();

    SSLSession getSSLSession();

    boolean isSecure();
}
