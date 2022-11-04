package jl;

import rk.b0;
import rk.r;
import rk.z;
/* loaded from: classes3.dex */
public class b {
    public static z a(z zVar, z zVar2, z zVar3) {
        return b(zVar, zVar2, zVar3, null, null);
    }

    public static z b(z zVar, z zVar2, z zVar3, b0 b0Var, r rVar) {
        if (zVar.U3 == zVar2.f21325y) {
            z zVar4 = (z) pk.d.o(zVar3, zVar, zVar.f21325y, zVar2.U3);
            kl.b.a(zVar, zVar2, zVar4, b0Var, rVar);
            return zVar4;
        }
        throw new pk.c("Inconsistent matrix shapes. " + pk.d.p(zVar, zVar2));
    }
}
