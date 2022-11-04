package yd;

import java.io.InputStream;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import yd.q;
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    private final byte[] f26102a;

    /* renamed from: b */
    private final boolean f26103b;

    /* renamed from: c */
    private int f26104c;

    /* renamed from: d */
    private int f26105d;

    /* renamed from: e */
    private int f26106e;

    /* renamed from: f */
    private final InputStream f26107f;

    /* renamed from: g */
    private int f26108g;

    /* renamed from: h */
    private boolean f26109h;

    /* renamed from: i */
    private int f26110i;

    /* renamed from: j */
    private int f26111j;

    /* renamed from: k */
    private int f26112k;

    /* renamed from: l */
    private int f26113l;

    /* renamed from: m */
    private int f26114m;

    /* renamed from: n */
    private a f26115n;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    private e(InputStream inputStream) {
        this.f26109h = false;
        this.f26111j = Integer.MAX_VALUE;
        this.f26113l = 64;
        this.f26114m = 67108864;
        this.f26115n = null;
        this.f26102a = new byte[4096];
        this.f26104c = 0;
        this.f26106e = 0;
        this.f26110i = 0;
        this.f26107f = inputStream;
        this.f26103b = false;
    }

    private e(p pVar) {
        this.f26109h = false;
        this.f26111j = Integer.MAX_VALUE;
        this.f26113l = 64;
        this.f26114m = 67108864;
        this.f26115n = null;
        this.f26102a = pVar.f26163d;
        int J = pVar.J();
        this.f26106e = J;
        this.f26104c = J + pVar.size();
        this.f26110i = -this.f26106e;
        this.f26107f = null;
        this.f26103b = true;
    }

    public static int B(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw k.p();
            }
            i11 |= (read & 127) << i12;
            if ((read & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw k.p();
            }
            if ((read2 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw k.h();
    }

    private void N() {
        int i10 = this.f26104c + this.f26105d;
        this.f26104c = i10;
        int i11 = this.f26110i + i10;
        int i12 = this.f26111j;
        if (i11 <= i12) {
            this.f26105d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f26105d = i13;
        this.f26104c = i10 - i13;
    }

    private void O(int i10) {
        if (T(i10)) {
            return;
        }
        throw k.p();
    }

    private void S(int i10) {
        if (i10 >= 0) {
            int i11 = this.f26110i;
            int i12 = this.f26106e;
            int i13 = i11 + i12 + i10;
            int i14 = this.f26111j;
            if (i13 > i14) {
                R((i14 - i11) - i12);
                throw k.p();
            }
            int i15 = this.f26104c;
            int i16 = i15 - i12;
            this.f26106e = i15;
            while (true) {
                O(1);
                int i17 = i10 - i16;
                int i18 = this.f26104c;
                if (i17 <= i18) {
                    this.f26106e = i17;
                    return;
                } else {
                    i16 += i18;
                    this.f26106e = i18;
                }
            }
        } else {
            throw k.i();
        }
    }

    private boolean T(int i10) {
        int i11 = this.f26106e;
        if (i11 + i10 <= this.f26104c) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        } else if (this.f26110i + i11 + i10 > this.f26111j) {
            return false;
        } else {
            a aVar = this.f26115n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f26107f != null) {
                int i12 = this.f26106e;
                if (i12 > 0) {
                    int i13 = this.f26104c;
                    if (i13 > i12) {
                        byte[] bArr = this.f26102a;
                        System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                    }
                    this.f26110i += i12;
                    this.f26104c -= i12;
                    this.f26106e = 0;
                }
                InputStream inputStream = this.f26107f;
                byte[] bArr2 = this.f26102a;
                int i14 = this.f26104c;
                int read = inputStream.read(bArr2, i14, bArr2.length - i14);
                if (read == 0 || read < -1 || read > this.f26102a.length) {
                    StringBuilder sb3 = new StringBuilder(102);
                    sb3.append("InputStream#read(byte[]) returned invalid result: ");
                    sb3.append(read);
                    sb3.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb3.toString());
                } else if (read > 0) {
                    this.f26104c += read;
                    if ((this.f26110i + i10) - this.f26114m > 0) {
                        throw k.n();
                    }
                    N();
                    if (this.f26104c < i10) {
                        return T(i10);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) {
        if (this.f26104c - this.f26106e < i10) {
            O(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    public static e h(p pVar) {
        e eVar = new e(pVar);
        try {
            eVar.j(pVar.size());
            return eVar;
        } catch (k e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private byte[] x(int i10) {
        if (i10 <= 0) {
            if (i10 != 0) {
                throw k.i();
            }
            return j.f26151a;
        }
        int i11 = this.f26110i;
        int i12 = this.f26106e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f26111j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw k.p();
        } else if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f26104c - i12;
            System.arraycopy(this.f26102a, i12, bArr, 0, i15);
            this.f26106e = this.f26104c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f26102a, 0, bArr, i15, i16);
            this.f26106e = i16;
            return bArr;
        } else {
            int i17 = this.f26104c;
            this.f26110i = i11 + i17;
            this.f26106e = 0;
            this.f26104c = 0;
            int i18 = i17 - i12;
            int i19 = i10 - i18;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i19 > 0) {
                int min = Math.min(i19, 4096);
                byte[] bArr2 = new byte[min];
                int i20 = 0;
                while (i20 < min) {
                    InputStream inputStream = this.f26107f;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i20, min - i20);
                    if (read == -1) {
                        throw k.p();
                    }
                    this.f26110i += read;
                    i20 += read;
                }
                i19 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(this.f26102a, i12, bArr3, 0, i18);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i18, bArr4.length);
                i18 += bArr4.length;
            }
            return bArr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r2[r3] < 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A() {
        /*
            r9 = this;
            int r0 = r9.f26106e
            int r1 = r9.f26104c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f26102a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f26106e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.D()
            int r0 = (int) r0
            return r0
        L82:
            r9.f26106e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r2[r0] < 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.C():long");
    }

    long D() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte w9 = w();
            j10 |= (w9 & Byte.MAX_VALUE) << i10;
            if ((w9 & 128) == 0) {
                return j10;
            }
        }
        throw k.h();
    }

    public int E() {
        return y();
    }

    public long F() {
        return z();
    }

    public int G() {
        return b(A());
    }

    public long H() {
        return c(C());
    }

    public String I() {
        int A = A();
        int i10 = this.f26104c;
        int i11 = this.f26106e;
        if (A > i10 - i11 || A <= 0) {
            return A == 0 ? BuildConfig.FLAVOR : new String(x(A), "UTF-8");
        }
        String str = new String(this.f26102a, i11, A, "UTF-8");
        this.f26106e += A;
        return str;
    }

    public String J() {
        byte[] bArr;
        int A = A();
        int i10 = this.f26106e;
        if (A <= this.f26104c - i10 && A > 0) {
            bArr = this.f26102a;
            this.f26106e = i10 + A;
        } else if (A == 0) {
            return BuildConfig.FLAVOR;
        } else {
            bArr = x(A);
            i10 = 0;
        }
        if (y.f(bArr, i10, i10 + A)) {
            return new String(bArr, i10, A, "UTF-8");
        }
        throw k.f();
    }

    public int K() {
        if (f()) {
            this.f26108g = 0;
            return 0;
        }
        int A = A();
        this.f26108g = A;
        if (z.a(A) == 0) {
            throw k.e();
        }
        return this.f26108g;
    }

    public int L() {
        return A();
    }

    public long M() {
        return C();
    }

    public boolean P(int i10, f fVar) {
        int b10 = z.b(i10);
        if (b10 == 0) {
            long t10 = t();
            fVar.o0(i10);
            fVar.z0(t10);
            return true;
        } else if (b10 == 1) {
            long z10 = z();
            fVar.o0(i10);
            fVar.V(z10);
            return true;
        } else if (b10 == 2) {
            d l10 = l();
            fVar.o0(i10);
            fVar.P(l10);
            return true;
        } else if (b10 == 3) {
            fVar.o0(i10);
            Q(fVar);
            int c10 = z.c(z.a(i10), 4);
            a(c10);
            fVar.o0(c10);
            return true;
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 != 5) {
                throw k.g();
            }
            int y10 = y();
            fVar.o0(i10);
            fVar.U(y10);
            return true;
        }
    }

    public void Q(f fVar) {
        int K;
        do {
            K = K();
            if (K == 0) {
                return;
            }
        } while (P(K, fVar));
    }

    public void R(int i10) {
        int i11 = this.f26104c;
        int i12 = this.f26106e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f26106e = i12 + i10;
        }
    }

    public void a(int i10) {
        if (this.f26108g == i10) {
            return;
        }
        throw k.c();
    }

    public int e() {
        int i10 = this.f26111j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f26110i + this.f26106e);
    }

    public boolean f() {
        return this.f26106e == this.f26104c && !T(1);
    }

    public void i(int i10) {
        this.f26111j = i10;
        N();
    }

    public int j(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f26110i + this.f26106e;
            int i12 = this.f26111j;
            if (i11 > i12) {
                throw k.p();
            }
            this.f26111j = i11;
            N();
            return i12;
        }
        throw k.i();
    }

    public boolean k() {
        return C() != 0;
    }

    public d l() {
        int A = A();
        int i10 = this.f26104c;
        int i11 = this.f26106e;
        if (A > i10 - i11 || A <= 0) {
            return A == 0 ? d.f26096c : new p(x(A));
        }
        d e10 = (!this.f26103b || !this.f26109h) ? d.e(this.f26102a, i11, A) : new c(this.f26102a, this.f26106e, A);
        this.f26106e += A;
        return e10;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public int n() {
        return A();
    }

    public int o() {
        return y();
    }

    public long p() {
        return z();
    }

    public float q() {
        return Float.intBitsToFloat(y());
    }

    public void r(int i10, q.a aVar, g gVar) {
        int i11 = this.f26112k;
        if (i11 < this.f26113l) {
            this.f26112k = i11 + 1;
            aVar.s(this, gVar);
            a(z.c(i10, 4));
            this.f26112k--;
            return;
        }
        throw k.j();
    }

    public int s() {
        return A();
    }

    public long t() {
        return C();
    }

    public <T extends q> T u(s<T> sVar, g gVar) {
        int A = A();
        if (this.f26112k < this.f26113l) {
            int j10 = j(A);
            this.f26112k++;
            T d10 = sVar.d(this, gVar);
            a(0);
            this.f26112k--;
            i(j10);
            return d10;
        }
        throw k.j();
    }

    public void v(q.a aVar, g gVar) {
        int A = A();
        if (this.f26112k < this.f26113l) {
            int j10 = j(A);
            this.f26112k++;
            aVar.s(this, gVar);
            a(0);
            this.f26112k--;
            i(j10);
            return;
        }
        throw k.j();
    }

    public byte w() {
        if (this.f26106e == this.f26104c) {
            O(1);
        }
        byte[] bArr = this.f26102a;
        int i10 = this.f26106e;
        this.f26106e = i10 + 1;
        return bArr[i10];
    }

    public int y() {
        int i10 = this.f26106e;
        if (this.f26104c - i10 < 4) {
            O(4);
            i10 = this.f26106e;
        }
        byte[] bArr = this.f26102a;
        this.f26106e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() {
        int i10 = this.f26106e;
        if (this.f26104c - i10 < 8) {
            O(8);
            i10 = this.f26106e;
        }
        byte[] bArr = this.f26102a;
        this.f26106e = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
