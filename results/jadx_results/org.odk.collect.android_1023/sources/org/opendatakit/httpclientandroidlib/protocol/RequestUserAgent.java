package org.opendatakit.httpclientandroidlib.protocol;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpRequestInterceptor;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.params.HttpProtocolParams;
@Immutable
/* loaded from: classes.dex */
public class RequestUserAgent implements HttpRequestInterceptor {
    @Override // org.opendatakit.httpclientandroidlib.HttpRequestInterceptor
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
        String useragent;
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!request.containsHeader("User-Agent") && (useragent = HttpProtocolParams.getUserAgent(request.getParams())) != null) {
            request.addHeader("User-Agent", useragent);
        }
    }
}
