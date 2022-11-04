package org.opendatakit.httpclientandroidlib.impl.client;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.HttpResponseException;
import org.opendatakit.httpclientandroidlib.client.ResponseHandler;
import org.opendatakit.httpclientandroidlib.util.EntityUtils;
@Immutable
/* loaded from: classes.dex */
public class BasicResponseHandler implements ResponseHandler<String> {
    @Override // org.opendatakit.httpclientandroidlib.client.ResponseHandler
    public String handleResponse(HttpResponse response) throws HttpResponseException, IOException {
        StatusLine statusLine = response.getStatusLine();
        HttpEntity entity = response.getEntity();
        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        } else if (entity != null) {
            return EntityUtils.toString(entity);
        } else {
            return null;
        }
    }
}
