package oi;

import gg.v;
import ih.i;
/* loaded from: classes3.dex */
public class a {
    public static ri.c a(String str) {
        i d10 = lg.b.d(str);
        if (d10 == null) {
            try {
                d10 = lg.b.f(new v(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (d10 == null) {
            return null;
        }
        return new ri.c(str, d10.l(), d10.m(), d10.q(), d10.n(), d10.r());
    }
}
