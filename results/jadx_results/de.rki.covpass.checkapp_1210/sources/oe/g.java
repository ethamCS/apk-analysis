package oe;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
/* loaded from: classes3.dex */
public abstract class g extends m {

    /* renamed from: b */
    private final ne.i<b> f17981b;

    /* renamed from: c */
    private final boolean f17982c;

    /* loaded from: classes3.dex */
    public final class a implements e1 {

        /* renamed from: a */
        private final pe.g f17983a;

        /* renamed from: b */
        private final Lazy f17984b;

        /* renamed from: c */
        final /* synthetic */ g f17985c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: oe.g$a$a */
        /* loaded from: classes3.dex */
        public static final class C0282a extends hc.v implements gc.a<List<? extends e0>> {

            /* renamed from: d */
            final /* synthetic */ g f17987d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0282a(g gVar) {
                super(0);
                a.this = r1;
                this.f17987d = gVar;
            }

            @Override // gc.a
            public final List<? extends e0> invoke() {
                return pe.h.b(a.this.f17983a, this.f17987d.l());
            }
        }

        public a(g gVar, pe.g gVar2) {
            Lazy b10;
            hc.t.e(gVar2, "kotlinTypeRefiner");
            this.f17985c = gVar;
            this.f17983a = gVar2;
            b10 = tb.m.b(tb.o.PUBLICATION, new C0282a(gVar));
            this.f17984b = b10;
        }

        private final List<e0> e() {
            return (List) this.f17984b.getValue();
        }

        @Override // oe.e1
        public e1 a(pe.g gVar) {
            hc.t.e(gVar, "kotlinTypeRefiner");
            return this.f17985c.a(gVar);
        }

        public boolean equals(Object obj) {
            return this.f17985c.equals(obj);
        }

        /* renamed from: f */
        public List<e0> l() {
            return e();
        }

