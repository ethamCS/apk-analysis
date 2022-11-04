package oe;
/* loaded from: classes3.dex */
public final class p0 extends r implements o1 {

    /* renamed from: d */
    private final m0 f18033d;

    /* renamed from: q */
    private final e0 f18034q;

    public p0(m0 m0Var, e0 e0Var) {
        hc.t.e(m0Var, "delegate");
        hc.t.e(e0Var, "enhancement");
        this.f18033d = m0Var;
        this.f18034q = e0Var;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        q1 d10 = p1.d(M0().d1(z10), e0().Z0().a1(z10));
        hc.t.c(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) d10;
    }

    @Override // oe.o1
    public e0 e0() {
        return this.f18034q;
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        q1 d10 = p1.d(M0().e1(a1Var), e0());
        hc.t.c(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) d10;
    }

    @Override // oe.r
    protected m0 f1() {
        return this.f18033d;
    }

    /* renamed from: i1 */
    public m0 M0() {
        return f1();
    }

    /* renamed from: j1 */
    public p0 g1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(f1());
        hc.t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new p0((m0) h10, gVar.h(e0()));
    }

    /* renamed from: k1 */
    public p0 h1(m0 m0Var) {
        hc.t.e(m0Var, "delegate");
        return new p0(m0Var, e0());
    }

    @Override // oe.m0
    public String toString() {
        return "[@EnhancedForWarnings(" + e0() + ")] " + M0();
    }
}
