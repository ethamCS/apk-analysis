package org.opendatakit.httpclientandroidlib.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class InputStreamEntity extends AbstractHttpEntity {
    private static final int BUFFER_SIZE = 2048;
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream instream, long length) {
        this(instream, length, null);
    }

    public InputStreamEntity(InputStream instream, long length, ContentType contentType) {
        if (instream == null) {
            throw new IllegalArgumentException("Source input stream may not be null");
        }
        this.content = instream;
        this.length = length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public long getContentLength() {
        return this.length;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public InputStream getContent() throws IOException {
        return this.content;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public void writeTo(OutputStream outstream) throws IOException {
        int l;
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream instream = this.content;
        try {
            byte[] buffer = new byte[2048];
            if (this.length < 0) {
                while (true) {
                    int l2 = instream.read(buffer);
                    if (l2 == -1) {
                        break;
                    }
                    outstream.write(buffer, 0, l2);
                }
            } else {
                long remaining = this.length;
                while (remaining > 0 && (l = instream.read(buffer, 0, (int) Math.min(2048L, remaining))) != -1) {
                    outstream.write(buffer, 0, l);
                    remaining -= l;
                }
            }
        } finally {
            instream.close();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.AbstractHttpEntity, org.opendatakit.httpclientandroidlib.HttpEntity
    @Deprecated
    public void consumeContent() throws IOException {
        this.content.close();
    }
}
