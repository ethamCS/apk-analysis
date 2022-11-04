package org.opendatakit.httpclientandroidlib.conn.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
class TrustManagerDecorator implements X509TrustManager {
    private final X509TrustManager trustManager;
    private final TrustStrategy trustStrategy;

    public TrustManagerDecorator(X509TrustManager trustManager, TrustStrategy trustStrategy) {
        this.trustManager = trustManager;
        this.trustStrategy = trustStrategy;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        this.trustManager.checkClientTrusted(chain, authType);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        if (!this.trustStrategy.isTrusted(chain, authType)) {
            this.trustManager.checkServerTrusted(chain, authType);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.trustManager.getAcceptedIssuers();
    }
}
