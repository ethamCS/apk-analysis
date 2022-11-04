package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    int f7891a;

    /* renamed from: b */
    int f7892b;

    /* renamed from: c */
    int f7893c;

    /* renamed from: d */
    k f7894d;

    /* renamed from: e */
    private boolean f7895e;

    /* loaded from: classes.dex */
    public static final class b extends j {

        /* renamed from: f */
        private final byte[] f7896f;

        /* renamed from: g */
        private final boolean f7897g;

        /* renamed from: h */
        private int f7898h;

        /* renamed from: i */
        private int f7899i;

        /* renamed from: j */
        private int f7900j;

        /* renamed from: k */
        private int f7901k;

        /* renamed from: l */
        private int f7902l;

        /* renamed from: m */
        private boolean f7903m;

        /* renamed from: n */
        private int f7904n;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f7904n = Integer.MAX_VALUE;
            this.f7896f = bArr;
            this.f7898h = i11 + i10;
            this.f7900j = i10;
            this.f7901k = i10;
            this.f7897g = z10;
        }

        private void K() {
            int i10 = this.f7898h + this.f7899i;
            this.f7898h = i10;
            int i11 = i10 - this.f7901k;
            int i12 = this.f7904n;
            if (i11 <= i12) {
                this.f7899i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f7899i = i13;
            this.f7898h = i10 - i13;
        }

        private void N() {
            if (this.f7898h - this.f7900j >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f7896f;
                int i11 = this.f7900j;
                this.f7900j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw c0.g();
        }

        private void P() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw c0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int A() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long B() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean C(int i10) {
            int b10 = u1.b(i10);
            if (b10 == 0) {
                N();
                return true;
            } else if (b10 == 1) {
                M(8);
                return true;
            } else if (b10 == 2) {
                M(H());
                return true;
            } else if (b10 == 3) {
                L();
                a(u1.c(u1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 != 5) {
                    throw c0.f();
                }
                M(4);
                return true;
            }
        }

        public byte D() {
            int i10 = this.f7900j;
            if (i10 != this.f7898h) {
                byte[] bArr = this.f7896f;
                this.f7900j = i10 + 1;
                return bArr[i10];
            }
            throw c0.n();
        }

        public byte[] E(int i10) {
            if (i10 > 0) {
                int i11 = this.f7898h;
                int i12 = this.f7900j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f7900j = i13;
                    return Arrays.copyOfRange(this.f7896f, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 != 0) {
                    throw c0.h();
                }
                return b0.f7824c;
            }
            throw c0.n();
        }

        public int F() {
            int i10 = this.f7900j;
            if (this.f7898h - i10 >= 4) {
                byte[] bArr = this.f7896f;
                this.f7900j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw c0.n();
        }

        public long G() {
            int i10 = this.f7900j;
            if (this.f7898h - i10 >= 8) {
                byte[] bArr = this.f7896f;
                this.f7900j = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw c0.n();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
            if (r2[r3] < 0) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f7900j
                int r1 = r5.f7898h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f7896f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f7900j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r0 = (int) r0
                return r0
            L70:
                r5.f7900j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
            if (r2[r0] < 0) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long I() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.I():long");
        }

        long J() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte D = D();
                j10 |= (D & Byte.MAX_VALUE) << i10;
                if ((D & 128) == 0) {
                    return j10;
                }
            }
            throw c0.g();
        }

        public void L() {
            int z10;
            do {
                z10 = z();
                if (z10 == 0) {
                    return;
                }
            } while (C(z10));
        }

        public void M(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7898h;
                int i12 = this.f7900j;
                if (i10 <= i11 - i12) {
                    this.f7900j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw c0.h();
            }
            throw c0.n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void a(int i10) {
            if (this.f7902l == i10) {
                return;
            }
            throw c0.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int d() {
            return this.f7900j - this.f7901k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean e() {
            return this.f7900j == this.f7898h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void i(int i10) {
            this.f7904n = i10;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int j(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f7904n;
                if (d10 > i11) {
                    throw c0.n();
                }
                this.f7904n = d10;
                K();
                return i11;
            }
            throw c0.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean k() {
            return I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public i l() {
            int H = H();
            if (H > 0) {
                int i10 = this.f7898h;
                int i11 = this.f7900j;
                if (H <= i10 - i11) {
                    i k10 = (!this.f7897g || !this.f7903m) ? i.k(this.f7896f, i11, H) : i.i0(this.f7896f, i11, H);
                    this.f7900j += H;
                    return k10;
                }
            }
            return H == 0 ? i.f7878d : i.h0(E(H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int n() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int o() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long p() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int r() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long s() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int t() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long u() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int v() {
            return j.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long w() {
            return j.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String x() {
            int H = H();
            if (H > 0) {
                int i10 = this.f7898h;
                int i11 = this.f7900j;
                if (H <= i10 - i11) {
                    String str = new String(this.f7896f, i11, H, b0.f7822a);
                    this.f7900j += H;
                    return str;
                }
            }
            if (H == 0) {
                return BuildConfig.FLAVOR;
            }
            if (H >= 0) {
                throw c0.n();
            }
            throw c0.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String y() {
            int H = H();
            if (H > 0) {
                int i10 = this.f7898h;
                int i11 = this.f7900j;
                if (H <= i10 - i11) {
                    String e10 = t1.e(this.f7896f, i11, H);
                    this.f7900j += H;
                    return e10;
                }
            }
            if (H == 0) {
                return BuildConfig.FLAVOR;
            }
            if (H > 0) {
                throw c0.n();
            }
            throw c0.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int z() {
            if (e()) {
                this.f7902l = 0;
                return 0;
            }
            int H = H();
            this.f7902l = H;
            if (u1.a(H) == 0) {
                throw c0.c();
            }
            return this.f7902l;
        }
    }

    private j() {
        this.f7892b = 100;
        this.f7893c = Integer.MAX_VALUE;
        this.f7895e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    public static j h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (c0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
