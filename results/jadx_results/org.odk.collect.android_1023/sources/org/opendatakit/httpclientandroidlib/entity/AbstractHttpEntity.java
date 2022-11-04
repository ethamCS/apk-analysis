package org.opendatakit.httpclientandroidlib.entity;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.message.BasicHeader;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class AbstractHttpEntity implements HttpEntity {
    protected boolean chunked;
    protected Header contentEncoding;
    protected Header contentType;

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public Header getContentType() {
        return this.contentType;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    public boolean isChunked() {
        return this.chunked;
    }

    public void setContentType(Header contentType) {
        this.contentType = contentType;
    }

    public void setContentType(String ctString) {
        Header h = null;
        if (ctString != null) {
            h = new BasicHeader("Content-Type", ctString);
        }
        setContentType(h);
    }

    public void setContentEncoding(Header contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public void setContentEncoding(String ceString) {
        Header h = null;
        if (ceString != null) {
            h = new BasicHeader("Content-Encoding", ceString);
        }
        setContentEncoding(h);
    }

    public void setChunked(boolean b) {
        this.chunked = b;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntity
    @Deprecated
    public void consumeContent() throws IOException {
    }
}
