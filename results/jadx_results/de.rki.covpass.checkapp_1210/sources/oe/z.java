package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class z extends y implements n {
    public static final a Companion = new a(null);

    /* renamed from: y */
    public static boolean f18061y;

    /* renamed from: x */
    private boolean f18062x;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, m0 m0Var2) {
        super(m0Var, m0Var2);
        hc.t.e(m0Var, "lowerBound");
        hc.t.e(m0Var2, "upperBound");
    }

    private final void i1() {
        if (!f18061y || this.f18062x) {
            return;
        }
        this.f18062x = true;
        b0.b(e1());
        b0.b(f1());
        hc.t.a(e1(), f1());
        pe.e.f19146a.d(e1(), f1());
    }

    @Override // oe.q1
    public q1 a1(boolean z10) {
        return f0.d(e1().d1(z10), f1().d1(z10));
    }

    @Override // oe.q1
    public q1 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return f0.d(e1().e1(a1Var), f1().e1(a1Var));
    }

    @Override // oe.y
    public m0 d1() {
        i1();
        return e1();
    }

    @Override // oe.y
    public String g1(zd.c cVar, zd.f fVar) {
        hc.t.e(cVar, "renderer");
        hc.t.e(fVar, "options");
        if (fVar.m()) {
            return '(' + cVar.w(e1()) + ".." + cVar.w(f1()) + ')';
        }
        return cVar.t(cVar.w(e1()), cVar.w(f1()), te.a.h(this));
    }

    /* renamed from: h1 */
    public y b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(e1());
        hc.t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 h11 = gVar.h(f1());
        hc.t.c(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new z((m0) h10, (m0) h11);
    }

    @Override // oe.y
    public String toString() {
        return '(' + e1() + ".." + f1() + ')';
    }

    @Override // oe.n
    public e0 y0(e0 e0Var) {
        q1 q1Var;
        hc.t.e(e0Var, "replacement");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            q1Var = Z0;
        } else if (!(Z0 instanceof m0)) {
            throw new tb.p();
        } else {
            m0 m0Var = (m0) Z0;
            q1Var = f0.d(m0Var, m0Var.d1(true));
        }
        return p1.b(q1Var, Z0);
    }

    @Override // oe.n
    public boolean z0() {
        return (e1().W0().z() instanceof xc.f1) && hc.t.a(e1().W0(), f1().W0());
    }
}
