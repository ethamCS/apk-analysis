package ld;

import hc.t;
import hd.k;
import oe.g1;
import oe.i1;
import oe.s0;
import oe.t0;
import ub.x0;
import xc.f1;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final wd.c f15939a = new wd.c("java.lang.Class");

    public static final /* synthetic */ wd.c a() {
        return f15939a;
    }

    public static final g1 b(f1 f1Var, a aVar) {
        t.e(f1Var, "typeParameter");
        t.e(aVar, "attr");
        return aVar.e() == k.SUPERTYPE ? new i1(t0.b(f1Var)) : new s0(f1Var);
    }

    public static final a c(k kVar, boolean z10, f1 f1Var) {
        t.e(kVar, "<this>");
        return new a(kVar, null, z10, f1Var != null ? x0.a(f1Var) : null, null, 18, null);
    }

    public static /* synthetic */ a d(k kVar, boolean z10, f1 f1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            f1Var = null;
        }
        return c(kVar, z10, f1Var);
    }
}
