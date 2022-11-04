package cd;

import bf.x;
import hc.t;
/* loaded from: classes.dex */
public final class h {
    public static final String b(wd.b bVar) {
        String D;
        String b10 = bVar.i().b();
        t.d(b10, "relativeClassName.asString()");
        D = x.D(b10, '.', '$', false, 4, null);
        if (bVar.h().d()) {
            return D;
        }
        return bVar.h() + '.' + D;
    }
}
