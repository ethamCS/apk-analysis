package org.apache.james.mime4j.descriptor;

import java.util.Map;
/* loaded from: classes.dex */
public interface ContentDescriptor {
    String getCharset();

    long getContentLength();

    Map<String, String> getContentTypeParameters();

    String getMediaType();

    String getMimeType();

    String getSubType();

    String getTransferEncoding();
}
