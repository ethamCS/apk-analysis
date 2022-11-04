package oe;
/* loaded from: classes3.dex */
public abstract class s extends r {

    /* renamed from: d */
    private final m0 f18042d;

    public s(m0 m0Var) {
        hc.t.e(m0Var, "delegate");
        this.f18042d = m0Var;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        return z10 == X0() ? this : f1().d1(z10).e1(V0());
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return a1Var != V0() ? new o0(this, a1Var) : this;
    }

    @Override // oe.r
    protected m0 f1() {
        return this.f18042d;
    }
}
