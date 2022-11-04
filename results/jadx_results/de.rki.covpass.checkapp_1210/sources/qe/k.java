package qe;

import hc.t;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import oe.e0;
import oe.e1;
import oe.g1;
import ub.u;
import ub.x0;
import xc.h0;
import xc.m;
import xc.u0;
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c */
    private static final a f19896c;

    /* renamed from: f */
    private static final u0 f19899f;

    /* renamed from: g */
    private static final Set<u0> f19900g;

    /* renamed from: a */
    public static final k f19894a = new k();

    /* renamed from: b */
    private static final h0 f19895b = d.f19818c;

    /* renamed from: d */
    private static final e0 f19897d = d(j.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e */
    private static final e0 f19898e = d(j.ERROR_PROPERTY_TYPE, new String[0]);

    static {
        Set<u0> a10;
        String format = String.format(b.ERROR_CLASS.g(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        t.d(format, "format(this, *args)");
        wd.f o10 = wd.f.o(format);
        t.d(o10, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f19896c = new a(o10);
        e eVar = new e();
        f19899f = eVar;
        a10 = x0.a(eVar);
        f19900g = a10;
    }

    private k() {
    }

    @fc.c
    public static final f a(g gVar, boolean z10, String... strArr) {
        t.e(gVar, "kind");
        t.e(strArr, "formatParams");
        return z10 ? new l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fc.c
    public static final f b(g gVar, String... strArr) {
        t.e(gVar, "kind");
        t.e(strArr, "formatParams");
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fc.c
    public static final h d(j jVar, String... strArr) {
        List<? extends g1> h10;
        t.e(jVar, "kind");
        t.e(strArr, "formatParams");
        k kVar = f19894a;
        h10 = u.h();
        return kVar.g(jVar, h10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fc.c
    public static final boolean m(m mVar) {
        if (mVar != null) {
            k kVar = f19894a;
            if (kVar.n(mVar) || kVar.n(mVar.b()) || mVar == f19895b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(m mVar) {
        return mVar instanceof a;
    }

    @fc.c
    public static final boolean o(e0 e0Var) {
        if (e0Var == null) {
            return false;
        }
        e1 W0 = e0Var.W0();
        return (W0 instanceof i) && ((i) W0).d() == j.UNINFERRED_TYPE_VARIABLE;
    }

    public final h c(j jVar, e1 e1Var, String... strArr) {
        List<? extends g1> h10;
        t.e(jVar, "kind");
        t.e(e1Var, "typeConstructor");
        t.e(strArr, "formatParams");
        h10 = u.h();
        return f(jVar, h10, e1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i e(j jVar, String... strArr) {
        t.e(jVar, "kind");
        t.e(strArr, "formatParams");
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final h f(j jVar, List<? extends g1> list, e1 e1Var, String... strArr) {
        t.e(jVar, "kind");
        t.e(list, "arguments");
        t.e(e1Var, "typeConstructor");
        t.e(strArr, "formatParams");
        return new h(e1Var, b(g.ERROR_TYPE_SCOPE, e1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final h g(j jVar, List<? extends g1> list, String... strArr) {
        t.e(jVar, "kind");
        t.e(list, "arguments");
        t.e(strArr, "formatParams");
        return f(jVar, list, e(jVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final a h() {
        return f19896c;
    }

    public final h0 i() {
        return f19895b;
    }

    public final Set<u0> j() {
        return f19900g;
    }

    public final e0 k() {
        return f19898e;
    }

    public final e0 l() {
        return f19897d;
    }
}
