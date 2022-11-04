package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class l extends h {

    /* renamed from: c */
    private static final Logger f7938c = Logger.getLogger(l.class.getName());

    /* renamed from: d */
    private static final boolean f7939d = s1.C();

    /* renamed from: a */
    m f7940a;

    /* renamed from: b */
    private boolean f7941b;

    /* loaded from: classes.dex */
    public static class b extends l {

        /* renamed from: e */
        private final byte[] f7942e;

        /* renamed from: f */
        private final int f7943f;

        /* renamed from: g */
        private final int f7944g;

        /* renamed from: h */
        private int f7945h;

        b(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.f7942e = bArr;
                this.f7943f = i10;
                this.f7945h = i10;
                this.f7944g = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void A0(int i10, s0 s0Var, h1 h1Var) {
            M0(i10, 2);
            O0(((com.google.crypto.tink.shaded.protobuf.a) s0Var).d(h1Var));
            h1Var.d(s0Var, this.f7940a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void B0(int i10, s0 s0Var) {
            M0(1, 3);
            N0(2, i10);
            T0(3, s0Var);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void C0(int i10, i iVar) {
            M0(1, 3);
            N0(2, i10);
            j0(3, iVar);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void L0(int i10, String str) {
            M0(i10, 2);
            V0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void M0(int i10, int i11) {
            O0(u1.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void N0(int i10, int i11) {
            M0(i10, 0);
            O0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void O0(int i10) {
            if (!l.f7939d || d.c() || f0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f7942e;
                        int i11 = this.f7945h;
                        this.f7945h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f7942e;
                int i12 = this.f7945h;
                this.f7945h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } else if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f7942e;
                int i13 = this.f7945h;
                this.f7945h = i13 + 1;
                s1.H(bArr3, i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f7942e;
                int i14 = this.f7945h;
                this.f7945h = i14 + 1;
                s1.H(bArr4, i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & (-128)) == 0) {
                    byte[] bArr5 = this.f7942e;
                    int i16 = this.f7945h;
                    this.f7945h = i16 + 1;
                    s1.H(bArr5, i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f7942e;
                int i17 = this.f7945h;
                this.f7945h = i17 + 1;
                s1.H(bArr6, i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & (-128)) == 0) {
                    byte[] bArr7 = this.f7942e;
                    int i19 = this.f7945h;
                    this.f7945h = i19 + 1;
                    s1.H(bArr7, i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f7942e;
                int i20 = this.f7945h;
                this.f7945h = i20 + 1;
                s1.H(bArr8, i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & (-128)) == 0) {
                    byte[] bArr9 = this.f7942e;
                    int i22 = this.f7945h;
                    this.f7945h = i22 + 1;
                    s1.H(bArr9, i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f7942e;
                int i23 = this.f7945h;
                this.f7945h = i23 + 1;
                s1.H(bArr10, i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f7942e;
                int i24 = this.f7945h;
                this.f7945h = i24 + 1;
                s1.H(bArr11, i24, (byte) (i21 >>> 7));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void P0(int i10, long j10) {
            M0(i10, 0);
            Q0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void Q0(long j10) {
            if (l.f7939d && f0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f7942e;
                    int i10 = this.f7945h;
                    this.f7945h = i10 + 1;
                    s1.H(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f7942e;
                int i11 = this.f7945h;
                this.f7945h = i11 + 1;
                s1.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f7942e;
                    int i12 = this.f7945h;
                    this.f7945h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), 1), e10);
                }
            }
            byte[] bArr4 = this.f7942e;
            int i13 = this.f7945h;
            this.f7945h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void R0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f7942e, this.f7945h, i11);
                this.f7945h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), Integer.valueOf(i11)), e10);
            }
        }

        public final void S0(i iVar) {
            O0(iVar.size());
            iVar.j0(this);
        }

        public final void T0(int i10, s0 s0Var) {
            M0(i10, 2);
            U0(s0Var);
        }

        public final void U0(s0 s0Var) {
            O0(s0Var.e());
            s0Var.k(this);
        }

        public final void V0(String str) {
            int f10;
            int i10 = this.f7945h;
            try {
                int W = l.W(str.length() * 3);
                int W2 = l.W(str.length());
                if (W2 == W) {
                    int i11 = i10 + W2;
                    this.f7945h = i11;
                    f10 = t1.f(str, this.f7942e, i11, f0());
                    this.f7945h = i10;
                    O0((f10 - i10) - W2);
                } else {
                    O0(t1.g(str));
                    f10 = t1.f(str, this.f7942e, this.f7945h, f0());
                }
                this.f7945h = f10;
            } catch (t1.d e10) {
                this.f7945h = i10;
                b0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l, com.google.crypto.tink.shaded.protobuf.h
        public final void a(byte[] bArr, int i10, int i11) {
            R0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final int f0() {
            return this.f7944g - this.f7945h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void g0(byte b10) {
            try {
                byte[] bArr = this.f7942e;
                int i10 = this.f7945h;
                this.f7945h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void h0(int i10, boolean z10) {
            M0(i10, 0);
            g0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void j0(int i10, i iVar) {
            M0(i10, 2);
            S0(iVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void o0(int i10, int i11) {
            M0(i10, 5);
            p0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void p0(int i10) {
            try {
                byte[] bArr = this.f7942e;
                int i11 = this.f7945h;
                int i12 = i11 + 1;
                this.f7945h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f7945h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f7945h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f7945h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void q0(int i10, long j10) {
            M0(i10, 1);
            r0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void r0(long j10) {
            try {
                byte[] bArr = this.f7942e;
                int i10 = this.f7945h;
                int i11 = i10 + 1;
                this.f7945h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f7945h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f7945h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f7945h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f7945h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f7945h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f7945h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f7945h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7945h), Integer.valueOf(this.f7944g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void w0(int i10, int i11) {
            M0(i10, 0);
            x0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l
        public final void x0(int i10) {
            if (i10 >= 0) {
                O0(i10);
            } else {
                Q0(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private l() {
    }

    public static int A(int i10, f0 f0Var) {
        return U(i10) + B(f0Var);
    }

    public static int B(f0 f0Var) {
        return C(f0Var.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, s0 s0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, s0Var);
    }

    public static int E(int i10, s0 s0Var) {
        return U(i10) + G(s0Var);
    }

    public static int F(int i10, s0 s0Var, h1 h1Var) {
        return U(i10) + H(s0Var, h1Var);
    }

    public static int G(s0 s0Var) {
        return C(s0Var.e());
    }

    public static int H(s0 s0Var, h1 h1Var) {
        return C(((com.google.crypto.tink.shaded.protobuf.a) s0Var).d(h1Var));
    }

    public static int I(int i10, i iVar) {
        return (U(1) * 2) + V(2, i10) + g(3, iVar);
    }

    @Deprecated
    public static int J(int i10) {
        return W(i10);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int i10;
        try {
            i10 = t1.g(str);
        } catch (t1.d unused) {
            i10 = str.getBytes(b0.f7822a).length;
        }
        return C(i10);
    }

    public static int U(int i10) {
        return W(u1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static l d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static l e0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, i iVar) {
        return U(i10) + h(iVar);
    }

    public static int h(i iVar) {
        return C(iVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    public static int s(int i10, s0 s0Var, h1 h1Var) {
        return (U(i10) * 2) + u(s0Var, h1Var);
    }

    @Deprecated
    public static int t(s0 s0Var) {
        return s0Var.e();
    }

    @Deprecated
    static int u(s0 s0Var, h1 h1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) s0Var).d(h1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, f0 f0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, f0Var);
    }

    public abstract void A0(int i10, s0 s0Var, h1 h1Var);

    public abstract void B0(int i10, s0 s0Var);

    public abstract void C0(int i10, i iVar);

    public final void D0(int i10, int i11) {
        o0(i10, i11);
    }

    public final void E0(int i10) {
        p0(i10);
    }

    public final void F0(int i10, long j10) {
        q0(i10, j10);
    }

    public final void G0(long j10) {
        r0(j10);
    }

    public final void H0(int i10, int i11) {
        N0(i10, Z(i11));
    }

    public final void I0(int i10) {
        O0(Z(i10));
    }

    public final void J0(int i10, long j10) {
        P0(i10, a0(j10));
    }

    public final void K0(long j10) {
        Q0(a0(j10));
    }

    public abstract void L0(int i10, String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j10);

    public abstract void Q0(long j10);

    @Override // com.google.crypto.tink.shaded.protobuf.h
    public abstract void a(byte[] bArr, int i10, int i11);

    final void b0(String str, t1.d dVar) {
        f7938c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(b0.f7822a);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new c(e11);
        }
    }

    public final void c() {
        if (f0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public boolean c0() {
        return this.f7941b;
    }

    public abstract int f0();

    public abstract void g0(byte b10);

    public abstract void h0(int i10, boolean z10);

    public final void i0(boolean z10) {
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void j0(int i10, i iVar);

    public final void k0(int i10, double d10) {
        q0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void l0(double d10) {
        r0(Double.doubleToRawLongBits(d10));
    }

    public final void m0(int i10, int i11) {
        w0(i10, i11);
    }

    public final void n0(int i10) {
        x0(i10);
    }

    public abstract void o0(int i10, int i11);

    public abstract void p0(int i10);

    public abstract void q0(int i10, long j10);

    public abstract void r0(long j10);

    public final void s0(int i10, float f10) {
        o0(i10, Float.floatToRawIntBits(f10));
    }

    public final void t0(float f10) {
        p0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void u0(int i10, s0 s0Var, h1 h1Var) {
        M0(i10, 3);
        v0(s0Var, h1Var);
        M0(i10, 4);
    }

    @Deprecated
    final void v0(s0 s0Var, h1 h1Var) {
        h1Var.d(s0Var, this.f7940a);
    }

    public abstract void w0(int i10, int i11);

    public abstract void x0(int i10);

    public final void y0(int i10, long j10) {
        P0(i10, j10);
    }

    public final void z0(long j10) {
        Q0(j10);
    }
}
