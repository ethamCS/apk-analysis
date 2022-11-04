package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.Locale;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderIterator;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage;
import org.opendatakit.httpclientandroidlib.message.BasicStatusLine;
import org.opendatakit.httpclientandroidlib.params.BasicHttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@Immutable
/* loaded from: classes.dex */
final class OptionsHttp11Response extends AbstractHttpMessage implements HttpResponse {
    private final StatusLine statusLine = new BasicStatusLine(HttpVersion.HTTP_1_1, 501, "");
    private final ProtocolVersion version = HttpVersion.HTTP_1_1;

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public StatusLine getStatusLine() {
        return this.statusLine;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(StatusLine statusline) {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(ProtocolVersion ver, int code) {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(ProtocolVersion ver, int code, String reason) {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusCode(int code) throws IllegalStateException {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setReasonPhrase(String reason) throws IllegalStateException {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public HttpEntity getEntity() {
        return null;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setEntity(HttpEntity entity) {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public Locale getLocale() {
        return null;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setLocale(Locale loc) {
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.version;
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public boolean containsHeader(String name) {
        return this.headergroup.containsHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public Header[] getHeaders(String name) {
        return this.headergroup.getHeaders(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public Header getFirstHeader(String name) {
        return this.headergroup.getFirstHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public Header getLastHeader(String name) {
        return this.headergroup.getLastHeader(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public Header[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void addHeader(Header header) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void addHeader(String name, String value) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeader(Header header) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeader(String name, String value) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void setHeaders(Header[] headers) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void removeHeader(Header header) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void removeHeaders(String name) {
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public HeaderIterator headerIterator() {
        return this.headergroup.iterator();
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public HeaderIterator headerIterator(String name) {
        return this.headergroup.iterator(name);
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = new BasicHttpParams();
        }
        return this.params;
    }

    @Override // org.opendatakit.httpclientandroidlib.message.AbstractHttpMessage, org.opendatakit.httpclientandroidlib.HttpMessage
    public void setParams(HttpParams params) {
    }
}
