package tk;

import dl.h;
import rk.h0;
import rk.i0;
/* loaded from: classes3.dex */
public class f {
    public static void a(h0 h0Var, double d10, double d11) {
        int q10 = h0Var.q();
        for (int i10 = 0; i10 < q10; i10 += 2) {
            double[] dArr = h0Var.f21288c;
            dArr[i10] = d10;
            dArr[i10 + 1] = d11;
        }
    }

    public static void b(i0 i0Var, i0 i0Var2, i0 i0Var3) {
        if (i0Var2.f21290q >= pk.a.f19252h) {
            h.a(i0Var, i0Var2, i0Var3);
        } else {
            h.b(i0Var, i0Var2, i0Var3);
        }
    }
}
