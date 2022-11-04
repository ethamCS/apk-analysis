package ke;

import java.util.ArrayList;
import java.util.List;
import ke.z;
import rd.b;
import xc.h0;
import xc.k0;
import yd.i;
/* loaded from: classes3.dex */
public final class d implements c<yc.c, ce.g<?>> {

    /* renamed from: a */
    private final je.a f15028a;

    /* renamed from: b */
    private final e f15029b;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15030a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.PROPERTY.ordinal()] = 1;
            iArr[b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[b.PROPERTY_SETTER.ordinal()] = 3;
            f15030a = iArr;
        }
    }

    public d(h0 h0Var, k0 k0Var, je.a aVar) {
        hc.t.e(h0Var, "module");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(aVar, "protocol");
        this.f15028a = aVar;
        this.f15029b = new e(h0Var, k0Var);
    }

    @Override // ke.f
    public List<yc.c> a(z zVar, rd.n nVar) {
        List<yc.c> h10;
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<yc.c> b(rd.q qVar, td.c cVar) {
        int s10;
        hc.t.e(qVar, "proto");
        hc.t.e(cVar, "nameResolver");
        List<rd.b> list = (List) qVar.I(this.f15028a.k());
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : list) {
            arrayList.add(this.f15029b.a(bVar, cVar));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<yc.c> c(z zVar, yd.q qVar, b bVar) {
        List<yc.c> h10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "proto");
        hc.t.e(bVar, "kind");
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<yc.c> d(z zVar, rd.g gVar) {
        int s10;
        hc.t.e(zVar, "container");
        hc.t.e(gVar, "proto");
        List<rd.b> list = (List) gVar.I(this.f15028a.d());
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : list) {
            arrayList.add(this.f15029b.a(bVar, zVar.b()));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<yc.c> f(z zVar, rd.n nVar) {
        List<yc.c> h10;
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<yc.c> g(z zVar, yd.q qVar, b bVar, int i10, rd.u uVar) {
        int s10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "callableProto");
        hc.t.e(bVar, "kind");
        hc.t.e(uVar, "proto");
        List<rd.b> list = (List) uVar.I(this.f15028a.g());
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar2 : list) {
            arrayList.add(this.f15029b.a(bVar2, zVar.b()));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<yc.c> i(rd.s sVar, td.c cVar) {
        int s10;
        hc.t.e(sVar, "proto");
        hc.t.e(cVar, "nameResolver");
        List<rd.b> list = (List) sVar.I(this.f15028a.l());
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : list) {
            arrayList.add(this.f15029b.a(bVar, cVar));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<yc.c> j(z zVar, yd.q qVar, b bVar) {
        i.d dVar;
        Object h10;
        int s10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "proto");
        hc.t.e(bVar, "kind");
        if (qVar instanceof rd.d) {
            dVar = (rd.d) qVar;
            h10 = this.f15028a.c();
        } else if (qVar instanceof rd.i) {
            dVar = (rd.i) qVar;
            h10 = this.f15028a.f();
        } else if (!(qVar instanceof rd.n)) {
            throw new IllegalStateException(("Unknown message: " + qVar).toString());
        } else {
            int i10 = a.f15030a[bVar.ordinal()];
            if (i10 == 1) {
                dVar = (rd.n) qVar;
                h10 = this.f15028a.h();
            } else if (i10 == 2) {
                dVar = (rd.n) qVar;
                h10 = this.f15028a.i();
            } else if (i10 != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            } else {
                dVar = (rd.n) qVar;
                h10 = this.f15028a.j();
            }
        }
        List<rd.b> list = (List) dVar.I(h10);
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar2 : list) {
            arrayList.add(this.f15029b.a(bVar2, zVar.b()));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<yc.c> k(z.a aVar) {
        int s10;
        hc.t.e(aVar, "container");
        List<rd.b> list = (List) aVar.f().I(this.f15028a.a());
        if (list == null) {
            list = ub.u.h();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : list) {
            arrayList.add(this.f15029b.a(bVar, aVar.b()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public ce.g<?> e(z zVar, rd.n nVar, oe.e0 e0Var) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        hc.t.e(e0Var, "expectedType");
        return null;
    }

    /* renamed from: m */
    public ce.g<?> h(z zVar, rd.n nVar, oe.e0 e0Var) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        hc.t.e(e0Var, "expectedType");
        b.C0339b.c cVar = (b.C0339b.c) td.e.a(nVar, this.f15028a.b());
        if (cVar == null) {
            return null;
        }
        return this.f15029b.f(e0Var, cVar, zVar.b());
    }
}
