package xc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class n0 implements p0 {

    /* renamed from: a */
    private final Collection<l0> f25568a;

    /* loaded from: classes.dex */
    static final class a extends hc.v implements gc.l<l0, wd.c> {

        /* renamed from: c */
        public static final a f25569c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final wd.c invoke(l0 l0Var) {
            hc.t.e(l0Var, "it");
            return l0Var.d();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.l<wd.c, Boolean> {

        /* renamed from: c */
        final /* synthetic */ wd.c f25570c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wd.c cVar) {
            super(1);
            this.f25570c = cVar;
        }

        /* renamed from: b */
        public final Boolean invoke(wd.c cVar) {
            hc.t.e(cVar, "it");
            return Boolean.valueOf(!cVar.d() && hc.t.a(cVar.e(), this.f25570c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(Collection<? extends l0> collection) {
        hc.t.e(collection, "packageFragments");
        this.f25568a = collection;
    }

    @Override // xc.m0
    public List<l0> a(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        Collection<l0> collection = this.f25568a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (hc.t.a(((l0) obj).d(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xc.p0
    public void b(wd.c cVar, Collection<l0> collection) {
        hc.t.e(cVar, "fqName");
        hc.t.e(collection, "packageFragments");
        for (Object obj : this.f25568a) {
            if (hc.t.a(((l0) obj).d(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // xc.p0
    public boolean c(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        Collection<l0> collection = this.f25568a;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (l0 l0Var : collection) {
                if (hc.t.a(l0Var.d(), cVar)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // xc.m0
    public Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar) {
        af.h M;
        af.h z10;
        af.h q10;
        List F;
        hc.t.e(cVar, "fqName");
        hc.t.e(lVar, "nameFilter");
        M = ub.c0.M(this.f25568a);
        z10 = af.p.z(M, a.f25569c);
        q10 = af.p.q(z10, new b(cVar));
        F = af.p.F(q10);
        return F;
    }
}
