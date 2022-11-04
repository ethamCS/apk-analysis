package zd;

import bf.a0;
import bf.x;
import ce.q;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import oe.g0;
import oe.g1;
import oe.m0;
import oe.n1;
import oe.q1;
import oe.r1;
import oe.s1;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
import ub.u;
import ub.z0;
import uc.k;
import xc.b;
import xc.d0;
import xc.e1;
import xc.f1;
import xc.h0;
import xc.j1;
import xc.k0;
import xc.k1;
import xc.l0;
import xc.o;
import xc.p;
import xc.q0;
import xc.s0;
import xc.t0;
import xc.u0;
import xc.v0;
import xc.w;
import xc.w0;
import xc.x0;
import xc.y;
import zd.c;
/* loaded from: classes3.dex */
public final class d extends zd.c implements zd.f {

    /* renamed from: k */
    private final zd.g f26637k;

    /* renamed from: l */
    private final Lazy f26638l;

    /* loaded from: classes3.dex */
    private final class a implements o<e0, StringBuilder> {

        /* renamed from: zd.d$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0477a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f26640a;

            static {
                int[] iArr = new int[l.values().length];
                iArr[l.PRETTY.ordinal()] = 1;
                iArr[l.DEBUG.ordinal()] = 2;
                iArr[l.NONE.ordinal()] = 3;
                f26640a = iArr;
            }
        }

        public a() {
            d.this = r1;
        }

        private final void t(t0 t0Var, StringBuilder sb2, String str) {
            int i10 = C0477a.f26640a[d.this.m0().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                p(t0Var, sb2);
                return;
            }
            d.this.S0(t0Var, sb2);
            sb2.append(str + " for ");
            d dVar = d.this;
            u0 C0 = t0Var.C0();
            t.d(C0, "descriptor.correspondingProperty");
            dVar.B1(C0, sb2);
        }

        public void A(j1 j1Var, StringBuilder sb2) {
            t.e(j1Var, "descriptor");
            t.e(sb2, "builder");
            d.this.T1(j1Var, true, sb2, true);
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 a(l0 l0Var, StringBuilder sb2) {
            r(l0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 b(xc.l lVar, StringBuilder sb2) {
            o(lVar, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 c(v0 v0Var, StringBuilder sb2) {
            v(v0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 d(xc.e eVar, StringBuilder sb2) {
            n(eVar, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 e(w0 w0Var, StringBuilder sb2) {
            w(w0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 f(e1 e1Var, StringBuilder sb2) {
            y(e1Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 g(y yVar, StringBuilder sb2) {
            p(yVar, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 h(q0 q0Var, StringBuilder sb2) {
            s(q0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 i(x0 x0Var, StringBuilder sb2) {
            x(x0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 j(u0 u0Var, StringBuilder sb2) {
            u(u0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 k(f1 f1Var, StringBuilder sb2) {
            z(f1Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 l(h0 h0Var, StringBuilder sb2) {
            q(h0Var, sb2);
            return e0.f22152a;
        }

        @Override // xc.o
        public /* bridge */ /* synthetic */ e0 m(j1 j1Var, StringBuilder sb2) {
            A(j1Var, sb2);
            return e0.f22152a;
        }

        public void n(xc.e eVar, StringBuilder sb2) {
            t.e(eVar, "descriptor");
            t.e(sb2, "builder");
            d.this.Y0(eVar, sb2);
        }

        public void o(xc.l lVar, StringBuilder sb2) {
            t.e(lVar, "constructorDescriptor");
            t.e(sb2, "builder");
            d.this.d1(lVar, sb2);
        }

        public void p(y yVar, StringBuilder sb2) {
            t.e(yVar, "descriptor");
            t.e(sb2, "builder");
            d.this.j1(yVar, sb2);
        }

        public void q(h0 h0Var, StringBuilder sb2) {
            t.e(h0Var, "descriptor");
            t.e(sb2, "builder");
            d.this.t1(h0Var, sb2, true);
        }

        public void r(l0 l0Var, StringBuilder sb2) {
            t.e(l0Var, "descriptor");
            t.e(sb2, "builder");
            d.this.x1(l0Var, sb2);
        }

        public void s(q0 q0Var, StringBuilder sb2) {
            t.e(q0Var, "descriptor");
            t.e(sb2, "builder");
            d.this.z1(q0Var, sb2);
        }

        public void u(u0 u0Var, StringBuilder sb2) {
            t.e(u0Var, "descriptor");
            t.e(sb2, "builder");
            d.this.B1(u0Var, sb2);
        }

        public void v(v0 v0Var, StringBuilder sb2) {
            t.e(v0Var, "descriptor");
            t.e(sb2, "builder");
            t(v0Var, sb2, "getter");
        }

        public void w(w0 w0Var, StringBuilder sb2) {
            t.e(w0Var, "descriptor");
            t.e(sb2, "builder");
            t(w0Var, sb2, "setter");
        }

        public void x(x0 x0Var, StringBuilder sb2) {
            t.e(x0Var, "descriptor");
            t.e(sb2, "builder");
            sb2.append(x0Var.getName());
        }

        public void y(e1 e1Var, StringBuilder sb2) {
            t.e(e1Var, "descriptor");
            t.e(sb2, "builder");
            d.this.J1(e1Var, sb2);
        }

        public void z(f1 f1Var, StringBuilder sb2) {
            t.e(f1Var, "descriptor");
            t.e(sb2, "builder");
            d.this.O1(f1Var, sb2, true);
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26641a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26642b;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.PLAIN.ordinal()] = 1;
            iArr[m.HTML.ordinal()] = 2;
            f26641a = iArr;
            int[] iArr2 = new int[k.values().length];
            iArr2[k.ALL.ordinal()] = 1;
            iArr2[k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[k.NONE.ordinal()] = 3;
            f26642b = iArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.l<g1, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            d.this = r1;
        }

