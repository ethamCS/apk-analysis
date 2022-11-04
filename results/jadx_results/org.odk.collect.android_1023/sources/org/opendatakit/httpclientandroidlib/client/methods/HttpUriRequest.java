package org.opendatakit.httpclientandroidlib.client.methods;

import java.net.URI;
import org.opendatakit.httpclientandroidlib.HttpRequest;
/* loaded from: classes.dex */
public interface HttpUriRequest extends HttpRequest {
    void abort() throws UnsupportedOperationException;

    String getMethod();

    URI getURI();

    boolean isAborted();
}
