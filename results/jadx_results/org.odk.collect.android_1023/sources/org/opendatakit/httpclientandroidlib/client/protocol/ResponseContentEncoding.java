package org.opendatakit.httpclientandroidlib.client.protocol;

import java.io.IOException;
import java.util.Locale;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpResponseInterceptor;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.entity.DeflateDecompressingEntity;
import org.opendatakit.httpclientandroidlib.client.entity.GzipDecompressingEntity;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class ResponseContentEncoding implements HttpResponseInterceptor {
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";

    @Override // org.opendatakit.httpclientandroidlib.HttpResponseInterceptor
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {
        Header ceheader;
        HttpEntity entity = response.getEntity();
        if (entity != null && (ceheader = entity.getContentEncoding()) != null) {
            HeaderElement[] codecs = ceheader.getElements();
            int len$ = codecs.length;
            if (0 < len$) {
                HeaderElement codec = codecs[0];
                String codecname = codec.getName().toLowerCase(Locale.US);
                if ("gzip".equals(codecname) || "x-gzip".equals(codecname)) {
                    response.setEntity(new GzipDecompressingEntity(response.getEntity()));
                    if (context != null) {
                        context.setAttribute(UNCOMPRESSED, true);
                    }
                } else if ("deflate".equals(codecname)) {
                    response.setEntity(new DeflateDecompressingEntity(response.getEntity()));
                    if (context != null) {
                        context.setAttribute(UNCOMPRESSED, true);
                    }
                } else if (!HTTP.IDENTITY_CODING.equals(codecname)) {
                    throw new HttpException("Unsupported Content-Coding: " + codec.getName());
                }
            }
        }
    }
}