        /* renamed from: b */
        public final CharSequence invoke(g1 g1Var) {
            t.e(g1Var, "it");
            if (g1Var.c()) {
                return "*";
            }
            d dVar = d.this;
            oe.e0 type = g1Var.getType();
            t.d(type, "it.type");
            String w9 = dVar.w(type);
            if (g1Var.b() == r1.INVARIANT) {
                return w9;
            }
            return g1Var.b() + ' ' + w9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zd.d$d */
    /* loaded from: classes3.dex */
    public static final class C0478d extends v implements gc.a<d> {

        /* renamed from: zd.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.l<zd.f, e0> {

            /* renamed from: c */
            public static final a f26645c = new a();

            a() {
                super(1);
            }

            public final void b(zd.f fVar) {
                List k10;
                Set<wd.c> h10;
                t.e(fVar, "$this$withOptions");
                Set<wd.c> l10 = fVar.l();
                k10 = u.k(k.a.C, k.a.D);
                h10 = z0.h(l10, k10);
                fVar.e(h10);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(zd.f fVar) {
                b(fVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0478d() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final d invoke() {
            zd.c y10 = d.this.y(a.f26645c);
            t.c(y10, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (d) y10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends v implements gc.l<ce.g<?>, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            d.this = r1;
        }

        /* renamed from: b */
        public final CharSequence invoke(ce.g<?> gVar) {
            t.e(gVar, "it");
            return d.this.c1(gVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends v implements gc.l<j1, CharSequence> {

        /* renamed from: c */
        public static final f f26647c = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(j1 j1Var) {
            return BuildConfig.FLAVOR;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends v implements gc.l<oe.e0, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(1);
            d.this = r1;
        }

        /* renamed from: b */
        public final CharSequence invoke(oe.e0 e0Var) {
            d dVar = d.this;
            t.d(e0Var, "it");
            return dVar.w(e0Var);
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends v implements gc.l<oe.e0, Object> {

        /* renamed from: c */
        public static final h f26649c = new h();

        h() {
            super(1);
        }

        /* renamed from: b */
        public final Object invoke(oe.e0 e0Var) {
            t.e(e0Var, "it");
            return e0Var instanceof oe.u0 ? ((oe.u0) e0Var).f1() : e0Var;
        }
    }

    public d(zd.g gVar) {
        Lazy a10;
        t.e(gVar, "options");
        this.f26637k = gVar;
        gVar.k0();
        a10 = tb.m.a(new C0478d());
        this.f26638l = a10;
    }

    private final void A1(StringBuilder sb2, s0 s0Var) {
        String str;
        s0 c10 = s0Var.c();
        if (c10 != null) {
            A1(sb2, c10);
            sb2.append('.');
            wd.f name = s0Var.b().getName();
            t.d(name, "possiblyInnerType.classifierDescriptor.name");
            str = v(name, false);
        } else {
            oe.e1 r10 = s0Var.b().r();
            t.d(r10, "possiblyInnerType.classi…escriptor.typeConstructor");
            str = L1(r10);
        }
        sb2.append(str);
        sb2.append(K1(s0Var.a()));
    }

    public final void B1(u0 u0Var, StringBuilder sb2) {
        if (!z0()) {
            if (!y0()) {
                C1(u0Var, sb2);
                List<x0> d02 = u0Var.d0();
                t.d(d02, "property.contextReceiverParameters");
                e1(d02, sb2);
                xc.u g10 = u0Var.g();
                t.d(g10, "property.visibility");
                W1(g10, sb2);
                boolean z10 = false;
                s1(sb2, f0().contains(zd.e.CONST) && u0Var.P(), "const");
                o1(u0Var, sb2);
                r1(u0Var, sb2);
                w1(u0Var, sb2);
                if (f0().contains(zd.e.LATEINIT) && u0Var.h0()) {
                    z10 = true;
                }
                s1(sb2, z10, "lateinit");
                n1(u0Var, sb2);
            }
            S1(this, u0Var, sb2, false, 4, null);
            List<f1> p10 = u0Var.p();
            t.d(p10, "property.typeParameters");
            Q1(p10, sb2, true);
            D1(u0Var, sb2);
        }
        t1(u0Var, sb2, true);
        sb2.append(": ");
        oe.e0 type = u0Var.getType();
        t.d(type, "property.type");
        sb2.append(w(type));
        E1(u0Var, sb2);
        l1(u0Var, sb2);
        List<f1> p11 = u0Var.p();
        t.d(p11, "property.typeParameters");
        X1(p11, sb2);
    }

    private final void C1(u0 u0Var, StringBuilder sb2) {
        Object s02;
        if (!f0().contains(zd.e.ANNOTATIONS)) {
            return;
        }
        W0(this, sb2, u0Var, null, 2, null);
        w c02 = u0Var.c0();
        if (c02 != null) {
            V0(sb2, c02, yc.e.FIELD);
        }
        w W = u0Var.W();
        if (W != null) {
            V0(sb2, W, yc.e.PROPERTY_DELEGATE_FIELD);
        }
        if (m0() != l.NONE) {
            return;
        }
        v0 i10 = u0Var.i();
        if (i10 != null) {
            V0(sb2, i10, yc.e.PROPERTY_GETTER);
        }
        w0 n10 = u0Var.n();
        if (n10 == null) {
            return;
        }
        V0(sb2, n10, yc.e.PROPERTY_SETTER);
        List<j1> o10 = n10.o();
        t.d(o10, "setter.valueParameters");
        s02 = c0.s0(o10);
        j1 j1Var = (j1) s02;
        t.d(j1Var, "it");
        V0(sb2, j1Var, yc.e.SETTER_PARAMETER);
    }

    private final void D1(xc.a aVar, StringBuilder sb2) {
        x0 U = aVar.U();
        if (U != null) {
            V0(sb2, U, yc.e.RECEIVER);
            oe.e0 type = U.getType();
            t.d(type, "receiver.type");
            sb2.append(h1(type));
            sb2.append(".");
        }
    }

    private final void E1(xc.a aVar, StringBuilder sb2) {
        x0 U;
        if (n0() && (U = aVar.U()) != null) {
            sb2.append(" on ");
            oe.e0 type = U.getType();
            t.d(type, "receiver.type");
            sb2.append(w(type));
        }
    }

    private final void F1(StringBuilder sb2, m0 m0Var) {
        if (t.a(m0Var, n1.f18025b) || n1.k(m0Var)) {
            sb2.append("???");
        } else if (qe.k.o(m0Var)) {
            if (!C0()) {
                sb2.append("???");
                return;
            }
            oe.e1 W0 = m0Var.W0();
            t.c(W0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(g1(((qe.i) W0).e(0)));
        } else if (g0.a(m0Var)) {
            f1(sb2, m0Var);
        } else if (Z1(m0Var)) {
            k1(sb2, m0Var);
        } else {
            f1(sb2, m0Var);
        }
    }

    private final void G1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void H1(xc.e eVar, StringBuilder sb2) {
        if (!J0() && !uc.h.m0(eVar.u())) {
            Collection<oe.e0> l10 = eVar.r().l();
            t.d(l10, "klass.typeConstructor.supertypes");
            if (l10.isEmpty()) {
                return;
            }
            if (l10.size() == 1 && uc.h.b0(l10.iterator().next())) {
                return;
            }
            G1(sb2);
            sb2.append(": ");
            c0.c0(l10, sb2, ", ", null, null, 0, null, new g(), 60, null);
        }
    }

    private final void I1(y yVar, StringBuilder sb2) {
        s1(sb2, yVar.s0(), "suspend");
    }

    public final void J1(e1 e1Var, StringBuilder sb2) {
        W0(this, sb2, e1Var, null, 2, null);
        xc.u g10 = e1Var.g();
        t.d(g10, "typeAlias.visibility");
        W1(g10, sb2);
        o1(e1Var, sb2);
        sb2.append(m1("typealias"));
        sb2.append(" ");
        t1(e1Var, sb2, true);
        List<f1> A = e1Var.A();
        t.d(A, "typeAlias.declaredTypeParameters");
        Q1(A, sb2, false);
        X0(e1Var, sb2);
        sb2.append(" = ");
        sb2.append(w(e1Var.L()));
    }

    private final void L(StringBuilder sb2, xc.m mVar) {
        xc.m b10;
        String name;
        if ((mVar instanceof l0) || (mVar instanceof q0) || (b10 = mVar.b()) == null || (b10 instanceof h0)) {
            return;
        }
        sb2.append(" ");
        sb2.append(p1("defined in"));
        sb2.append(" ");
        wd.d m10 = ae.d.m(b10);
        t.d(m10, "getFqName(containingDeclaration)");
        sb2.append(m10.e() ? "root package" : u(m10));
        if (!H0() || !(b10 instanceof l0) || !(mVar instanceof p) || (name = ((p) mVar).m().a().getName()) == null) {
            return;
        }
        sb2.append(" ");
        sb2.append(p1("in file"));
        sb2.append(" ");
        sb2.append(name);
    }

    private final String L0() {
        return P(">");
    }

    private final void M(StringBuilder sb2, List<? extends g1> list) {
        c0.c0(list, sb2, ", ", null, null, 0, null, new c(), 60, null);
    }

    private final boolean M0(oe.e0 e0Var) {
        return uc.g.q(e0Var) || !e0Var.j().isEmpty();
    }

    private final void M1(StringBuilder sb2, oe.e0 e0Var, oe.e1 e1Var) {
        s0 a10 = xc.g1.a(e0Var);
        if (a10 != null) {
            A1(sb2, a10);
            return;
        }
        sb2.append(L1(e1Var));
        sb2.append(K1(e0Var.U0()));
    }

    private final String N() {
        int i10 = b.f26641a[A0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new tb.p();
            }
            return "&rarr;";
        }
        return P("->");
    }

    private final xc.e0 N0(d0 d0Var) {
        if (d0Var instanceof xc.e) {
            return ((xc.e) d0Var).h() == xc.f.INTERFACE ? xc.e0.ABSTRACT : xc.e0.FINAL;
        }
        xc.m b10 = d0Var.b();
        xc.e eVar = b10 instanceof xc.e ? (xc.e) b10 : null;
        if (eVar != null && (d0Var instanceof xc.b)) {
            xc.b bVar = (xc.b) d0Var;
            Collection<? extends xc.b> f10 = bVar.f();
            t.d(f10, "this.overriddenDescriptors");
            if ((!f10.isEmpty()) && eVar.s() != xc.e0.FINAL) {
                return xc.e0.OPEN;
            }
            if (eVar.h() != xc.f.INTERFACE || t.a(bVar.g(), xc.t.f25577a)) {
                return xc.e0.FINAL;
            }
            xc.e0 s10 = bVar.s();
            xc.e0 e0Var = xc.e0.ABSTRACT;
            return s10 == e0Var ? e0Var : xc.e0.OPEN;
        }
        return xc.e0.FINAL;
    }

    static /* synthetic */ void N1(d dVar, StringBuilder sb2, oe.e0 e0Var, oe.e1 e1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e1Var = e0Var.W0();
        }
        dVar.M1(sb2, e0Var, e1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (hc.t.a(r7 + '?', r8) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean O(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = bf.o.E(r0, r1, r2, r3, r4, r5)
            boolean r0 = hc.t.a(r7, r0)
            r1 = 0
            if (r0 != 0) goto L50
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = bf.o.u(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = hc.t.a(r0, r8)
            if (r0 != 0) goto L50
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = hc.t.a(r7, r8)
            if (r7 == 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.O(java.lang.String, java.lang.String):boolean");
    }

    private final boolean O0(yc.c cVar) {
        return t.a(cVar.d(), k.a.E);
    }

    public final void O1(f1 f1Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(P0());
        }
        if (F0()) {
            sb2.append("/*");
            sb2.append(f1Var.l());
            sb2.append("*/ ");
        }
        s1(sb2, f1Var.Z(), "reified");
        String h10 = f1Var.w().h();
        boolean z11 = true;
        s1(sb2, h10.length() > 0, h10);
        W0(this, sb2, f1Var, null, 2, null);
        t1(f1Var, sb2, z10);
        int size = f1Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            oe.e0 next = f1Var.getUpperBounds().iterator().next();
            if (!uc.h.i0(next)) {
                sb2.append(" : ");
                t.d(next, "upperBound");
                sb2.append(w(next));
            }
        } else if (z10) {
            for (oe.e0 e0Var : f1Var.getUpperBounds()) {
                if (!uc.h.i0(e0Var)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    t.d(e0Var, "upperBound");
                    sb2.append(w(e0Var));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(L0());
        }
    }

    private final String P(String str) {
        return A0().g(str);
    }

    private final String P0() {
        return P("<");
    }

    private final void P1(StringBuilder sb2, List<? extends f1> list) {
        Iterator<? extends f1> it = list.iterator();
        while (it.hasNext()) {
            O1(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final boolean Q0(xc.b bVar) {
        return !bVar.f().isEmpty();
    }

    private final void Q1(List<? extends f1> list, StringBuilder sb2, boolean z10) {
        if (!K0() && (!list.isEmpty())) {
            sb2.append(P0());
            P1(sb2, list);
            sb2.append(L0());
            if (!z10) {
                return;
            }
            sb2.append(" ");
        }
    }

    private final void R0(StringBuilder sb2, oe.a aVar) {
        m A0 = A0();
        m mVar = m.HTML;
        if (A0 == mVar) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        v1(sb2, aVar.H0());
        sb2.append(" */");
        if (A0() == mVar) {
            sb2.append("</i></font>");
        }
    }

    private final void R1(k1 k1Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(k1Var instanceof j1)) {
            sb2.append(m1(k1Var.Q() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public final void S0(t0 t0Var, StringBuilder sb2) {
        o1(t0Var, sb2);
    }

    static /* synthetic */ void S1(d dVar, k1 k1Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.R1(k1Var, sb2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T0(xc.y r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.v0()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.util.Collection r0 = r6.f()
            hc.t.d(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L19
        L17:
            r0 = r3
            goto L30
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.next()
            xc.y r4 = (xc.y) r4
            boolean r4 = r4.v0()
            if (r4 == 0) goto L1d
            r0 = r2
        L30:
            if (r0 != 0) goto L38
            boolean r0 = r5.R()
            if (r0 == 0) goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            boolean r4 = r6.P0()
            if (r4 == 0) goto L70
            java.util.Collection r4 = r6.f()
            hc.t.d(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L50
        L4e:
            r1 = r3
            goto L67
        L50:
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            xc.y r4 = (xc.y) r4
            boolean r4 = r4.P0()
            if (r4 == 0) goto L54
            r1 = r2
        L67:
            if (r1 != 0) goto L6f
            boolean r1 = r5.R()
            if (r1 == 0) goto L70
        L6f:
            r2 = r3
        L70:
            boolean r1 = r6.u0()
            java.lang.String r3 = "tailrec"
            r5.s1(r7, r1, r3)
            r5.I1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.s1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.s1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.s1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.T0(xc.y, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if ((m() ? r10.k0() : ee.a.a(r10)) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(xc.j1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.F0()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.l()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.C()
            java.lang.String r1 = "crossinline"
            r9.s1(r12, r0, r1)
            boolean r0 = r10.K0()
            java.lang.String r1 = "noinline"
            r9.s1(r12, r0, r1)
            boolean r0 = r9.u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            xc.a r0 = r10.b()
            boolean r3 = r0 instanceof xc.d
            if (r3 == 0) goto L55
            xc.d r0 = (xc.d) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.S()
            if (r0 != r1) goto L60
            r0 = r1
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L65
            r8 = r1
            goto L66
        L65:
            r8 = r2
        L66:
            if (r8 == 0) goto L71
            boolean r0 = r9.Q()
            java.lang.String r3 = "actual"
            r9.s1(r12, r0, r3)
        L71:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.V1(r4, r5, r6, r7, r8)
            gc.l r11 = r9.W()
            if (r11 == 0) goto L91
            boolean r11 = r9.m()
            if (r11 == 0) goto L8a
            boolean r11 = r10.k0()
            goto L8e
        L8a:
            boolean r11 = ee.a.a(r10)
        L8e:
            if (r11 == 0) goto L91
            goto L92
        L91:
            r1 = r2
        L92:
            if (r1 == 0) goto Lb5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            gc.l r13 = r9.W()
            hc.t.b(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.T1(xc.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final List<String> U0(yc.c cVar) {
        int s10;
        int s11;
        List o02;
        List<String> v02;
        xc.d A0;
        List<j1> o10;
        int s12;
        Map<wd.f, ce.g<?>> b10 = cVar.b();
        List list = null;
        xc.e e10 = r0() ? ee.a.e(cVar) : null;
        if (e10 != null && (A0 = e10.A0()) != null && (o10 = A0.o()) != null) {
            ArrayList<j1> arrayList = new ArrayList();
            for (Object obj : o10) {
                if (((j1) obj).k0()) {
                    arrayList.add(obj);
                }
            }
            s12 = ub.v.s(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(s12);
            for (j1 j1Var : arrayList) {
                arrayList2.add(j1Var.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = u.h();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            wd.f fVar = (wd.f) obj2;
            t.d(fVar, "it");
            if (!b10.containsKey(fVar)) {
                arrayList3.add(obj2);
            }
        }
        s10 = ub.v.s(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(s10);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((wd.f) it.next()).b() + " = ...");
        }
        Set<Map.Entry<wd.f, ce.g<?>>> entrySet = b10.entrySet();
        s11 = ub.v.s(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(s11);
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            wd.f fVar2 = (wd.f) entry.getKey();
            ce.g<?> gVar = (ce.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar2.b());
            sb2.append(" = ");
            sb2.append(!list.contains(fVar2) ? c1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        o02 = c0.o0(arrayList4, arrayList5);
        v02 = c0.v0(o02);
        return v02;
    }

    private final void U1(Collection<? extends j1> collection, boolean z10, StringBuilder sb2) {
        boolean a22 = a2(z10);
        int size = collection.size();
        E0().b(size, sb2);
        int i10 = 0;
        for (j1 j1Var : collection) {
            E0().a(j1Var, i10, size, sb2);
            T1(j1Var, a22, sb2, false);
            E0().c(j1Var, i10, size, sb2);
            i10++;
        }
        E0().d(size, sb2);
    }

    private final void V0(StringBuilder sb2, yc.a aVar, yc.e eVar) {
        boolean N;
        if (!f0().contains(zd.e.ANNOTATIONS)) {
            return;
        }
        Set<wd.c> l10 = aVar instanceof oe.e0 ? l() : Y();
        gc.l<yc.c, Boolean> S = S();
        for (yc.c cVar : aVar.j()) {
            N = c0.N(l10, cVar.d());
            if (!N && !O0(cVar) && (S == null || S.invoke(cVar).booleanValue())) {
                sb2.append(r(cVar, eVar));
                if (X()) {
                    sb2.append('\n');
                    t.d(sb2, "append('\\n')");
                } else {
                    sb2.append(" ");
                }
            }
        }
    }

    private final void V1(k1 k1Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        oe.e0 type = k1Var.getType();
        t.d(type, "variable.type");
        oe.e0 e0Var = null;
        j1 j1Var = k1Var instanceof j1 ? (j1) k1Var : null;
        if (j1Var != null) {
            e0Var = j1Var.R();
        }
        oe.e0 e0Var2 = e0Var == null ? type : e0Var;
        s1(sb2, e0Var != null, "vararg");
        if (z12 || (z11 && !z0())) {
            R1(k1Var, sb2, z12);
        }
        if (z10) {
            t1(k1Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(w(e0Var2));
        l1(k1Var, sb2);
        if (!F0() || e0Var == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(w(type));
        sb2.append("*/");
    }

    static /* synthetic */ void W0(d dVar, StringBuilder sb2, yc.a aVar, yc.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        dVar.V0(sb2, aVar, eVar);
    }

    private final boolean W1(xc.u uVar, StringBuilder sb2) {
        if (!f0().contains(zd.e.VISIBILITY)) {
            return false;
        }
        if (g0()) {
            uVar = uVar.f();
        }
        if (!t0() && t.a(uVar, xc.t.f25588l)) {
            return false;
        }
        sb2.append(m1(uVar.c()));
        sb2.append(" ");
        return true;
    }

    private final void X0(xc.i iVar, StringBuilder sb2) {
        List<f1> A = iVar.A();
        t.d(A, "classifier.declaredTypeParameters");
        List<f1> parameters = iVar.r().getParameters();
        t.d(parameters, "classifier.typeConstructor.parameters");
        if (!F0() || !iVar.m0() || parameters.size() <= A.size()) {
            return;
        }
        sb2.append(" /*captured type parameters: ");
        P1(sb2, parameters.subList(A.size(), parameters.size()));
        sb2.append("*/");
    }

    private final void X1(List<? extends f1> list, StringBuilder sb2) {
        List<oe.e0> P;
        if (K0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (f1 f1Var : list) {
            List<oe.e0> upperBounds = f1Var.getUpperBounds();
            t.d(upperBounds, "typeParameter.upperBounds");
            P = c0.P(upperBounds, 1);
            for (oe.e0 e0Var : P) {
                StringBuilder sb3 = new StringBuilder();
                wd.f name = f1Var.getName();
                t.d(name, "typeParameter.name");
                sb3.append(v(name, false));
                sb3.append(" : ");
                t.d(e0Var, "it");
                sb3.append(w(e0Var));
                arrayList.add(sb3.toString());
            }
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        sb2.append(" ");
        sb2.append(m1("where"));
        sb2.append(" ");
        c0.c0(arrayList, sb2, ", ", null, null, 0, null, null, e.j.K0, null);
    }

    public final void Y0(xc.e eVar, StringBuilder sb2) {
        xc.d A0;
        boolean z10 = eVar.h() == xc.f.ENUM_ENTRY;
        if (!z0()) {
            W0(this, sb2, eVar, null, 2, null);
            List<x0> O0 = eVar.O0();
            t.d(O0, "klass.contextReceivers");
            e1(O0, sb2);
            if (!z10) {
                xc.u g10 = eVar.g();
                t.d(g10, "klass.visibility");
                W1(g10, sb2);
            }
            if ((eVar.h() != xc.f.INTERFACE || eVar.s() != xc.e0.ABSTRACT) && (!eVar.h().g() || eVar.s() != xc.e0.FINAL)) {
                xc.e0 s10 = eVar.s();
                t.d(s10, "klass.modality");
                q1(s10, sb2, N0(eVar));
            }
            o1(eVar, sb2);
            s1(sb2, f0().contains(zd.e.INNER) && eVar.m0(), "inner");
            s1(sb2, f0().contains(zd.e.DATA) && eVar.R0(), "data");
            s1(sb2, f0().contains(zd.e.INLINE) && eVar.isInline(), "inline");
            s1(sb2, f0().contains(zd.e.VALUE) && eVar.j0(), "value");
            s1(sb2, f0().contains(zd.e.FUN) && eVar.V(), "fun");
            Z0(eVar, sb2);
        }
        if (!ae.d.x(eVar)) {
            if (!z0()) {
                G1(sb2);
            }
            t1(eVar, sb2, true);
        } else {
            b1(eVar, sb2);
        }
        if (z10) {
            return;
        }
        List<f1> A = eVar.A();
        t.d(A, "klass.declaredTypeParameters");
        Q1(A, sb2, false);
        X0(eVar, sb2);
        if (!eVar.h().g() && U() && (A0 = eVar.A0()) != null) {
            sb2.append(" ");
            W0(this, sb2, A0, null, 2, null);
            xc.u g11 = A0.g();
            t.d(g11, "primaryConstructor.visibility");
            W1(g11, sb2);
            sb2.append(m1("constructor"));
            List<j1> o10 = A0.o();
            t.d(o10, "primaryConstructor.valueParameters");
            U1(o10, A0.b0(), sb2);
        }
        H1(eVar, sb2);
        X1(A, sb2);
    }

    private final String Y1(String str, String str2, String str3, String str4, String str5) {
        boolean I;
        boolean I2;
        I = x.I(str, str2, false, 2, null);
        if (I) {
            I2 = x.I(str3, str4, false, 2, null);
            if (I2) {
                String substring = str.substring(str2.length());
                t.d(substring, "this as java.lang.String).substring(startIndex)");
                String substring2 = str3.substring(str4.length());
                t.d(substring2, "this as java.lang.String).substring(startIndex)");
                String str6 = str5 + substring;
                if (t.a(substring, substring2)) {
                    return str6;
                }
                if (O(substring, substring2)) {
                    return str6 + '!';
                }
            }
        }
        return null;
    }

    private final d Z() {
        return (d) this.f26638l.getValue();
    }

    private final void Z0(xc.e eVar, StringBuilder sb2) {
        sb2.append(m1(zd.c.Companion.a(eVar)));
    }

    private final boolean Z1(oe.e0 e0Var) {
        boolean z10;
        if (uc.g.o(e0Var)) {
            List<g1> U0 = e0Var.U0();
            if (!(U0 instanceof Collection) || !U0.isEmpty()) {
                for (g1 g1Var : U0) {
                    if (g1Var.c()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            return z10;
        }
        return false;
    }

    private final boolean a2(boolean z10) {
        int i10 = b.f26642b[j0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new tb.p();
                }
                return false;
            } else if (z10) {
                return false;
            }
        }
        return true;
    }

    private final void b1(xc.m mVar, StringBuilder sb2) {
        if (o0()) {
            if (z0()) {
                sb2.append("companion object");
            }
            G1(sb2);
            xc.m b10 = mVar.b();
            if (b10 != null) {
                sb2.append("of ");
                wd.f name = b10.getName();
                t.d(name, "containingDeclaration.name");
                sb2.append(v(name, false));
            }
        }
        if (F0() || !t.a(mVar.getName(), wd.h.f24814d)) {
            if (!z0()) {
                G1(sb2);
            }
            wd.f name2 = mVar.getName();
            t.d(name2, "descriptor.name");
            sb2.append(v(name2, true));
        }
    }

    public final String c1(ce.g<?> gVar) {
        String p02;
        String e02;
        if (gVar instanceof ce.b) {
            e02 = c0.e0(((ce.b) gVar).b(), ", ", "{", "}", 0, null, new e(), 24, null);
            return e02;
        } else if (gVar instanceof ce.a) {
            p02 = bf.y.p0(zd.c.s(this, ((ce.a) gVar).b(), null, 2, null), "@");
            return p02;
        } else if (!(gVar instanceof q)) {
            return gVar.toString();
        } else {
            q.b b10 = ((q) gVar).b();
            if (b10 instanceof q.b.a) {
                return ((q.b.a) b10).a() + "::class";
            } else if (!(b10 instanceof q.b.C0091b)) {
                throw new tb.p();
            } else {
                q.b.C0091b c0091b = (q.b.C0091b) b10;
                String b11 = c0091b.b().b().b();
                t.d(b11, "classValue.classId.asSingleFqName().asString()");
                for (int i10 = 0; i10 < c0091b.a(); i10++) {
                    b11 = "kotlin.Array<" + b11 + '>';
                }
                return b11 + "::class";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(xc.l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.d1(xc.l, java.lang.StringBuilder):void");
    }

    private final void e1(List<? extends x0> list, StringBuilder sb2) {
        int j10;
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i10 = 0;
            for (x0 x0Var : list) {
                int i11 = i10 + 1;
                V0(sb2, x0Var, yc.e.RECEIVER);
                oe.e0 type = x0Var.getType();
                t.d(type, "contextReceiver.type");
                sb2.append(h1(type));
                j10 = u.j(list);
                sb2.append(i10 == j10 ? ") " : ", ");
                i10 = i11;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f1(java.lang.StringBuilder r8, oe.e0 r9) {
        /*
            r7 = this;
            r3 = 0
            r4 = 2
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            W0(r0, r1, r2, r3, r4, r5)
            boolean r0 = r9 instanceof oe.p
            r1 = 0
            if (r0 == 0) goto L12
            r0 = r9
            oe.p r0 = (oe.p) r0
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L19
            oe.m0 r1 = r0.i1()
        L19:
            boolean r0 = oe.g0.a(r9)
            if (r0 == 0) goto L52
            boolean r0 = te.a.r(r9)
            if (r0 == 0) goto L33
            boolean r0 = r7.l0()
            if (r0 == 0) goto L33
        L2b:
            r0 = r9
            qe.h r0 = (qe.h) r0
            java.lang.String r0 = r0.f1()
            goto L46
        L33:
            boolean r0 = r9 instanceof qe.h
            if (r0 == 0) goto L3e
            boolean r0 = r7.e0()
            if (r0 != 0) goto L3e
            goto L2b
        L3e:
            oe.e1 r0 = r9.W0()
            java.lang.String r0 = r0.toString()
        L46:
            r8.append(r0)
            java.util.List r0 = r9.U0()
            java.lang.String r0 = r7.K1(r0)
            goto L61
        L52:
            boolean r0 = r9 instanceof oe.u0
            if (r0 == 0) goto L65
            r0 = r9
            oe.u0 r0 = (oe.u0) r0
            pe.n r0 = r0.f1()
        L5d:
            java.lang.String r0 = r0.toString()
        L61:
            r8.append(r0)
            goto L79
        L65:
            boolean r0 = r1 instanceof oe.u0
            if (r0 == 0) goto L70
            oe.u0 r1 = (oe.u0) r1
            pe.n r0 = r1.f1()
            goto L5d
        L70:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            N1(r1, r2, r3, r4, r5, r6)
        L79:
            boolean r0 = r9.X0()
            if (r0 == 0) goto L84
            java.lang.String r0 = "?"
            r8.append(r0)
        L84:
            boolean r9 = oe.q0.c(r9)
            if (r9 == 0) goto L8f
            java.lang.String r9 = " & Any"
            r8.append(r9)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.f1(java.lang.StringBuilder, oe.e0):void");
    }

    private final String g1(String str) {
        int i10 = b.f26641a[A0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new tb.p();
            }
            return "<font color=red><b>" + str + "</b></font>";
        }
        return str;
    }

    private final String h1(oe.e0 e0Var) {
        String w9 = w(e0Var);
        if (!Z1(e0Var) || n1.l(e0Var)) {
            return w9;
        }
        return '(' + w9 + ')';
    }

    private final String i1(List<wd.f> list) {
        return P(n.c(list));
    }

    public final void j1(y yVar, StringBuilder sb2) {
        if (!z0()) {
            if (!y0()) {
                W0(this, sb2, yVar, null, 2, null);
                List<x0> d02 = yVar.d0();
                t.d(d02, "function.contextReceiverParameters");
                e1(d02, sb2);
                xc.u g10 = yVar.g();
                t.d(g10, "function.visibility");
                W1(g10, sb2);
                r1(yVar, sb2);
                if (a0()) {
                    o1(yVar, sb2);
                }
                w1(yVar, sb2);
                if (a0()) {
                    T0(yVar, sb2);
                } else {
                    I1(yVar, sb2);
                }
                n1(yVar, sb2);
                if (F0()) {
                    if (yVar.r0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (yVar.G0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(m1("fun"));
            sb2.append(" ");
            List<f1> p10 = yVar.p();
            t.d(p10, "function.typeParameters");
            Q1(p10, sb2, true);
            D1(yVar, sb2);
        }
        t1(yVar, sb2, true);
        List<j1> o10 = yVar.o();
        t.d(o10, "function.valueParameters");
        U1(o10, yVar.b0(), sb2);
        E1(yVar, sb2);
        oe.e0 e10 = yVar.e();
        if (!I0() && (D0() || e10 == null || !uc.h.B0(e10))) {
            sb2.append(": ");
            sb2.append(e10 == null ? "[NULL]" : w(e10));
        }
        List<f1> p11 = yVar.p();
        t.d(p11, "function.typeParameters");
        X1(p11, sb2);
    }

    private final void k1(StringBuilder sb2, oe.e0 e0Var) {
        wd.f fVar;
        char W0;
        int U;
        int U2;
        int j10;
        Object g02;
        int length = sb2.length();
        W0(Z(), sb2, e0Var, null, 2, null);
        boolean z10 = sb2.length() != length;
        oe.e0 j11 = uc.g.j(e0Var);
        List<oe.e0> e10 = uc.g.e(e0Var);
        if (!e10.isEmpty()) {
            sb2.append("context(");
            j10 = u.j(e10);
            for (oe.e0 e0Var2 : e10.subList(0, j10)) {
                u1(sb2, e0Var2);
                sb2.append(", ");
            }
            g02 = c0.g0(e10);
            u1(sb2, (oe.e0) g02);
            sb2.append(") ");
        }
        boolean q10 = uc.g.q(e0Var);
        boolean X0 = e0Var.X0();
        boolean z11 = X0 || (z10 && j11 != null);
        if (z11) {
            if (q10) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    W0 = a0.W0(sb2);
                    bf.b.c(W0);
                    U = bf.y.U(sb2);
                    if (sb2.charAt(U - 1) != ')') {
                        U2 = bf.y.U(sb2);
                        sb2.insert(U2, "()");
                    }
                }
                sb2.append("(");
            }
        }
        s1(sb2, q10, "suspend");
        if (j11 != null) {
            boolean z12 = (Z1(j11) && !j11.X0()) || M0(j11);
            if (z12) {
                sb2.append("(");
            }
            u1(sb2, j11);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!uc.g.m(e0Var) || e0Var.U0().size() > 1) {
            int i10 = 0;
            for (g1 g1Var : uc.g.l(e0Var)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (k0()) {
                    oe.e0 type = g1Var.getType();
                    t.d(type, "typeProjection.type");
                    fVar = uc.g.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(v(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(x(g1Var));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(N());
        sb2.append(" ");
        u1(sb2, uc.g.k(e0Var));
        if (z11) {
            sb2.append(")");
        }
        if (X0) {
            sb2.append("?");
        }
    }

    private final void l1(k1 k1Var, StringBuilder sb2) {
        ce.g<?> J0;
        if (!d0() || (J0 = k1Var.J0()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(P(c1(J0)));
    }

    private final String m1(String str) {
        int i10 = b.f26641a[A0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new tb.p();
            }
            if (T()) {
                return str;
            }
            return "<b>" + str + "</b>";
        }
        return str;
    }

    private final void n1(xc.b bVar, StringBuilder sb2) {
        if (f0().contains(zd.e.MEMBER_KIND) && F0() && bVar.h() != b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(we.a.f(bVar.h().name()));
            sb2.append("*/ ");
        }
    }

    private final void o1(d0 d0Var, StringBuilder sb2) {
        s1(sb2, d0Var.H(), "external");
        boolean z10 = true;
        s1(sb2, f0().contains(zd.e.EXPECT) && d0Var.l0(), "expect");
        if (!f0().contains(zd.e.ACTUAL) || !d0Var.L0()) {
            z10 = false;
        }
        s1(sb2, z10, "actual");
    }

    private final void q1(xc.e0 e0Var, StringBuilder sb2, xc.e0 e0Var2) {
        if (s0() || e0Var != e0Var2) {
            s1(sb2, f0().contains(zd.e.MODALITY), we.a.f(e0Var.name()));
        }
    }

    private final void r1(xc.b bVar, StringBuilder sb2) {
        if (!ae.d.J(bVar) || bVar.s() != xc.e0.FINAL) {
            if (i0() == j.RENDER_OVERRIDE && bVar.s() == xc.e0.OPEN && Q0(bVar)) {
                return;
            }
            xc.e0 s10 = bVar.s();
            t.d(s10, "callable.modality");
            q1(s10, sb2, N0(bVar));
        }
    }

    private final void s1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(m1(str));
            sb2.append(" ");
        }
    }

    public final void t1(xc.m mVar, StringBuilder sb2, boolean z10) {
        wd.f name = mVar.getName();
        t.d(name, "descriptor.name");
        sb2.append(v(name, z10));
    }

    private final void u1(StringBuilder sb2, oe.e0 e0Var) {
        q1 Z0 = e0Var.Z0();
        oe.a aVar = Z0 instanceof oe.a ? (oe.a) Z0 : null;
        if (aVar == null) {
            v1(sb2, e0Var);
        } else if (v0()) {
            v1(sb2, aVar.H0());
        } else {
            v1(sb2, aVar.i1());
            if (!w0()) {
                return;
            }
            R0(sb2, aVar);
        }
    }

    private final void v1(StringBuilder sb2, oe.e0 e0Var) {
        if ((e0Var instanceof s1) && m() && !((s1) e0Var).b1()) {
            sb2.append("<Not computed yet>");
            return;
        }
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof oe.y) {
            sb2.append(((oe.y) Z0).g1(this, this));
        } else if (!(Z0 instanceof m0)) {
        } else {
            F1(sb2, (m0) Z0);
        }
    }

    private final void w1(xc.b bVar, StringBuilder sb2) {
        if (f0().contains(zd.e.OVERRIDE) && Q0(bVar) && i0() != j.RENDER_OPEN) {
            s1(sb2, true, "override");
            if (!F0()) {
                return;
            }
            sb2.append("/*");
            sb2.append(bVar.f().size());
            sb2.append("*/ ");
        }
    }

    public final void x1(l0 l0Var, StringBuilder sb2) {
        y1(l0Var.d(), "package-fragment", sb2);
        if (m()) {
            sb2.append(" in ");
            t1(l0Var.b(), sb2, false);
        }
    }

    private final void y1(wd.c cVar, String str, StringBuilder sb2) {
        sb2.append(m1(str));
        wd.d j10 = cVar.j();
        t.d(j10, "fqName.toUnsafe()");
        String u10 = u(j10);
        if (u10.length() > 0) {
            sb2.append(" ");
            sb2.append(u10);
        }
    }

    public final void z1(q0 q0Var, StringBuilder sb2) {
        y1(q0Var.d(), "package", sb2);
        if (m()) {
            sb2.append(" in context of ");
            t1(q0Var.p0(), sb2, false);
        }
    }

    public m A0() {
        return this.f26637k.Z();
    }

    public gc.l<oe.e0, oe.e0> B0() {
        return this.f26637k.a0();
    }

    public boolean C0() {
        return this.f26637k.b0();
    }

    public boolean D0() {
        return this.f26637k.c0();
    }

    public c.l E0() {
        return this.f26637k.d0();
    }

    public boolean F0() {
        return this.f26637k.e0();
    }

    public boolean G0() {
        return this.f26637k.f0();
    }

    public boolean H0() {
        return this.f26637k.g0();
    }

    public boolean I0() {
        return this.f26637k.h0();
    }

    public boolean J0() {
        return this.f26637k.i0();
    }

    public boolean K0() {
        return this.f26637k.j0();
    }

    public String K1(List<? extends g1> list) {
        t.e(list, "typeArguments");
        if (list.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(P0());
        M(sb2, list);
        sb2.append(L0());
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String L1(oe.e1 e1Var) {
        t.e(e1Var, "typeConstructor");
        xc.h z10 = e1Var.z();
        boolean z11 = true;
        if (!(z10 instanceof f1 ? true : z10 instanceof xc.e)) {
            z11 = z10 instanceof e1;
        }
        if (z11) {
            return a1(z10);
        }
        if (z10 == null) {
            return e1Var instanceof oe.d0 ? ((oe.d0) e1Var).g(h.f26649c) : e1Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + z10.getClass()).toString());
    }

    public boolean Q() {
        return this.f26637k.r();
    }

    public boolean R() {
        return this.f26637k.s();
    }

    public gc.l<yc.c, Boolean> S() {
        return this.f26637k.t();
    }

    public boolean T() {
        return this.f26637k.u();
    }

    public boolean U() {
        return this.f26637k.v();
    }

    public zd.b V() {
        return this.f26637k.w();
    }

    public gc.l<j1, String> W() {
        return this.f26637k.x();
    }

    public boolean X() {
        return this.f26637k.y();
    }

    public Set<wd.c> Y() {
        return this.f26637k.z();
    }

    @Override // zd.f
    public void a(boolean z10) {
        this.f26637k.a(z10);
    }

    public boolean a0() {
        return this.f26637k.A();
    }

    public String a1(xc.h hVar) {
        t.e(hVar, "klass");
        return qe.k.m(hVar) ? hVar.r().toString() : V().a(hVar, this);
    }

    @Override // zd.f
    public void b(boolean z10) {
        this.f26637k.b(z10);
    }

    public boolean b0() {
        return this.f26637k.B();
    }

    @Override // zd.f
    public void c(boolean z10) {
        this.f26637k.c(z10);
    }

    public boolean c0() {
        return this.f26637k.C();
    }

    @Override // zd.f
    public void d(zd.b bVar) {
        t.e(bVar, "<set-?>");
        this.f26637k.d(bVar);
    }

    public boolean d0() {
        return this.f26637k.D();
    }

    @Override // zd.f
    public void e(Set<wd.c> set) {
        t.e(set, "<set-?>");
        this.f26637k.e(set);
    }

    public boolean e0() {
        return this.f26637k.E();
    }

    @Override // zd.f
    public void f(m mVar) {
        t.e(mVar, "<set-?>");
        this.f26637k.f(mVar);
    }

    public Set<zd.e> f0() {
        return this.f26637k.F();
    }

    @Override // zd.f
    public void g(boolean z10) {
        this.f26637k.g(z10);
    }

    public boolean g0() {
        return this.f26637k.G();
    }

    @Override // zd.f
    public void h(Set<? extends zd.e> set) {
        t.e(set, "<set-?>");
        this.f26637k.h(set);
    }

    public final zd.g h0() {
        return this.f26637k;
    }

    @Override // zd.f
    public void i(boolean z10) {
        this.f26637k.i(z10);
    }

    public j i0() {
        return this.f26637k.H();
    }

    @Override // zd.f
    public void j(k kVar) {
        t.e(kVar, "<set-?>");
        this.f26637k.j(kVar);
    }

    public k j0() {
        return this.f26637k.I();
    }

    @Override // zd.f
    public boolean k() {
        return this.f26637k.k();
    }

    public boolean k0() {
        return this.f26637k.J();
    }

    @Override // zd.f
    public Set<wd.c> l() {
        return this.f26637k.l();
    }

    public boolean l0() {
        return this.f26637k.K();
    }

    @Override // zd.f
    public boolean m() {
        return this.f26637k.m();
    }

    public l m0() {
        return this.f26637k.L();
    }

    @Override // zd.f
    public zd.a n() {
        return this.f26637k.n();
    }

    public boolean n0() {
        return this.f26637k.M();
    }

    @Override // zd.f
    public void o(boolean z10) {
        this.f26637k.o(z10);
    }

    public boolean o0() {
        return this.f26637k.N();
    }

    @Override // zd.f
    public void p(boolean z10) {
        this.f26637k.p(z10);
    }

    public boolean p0() {
        return this.f26637k.O();
    }

    public String p1(String str) {
        t.e(str, "message");
        int i10 = b.f26641a[A0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new tb.p();
            }
            return "<i>" + str + "</i>";
        }
        return str;
    }

    @Override // zd.c
    public String q(xc.m mVar) {
        t.e(mVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        mVar.g0(new a(), sb2);
        if (G0()) {
            L(sb2, mVar);
        }
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean q0() {
        return this.f26637k.P();
    }

    @Override // zd.c
    public String r(yc.c cVar, yc.e eVar) {
        t.e(cVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.g() + ':');
        }
        oe.e0 type = cVar.getType();
        sb2.append(w(type));
        if (b0()) {
            List<String> U0 = U0(cVar);
            if (c0() || (!U0.isEmpty())) {
                c0.c0(U0, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (F0() && (g0.a(type) || (type.W0().z() instanceof k0.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean r0() {
        return this.f26637k.Q();
    }

    public boolean s0() {
        return this.f26637k.R();
    }

    @Override // zd.c
    public String t(String str, String str2, uc.h hVar) {
        String P0;
        String P02;
        StringBuilder sb2;
        boolean I;
        t.e(str, "lowerRendered");
        t.e(str2, "upperRendered");
        t.e(hVar, "builtIns");
        if (O(str, str2)) {
            I = x.I(str2, "(", false, 2, null);
            if (I) {
                sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(str);
                sb2.append(")!");
            } else {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('!');
            }
        } else {
            zd.b V = V();
            xc.e w9 = hVar.w();
            t.d(w9, "builtIns.collection");
            P0 = bf.y.P0(V.a(w9, this), "Collection", null, 2, null);
            String Y1 = Y1(str, P0 + "Mutable", str2, P0, P0 + "(Mutable)");
            if (Y1 != null) {
                return Y1;
            }
            String Y12 = Y1(str, P0 + "MutableMap.MutableEntry", str2, P0 + "Map.Entry", P0 + "(Mutable)Map.(Mutable)Entry");
            if (Y12 != null) {
                return Y12;
            }
            zd.b V2 = V();
            xc.e j10 = hVar.j();
            t.d(j10, "builtIns.array");
            P02 = bf.y.P0(V2.a(j10, this), "Array", null, 2, null);
            String Y13 = Y1(str, P02 + P("Array<"), str2, P02 + P("Array<out "), P02 + P("Array<(out) "));
            if (Y13 != null) {
                return Y13;
            }
            sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(str);
            sb2.append("..");
            sb2.append(str2);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public boolean t0() {
        return this.f26637k.S();
    }

    @Override // zd.c
    public String u(wd.d dVar) {
        t.e(dVar, "fqName");
        List<wd.f> h10 = dVar.h();
        t.d(h10, "fqName.pathSegments()");
        return i1(h10);
    }

    public boolean u0() {
        return this.f26637k.T();
    }

    @Override // zd.c
    public String v(wd.f fVar, boolean z10) {
        t.e(fVar, "name");
        String P = P(n.b(fVar));
        if (!T() || A0() != m.HTML || !z10) {
            return P;
        }
        return "<b>" + P + "</b>";
    }

    public boolean v0() {
        return this.f26637k.U();
    }

    @Override // zd.c
    public String w(oe.e0 e0Var) {
        t.e(e0Var, "type");
        StringBuilder sb2 = new StringBuilder();
        u1(sb2, B0().invoke(e0Var));
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean w0() {
        return this.f26637k.V();
    }

    @Override // zd.c
    public String x(g1 g1Var) {
        List<? extends g1> d10;
        t.e(g1Var, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        d10 = ub.t.d(g1Var);
        M(sb2, d10);
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean x0() {
        return this.f26637k.W();
    }

    public boolean y0() {
        return this.f26637k.X();
    }

    public boolean z0() {
        return this.f26637k.Y();
    }
}
