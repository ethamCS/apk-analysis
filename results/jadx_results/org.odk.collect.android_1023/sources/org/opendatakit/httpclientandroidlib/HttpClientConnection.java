package org.opendatakit.httpclientandroidlib;

import java.io.IOException;
/* loaded from: classes.dex */
public interface HttpClientConnection extends HttpConnection {
    void flush() throws IOException;

    boolean isResponseAvailable(int i) throws IOException;

    void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException;

    HttpResponse receiveResponseHeader() throws HttpException, IOException;

    void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException;

    void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException;
}
