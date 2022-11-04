package he;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.List;
import ub.u;
import xc.z0;
/* loaded from: classes3.dex */
public final class l extends i {

    /* renamed from: c */
    static final /* synthetic */ oc.k<Object>[] f11874c = {k0.g(new e0(k0.b(l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: a */
    private final xc.e f11875a;

    /* renamed from: b */
    private final ne.i f11876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<List<? extends z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            l.this = r1;
        }

        @Override // gc.a
        public final List<? extends z0> invoke() {
            List<? extends z0> k10;
            k10 = u.k(ae.c.f(l.this.f11875a), ae.c.g(l.this.f11875a));
            return k10;
        }
    }

    public l(ne.n nVar, xc.e eVar) {
        t.e(nVar, "storageManager");
        t.e(eVar, "containingClass");
        this.f11875a = eVar;
        eVar.h();
        xc.f fVar = xc.f.ENUM_CLASS;
        this.f11876b = nVar.d(new a());
    }

    private final List<z0> l() {
        return (List) ne.m.a(this.f11876b, this, f11874c[0]);
    }

    @Override // he.i, he.k
    public /* bridge */ /* synthetic */ xc.h f(wd.f fVar, fd.b bVar) {
        return (xc.h) i(fVar, bVar);
    }

    public Void i(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return null;
    }

    /* renamed from: j */
    public List<z0> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        return l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public ye.e<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        List<z0> l10 = l();
        ye.e<z0> eVar = new ye.e<>();
        for (Object obj : l10) {
            if (t.a(((z0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
