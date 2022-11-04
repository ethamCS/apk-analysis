package sh;

import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class w extends org.bouncycastle.crypto.b0 {

    /* renamed from: a */
    private org.bouncycastle.crypto.r f21759a;

    public w(org.bouncycastle.crypto.r rVar) {
        this.f21759a = rVar;
    }

    private byte[] a() {
        int digestSize = this.f21759a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        org.bouncycastle.crypto.r rVar = this.f21759a;
        byte[] bArr2 = this.password;
        rVar.update(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.r rVar2 = this.f21759a;
        byte[] bArr3 = this.salt;
        rVar2.update(bArr3, 0, bArr3.length);
        this.f21759a.doFinal(bArr, 0);
        for (int i10 = 1; i10 < this.iterationCount; i10++) {
            this.f21759a.update(bArr, 0, digestSize);
            this.f21759a.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        if (i11 <= this.f21759a.getDigestSize()) {
            return new b1(a(), 0, i11);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i11 + " bytes long.");
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        if (i14 <= this.f21759a.getDigestSize()) {
            byte[] a10 = a();
            return new f1(new b1(a10, 0, i12), a10, i12, i13);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i14 + " bytes long.");
    }
}
