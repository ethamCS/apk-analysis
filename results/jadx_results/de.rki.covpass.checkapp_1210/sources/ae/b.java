package ae;

import ae.j;
import hc.t;
import hc.v;
import java.util.Collection;
import oe.e1;
import pe.e;
import pe.g;
import ub.c0;
import xc.a1;
import xc.b;
import xc.d0;
import xc.f1;
import xc.l0;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    public static final b f422a = new b();

    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.p<xc.m, xc.m, Boolean> {

        /* renamed from: c */
        public static final a f423c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Boolean u(xc.m mVar, xc.m mVar2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: ae.b$b */
    /* loaded from: classes3.dex */
    public static final class C0008b implements e.a {

        /* renamed from: a */
        final /* synthetic */ boolean f424a;

        /* renamed from: b */
        final /* synthetic */ xc.a f425b;

        /* renamed from: c */
        final /* synthetic */ xc.a f426c;

        /* renamed from: ae.b$b$a */
        /* loaded from: classes3.dex */
        static final class a extends v implements gc.p<xc.m, xc.m, Boolean> {

            /* renamed from: c */
            final /* synthetic */ xc.a f427c;

            /* renamed from: d */
            final /* synthetic */ xc.a f428d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(xc.a aVar, xc.a aVar2) {
                super(2);
                this.f427c = aVar;
                this.f428d = aVar2;
            }

            /* renamed from: b */
            public final Boolean u(xc.m mVar, xc.m mVar2) {
                return Boolean.valueOf(t.a(mVar, this.f427c) && t.a(mVar2, this.f428d));
            }
        }

        C0008b(boolean z10, xc.a aVar, xc.a aVar2) {
            this.f424a = z10;
            this.f425b = aVar;
            this.f426c = aVar2;
        }

        @Override // pe.e.a
        public final boolean a(e1 e1Var, e1 e1Var2) {
            t.e(e1Var, "c1");
            t.e(e1Var2, "c2");
            if (t.a(e1Var, e1Var2)) {
                return true;
            }
            xc.h z10 = e1Var.z();
            xc.h z11 = e1Var2.z();
            if ((z10 instanceof f1) && (z11 instanceof f1)) {
                return b.f422a.g((f1) z10, (f1) z11, this.f424a, new a(this.f425b, this.f426c));
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.p<xc.m, xc.m, Boolean> {

        /* renamed from: c */
        public static final c f429c = new c();

        c() {
            super(2);
        }

        /* renamed from: b */
        public final Boolean u(xc.m mVar, xc.m mVar2) {
            return Boolean.FALSE;
        }
    }

    private b() {
    }

    public static /* synthetic */ boolean b(b bVar, xc.a aVar, xc.a aVar2, boolean z10, boolean z11, boolean z12, pe.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return bVar.a(aVar, aVar2, z10, z13, z12, gVar);
    }

    private final boolean c(xc.e eVar, xc.e eVar2) {
        return t.a(eVar.r(), eVar2.r());
    }

    public static /* synthetic */ boolean e(b bVar, xc.m mVar, xc.m mVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return bVar.d(mVar, mVar2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean h(b bVar, f1 f1Var, f1 f1Var2, boolean z10, gc.p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = c.f429c;
        }
        return bVar.g(f1Var, f1Var2, z10, pVar);
    }

    private final boolean i(xc.m mVar, xc.m mVar2, gc.p<? super xc.m, ? super xc.m, Boolean> pVar, boolean z10) {
        xc.m b10 = mVar.b();
        xc.m b11 = mVar2.b();
        return ((b10 instanceof xc.b) || (b11 instanceof xc.b)) ? pVar.u(b10, b11).booleanValue() : e(this, b10, b11, z10, false, 8, null);
    }

    private final a1 j(xc.a aVar) {
        Object t02;
        while (aVar instanceof xc.b) {
            xc.b bVar = (xc.b) aVar;
            if (bVar.h() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends xc.b> f10 = bVar.f();
            t.d(f10, "overriddenDescriptors");
            t02 = c0.t0(f10);
            aVar = (xc.b) t02;
            if (aVar == null) {
                return null;
            }
        }
        return aVar.m();
    }

    public final boolean a(xc.a aVar, xc.a aVar2, boolean z10, boolean z11, boolean z12, pe.g gVar) {
        t.e(aVar, "a");
        t.e(aVar2, "b");
        t.e(gVar, "kotlinTypeRefiner");
        if (t.a(aVar, aVar2)) {
            return true;
        }
        if (!t.a(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z11 && (aVar instanceof d0) && (aVar2 instanceof d0) && ((d0) aVar).l0() != ((d0) aVar2).l0()) {
            return false;
        }
        if ((t.a(aVar.b(), aVar2.b()) && (!z10 || !t.a(j(aVar), j(aVar2)))) || d.E(aVar) || d.E(aVar2) || !i(aVar, aVar2, a.f423c, z10)) {
            return false;
        }
        j i10 = j.i(gVar, new C0008b(z10, aVar, aVar2));
        t.d(i10, "a: CallableDescriptor,\n …= a && y == b }\n        }");
        j.i.a c10 = i10.E(aVar, aVar2, null, !z12).c();
        j.i.a aVar3 = j.i.a.OVERRIDABLE;
        return c10 == aVar3 && i10.E(aVar2, aVar, null, z12 ^ true).c() == aVar3;
    }

    public final boolean d(xc.m mVar, xc.m mVar2, boolean z10, boolean z11) {
        if (!(mVar instanceof xc.e) || !(mVar2 instanceof xc.e)) {
            if ((mVar instanceof f1) && (mVar2 instanceof f1)) {
                return h(this, (f1) mVar, (f1) mVar2, z10, null, 8, null);
            }
            if ((mVar instanceof xc.a) && (mVar2 instanceof xc.a)) {
                return b(this, (xc.a) mVar, (xc.a) mVar2, z10, z11, false, g.a.f19148a, 16, null);
            }
            boolean z12 = mVar instanceof l0;
            wd.c cVar = mVar;
            wd.c cVar2 = mVar2;
            if (z12) {
                boolean z13 = mVar2 instanceof l0;
                cVar = mVar;
                cVar2 = mVar2;
                if (z13) {
                    cVar = ((l0) mVar).d();
                    cVar2 = ((l0) mVar2).d();
                }
            }
            return t.a(cVar, cVar2);
        }
        return c((xc.e) mVar, (xc.e) mVar2);
    }

    public final boolean f(f1 f1Var, f1 f1Var2, boolean z10) {
        t.e(f1Var, "a");
        t.e(f1Var2, "b");
        return h(this, f1Var, f1Var2, z10, null, 8, null);
    }

    public final boolean g(f1 f1Var, f1 f1Var2, boolean z10, gc.p<? super xc.m, ? super xc.m, Boolean> pVar) {
        t.e(f1Var, "a");
        t.e(f1Var2, "b");
        t.e(pVar, "equivalentCallables");
        if (t.a(f1Var, f1Var2)) {
            return true;
        }
        return !t.a(f1Var.b(), f1Var2.b()) && i(f1Var, f1Var2, pVar, z10) && f1Var.l() == f1Var2.l();
    }
}
