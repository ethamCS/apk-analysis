package org.opendatakit.httpclientandroidlib.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
/* loaded from: classes.dex */
public class GzipDecompressingEntity extends DecompressingEntity {
    @Override // org.opendatakit.httpclientandroidlib.client.entity.DecompressingEntity, org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public /* bridge */ /* synthetic */ InputStream getContent() throws IOException {
        return super.getContent();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.entity.DecompressingEntity, org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public /* bridge */ /* synthetic */ void writeTo(OutputStream x0) throws IOException {
        super.writeTo(x0);
    }

    public GzipDecompressingEntity(HttpEntity entity) {
        super(entity);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.entity.DecompressingEntity
    InputStream getDecompressingInputStream(InputStream wrapped) throws IOException {
        return new GZIPInputStream(wrapped);
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public long getContentLength() {
        return -1L;
    }
}
