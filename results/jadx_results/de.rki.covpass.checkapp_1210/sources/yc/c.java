package yc;

import java.util.Map;
import oe.e0;
import xc.a1;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {
        public static wd.c a(c cVar) {
            xc.e e10 = ee.a.e(cVar);
            if (e10 != null) {
                if (qe.k.m(e10)) {
                    e10 = null;
                }
                if (e10 == null) {
                    return null;
                }
                return ee.a.d(e10);
            }
            return null;
        }
    }

    Map<wd.f, ce.g<?>> b();

    wd.c d();

    e0 getType();

    a1 m();
}
