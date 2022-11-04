package org.opendatakit.httpclientandroidlib.client;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpResponse;
/* loaded from: classes.dex */
public interface ResponseHandler<T> {
    T handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException;
}
