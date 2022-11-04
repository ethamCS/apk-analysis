package org.opendatakit.httpclientandroidlib.protocol;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpResponseInterceptor;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
@ThreadSafe
/* loaded from: classes.dex */
public class ResponseDate implements HttpResponseInterceptor {
    private static final HttpDateGenerator DATE_GENERATOR = new HttpDateGenerator();

    @Override // org.opendatakit.httpclientandroidlib.HttpResponseInterceptor
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        int status = response.getStatusLine().getStatusCode();
        if (status >= 200 && !response.containsHeader("Date")) {
            String httpdate = DATE_GENERATOR.getCurrentDate();
            response.setHeader("Date", httpdate);
        }
    }
}
