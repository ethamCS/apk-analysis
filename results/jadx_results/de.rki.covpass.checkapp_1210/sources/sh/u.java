package sh;

import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class u extends org.bouncycastle.crypto.b0 {

    /* renamed from: a */
    private final org.bouncycastle.crypto.r f21755a;

    public u() {
        this(ei.a.a());
    }

    public u(org.bouncycastle.crypto.r rVar) {
        this.f21755a = rVar;
    }

    private byte[] a(int i10) {
        int digestSize = this.f21755a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        while (true) {
            org.bouncycastle.crypto.r rVar = this.f21755a;
            byte[] bArr3 = this.password;
            rVar.update(bArr3, 0, bArr3.length);
            org.bouncycastle.crypto.r rVar2 = this.f21755a;
            byte[] bArr4 = this.salt;
            rVar2.update(bArr4, 0, bArr4.length);
            this.f21755a.doFinal(bArr, 0);
            int i12 = i10 > digestSize ? digestSize : i10;
            System.arraycopy(bArr, 0, bArr2, i11, i12);
            i11 += i12;
            i10 -= i12;
            if (i10 == 0) {
                return bArr2;
            }
            this.f21755a.reset();
            this.f21755a.update(bArr, 0, digestSize);
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new b1(a(i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] a10 = a(i12 + i13);
        return new f1(new b1(a10, 0, i12), a10, i12, i13);
    }
}
