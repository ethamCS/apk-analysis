package gg;
/* loaded from: classes3.dex */
public abstract class r0 extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10878d = new a(r0.class, 21);

    /* renamed from: c */
    final byte[] f10879c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return r0.C(t1Var.F());
        }
    }

    public r0(byte[] bArr, boolean z10) {
        this.f10879c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static r0 C(byte[] bArr) {
        return new d2(bArr, false);
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10879c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10879c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof r0)) {
            return false;
        }
        return ak.a.c(this.f10879c, ((r0) a0Var).f10879c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 21, this.f10879c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10879c.length);
    }
}
