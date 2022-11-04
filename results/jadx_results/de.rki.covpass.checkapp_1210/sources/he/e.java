package he;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import he.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ub.c0;
import ub.u;
import ub.z;
import xc.u0;
import xc.y;
import xc.z0;
/* loaded from: classes3.dex */
public abstract class e extends i {

    /* renamed from: c */
    static final /* synthetic */ oc.k<Object>[] f11861c = {k0.g(new e0(k0.b(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: a */
    private final xc.e f11862a;

    /* renamed from: b */
    private final ne.i f11863b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<List<? extends xc.m>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            e.this = r1;
        }

        @Override // gc.a
        public final List<? extends xc.m> invoke() {
            List<? extends xc.m> o02;
            List<y> i10 = e.this.i();
            o02 = c0.o0(i10, e.this.j(i10));
            return o02;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ae.h {

        /* renamed from: a */
        final /* synthetic */ ArrayList<xc.m> f11865a;

        /* renamed from: b */
        final /* synthetic */ e f11866b;

        b(ArrayList<xc.m> arrayList, e eVar) {
            this.f11865a = arrayList;
            this.f11866b = eVar;
        }

        @Override // ae.i
        public void a(xc.b bVar) {
            t.e(bVar, "fakeOverride");
            ae.j.K(bVar, null);
            this.f11865a.add(bVar);
        }

        @Override // ae.h
        protected void e(xc.b bVar, xc.b bVar2) {
            t.e(bVar, "fromSuper");
            t.e(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f11866b.l() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public e(ne.n nVar, xc.e eVar) {
        t.e(nVar, "storageManager");
        t.e(eVar, "containingClass");
        this.f11862a = eVar;
        this.f11863b = nVar.d(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<xc.m> j(List<? extends y> list) {
        Collection<? extends xc.b> collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<oe.e0> l10 = this.f11862a.r().l();
        t.d(l10, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (oe.e0 e0Var : l10) {
            z.x(arrayList2, k.a.a(e0Var.z(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof xc.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            wd.f name = ((xc.b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            wd.f fVar = (wd.f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((xc.b) obj4) instanceof y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                ae.j jVar = ae.j.f444f;
                if (booleanValue) {
                    collection = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (t.a(((y) obj6).getName(), fVar)) {
                            collection.add(obj6);
                        }
                    }
                } else {
                    collection = u.h();
                }
                jVar.v(fVar, list2, collection, this.f11862a, new b(arrayList, this));
            }
        }
        return ye.a.c(arrayList);
    }

    private final List<xc.m> k() {
        return (List) ne.m.a(this.f11863b, this, f11861c[0]);
    }

    @Override // he.i, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        List<xc.m> k10 = k();
        ye.e eVar = new ye.e();
        for (Object obj : k10) {
            if ((obj instanceof u0) && t.a(((u0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // he.i, he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        List<xc.m> k10 = k();
        ye.e eVar = new ye.e();
        for (Object obj : k10) {
            if ((obj instanceof z0) && t.a(((z0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // he.i, he.k
    public Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        if (!dVar.a(d.f11846o.m())) {
            h10 = u.h();
            return h10;
        }
        return k();
    }

    protected abstract List<y> i();

    public final xc.e l() {
        return this.f11862a;
    }
}
