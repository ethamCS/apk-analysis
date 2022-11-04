package ui;

import bj.h;
import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class c extends f.b {

    /* renamed from: h */
    public static final BigInteger f23802h = h.J(b.f23800a);

    /* renamed from: i */
    private static final int[] f23803i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: g */
    protected int[] f23804g;

    public c() {
        this.f23804g = h.i();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f23802h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f23804g = b.d(bigInteger);
    }

    public c(int[] iArr) {
        this.f23804g = iArr;
    }

    @Override // ti.f
    public f a(f fVar) {
        int[] i10 = h.i();
        b.a(this.f23804g, ((c) fVar).f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f b() {
        int[] i10 = h.i();
        b.b(this.f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f d(f fVar) {
        int[] i10 = h.i();
        b.e(((c) fVar).f23804g, i10);
        b.g(i10, this.f23804g, i10);
        return new c(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return h.n(this.f23804g, ((c) obj).f23804g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f23802h.bitLength();
    }

    @Override // ti.f
    public f g() {
        int[] i10 = h.i();
        b.e(this.f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public boolean h() {
        return h.t(this.f23804g);
    }

    public int hashCode() {
        return f23802h.hashCode() ^ ak.a.J(this.f23804g, 0, 8);
    }

    @Override // ti.f
    public boolean i() {
        return h.v(this.f23804g);
    }

    @Override // ti.f
    public f j(f fVar) {
        int[] i10 = h.i();
        b.g(this.f23804g, ((c) fVar).f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f m() {
        int[] i10 = h.i();
        b.i(this.f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f n() {
        int[] iArr = this.f23804g;
        if (h.v(iArr) || h.t(iArr)) {
            return this;
        }
        int[] i10 = h.i();
        b.n(iArr, i10);
        b.g(i10, iArr, i10);
        b.n(i10, i10);
        b.g(i10, iArr, i10);
        int[] i11 = h.i();
        b.n(i10, i11);
        b.g(i11, iArr, i11);
        int[] i12 = h.i();
        b.o(i11, 3, i12);
        b.g(i12, i10, i12);
        b.o(i12, 4, i10);
        b.g(i10, i11, i10);
        b.o(i10, 4, i12);
        b.g(i12, i11, i12);
        b.o(i12, 15, i11);
        b.g(i11, i12, i11);
        b.o(i11, 30, i12);
        b.g(i12, i11, i12);
        b.o(i12, 60, i11);
        b.g(i11, i12, i11);
        b.o(i11, 11, i12);
        b.g(i12, i10, i12);
        b.o(i12, 120, i10);
        b.g(i10, i11, i10);
        b.n(i10, i10);
        b.n(i10, i11);
        if (h.n(iArr, i11)) {
            return new c(i10);
        }
        b.g(i10, f23803i, i10);
        b.n(i10, i11);
        if (!h.n(iArr, i11)) {
            return null;
        }
        return new c(i10);
    }

    @Override // ti.f
    public f o() {
        int[] i10 = h.i();
        b.n(this.f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f r(f fVar) {
        int[] i10 = h.i();
        b.r(this.f23804g, ((c) fVar).f23804g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public boolean s() {
        return h.q(this.f23804g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return h.J(this.f23804g);
    }
}
