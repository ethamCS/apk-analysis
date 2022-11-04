package org.opendatakit.httpclientandroidlib.client.methods;

import java.net.URI;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpDelete extends HttpRequestBase {
    public static final String METHOD_NAME = "DELETE";

    public HttpDelete() {
    }

    public HttpDelete(URI uri) {
        setURI(uri);
    }

    public HttpDelete(String uri) {
        setURI(URI.create(uri));
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpRequestBase, org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public String getMethod() {
        return "DELETE";
    }
}
