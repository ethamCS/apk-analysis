package org.opendatakit.httpclientandroidlib.message;

import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderIterator;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.params.BasicHttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class AbstractHttpMessage implements HttpMessage {
    protected HeaderGroup headergroup;
    protected HttpParams params;

    protected AbstractHttpMessage(HttpParams params) {
        this.headergroup = new HeaderGroup();
        this.params = params;
    }

    public AbstractHttpMessage() {
        this(null);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public boolean containsHeader(String name) {
        return this.headergroup.containsHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public Header[] getHeaders(String name) {
        return this.headergroup.getHeaders(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public Header getFirstHeader(String name) {
        return this.headergroup.getFirstHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public Header getLastHeader(String name) {
        return this.headergroup.getLastHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public Header[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void addHeader(Header header) {
        this.headergroup.addHeader(header);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void addHeader(String name, String value) {
        if (name == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.headergroup.addHeader(new BasicHeader(name, value));
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeader(Header header) {
        this.headergroup.updateHeader(header);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeader(String name, String value) {
        if (name == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.headergroup.updateHeader(new BasicHeader(name, value));
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeaders(Header[] headers) {
        this.headergroup.setHeaders(headers);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void removeHeader(Header header) {
        this.headergroup.removeHeader(header);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void removeHeaders(String name) {
        if (name != null) {
            HeaderIterator i = this.headergroup.iterator();
            while (i.hasNext()) {
                Header header = i.nextHeader();
                if (name.equalsIgnoreCase(header.getName())) {
                    i.remove();
                }
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public HeaderIterator headerIterator() {
        return this.headergroup.iterator();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public HeaderIterator headerIterator(String name) {
        return this.headergroup.iterator(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = new BasicHttpParams();
        }
        return this.params;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public void setParams(HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.params = params;
    }
}
