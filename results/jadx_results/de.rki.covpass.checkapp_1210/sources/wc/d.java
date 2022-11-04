package wc;

import hc.t;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.u;
import ub.x0;
import ub.y0;
import uc.k;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f24727a = new d();

    private d() {
    }

    public static /* synthetic */ xc.e f(d dVar, wd.c cVar, uc.h hVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, hVar, num);
    }

    public final xc.e a(xc.e eVar) {
        t.e(eVar, "mutable");
        wd.c o10 = c.f24707a.o(ae.d.m(eVar));
        if (o10 != null) {
            xc.e o11 = ee.a.f(eVar).o(o10);
            t.d(o11, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a mutable collection");
    }

    public final xc.e b(xc.e eVar) {
        t.e(eVar, "readOnly");
        wd.c p10 = c.f24707a.p(ae.d.m(eVar));
        if (p10 != null) {
            xc.e o10 = ee.a.f(eVar).o(p10);
            t.d(o10, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o10;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public final boolean c(xc.e eVar) {
        t.e(eVar, "mutable");
        return c.f24707a.k(ae.d.m(eVar));
    }

    public final boolean d(xc.e eVar) {
        t.e(eVar, "readOnly");
        return c.f24707a.l(ae.d.m(eVar));
    }

    public final xc.e e(wd.c cVar, uc.h hVar, Integer num) {
        t.e(cVar, "fqName");
        t.e(hVar, "builtIns");
        wd.b m10 = (num == null || !t.a(cVar, c.f24707a.h())) ? c.f24707a.m(cVar) : k.a(num.intValue());
        if (m10 != null) {
            return hVar.o(m10.b());
        }
        return null;
    }

    public final Collection<xc.e> g(wd.c cVar, uc.h hVar) {
        List k10;
        Set a10;
        Set b10;
        t.e(cVar, "fqName");
        t.e(hVar, "builtIns");
        xc.e f10 = f(this, cVar, hVar, null, 4, null);
        if (f10 == null) {
            b10 = y0.b();
            return b10;
        }
        wd.c p10 = c.f24707a.p(ee.a.i(f10));
        if (p10 == null) {
            a10 = x0.a(f10);
            return a10;
        }
        xc.e o10 = hVar.o(p10);
        t.d(o10, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        k10 = u.k(f10, o10);
        return k10;
    }
}
