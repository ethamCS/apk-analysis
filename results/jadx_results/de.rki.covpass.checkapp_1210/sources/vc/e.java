package vc;

import ad.g0;
import ad.l0;
import ad.p;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.l1;
import oe.m0;
import oe.r1;
import tb.r;
import ub.c0;
import ub.h0;
import ub.u;
import ub.v;
import ve.q;
import wd.f;
import xc.a1;
import xc.b;
import xc.e0;
import xc.f1;
import xc.j1;
import xc.m;
import xc.x0;
import xc.y;
import yc.g;
/* loaded from: classes.dex */
public final class e extends g0 {

    /* renamed from: t4 */
    public static final a f23994t4 = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final j1 b(e eVar, int i10, f1 f1Var) {
            String str;
            String b10 = f1Var.getName().b();
            t.d(b10, "typeParameter.name.asString()");
            if (t.a(b10, "T")) {
                str = "instance";
            } else if (t.a(b10, "E")) {
                str = "receiver";
            } else {
                str = b10.toLowerCase(Locale.ROOT);
                t.d(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            g b11 = g.Companion.b();
            f j10 = f.j(str);
            t.d(j10, "identifier(name)");
            m0 u10 = f1Var.u();
            t.d(u10, "typeParameter.defaultType");
            a1 a1Var = a1.f25519a;
            t.d(a1Var, "NO_SOURCE");
            return new l0(eVar, null, i10, b11, j10, u10, false, false, false, null, a1Var);
        }

        public final e a(b bVar, boolean z10) {
            List<x0> h10;
            List<? extends f1> h11;
            Iterable<h0> L0;
            int s10;
            Object g02;
            t.e(bVar, "functionClass");
            List<f1> A = bVar.A();
            e eVar = new e(bVar, null, b.a.DECLARATION, z10, null);
            x0 S0 = bVar.S0();
            h10 = u.h();
            h11 = u.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : A) {
                if (!(((f1) obj).w() == r1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            L0 = c0.L0(arrayList);
            s10 = v.s(L0, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (h0 h0Var : L0) {
                arrayList2.add(e.f23994t4.b(eVar, h0Var.c(), (f1) h0Var.d()));
            }
            g02 = c0.g0(A);
            eVar.a1(null, S0, h10, h11, arrayList2, ((f1) g02).u(), e0.ABSTRACT, xc.t.f25581e);
            eVar.i1(true);
            return eVar;
        }
    }

    private e(m mVar, e eVar, b.a aVar, boolean z10) {
        super(mVar, eVar, g.Companion.b(), q.f24065i, aVar, a1.f25519a);
        o1(true);
        q1(z10);
        h1(false);
    }

    public /* synthetic */ e(m mVar, e eVar, b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, aVar, z10);
    }

    private final y y1(List<f> list) {
        int s10;
        boolean z10;
        f fVar;
        List<r> M0;
        boolean z11;
        int size = o().size() - list.size();
        boolean z12 = true;
        if (size == 0) {
            List<j1> o10 = o();
            t.d(o10, "valueParameters");
            M0 = c0.M0(list, o10);
            if (!(M0 instanceof Collection) || !M0.isEmpty()) {
                for (r rVar : M0) {
                    if (!t.a((f) rVar.b(), ((j1) rVar.c()).getName())) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                return this;
            }
        }
        List<j1> o11 = o();
        t.d(o11, "valueParameters");
        s10 = v.s(o11, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (j1 j1Var : o11) {
            f name = j1Var.getName();
            t.d(name, "it.name");
            int l10 = j1Var.l();
            int i10 = l10 - size;
            if (i10 >= 0 && (fVar = list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(j1Var.N0(this, name, l10));
        }
        p.c b12 = b1(l1.f18012b);
        if (!list.isEmpty()) {
            for (f fVar2 : list) {
                if (fVar2 == null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
        }
        z12 = false;
        p.c k10 = b12.H(z12).f(arrayList).k(z0());
        t.d(k10, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        y V0 = super.V0(k10);
        t.b(V0);
        return V0;
    }

    @Override // ad.p, xc.d0
    public boolean H() {
        return false;
    }

    @Override // ad.g0, ad.p
    protected p U0(m mVar, y yVar, b.a aVar, f fVar, g gVar, a1 a1Var) {
        t.e(mVar, "newOwner");
        t.e(aVar, "kind");
        t.e(gVar, "annotations");
        t.e(a1Var, "source");
        return new e(mVar, (e) yVar, aVar, s0());
    }

    @Override // ad.p
    public y V0(p.c cVar) {
        int s10;
        boolean z10;
        t.e(cVar, "configuration");
        e eVar = (e) super.V0(cVar);
        if (eVar == null) {
            return null;
        }
        List<j1> o10 = eVar.o();
        t.d(o10, "substituted.valueParameters");
        boolean z11 = false;
        if (!(o10 instanceof Collection) || !o10.isEmpty()) {
            for (j1 j1Var : o10) {
                oe.e0 type = j1Var.getType();
                t.d(type, "it.type");
                if (uc.g.d(type) != null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return eVar;
        }
        List<j1> o11 = eVar.o();
        t.d(o11, "substituted.valueParameters");
        s10 = v.s(o11, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (j1 j1Var2 : o11) {
            oe.e0 type2 = j1Var2.getType();
            t.d(type2, "it.type");
            arrayList.add(uc.g.d(type2));
        }
        return eVar.y1(arrayList);
    }

    @Override // ad.p, xc.y
    public boolean isInline() {
        return false;
    }

    @Override // ad.p, xc.y
    public boolean u0() {
        return false;
    }
}
