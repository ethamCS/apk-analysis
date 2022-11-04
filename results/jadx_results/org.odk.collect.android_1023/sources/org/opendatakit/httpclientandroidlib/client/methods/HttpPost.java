package org.opendatakit.httpclientandroidlib.client.methods;

import java.net.URI;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost() {
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost(String uri) {
        setURI(URI.create(uri));
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpRequestBase, org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }
}
