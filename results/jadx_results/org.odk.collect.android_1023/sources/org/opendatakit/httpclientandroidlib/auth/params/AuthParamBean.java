package org.opendatakit.httpclientandroidlib.auth.params;

import org.opendatakit.httpclientandroidlib.params.HttpAbstractParamBean;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
/* loaded from: classes.dex */
public class AuthParamBean extends HttpAbstractParamBean {
    public AuthParamBean(HttpParams params) {
        super(params);
    }

    public void setCredentialCharset(String charset) {
        AuthParams.setCredentialCharset(this.params, charset);
    }
}
