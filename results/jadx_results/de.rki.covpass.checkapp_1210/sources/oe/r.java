package oe;

import java.util.List;
/* loaded from: classes3.dex */
public abstract class r extends m0 {
    @Override // oe.e0
    public List<g1> U0() {
        return f1().U0();
    }

    @Override // oe.e0
    public a1 V0() {
        return f1().V0();
    }

    @Override // oe.e0
    public e1 W0() {
        return f1().W0();
    }

    @Override // oe.e0
    public boolean X0() {
        return f1().X0();
    }

    protected abstract m0 f1();

    /* renamed from: g1 */
    public m0 b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(f1());
        hc.t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return h1((m0) h10);
    }

    public abstract r h1(m0 m0Var);

    @Override // oe.e0
    public he.h z() {
        return f1().z();
    }
}
