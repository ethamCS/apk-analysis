package oi;

import gg.a0;
import hh.q0;
import hh.y0;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
/* loaded from: classes3.dex */
public class c {
    public static e a(X509Certificate x509Certificate) {
        try {
            return new e(y0.r(q0.l(a0.u(x509Certificate.getTBSCertificate())).m()));
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    public static e b(X509Certificate x509Certificate) {
        try {
            return new e(y0.r(q0.l(a0.u(x509Certificate.getTBSCertificate())).n()));
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }
}
