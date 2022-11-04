package me;

import ad.f0;
import ad.p;
import hc.t;
import hc.v;
import he.h;
import he.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.a0;
import ke.b0;
import ke.d0;
import ke.r;
import ke.x;
import ke.z;
import oe.e1;
import oe.m0;
import org.conscrypt.BuildConfig;
import rd.c;
import rd.q;
import rd.s;
import rd.w;
import td.h;
import ub.c0;
import ub.p0;
import xc.a1;
import xc.d1;
import xc.e0;
import xc.f1;
import xc.g1;
import xc.h1;
import xc.i0;
import xc.j1;
import xc.k0;
import xc.u;
import xc.u0;
import xc.x0;
import xc.y0;
import xc.z0;
/* loaded from: classes3.dex */
public final class d extends ad.a implements xc.m {
    private final td.a U3;
    private final a1 V3;
    private final wd.b W3;
    private final e0 X3;
    private final u Y3;
    private final xc.f Z3;

    /* renamed from: a4 */
    private final ke.m f16466a4;

    /* renamed from: b4 */
    private final he.i f16467b4;

    /* renamed from: c4 */
    private final b f16468c4;

    /* renamed from: d4 */
    private final y0<a> f16469d4;

    /* renamed from: e4 */
    private final c f16470e4;

    /* renamed from: f4 */
    private final xc.m f16471f4;

    /* renamed from: g4 */
    private final ne.j<xc.d> f16472g4;

    /* renamed from: h4 */
    private final ne.i<Collection<xc.d>> f16473h4;

    /* renamed from: i4 */
    private final ne.j<xc.e> f16474i4;

    /* renamed from: j4 */
    private final ne.i<Collection<xc.e>> f16475j4;

    /* renamed from: k4 */
    private final ne.j<h1<m0>> f16476k4;

    /* renamed from: l4 */
    private final z.a f16477l4;

    /* renamed from: m4 */
    private final yc.g f16478m4;

    /* renamed from: y */
    private final rd.c f16479y;

    /* loaded from: classes3.dex */
    public final class a extends me.h {

        /* renamed from: f */
        private final pe.g f16480f;

        /* renamed from: g */
        private final ne.i<Collection<xc.m>> f16481g;

        /* renamed from: h */
        private final ne.i<Collection<oe.e0>> f16482h;

        /* renamed from: i */
        final /* synthetic */ d f16483i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.d$a$a */
        /* loaded from: classes3.dex */
        public static final class C0246a extends v implements gc.a<List<? extends wd.f>> {

            /* renamed from: c */
            final /* synthetic */ List<wd.f> f16484c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0246a(List<wd.f> list) {
                super(0);
                this.f16484c = list;
            }

