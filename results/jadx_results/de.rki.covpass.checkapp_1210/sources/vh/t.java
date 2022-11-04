package vh;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.a0;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class t implements vh.a {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f24311a;

    /* renamed from: b */
    private org.bouncycastle.crypto.f f24312b;

    /* renamed from: d */
    private boolean f24314d;

    /* renamed from: e */
    private byte[] f24315e;

    /* renamed from: g */
    private byte[] f24317g;

    /* renamed from: h */
    private xh.a f24318h;

    /* renamed from: i */
    private long[] f24319i;

    /* renamed from: j */
    private final int f24320j;

    /* renamed from: k */
    private a f24321k = new a();

    /* renamed from: l */
    private a f24322l = new a();

    /* renamed from: c */
    private int f24313c = -1;

    /* renamed from: f */
    private byte[] f24316f = null;

    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
            t.this = r1;
        }

        public byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public t(org.bouncycastle.crypto.e eVar) {
        this.f24311a = eVar;
        this.f24312b = new org.bouncycastle.crypto.f(new s(eVar));
        int b10 = this.f24311a.b();
        this.f24320j = b10;
        this.f24315e = new byte[b10];
        this.f24317g = new byte[b10];
        this.f24318h = d(b10);
        this.f24319i = new long[b10 >>> 3];
    }

    private void c(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i11;
        while (i10 < i13) {
            h(this.f24319i, bArr, i10);
            this.f24318h.a(this.f24319i);
            i10 += this.f24320j;
        }
        long[] jArr = this.f24319i;
        jArr[0] = ((i12 & 4294967295L) << 3) ^ jArr[0];
        int i14 = this.f24320j >>> 4;
        jArr[i14] = jArr[i14] ^ ((4294967295L & i11) << 3);
        byte[] z10 = ak.l.z(jArr);
        this.f24316f = z10;
        this.f24311a.a(z10, 0, z10, 0);
    }

    private static xh.a d(int i10) {
        if (i10 != 16) {
            if (i10 == 32) {
                return new xh.g();
            }
            if (i10 != 64) {
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            return new xh.e();
        }
        return new xh.f();
    }

    private void e(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            h(this.f24319i, bArr, i10);
            this.f24318h.a(this.f24319i);
            i10 += this.f24320j;
        }
    }

    private static void h(long[] jArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = jArr[i11] ^ ak.l.p(bArr, i10);
            i10 += 8;
        }
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        this.f24321k.write(bArr, i10, i11);
    }

    @Override // vh.b
    public byte[] b() {
        int i10 = this.f24313c;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24316f, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int size = this.f24322l.size();
        if (this.f24314d || size >= this.f24313c) {
            byte[] bArr2 = new byte[this.f24320j];
            this.f24311a.a(bArr2, 0, bArr2, 0);
            long[] jArr = new long[this.f24320j >>> 3];
            ak.l.q(bArr2, 0, jArr);
            this.f24318h.b(jArr);
            ak.a.y(bArr2, (byte) 0);
            ak.a.C(jArr, 0L);
            int size2 = this.f24321k.size();
            if (size2 > 0) {
                e(this.f24321k.b(), 0, size2);
            }
            if (!this.f24314d) {
                int i12 = size - this.f24313c;
                if (bArr.length - i10 < i12) {
                    throw new a0("Output buffer too short");
                }
                c(this.f24322l.b(), 0, i12, size2);
                int h10 = this.f24312b.h(this.f24322l.b(), 0, i12, bArr, i10);
                i11 = h10 + this.f24312b.a(bArr, i10 + h10);
            } else if ((bArr.length - i10) - this.f24313c < size) {
                throw new a0("Output buffer too short");
            } else {
                int h11 = this.f24312b.h(this.f24322l.b(), 0, size, bArr, i10);
                i11 = h11 + this.f24312b.a(bArr, i10 + h11);
                c(bArr, i10, size, size2);
            }
            byte[] bArr3 = this.f24316f;
            if (bArr3 == null) {
                throw new IllegalStateException("mac is not calculated");
            }
            if (this.f24314d) {
                System.arraycopy(bArr3, 0, bArr, i10 + i11, this.f24313c);
                g();
                return i11 + this.f24313c;
            }
            byte[] bArr4 = new byte[this.f24313c];
            byte[] b10 = this.f24322l.b();
            int i13 = this.f24313c;
            System.arraycopy(b10, size - i13, bArr4, 0, i13);
            int i14 = this.f24313c;
            byte[] bArr5 = new byte[i14];
            System.arraycopy(this.f24316f, 0, bArr5, 0, i14);
            if (!ak.a.u(bArr4, bArr5)) {
                throw new org.bouncycastle.crypto.u("mac verification failed");
            }
            g();
            return i11;
        }
        throw new org.bouncycastle.crypto.u("data too short");
    }

    public void f(byte b10) {
        this.f24321k.write(b10);
    }

    public void g() {
        ak.a.C(this.f24319i, 0L);
        this.f24311a.reset();
        this.f24322l.reset();
        this.f24321k.reset();
        byte[] bArr = this.f24315e;
        if (bArr != null) {
            a(bArr, 0, bArr.length);
        }
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24311a.getAlgorithmName() + "/KGCM";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int size = i10 + this.f24322l.size();
        if (this.f24314d) {
            return size + this.f24313c;
        }
        int i11 = this.f24313c;
        if (size >= i11) {
            return size - i11;
        }
        return 0;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24311a;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        this.f24314d = z10;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            byte[] d10 = aVar.d();
            byte[] bArr = this.f24317g;
            ak.a.y(bArr, (byte) 0);
            System.arraycopy(d10, 0, this.f24317g, bArr.length - d10.length, d10.length);
            this.f24315e = aVar.a();
            int c10 = aVar.c();
            if (c10 < 64 || c10 > (this.f24320j << 3) || (c10 & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            this.f24313c = c10 >>> 3;
            b1Var = aVar.b();
            byte[] bArr2 = this.f24315e;
            if (bArr2 != null) {
                a(bArr2, 0, bArr2.length);
            }
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Invalid parameter passed");
        } else {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            byte[] bArr3 = this.f24317g;
            ak.a.y(bArr3, (byte) 0);
            System.arraycopy(a10, 0, this.f24317g, bArr3.length - a10.length, a10.length);
            this.f24315e = null;
            this.f24313c = this.f24320j;
            b1Var = (b1) f1Var.b();
        }
        this.f24316f = new byte[this.f24320j];
        this.f24312b.f(true, new f1(b1Var, this.f24317g));
        this.f24311a.init(true, b1Var);
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        this.f24322l.write(b10);
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length >= i10 + i11) {
            this.f24322l.write(bArr, i10, i11);
            return 0;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }
}
