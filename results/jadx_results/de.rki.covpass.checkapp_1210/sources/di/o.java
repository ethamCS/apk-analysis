package di;

import java.security.SecureRandom;
import org.bouncycastle.crypto.f0;
import org.bouncycastle.crypto.j0;
import zh.g1;
import zh.l1;
import zh.n1;
/* loaded from: classes3.dex */
public class o implements f0 {

    /* renamed from: g */
    private org.bouncycastle.crypto.r f9128g;

    /* renamed from: h */
    private org.bouncycastle.crypto.r f9129h;

    /* renamed from: i */
    private org.bouncycastle.crypto.a f9130i;

    /* renamed from: j */
    private SecureRandom f9131j;

    /* renamed from: k */
    private int f9132k;

    /* renamed from: l */
    private int f9133l;

    /* renamed from: m */
    private boolean f9134m = false;

    /* renamed from: n */
    private int f9135n;

    /* renamed from: o */
    private int f9136o;

    /* renamed from: p */
    private byte[] f9137p;

    /* renamed from: q */
    private byte[] f9138q;

    /* renamed from: r */
    private byte[] f9139r;

    /* renamed from: s */
    private byte f9140s;

    public o(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.r rVar, org.bouncycastle.crypto.r rVar2, int i10, byte b10) {
        this.f9130i = aVar;
        this.f9128g = rVar;
        this.f9129h = rVar2;
        this.f9132k = rVar.getDigestSize();
        this.f9133l = rVar2.getDigestSize();
        this.f9135n = i10;
        this.f9137p = new byte[i10];
        this.f9138q = new byte[i10 + 8 + this.f9132k];
        this.f9140s = b10;
    }

