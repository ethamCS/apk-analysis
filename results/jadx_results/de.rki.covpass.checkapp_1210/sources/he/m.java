package he;

import hc.t;
import hc.v;
import he.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import oe.j1;
import oe.l1;
import xc.c1;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public final class m implements h {

    /* renamed from: a */
    private final h f11878a;

    /* renamed from: b */
    private final l1 f11879b;

    /* renamed from: c */
    private Map<xc.m, xc.m> f11880c;

    /* renamed from: d */
    private final Lazy f11881d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<Collection<? extends xc.m>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            m.this = r1;
        }

        /* renamed from: b */
        public final Collection<xc.m> invoke() {
            m mVar = m.this;
            return mVar.k(k.a.a(mVar.f11878a, null, null, 3, null));
        }
    }

    public m(h hVar, l1 l1Var) {
        Lazy a10;
        t.e(hVar, "workerScope");
        t.e(l1Var, "givenSubstitutor");
        this.f11878a = hVar;
        j1 j10 = l1Var.j();
        t.d(j10, "givenSubstitutor.substitution");
        this.f11879b = be.d.f(j10, false, 1, null).c();
        a10 = tb.m.a(new a());
        this.f11881d = a10;
    }

    private final Collection<xc.m> j() {
        return (Collection) this.f11881d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends xc.m> Collection<D> k(Collection<? extends D> collection) {
        if (!this.f11879b.k() && !collection.isEmpty()) {
            LinkedHashSet g10 = ye.a.g(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                g10.add(l((xc.m) it.next()));
            }
            return g10;
        }
        return collection;
    }

    private final <D extends xc.m> D l(D d10) {
        if (this.f11879b.k()) {
            return d10;
        }
        if (this.f11880c == null) {
            this.f11880c = new HashMap();
        }
        Map<xc.m, xc.m> map = this.f11880c;
        t.b(map);
        xc.m mVar = map.get(d10);
        if (mVar == null) {
            if (!(d10 instanceof c1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            mVar = ((c1) d10).c(this.f11879b);
            if (mVar == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, mVar);
        }
        D d11 = (D) mVar;
        t.c(d11, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d11;
    }

    @Override // he.h
    public Collection<? extends u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return k(this.f11878a.a(fVar, bVar));
    }

    @Override // he.h
    public Collection<? extends z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return k(this.f11878a.b(fVar, bVar));
    }

    @Override // he.h
    public Set<wd.f> c() {
        return this.f11878a.c();
    }

    @Override // he.h
    public Set<wd.f> d() {
        return this.f11878a.d();
    }

    @Override // he.k
    public Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        return j();
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        xc.h f10 = this.f11878a.f(fVar, bVar);
        if (f10 != null) {
            return (xc.h) l(f10);
        }
        return null;
    }

    @Override // he.h
    public Set<wd.f> g() {
        return this.f11878a.g();
    }
}
