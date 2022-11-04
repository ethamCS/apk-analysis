package org.opendatakit.httpclientandroidlib.client.methods;

import java.net.URI;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpPut extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PUT";

    public HttpPut() {
    }

    public HttpPut(URI uri) {
        setURI(uri);
    }

    public HttpPut(String uri) {
        setURI(URI.create(uri));
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpRequestBase, org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public String getMethod() {
        return "PUT";
    }
}