            @Override // gc.a
            public final List<? extends wd.f> invoke() {
                return this.f16484c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b extends v implements gc.a<Collection<? extends xc.m>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b() {
                super(0);
                a.this = r1;
            }

            /* renamed from: b */
            public final Collection<xc.m> invoke() {
                return a.this.j(he.d.f11845n, he.h.Companion.a(), fd.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* loaded from: classes3.dex */
        public static final class c extends ae.h {

            /* renamed from: a */
            final /* synthetic */ List<D> f16486a;

            c(List<D> list) {
                this.f16486a = list;
            }

            @Override // ae.i
            public void a(xc.b bVar) {
                t.e(bVar, "fakeOverride");
                ae.j.K(bVar, null);
                this.f16486a.add(bVar);
            }

            @Override // ae.h
            protected void e(xc.b bVar, xc.b bVar2) {
                t.e(bVar, "fromSuper");
                t.e(bVar2, "fromCurrent");
                if (bVar2 instanceof p) {
                    ((p) bVar2).d1(xc.v.f25594a, bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.d$a$d */
        /* loaded from: classes3.dex */
        public static final class C0247d extends v implements gc.a<Collection<? extends oe.e0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0247d() {
                super(0);
                a.this = r1;
            }

            /* renamed from: b */
            public final Collection<oe.e0> invoke() {
                return a.this.f16480f.g(a.this.B());
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(me.d r8, pe.g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                hc.t.e(r9, r0)
                r7.f16483i = r8
                ke.m r2 = r8.j1()
                rd.c r0 = r8.k1()
                java.util.List r3 = r0.j1()
                java.lang.String r0 = "classProto.functionList"
                hc.t.d(r3, r0)
                rd.c r0 = r8.k1()
                java.util.List r4 = r0.x1()
                java.lang.String r0 = "classProto.propertyList"
                hc.t.d(r4, r0)
                rd.c r0 = r8.k1()
                java.util.List r5 = r0.F1()
                java.lang.String r0 = "classProto.typeAliasList"
                hc.t.d(r5, r0)
                rd.c r0 = r8.k1()
                java.util.List r0 = r0.u1()
                java.lang.String r1 = "classProto.nestedClassNameList"
                hc.t.d(r0, r1)
                ke.m r8 = r8.j1()
                td.c r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = ub.s.s(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L56:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L6e
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                wd.f r6 = ke.x.b(r8, r6)
                r1.add(r6)
                goto L56
            L6e:
                me.d$a$a r6 = new me.d$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f16480f = r9
                ke.m r8 = r7.p()
                ne.n r8 = r8.h()
                me.d$a$b r9 = new me.d$a$b
                r9.<init>()
                ne.i r8 = r8.d(r9)
                r7.f16481g = r8
                ke.m r8 = r7.p()
                ne.n r8 = r8.h()
                me.d$a$d r9 = new me.d$a$d
                r9.<init>()
                ne.i r8 = r8.d(r9)
                r7.f16482h = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.d.a.<init>(me.d, pe.g):void");
        }

        private final <D extends xc.b> void A(wd.f fVar, Collection<? extends D> collection, List<D> list) {
            p().c().m().a().v(fVar, collection, new ArrayList(list), B(), new c(list));
        }

        public final d B() {
            return this.f16483i;
        }

        public void C(wd.f fVar, fd.b bVar) {
            t.e(fVar, "name");
            t.e(bVar, "location");
            ed.a.a(p().c().o(), bVar, B(), fVar);
        }

        @Override // me.h, he.i, he.h
        public Collection<u0> a(wd.f fVar, fd.b bVar) {
            t.e(fVar, "name");
            t.e(bVar, "location");
            C(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // me.h, he.i, he.h
        public Collection<z0> b(wd.f fVar, fd.b bVar) {
            t.e(fVar, "name");
            t.e(bVar, "location");
            C(fVar, bVar);
            return super.b(fVar, bVar);
        }

        @Override // he.i, he.k
        public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
            t.e(dVar, "kindFilter");
            t.e(lVar, "nameFilter");
            return this.f16481g.invoke();
        }

        @Override // me.h, he.i, he.k
        public xc.h f(wd.f fVar, fd.b bVar) {
            xc.e f10;
            t.e(fVar, "name");
            t.e(bVar, "location");
            C(fVar, bVar);
            c cVar = B().f16470e4;
            return (cVar == null || (f10 = cVar.f(fVar)) == null) ? super.f(fVar, bVar) : f10;
        }

        @Override // me.h
        protected void i(Collection<xc.m> collection, gc.l<? super wd.f, Boolean> lVar) {
            t.e(collection, "result");
            t.e(lVar, "nameFilter");
            c cVar = B().f16470e4;
            Collection<xc.e> d10 = cVar != null ? cVar.d() : null;
            if (d10 == null) {
                d10 = ub.u.h();
            }
            collection.addAll(d10);
        }

        @Override // me.h
        protected void k(wd.f fVar, List<z0> list) {
            t.e(fVar, "name");
            t.e(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (oe.e0 e0Var : this.f16482h.invoke()) {
                arrayList.addAll(e0Var.z().b(fVar, fd.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(p().c().c().e(fVar, this.f16483i));
            A(fVar, arrayList, list);
        }

        @Override // me.h
        protected void l(wd.f fVar, List<u0> list) {
            t.e(fVar, "name");
            t.e(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (oe.e0 e0Var : this.f16482h.invoke()) {
                arrayList.addAll(e0Var.z().a(fVar, fd.d.FOR_ALREADY_TRACKED));
            }
            A(fVar, arrayList, list);
        }

        @Override // me.h
        protected wd.b m(wd.f fVar) {
            t.e(fVar, "name");
            wd.b d10 = this.f16483i.W3.d(fVar);
            t.d(d10, "classId.createNestedClassId(name)");
            return d10;
        }

        @Override // me.h
        protected Set<wd.f> s() {
            List<oe.e0> l10 = B().f16468c4.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (oe.e0 e0Var : l10) {
                Set<wd.f> g10 = e0Var.z().g();
                if (g10 == null) {
                    return null;
                }
                ub.z.x(linkedHashSet, g10);
            }
            return linkedHashSet;
        }

        @Override // me.h
        protected Set<wd.f> t() {
            List<oe.e0> l10 = B().f16468c4.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (oe.e0 e0Var : l10) {
                ub.z.x(linkedHashSet, e0Var.z().c());
            }
            linkedHashSet.addAll(p().c().c().b(this.f16483i));
            return linkedHashSet;
        }

        @Override // me.h
        protected Set<wd.f> u() {
            List<oe.e0> l10 = B().f16468c4.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (oe.e0 e0Var : l10) {
                ub.z.x(linkedHashSet, e0Var.z().d());
            }
            return linkedHashSet;
        }

        @Override // me.h
        protected boolean x(z0 z0Var) {
            t.e(z0Var, "function");
            return p().c().s().d(this.f16483i, z0Var);
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends oe.b {

        /* renamed from: d */
        private final ne.i<List<f1>> f16488d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.a<List<? extends f1>> {

            /* renamed from: c */
            final /* synthetic */ d f16490c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.f16490c = dVar;
            }

            @Override // gc.a
            public final List<? extends f1> invoke() {
                return g1.d(this.f16490c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(r3.j1().h());
            d.this = r3;
            this.f16488d = r3.j1().h().d(new a(r3));
        }

        @Override // oe.e1
        public List<f1> getParameters() {
            return this.f16488d.invoke();
        }

        @Override // oe.g
        protected Collection<oe.e0> i() {
            int s10;
            List<oe.e0> o02;
            List F0;
            int s11;
            String str;
            wd.c b10;
            List<q> l10 = td.f.l(d.this.k1(), d.this.j1().j());
            d dVar = d.this;
            s10 = ub.v.s(l10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (q qVar : l10) {
                arrayList.add(dVar.j1().i().q(qVar));
            }
            o02 = c0.o0(arrayList, d.this.j1().c().c().a(d.this));
            ArrayList<k0.b> arrayList2 = new ArrayList();
            for (oe.e0 e0Var : o02) {
                xc.h z10 = e0Var.W0().z();
                k0.b bVar = z10 instanceof k0.b ? (k0.b) z10 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                r i10 = d.this.j1().c().i();
                d dVar2 = d.this;
                s11 = ub.v.s(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(s11);
                for (k0.b bVar2 : arrayList2) {
                    wd.b g10 = ee.a.g(bVar2);
                    if (g10 == null || (b10 = g10.b()) == null || (str = b10.b()) == null) {
                        str = bVar2.getName().b();
                    }
                    arrayList3.add(str);
                }
                i10.b(dVar2, arrayList3);
            }
            F0 = c0.F0(o02);
            return F0;
        }

        @Override // oe.g
        protected d1 n() {
            return d1.a.f25530a;
        }

        public String toString() {
            String fVar = d.this.getName().toString();
            t.d(fVar, "name.toString()");
            return fVar;
        }

        /* renamed from: u */
        public d z() {
            return d.this;
        }

        @Override // oe.e1
        public boolean y() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: a */
        private final Map<wd.f, rd.g> f16491a;

        /* renamed from: b */
        private final ne.h<wd.f, xc.e> f16492b;

        /* renamed from: c */
        private final ne.i<Set<wd.f>> f16493c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.l<wd.f, xc.e> {

            /* renamed from: d */
            final /* synthetic */ d f16496d;

            /* renamed from: me.d$c$a$a */
            /* loaded from: classes3.dex */
            public static final class C0248a extends v implements gc.a<List<? extends yc.c>> {

                /* renamed from: c */
                final /* synthetic */ d f16497c;

                /* renamed from: d */
                final /* synthetic */ rd.g f16498d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0248a(d dVar, rd.g gVar) {
                    super(0);
                    this.f16497c = dVar;
                    this.f16498d = gVar;
                }

                @Override // gc.a
                public final List<? extends yc.c> invoke() {
                    List<? extends yc.c> F0;
                    F0 = c0.F0(this.f16497c.j1().c().d().d(this.f16497c.o1(), this.f16498d));
                    return F0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                c.this = r1;
                this.f16496d = dVar;
            }

            /* renamed from: b */
            public final xc.e invoke(wd.f fVar) {
                t.e(fVar, "name");
                rd.g gVar = (rd.g) c.this.f16491a.get(fVar);
                if (gVar != null) {
                    d dVar = this.f16496d;
                    return ad.n.U0(dVar.j1().h(), dVar, fVar, c.this.f16493c, new me.a(dVar.j1().h(), new C0248a(dVar, gVar)), a1.f25519a);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b extends v implements gc.a<Set<? extends wd.f>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b() {
                super(0);
                c.this = r1;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                return c.this.e();
            }
        }

        public c() {
            int s10;
            int d10;
            int b10;
            d.this = r6;
            List<rd.g> e12 = r6.k1().e1();
            t.d(e12, "classProto.enumEntryList");
            s10 = ub.v.s(e12, 10);
            d10 = p0.d(s10);
            b10 = nc.m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (Object obj : e12) {
                linkedHashMap.put(x.b(r6.j1().g(), ((rd.g) obj).h0()), obj);
            }
            this.f16491a = linkedHashMap;
            this.f16492b = d.this.j1().h().i(new a(d.this));
            this.f16493c = d.this.j1().h().d(new b());
        }

        public final Set<wd.f> e() {
            Set<wd.f> h10;
            HashSet hashSet = new HashSet();
            for (oe.e0 e0Var : d.this.r().l()) {
                for (xc.m mVar : k.a.a(e0Var.z(), null, null, 3, null)) {
                    if ((mVar instanceof z0) || (mVar instanceof u0)) {
                        hashSet.add(mVar.getName());
                    }
                }
            }
            List<rd.i> j12 = d.this.k1().j1();
            t.d(j12, "classProto.functionList");
            d dVar = d.this;
            for (rd.i iVar : j12) {
                hashSet.add(x.b(dVar.j1().g(), iVar.F0()));
            }
            List<rd.n> x12 = d.this.k1().x1();
            t.d(x12, "classProto.propertyList");
            d dVar2 = d.this;
            for (rd.n nVar : x12) {
                hashSet.add(x.b(dVar2.j1().g(), nVar.E0()));
            }
            h10 = ub.z0.h(hashSet, hashSet);
            return h10;
        }

        public final Collection<xc.e> d() {
            Set<wd.f> keySet = this.f16491a.keySet();
            ArrayList arrayList = new ArrayList();
            for (wd.f fVar : keySet) {
                xc.e f10 = f(fVar);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            return arrayList;
        }

        public final xc.e f(wd.f fVar) {
            t.e(fVar, "name");
            return this.f16492b.invoke(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.d$d */
    /* loaded from: classes3.dex */
    public static final class C0249d extends v implements gc.a<List<? extends yc.c>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0249d() {
            super(0);
            d.this = r1;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<? extends yc.c> F0;
            F0 = c0.F0(d.this.j1().c().d().k(d.this.o1()));
            return F0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends v implements gc.a<xc.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final xc.e invoke() {
            return d.this.b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f extends v implements gc.a<Collection<? extends xc.d>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final Collection<xc.d> invoke() {
            return d.this.c1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class g extends hc.p implements gc.l<pe.g, a> {
        g(Object obj) {
            super(1, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return hc.k0.b(a.class);
        }

        @Override // hc.h
        public final String g0() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "<init>";
        }

        /* renamed from: i0 */
        public final a invoke(pe.g gVar) {
            t.e(gVar, "p0");
            return new a((d) this.f11756d, gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h extends v implements gc.a<xc.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final xc.d invoke() {
            return d.this.f1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i extends v implements gc.a<Collection<? extends xc.e>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final Collection<xc.e> invoke() {
            return d.this.h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j extends v implements gc.a<h1<m0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final h1<m0> invoke() {
            return d.this.i1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ke.m mVar, rd.c cVar, td.c cVar2, td.a aVar, a1 a1Var) {
        super(mVar.h(), x.a(cVar2, cVar.g1()).j());
        t.e(mVar, "outerContext");
        t.e(cVar, "classProto");
        t.e(cVar2, "nameResolver");
        t.e(aVar, "metadataVersion");
        t.e(a1Var, "sourceElement");
        this.f16479y = cVar;
        this.U3 = aVar;
        this.V3 = a1Var;
        this.W3 = x.a(cVar2, cVar.g1());
        a0 a0Var = a0.f15009a;
        this.X3 = a0Var.b(td.b.f22196e.d(cVar.f1()));
        this.Y3 = b0.a(a0Var, td.b.f22195d.d(cVar.f1()));
        xc.f a10 = a0Var.a(td.b.f22197f.d(cVar.f1()));
        this.Z3 = a10;
        List<s> I1 = cVar.I1();
        t.d(I1, "classProto.typeParameterList");
        rd.t J1 = cVar.J1();
        t.d(J1, "classProto.typeTable");
        td.g gVar = new td.g(J1);
        h.a aVar2 = td.h.Companion;
        w L1 = cVar.L1();
        t.d(L1, "classProto.versionRequirementTable");
        ke.m a11 = mVar.a(this, I1, cVar2, gVar, aVar2.a(L1), aVar);
        this.f16466a4 = a11;
        xc.f fVar = xc.f.ENUM_CLASS;
        this.f16467b4 = a10 == fVar ? new he.l(a11.h(), this) : h.b.f11873a;
        this.f16468c4 = new b();
        this.f16469d4 = y0.Companion.a(this, a11.h(), a11.c().m().c(), new g(this));
        z.a aVar3 = null;
        this.f16470e4 = a10 == fVar ? new c() : null;
        xc.m e10 = mVar.e();
        this.f16471f4 = e10;
        this.f16472g4 = a11.h().f(new h());
        this.f16473h4 = a11.h().d(new f());
        this.f16474i4 = a11.h().f(new e());
        this.f16475j4 = a11.h().d(new i());
        this.f16476k4 = a11.h().f(new j());
        td.c g10 = a11.g();
        td.g j10 = a11.j();
        d dVar = e10 instanceof d ? (d) e10 : null;
        this.f16477l4 = new z.a(cVar, g10, j10, a1Var, dVar != null ? dVar.f16477l4 : aVar3);
        this.f16478m4 = !td.b.f22194c.d(cVar.f1()).booleanValue() ? yc.g.Companion.b() : new n(a11.h(), new C0249d());
    }

    public final xc.e b1() {
        if (!this.f16479y.M1()) {
            return null;
        }
        xc.h f10 = l1().f(x.b(this.f16466a4.g(), this.f16479y.S0()), fd.d.FROM_DESERIALIZATION);
        if (!(f10 instanceof xc.e)) {
            return null;
        }
        return (xc.e) f10;
    }

    public final Collection<xc.d> c1() {
        List l10;
        List o02;
        List o03;
        List<xc.d> g12 = g1();
        l10 = ub.u.l(A0());
        o02 = c0.o0(g12, l10);
        o03 = c0.o0(o02, this.f16466a4.c().c().c(this));
        return o03;
    }

    private final xc.z<m0> d1() {
        wd.f fVar;
        m0 m0Var;
        Object V;
        Object obj = null;
        if (isInline() || j0()) {
            if (j0() && !this.f16479y.P1() && !this.f16479y.Q1() && !this.f16479y.R1() && this.f16479y.n1() > 0) {
                return null;
            }
            if (this.f16479y.P1()) {
                fVar = x.b(this.f16466a4.g(), this.f16479y.k1());
            } else if (this.U3.c(1, 5, 1)) {
                throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + this).toString());
            } else {
                xc.d A0 = A0();
                if (A0 == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
                }
                List<j1> o10 = A0.o();
                t.d(o10, "constructor.valueParameters");
                V = c0.V(o10);
                fVar = ((j1) V).getName();
                t.d(fVar, "{\n                // Bef…irst().name\n            }");
            }
            q f10 = td.f.f(this.f16479y, this.f16466a4.j());
            if (f10 == null || (m0Var = d0.n(this.f16466a4.i(), f10, false, 2, null)) == null) {
                Iterator<T> it = l1().a(fVar, fd.d.FROM_DESERIALIZATION).iterator();
                Object obj2 = null;
                boolean z10 = false;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((u0) next).U() == null) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            obj2 = next;
                        }
                    } else if (z10) {
                        obj = obj2;
                    }
                }
                u0 u0Var = (u0) obj;
                if (u0Var == null) {
                    throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
                }
                oe.e0 type = u0Var.getType();
                t.c(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                m0Var = (m0) type;
            }
            return new xc.z<>(fVar, m0Var);
        }
        return null;
    }

    private final i0<m0> e1() {
        int s10;
        List<q> list;
        int s11;
        List M0;
        int s12;
        List<Integer> o12 = this.f16479y.o1();
        t.d(o12, "classProto.multiFieldValueClassUnderlyingNameList");
        s10 = ub.v.s(o12, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Integer num : o12) {
            td.c g10 = this.f16466a4.g();
            t.d(num, "it");
            arrayList.add(x.b(g10, num.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (!j0()) {
            throw new IllegalArgumentException(("Not a value class: " + this).toString());
        }
        tb.r a10 = tb.x.a(Integer.valueOf(this.f16479y.r1()), Integer.valueOf(this.f16479y.q1()));
        if (t.a(a10, tb.x.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> s13 = this.f16479y.s1();
            t.d(s13, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
            s12 = ub.v.s(s13, 10);
            list = new ArrayList<>(s12);
            for (Integer num2 : s13) {
                td.g j10 = this.f16466a4.j();
                t.d(num2, "it");
                list.add(j10.a(num2.intValue()));
            }
        } else if (!t.a(a10, tb.x.a(0, Integer.valueOf(arrayList.size())))) {
            throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
        } else {
            list = this.f16479y.t1();
        }
        t.d(list, "when (typeIdCount to typ…tation: $this\")\n        }");
        s11 = ub.v.s(list, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (q qVar : list) {
            d0 i10 = this.f16466a4.i();
            t.d(qVar, "it");
            arrayList2.add(d0.n(i10, qVar, false, 2, null));
        }
        M0 = c0.M0(arrayList, arrayList2);
        return new i0<>(M0);
    }

    public final xc.d f1() {
        Object obj;
        if (this.Z3.g()) {
            ad.f k10 = ae.c.k(this, a1.f25519a);
            k10.p1(u());
            return k10;
        }
        List<rd.d> V0 = this.f16479y.V0();
        t.d(V0, "classProto.constructorList");
        Iterator<T> it = V0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!td.b.f22204m.d(((rd.d) obj).l0()).booleanValue()) {
                break;
            }
        }
        rd.d dVar = (rd.d) obj;
        if (dVar == null) {
            return null;
        }
        return this.f16466a4.f().i(dVar, true);
    }

    private final List<xc.d> g1() {
        int s10;
        List<rd.d> V0 = this.f16479y.V0();
        t.d(V0, "classProto.constructorList");
        ArrayList<rd.d> arrayList = new ArrayList();
        for (Object obj : V0) {
            Boolean d10 = td.b.f22204m.d(((rd.d) obj).l0());
            t.d(d10, "IS_SECONDARY.get(it.flags)");
            if (d10.booleanValue()) {
                arrayList.add(obj);
            }
        }
        s10 = ub.v.s(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        for (rd.d dVar : arrayList) {
            ke.w f10 = this.f16466a4.f();
            t.d(dVar, "it");
            arrayList2.add(f10.i(dVar, false));
        }
        return arrayList2;
    }

    public final Collection<xc.e> h1() {
        List h10;
        if (this.X3 != e0.SEALED) {
            h10 = ub.u.h();
            return h10;
        }
        List<Integer> y12 = this.f16479y.y1();
        t.d(y12, "fqNames");
        if (!(!y12.isEmpty())) {
            return ae.a.f421a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : y12) {
            ke.k c10 = this.f16466a4.c();
            td.c g10 = this.f16466a4.g();
            t.d(num, "index");
            xc.e b10 = c10.b(x.a(g10, num.intValue()));
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    public final h1<m0> i1() {
        xc.z<m0> d12 = d1();
        i0<m0> e12 = e1();
        if (d12 != null && e12 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        } else if ((!j0() && !isInline()) || d12 != null || e12 != null) {
            return d12 != null ? d12 : e12;
        } else {
            throw new IllegalArgumentException("Value class has no value class representation: " + this);
        }
    }

    private final a l1() {
        return this.f16469d4.c(this.f16466a4.c().m().c());
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        return this.f16466a4.i().j();
    }

    @Override // xc.e
    public xc.d A0() {
        return this.f16472g4.invoke();
    }

    @Override // xc.e
    public xc.e E0() {
        return this.f16474i4.invoke();
    }

    @Override // xc.d0
    public boolean H() {
        Boolean d10 = td.b.f22200i.d(this.f16479y.f1());
        t.d(d10, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return d10.booleanValue();
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    @Override // xc.e
    public boolean N() {
        return td.b.f22197f.d(this.f16479y.f1()) == c.EnumC0343c.COMPANION_OBJECT;
    }

    @Override // ad.a, xc.e
    public List<x0> O0() {
        int s10;
        List<q> Z0 = this.f16479y.Z0();
        t.d(Z0, "classProto.contextReceiverTypeList");
        s10 = ub.v.s(Z0, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (q qVar : Z0) {
            d0 i10 = this.f16466a4.i();
            t.d(qVar, "it");
            arrayList.add(new f0(S0(), new ie.b(this, i10.q(qVar), null), yc.g.Companion.b()));
        }
        return arrayList;
    }

    @Override // xc.e
    public boolean R0() {
        Boolean d10 = td.b.f22199h.d(this.f16479y.f1());
        t.d(d10, "IS_DATA.get(classProto.flags)");
        return d10.booleanValue();
    }

    @Override // xc.e
    public boolean V() {
        Boolean d10 = td.b.f22203l.d(this.f16479y.f1());
        t.d(d10, "IS_FUN_INTERFACE.get(classProto.flags)");
        return d10.booleanValue();
    }

    @Override // xc.e, xc.n, xc.y, xc.l
    public xc.m b() {
        return this.f16471f4;
    }

    @Override // xc.e, xc.q, xc.d0
    public u g() {
        return this.Y3;
    }

    @Override // xc.e
    public xc.f h() {
        return this.Z3;
    }

    @Override // xc.e
    public boolean isInline() {
        Boolean d10 = td.b.f22202k.d(this.f16479y.f1());
        t.d(d10, "IS_VALUE_CLASS.get(classProto.flags)");
        return d10.booleanValue() && this.U3.e(1, 4, 1);
    }

    @Override // yc.a
    public yc.g j() {
        return this.f16478m4;
    }

    @Override // xc.e
    public boolean j0() {
        Boolean d10 = td.b.f22202k.d(this.f16479y.f1());
        t.d(d10, "IS_VALUE_CLASS.get(classProto.flags)");
        return d10.booleanValue() && this.U3.c(1, 4, 2);
    }

    public final ke.m j1() {
        return this.f16466a4;
    }

    @Override // xc.e
    public Collection<xc.d> k() {
        return this.f16473h4.invoke();
    }

    public final rd.c k1() {
        return this.f16479y;
    }

    @Override // xc.d0
    public boolean l0() {
        Boolean d10 = td.b.f22201j.d(this.f16479y.f1());
        t.d(d10, "IS_EXPECT_CLASS.get(classProto.flags)");
        return d10.booleanValue();
    }

    @Override // xc.p
    public a1 m() {
        return this.V3;
    }

    @Override // xc.i
    public boolean m0() {
        Boolean d10 = td.b.f22198g.d(this.f16479y.f1());
        t.d(d10, "IS_INNER.get(classProto.flags)");
        return d10.booleanValue();
    }

    public final td.a m1() {
        return this.U3;
    }

    /* renamed from: n1 */
    public he.i B0() {
        return this.f16467b4;
    }

    public final z.a o1() {
        return this.f16477l4;
    }

    public final boolean p1(wd.f fVar) {
        t.e(fVar, "name");
        return l1().q().contains(fVar);
    }

    @Override // xc.h
    public e1 r() {
        return this.f16468c4;
    }

    @Override // xc.e, xc.d0
    public e0 s() {
        return this.X3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(l0() ? "expect " : BuildConfig.FLAVOR);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // xc.e
    public Collection<xc.e> v() {
        return this.f16475j4.invoke();
    }

    @Override // xc.e
    public h1<m0> x0() {
        return this.f16476k4.invoke();
    }

    @Override // ad.t
    public he.h y0(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        return this.f16469d4.c(gVar);
    }
}
