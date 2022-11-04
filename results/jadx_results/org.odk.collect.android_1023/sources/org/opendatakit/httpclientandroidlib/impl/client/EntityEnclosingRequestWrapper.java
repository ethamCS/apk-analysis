package org.opendatakit.httpclientandroidlib.impl.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest;
import org.opendatakit.httpclientandroidlib.ProtocolException;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
@NotThreadSafe
/* loaded from: classes.dex */
public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {
    private boolean consumed;
    private HttpEntity entity;

    public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest request) throws ProtocolException {
        super(request);
        setEntity(request.getEntity());
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest
    public HttpEntity getEntity() {
        return this.entity;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest
    public void setEntity(HttpEntity entity) {
        this.entity = entity != null ? new EntityWrapper(entity) : null;
        this.consumed = false;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest
    public boolean expectContinue() {
        Header expect = getFirstHeader("Expect");
        return expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue());
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.RequestWrapper
    public boolean isRepeatable() {
        return this.entity == null || this.entity.isRepeatable() || !this.consumed;
    }

    /* loaded from: classes.dex */
    public class EntityWrapper extends HttpEntityWrapper {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        EntityWrapper(HttpEntity entity) {
            super(entity);
            EntityEnclosingRequestWrapper.this = r1;
        }

        @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
        public void consumeContent() throws IOException {
            EntityEnclosingRequestWrapper.this.consumed = true;
            super.consumeContent();
        }

        @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
        public InputStream getContent() throws IOException {
            EntityEnclosingRequestWrapper.this.consumed = true;
            return super.getContent();
        }

        @Override // org.opendatakit.httpclientandroidlib.entity.HttpEntityWrapper, org.opendatakit.httpclientandroidlib.HttpEntity
        public void writeTo(OutputStream outstream) throws IOException {
            EntityEnclosingRequestWrapper.this.consumed = true;
            super.writeTo(outstream);
        }
    }
}
