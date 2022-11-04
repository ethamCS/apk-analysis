package uc;

import hc.t;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ub.c0;
import ub.v;
import uc.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f23400a = new c();

    /* renamed from: b */
    private static final Set<wd.b> f23401b;

    static {
        int s10;
        List p02;
        List p03;
        List<wd.c> p04;
        Set<i> set = i.f23421y;
        s10 = v.s(set, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (i iVar : set) {
            arrayList.add(k.c(iVar));
        }
        wd.c l10 = k.a.f23479h.l();
        t.d(l10, "string.toSafe()");
        p02 = c0.p0(arrayList, l10);
        wd.c l11 = k.a.f23483j.l();
        t.d(l11, "_boolean.toSafe()");
        p03 = c0.p0(p02, l11);
        wd.c l12 = k.a.f23501s.l();
        t.d(l12, "_enum.toSafe()");
        p04 = c0.p0(p03, l12);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (wd.c cVar : p04) {
            linkedHashSet.add(wd.b.m(cVar));
        }
        f23401b = linkedHashSet;
    }

    private c() {
    }

    public final Set<wd.b> a() {
        return f23401b;
    }

    public final Set<wd.b> b() {
        return f23401b;
    }
}
