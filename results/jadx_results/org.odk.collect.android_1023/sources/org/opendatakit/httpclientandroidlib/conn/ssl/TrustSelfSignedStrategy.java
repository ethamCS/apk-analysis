package org.opendatakit.httpclientandroidlib.conn.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
/* loaded from: classes.dex */
public class TrustSelfSignedStrategy implements TrustStrategy {
    @Override // org.opendatakit.httpclientandroidlib.conn.ssl.TrustStrategy
    public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        return chain.length == 1;
    }
}
