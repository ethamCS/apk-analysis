package oe;
/* loaded from: classes3.dex */
public final class b0 {
    public static final y a(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        hc.t.c(Z0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (y) Z0;
    }

    public static final boolean b(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        return e0Var.Z0() instanceof y;
    }

    public static final m0 c(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            return ((y) Z0).e1();
        }
        if (!(Z0 instanceof m0)) {
            throw new tb.p();
        }
        return (m0) Z0;
    }

    public static final m0 d(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            return ((y) Z0).f1();
        }
        if (!(Z0 instanceof m0)) {
            throw new tb.p();
        }
        return (m0) Z0;
    }
}
