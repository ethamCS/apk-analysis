package oe;
/* loaded from: classes3.dex */
public class q extends j1 {

    /* renamed from: b */
    private final j1 f18035b;

    public q(j1 j1Var) {
        hc.t.e(j1Var, "substitution");
        this.f18035b = j1Var;
    }

    @Override // oe.j1
    public boolean a() {
        return this.f18035b.a();
    }

    @Override // oe.j1
    public yc.g d(yc.g gVar) {
        hc.t.e(gVar, "annotations");
        return this.f18035b.d(gVar);
    }

    @Override // oe.j1
    public g1 e(e0 e0Var) {
        hc.t.e(e0Var, "key");
        return this.f18035b.e(e0Var);
    }

    @Override // oe.j1
    public boolean f() {
        return this.f18035b.f();
    }

    @Override // oe.j1
    public e0 g(e0 e0Var, r1 r1Var) {
        hc.t.e(e0Var, "topLevelType");
        hc.t.e(r1Var, "position");
        return this.f18035b.g(e0Var, r1Var);
    }
}
