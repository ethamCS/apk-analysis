package od;

import gd.a0;
import hc.t;
import java.util.List;
import oe.e0;
import ub.c0;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    private static final c f17911a;

    /* renamed from: b */
    private static final c f17912b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17913a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.NULLABLE.ordinal()] = 1;
            iArr[h.NOT_NULL.ordinal()] = 2;
            f17913a = iArr;
        }
    }

    static {
        wd.c cVar = a0.f10652u;
        t.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f17911a = new c(cVar);
        wd.c cVar2 = a0.f10653v;
        t.d(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f17912b = new c(cVar2);
    }

    public static final yc.g f(List<? extends yc.g> list) {
        Object s02;
        List F0;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                F0 = c0.F0(list);
                return new yc.k(F0);
            }
            s02 = c0.s0(list);
            return (yc.g) s02;
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    public static final xc.h g(xc.h hVar, e eVar, o oVar) {
        wc.d dVar = wc.d.f24727a;
        if (p.a(oVar) && (hVar instanceof xc.e)) {
            if (eVar.c() == f.READ_ONLY && oVar == o.FLEXIBLE_LOWER) {
                xc.e eVar2 = (xc.e) hVar;
                if (dVar.c(eVar2)) {
                    return dVar.a(eVar2);
                }
            }
            if (eVar.c() != f.MUTABLE || oVar != o.FLEXIBLE_UPPER) {
                return null;
            }
            xc.e eVar3 = (xc.e) hVar;
            if (!dVar.d(eVar3)) {
                return null;
            }
            return dVar.b(eVar3);
        }
        return null;
    }

    public static final Boolean h(e eVar, o oVar) {
        if (!p.a(oVar)) {
            return null;
        }
        h d10 = eVar.d();
        int i10 = d10 == null ? -1 : a.f17913a[d10.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 == 2) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final boolean i(e0 e0Var) {
        t.e(e0Var, "<this>");
        return s.c(pe.q.f19172a, e0Var);
    }
}
