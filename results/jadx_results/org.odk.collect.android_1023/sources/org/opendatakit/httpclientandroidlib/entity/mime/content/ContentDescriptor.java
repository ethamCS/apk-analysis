package org.opendatakit.httpclientandroidlib.entity.mime.content;
/* loaded from: classes.dex */
public interface ContentDescriptor {
    String getCharset();

    long getContentLength();

    String getMediaType();

    String getMimeType();

    String getSubType();

    String getTransferEncoding();
}