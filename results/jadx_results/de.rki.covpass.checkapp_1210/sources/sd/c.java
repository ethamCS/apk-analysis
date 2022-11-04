package sd;

import hc.t;
import java.io.InputStream;
import rd.m;
import tb.r;
import tb.x;
import yd.g;
/* loaded from: classes.dex */
public final class c {
    public static final r<m, a> a(InputStream inputStream) {
        Object obj;
        t.e(inputStream, "<this>");
        try {
            a a10 = a.Companion.a(inputStream);
            th = null;
            if (a10.h()) {
                g d10 = g.d();
                b.a(d10);
                obj = m.y0(inputStream, d10);
            } else {
                obj = th;
            }
            return x.a(obj, a10);
        } finally {
        }
    }
}
