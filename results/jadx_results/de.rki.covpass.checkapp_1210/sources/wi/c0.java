package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class c0 extends f.b {

    /* renamed from: h */
    public static final BigInteger f25111h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: g */
    protected int[] f25112g;

    public c0() {
        this.f25112g = bj.g.e();
    }

    public c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25111h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f25112g = b0.d(bigInteger);
    }

    public c0(int[] iArr) {
        this.f25112g = iArr;
    }

    private static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        b0.g(iArr5, iArr3, iArr7);
        b0.g(iArr7, iArr, iArr7);
        b0.g(iArr4, iArr2, iArr6);
        b0.a(iArr6, iArr7, iArr6);
        b0.g(iArr4, iArr3, iArr7);
        bj.g.d(iArr6, iArr4);
        b0.g(iArr5, iArr2, iArr5);
        b0.a(iArr5, iArr7, iArr5);
        b0.n(iArr5, iArr6);
        b0.g(iArr6, iArr, iArr6);
    }

    private static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        bj.g.d(iArr, iArr4);
        int[] e10 = bj.g.e();
        int[] e11 = bj.g.e();
        for (int i10 = 0; i10 < 7; i10++) {
            bj.g.d(iArr2, e10);
            bj.g.d(iArr3, e11);
            int i11 = 1 << i10;
            while (true) {
                i11--;
                if (i11 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, e10, e11, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        b0.g(iArr2, iArr, iArr2);
        b0.r(iArr2, iArr2);
        b0.n(iArr, iArr4);
        b0.a(iArr3, iArr4, iArr);
        b0.g(iArr3, iArr4, iArr3);
        b0.m(bj.n.M(7, iArr3, 2, 0), iArr3);
    }

    private static boolean x(int[] iArr) {
        int[] e10 = bj.g.e();
        int[] e11 = bj.g.e();
        bj.g.d(iArr, e10);
        for (int i10 = 0; i10 < 7; i10++) {
            bj.g.d(e10, e11);
            b0.o(e10, 1 << i10, e10);
            b0.g(e10, e11, e10);
        }
        b0.o(e10, 95, e10);
        return bj.g.k(e10);
    }

    private static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e10 = bj.g.e();
        bj.g.d(iArr2, e10);
        int[] e11 = bj.g.e();
        e11[0] = 1;
        int[] e12 = bj.g.e();
        v(iArr, e10, e11, e12, iArr3);
        int[] e13 = bj.g.e();
        int[] e14 = bj.g.e();
        for (int i10 = 1; i10 < 96; i10++) {
            bj.g.d(e10, e13);
            bj.g.d(e11, e14);
            w(e10, e11, e12, iArr3);
            if (bj.g.l(e10)) {
                b0.e(e14, iArr3);
                b0.g(iArr3, e13, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] e10 = bj.g.e();
        b0.a(this.f25112g, ((c0) fVar).f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] e10 = bj.g.e();
        b0.b(this.f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] e10 = bj.g.e();
        b0.e(((c0) fVar).f25112g, e10);
        b0.g(e10, this.f25112g, e10);
        return new c0(e10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return bj.g.g(this.f25112g, ((c0) obj).f25112g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25111h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] e10 = bj.g.e();
        b0.e(this.f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.g.k(this.f25112g);
    }

    public int hashCode() {
        return f25111h.hashCode() ^ ak.a.J(this.f25112g, 0, 7);
    }

    @Override // ti.f
    public boolean i() {
        return bj.g.l(this.f25112g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] e10 = bj.g.e();
        b0.g(this.f25112g, ((c0) fVar).f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] e10 = bj.g.e();
        b0.i(this.f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25112g;
        if (bj.g.l(iArr) || bj.g.k(iArr)) {
            return this;
        }
        int[] e10 = bj.g.e();
        b0.i(iArr, e10);
        int[] n10 = bj.c.n(b0.f25104a);
        int[] e11 = bj.g.e();
        if (!x(iArr)) {
            return null;
        }
        while (!y(e10, n10, e11)) {
            b0.b(n10, n10);
        }
        b0.n(e11, n10);
        if (!bj.g.g(iArr, n10)) {
            return null;
        }
        return new c0(e11);
    }

    @Override // ti.f
    public ti.f o() {
        int[] e10 = bj.g.e();
        b0.n(this.f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] e10 = bj.g.e();
        b0.q(this.f25112g, ((c0) fVar).f25112g, e10);
        return new c0(e10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.g.i(this.f25112g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.g.u(this.f25112g);
    }
}
