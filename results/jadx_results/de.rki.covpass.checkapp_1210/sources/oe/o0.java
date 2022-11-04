package oe;
/* loaded from: classes3.dex */
public final class o0 extends s {

    /* renamed from: q */
    private final a1 f18030q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, a1 a1Var) {
        super(m0Var);
        hc.t.e(m0Var, "delegate");
        hc.t.e(a1Var, "attributes");
        this.f18030q = a1Var;
    }

    @Override // oe.r, oe.e0
    public a1 V0() {
        return this.f18030q;
    }

    /* renamed from: i1 */
    public o0 h1(m0 m0Var) {
        hc.t.e(m0Var, "delegate");
        return new o0(m0Var, V0());
    }
}
