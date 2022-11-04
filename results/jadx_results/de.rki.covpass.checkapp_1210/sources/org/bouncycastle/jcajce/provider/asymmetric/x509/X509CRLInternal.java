package org.bouncycastle.jcajce.provider.asymmetric.x509;

import hh.o;
import java.security.cert.CRLException;
import ni.c;
/* loaded from: classes3.dex */
class X509CRLInternal extends X509CRLImpl {
    private final byte[] encoding;
    private final CRLException exception;

    public X509CRLInternal(c cVar, o oVar, String str, byte[] bArr, boolean z10, byte[] bArr2, CRLException cRLException) {
        super(cVar, oVar, str, bArr, z10);
        this.encoding = bArr2;
        this.exception = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        CRLException cRLException = this.exception;
        if (cRLException == null) {
            byte[] bArr = this.encoding;
            if (bArr == null) {
                throw new CRLException();
            }
            return bArr;
        }
        throw cRLException;
    }
}
