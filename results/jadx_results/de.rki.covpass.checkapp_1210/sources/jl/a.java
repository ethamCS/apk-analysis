package jl;

import rk.b0;
import rk.g;
import rk.o;
/* loaded from: classes3.dex */
public class a {
    public static o a(o oVar, o oVar2, o oVar3) {
        return b(oVar, oVar2, oVar3, null, null);
    }

    public static o b(o oVar, o oVar2, o oVar3, b0 b0Var, g gVar) {
        if (oVar.U3 == oVar2.f21304y) {
            o oVar4 = (o) pk.d.o(oVar3, oVar, oVar.f21304y, oVar2.U3);
            kl.a.a(oVar, oVar2, oVar4, b0Var, gVar);
            return oVar4;
        }
        throw new pk.c("Inconsistent matrix shapes. " + pk.d.p(oVar, oVar2));
    }
}
