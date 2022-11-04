package qe;

import hc.t;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.u;
import ub.y0;
import xc.g0;
import xc.h0;
import xc.m;
import xc.o;
import xc.q0;
/* loaded from: classes3.dex */
public final class d implements h0 {

    /* renamed from: d */
    private static final wd.f f19819d;

    /* renamed from: q */
    private static final List<h0> f19820q;

    /* renamed from: x */
    private static final List<h0> f19821x;

    /* renamed from: y */
    private static final Set<h0> f19822y;

    /* renamed from: c */
    public static final d f19818c = new d();
    private static final uc.h U3 = uc.e.Companion.a();

    static {
        List<h0> h10;
        List<h0> h11;
        Set<h0> b10;
        wd.f o10 = wd.f.o(b.ERROR_MODULE.g());
        t.d(o10, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f19819d = o10;
        h10 = u.h();
        f19820q = h10;
        h11 = u.h();
        f19821x = h11;
        b10 = y0.b();
        f19822y = b10;
    }

    private d() {
    }

    @Override // xc.h0
    public q0 F(wd.c cVar) {
        t.e(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // xc.h0
    public boolean O(h0 h0Var) {
        t.e(h0Var, "targetModule");
        return false;
    }

    @Override // xc.m, xc.h
    public m a() {
        return this;
    }

    @Override // xc.m, xc.n, xc.y, xc.l
    public m b() {
        return null;
    }

    public wd.f e0() {
        return f19819d;
    }

    @Override // xc.m
    public <R, D> R g0(o<R, D> oVar, D d10) {
        t.e(oVar, "visitor");
        return null;
    }

    @Override // xc.j0
    public wd.f getName() {
        return e0();
    }

    @Override // xc.h0
    public List<h0> i0() {
        return f19821x;
    }

    @Override // yc.a
    public yc.g j() {
        return yc.g.Companion.b();
    }

    @Override // xc.h0
    public <T> T o0(g0<T> g0Var) {
        t.e(g0Var, "capability");
        return null;
    }

    @Override // xc.h0
    public Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        t.e(cVar, "fqName");
        t.e(lVar, "nameFilter");
        h10 = u.h();
        return h10;
    }

    @Override // xc.h0
    public uc.h x() {
        return U3;
    }
}
