package org.opendatakit.httpclientandroidlib.impl.cookie;

import java.io.Serializable;
import java.util.Date;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie2;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicClientCookie2 extends BasicClientCookie implements SetCookie2, Serializable {
    private static final long serialVersionUID = -7744598295706617057L;
    private String commentURL;
    private boolean discard;
    private int[] ports;

    public BasicClientCookie2(String name, String value) {
        super(name, value);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.cookie.BasicClientCookie, org.opendatakit.httpclientandroidlib.cookie.Cookie
    public int[] getPorts() {
        return this.ports;
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.SetCookie2
    public void setPorts(int[] ports) {
        this.ports = ports;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.cookie.BasicClientCookie, org.opendatakit.httpclientandroidlib.cookie.Cookie
    public String getCommentURL() {
        return this.commentURL;
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.SetCookie2
    public void setCommentURL(String commentURL) {
        this.commentURL = commentURL;
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.SetCookie2
    public void setDiscard(boolean discard) {
        this.discard = discard;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.cookie.BasicClientCookie, org.opendatakit.httpclientandroidlib.cookie.Cookie
    public boolean isPersistent() {
        return !this.discard && super.isPersistent();
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.cookie.BasicClientCookie, org.opendatakit.httpclientandroidlib.cookie.Cookie
    public boolean isExpired(Date date) {
        return this.discard || super.isExpired(date);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.cookie.BasicClientCookie
    public Object clone() throws CloneNotSupportedException {
        BasicClientCookie2 clone = (BasicClientCookie2) super.clone();
        if (this.ports != null) {
            clone.ports = (int[]) this.ports.clone();
        }
        return clone;
    }
}
