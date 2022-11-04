package he;

import hc.t;
import he.h;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.u;
import ub.y0;
import ub.z;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public final class b implements h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f11829a;

    /* renamed from: b */
    private final h[] f11830b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String str, Iterable<? extends h> iterable) {
            t.e(str, "debugName");
            t.e(iterable, "scopes");
            ye.e eVar = new ye.e();
            for (h hVar : iterable) {
                if (hVar != h.b.f11873a) {
                    if (hVar instanceof b) {
                        z.y(eVar, ((b) hVar).f11830b);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return b(str, eVar);
        }

        public final h b(String str, List<? extends h> list) {
            t.e(str, "debugName");
            t.e(list, "scopes");
            int size = list.size();
            if (size != 0) {
                if (size == 1) {
                    return list.get(0);
                }
                Object[] array = list.toArray(new h[0]);
                t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new b(str, (h[]) array, null);
            }
            return h.b.f11873a;
        }
    }

    private b(String str, h[] hVarArr) {
        this.f11829a = str;
        this.f11830b = hVarArr;
    }

    public /* synthetic */ b(String str, h[] hVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVarArr);
    }

    @Override // he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        List h10;
        Set b10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        h[] hVarArr = this.f11830b;
        int length = hVarArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        }
        if (length == 1) {
            return hVarArr[0].a(fVar, bVar);
        }
        Collection<u0> collection = null;
        for (h hVar : hVarArr) {
            collection = xe.a.a(collection, hVar.a(fVar, bVar));
        }
        if (collection != null) {
            return collection;
        }
        b10 = y0.b();
        return b10;
    }

    @Override // he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        List h10;
        Set b10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        h[] hVarArr = this.f11830b;
        int length = hVarArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        }
        if (length == 1) {
            return hVarArr[0].b(fVar, bVar);
        }
        Collection<z0> collection = null;
        for (h hVar : hVarArr) {
            collection = xe.a.a(collection, hVar.b(fVar, bVar));
        }
        if (collection != null) {
            return collection;
        }
        b10 = y0.b();
        return b10;
    }

    @Override // he.h
    public Set<wd.f> c() {
        h[] hVarArr = this.f11830b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            z.x(linkedHashSet, hVar.c());
        }
        return linkedHashSet;
    }

    @Override // he.h
    public Set<wd.f> d() {
        h[] hVarArr = this.f11830b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            z.x(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // he.k
    public Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        Set b10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        h[] hVarArr = this.f11830b;
        int length = hVarArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        }
        if (length == 1) {
            return hVarArr[0].e(dVar, lVar);
        }
        Collection<xc.m> collection = null;
        for (h hVar : hVarArr) {
            collection = xe.a.a(collection, hVar.e(dVar, lVar));
        }
        if (collection != null) {
            return collection;
        }
        b10 = y0.b();
        return b10;
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        xc.h hVar = null;
        for (h hVar2 : this.f11830b) {
            xc.h f10 = hVar2.f(fVar, bVar);
            if (f10 != null) {
                if (!(f10 instanceof xc.i) || !((xc.i) f10).l0()) {
                    return f10;
                }
                if (hVar == null) {
                    hVar = f10;
                }
            }
        }
        return hVar;
    }

    @Override // he.h
    public Set<wd.f> g() {
        Iterable r10;
        r10 = ub.m.r(this.f11830b);
        return j.a(r10);
    }

    public String toString() {
        return this.f11829a;
    }
}
