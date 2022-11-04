package org.opendatakit.httpclientandroidlib.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class EntityTemplate extends AbstractHttpEntity {
    private final ContentProducer contentproducer;

    public EntityTemplate(ContentProducer contentproducer) {
        if (contentproducer == null) {
            throw new IllegalArgumentException("Content producer may not be null");
        }
        this.contentproducer = contentproducer;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public long getContentLength() {
        return -1L;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public InputStream getContent() throws IOException {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        writeTo(buf);
        return new ByteArrayInputStream(buf.toByteArray());
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public void writeTo(OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        this.contentproducer.writeTo(outstream);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isStreaming() {
        return false;
    }
}
