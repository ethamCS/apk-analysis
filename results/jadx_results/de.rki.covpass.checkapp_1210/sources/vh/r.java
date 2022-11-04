package vh;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.a0;
import zh.f1;
/* loaded from: classes3.dex */
public class r implements vh.a {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f24290a;

    /* renamed from: b */
    private int f24291b;

    /* renamed from: c */
    private boolean f24292c;

    /* renamed from: d */
    private byte[] f24293d;

    /* renamed from: e */
    private byte[] f24294e;

    /* renamed from: f */
    private byte[] f24295f;

    /* renamed from: g */
    private byte[] f24296g;

    /* renamed from: h */
    private byte[] f24297h;

    /* renamed from: i */
    private byte[] f24298i;

    /* renamed from: j */
    private byte[] f24299j;

    /* renamed from: k */
    private byte[] f24300k;

    /* renamed from: l */
    private a f24301l;

    /* renamed from: m */
    private a f24302m;

    /* renamed from: n */
    private int f24303n;

    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
            r.this = r1;
        }

        public byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public r(org.bouncycastle.crypto.e eVar) {
        this(eVar, 4);
    }

    public r(org.bouncycastle.crypto.e eVar, int i10) {
        this.f24301l = new a();
        this.f24302m = new a();
        this.f24303n = 4;
        this.f24290a = eVar;
        this.f24291b = eVar.b();
        this.f24296g = new byte[eVar.b()];
        this.f24293d = new byte[eVar.b()];
        this.f24294e = new byte[eVar.b()];
        this.f24295f = new byte[eVar.b()];
        this.f24297h = new byte[eVar.b()];
        this.f24298i = new byte[eVar.b()];
        this.f24299j = new byte[eVar.b()];
        this.f24300k = new byte[eVar.b()];
        j(i10);
    }

    private void c(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            for (int i12 = 0; i12 < this.f24290a.b(); i12++) {
                byte[] bArr2 = this.f24295f;
                bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i10 + i12]);
            }
            org.bouncycastle.crypto.e eVar = this.f24290a;
            byte[] bArr3 = this.f24295f;
            eVar.a(bArr3, 0, bArr3, 0);
            i11 -= this.f24290a.b();
            i10 += this.f24290a.b();
        }
    }

    private void d(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = 0;
        while (true) {
            byte[] bArr3 = this.f24300k;
            if (i13 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f24299j;
            bArr4[i13] = (byte) (bArr4[i13] + bArr3[i13]);
            i13++;
        }
        this.f24290a.a(this.f24299j, 0, this.f24298i, 0);
        for (int i14 = 0; i14 < this.f24290a.b(); i14++) {
            bArr2[i12 + i14] = (byte) (this.f24298i[i14] ^ bArr[i10 + i14]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[LOOP:0: B:23:0x0040->B:25:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte e(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "0"
            if (r4 == 0) goto Lf
            java.lang.String r4 = "1"
            r0.append(r4)
            goto L12
        Lf:
            r0.append(r1)
        L12:
            r4 = 8
            if (r5 == r4) goto L33
            r4 = 16
            if (r5 == r4) goto L30
            r4 = 32
            if (r5 == r4) goto L2d
            r4 = 48
            if (r5 == r4) goto L2a
            r4 = 64
            if (r5 == r4) goto L27
            goto L38
        L27:
            java.lang.String r4 = "110"
            goto L35
        L2a:
            java.lang.String r4 = "101"
            goto L35
        L2d:
            java.lang.String r4 = "100"
            goto L35
        L30:
            java.lang.String r4 = "011"
            goto L35
        L33:
            java.lang.String r4 = "010"
        L35:
            r0.append(r4)
        L38:
            int r4 = r3.f24303n
            int r4 = r4 + (-1)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L40:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L56
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuffer r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L40
        L56:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.r.e(boolean, int):byte");
    }

    private void f(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >> 24);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11] = (byte) i10;
    }

    private void g(byte[] bArr, int i10, int i11, int i12) {
        if (i11 - i10 >= this.f24290a.b()) {
            if (i11 % this.f24290a.b() != 0) {
                throw new IllegalArgumentException("padding not supported");
            }
            byte[] bArr2 = this.f24296g;
            System.arraycopy(bArr2, 0, this.f24297h, 0, (bArr2.length - this.f24303n) - 1);
            f(i12, this.f24298i, 0);
            System.arraycopy(this.f24298i, 0, this.f24297h, (this.f24296g.length - this.f24303n) - 1, 4);
            byte[] bArr3 = this.f24297h;
            bArr3[bArr3.length - 1] = e(true, this.f24291b);
            this.f24290a.a(this.f24297h, 0, this.f24295f, 0);
            f(i11, this.f24298i, 0);
            if (i11 <= this.f24290a.b() - this.f24303n) {
                for (int i13 = 0; i13 < i11; i13++) {
                    byte[] bArr4 = this.f24298i;
                    int i14 = this.f24303n + i13;
                    bArr4[i14] = (byte) (bArr4[i14] ^ bArr[i10 + i13]);
                }
                for (int i15 = 0; i15 < this.f24290a.b(); i15++) {
                    byte[] bArr5 = this.f24295f;
                    bArr5[i15] = (byte) (bArr5[i15] ^ this.f24298i[i15]);
                }
                org.bouncycastle.crypto.e eVar = this.f24290a;
                byte[] bArr6 = this.f24295f;
                eVar.a(bArr6, 0, bArr6, 0);
                return;
            }
            for (int i16 = 0; i16 < this.f24290a.b(); i16++) {
                byte[] bArr7 = this.f24295f;
                bArr7[i16] = (byte) (bArr7[i16] ^ this.f24298i[i16]);
            }
            org.bouncycastle.crypto.e eVar2 = this.f24290a;
            byte[] bArr8 = this.f24295f;
            eVar2.a(bArr8, 0, bArr8, 0);
            while (i11 != 0) {
                for (int i17 = 0; i17 < this.f24290a.b(); i17++) {
                    byte[] bArr9 = this.f24295f;
                    bArr9[i17] = (byte) (bArr9[i17] ^ bArr[i17 + i10]);
                }
                org.bouncycastle.crypto.e eVar3 = this.f24290a;
                byte[] bArr10 = this.f24295f;
                eVar3.a(bArr10, 0, bArr10, 0);
                i10 += this.f24290a.b();
                i11 -= this.f24290a.b();
            }
            return;
        }
        throw new IllegalArgumentException("authText buffer too short");
    }

    private void j(int i10) {
        if (i10 == 4 || i10 == 6 || i10 == 8) {
            this.f24303n = i10;
            return;
        }
        throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        this.f24301l.write(bArr, i10, i11);
    }

    @Override // vh.b
    public byte[] b() {
        return ak.a.h(this.f24294e);
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        int h10 = h(this.f24302m.b(), 0, this.f24302m.size(), bArr, i10);
        i();
        return h10;
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24290a.getAlgorithmName() + "/KCCM";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        return i10 + this.f24291b;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24290a;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    public int h(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (bArr.length - i10 >= i11) {
            if (bArr2.length - i12 < i11) {
                throw new a0("output buffer too short");
            }
            if (this.f24301l.size() > 0) {
                if (this.f24292c) {
                    g(this.f24301l.b(), 0, this.f24301l.size(), this.f24302m.size());
                } else {
                    g(this.f24301l.b(), 0, this.f24301l.size(), this.f24302m.size() - this.f24291b);
                }
            }
            if (!this.f24292c) {
                if ((i11 - this.f24291b) % this.f24290a.b() != 0) {
                    throw new org.bouncycastle.crypto.o("partial blocks not supported");
                }
                this.f24290a.a(this.f24296g, 0, this.f24299j, 0);
                int b10 = i11 / this.f24290a.b();
                for (int i14 = 0; i14 < b10; i14++) {
                    d(bArr, i10, i11, bArr2, i12);
                    i10 += this.f24290a.b();
                    i12 += this.f24290a.b();
                }
                if (i11 > i10) {
                    int i15 = 0;
                    while (true) {
                        byte[] bArr3 = this.f24300k;
                        if (i15 >= bArr3.length) {
                            break;
                        }
                        byte[] bArr4 = this.f24299j;
                        bArr4[i15] = (byte) (bArr4[i15] + bArr3[i15]);
                        i15++;
                    }
                    this.f24290a.a(this.f24299j, 0, this.f24298i, 0);
                    int i16 = 0;
                    while (true) {
                        i13 = this.f24291b;
                        if (i16 >= i13) {
                            break;
                        }
                        bArr2[i12 + i16] = (byte) (this.f24298i[i16] ^ bArr[i10 + i16]);
                        i16++;
                    }
                    i12 += i13;
                }
                int i17 = 0;
                while (true) {
                    byte[] bArr5 = this.f24300k;
                    if (i17 >= bArr5.length) {
                        break;
                    }
                    byte[] bArr6 = this.f24299j;
                    bArr6[i17] = (byte) (bArr6[i17] + bArr5[i17]);
                    i17++;
                }
                this.f24290a.a(this.f24299j, 0, this.f24298i, 0);
                int i18 = this.f24291b;
                System.arraycopy(bArr2, i12 - i18, this.f24298i, 0, i18);
                c(bArr2, 0, i12 - this.f24291b);
                System.arraycopy(this.f24295f, 0, this.f24294e, 0, this.f24291b);
                int i19 = this.f24291b;
                byte[] bArr7 = new byte[i19];
                System.arraycopy(this.f24298i, 0, bArr7, 0, i19);
                if (!ak.a.u(this.f24294e, bArr7)) {
                    throw new org.bouncycastle.crypto.u("mac check failed");
                }
                i();
                return i11 - this.f24291b;
            } else if (i11 % this.f24290a.b() != 0) {
                throw new org.bouncycastle.crypto.o("partial blocks not supported");
            } else {
                c(bArr, i10, i11);
                this.f24290a.a(this.f24296g, 0, this.f24299j, 0);
                int i20 = i11;
                while (i20 > 0) {
                    d(bArr, i10, i11, bArr2, i12);
                    i20 -= this.f24290a.b();
                    i10 += this.f24290a.b();
                    i12 += this.f24290a.b();
                }
                int i21 = 0;
                while (true) {
                    byte[] bArr8 = this.f24300k;
                    if (i21 >= bArr8.length) {
                        break;
                    }
                    byte[] bArr9 = this.f24299j;
                    bArr9[i21] = (byte) (bArr9[i21] + bArr8[i21]);
                    i21++;
                }
                this.f24290a.a(this.f24299j, 0, this.f24298i, 0);
                int i22 = 0;
                while (true) {
                    int i23 = this.f24291b;
                    if (i22 >= i23) {
                        System.arraycopy(this.f24295f, 0, this.f24294e, 0, i23);
                        i();
                        return i11 + this.f24291b;
                    }
                    bArr2[i12 + i22] = (byte) (this.f24298i[i22] ^ this.f24295f[i22]);
                    i22++;
                }
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    public void i() {
        ak.a.y(this.f24297h, (byte) 0);
        ak.a.y(this.f24298i, (byte) 0);
        ak.a.y(this.f24300k, (byte) 0);
        ak.a.y(this.f24295f, (byte) 0);
        this.f24300k[0] = 1;
        this.f24302m.reset();
        this.f24301l.reset();
        byte[] bArr = this.f24293d;
        if (bArr != null) {
            a(bArr, 0, bArr.length);
        }
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            if (aVar.c() > 512 || aVar.c() < 64 || aVar.c() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.f24296g = aVar.d();
            this.f24291b = aVar.c() / 8;
            this.f24293d = aVar.a();
            iVar2 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Invalid parameters specified");
        } else {
            f1 f1Var = (f1) iVar;
            this.f24296g = f1Var.a();
            this.f24291b = this.f24290a.b();
            this.f24293d = null;
            iVar2 = f1Var.b();
        }
        this.f24294e = new byte[this.f24291b];
        this.f24292c = z10;
        this.f24290a.init(true, iVar2);
        this.f24300k[0] = 1;
        byte[] bArr = this.f24293d;
        if (bArr != null) {
            a(bArr, 0, bArr.length);
        }
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        this.f24302m.write(b10);
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length >= i10 + i11) {
            this.f24302m.write(bArr, i10, i11);
            return 0;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }
}
