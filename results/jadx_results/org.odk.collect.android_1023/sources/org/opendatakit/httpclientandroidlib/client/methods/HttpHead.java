package org.opendatakit.httpclientandroidlib.client.methods;

import java.net.URI;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpHead extends HttpRequestBase {
    public static final String METHOD_NAME = "HEAD";

    public HttpHead() {
    }

    public HttpHead(URI uri) {
        setURI(uri);
    }

    public HttpHead(String uri) {
        setURI(URI.create(uri));
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpRequestBase, org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public String getMethod() {
        return "HEAD";
    }
}
