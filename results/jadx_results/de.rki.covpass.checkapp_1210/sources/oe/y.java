package oe;

import java.util.List;
/* loaded from: classes3.dex */
public abstract class y extends q1 implements se.g {

    /* renamed from: d */
    private final m0 f18059d;

    /* renamed from: q */
    private final m0 f18060q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m0 m0Var, m0 m0Var2) {
        super(null);
        hc.t.e(m0Var, "lowerBound");
        hc.t.e(m0Var2, "upperBound");
        this.f18059d = m0Var;
        this.f18060q = m0Var2;
    }

    @Override // oe.e0
    public List<g1> U0() {
        return d1().U0();
    }

    @Override // oe.e0
    public a1 V0() {
        return d1().V0();
    }

    @Override // oe.e0
    public e1 W0() {
        return d1().W0();
    }

    @Override // oe.e0
    public boolean X0() {
        return d1().X0();
    }

    public abstract m0 d1();

    public final m0 e1() {
        return this.f18059d;
    }

    public final m0 f1() {
        return this.f18060q;
    }

    public abstract String g1(zd.c cVar, zd.f fVar);

    public String toString() {
        return zd.c.f26623i.w(this);
    }

    @Override // oe.e0
    public he.h z() {
        return d1().z();
    }
}
