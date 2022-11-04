package uk;

import rk.n;
import tk.b;
/* loaded from: classes3.dex */
public class a {
    public static n a(n nVar, int i10, int i11) {
        if (nVar == null) {
            return new n(i10, i11);
        }
        if (i10 == nVar.f21297d && i11 == nVar.f21298q) {
            for (int i12 = 0; i12 < nVar.f21297d; i12++) {
                int i13 = nVar.f21298q;
                int i14 = i12 * i13;
                int min = Math.min(i12, i13) + i14;
                while (i14 < min) {
                    nVar.f21296c[i14] = 0.0d;
                    i14++;
                }
            }
        } else {
            nVar.U(i10, i11);
            nVar.k();
        }
        return nVar;
    }

    public static n b(n nVar, int i10, int i11) {
        if (nVar == null) {
            return b.f(i10, i11);
        }
        nVar.U(i10, i11);
        b.k(nVar);
        return nVar;
    }
}
