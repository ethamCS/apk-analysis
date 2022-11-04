package tk;

import dl.j;
import java.util.Arrays;
import rk.t;
import rk.w;
/* loaded from: classes3.dex */
public class c {
    public static void a(w wVar, float f10) {
        Arrays.fill(wVar.f21317c, 0, wVar.c(), f10);
    }

    public static <T extends t> T b(T t10, T t11, T t12) {
        T t13 = (T) pk.d.o(t12, t10, t10.f21318d, t11.f21319q);
        pk.d.i(t10, t13);
        pk.d.i(t11, t13);
        int i10 = t11.f21319q;
        if (i10 == 1) {
            j.a(t10, t11, t13);
        } else if (i10 >= pk.a.f19249e) {
            dl.c.a(t10, t11, t13);
        } else {
            dl.c.b(t10, t11, t13);
        }
        return t13;
    }
}
