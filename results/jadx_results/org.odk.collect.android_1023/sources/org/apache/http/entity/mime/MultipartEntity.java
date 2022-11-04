package org.apache.http.entity.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.jcip.annotations.ThreadSafe;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.message.BasicHeader;
import org.apache.james.mime4j.field.Fields;
import org.apache.james.mime4j.message.Message;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
@ThreadSafe
/* loaded from: classes.dex */
public class MultipartEntity implements HttpEntity {
    private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final Header contentType;
    private volatile boolean dirty;
    private long length;
    private final Message message;
    private final HttpMultipart multipart;

    public MultipartEntity(HttpMultipartMode mode, String boundary, Charset charset) {
        this.multipart = new HttpMultipart("form-data");
        this.contentType = new BasicHeader("Content-Type", generateContentType(boundary, charset));
        this.dirty = true;
        this.message = new Message();
        org.apache.james.mime4j.message.Header header = new org.apache.james.mime4j.message.Header();
        this.message.setHeader(header);
        this.multipart.setParent(this.message);
        this.multipart.setMode(mode == null ? HttpMultipartMode.STRICT : mode);
        this.message.getHeader().addField(Fields.contentType(this.contentType.getValue()));
    }

    public MultipartEntity(HttpMultipartMode mode) {
        this(mode, null, null);
    }

    public MultipartEntity() {
        this(HttpMultipartMode.STRICT, null, null);
    }

    protected String generateContentType(String boundary, Charset charset) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("multipart/form-data; boundary=");
        if (boundary != null) {
            buffer.append(boundary);
        } else {
            Random rand = new Random();
            int count = rand.nextInt(11) + 30;
            for (int i = 0; i < count; i++) {
                buffer.append(MULTIPART_CHARS[rand.nextInt(MULTIPART_CHARS.length)]);
            }
        }
        if (charset != null) {
            buffer.append(HTTP.CHARSET_PARAM);
            buffer.append(charset.name());
        }
        return buffer.toString();
    }

    public void addPart(String name, ContentBody contentBody) {
        this.multipart.addBodyPart(new FormBodyPart(name, contentBody));
        this.dirty = true;
    }

    public boolean isRepeatable() {
        List<?> parts = this.multipart.getBodyParts();
        Iterator<?> it = parts.iterator();
        while (it.hasNext()) {
            FormBodyPart part = (FormBodyPart) it.next();
            ContentBody body = (ContentBody) part.getBody();
            if (body.getContentLength() < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isChunked() {
        return !isRepeatable();
    }

    public boolean isStreaming() {
        return !isRepeatable();
    }

    public long getContentLength() {
        if (this.dirty) {
            this.length = this.multipart.getTotalLength();
            this.dirty = false;
        }
        return this.length;
    }

    public Header getContentType() {
        return this.contentType;
    }

    public Header getContentEncoding() {
        return null;
    }

    public void consumeContent() throws IOException, UnsupportedOperationException {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public InputStream getContent() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public void writeTo(OutputStream outstream) throws IOException {
        this.multipart.writeTo(outstream);
    }
}
