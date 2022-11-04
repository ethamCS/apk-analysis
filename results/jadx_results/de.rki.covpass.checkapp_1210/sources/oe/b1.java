package oe;

import oe.z0;
/* loaded from: classes3.dex */
public final class b1 {
    public static final a1 a(a1 a1Var, yc.g gVar) {
        a1 m10;
        hc.t.e(a1Var, "<this>");
        hc.t.e(gVar, "newAnnotations");
        if (k.a(a1Var) == gVar) {
            return a1Var;
        }
        j b10 = k.b(a1Var);
        if (b10 != null && (m10 = a1Var.m(b10)) != null) {
            a1Var = m10;
        }
        return (gVar.iterator().hasNext() || !gVar.isEmpty()) ? a1Var.l(new j(gVar)) : a1Var;
    }

    public static final a1 b(yc.g gVar) {
        hc.t.e(gVar, "<this>");
        return z0.a.a(o.f18029a, gVar, null, null, 6, null);
    }
}
