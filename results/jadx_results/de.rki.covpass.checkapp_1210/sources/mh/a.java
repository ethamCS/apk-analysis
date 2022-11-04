package mh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.q;
import org.bouncycastle.crypto.r;
import zh.a1;
/* loaded from: classes3.dex */
public class a implements p {

    /* renamed from: a */
    private r f16670a;

    /* renamed from: b */
    private byte[] f16671b;

    /* renamed from: c */
    private byte[] f16672c;

    /* renamed from: d */
    private int f16673d;

    public a(r rVar) {
        this.f16670a = rVar;
        this.f16673d = rVar.getDigestSize();
    }

    private void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) (i10 >>> 0);
    }

    @Override // org.bouncycastle.crypto.p
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        if (bArr.length - i11 >= i10) {
            byte[] bArr2 = new byte[this.f16673d];
            byte[] bArr3 = new byte[4];
            this.f16670a.reset();
            int i14 = 1;
            if (i11 > this.f16673d) {
                i12 = 0;
                while (true) {
                    a(i14, bArr3);
                    this.f16670a.update(bArr3, 0, 4);
                    r rVar = this.f16670a;
                    byte[] bArr4 = this.f16671b;
                    rVar.update(bArr4, 0, bArr4.length);
                    r rVar2 = this.f16670a;
                    byte[] bArr5 = this.f16672c;
                    rVar2.update(bArr5, 0, bArr5.length);
                    this.f16670a.doFinal(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10 + i12, this.f16673d);
                    int i15 = this.f16673d;
                    i12 += i15;
                    i13 = i14 + 1;
                    if (i14 >= i11 / i15) {
                        break;
                    }
                    i14 = i13;
                }
                i14 = i13;
            } else {
                i12 = 0;
            }
            if (i12 < i11) {
                a(i14, bArr3);
                this.f16670a.update(bArr3, 0, 4);
                r rVar3 = this.f16670a;
                byte[] bArr6 = this.f16671b;
                rVar3.update(bArr6, 0, bArr6.length);
                r rVar4 = this.f16670a;
                byte[] bArr7 = this.f16672c;
                rVar4.update(bArr7, 0, bArr7.length);
                this.f16670a.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10 + i12, i11 - i12);
            }
            return i11;
        }
        throw new a0("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.p
    public void init(q qVar) {
        if (qVar instanceof a1) {
            a1 a1Var = (a1) qVar;
            this.f16671b = a1Var.b();
            this.f16672c = a1Var.a();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
