package org.opendatakit.httpclientandroidlib.protocol;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpResponseInterceptor;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.params.CoreProtocolPNames;
@Immutable
/* loaded from: classes.dex */
public class ResponseServer implements HttpResponseInterceptor {
    @Override // org.opendatakit.httpclientandroidlib.HttpResponseInterceptor
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {
        String s;
        if (response == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!response.containsHeader("Server") && (s = (String) response.getParams().getParameter(CoreProtocolPNames.ORIGIN_SERVER)) != null) {
            response.addHeader("Server", s);
        }
    }
}
