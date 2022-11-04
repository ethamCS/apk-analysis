package di;

import org.bouncycastle.crypto.f0;
import zh.n1;
/* loaded from: classes3.dex */
public class m implements f0 {

    /* renamed from: g */
    private org.bouncycastle.crypto.r f9116g;

    /* renamed from: h */
    private org.bouncycastle.crypto.a f9117h;

    /* renamed from: i */
    private int f9118i;

    /* renamed from: j */
    private int f9119j;

    /* renamed from: k */
    private byte[] f9120k;

    /* renamed from: l */
    private byte[] f9121l;

    /* renamed from: m */
    private int f9122m;

    /* renamed from: n */
    private boolean f9123n;

    /* renamed from: o */
    private byte[] f9124o;

    /* renamed from: p */
    private byte[] f9125p;

    /* renamed from: q */
    private byte[] f9126q;

    public m(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.r rVar, boolean z10) {
        int intValue;
        this.f9117h = aVar;
        this.f9116g = rVar;
        if (z10) {
            intValue = 188;
        } else {
            Integer a10 = n.a(rVar);
            if (a10 == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + rVar.getAlgorithmName());
            }
            intValue = a10.intValue();
        }
        this.f9118i = intValue;
    }

    private void c(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        int i10 = this.f9122m;
        byte[] bArr3 = this.f9121l;
        boolean z10 = true;
        if (i10 > bArr3.length) {
            if (bArr3.length > bArr2.length) {
                z10 = false;
            }
            for (int i11 = 0; i11 != this.f9121l.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                }
            }
        } else {
            if (i10 != bArr2.length) {
                z10 = false;
            }
            for (int i12 = 0; i12 != bArr2.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    private boolean f(byte[] bArr) {
        this.f9122m = 0;
        c(this.f9121l);
        c(bArr);
        return false;
    }

    @Override // org.bouncycastle.crypto.f0
    public boolean a(byte[] bArr) {
        byte[] a10;
        byte[] bArr2 = this.f9125p;
        if (bArr2 == null) {
            try {
                a10 = this.f9117h.a(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (!ak.a.c(bArr2, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        } else {
            a10 = this.f9126q;
            this.f9125p = null;
            this.f9126q = null;
        }
        if (((a10[0] & 192) ^ 64) == 0 && ((a10[a10.length - 1] & 15) ^ 12) == 0) {
            int i10 = 2;
            if (((a10[a10.length - 1] & 255) ^ 188) == 0) {
                i10 = 1;
            } else {
                int i11 = ((a10[a10.length - 2] & 255) << 8) | (a10[a10.length - 1] & 255);
                Integer a11 = n.a(this.f9116g);
                if (a11 == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int intValue = a11.intValue();
                if (i11 != intValue && (intValue != 15052 || i11 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i11);
                }
            }
            int i12 = 0;
            while (i12 != a10.length && ((a10[i12] & 15) ^ 10) != 0) {
                i12++;
            }
            int i13 = i12 + 1;
            int digestSize = this.f9116g.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (a10.length - i10) - digestSize;
            int i14 = length - i13;
            if (i14 <= 0) {
                return f(a10);
            }
            if ((a10[0] & 32) == 0) {
                this.f9123n = true;
                if (this.f9122m > i14) {
                    return f(a10);
                }
                this.f9116g.reset();
                this.f9116g.update(a10, i13, i14);
                this.f9116g.doFinal(bArr3, 0);
                boolean z10 = true;
                for (int i15 = 0; i15 != digestSize; i15++) {
                    int i16 = length + i15;
                    a10[i16] = (byte) (a10[i16] ^ bArr3[i15]);
                    if (a10[i16] != 0) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    return f(a10);
                }
                byte[] bArr4 = new byte[i14];
                this.f9124o = bArr4;
                System.arraycopy(a10, i13, bArr4, 0, bArr4.length);
            } else {
                this.f9123n = false;
                this.f9116g.doFinal(bArr3, 0);
                boolean z11 = true;
                for (int i17 = 0; i17 != digestSize; i17++) {
                    int i18 = length + i17;
                    a10[i18] = (byte) (a10[i18] ^ bArr3[i17]);
                    if (a10[i18] != 0) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    return f(a10);
                }
                byte[] bArr5 = new byte[i14];
                this.f9124o = bArr5;
                System.arraycopy(a10, i13, bArr5, 0, bArr5.length);
            }
            if (this.f9122m != 0 && !d(this.f9121l, this.f9124o)) {
                return f(a10);
            }
            c(this.f9121l);
            c(a10);
            this.f9122m = 0;
            return true;
        }
        return f(a10);
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        int i10;
        int i11;
        int i12;
        byte b10;
        int digestSize = this.f9116g.getDigestSize();
        boolean z10 = true;
        if (this.f9118i == 188) {
            byte[] bArr = this.f9120k;
            i10 = (bArr.length - digestSize) - 1;
            this.f9116g.doFinal(bArr, i10);
            byte[] bArr2 = this.f9120k;
            bArr2[bArr2.length - 1] = -68;
            i11 = 8;
        } else {
            i11 = 16;
            byte[] bArr3 = this.f9120k;
            int length = (bArr3.length - digestSize) - 2;
            this.f9116g.doFinal(bArr3, length);
            byte[] bArr4 = this.f9120k;
            int i13 = this.f9118i;
            bArr4[bArr4.length - 2] = (byte) (i13 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i13;
            i10 = length;
        }
        int i14 = this.f9122m;
        int i15 = ((((digestSize + i14) * 8) + i11) + 4) - this.f9119j;
        if (i15 > 0) {
            int i16 = i14 - ((i15 + 7) / 8);
            b10 = 96;
            i12 = i10 - i16;
            System.arraycopy(this.f9121l, 0, this.f9120k, i12, i16);
            this.f9124o = new byte[i16];
        } else {
            b10 = 64;
            i12 = i10 - i14;
            System.arraycopy(this.f9121l, 0, this.f9120k, i12, i14);
            this.f9124o = new byte[this.f9122m];
        }
        int i17 = i12 - 1;
        if (i17 > 0) {
            for (int i18 = i17; i18 != 0; i18--) {
                this.f9120k[i18] = -69;
            }
            byte[] bArr5 = this.f9120k;
            bArr5[i17] = (byte) (bArr5[i17] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (bArr5[0] | b10);
        } else {
            byte[] bArr6 = this.f9120k;
            bArr6[0] = 10;
            bArr6[0] = (byte) (bArr6[0] | b10);
        }
        org.bouncycastle.crypto.a aVar = this.f9117h;
        byte[] bArr7 = this.f9120k;
        byte[] a10 = aVar.a(bArr7, 0, bArr7.length);
        if ((b10 & 32) != 0) {
            z10 = false;
        }
        this.f9123n = z10;
        byte[] bArr8 = this.f9121l;
        byte[] bArr9 = this.f9124o;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.f9122m = 0;
        c(this.f9121l);
        c(this.f9120k);
        return a10;
    }

    public void e() {
        this.f9116g.reset();
        this.f9122m = 0;
        c(this.f9121l);
        byte[] bArr = this.f9124o;
        if (bArr != null) {
            c(bArr);
        }
        this.f9124o = null;
        this.f9123n = false;
        if (this.f9125p != null) {
            this.f9125p = null;
            c(this.f9126q);
            this.f9126q = null;
        }
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        n1 n1Var = (n1) iVar;
        this.f9117h.init(z10, n1Var);
        int bitLength = n1Var.c().bitLength();
        this.f9119j = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.f9120k = bArr;
        int i10 = this.f9118i;
        int length = bArr.length;
        if (i10 == 188) {
            this.f9121l = new byte[(length - this.f9116g.getDigestSize()) - 2];
        } else {
            this.f9121l = new byte[(length - this.f9116g.getDigestSize()) - 3];
        }
        e();
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9116g.update(b10);
        int i10 = this.f9122m;
        byte[] bArr = this.f9121l;
        if (i10 < bArr.length) {
            bArr[i10] = b10;
        }
        this.f9122m = i10 + 1;
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0 && this.f9122m < this.f9121l.length) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        this.f9116g.update(bArr, i10, i11);
        this.f9122m += i11;
    }
}
