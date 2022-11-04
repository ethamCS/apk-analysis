package org.opendatakit.httpclientandroidlib.conn;

import java.io.IOException;
import java.net.Socket;
import org.opendatakit.httpclientandroidlib.HttpClientConnection;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpInetConnection;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
/* loaded from: classes.dex */
public interface OperatedClientConnection extends HttpClientConnection, HttpInetConnection {
    Socket getSocket();

    HttpHost getTargetHost();

    boolean isSecure();

    void openCompleted(boolean z, HttpParams httpParams) throws IOException;

    void opening(Socket socket, HttpHost httpHost) throws IOException;

    void update(Socket socket, HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException;
}
