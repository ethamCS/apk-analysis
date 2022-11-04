package ld;

import gc.l;
import hc.t;
import hc.v;
import he.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oe.a1;
import oe.e0;
import oe.g1;
import oe.l0;
import oe.m0;
import oe.y;
import tb.r;
import ub.c0;
/* loaded from: classes.dex */
public final class f extends y implements l0 {

    /* loaded from: classes.dex */
    static final class a extends v implements l<String, CharSequence> {

        /* renamed from: c */
        public static final a f15948c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(String str) {
            t.e(str, "it");
            return "(raw) " + str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(m0 m0Var, m0 m0Var2) {
        this(m0Var, m0Var2, false);
        t.e(m0Var, "lowerBound");
        t.e(m0Var2, "upperBound");
    }

    private f(m0 m0Var, m0 m0Var2, boolean z10) {
        super(m0Var, m0Var2);
        if (!z10) {
            pe.e.f19146a.d(m0Var, m0Var2);
        }
    }

    private static final boolean j1(String str, String str2) {
        String p02;
        p02 = bf.y.p0(str2, "out ");
        return t.a(str, p02) || t.a(str2, "*");
    }

    private static final List<String> k1(zd.c cVar, e0 e0Var) {
        int s10;
        List<g1> U0 = e0Var.U0();
        s10 = ub.v.s(U0, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (g1 g1Var : U0) {
            arrayList.add(cVar.x(g1Var));
        }
        return arrayList;
    }

    private static final String l1(String str, String str2) {
        boolean M;
        String O0;
        String L0;
        M = bf.y.M(str, '<', false, 2, null);
        if (!M) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        O0 = bf.y.O0(str, '<', null, 2, null);
        sb2.append(O0);
        sb2.append('<');
        sb2.append(str2);
        sb2.append('>');
        L0 = bf.y.L0(str, '>', null, 2, null);
        sb2.append(L0);
        return sb2.toString();
    }

    @Override // oe.y
    public m0 d1() {
        return e1();
    }

    @Override // oe.y
    public String g1(zd.c cVar, zd.f fVar) {
        String e02;
        List M0;
        t.e(cVar, "renderer");
        t.e(fVar, "options");
        String w9 = cVar.w(e1());
        String w10 = cVar.w(f1());
        if (fVar.m()) {
            return "raw (" + w9 + ".." + w10 + ')';
        } else if (f1().U0().isEmpty()) {
            return cVar.t(w9, w10, te.a.h(this));
        } else {
            List<String> k12 = k1(cVar, e1());
            List<String> k13 = k1(cVar, f1());
            e02 = c0.e0(k12, ", ", null, null, 0, null, a.f15948c, 30, null);
            M0 = c0.M0(k12, k13);
            boolean z10 = true;
            if (!(M0 instanceof Collection) || !M0.isEmpty()) {
                Iterator it = M0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r rVar = (r) it.next();
                    if (!j1((String) rVar.e(), (String) rVar.f())) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                w10 = l1(w10, e02);
            }
            String l12 = l1(w9, e02);
            return t.a(l12, w10) ? l12 : cVar.t(l12, w10, te.a.h(this));
        }
    }

    /* renamed from: h1 */
    public f a1(boolean z10) {
        return new f(e1().d1(z10), f1().d1(z10));
    }

    /* renamed from: i1 */
    public y b1(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(e1());
        t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 h11 = gVar.h(f1());
        t.c(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new f((m0) h10, (m0) h11, true);
    }

    /* renamed from: m1 */
    public f c1(a1 a1Var) {
        t.e(a1Var, "newAttributes");
        return new f(e1().e1(a1Var), f1().e1(a1Var));
    }

    @Override // oe.y, oe.e0
    public h z() {
        xc.h z10 = W0().z();
        xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
        if (eVar != null) {
            h K = eVar.K(new e(null, 1, null));
            t.d(K, "classDescriptor.getMemberScope(RawSubstitution())");
            return K;
        }
        throw new IllegalStateException(("Incorrect classifier: " + W0().z()).toString());
    }
}
