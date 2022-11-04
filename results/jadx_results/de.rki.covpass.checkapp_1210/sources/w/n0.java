package w;

import w.o0;
/* loaded from: classes.dex */
public final /* synthetic */ class n0 {
    public static boolean a(o0.c cVar, o0.c cVar2) {
        o0.c cVar3 = o0.c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        o0.c cVar4 = o0.c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    public static o0 b(o0 o0Var, o0 o0Var2) {
        if (o0Var == null && o0Var2 == null) {
            return u1.I();
        }
        q1 M = o0Var2 != null ? q1.M(o0Var2) : q1.L();
        if (o0Var != null) {
            for (o0.a<?> aVar : o0Var.c()) {
                M.G(aVar, o0Var.d(aVar), o0Var.b(aVar));
            }
        }
        return u1.J(M);
    }
}
