package kd;

import gd.o;
import hc.t;
import hc.v;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kd.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.d0;
import nd.u;
import pd.o;
import pd.q;
import qd.a;
import tb.p;
import ub.y0;
import xc.u0;
import xc.z0;
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: m */
    private final u f14943m;

    /* renamed from: n */
    private final h f14944n;

    /* renamed from: o */
    private final ne.j<Set<String>> f14945o;

    /* renamed from: p */
    private final ne.h<a, xc.e> f14946p;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final wd.f f14947a;

        /* renamed from: b */
        private final nd.g f14948b;

        public a(wd.f fVar, nd.g gVar) {
            t.e(fVar, "name");
            this.f14947a = fVar;
            this.f14948b = gVar;
        }

        public final nd.g a() {
            return this.f14948b;
        }

        public final wd.f b() {
            return this.f14947a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && t.a(this.f14947a, ((a) obj).f14947a);
        }

        public int hashCode() {
            return this.f14947a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final xc.e f14949a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xc.e eVar) {
                super(null);
                t.e(eVar, "descriptor");
                this.f14949a = eVar;
            }

            public final xc.e a() {
                return this.f14949a;
            }
        }

        /* renamed from: kd.i$b$b */
        /* loaded from: classes.dex */
        public static final class C0221b extends b {

            /* renamed from: a */
            public static final C0221b f14950a = new C0221b();

            private C0221b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f14951a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<a, xc.e> {

        /* renamed from: d */
        final /* synthetic */ jd.g f14953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jd.g gVar) {
            super(1);
            i.this = r1;
            this.f14953d = gVar;
        }

        /* renamed from: b */
        public final xc.e invoke(a aVar) {
            byte[] bArr;
            t.e(aVar, "request");
            wd.b bVar = new wd.b(i.this.C().d(), aVar.b());
            o.a a10 = aVar.a() != null ? this.f14953d.a().j().a(aVar.a()) : this.f14953d.a().j().b(bVar);
            q a11 = a10 != null ? a10.a() : null;
            wd.b i10 = a11 != null ? a11.i() : null;
            if (i10 == null || (!i10.l() && !i10.k())) {
                b R = i.this.R(a11);
                if (R instanceof b.a) {
                    return ((b.a) R).a();
                }
                if (R instanceof b.c) {
                    return null;
                }
                if (!(R instanceof b.C0221b)) {
                    throw new p();
                }
                nd.g a12 = aVar.a();
                if (a12 == null) {
                    gd.o d10 = this.f14953d.a().d();
                    if (a10 != null) {
                        if (!(a10 instanceof o.a.C0308a)) {
                            a10 = null;
                        }
                        o.a.C0308a c0308a = (o.a.C0308a) a10;
                        if (c0308a != null) {
                            bArr = c0308a.b();
                            a12 = d10.c(new o.b(bVar, bArr, null, 4, null));
                        }
                    }
                    bArr = null;
                    a12 = d10.c(new o.b(bVar, bArr, null, 4, null));
                }
                nd.g gVar = a12;
                if ((gVar != null ? gVar.J() : null) != d0.BINARY) {
                    wd.c d11 = gVar != null ? gVar.d() : null;
                    if (d11 == null || d11.d() || !t.a(d11.e(), i.this.C().d())) {
                        return null;
                    }
                    f fVar = new f(this.f14953d, i.this.C(), gVar, null, 8, null);
                    this.f14953d.a().e().a(fVar);
                    return fVar;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + pd.p.a(this.f14953d.a().j(), gVar) + "\nfindKotlinClass(ClassId) = " + pd.p.b(this.f14953d.a().j(), bVar) + '\n');
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<Set<? extends String>> {

        /* renamed from: c */
        final /* synthetic */ jd.g f14954c;

        /* renamed from: d */
        final /* synthetic */ i f14955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(jd.g gVar, i iVar) {
            super(0);
            this.f14954c = gVar;
            this.f14955d = iVar;
        }

        /* renamed from: b */
        public final Set<String> invoke() {
            return this.f14954c.a().d().b(this.f14955d.C().d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jd.g gVar, u uVar, h hVar) {
        super(gVar);
        t.e(gVar, "c");
        t.e(uVar, "jPackage");
        t.e(hVar, "ownerDescriptor");
        this.f14943m = uVar;
        this.f14944n = hVar;
        this.f14945o = gVar.e().f(new d(gVar, this));
        this.f14946p = gVar.e().i(new c(gVar));
    }

    private final xc.e N(wd.f fVar, nd.g gVar) {
        if (!wd.h.f24811a.a(fVar)) {
            return null;
        }
        Set<String> invoke = this.f14945o.invoke();
        if (gVar == null && invoke != null && !invoke.contains(fVar.b())) {
            return null;
        }
        return this.f14946p.invoke(new a(fVar, gVar));
    }

    public final b R(q qVar) {
        if (qVar != null) {
            if (qVar.a().c() != a.EnumC0322a.CLASS) {
                return b.c.f14951a;
            }
            xc.e k10 = w().a().b().k(qVar);
            if (k10 != null) {
                return new b.a(k10);
            }
        }
        return b.C0221b.f14950a;
    }

    public final xc.e O(nd.g gVar) {
        t.e(gVar, "javaClass");
        return N(gVar.getName(), gVar);
    }

    /* renamed from: P */
    public xc.e f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return N(fVar, null);
    }

    /* renamed from: Q */
    public h C() {
        return this.f14944n;
    }

    @Override // kd.j, he.i, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        List h10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        h10 = ub.u.h();
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC] */
    @Override // kd.j, he.i, he.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<xc.m> e(he.d r5, gc.l<? super wd.f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            hc.t.e(r5, r0)
            java.lang.String r0 = "nameFilter"
            hc.t.e(r6, r0)
            he.d$a r0 = he.d.Companion
            int r1 = r0.c()
            int r0 = r0.e()
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = ub.s.h()
            goto L65
        L20:
            ne.i r5 = r4.v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            xc.m r2 = (xc.m) r2
            boolean r3 = r2 instanceof xc.e
            if (r3 == 0) goto L5d
            xc.e r2 = (xc.e) r2
            wd.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            hc.t.d(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.i.e(he.d, gc.l):java.util.Collection");
    }

    @Override // kd.j
    protected Set<wd.f> l(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> b10;
        t.e(dVar, "kindFilter");
        if (!dVar.a(he.d.Companion.e())) {
            b10 = y0.b();
            return b10;
        }
        Set<String> invoke = this.f14945o.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(wd.f.j(str));
            }
            return hashSet;
        }
        u uVar = this.f14943m;
        if (lVar == null) {
            lVar = ye.d.a();
        }
        Collection<nd.g> G = uVar.G(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (nd.g gVar : G) {
            wd.f name = gVar.J() == d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kd.j
    protected Set<wd.f> n(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> b10;
        t.e(dVar, "kindFilter");
        b10 = y0.b();
        return b10;
    }

    @Override // kd.j
    protected kd.b p() {
        return b.a.f14879a;
    }

    @Override // kd.j
    protected void r(Collection<z0> collection, wd.f fVar) {
        t.e(collection, "result");
        t.e(fVar, "name");
    }

    @Override // kd.j
    protected Set<wd.f> t(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> b10;
        t.e(dVar, "kindFilter");
        b10 = y0.b();
        return b10;
    }
}
