package org.opendatakit.httpclientandroidlib.impl.client;

import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestAcceptEncoding;
import org.opendatakit.httpclientandroidlib.client.protocol.ResponseContentEncoding;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpProcessor;
@ThreadSafe
@Deprecated
/* loaded from: classes.dex */
public class ContentEncodingHttpClient extends DefaultHttpClient {
    public ContentEncodingHttpClient(ClientConnectionManager conman, HttpParams params) {
        super(conman, params);
    }

    public ContentEncodingHttpClient(HttpParams params) {
        this(null, params);
    }

    public ContentEncodingHttpClient() {
        this(null);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.DefaultHttpClient, org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    public BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor result = super.createHttpProcessor();
        result.addRequestInterceptor(new RequestAcceptEncoding());
        result.addResponseInterceptor(new ResponseContentEncoding());
        return result;
    }
}
