package jd;

import gc.l;
import gd.o;
import hc.t;
import hc.v;
import java.util.Collection;
import java.util.List;
import jd.k;
import kotlin.Lazy;
import nd.u;
import tb.n;
import xc.l0;
import xc.p0;
/* loaded from: classes.dex */
public final class f implements p0 {

    /* renamed from: a */
    private final g f14319a;

    /* renamed from: b */
    private final ne.a<wd.c, kd.h> f14320b;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<kd.h> {

        /* renamed from: d */
        final /* synthetic */ u f14322d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(0);
            f.this = r1;
            this.f14322d = uVar;
        }

        /* renamed from: b */
        public final kd.h invoke() {
            return new kd.h(f.this.f14319a, this.f14322d);
        }
    }

    public f(b bVar) {
        Lazy c10;
        t.e(bVar, "components");
        k.a aVar = k.a.f14335a;
        c10 = n.c(null);
        g gVar = new g(bVar, aVar, c10);
        this.f14319a = gVar;
        this.f14320b = gVar.e().e();
    }

    private final kd.h e(wd.c cVar) {
        u a10 = o.a.a(this.f14319a.a().d(), cVar, false, 2, null);
        if (a10 == null) {
            return null;
        }
        return this.f14320b.a(cVar, new a(a10));
    }

    @Override // xc.m0
    public List<kd.h> a(wd.c cVar) {
        List<kd.h> l10;
        t.e(cVar, "fqName");
        l10 = ub.u.l(e(cVar));
        return l10;
    }

    @Override // xc.p0
    public void b(wd.c cVar, Collection<l0> collection) {
        t.e(cVar, "fqName");
        t.e(collection, "packageFragments");
        ye.a.a(collection, e(cVar));
    }

    @Override // xc.p0
    public boolean c(wd.c cVar) {
        t.e(cVar, "fqName");
        return o.a.a(this.f14319a.a().d(), cVar, false, 2, null) == null;
    }

    /* renamed from: f */
    public List<wd.c> t(wd.c cVar, l<? super wd.f, Boolean> lVar) {
        List<wd.c> h10;
        t.e(cVar, "fqName");
        t.e(lVar, "nameFilter");
        kd.h e10 = e(cVar);
        List<wd.c> X0 = e10 != null ? e10.X0() : null;
        if (X0 == null) {
            h10 = ub.u.h();
            return h10;
        }
        return X0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f14319a.a().m();
    }
}
