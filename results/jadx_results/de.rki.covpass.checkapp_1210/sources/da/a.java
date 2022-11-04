package da;

import rk.n;
/* loaded from: classes.dex */
public class a {
    public static double a(ga.c cVar, n nVar, ga.c cVar2) {
        if (nVar.f21297d == 3 && nVar.f21298q == 3) {
            double d10 = cVar.f10622c;
            double[] dArr = nVar.f21296c;
            double d11 = cVar.f10623d;
            double d12 = (dArr[0] * d10) + (dArr[3] * d11) + dArr[6];
            double d13 = (dArr[1] * d10) + (dArr[4] * d11) + dArr[7];
            return (d12 * cVar2.f10622c) + (d13 * cVar2.f10623d) + (d10 * dArr[2]) + (d11 * dArr[5]) + dArr[8];
        }
        throw new IllegalArgumentException("M must be 3 by 3.");
    }
}
