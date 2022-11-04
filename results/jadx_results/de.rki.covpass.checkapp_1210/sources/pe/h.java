package pe;

import java.util.ArrayList;
import java.util.List;
import oe.e0;
import xc.g0;
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    private static final g0<p<x>> f19149a = new g0<>("KotlinTypeRefiner");

    public static final g0<p<x>> a() {
        return f19149a;
    }

    public static final List<e0> b(g gVar, Iterable<? extends e0> iterable) {
        int s10;
        hc.t.e(gVar, "<this>");
        hc.t.e(iterable, "types");
        s10 = ub.v.s(iterable, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (e0 e0Var : iterable) {
            arrayList.add(gVar.h(e0Var));
        }
        return arrayList;
    }
}
