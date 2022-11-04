package vh;

import org.bouncycastle.crypto.a0;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class n implements a {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f24239a;

    /* renamed from: b */
    private wh.c f24240b;

    /* renamed from: c */
    private wh.b f24241c;

    /* renamed from: d */
    private boolean f24242d;

    /* renamed from: e */
    private boolean f24243e;

    /* renamed from: f */
    private int f24244f;

    /* renamed from: g */
    private byte[] f24245g;

    /* renamed from: h */
    private byte[] f24246h;

    /* renamed from: i */
    private byte[] f24247i;

    /* renamed from: j */
    private byte[] f24248j;

    /* renamed from: k */
    private byte[] f24249k;

    /* renamed from: l */
    private byte[] f24250l;

    /* renamed from: m */
    private byte[] f24251m;

    /* renamed from: n */
    private byte[] f24252n;

    /* renamed from: o */
    private byte[] f24253o;

    /* renamed from: p */
    private byte[] f24254p;

    /* renamed from: q */
    private byte[] f24255q;

    /* renamed from: r */
    private int f24256r;

    /* renamed from: s */
    private int f24257s;

    /* renamed from: t */
    private long f24258t;

    /* renamed from: u */
    private byte[] f24259u;

    /* renamed from: v */
    private int f24260v;

    /* renamed from: w */
    private long f24261w;

    /* renamed from: x */
    private long f24262x;

    public n(org.bouncycastle.crypto.e eVar) {
        this(eVar, null);
    }

    public n(org.bouncycastle.crypto.e eVar, wh.c cVar) {
        if (eVar.b() == 16) {
            cVar = cVar == null ? new wh.e() : cVar;
            this.f24239a = eVar;
            this.f24240b = cVar;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private void c() {
        if (!this.f24243e) {
            if (!this.f24242d) {
                throw new IllegalStateException("GCM cipher needs to be initialised");
            }
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
    }

    private void d(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 16) {
            g(bArr, bArr2, i11, Math.min(i10 - i11, 16));
        }
    }

    private void e(byte[] bArr, byte[] bArr2) {
        wh.d.p(bArr, bArr2);
        this.f24240b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i10) {
        wh.d.q(bArr, bArr2, i10);
        this.f24240b.b(bArr);
    }

    private void g(byte[] bArr, byte[] bArr2, int i10, int i11) {
        wh.d.r(bArr, bArr2, i10, i11);
        this.f24240b.b(bArr);
    }

    private void h(byte[] bArr) {
        int i10 = this.f24256r;
        if (i10 != 0) {
            this.f24256r = i10 - 1;
            byte[] bArr2 = this.f24255q;
            int i11 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i11;
            int i12 = (i11 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i12;
            int i13 = (i12 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i13;
            bArr2[12] = (byte) ((i13 >>> 8) + (bArr2[12] & 255));
            this.f24239a.a(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void i() {
        if (this.f24261w > 0) {
            System.arraycopy(this.f24253o, 0, this.f24254p, 0, 16);
            this.f24262x = this.f24261w;
        }
        int i10 = this.f24260v;
        if (i10 > 0) {
            g(this.f24254p, this.f24259u, 0, i10);
            this.f24262x += this.f24260v;
        }
        if (this.f24262x > 0) {
            System.arraycopy(this.f24254p, 0, this.f24252n, 0, 16);
        }
    }

    private void k(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr2.length - i11 >= 16) {
            if (this.f24258t == 0) {
                i();
            }
            byte[] bArr3 = new byte[16];
            h(bArr3);
            if (this.f24242d) {
                wh.d.q(bArr3, bArr, i10);
                e(this.f24252n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i11, 16);
            } else {
                f(this.f24252n, bArr, i10);
                wh.d.o(bArr3, 0, bArr, i10, bArr2, i11);
            }
            this.f24258t += 16;
            return;
        }
        throw new a0("Output buffer too short");
    }

    private void l(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = new byte[16];
        h(bArr3);
        if (this.f24242d) {
            wh.d.n(bArr, i10, bArr3, 0, i11);
            g(this.f24252n, bArr, i10, i11);
        } else {
            g(this.f24252n, bArr, i10, i11);
            wh.d.n(bArr, i10, bArr3, 0, i11);
        }
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        this.f24258t += i11;
    }

    private void n(boolean z10) {
        this.f24239a.reset();
        this.f24252n = new byte[16];
        this.f24253o = new byte[16];
        this.f24254p = new byte[16];
        this.f24259u = new byte[16];
        this.f24260v = 0;
        this.f24261w = 0L;
        this.f24262x = 0L;
        this.f24255q = ak.a.h(this.f24249k);
        this.f24256r = -2;
        this.f24257s = 0;
        this.f24258t = 0L;
        byte[] bArr = this.f24250l;
        if (bArr != null) {
            ak.a.y(bArr, (byte) 0);
        }
        if (z10) {
            this.f24251m = null;
        }
        if (this.f24242d) {
            this.f24243e = false;
            return;
        }
        byte[] bArr2 = this.f24247i;
        if (bArr2 == null) {
            return;
        }
        a(bArr2, 0, bArr2.length);
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        c();
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f24259u;
            int i13 = this.f24260v;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f24260v = i14;
            if (i14 == 16) {
                e(this.f24253o, bArr2);
                this.f24260v = 0;
                this.f24261w += 16;
            }
        }
    }

    @Override // vh.b
    public byte[] b() {
        byte[] bArr = this.f24251m;
        return bArr == null ? new byte[this.f24244f] : ak.a.h(bArr);
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        c();
        if (this.f24258t == 0) {
            i();
        }
        int i11 = this.f24257s;
        if (!this.f24242d) {
            int i12 = this.f24244f;
            if (i11 < i12) {
                throw new org.bouncycastle.crypto.u("data too short");
            }
            i11 -= i12;
            if (bArr.length - i10 < i11) {
                throw new a0("Output buffer too short");
            }
        } else if (bArr.length - i10 < this.f24244f + i11) {
            throw new a0("Output buffer too short");
        }
        if (i11 > 0) {
            l(this.f24250l, 0, i11, bArr, i10);
        }
        long j10 = this.f24261w;
        int i13 = this.f24260v;
        long j11 = j10 + i13;
        this.f24261w = j11;
        if (j11 > this.f24262x) {
            if (i13 > 0) {
                g(this.f24253o, this.f24259u, 0, i13);
            }
            if (this.f24262x > 0) {
                wh.d.p(this.f24253o, this.f24254p);
            }
            long j12 = ((this.f24258t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f24241c == null) {
                wh.a aVar = new wh.a();
                this.f24241c = aVar;
                aVar.a(this.f24248j);
            }
            this.f24241c.b(j12, bArr2);
            wh.d.i(this.f24253o, bArr2);
            wh.d.p(this.f24252n, this.f24253o);
        }
        byte[] bArr3 = new byte[16];
        ak.l.s(this.f24261w * 8, bArr3, 0);
        ak.l.s(this.f24258t * 8, bArr3, 8);
        e(this.f24252n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f24239a.a(this.f24249k, 0, bArr4, 0);
        wh.d.p(bArr4, this.f24252n);
        int i14 = this.f24244f;
        byte[] bArr5 = new byte[i14];
        this.f24251m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i14);
        if (this.f24242d) {
            System.arraycopy(this.f24251m, 0, bArr, i10 + this.f24257s, this.f24244f);
            i11 += this.f24244f;
        } else {
            int i15 = this.f24244f;
            byte[] bArr6 = new byte[i15];
            System.arraycopy(this.f24250l, i11, bArr6, 0, i15);
            if (!ak.a.u(this.f24251m, bArr6)) {
                throw new org.bouncycastle.crypto.u("mac check in GCM failed");
            }
        }
        n(false);
        return i11;
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24239a.getAlgorithmName() + "/GCM";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f24257s;
        if (this.f24242d) {
            return i11 + this.f24244f;
        }
        int i12 = this.f24244f;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return 0;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24239a;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f24257s;
        if (!this.f24242d) {
            int i12 = this.f24244f;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        byte[] bArr;
        byte[] bArr2;
        this.f24242d = z10;
        this.f24251m = null;
        this.f24243e = true;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            bArr = aVar.d();
            this.f24247i = aVar.a();
            int c10 = aVar.c();
            if (c10 < 32 || c10 > 128 || c10 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            this.f24244f = c10 / 8;
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            this.f24247i = null;
            this.f24244f = 16;
            b1Var = (b1) f1Var.b();
        }
        this.f24250l = new byte[z10 ? 16 : this.f24244f + 16];
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z10 && (bArr2 = this.f24246h) != null && ak.a.c(bArr2, bArr)) {
            if (b1Var == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr3 = this.f24245g;
            if (bArr3 != null && ak.a.c(bArr3, b1Var.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f24246h = bArr;
        if (b1Var != null) {
            this.f24245g = b1Var.a();
        }
        if (b1Var != null) {
            this.f24239a.init(true, b1Var);
            byte[] bArr4 = new byte[16];
            this.f24248j = bArr4;
            this.f24239a.a(bArr4, 0, bArr4, 0);
            this.f24240b.a(this.f24248j);
            this.f24241c = null;
        } else if (this.f24248j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr5 = new byte[16];
        this.f24249k = bArr5;
        byte[] bArr6 = this.f24246h;
        if (bArr6.length == 12) {
            System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
            this.f24249k[15] = 1;
        } else {
            d(bArr5, bArr6, bArr6.length);
            byte[] bArr7 = new byte[16];
            ak.l.s(this.f24246h.length * 8, bArr7, 8);
            e(this.f24249k, bArr7);
        }
        this.f24252n = new byte[16];
        this.f24253o = new byte[16];
        this.f24254p = new byte[16];
        this.f24259u = new byte[16];
        this.f24260v = 0;
        this.f24261w = 0L;
        this.f24262x = 0L;
        this.f24255q = ak.a.h(this.f24249k);
        this.f24256r = -2;
        this.f24257s = 0;
        this.f24258t = 0L;
        byte[] bArr8 = this.f24247i;
        if (bArr8 == null) {
            return;
        }
        a(bArr8, 0, bArr8.length);
    }

    public void j(byte b10) {
        c();
        byte[] bArr = this.f24259u;
        int i10 = this.f24260v;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f24260v = i11;
        if (i11 == 16) {
            e(this.f24253o, bArr);
            this.f24260v = 0;
            this.f24261w += 16;
        }
    }

    public void m() {
        n(true);
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        c();
        byte[] bArr2 = this.f24250l;
        int i11 = this.f24257s;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.f24257s = i12;
        if (i12 == bArr2.length) {
            k(bArr2, 0, bArr, i10);
            if (this.f24242d) {
                this.f24257s = 0;
            } else {
                byte[] bArr3 = this.f24250l;
                System.arraycopy(bArr3, 16, bArr3, 0, this.f24244f);
                this.f24257s = this.f24244f;
            }
            return 16;
        }
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        c();
        if (bArr.length - i10 >= i11) {
            if (this.f24242d) {
                if (this.f24257s != 0) {
                    while (i11 > 0) {
                        i11--;
                        byte[] bArr3 = this.f24250l;
                        int i14 = this.f24257s;
                        int i15 = i10 + 1;
                        bArr3[i14] = bArr[i10];
                        int i16 = i14 + 1;
                        this.f24257s = i16;
                        if (i16 == 16) {
                            k(bArr3, 0, bArr2, i12);
                            this.f24257s = 0;
                            i13 = 16;
                            i10 = i15;
                            break;
                        }
                        i10 = i15;
                    }
                }
                i13 = 0;
                while (i11 >= 16) {
                    k(bArr, i10, bArr2, i12 + i13);
                    i10 += 16;
                    i11 -= 16;
                    i13 += 16;
                }
                if (i11 > 0) {
                    System.arraycopy(bArr, i10, this.f24250l, 0, i11);
                    this.f24257s = i11;
                }
            } else {
                i13 = 0;
                for (int i17 = 0; i17 < i11; i17++) {
                    byte[] bArr4 = this.f24250l;
                    int i18 = this.f24257s;
                    bArr4[i18] = bArr[i10 + i17];
                    int i19 = i18 + 1;
                    this.f24257s = i19;
                    if (i19 == bArr4.length) {
                        k(bArr4, 0, bArr2, i12 + i13);
                        byte[] bArr5 = this.f24250l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f24244f);
                        this.f24257s = this.f24244f;
                        i13 += 16;
                    }
                }
            }
            return i13;
        }
        throw new org.bouncycastle.crypto.o("Input buffer too short");
    }
}
