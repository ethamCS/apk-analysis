package pd;

import ce.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oe.e0;
import pd.b;
import pd.q;
import pd.t;
import xc.a1;
/* loaded from: classes.dex */
public abstract class a<A, C> extends pd.b<A, C0302a<? extends A, ? extends C>> implements ke.c<A, C> {

    /* renamed from: b */
    private final ne.g<q, C0302a<A, C>> f19031b;

    /* renamed from: pd.a$a */
    /* loaded from: classes.dex */
    public static final class C0302a<A, C> extends b.a<A> {

        /* renamed from: a */
        private final Map<t, List<A>> f19032a;

        /* renamed from: b */
        private final Map<t, C> f19033b;

        /* renamed from: c */
        private final Map<t, C> f19034c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0302a(Map<t, ? extends List<? extends A>> map, Map<t, ? extends C> map2, Map<t, ? extends C> map3) {
            hc.t.e(map, "memberAnnotations");
            hc.t.e(map2, "propertyConstants");
            hc.t.e(map3, "annotationParametersDefaultValues");
            this.f19032a = map;
            this.f19033b = map2;
            this.f19034c = map3;
        }

        @Override // pd.b.a
        public Map<t, List<A>> a() {
            return this.f19032a;
        }

        public final Map<t, C> b() {
            return this.f19034c;
        }

