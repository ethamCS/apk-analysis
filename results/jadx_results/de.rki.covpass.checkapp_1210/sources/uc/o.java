package uc;

import hc.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import oe.e0;
import oe.n1;
import tb.x;
import ub.c0;
import ub.q0;
import xc.l0;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public static final o f23528a = new o();

    /* renamed from: b */
    private static final Set<wd.f> f23529b;

    /* renamed from: c */
    private static final Set<wd.f> f23530c;

    /* renamed from: d */
    private static final HashMap<wd.b, wd.b> f23531d;

    /* renamed from: e */
    private static final HashMap<wd.b, wd.b> f23532e;

    /* renamed from: f */
    private static final HashMap<m, wd.f> f23533f;

    /* renamed from: g */
    private static final Set<wd.f> f23534g;

    static {
        Set<wd.f> J0;
        Set<wd.f> J02;
        HashMap<m, wd.f> j10;
        n[] values;
        n[] values2 = n.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (n nVar : values2) {
            arrayList.add(nVar.j());
        }
        J0 = c0.J0(arrayList);
        f23529b = J0;
        m[] values3 = m.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (m mVar : values3) {
            arrayList2.add(mVar.g());
        }
        J02 = c0.J0(arrayList2);
        f23530c = J02;
        f23531d = new HashMap<>();
        f23532e = new HashMap<>();
        j10 = q0.j(x.a(m.UBYTEARRAY, wd.f.j("ubyteArrayOf")), x.a(m.USHORTARRAY, wd.f.j("ushortArrayOf")), x.a(m.UINTARRAY, wd.f.j("uintArrayOf")), x.a(m.ULONGARRAY, wd.f.j("ulongArrayOf")));
        f23533f = j10;
        n[] values4 = n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar2 : values4) {
            linkedHashSet.add(nVar2.g().j());
        }
        f23534g = linkedHashSet;
        for (n nVar3 : n.values()) {
            f23531d.put(nVar3.g(), nVar3.h());
            f23532e.put(nVar3.h(), nVar3.g());
        }
    }

    private o() {
    }

    @fc.c
    public static final boolean d(e0 e0Var) {
        xc.h z10;
        t.e(e0Var, "type");
        if (!n1.v(e0Var) && (z10 = e0Var.W0().z()) != null) {
            return f23528a.c(z10);
        }
        return false;
    }

    public final wd.b a(wd.b bVar) {
        t.e(bVar, "arrayClassId");
        return f23531d.get(bVar);
    }

    public final boolean b(wd.f fVar) {
        t.e(fVar, "name");
        return f23534g.contains(fVar);
    }

    public final boolean c(xc.m mVar) {
        t.e(mVar, "descriptor");
        xc.m b10 = mVar.b();
        return (b10 instanceof l0) && t.a(((l0) b10).d(), k.f23458r) && f23529b.contains(mVar.getName());
    }
}
