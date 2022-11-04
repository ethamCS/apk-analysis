package gg;
/* loaded from: classes3.dex */
public abstract class l extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10849d = new a(l.class, 27);

    /* renamed from: c */
    final byte[] f10850c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return l.C(t1Var.F());
        }
    }

    public l(byte[] bArr, boolean z10) {
        this.f10850c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static l C(byte[] bArr) {
        return new n1(bArr, false);
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10850c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10850c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof l)) {
            return false;
        }
        return ak.a.c(this.f10850c, ((l) a0Var).f10850c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 27, this.f10850c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10850c.length);
    }

    public String toString() {
        return c();
    }
}
