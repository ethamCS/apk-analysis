package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import gg.a0;
import gg.t1;
import gg.w;
import java.io.IOException;
import java.security.SignatureException;
/* loaded from: classes3.dex */
public class SignatureSpiLe extends SignatureSpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] F = w.E(super.engineSign()).F();
        reverseBytes(F);
        try {
            return new t1(F).getEncoded();
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        try {
            byte[] F = ((w) a0.u(bArr)).F();
            reverseBytes(F);
            try {
                return super.engineVerify(new t1(F).getEncoded());
            } catch (SignatureException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new SignatureException(e11.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    void reverseBytes(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - 1) - i10];
            bArr[(bArr.length - 1) - i10] = b10;
        }
    }
}
