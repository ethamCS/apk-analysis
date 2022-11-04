package kd;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import nd.u;
import pd.q;
import ub.y0;
import ub.z;
import xc.u0;
import xc.z0;
/* loaded from: classes.dex */
public final class d implements he.h {

    /* renamed from: e */
    static final /* synthetic */ oc.k<Object>[] f14880e = {k0.g(new e0(k0.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    private final jd.g f14881a;

    /* renamed from: b */
    private final h f14882b;

    /* renamed from: c */
    private final i f14883c;

    /* renamed from: d */
    private final ne.i f14884d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<he.h[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final he.h[] invoke() {
            Collection<q> values = d.this.f14882b.V0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            for (q qVar : values) {
                he.h b10 = dVar.f14881a.a().b().b(dVar.f14882b, qVar);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            Object[] array = xe.a.b(arrayList).toArray(new he.h[0]);
            t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (he.h[]) array;
        }
    }

    public d(jd.g gVar, u uVar, h hVar) {
        t.e(gVar, "c");
        t.e(uVar, "jPackage");
        t.e(hVar, "packageFragment");
        this.f14881a = gVar;
        this.f14882b = hVar;
        this.f14883c = new i(gVar, uVar, hVar);
        this.f14884d = gVar.e().d(new a());
    }

    private final he.h[] k() {
        return (he.h[]) ne.m.a(this.f14884d, this, f14880e[0]);
    }

    @Override // he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        Set b10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        l(fVar, bVar);
        i iVar = this.f14883c;
        he.h[] k10 = k();
        Collection<? extends u0> a10 = iVar.a(fVar, bVar);
        int length = k10.length;
        int i10 = 0;
        Collection collection = a10;
        while (i10 < length) {
            i10++;
            collection = xe.a.a(collection, k10[i10].a(fVar, bVar));
        }
        if (collection == null) {
            b10 = y0.b();
            return b10;
        }
        return collection;
    }

    @Override // he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        Set b10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        l(fVar, bVar);
        i iVar = this.f14883c;
        he.h[] k10 = k();
        Collection<? extends z0> b11 = iVar.b(fVar, bVar);
        int length = k10.length;
        int i10 = 0;
        Collection collection = b11;
        while (i10 < length) {
            i10++;
            collection = xe.a.a(collection, k10[i10].b(fVar, bVar));
        }
        if (collection == null) {
            b10 = y0.b();
            return b10;
        }
        return collection;
    }

    @Override // he.h
    public Set<wd.f> c() {
        he.h[] k10 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (he.h hVar : k10) {
            z.x(linkedHashSet, hVar.c());
        }
        linkedHashSet.addAll(this.f14883c.c());
        return linkedHashSet;
    }

    @Override // he.h
    public Set<wd.f> d() {
        he.h[] k10 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (he.h hVar : k10) {
            z.x(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(this.f14883c.d());
        return linkedHashSet;
    }

    @Override // he.k
    public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set b10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        i iVar = this.f14883c;
        he.h[] k10 = k();
        Collection<xc.m> e10 = iVar.e(dVar, lVar);
        for (he.h hVar : k10) {
            e10 = xe.a.a(e10, hVar.e(dVar, lVar));
        }
        if (e10 == null) {
            b10 = y0.b();
            return b10;
        }
        return e10;
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        l(fVar, bVar);
        xc.e f10 = this.f14883c.f(fVar, bVar);
        if (f10 != null) {
            return f10;
        }
        xc.h hVar = null;
        for (he.h hVar2 : k()) {
            xc.h f11 = hVar2.f(fVar, bVar);
            if (f11 != null) {
                if (!(f11 instanceof xc.i) || !((xc.i) f11).l0()) {
                    return f11;
                }
                if (hVar == null) {
                    hVar = f11;
                }
            }
        }
        return hVar;
    }

    @Override // he.h
    public Set<wd.f> g() {
        Iterable r10;
        r10 = ub.m.r(k());
        Set<wd.f> a10 = he.j.a(r10);
        if (a10 != null) {
            a10.addAll(this.f14883c.g());
            return a10;
        }
        return null;
    }

    public final i j() {
        return this.f14883c;
    }

    public void l(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        ed.a.b(this.f14881a.a().l(), bVar, this.f14882b, fVar);
    }

    public String toString() {
        return "scope for " + this.f14882b;
    }
}
