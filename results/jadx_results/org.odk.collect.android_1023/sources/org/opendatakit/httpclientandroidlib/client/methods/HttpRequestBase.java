package org.opendatakit.httpclientandroidlib.client.methods;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.RequestLine;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.client.utils.CloneUtils;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest;
import org.opendatakit.httpclientandroidlib.conn.ConnectionReleaseTrigger;
import org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage;
import org.opendatakit.httpclientandroidlib.message.BasicRequestLine;
import org.opendatakit.httpclientandroidlib.message.HeaderGroup;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpProtocolParams;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class HttpRequestBase extends AbstractHttpMessage implements HttpUriRequest, AbortableHttpRequest, Cloneable {
    private Lock abortLock = new ReentrantLock();
    private volatile boolean aborted;
    private ClientConnectionRequest connRequest;
    private ConnectionReleaseTrigger releaseTrigger;
    private URI uri;

    public abstract String getMethod();

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return HttpProtocolParams.getVersion(getParams());
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpRequest
    public RequestLine getRequestLine() {
        String method = getMethod();
        ProtocolVersion ver = getProtocolVersion();
        URI uri = getURI();
        String uritext = null;
        if (uri != null) {
            uritext = uri.toASCIIString();
        }
        if (uritext == null || uritext.length() == 0) {
            uritext = "/";
        }
        return new BasicRequestLine(method, uritext, ver);
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.AbortableHttpRequest
    public void setConnectionRequest(ClientConnectionRequest connRequest) throws IOException {
        if (this.aborted) {
            throw new IOException("Request already aborted");
        }
        this.abortLock.lock();
        try {
            this.connRequest = connRequest;
        } finally {
            this.abortLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.AbortableHttpRequest
    public void setReleaseTrigger(ConnectionReleaseTrigger releaseTrigger) throws IOException {
        if (this.aborted) {
            throw new IOException("Request already aborted");
        }
        this.abortLock.lock();
        try {
            this.releaseTrigger = releaseTrigger;
        } finally {
            this.abortLock.unlock();
        }
    }

    private void cleanup() {
        if (this.connRequest != null) {
            this.connRequest.abortRequest();
            this.connRequest = null;
        }
        if (this.releaseTrigger != null) {
            try {
                this.releaseTrigger.abortConnection();
            } catch (IOException e) {
            }
            this.releaseTrigger = null;
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest, org.opendatakit.httpclientandroidlib.client.methods.AbortableHttpRequest
    public void abort() {
        if (!this.aborted) {
            this.abortLock.lock();
            try {
                this.aborted = true;
                cleanup();
            } finally {
                this.abortLock.unlock();
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest
    public boolean isAborted() {
        return this.aborted;
    }

    public void reset() {
        this.abortLock.lock();
        try {
            cleanup();
            this.aborted = false;
        } finally {
            this.abortLock.unlock();
        }
    }

    public void releaseConnection() {
        reset();
    }

    public Object clone() throws CloneNotSupportedException {
        HttpRequestBase clone = (HttpRequestBase) super.clone();
        clone.abortLock = new ReentrantLock();
        clone.aborted = false;
        clone.releaseTrigger = null;
        clone.connRequest = null;
        clone.headergroup = (HeaderGroup) CloneUtils.clone(this.headergroup);
        clone.params = (HttpParams) CloneUtils.clone(this.params);
        return clone;
    }

    public String toString() {
        return getMethod() + XFormAnswerDataSerializer.DELIMITER + getURI() + XFormAnswerDataSerializer.DELIMITER + getProtocolVersion();
    }
}
