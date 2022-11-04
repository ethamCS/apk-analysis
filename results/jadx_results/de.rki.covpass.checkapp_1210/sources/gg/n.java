package gg;

import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class n extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10860d = new a(n.class, 25);

    /* renamed from: c */
    final byte[] f10861c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return n.C(t1Var.F());
        }
    }

    public n(byte[] bArr, boolean z10) {
        Objects.requireNonNull(bArr, "'contents' cannot be null");
        this.f10861c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static n C(byte[] bArr) {
        return new p1(bArr, false);
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10861c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10861c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof n)) {
            return false;
        }
        return ak.a.c(this.f10861c, ((n) a0Var).f10861c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 25, this.f10861c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10861c.length);
    }
}
