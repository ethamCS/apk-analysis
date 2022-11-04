package kd;

import ce.q;
import ce.s;
import gd.a0;
import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.o;
import oe.g0;
import oe.m0;
import oe.r1;
import tb.r;
import tb.x;
import ub.q0;
import xc.h0;
import xc.j1;
/* loaded from: classes.dex */
public final class e implements yc.c, id.g {

    /* renamed from: i */
    static final /* synthetic */ oc.k<Object>[] f14886i = {k0.g(new e0(k0.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), k0.g(new e0(k0.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), k0.g(new e0(k0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a */
    private final jd.g f14887a;

    /* renamed from: b */
    private final nd.a f14888b;

    /* renamed from: c */
    private final ne.j f14889c;

    /* renamed from: d */
    private final ne.i f14890d;

    /* renamed from: e */
    private final md.a f14891e;

    /* renamed from: f */
    private final ne.i f14892f;

    /* renamed from: g */
    private final boolean f14893g;

    /* renamed from: h */
    private final boolean f14894h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Map<wd.f, ? extends ce.g<?>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final Map<wd.f, ce.g<?>> invoke() {
            Map<wd.f, ce.g<?>> q10;
            Collection<nd.b> c10 = e.this.f14888b.c();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (nd.b bVar : c10) {
                wd.f name = bVar.getName();
                if (name == null) {
                    name = a0.f10634c;
                }
                ce.g l10 = eVar.l(bVar);
                r a10 = l10 != null ? x.a(name, l10) : null;
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            q10 = q0.q(arrayList);
            return q10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<wd.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final wd.c invoke() {
            wd.b i10 = e.this.f14888b.i();
            if (i10 != null) {
                return i10.b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<m0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final m0 invoke() {
            wd.c d10 = e.this.d();
            if (d10 == null) {
                return qe.k.d(qe.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, e.this.f14888b.toString());
            }
            xc.e f10 = wc.d.f(wc.d.f24727a, d10, e.this.f14887a.d().x(), null, 4, null);
            if (f10 == null) {
                nd.g n10 = e.this.f14888b.n();
                f10 = n10 != null ? e.this.f14887a.a().n().a(n10) : null;
                if (f10 == null) {
                    f10 = e.this.h(d10);
                }
            }
            return f10.u();
        }
    }

    public e(jd.g gVar, nd.a aVar, boolean z10) {
        t.e(gVar, "c");
        t.e(aVar, "javaAnnotation");
        this.f14887a = gVar;
        this.f14888b = aVar;
        this.f14889c = gVar.e().f(new b());
        this.f14890d = gVar.e().d(new c());
        this.f14891e = gVar.a().t().a(aVar);
        this.f14892f = gVar.e().d(new a());
        this.f14893g = aVar.a();
        this.f14894h = aVar.T() || z10;
    }

    public /* synthetic */ e(jd.g gVar, nd.a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, aVar, (i10 & 4) != 0 ? false : z10);
    }

    public final xc.e h(wd.c cVar) {
        h0 d10 = this.f14887a.d();
        wd.b m10 = wd.b.m(cVar);
        t.d(m10, "topLevel(fqName)");
        return xc.x.c(d10, m10, this.f14887a.a().b().d().q());
    }

    public final ce.g<?> l(nd.b bVar) {
        if (bVar instanceof o) {
            return ce.h.f6450a.c(((o) bVar).getValue());
        }
        if (bVar instanceof nd.m) {
            nd.m mVar = (nd.m) bVar;
            return p(mVar.d(), mVar.a());
        } else if (!(bVar instanceof nd.e)) {
            if (bVar instanceof nd.c) {
                return n(((nd.c) bVar).b());
            }
            if (!(bVar instanceof nd.h)) {
                return null;
            }
            return q(((nd.h) bVar).e());
        } else {
            nd.e eVar = (nd.e) bVar;
            wd.f name = eVar.getName();
            if (name == null) {
                name = a0.f10634c;
            }
            t.d(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return o(name, eVar.c());
        }
    }

    private final ce.g<?> n(nd.a aVar) {
        return new ce.a(new e(this.f14887a, aVar, false, 4, null));
    }

    private final ce.g<?> o(wd.f fVar, List<? extends nd.b> list) {
        oe.e0 e0Var;
        int s10;
        m0 type = getType();
        t.d(type, "type");
        if (g0.a(type)) {
            return null;
        }
        xc.e e10 = ee.a.e(this);
        t.b(e10);
        j1 b10 = hd.a.b(fVar, e10);
        if (b10 == null || (e0Var = b10.getType()) == null) {
            e0Var = this.f14887a.a().m().x().l(r1.INVARIANT, qe.k.d(qe.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        t.d(e0Var, "DescriptorResolverUtils.…GUMENT)\n                )");
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nd.b bVar : list) {
            ce.g<?> l10 = l(bVar);
            if (l10 == null) {
                l10 = new s();
            }
            arrayList.add(l10);
        }
        return ce.h.f6450a.a(arrayList, e0Var);
    }

    private final ce.g<?> p(wd.b bVar, wd.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new ce.j(bVar, fVar);
    }

    private final ce.g<?> q(nd.x xVar) {
        return q.Companion.a(this.f14887a.g().o(xVar, ld.d.d(hd.k.COMMON, false, null, 3, null)));
    }

    @Override // id.g
    public boolean a() {
        return this.f14893g;
    }

    @Override // yc.c
    public Map<wd.f, ce.g<?>> b() {
        return (Map) ne.m.a(this.f14892f, this, f14886i[2]);
    }

    @Override // yc.c
    public wd.c d() {
        return (wd.c) ne.m.b(this.f14889c, this, f14886i[0]);
    }

    /* renamed from: i */
    public md.a m() {
        return this.f14891e;
    }

    /* renamed from: j */
    public m0 getType() {
        return (m0) ne.m.a(this.f14890d, this, f14886i[1]);
    }

    public final boolean k() {
        return this.f14894h;
    }

    public String toString() {
        return zd.c.s(zd.c.f26620f, this, null, 2, null);
    }
}
