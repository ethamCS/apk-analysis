package org.opendatakit.httpclientandroidlib.message;

import java.util.Locale;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.ReasonPhraseCatalog;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicHttpResponse extends AbstractHttpMessage implements HttpResponse {
    private HttpEntity entity;
    private Locale locale;
    private ReasonPhraseCatalog reasonCatalog;
    private StatusLine statusline;

    public BasicHttpResponse(StatusLine statusline, ReasonPhraseCatalog catalog, Locale locale) {
        if (statusline == null) {
            throw new IllegalArgumentException("Status line may not be null.");
        }
        this.statusline = statusline;
        this.reasonCatalog = catalog;
        this.locale = locale == null ? Locale.getDefault() : locale;
    }

    public BasicHttpResponse(StatusLine statusline) {
        this(statusline, (ReasonPhraseCatalog) null, (Locale) null);
    }

    public BasicHttpResponse(ProtocolVersion ver, int code, String reason) {
        this(new BasicStatusLine(ver, code, reason), (ReasonPhraseCatalog) null, (Locale) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.statusline.getProtocolVersion();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public StatusLine getStatusLine() {
        return this.statusline;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public HttpEntity getEntity() {
        return this.entity;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public Locale getLocale() {
        return this.locale;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(StatusLine statusline) {
        if (statusline == null) {
            throw new IllegalArgumentException("Status line may not be null");
        }
        this.statusline = statusline;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(ProtocolVersion ver, int code) {
        this.statusline = new BasicStatusLine(ver, code, getReason(code));
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusLine(ProtocolVersion ver, int code, String reason) {
        this.statusline = new BasicStatusLine(ver, code, reason);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setStatusCode(int code) {
        ProtocolVersion ver = this.statusline.getProtocolVersion();
        this.statusline = new BasicStatusLine(ver, code, getReason(code));
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setReasonPhrase(String reason) {
        if (reason != null && (reason.indexOf(10) >= 0 || reason.indexOf(13) >= 0)) {
            throw new IllegalArgumentException("Line break in reason phrase.");
        }
        this.statusline = new BasicStatusLine(this.statusline.getProtocolVersion(), this.statusline.getStatusCode(), reason);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setEntity(HttpEntity entity) {
        this.entity = entity;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpResponse
    public void setLocale(Locale loc) {
        if (loc == null) {
            throw new IllegalArgumentException("Locale may not be null.");
        }
        this.locale = loc;
        int code = this.statusline.getStatusCode();
        this.statusline = new BasicStatusLine(this.statusline.getProtocolVersion(), code, getReason(code));
    }

    protected String getReason(int code) {
        if (this.reasonCatalog == null) {
            return null;
        }
        return this.reasonCatalog.getReason(code, this.locale);
    }

    public String toString() {
        return this.statusline + XFormAnswerDataSerializer.DELIMITER + this.headergroup;
    }
}
