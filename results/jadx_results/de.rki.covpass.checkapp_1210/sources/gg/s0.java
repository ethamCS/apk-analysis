package gg;
/* loaded from: classes3.dex */
public abstract class s0 extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10887d = new a(s0.class, 26);

    /* renamed from: c */
    final byte[] f10888c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return s0.C(t1Var.F());
        }
    }

    public s0(byte[] bArr, boolean z10) {
        this.f10888c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static s0 C(byte[] bArr) {
        return new e2(bArr, false);
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10888c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10888c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof s0)) {
            return false;
        }
        return ak.a.c(this.f10888c, ((s0) a0Var).f10888c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 26, this.f10888c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10888c.length);
    }

    public String toString() {
        return c();
    }
}
