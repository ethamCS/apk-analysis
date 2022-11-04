package qh;

import java.io.ByteArrayInputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a */
    org.bouncycastle.crypto.d f19936a;

    /* renamed from: b */
    org.bouncycastle.crypto.p f19937b;

    /* renamed from: c */
    org.bouncycastle.crypto.y f19938c;

    /* renamed from: d */
    org.bouncycastle.crypto.f f19939d;

    /* renamed from: e */
    byte[] f19940e;

    /* renamed from: f */
    boolean f19941f;

    /* renamed from: g */
    org.bouncycastle.crypto.i f19942g;

    /* renamed from: h */
    org.bouncycastle.crypto.i f19943h;

    /* renamed from: i */
    zh.x0 f19944i;

    /* renamed from: j */
    byte[] f19945j;

    /* renamed from: k */
    private sh.q f19946k;

    /* renamed from: l */
    private org.bouncycastle.crypto.x f19947l;

    /* renamed from: m */
    private byte[] f19948m;

    public c0(org.bouncycastle.crypto.d dVar, org.bouncycastle.crypto.p pVar, org.bouncycastle.crypto.y yVar) {
        this.f19936a = dVar;
        this.f19937b = pVar;
        this.f19938c = yVar;
        this.f19940e = new byte[yVar.getMacSize()];
        this.f19939d = null;
    }

    public c0(org.bouncycastle.crypto.d dVar, org.bouncycastle.crypto.p pVar, org.bouncycastle.crypto.y yVar, org.bouncycastle.crypto.f fVar) {
        this.f19936a = dVar;
        this.f19937b = pVar;
        this.f19938c = yVar;
        this.f19940e = new byte[yVar.getMacSize()];
        this.f19939d = fVar;
    }

    private byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        int i12;
        if (i11 >= this.f19945j.length + this.f19938c.getMacSize()) {
            if (this.f19939d == null) {
                int length = (i11 - this.f19945j.length) - this.f19938c.getMacSize();
                byte[] bArr4 = new byte[length];
                int c10 = this.f19944i.c() / 8;
                bArr2 = new byte[c10];
                int i13 = length + c10;
                byte[] bArr5 = new byte[i13];
                this.f19937b.generateBytes(bArr5, 0, i13);
                if (this.f19945j.length != 0) {
                    System.arraycopy(bArr5, 0, bArr2, 0, c10);
                    System.arraycopy(bArr5, c10, bArr4, 0, length);
                } else {
                    System.arraycopy(bArr5, 0, bArr4, 0, length);
                    System.arraycopy(bArr5, length, bArr2, 0, c10);
                }
                bArr3 = new byte[length];
                for (int i14 = 0; i14 != length; i14++) {
                    bArr3[i14] = (byte) (bArr[(this.f19945j.length + i10) + i14] ^ bArr4[i14]);
                }
                i12 = 0;
            } else {
                int d10 = ((zh.y0) this.f19944i).d() / 8;
                byte[] bArr6 = new byte[d10];
                int c11 = this.f19944i.c() / 8;
                bArr2 = new byte[c11];
                int i15 = d10 + c11;
                byte[] bArr7 = new byte[i15];
                this.f19937b.generateBytes(bArr7, 0, i15);
                System.arraycopy(bArr7, 0, bArr6, 0, d10);
                System.arraycopy(bArr7, d10, bArr2, 0, c11);
                org.bouncycastle.crypto.i b1Var = new zh.b1(bArr6);
                byte[] bArr8 = this.f19948m;
                if (bArr8 != null) {
                    b1Var = new zh.f1(b1Var, bArr8);
                }
                this.f19939d.f(false, b1Var);
                bArr3 = new byte[this.f19939d.c((i11 - this.f19945j.length) - this.f19938c.getMacSize())];
                org.bouncycastle.crypto.f fVar = this.f19939d;
                byte[] bArr9 = this.f19945j;
                i12 = fVar.h(bArr, i10 + bArr9.length, (i11 - bArr9.length) - this.f19938c.getMacSize(), bArr3, 0);
            }
            byte[] b10 = this.f19944i.b();
            byte[] bArr10 = null;
            if (this.f19945j.length != 0) {
                bArr10 = e(b10);
            }
            int i16 = i10 + i11;
            byte[] w9 = ak.a.w(bArr, i16 - this.f19938c.getMacSize(), i16);
            int length2 = w9.length;
            byte[] bArr11 = new byte[length2];
            this.f19938c.init(new zh.b1(bArr2));
            org.bouncycastle.crypto.y yVar = this.f19938c;
            byte[] bArr12 = this.f19945j;
            yVar.update(bArr, i10 + bArr12.length, (i11 - bArr12.length) - length2);
            if (b10 != null) {
                this.f19938c.update(b10, 0, b10.length);
            }
            if (this.f19945j.length != 0) {
                this.f19938c.update(bArr10, 0, bArr10.length);
            }
            this.f19938c.doFinal(bArr11, 0);
            if (!ak.a.u(w9, bArr11)) {
                throw new org.bouncycastle.crypto.u("invalid MAC");
            }
            org.bouncycastle.crypto.f fVar2 = this.f19939d;
            return fVar2 == null ? bArr3 : ak.a.w(bArr3, 0, i12 + fVar2.a(bArr3, i12));
        }
        throw new org.bouncycastle.crypto.u("Length of input must be greater than the MAC and V combined");
    }

    private byte[] b(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        org.bouncycastle.crypto.i iVar;
        org.bouncycastle.crypto.f fVar;
        if (this.f19939d == null) {
            byte[] bArr4 = new byte[i11];
            int c10 = this.f19944i.c() / 8;
            bArr2 = new byte[c10];
            int i12 = i11 + c10;
            byte[] bArr5 = new byte[i12];
            this.f19937b.generateBytes(bArr5, 0, i12);
            if (this.f19945j.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, c10);
                System.arraycopy(bArr5, c10, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i11);
                System.arraycopy(bArr5, i11, bArr2, 0, c10);
            }
            bArr3 = new byte[i11];
            for (int i13 = 0; i13 != i11; i13++) {
                bArr3[i13] = (byte) (bArr[i10 + i13] ^ bArr4[i13]);
            }
        } else {
            int d10 = ((zh.y0) this.f19944i).d() / 8;
            byte[] bArr6 = new byte[d10];
            int c11 = this.f19944i.c() / 8;
            byte[] bArr7 = new byte[c11];
            int i14 = d10 + c11;
            byte[] bArr8 = new byte[i14];
            this.f19937b.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr6, 0, d10);
            System.arraycopy(bArr8, d10, bArr7, 0, c11);
            if (this.f19948m != null) {
                fVar = this.f19939d;
                iVar = new zh.f1(new zh.b1(bArr6), this.f19948m);
            } else {
                fVar = this.f19939d;
                iVar = new zh.b1(bArr6);
            }
            fVar.f(true, iVar);
            bArr3 = new byte[this.f19939d.c(i11)];
            int h10 = this.f19939d.h(bArr, i10, i11, bArr3, 0);
            i11 = h10 + this.f19939d.a(bArr3, h10);
            bArr2 = bArr7;
        }
        byte[] b10 = this.f19944i.b();
        byte[] bArr9 = null;
        if (this.f19945j.length != 0) {
            bArr9 = e(b10);
        }
        int macSize = this.f19938c.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.f19938c.init(new zh.b1(bArr2));
        this.f19938c.update(bArr3, 0, bArr3.length);
        if (b10 != null) {
            this.f19938c.update(b10, 0, b10.length);
        }
        if (this.f19945j.length != 0) {
            this.f19938c.update(bArr9, 0, bArr9.length);
        }
        this.f19938c.doFinal(bArr10, 0);
        byte[] bArr11 = this.f19945j;
        byte[] bArr12 = new byte[bArr11.length + i11 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.f19945j.length, i11);
        System.arraycopy(bArr10, 0, bArr12, this.f19945j.length + i11, macSize);
        return bArr12;
    }

    private void c(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f19948m = f1Var.a();
            iVar = f1Var.b();
        } else {
            this.f19948m = null;
        }
        this.f19944i = (zh.x0) iVar;
    }

    public org.bouncycastle.crypto.f d() {
        return this.f19939d;
    }

    protected byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            ak.l.s(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public org.bouncycastle.crypto.y f() {
        return this.f19938c;
    }

    public void g(zh.b bVar, org.bouncycastle.crypto.i iVar, org.bouncycastle.crypto.x xVar) {
        this.f19941f = false;
        this.f19942g = bVar;
        this.f19947l = xVar;
        c(iVar);
    }

    public void h(zh.b bVar, org.bouncycastle.crypto.i iVar, sh.q qVar) {
        this.f19941f = true;
        this.f19943h = bVar;
        this.f19946k = qVar;
        c(iVar);
    }

    public void i(boolean z10, org.bouncycastle.crypto.i iVar, org.bouncycastle.crypto.i iVar2, org.bouncycastle.crypto.i iVar3) {
        this.f19941f = z10;
        this.f19942g = iVar;
        this.f19943h = iVar2;
        this.f19945j = new byte[0];
        c(iVar3);
    }

    public byte[] j(byte[] bArr, int i10, int i11) {
        if (this.f19941f) {
            sh.q qVar = this.f19946k;
            if (qVar != null) {
                org.bouncycastle.crypto.s a10 = qVar.a();
                this.f19942g = a10.b().a();
                this.f19945j = a10.a();
            }
        } else if (this.f19947l != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.f19943h = this.f19947l.a(byteArrayInputStream);
                this.f19945j = ak.a.w(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e10) {
                throw new org.bouncycastle.crypto.u("unable to recover ephemeral public key: " + e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                throw new org.bouncycastle.crypto.u("unable to recover ephemeral public key: " + e11.getMessage(), e11);
            }
        }
        this.f19936a.init(this.f19942g);
        byte[] b10 = ak.b.b(this.f19936a.a(), this.f19936a.b(this.f19943h));
        byte[] bArr2 = this.f19945j;
        if (bArr2.length != 0) {
            byte[] p10 = ak.a.p(bArr2, b10);
            ak.a.y(b10, (byte) 0);
            b10 = p10;
        }
        try {
            this.f19937b.init(new zh.a1(b10, this.f19944i.a()));
            return this.f19941f ? b(bArr, i10, i11) : a(bArr, i10, i11);
        } finally {
            ak.a.y(b10, (byte) 0);
        }
    }
}
