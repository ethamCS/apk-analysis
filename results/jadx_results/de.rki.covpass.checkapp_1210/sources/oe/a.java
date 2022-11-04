package oe;
/* loaded from: classes3.dex */
public final class a extends r {

    /* renamed from: d */
    private final m0 f17914d;

    /* renamed from: q */
    private final m0 f17915q;

    public a(m0 m0Var, m0 m0Var2) {
        hc.t.e(m0Var, "delegate");
        hc.t.e(m0Var2, "abbreviation");
        this.f17914d = m0Var;
        this.f17915q = m0Var2;
    }

    public final m0 H0() {
        return f1();
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return new a(f1().e1(a1Var), this.f17915q);
    }

    @Override // oe.r
    protected m0 f1() {
        return this.f17914d;
    }

    public final m0 i1() {
        return this.f17915q;
    }

    /* renamed from: j1 */
    public a d1(boolean z10) {
        return new a(f1().d1(z10), this.f17915q.d1(z10));
    }

    /* renamed from: k1 */
    public a g1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(f1());
        hc.t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 h11 = gVar.h(this.f17915q);
        hc.t.c(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((m0) h10, (m0) h11);
    }

    /* renamed from: l1 */
    public a h1(m0 m0Var) {
        hc.t.e(m0Var, "delegate");
        return new a(m0Var, this.f17915q);
    }
}
