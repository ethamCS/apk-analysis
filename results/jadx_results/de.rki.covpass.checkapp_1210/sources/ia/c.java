package ia;

import rk.n;
/* loaded from: classes.dex */
public class c {
    public static b a(n nVar, b bVar) {
        if (nVar.f21298q == 3 && nVar.f21297d == 3) {
            if (bVar == null) {
                bVar = new b();
            }
            bVar.f21291c = nVar.l(0, 0);
            bVar.f21292d = nVar.l(0, 1);
            bVar.f21293q = nVar.l(0, 2);
            bVar.f21294x = nVar.l(1, 0);
            bVar.f21295y = nVar.l(1, 1);
            bVar.U3 = nVar.l(1, 2);
            bVar.V3 = nVar.l(2, 0);
            bVar.W3 = nVar.l(2, 1);
            bVar.X3 = nVar.l(2, 2);
            return bVar;
        }
        throw new IllegalArgumentException("Expected a 3 by 3 matrix.");
    }
}
