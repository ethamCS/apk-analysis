package org.opendatakit.httpclientandroidlib.entity.mime.content;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class ByteArrayBody extends AbstractContentBody {
    private final byte[] data;
    private final String filename;

    public ByteArrayBody(byte[] data, String mimeType, String filename) {
        super(mimeType);
        if (data == null) {
            throw new IllegalArgumentException("byte[] may not be null");
        }
        this.data = data;
        this.filename = filename;
    }

    public ByteArrayBody(byte[] data, String filename) {
        this(data, "application/octet-stream", filename);
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentBody
    public String getFilename() {
        return this.filename;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentBody
    public void writeTo(OutputStream out) throws IOException {
        out.write(this.data);
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public String getCharset() {
        return null;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public String getTransferEncoding() {
        return "binary";
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public long getContentLength() {
        return this.data.length;
    }
}
