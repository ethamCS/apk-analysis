package org.bouncycastle.jcajce.provider.asymmetric.x509;

import hh.j;
import hh.n;
import java.security.cert.CertificateEncodingException;
import ni.c;
/* loaded from: classes3.dex */
class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;
    private final CertificateEncodingException exception;

    public X509CertificateInternal(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(cVar, nVar, jVar, zArr, str, bArr);
        this.encoding = bArr2;
        this.exception = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException = this.exception;
        if (certificateEncodingException == null) {
            byte[] bArr = this.encoding;
            if (bArr == null) {
                throw new CertificateEncodingException();
            }
            return bArr;
        }
        throw certificateEncodingException;
    }
}
