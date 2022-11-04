package pd;

import fd.c;
import gd.p;
import gd.w;
import hd.f;
import java.util.List;
import jd.c;
import ke.l;
import pd.w;
import xc.d1;
import xc.h0;
import xc.k0;
/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a implements gd.t {
        a() {
        }

        @Override // gd.t
        public List<nd.a> a(wd.b bVar) {
            hc.t.e(bVar, "classId");
            return null;
        }
    }

    public static final e a(h0 h0Var, ne.n nVar, k0 k0Var, jd.f fVar, o oVar, g gVar, ke.r rVar) {
        List d10;
        hc.t.e(h0Var, "module");
        hc.t.e(nVar, "storageManager");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(fVar, "lazyJavaPackageFragmentProvider");
        hc.t.e(oVar, "reflectKotlinClassFinder");
        hc.t.e(gVar, "deserializedDescriptorResolver");
        hc.t.e(rVar, "errorReporter");
        h hVar = new h(oVar, gVar);
        c cVar = new c(h0Var, k0Var, nVar, oVar);
        l.a aVar = l.a.f15081a;
        c.a aVar2 = c.a.f10155a;
        ke.j a10 = ke.j.Companion.a();
        pe.m a11 = pe.l.Companion.a();
        d10 = ub.t.d(oe.o.f18029a);
        return new e(nVar, h0Var, aVar, hVar, cVar, fVar, k0Var, rVar, aVar2, a10, a11, new re.a(d10));
    }

    public static final jd.f b(gd.o oVar, h0 h0Var, ne.n nVar, k0 k0Var, o oVar2, g gVar, ke.r rVar, md.b bVar, jd.i iVar, w wVar) {
        List h10;
        hc.t.e(oVar, "javaClassFinder");
        hc.t.e(h0Var, "module");
        hc.t.e(nVar, "storageManager");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(oVar2, "reflectKotlinClassFinder");
        hc.t.e(gVar, "deserializedDescriptorResolver");
        hc.t.e(rVar, "errorReporter");
        hc.t.e(bVar, "javaSourceElementFactory");
        hc.t.e(iVar, "singleModuleClassResolver");
        hc.t.e(wVar, "packagePartProvider");
        hd.j jVar = hd.j.f11819a;
        hc.t.d(jVar, "DO_NOTHING");
        hd.g gVar2 = hd.g.f11812a;
        hc.t.d(gVar2, "EMPTY");
        f.a aVar = f.a.f11811a;
        h10 = ub.u.h();
        ge.b bVar2 = new ge.b(nVar, h10);
        d1.a aVar2 = d1.a.f25530a;
        c.a aVar3 = c.a.f10155a;
        uc.j jVar2 = new uc.j(h0Var, k0Var);
        w.b bVar3 = gd.w.Companion;
        gd.d dVar = new gd.d(bVar3.a());
        c.b bVar4 = c.b.f14313a;
        return new jd.f(new jd.b(nVar, oVar, oVar2, gVar, jVar, rVar, gVar2, aVar, bVar2, bVar, iVar, wVar, aVar2, aVar3, h0Var, jVar2, dVar, new od.l(new od.d(bVar4)), p.a.f10741a, bVar4, pe.l.Companion.a(), bVar3.a(), new a(), null, 8388608, null));
    }

    public static /* synthetic */ jd.f c(gd.o oVar, h0 h0Var, ne.n nVar, k0 k0Var, o oVar2, g gVar, ke.r rVar, md.b bVar, jd.i iVar, w wVar, int i10, Object obj) {
        return b(oVar, h0Var, nVar, k0Var, oVar2, gVar, rVar, bVar, iVar, (i10 & 512) != 0 ? w.a.f19140a : wVar);
    }
}
