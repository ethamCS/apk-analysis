package yc;

import af.p;
import hc.t;
import hc.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ub.c0;
/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: c */
    private final List<g> f26047c;

    /* loaded from: classes.dex */
    static final class a extends v implements gc.l<g, c> {

        /* renamed from: c */
        final /* synthetic */ wd.c f26048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wd.c cVar) {
            super(1);
            this.f26048c = cVar;
        }

        /* renamed from: b */
        public final c invoke(g gVar) {
            t.e(gVar, "it");
            return gVar.h(this.f26048c);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<g, af.h<? extends c>> {

        /* renamed from: c */
        public static final b f26049c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final af.h<c> invoke(g gVar) {
            af.h<c> M;
            t.e(gVar, "it");
            M = c0.M(gVar);
            return M;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends g> list) {
        t.e(list, "delegates");
        this.f26047c = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(yc.g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            hc.t.e(r2, r0)
            java.util.List r2 = ub.i.i0(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.k.<init>(yc.g[]):void");
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        af.h<g> M;
        t.e(cVar, "fqName");
        M = c0.M(this.f26047c);
        for (g gVar : M) {
            if (gVar.B(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // yc.g
    public c h(wd.c cVar) {
        af.h M;
        af.h A;
        Object t10;
        t.e(cVar, "fqName");
        M = c0.M(this.f26047c);
        A = p.A(M, new a(cVar));
        t10 = p.t(A);
        return (c) t10;
    }

    @Override // yc.g
    public boolean isEmpty() {
        List<g> list = this.f26047c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (g gVar : list) {
                if (!gVar.isEmpty()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        af.h M;
        af.h u10;
        M = c0.M(this.f26047c);
        u10 = p.u(M, b.f26049c);
        return u10.iterator();
    }
}
