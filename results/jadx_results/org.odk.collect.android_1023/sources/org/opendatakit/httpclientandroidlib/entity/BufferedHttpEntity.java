package org.opendatakit.httpclientandroidlib.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.util.EntityUtils;
@NotThreadSafe
/* loaded from: classes.dex */
public class BufferedHttpEntity extends HttpEntityWrapper {
    private final byte[] buffer;

    public BufferedHttpEntity(HttpEntity entity) throws IOException {
        super(entity);
        if (!entity.isRepeatable() || entity.getContentLength() < 0) {
            this.buffer = EntityUtils.toByteArray(entity);
        } else {
            this.buffer = null;
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public long getContentLength() {
        return this.buffer != null ? this.buffer.length : this.wrappedEntity.getContentLength();
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public InputStream getContent() throws IOException {
        return this.buffer != null ? new ByteArrayInputStream(this.buffer) : this.wrappedEntity.getContent();
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isChunked() {
        return this.buffer == null && this.wrappedEntity.isChunked();
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public void writeTo(OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (this.buffer != null) {
            outstream.write(this.buffer);
        } else {
            this.wrappedEntity.writeTo(outstream);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isStreaming() {
        return this.buffer == null && this.wrappedEntity.isStreaming();
    }
}
