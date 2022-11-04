package jl;

import kl.f;
import kl.h;
import rk.z;
/* loaded from: classes3.dex */
public class d {
    public static z a(z zVar, z zVar2, z zVar3, ll.d<h> dVar) {
        if (zVar.U3 != zVar2.f21325y) {
            throw new pk.c("Inconsistent matrix shapes. " + pk.d.p(zVar, zVar2));
        }
        z zVar4 = (z) pk.d.o(zVar3, zVar, zVar.f21325y, zVar2.U3);
        if (dVar == null) {
            dVar = new ll.d<>(il.h.f12735a);
        }
        f.c(zVar, zVar2, zVar4, dVar);
        return zVar4;
    }
}
