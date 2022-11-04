package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import org.javarosa.core.services.Logger;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.client.cache.Resource;
import org.opendatakit.httpclientandroidlib.entity.AbstractHttpEntity;
/* JADX INFO: Access modifiers changed from: package-private */
@NotThreadSafe
/* loaded from: classes.dex */
public class CombinedEntity extends AbstractHttpEntity {
    private final InputStream combinedStream;
    private final Resource resource;

    public CombinedEntity(Resource resource, InputStream instream) throws IOException {
        this.resource = resource;
        this.combinedStream = new SequenceInputStream(new ResourceStream(resource.getInputStream()), instream);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public long getContentLength() {
        return -1L;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public InputStream getContent() throws IOException, IllegalStateException {
        return this.combinedStream;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public void writeTo(OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream instream = getContent();
        try {
            byte[] tmp = new byte[Logger.MAX_MSG_LENGTH];
            while (true) {
                int l = instream.read(tmp);
                if (l != -1) {
                    outstream.write(tmp, 0, l);
                } else {
                    return;
                }
            }
        } finally {
            instream.close();
        }
    }

    public void dispose() {
        this.resource.dispose();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ResourceStream extends FilterInputStream {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected ResourceStream(InputStream in) {
            super(in);
            CombinedEntity.this = r1;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                super.close();
            } finally {
                CombinedEntity.this.dispose();
            }
        }
    }
}