    private void c(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) (i10 >>> 0);
    }

    private void d(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    private byte[] e(byte[] bArr, int i10, int i11, int i12) {
        org.bouncycastle.crypto.r rVar = this.f9129h;
        if (rVar instanceof j0) {
            byte[] bArr2 = new byte[i12];
            rVar.update(bArr, i10, i11);
            ((j0) this.f9129h).c(bArr2, 0, i12);
            return bArr2;
        }
        return f(bArr, i10, i11, i12);
    }

    private byte[] f(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[this.f9133l];
        byte[] bArr4 = new byte[4];
        this.f9129h.reset();
        int i14 = 0;
        while (true) {
            i13 = this.f9133l;
            if (i14 >= i12 / i13) {
                break;
            }
            c(i14, bArr4);
            this.f9129h.update(bArr, i10, i11);
            this.f9129h.update(bArr4, 0, 4);
            this.f9129h.doFinal(bArr3, 0);
            int i15 = this.f9133l;
            System.arraycopy(bArr3, 0, bArr2, i14 * i15, i15);
            i14++;
        }
        if (i13 * i14 < i12) {
            c(i14, bArr4);
            this.f9129h.update(bArr, i10, i11);
            this.f9129h.update(bArr4, 0, 4);
            this.f9129h.doFinal(bArr3, 0);
            int i16 = this.f9133l;
            System.arraycopy(bArr3, 0, bArr2, i14 * i16, i12 - (i14 * i16));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.f0
    public boolean a(byte[] bArr) {
        byte[] bArr2;
        int length;
        org.bouncycastle.crypto.r rVar = this.f9128g;
        byte[] bArr3 = this.f9138q;
        rVar.doFinal(bArr3, (bArr3.length - this.f9132k) - this.f9135n);
        try {
            byte[] a10 = this.f9130i.a(bArr, 0, bArr.length);
            byte[] bArr4 = this.f9139r;
            ak.a.z(bArr4, 0, bArr4.length - a10.length, (byte) 0);
            byte[] bArr5 = this.f9139r;
            System.arraycopy(a10, 0, bArr5, bArr5.length - a10.length, a10.length);
            bArr2 = this.f9139r;
            length = 255 >>> ((bArr2.length * 8) - this.f9136o);
        } catch (Exception unused) {
        }
        if ((255 & bArr2[0]) != (bArr2[0] & length) || bArr2[bArr2.length - 1] != this.f9140s) {
            d(bArr2);
            return false;
        }
        int length2 = bArr2.length;
        int i10 = this.f9132k;
        byte[] e10 = e(bArr2, (length2 - i10) - 1, i10, (bArr2.length - i10) - 1);
        for (int i11 = 0; i11 != e10.length; i11++) {
            byte[] bArr6 = this.f9139r;
            bArr6[i11] = (byte) (bArr6[i11] ^ e10[i11]);
        }
        byte[] bArr7 = this.f9139r;
        bArr7[0] = (byte) (length & bArr7[0]);
        int i12 = 0;
        while (true) {
            byte[] bArr8 = this.f9139r;
            int length3 = bArr8.length;
            int i13 = this.f9132k;
            int i14 = this.f9135n;
            if (i12 != ((length3 - i13) - i14) - 2) {
                if (bArr8[i12] != 0) {
                    d(bArr8);
                    return false;
                }
                i12++;
            } else if (bArr8[((bArr8.length - i13) - i14) - 2] != 1) {
                d(bArr8);
                return false;
            } else {
                if (this.f9134m) {
                    byte[] bArr9 = this.f9137p;
                    byte[] bArr10 = this.f9138q;
                    System.arraycopy(bArr9, 0, bArr10, bArr10.length - i14, i14);
                } else {
                    byte[] bArr11 = this.f9138q;
                    System.arraycopy(bArr8, ((bArr8.length - i14) - i13) - 1, bArr11, bArr11.length - i14, i14);
                }
                org.bouncycastle.crypto.r rVar2 = this.f9128g;
                byte[] bArr12 = this.f9138q;
                rVar2.update(bArr12, 0, bArr12.length);
                org.bouncycastle.crypto.r rVar3 = this.f9128g;
                byte[] bArr13 = this.f9138q;
                rVar3.doFinal(bArr13, bArr13.length - this.f9132k);
                int length4 = this.f9139r.length;
                int i15 = this.f9132k;
                int i16 = (length4 - i15) - 1;
                int length5 = this.f9138q.length - i15;
                while (true) {
                    byte[] bArr14 = this.f9138q;
                    if (length5 == bArr14.length) {
                        d(bArr14);
                        d(this.f9139r);
                        return true;
                    } else if ((this.f9139r[i16] ^ bArr14[length5]) != 0) {
                        d(bArr14);
                        d(this.f9139r);
                        return false;
                    } else {
                        i16++;
                        length5++;
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        org.bouncycastle.crypto.r rVar = this.f9128g;
        byte[] bArr = this.f9138q;
        rVar.doFinal(bArr, (bArr.length - this.f9132k) - this.f9135n);
        if (this.f9135n != 0) {
            if (!this.f9134m) {
                this.f9131j.nextBytes(this.f9137p);
            }
            byte[] bArr2 = this.f9137p;
            byte[] bArr3 = this.f9138q;
            int length = bArr3.length;
            int i10 = this.f9135n;
            System.arraycopy(bArr2, 0, bArr3, length - i10, i10);
        }
        int i11 = this.f9132k;
        byte[] bArr4 = new byte[i11];
        org.bouncycastle.crypto.r rVar2 = this.f9128g;
        byte[] bArr5 = this.f9138q;
        rVar2.update(bArr5, 0, bArr5.length);
        this.f9128g.doFinal(bArr4, 0);
        byte[] bArr6 = this.f9139r;
        int length2 = bArr6.length;
        int i12 = this.f9135n;
        int i13 = this.f9132k;
        bArr6[(((length2 - i12) - 1) - i13) - 1] = 1;
        System.arraycopy(this.f9137p, 0, bArr6, ((bArr6.length - i12) - i13) - 1, i12);
        byte[] e10 = e(bArr4, 0, i11, (this.f9139r.length - this.f9132k) - 1);
        for (int i14 = 0; i14 != e10.length; i14++) {
            byte[] bArr7 = this.f9139r;
            bArr7[i14] = (byte) (bArr7[i14] ^ e10[i14]);
        }
        byte[] bArr8 = this.f9139r;
        int length3 = bArr8.length;
        int i15 = this.f9132k;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i15) - 1, i15);
        byte[] bArr9 = this.f9139r;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.f9136o)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.f9140s;
        byte[] a10 = this.f9130i.a(bArr9, 0, bArr9.length);
        d(this.f9139r);
        return a10;
    }

    public void g() {
        this.f9128g.reset();
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        n1 n1Var;
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            iVar2 = g1Var.a();
            this.f9131j = g1Var.b();
        } else {
            if (z10) {
                this.f9131j = org.bouncycastle.crypto.l.b();
            }
            iVar2 = iVar;
        }
        if (iVar2 instanceof l1) {
            n1Var = ((l1) iVar2).a();
            this.f9130i.init(z10, iVar);
        } else {
            n1Var = (n1) iVar2;
            this.f9130i.init(z10, iVar2);
        }
        int bitLength = n1Var.c().bitLength() - 1;
        this.f9136o = bitLength;
        if (bitLength >= (this.f9132k * 8) + (this.f9135n * 8) + 9) {
            this.f9139r = new byte[(bitLength + 7) / 8];
            g();
            return;
        }
        throw new IllegalArgumentException("key too small for specified hash and salt lengths");
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9128g.update(b10);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        this.f9128g.update(bArr, i10, i11);
    }
}
