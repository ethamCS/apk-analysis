package sh;

import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class x extends org.bouncycastle.crypto.b0 {

    /* renamed from: a */
    private org.bouncycastle.crypto.y f21760a;

    /* renamed from: b */
    private byte[] f21761b;

    public x() {
        this(ei.a.b());
    }

    public x(org.bouncycastle.crypto.r rVar) {
        uh.g gVar = new uh.g(rVar);
        this.f21760a = gVar;
        this.f21761b = new byte[gVar.getMacSize()];
    }

    private void a(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11) {
        if (i10 != 0) {
            if (bArr != null) {
                this.f21760a.update(bArr, 0, bArr.length);
            }
            this.f21760a.update(bArr2, 0, bArr2.length);
            this.f21760a.doFinal(this.f21761b, 0);
            byte[] bArr4 = this.f21761b;
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            for (int i12 = 1; i12 < i10; i12++) {
                org.bouncycastle.crypto.y yVar = this.f21760a;
                byte[] bArr5 = this.f21761b;
                yVar.update(bArr5, 0, bArr5.length);
                this.f21760a.doFinal(this.f21761b, 0);
                int i13 = 0;
                while (true) {
                    byte[] bArr6 = this.f21761b;
                    if (i13 != bArr6.length) {
                        int i14 = i11 + i13;
                        bArr3[i14] = (byte) (bArr6[i13] ^ bArr3[i14]);
                        i13++;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    private byte[] b(int i10) {
        int macSize = this.f21760a.getMacSize();
        int i11 = ((i10 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i11 * macSize];
        this.f21760a.init(new b1(this.password));
        int i12 = 0;
        for (int i13 = 1; i13 <= i11; i13++) {
            int i14 = 3;
            while (true) {
                byte b10 = (byte) (bArr[i14] + 1);
                bArr[i14] = b10;
                if (b10 == 0) {
                    i14--;
                }
            }
            a(this.salt, this.iterationCount, bArr, bArr2, i12);
            i12 += macSize;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new b1(b(i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.b0
    public org.bouncycastle.crypto.i generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] b10 = b(i12 + i13);
        return new f1(new b1(b10, 0, i12), b10, i12, i13);
    }
}
