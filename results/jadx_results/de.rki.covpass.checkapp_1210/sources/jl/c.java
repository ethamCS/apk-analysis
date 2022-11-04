package jl;

import kl.g;
import rk.o;
/* loaded from: classes3.dex */
public class c {
    public static o a(o oVar, o oVar2, o oVar3, ll.d<g> dVar) {
        if (oVar.U3 != oVar2.f21304y) {
            throw new pk.c("Inconsistent matrix shapes. " + pk.d.p(oVar, oVar2));
        }
        o oVar4 = (o) pk.d.o(oVar3, oVar, oVar.f21304y, oVar2.U3);
        if (dVar == null) {
            dVar = new ll.d<>(il.d.f12729a);
        }
        kl.d.c(oVar, oVar2, oVar4, dVar);
        return oVar4;
    }
}
