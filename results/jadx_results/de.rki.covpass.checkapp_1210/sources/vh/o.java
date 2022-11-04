package vh;

import java.io.ByteArrayOutputStream;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class o implements vh.a {

    /* renamed from: a */
    private final org.bouncycastle.crypto.e f24263a;

    /* renamed from: b */
    private final wh.c f24264b;

    /* renamed from: c */
    private final byte[] f24265c;

    /* renamed from: d */
    private final byte[] f24266d;

    /* renamed from: e */
    private final c f24267e;

    /* renamed from: f */
    private final c f24268f;

    /* renamed from: g */
    private b f24269g;

    /* renamed from: h */
    private b f24270h;

    /* renamed from: i */
    private boolean f24271i;

    /* renamed from: j */
    private byte[] f24272j;

    /* renamed from: k */
    private byte[] f24273k;

    /* renamed from: l */
    private int f24274l;

    /* renamed from: m */
    private byte[] f24275m;

    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        b() {
        }

        void b() {
            ak.a.y(e(), (byte) 0);
        }

        byte[] e() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a */
        private final byte[] f24276a;

        /* renamed from: b */
        private final byte[] f24277b;

        /* renamed from: c */
        private int f24278c;

        /* renamed from: d */
        private long f24279d;

        private c() {
            o.this = r1;
            this.f24276a = new byte[16];
            this.f24277b = new byte[1];
        }

        void a() {
            if (this.f24278c > 0) {
                ak.a.y(o.this.f24266d, (byte) 0);
                o.o(this.f24276a, 0, this.f24278c, o.this.f24266d);
                o oVar = o.this;
                oVar.p(oVar.f24266d);
            }
        }

        long b() {
            return this.f24279d;
        }

        void c() {
            this.f24278c = 0;
            this.f24279d = 0L;
        }

        void d(byte b10) {
            byte[] bArr = this.f24277b;
            bArr[0] = b10;
            e(bArr, 0, 1);
        }

        void e(byte[] bArr, int i10, int i11) {
            int i12;
            int i13 = this.f24278c;
            int i14 = 16 - i13;
            int i15 = 0;
            if (i13 <= 0 || i11 < i14) {
                i12 = i11;
            } else {
                System.arraycopy(bArr, i10, this.f24276a, i13, i14);
                o.o(this.f24276a, 0, 16, o.this.f24266d);
                o oVar = o.this;
                oVar.p(oVar.f24266d);
                i12 = i11 - i14;
                this.f24278c = 0;
                i15 = i14 + 0;
            }
            while (i12 >= 16) {
                o.o(bArr, i10 + i15, 16, o.this.f24266d);
                o oVar2 = o.this;
                oVar2.p(oVar2.f24266d);
                i15 += i14;
                i12 -= i14;
            }
            if (i12 > 0) {
                System.arraycopy(bArr, i10 + i15, this.f24276a, this.f24278c, i12);
                this.f24278c += i12;
            }
            this.f24279d += i11;
        }
    }

    public o(org.bouncycastle.crypto.e eVar) {
        this(eVar, new wh.e());
    }

    public o(org.bouncycastle.crypto.e eVar, wh.c cVar) {
        this.f24265c = new byte[16];
        this.f24266d = new byte[16];
        this.f24275m = new byte[16];
        if (eVar.b() == 16) {
            this.f24263a = eVar;
            this.f24264b = cVar;
            this.f24267e = new c();
            this.f24268f = new c();
            return;
        }
        throw new IllegalArgumentException("Cipher required with a block size of 16.");
    }

    private static int f(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private byte[] g() {
        this.f24268f.a();
        byte[] k10 = k();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 12; i10++) {
            k10[i10] = (byte) (k10[i10] ^ this.f24273k[i10]);
        }
        k10[15] = (byte) (k10[15] & (-129));
        this.f24263a.a(k10, 0, bArr, 0);
        return bArr;
    }

    private void h(int i10) {
        int i11 = this.f24274l;
        if ((i11 & 1) != 0) {
            if ((i11 & 2) != 0) {
                throw new IllegalStateException("AEAD data cannot be processed after ordinary data");
            }
            if (this.f24267e.b() - Long.MIN_VALUE > (2147483623 - i10) - Long.MIN_VALUE) {
                throw new IllegalStateException("AEAD byte count exceeded");
            }
            return;
        }
        throw new IllegalStateException("Cipher is not initialised");
    }

    private static void i(byte[] bArr, int i10, int i11, boolean z10) {
        int f10 = f(bArr);
        int i12 = i10 + i11;
        if ((i11 < 0 || i10 < 0 || i12 < 0) || i12 > f10) {
            if (!z10) {
                throw new org.bouncycastle.crypto.o("Input buffer too short.");
            }
        }
    }

    private void j(int i10) {
        int i11 = this.f24274l;
        if ((i11 & 1) != 0) {
            if ((i11 & 2) == 0) {
                this.f24267e.a();
                this.f24274l |= 2;
            }
            long j10 = 2147483623;
            long size = this.f24269g.size();
            if (!this.f24271i) {
                j10 = 2147483639;
                size = this.f24270h.size();
            }
            if (size - Long.MIN_VALUE > (j10 - i10) - Long.MIN_VALUE) {
                throw new IllegalStateException("byte count exceeded");
            }
            return;
        }
        throw new IllegalStateException("Cipher is not initialised");
    }

    private byte[] k() {
        byte[] bArr = new byte[16];
        q();
        o(this.f24265c, 0, 16, bArr);
        return bArr;
    }

    private void l() {
        byte[] e10 = this.f24270h.e();
        int size = this.f24270h.size() - 16;
        if (size >= 0) {
            byte[] w9 = ak.a.w(e10, size, size + 16);
            byte[] h10 = ak.a.h(w9);
            h10[15] = (byte) (h10[15] | Byte.MIN_VALUE);
            byte[] bArr = new byte[16];
            int i10 = 0;
            while (size > 0) {
                this.f24263a.a(h10, 0, bArr, 0);
                int min = Math.min(16, size);
                w(bArr, e10, i10, min);
                this.f24269g.write(bArr, 0, min);
                this.f24268f.e(bArr, 0, min);
                size -= min;
                i10 += min;
                r(h10);
            }
            byte[] g10 = g();
            if (!ak.a.u(g10, w9)) {
                t();
                throw new org.bouncycastle.crypto.u("mac check failed");
            }
            byte[] bArr2 = this.f24275m;
            System.arraycopy(g10, 0, bArr2, 0, bArr2.length);
            return;
        }
        throw new org.bouncycastle.crypto.u("Data too short");
    }

    private void m(b1 b1Var) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int length = b1Var.a().length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(this.f24273k, 0, bArr, 4, 12);
        this.f24263a.init(true, b1Var);
        this.f24263a.a(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f24263a.a(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 8, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f24263a.a(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f24263a.a(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 8, 8);
        if (length == 32) {
            bArr[0] = (byte) (bArr[0] + 1);
            this.f24263a.a(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 16, 8);
            bArr[0] = (byte) (bArr[0] + 1);
            this.f24263a.a(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 24, 8);
        }
        this.f24263a.init(true, new b1(bArr4));
        o(bArr3, 0, 16, bArr2);
        s(bArr2);
        this.f24264b.a(bArr2);
        this.f24274l |= 1;
    }

    private int n(byte[] bArr, byte[] bArr2, int i10) {
        byte[] e10 = this.f24269g.e();
        byte[] h10 = ak.a.h(bArr);
        h10[15] = (byte) (h10[15] | Byte.MIN_VALUE);
        byte[] bArr3 = new byte[16];
        int size = this.f24269g.size();
        int i11 = 0;
        while (size > 0) {
            this.f24263a.a(h10, 0, bArr3, 0);
            int min = Math.min(16, size);
            w(bArr3, e10, i11, min);
            System.arraycopy(bArr3, 0, bArr2, i10 + i11, min);
            size -= min;
            i11 += min;
            r(h10);
        }
        return this.f24269g.size();
    }

    public static void o(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 0;
        int i13 = 15;
        while (i12 < i11) {
            bArr2[i13] = bArr[i10 + i12];
            i12++;
            i13--;
        }
    }

    public void p(byte[] bArr) {
        v(this.f24265c, bArr);
        this.f24264b.b(this.f24265c);
    }

    private void q() {
        byte[] bArr = new byte[16];
        ak.l.s(this.f24268f.b() * 8, bArr, 0);
        ak.l.s(this.f24267e.b() * 8, bArr, 8);
        p(bArr);
    }

    private static void r(byte[] bArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            byte b10 = (byte) (bArr[i10] + 1);
            bArr[i10] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private static void s(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            byte b10 = bArr[i11];
            bArr[i11] = (byte) (i10 | ((b10 >> 1) & 127));
            i10 = (b10 & 1) == 0 ? 0 : -128;
        }
        if (i10 != 0) {
            bArr[0] = (byte) (bArr[0] ^ (-31));
        }
    }

    private void u() {
        b bVar = this.f24269g;
        if (bVar != null) {
            bVar.b();
        }
        this.f24267e.c();
        this.f24268f.c();
        this.f24269g = new b();
        this.f24270h = this.f24271i ? null : new b();
        this.f24274l &= -3;
        ak.a.y(this.f24265c, (byte) 0);
        byte[] bArr = this.f24272j;
        if (bArr != null) {
            this.f24267e.e(bArr, 0, bArr.length);
        }
    }

    private static void v(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    private static void w(byte[] bArr, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12 + i10]);
        }
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        h(i11);
        i(bArr, i10, i11, false);
        this.f24267e.e(bArr, i10, i11);
    }

    @Override // vh.b
    public byte[] b() {
        return ak.a.h(this.f24275m);
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        j(0);
        i(bArr, i10, getOutputSize(0), true);
        if (!this.f24271i) {
            l();
            int size = this.f24269g.size();
            System.arraycopy(this.f24269g.e(), 0, bArr, i10, size);
            u();
            return size;
        }
        byte[] g10 = g();
        int n10 = n(g10, bArr, i10) + 16;
        System.arraycopy(g10, 0, bArr, i10 + this.f24269g.size(), 16);
        byte[] bArr2 = this.f24275m;
        System.arraycopy(g10, 0, bArr2, 0, bArr2.length);
        u();
        return n10;
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24263a.getAlgorithmName() + "-GCM-SIV";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        if (this.f24271i) {
            return i10 + this.f24269g.size() + 16;
        }
        int size = i10 + this.f24270h.size();
        if (size <= 16) {
            return 0;
        }
        return size - 16;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24263a;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        byte[] bArr;
        byte[] bArr2;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            bArr2 = aVar.a();
            bArr = aVar.d();
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM-SIV");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            b1Var = (b1) f1Var.b();
            bArr2 = null;
        }
        if (bArr == null || bArr.length != 12) {
            throw new IllegalArgumentException("Invalid nonce");
        }
        if (b1Var == null || !(b1Var.a().length == 16 || b1Var.a().length == 32)) {
            throw new IllegalArgumentException("Invalid key");
        }
        this.f24271i = z10;
        this.f24272j = bArr2;
        this.f24273k = bArr;
        m(b1Var);
        u();
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        j(1);
        if (!this.f24271i) {
            this.f24270h.write(b10);
            return 0;
        }
        this.f24269g.write(b10);
        this.f24268f.d(b10);
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        j(i11);
        i(bArr, i10, i11, false);
        if (this.f24271i) {
            this.f24269g.write(bArr, i10, i11);
            this.f24268f.e(bArr, i10, i11);
        } else {
            this.f24270h.write(bArr, i10, i11);
        }
        return 0;
    }

    public void t() {
        u();
    }
}