        @Override // oe.e1
        public List<xc.f1> getParameters() {
            List<xc.f1> parameters = this.f17985c.getParameters();
            hc.t.d(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f17985c.hashCode();
        }

        public String toString() {
            return this.f17985c.toString();
        }

        @Override // oe.e1
        public uc.h x() {
            uc.h x10 = this.f17985c.x();
            hc.t.d(x10, "this@AbstractTypeConstructor.builtIns");
            return x10;
        }

        @Override // oe.e1
        public boolean y() {
            return this.f17985c.y();
        }

        @Override // oe.e1
        public xc.h z() {
            return this.f17985c.z();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final Collection<e0> f17988a;

        /* renamed from: b */
        private List<? extends e0> f17989b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends e0> collection) {
            List<? extends e0> d10;
            hc.t.e(collection, "allSupertypes");
            this.f17988a = collection;
            d10 = ub.t.d(qe.k.f19894a.l());
            this.f17989b = d10;
        }

        public final Collection<e0> a() {
            return this.f17988a;
        }

        public final List<e0> b() {
            return this.f17989b;
        }

        public final void c(List<? extends e0> list) {
            hc.t.e(list, "<set-?>");
            this.f17989b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.a<b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final b invoke() {
            return new b(g.this.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.l<Boolean, b> {

        /* renamed from: c */
        public static final d f17991c = new d();

        d() {
            super(1);
        }

        public final b b(boolean z10) {
            List d10;
            d10 = ub.t.d(qe.k.f19894a.l());
            return new b(d10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return b(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends hc.v implements gc.l<b, tb.e0> {

        /* loaded from: classes3.dex */
        public static final class a extends hc.v implements gc.l<e1, Iterable<? extends e0>> {

            /* renamed from: c */
            final /* synthetic */ g f17993c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f17993c = gVar;
            }

            /* renamed from: b */
            public final Iterable<e0> invoke(e1 e1Var) {
                hc.t.e(e1Var, "it");
                return this.f17993c.h(e1Var, true);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends hc.v implements gc.l<e0, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ g f17994c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(1);
                this.f17994c = gVar;
            }

            public final void b(e0 e0Var) {
                hc.t.e(e0Var, "it");
                this.f17994c.q(e0Var);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(e0 e0Var) {
                b(e0Var);
                return tb.e0.f22152a;
            }
        }

        /* loaded from: classes3.dex */
        public static final class c extends hc.v implements gc.l<e1, Iterable<? extends e0>> {

            /* renamed from: c */
            final /* synthetic */ g f17995c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g gVar) {
                super(1);
                this.f17995c = gVar;
            }

            /* renamed from: b */
            public final Iterable<e0> invoke(e1 e1Var) {
                hc.t.e(e1Var, "it");
                return this.f17995c.h(e1Var, false);
            }
        }

        /* loaded from: classes3.dex */
        public static final class d extends hc.v implements gc.l<e0, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ g f17996c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(g gVar) {
                super(1);
                this.f17996c = gVar;
            }

            public final void b(e0 e0Var) {
                hc.t.e(e0Var, "it");
                this.f17996c.r(e0Var);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(e0 e0Var) {
                b(e0Var);
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            g.this = r1;
        }

        public final void b(b bVar) {
            hc.t.e(bVar, "supertypes");
            Collection<e0> a10 = g.this.n().a(g.this, bVar.a(), new c(g.this), new d(g.this));
            List<e0> list = null;
            if (a10.isEmpty()) {
                e0 j10 = g.this.j();
                a10 = j10 != null ? ub.t.d(j10) : null;
                if (a10 == null) {
                    a10 = ub.u.h();
                }
            }
            if (g.this.m()) {
                xc.d1 n10 = g.this.n();
                g gVar = g.this;
                n10.a(gVar, a10, new a(gVar), new b(g.this));
            }
            g gVar2 = g.this;
            if (a10 instanceof List) {
                list = (List) a10;
            }
            if (list == null) {
                list = ub.c0.F0(a10);
            }
            bVar.c(gVar2.p(list));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(b bVar) {
            b(bVar);
            return tb.e0.f22152a;
        }
    }

    public g(ne.n nVar) {
        hc.t.e(nVar, "storageManager");
        this.f17981b = nVar.h(new c(), d.f17991c, new e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        r4 = ub.c0.o0(r0.f17981b.invoke().a(), r0.k(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<oe.e0> h(oe.e1 r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof oe.g
            if (r0 == 0) goto L8
            r0 = r3
            oe.g r0 = (oe.g) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L22
            ne.i<oe.g$b> r1 = r0.f17981b
            java.lang.Object r1 = r1.invoke()
            oe.g$b r1 = (oe.g.b) r1
            java.util.Collection r1 = r1.a()
            java.util.Collection r4 = r0.k(r4)
            java.util.List r4 = ub.s.o0(r1, r4)
            if (r4 == 0) goto L22
            goto L2b
        L22:
            java.util.Collection r4 = r3.l()
            java.lang.String r3 = "supertypes"
            hc.t.d(r4, r3)
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.g.h(oe.e1, boolean):java.util.Collection");
    }

    @Override // oe.e1
    public e1 a(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return new a(this, gVar);
    }

    protected abstract Collection<e0> i();

    protected e0 j() {
        return null;
    }

    protected Collection<e0> k(boolean z10) {
        List h10;
        h10 = ub.u.h();
        return h10;
    }

    protected boolean m() {
        return this.f17982c;
    }

    protected abstract xc.d1 n();

    /* renamed from: o */
    public List<e0> l() {
        return this.f17981b.invoke().b();
    }

    protected List<e0> p(List<e0> list) {
        hc.t.e(list, "supertypes");
        return list;
    }

    protected void q(e0 e0Var) {
        hc.t.e(e0Var, "type");
    }

    protected void r(e0 e0Var) {
        hc.t.e(e0Var, "type");
    }
}
