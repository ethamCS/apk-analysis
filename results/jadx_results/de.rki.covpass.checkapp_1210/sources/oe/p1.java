package oe;
/* loaded from: classes3.dex */
public final class p1 {
    public static final e0 a(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        if (e0Var instanceof o1) {
            return ((o1) e0Var).e0();
        }
        return null;
    }

    public static final q1 b(q1 q1Var, e0 e0Var) {
        hc.t.e(q1Var, "<this>");
        hc.t.e(e0Var, "origin");
        return d(q1Var, a(e0Var));
    }

    public static final q1 c(q1 q1Var, e0 e0Var, gc.l<? super e0, ? extends e0> lVar) {
        hc.t.e(q1Var, "<this>");
        hc.t.e(e0Var, "origin");
        hc.t.e(lVar, "transform");
        e0 a10 = a(e0Var);
        return d(q1Var, a10 != null ? lVar.invoke(a10) : null);
    }

    public static final q1 d(q1 q1Var, e0 e0Var) {
        hc.t.e(q1Var, "<this>");
        if (q1Var instanceof o1) {
            return d(((o1) q1Var).M0(), e0Var);
        }
        if (e0Var == null || hc.t.a(e0Var, q1Var)) {
            return q1Var;
        }
        if (q1Var instanceof m0) {
            return new p0((m0) q1Var, e0Var);
        }
        if (!(q1Var instanceof y)) {
            throw new tb.p();
        }
        return new a0((y) q1Var, e0Var);
    }
}
