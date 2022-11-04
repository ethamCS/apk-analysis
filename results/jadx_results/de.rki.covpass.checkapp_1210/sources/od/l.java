package od;

import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oe.e0;
import oe.l0;
import oe.n1;
import oe.q1;
import ub.c0;
import ub.u;
import xc.f1;
import xc.j1;
import xc.x0;
import yc.g;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private final od.d f17888a;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<q1, Boolean> {

        /* renamed from: c */
        public static final a f17889c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q1 q1Var) {
            xc.h z10 = q1Var.W0().z();
            if (z10 == null) {
                return Boolean.FALSE;
            }
            wd.f name = z10.getName();
            wc.c cVar = wc.c.f24707a;
            return Boolean.valueOf(t.a(name, cVar.h().g()) && t.a(ee.a.d(z10), cVar.h()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<xc.b, e0> {

        /* renamed from: c */
        public static final b f17890c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final e0 invoke(xc.b bVar) {
            t.e(bVar, "it");
            x0 U = bVar.U();
            t.b(U);
            e0 type = U.getType();
            t.d(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<xc.b, e0> {

        /* renamed from: c */
        public static final c f17891c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final e0 invoke(xc.b bVar) {
            t.e(bVar, "it");
            e0 e10 = bVar.e();
            t.b(e10);
            return e10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends v implements gc.l<xc.b, e0> {

        /* renamed from: c */
        final /* synthetic */ j1 f17892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j1 j1Var) {
            super(1);
            this.f17892c = j1Var;
        }

        /* renamed from: b */
        public final e0 invoke(xc.b bVar) {
            t.e(bVar, "it");
            e0 type = bVar.o().get(this.f17892c.l()).getType();
            t.d(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.l<q1, Boolean> {

        /* renamed from: c */
        public static final e f17893c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q1 q1Var) {
            t.e(q1Var, "it");
            return Boolean.valueOf(q1Var instanceof l0);
        }
    }

    public l(od.d dVar) {
        t.e(dVar, "typeEnhancement");
        this.f17888a = dVar;
    }

    private final boolean a(e0 e0Var) {
        return n1.c(e0Var, a.f17889c);
    }

    private final e0 b(n nVar, e0 e0Var, List<? extends e0> list, q qVar, boolean z10) {
        return this.f17888a.a(e0Var, nVar.b(e0Var, list, qVar, z10), nVar.u());
    }

    private final e0 c(xc.b bVar, yc.a aVar, boolean z10, jd.g gVar, gd.b bVar2, q qVar, boolean z11, gc.l<? super xc.b, ? extends e0> lVar) {
        int s10;
        n nVar = new n(aVar, z10, gVar, bVar2, false, 16, null);
        e0 invoke = lVar.invoke(bVar);
        Collection<? extends xc.b> f10 = bVar.f();
        t.d(f10, "overriddenDescriptors");
        s10 = ub.v.s(f10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (xc.b bVar3 : f10) {
            t.d(bVar3, "it");
            arrayList.add(lVar.invoke(bVar3));
        }
        return b(nVar, invoke, arrayList, qVar, z11);
    }

    static /* synthetic */ e0 d(l lVar, n nVar, e0 e0Var, List list, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            qVar = null;
        }
        q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return lVar.b(nVar, e0Var, list, qVar2, z10);
    }

    static /* synthetic */ e0 e(l lVar, xc.b bVar, yc.a aVar, boolean z10, jd.g gVar, gd.b bVar2, q qVar, boolean z11, gc.l lVar2, int i10, Object obj) {
        return lVar.c(bVar, aVar, z10, gVar, bVar2, qVar, (i10 & 32) != 0 ? false : z11, lVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends xc.b> D f(D r21, jd.g r22) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od.l.f(xc.b, jd.g):xc.b");
    }

    private final e0 j(xc.b bVar, j1 j1Var, jd.g gVar, q qVar, boolean z10, gc.l<? super xc.b, ? extends e0> lVar) {
        jd.g h10;
        return c(bVar, j1Var, false, (j1Var == null || (h10 = jd.a.h(gVar, j1Var.j())) == null) ? gVar : h10, gd.b.VALUE_PARAMETER, qVar, z10, lVar);
    }

    private final <D extends xc.b> yc.g k(D d10, jd.g gVar) {
        int s10;
        List<? extends yc.c> m02;
        xc.h a10 = xc.s.a(d10);
        if (a10 == null) {
            return d10.j();
        }
        List<nd.a> list = null;
        kd.f fVar = a10 instanceof kd.f ? (kd.f) a10 : null;
        if (fVar != null) {
            list = fVar.Z0();
        }
        if (list == null || list.isEmpty()) {
            return d10.j();
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nd.a aVar : list) {
            arrayList.add(new kd.e(gVar, aVar, true));
        }
        g.a aVar2 = yc.g.Companion;
        m02 = c0.m0(d10.j(), arrayList);
        return aVar2.a(m02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends xc.b> Collection<D> g(jd.g gVar, Collection<? extends D> collection) {
        int s10;
        t.e(gVar, "c");
        t.e(collection, "platformSignatures");
        s10 = ub.v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(f((xc.b) it.next(), gVar));
        }
        return arrayList;
    }

    public final e0 h(e0 e0Var, jd.g gVar) {
        List h10;
        t.e(e0Var, "type");
        t.e(gVar, "context");
        n nVar = new n(null, false, gVar, gd.b.TYPE_USE, true);
        h10 = u.h();
        e0 d10 = d(this, nVar, e0Var, h10, null, false, 12, null);
        return d10 == null ? e0Var : d10;
    }

    public final List<e0> i(f1 f1Var, List<? extends e0> list, jd.g gVar) {
        int s10;
        List h10;
        t.e(f1Var, "typeParameter");
        t.e(list, "bounds");
        t.e(gVar, "context");
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (e0 e0Var : list) {
            if (!te.a.b(e0Var, e.f17893c)) {
                n nVar = new n(f1Var, false, gVar, gd.b.TYPE_PARAMETER_BOUNDS, false, 16, null);
                h10 = u.h();
                e0 d10 = d(this, nVar, e0Var, h10, null, false, 12, null);
                if (d10 != null) {
                    e0Var = d10;
                }
            }
            arrayList.add(e0Var);
        }
        return arrayList;
    }
}