        public final Map<t, C> c() {
            return this.f19033b;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.p<C0302a<? extends A, ? extends C>, t, C> {

        /* renamed from: c */
        public static final b f19035c = new b();

        b() {
            super(2);
        }

        /* renamed from: b */
        public final C u(C0302a<? extends A, ? extends C> c0302a, t tVar) {
            hc.t.e(c0302a, "$this$loadConstantFromProperty");
            hc.t.e(tVar, "it");
            return c0302a.b().get(tVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements q.d {

        /* renamed from: a */
        final /* synthetic */ a<A, C> f19036a;

        /* renamed from: b */
        final /* synthetic */ HashMap<t, List<A>> f19037b;

        /* renamed from: c */
        final /* synthetic */ q f19038c;

        /* renamed from: d */
        final /* synthetic */ HashMap<t, C> f19039d;

        /* renamed from: e */
        final /* synthetic */ HashMap<t, C> f19040e;

        /* renamed from: pd.a$c$a */
        /* loaded from: classes.dex */
        public final class C0303a extends b implements q.e {

            /* renamed from: d */
            final /* synthetic */ c f19041d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0303a(c cVar, t tVar) {
                super(cVar, tVar);
                hc.t.e(tVar, "signature");
                this.f19041d = cVar;
            }

            @Override // pd.q.e
            public q.a b(int i10, wd.b bVar, a1 a1Var) {
                hc.t.e(bVar, "classId");
                hc.t.e(a1Var, "source");
                t e10 = t.Companion.e(d(), i10);
                List<A> list = this.f19041d.f19037b.get(e10);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f19041d.f19037b.put(e10, list);
                }
                return this.f19041d.f19036a.y(bVar, a1Var, list);
            }
        }

        /* loaded from: classes.dex */
        public class b implements q.c {

            /* renamed from: a */
            private final t f19042a;

            /* renamed from: b */
            private final ArrayList<A> f19043b = new ArrayList<>();

            /* renamed from: c */
            final /* synthetic */ c f19044c;

            public b(c cVar, t tVar) {
                hc.t.e(tVar, "signature");
                this.f19044c = cVar;
                this.f19042a = tVar;
            }

            @Override // pd.q.c
            public void a() {
                if (!this.f19043b.isEmpty()) {
                    this.f19044c.f19037b.put(this.f19042a, this.f19043b);
                }
            }

            @Override // pd.q.c
            public q.a c(wd.b bVar, a1 a1Var) {
                hc.t.e(bVar, "classId");
                hc.t.e(a1Var, "source");
                return this.f19044c.f19036a.y(bVar, a1Var, this.f19043b);
            }

            protected final t d() {
                return this.f19042a;
            }
        }

        c(a<A, C> aVar, HashMap<t, List<A>> hashMap, q qVar, HashMap<t, C> hashMap2, HashMap<t, C> hashMap3) {
            this.f19036a = aVar;
            this.f19037b = hashMap;
            this.f19038c = qVar;
            this.f19039d = hashMap2;
            this.f19040e = hashMap3;
        }

        @Override // pd.q.d
        public q.c a(wd.f fVar, String str, Object obj) {
            C G;
            hc.t.e(fVar, "name");
            hc.t.e(str, "desc");
            t.a aVar = t.Companion;
            String b10 = fVar.b();
            hc.t.d(b10, "name.asString()");
            t a10 = aVar.a(b10, str);
            if (obj != null && (G = this.f19036a.G(str, obj)) != null) {
                this.f19040e.put(a10, G);
            }
            return new b(this, a10);
        }

        @Override // pd.q.d
        public q.e b(wd.f fVar, String str) {
            hc.t.e(fVar, "name");
            hc.t.e(str, "desc");
            t.a aVar = t.Companion;
            String b10 = fVar.b();
            hc.t.d(b10, "name.asString()");
            return new C0303a(this, aVar.d(b10, str));
        }
    }

    /* loaded from: classes.dex */
    static final class d extends hc.v implements gc.p<C0302a<? extends A, ? extends C>, t, C> {

        /* renamed from: c */
        public static final d f19045c = new d();

        d() {
            super(2);
        }

        /* renamed from: b */
        public final C u(C0302a<? extends A, ? extends C> c0302a, t tVar) {
            hc.t.e(c0302a, "$this$loadConstantFromProperty");
            hc.t.e(tVar, "it");
            return c0302a.c().get(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<q, C0302a<? extends A, ? extends C>> {

        /* renamed from: c */
        final /* synthetic */ a<A, C> f19046c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<A, C> aVar) {
            super(1);
            this.f19046c = aVar;
        }

        /* renamed from: b */
        public final C0302a<A, C> invoke(q qVar) {
            hc.t.e(qVar, "kotlinClass");
            return this.f19046c.F(qVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ne.n nVar, o oVar) {
        super(oVar);
        hc.t.e(nVar, "storageManager");
        hc.t.e(oVar, "kotlinClassFinder");
        this.f19031b = nVar.b(new e(this));
    }

    public final C0302a<A, C> F(q qVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        qVar.c(new c(this, hashMap, qVar, hashMap3, hashMap2), q(qVar));
        return new C0302a<>(hashMap, hashMap2, hashMap3);
    }

    private final C H(ke.z zVar, rd.n nVar, ke.b bVar, e0 e0Var, gc.p<? super C0302a<? extends A, ? extends C>, ? super t, ? extends C> pVar) {
        C u10;
        q o10 = o(zVar, v(zVar, true, true, td.b.A.d(nVar.C0()), vd.i.f(nVar)));
        if (o10 == null) {
            return null;
        }
        t r10 = r(nVar, zVar.b(), zVar.d(), bVar, o10.a().d().d(g.Companion.a()));
        if (r10 == null || (u10 = pVar.u(this.f19031b.invoke(o10), r10)) == null) {
            return null;
        }
        return uc.o.d(e0Var) ? I(u10) : u10;
    }

    /* renamed from: D */
    public C0302a<A, C> p(q qVar) {
        hc.t.e(qVar, "binaryClass");
        return this.f19031b.invoke(qVar);
    }

    public final boolean E(wd.b bVar, Map<wd.f, ? extends ce.g<?>> map) {
        hc.t.e(bVar, "annotationClassId");
        hc.t.e(map, "arguments");
        if (!hc.t.a(bVar, tc.a.f22183a.a())) {
            return false;
        }
        ce.g<?> gVar = map.get(wd.f.j("value"));
        q.b.C0091b c0091b = null;
        ce.q qVar = gVar instanceof ce.q ? (ce.q) gVar : null;
        if (qVar == null) {
            return false;
        }
        Object b10 = qVar.b();
        if (b10 instanceof q.b.C0091b) {
            c0091b = (q.b.C0091b) b10;
        }
        if (c0091b != null) {
            return w(c0091b.b());
        }
        return false;
    }

    protected abstract C G(String str, Object obj);

    protected abstract C I(C c10);

    @Override // ke.c
    public C e(ke.z zVar, rd.n nVar, e0 e0Var) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        hc.t.e(e0Var, "expectedType");
        return H(zVar, nVar, ke.b.PROPERTY_GETTER, e0Var, b.f19035c);
    }

    @Override // ke.c
    public C h(ke.z zVar, rd.n nVar, e0 e0Var) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        hc.t.e(e0Var, "expectedType");
        return H(zVar, nVar, ke.b.PROPERTY, e0Var, d.f19045c);
    }
}
