package org.opendatakit.httpclientandroidlib.entity.mime.content;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class InputStreamBody extends AbstractContentBody {
    private final String filename;
    private final InputStream in;

    public InputStreamBody(InputStream in, String mimeType, String filename) {
        super(mimeType);
        if (in == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        this.in = in;
        this.filename = filename;
    }

    public InputStreamBody(InputStream in, String filename) {
        this(in, "application/octet-stream", filename);
    }

    public InputStream getInputStream() {
        return this.in;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentBody
    public void writeTo(OutputStream out) throws IOException {
        if (out == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        try {
            byte[] tmp = new byte[4096];
            while (true) {
                int l = this.in.read(tmp);
                if (l != -1) {
                    out.write(tmp, 0, l);
                } else {
                    out.flush();
                    return;
                }
            }
        } finally {
            this.in.close();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public String getTransferEncoding() {
        return "binary";
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public String getCharset() {
        return null;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentDescriptor
    public long getContentLength() {
        return -1L;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.mime.content.ContentBody
    public String getFilename() {
        return this.filename;
    }
}
