package qh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class f0 implements org.bouncycastle.crypto.i0 {

    /* renamed from: i */
    private static final byte[] f19977i = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a */
    private vh.c f19978a;

    /* renamed from: b */
    private org.bouncycastle.crypto.i f19979b;

    /* renamed from: c */
    private zh.f1 f19980c;

    /* renamed from: d */
    private byte[] f19981d;

    /* renamed from: e */
    private boolean f19982e;

    /* renamed from: f */
    private SecureRandom f19983f;

    /* renamed from: g */
    org.bouncycastle.crypto.r f19984g = ei.a.b();

    /* renamed from: h */
    byte[] f19985h = new byte[20];

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f19984g.update(bArr, 0, bArr.length);
        this.f19984g.doFinal(this.f19985h, 0);
        System.arraycopy(this.f19985h, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        return ak.a.u(c(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        if (!this.f19982e) {
            if (bArr == null) {
                throw new org.bouncycastle.crypto.u("Null pointer as ciphertext");
            }
            if (i11 % this.f19978a.b() != 0) {
                throw new org.bouncycastle.crypto.u("Ciphertext not multiple of " + this.f19978a.b());
            }
            this.f19978a.init(false, new zh.f1(this.f19979b, f19977i));
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            for (int i12 = 0; i12 < i11 / this.f19978a.b(); i12++) {
                int b10 = this.f19978a.b() * i12;
                this.f19978a.a(bArr2, b10, bArr2, b10);
            }
            byte[] bArr3 = new byte[i11];
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                bArr3[i13] = bArr2[i11 - i14];
                i13 = i14;
            }
            byte[] bArr4 = new byte[8];
            this.f19981d = bArr4;
            int i15 = i11 - 8;
            byte[] bArr5 = new byte[i15];
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            System.arraycopy(bArr3, 8, bArr5, 0, i15);
            zh.f1 f1Var = new zh.f1(this.f19979b, this.f19981d);
            this.f19980c = f1Var;
            this.f19978a.init(false, f1Var);
            byte[] bArr6 = new byte[i15];
            System.arraycopy(bArr5, 0, bArr6, 0, i15);
            for (int i16 = 0; i16 < i15 / this.f19978a.b(); i16++) {
                int b11 = this.f19978a.b() * i16;
                this.f19978a.a(bArr6, b11, bArr6, b11);
            }
            int i17 = i15 - 8;
            byte[] bArr7 = new byte[i17];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr6, 0, bArr7, 0, i17);
            System.arraycopy(bArr6, i17, bArr8, 0, 8);
            if (!d(bArr7, bArr8)) {
                throw new org.bouncycastle.crypto.u("Checksum inside ciphertext is corrupted");
            }
            if (i17 - ((bArr7[0] & 255) + 1) <= 7) {
                int i18 = bArr7[0];
                byte[] bArr9 = new byte[i18];
                System.arraycopy(bArr7, 1, bArr9, 0, i18);
                return bArr9;
            }
            throw new org.bouncycastle.crypto.u("too many pad bytes (" + (i17 - ((bArr7[0] & 255) + 1)) + ")");
        }
        throw new IllegalStateException("Not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f19982e) {
            int i12 = i11 + 1;
            int i13 = i12 % 8;
            int i14 = i13 != 0 ? (8 - i13) + i12 : i12;
            byte[] bArr2 = new byte[i14];
            bArr2[0] = (byte) i11;
            System.arraycopy(bArr, i10, bArr2, 1, i11);
            int i15 = (i14 - i11) - 1;
            byte[] bArr3 = new byte[i15];
            if (i15 > 0) {
                this.f19983f.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i12, i15);
            }
            byte[] c10 = c(bArr2);
            int length = c10.length + i14;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i14);
            System.arraycopy(c10, 0, bArr4, i14, c10.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int b10 = length / this.f19978a.b();
            if (length % this.f19978a.b() != 0) {
                throw new IllegalStateException("Not multiple of block length");
            }
            this.f19978a.init(true, this.f19980c);
            for (int i16 = 0; i16 < b10; i16++) {
                int b11 = this.f19978a.b() * i16;
                this.f19978a.a(bArr5, b11, bArr5, b11);
            }
            byte[] bArr6 = this.f19981d;
            int length2 = bArr6.length + length;
            byte[] bArr7 = new byte[length2];
            System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
            System.arraycopy(bArr5, 0, bArr7, this.f19981d.length, length);
            byte[] bArr8 = new byte[length2];
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17 + 1;
                bArr8[i17] = bArr7[length2 - i18];
                i17 = i18;
            }
            this.f19978a.init(true, new zh.f1(this.f19979b, f19977i));
            for (int i19 = 0; i19 < b10 + 1; i19++) {
                int b12 = this.f19978a.b() * i19;
                this.f19978a.a(bArr8, b12, bArr8, b12);
            }
            return bArr8;
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f19982e = z10;
        this.f19978a = new vh.c(new e0());
        if (iVar instanceof zh.g1) {
            zh.g1 g1Var = (zh.g1) iVar;
            this.f19983f = g1Var.b();
            iVar = g1Var.a();
        } else {
            this.f19983f = org.bouncycastle.crypto.l.b();
        }
        if (!(iVar instanceof zh.f1)) {
            this.f19979b = iVar;
            if (!this.f19982e) {
                return;
            }
            byte[] bArr = new byte[8];
            this.f19981d = bArr;
            this.f19983f.nextBytes(bArr);
            this.f19980c = new zh.f1(this.f19979b, this.f19981d);
            return;
        }
        zh.f1 f1Var = (zh.f1) iVar;
        this.f19980c = f1Var;
        this.f19981d = f1Var.a();
        this.f19979b = this.f19980c.b();
        if (!this.f19982e) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.f19981d;
        if (bArr2 != null && bArr2.length == 8) {
            return;
        }
        throw new IllegalArgumentException("IV is not 8 octets");
    }
}
