package qh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class q implements org.bouncycastle.crypto.i0 {

    /* renamed from: h */
    private static final byte[] f20117h = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a */
    private vh.c f20118a;

    /* renamed from: b */
    private zh.b1 f20119b;

    /* renamed from: c */
    private zh.f1 f20120c;

    /* renamed from: d */
    private byte[] f20121d;

    /* renamed from: e */
    private boolean f20122e;

    /* renamed from: f */
    org.bouncycastle.crypto.r f20123f = ei.a.b();

    /* renamed from: g */
    byte[] f20124g = new byte[20];

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f20123f.update(bArr, 0, bArr.length);
        this.f20123f.doFinal(this.f20124g, 0);
        System.arraycopy(this.f20124g, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        return ak.a.u(c(bArr), bArr2);
    }

    private static byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = i10 + 1;
            bArr2[i10] = bArr[bArr.length - i11];
            i10 = i11;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        if (!this.f20122e) {
            if (bArr == null) {
                throw new org.bouncycastle.crypto.u("Null pointer as ciphertext");
            }
            int b10 = this.f20118a.b();
            if (i11 % b10 != 0) {
                throw new org.bouncycastle.crypto.u("Ciphertext not multiple of " + b10);
            }
            this.f20118a.init(false, new zh.f1(this.f20119b, f20117h));
            byte[] bArr2 = new byte[i11];
            for (int i12 = 0; i12 != i11; i12 += b10) {
                this.f20118a.a(bArr, i10 + i12, bArr2, i12);
            }
            byte[] e10 = e(bArr2);
            byte[] bArr3 = new byte[8];
            this.f20121d = bArr3;
            int length = e10.length - 8;
            byte[] bArr4 = new byte[length];
            System.arraycopy(e10, 0, bArr3, 0, 8);
            System.arraycopy(e10, 8, bArr4, 0, e10.length - 8);
            zh.f1 f1Var = new zh.f1(this.f20119b, this.f20121d);
            this.f20120c = f1Var;
            this.f20118a.init(false, f1Var);
            byte[] bArr5 = new byte[length];
            for (int i13 = 0; i13 != length; i13 += b10) {
                this.f20118a.a(bArr4, i13, bArr5, i13);
            }
            int i14 = length - 8;
            byte[] bArr6 = new byte[i14];
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr5, 0, bArr6, 0, i14);
            System.arraycopy(bArr5, i14, bArr7, 0, 8);
            if (!d(bArr6, bArr7)) {
                throw new org.bouncycastle.crypto.u("Checksum inside ciphertext is corrupted");
            }
            return bArr6;
        }
        throw new IllegalStateException("Not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f20122e) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            byte[] c10 = c(bArr2);
            int length = c10.length + i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i11);
            System.arraycopy(c10, 0, bArr3, i11, c10.length);
            int b10 = this.f20118a.b();
            if (length % b10 != 0) {
                throw new IllegalStateException("Not multiple of block length");
            }
            this.f20118a.init(true, this.f20120c);
            byte[] bArr4 = new byte[length];
            for (int i12 = 0; i12 != length; i12 += b10) {
                this.f20118a.a(bArr3, i12, bArr4, i12);
            }
            byte[] bArr5 = this.f20121d;
            byte[] bArr6 = new byte[bArr5.length + length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            System.arraycopy(bArr4, 0, bArr6, this.f20121d.length, length);
            byte[] e10 = e(bArr6);
            this.f20118a.init(true, new zh.f1(this.f20119b, f20117h));
            for (int i13 = 0; i13 != e10.length; i13 += b10) {
                this.f20118a.a(e10, i13, e10, i13);
            }
            return e10;
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        SecureRandom secureRandom;
        this.f20122e = z10;
        this.f20118a = new vh.c(new p());
        if (iVar instanceof zh.g1) {
            zh.g1 g1Var = (zh.g1) iVar;
            org.bouncycastle.crypto.i a10 = g1Var.a();
            SecureRandom b10 = g1Var.b();
            iVar = a10;
            secureRandom = b10;
        } else {
            secureRandom = org.bouncycastle.crypto.l.b();
        }
        if (iVar instanceof zh.b1) {
            this.f20119b = (zh.b1) iVar;
            if (!this.f20122e) {
                return;
            }
            byte[] bArr = new byte[8];
            this.f20121d = bArr;
            secureRandom.nextBytes(bArr);
            this.f20120c = new zh.f1(this.f20119b, this.f20121d);
        } else if (!(iVar instanceof zh.f1)) {
        } else {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f20120c = f1Var;
            this.f20121d = f1Var.a();
            this.f20119b = (zh.b1) this.f20120c.b();
            if (!this.f20122e) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.f20121d;
            if (bArr2 != null && bArr2.length == 8) {
                return;
            }
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }
}
