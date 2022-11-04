package be;

import hc.t;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.g1;
import oe.r1;
import pe.g;
import pe.j;
import ub.u;
import uc.h;
import xc.f1;
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a */
    private final g1 f5980a;

    /* renamed from: b */
    private j f5981b;

    public c(g1 g1Var) {
        t.e(g1Var, "projection");
        this.f5980a = g1Var;
        b().b();
        r1 r1Var = r1.INVARIANT;
    }

    @Override // be.b
    public g1 b() {
        return this.f5980a;
    }

    public Void d() {
        return null;
    }

    public final j e() {
        return this.f5981b;
    }

    /* renamed from: f */
    public c a(g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        g1 a10 = b().a(gVar);
        t.d(a10, "projection.refine(kotlinTypeRefiner)");
        return new c(a10);
    }

    public final void g(j jVar) {
        this.f5981b = jVar;
    }

    @Override // oe.e1
    public List<f1> getParameters() {
        List<f1> h10;
        h10 = u.h();
        return h10;
    }

    @Override // oe.e1
    public Collection<e0> l() {
        List d10;
        e0 type = b().b() == r1.OUT_VARIANCE ? b().getType() : x().I();
        t.d(type, "if (projection.projectio… builtIns.nullableAnyType");
        d10 = ub.t.d(type);
        return d10;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + b() + ')';
    }

    @Override // oe.e1
    public h x() {
        h x10 = b().getType().W0().x();
        t.d(x10, "projection.type.constructor.builtIns");
        return x10;
    }

    @Override // oe.e1
    public boolean y() {
        return false;
    }

    @Override // oe.e1
    public /* bridge */ /* synthetic */ xc.h z() {
        return (xc.h) d();
    }
}
