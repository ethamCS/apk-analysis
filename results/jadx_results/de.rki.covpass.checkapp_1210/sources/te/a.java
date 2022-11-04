package te;

import gc.l;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.b1;
import oe.e;
import oe.e0;
import oe.f0;
import oe.g1;
import oe.i1;
import oe.k1;
import oe.l1;
import oe.m0;
import oe.n1;
import oe.p;
import oe.p1;
import oe.q1;
import oe.r1;
import oe.s0;
import oe.u0;
import oe.y;
import ub.c0;
import ub.h0;
import xc.e1;
import xc.f1;
import xc.h;
import xc.i;
import yc.g;
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: te.a$a */
    /* loaded from: classes3.dex */
    public static final class C0393a extends v implements l<q1, Boolean> {

        /* renamed from: c */
        public static final C0393a f22227c = new C0393a();

        C0393a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q1 q1Var) {
            t.e(q1Var, "it");
            h z10 = q1Var.W0().z();
            return Boolean.valueOf(z10 != null ? a.p(z10) : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends v implements l<q1, Boolean> {

        /* renamed from: c */
        public static final b f22228c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q1 q1Var) {
            t.e(q1Var, "it");
            h z10 = q1Var.W0().z();
            boolean z11 = false;
            if (z10 != null && ((z10 instanceof e1) || (z10 instanceof f1))) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    public static final g1 a(e0 e0Var) {
        t.e(e0Var, "<this>");
        return new i1(e0Var);
    }

    public static final boolean b(e0 e0Var, l<? super q1, Boolean> lVar) {
        t.e(e0Var, "<this>");
        t.e(lVar, "predicate");
        return n1.c(e0Var, lVar);
    }

    private static final boolean c(e0 e0Var, oe.e1 e1Var, Set<? extends f1> set) {
        Iterable<h0> L0;
        f1 f1Var;
        boolean z10;
        Object Y;
        if (t.a(e0Var.W0(), e1Var)) {
            return true;
        }
        h z11 = e0Var.W0().z();
        i iVar = z11 instanceof i ? (i) z11 : null;
        List<f1> A = iVar != null ? iVar.A() : null;
        L0 = c0.L0(e0Var.U0());
        if (!(L0 instanceof Collection) || !((Collection) L0).isEmpty()) {
            for (h0 h0Var : L0) {
                int a10 = h0Var.a();
                g1 g1Var = (g1) h0Var.b();
                if (A != null) {
                    Y = c0.Y(A, a10);
                    f1Var = (f1) Y;
                } else {
                    f1Var = null;
                }
                if (((f1Var == null || set == null || !set.contains(f1Var)) ? false : true) || g1Var.c()) {
                    z10 = false;
                    continue;
                } else {
                    e0 type = g1Var.getType();
                    t.d(type, "argument.type");
                    z10 = c(type, e1Var, set);
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(e0 e0Var) {
        t.e(e0Var, "<this>");
        return b(e0Var, C0393a.f22227c);
    }

    public static final g1 e(e0 e0Var, r1 r1Var, f1 f1Var) {
        t.e(e0Var, "type");
        t.e(r1Var, "projectionKind");
        if ((f1Var != null ? f1Var.w() : null) == r1Var) {
            r1Var = r1.INVARIANT;
        }
        return new i1(r1Var, e0Var);
    }

    public static final Set<f1> f(e0 e0Var, Set<? extends f1> set) {
        t.e(e0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g(e0Var, e0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void g(e0 e0Var, e0 e0Var2, Set<f1> set, Set<? extends f1> set2) {
        f1 f1Var;
        boolean N;
        Object Y;
        h z10 = e0Var.W0().z();
        if (z10 instanceof f1) {
            if (!t.a(e0Var.W0(), e0Var2.W0())) {
                set.add(z10);
                return;
            }
            for (e0 e0Var3 : ((f1) z10).getUpperBounds()) {
                t.d(e0Var3, "upperBound");
                g(e0Var3, e0Var2, set, set2);
            }
            return;
        }
        h z11 = e0Var.W0().z();
        i iVar = z11 instanceof i ? (i) z11 : null;
        List<f1> A = iVar != null ? iVar.A() : null;
        int i10 = 0;
        for (g1 g1Var : e0Var.U0()) {
            int i11 = i10 + 1;
            if (A != null) {
                Y = c0.Y(A, i10);
                f1Var = (f1) Y;
            } else {
                f1Var = null;
            }
            if (!((f1Var == null || set2 == null || !set2.contains(f1Var)) ? false : true) && !g1Var.c()) {
                N = c0.N(set, g1Var.getType().W0().z());
                if (!N && !t.a(g1Var.getType().W0(), e0Var2.W0())) {
                    e0 type = g1Var.getType();
                    t.d(type, "argument.type");
                    g(type, e0Var2, set, set2);
                }
            }
            i10 = i11;
        }
    }

    public static final uc.h h(e0 e0Var) {
        t.e(e0Var, "<this>");
        uc.h x10 = e0Var.W0().x();
        t.d(x10, "constructor.builtIns");
        return x10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:17:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final oe.e0 i(xc.f1 r7) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            hc.t.d(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            hc.t.d(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            oe.e0 r4 = (oe.e0) r4
            oe.e1 r4 = r4.W0()
            xc.h r4 = r4.z()
            boolean r5 = r4 instanceof xc.e
            if (r5 == 0) goto L39
            r3 = r4
            xc.e r3 = (xc.e) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            xc.f r5 = r3.h()
            xc.f r6 = xc.f.INTERFACE
            if (r5 == r6) goto L4e
            xc.f r3 = r3.h()
            xc.f r5 = xc.f.ANNOTATION_CLASS
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            oe.e0 r3 = (oe.e0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.getUpperBounds()
            hc.t.d(r7, r1)
            java.lang.Object r7 = ub.s.V(r7)
            java.lang.String r0 = "upperBounds.first()"
            hc.t.d(r7, r0)
            r3 = r7
            oe.e0 r3 = (oe.e0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.i(xc.f1):oe.e0");
    }

    public static final boolean j(f1 f1Var) {
        t.e(f1Var, "typeParameter");
        return l(f1Var, null, null, 6, null);
    }

    public static final boolean k(f1 f1Var, oe.e1 e1Var, Set<? extends f1> set) {
        boolean z10;
        t.e(f1Var, "typeParameter");
        List<e0> upperBounds = f1Var.getUpperBounds();
        t.d(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (e0 e0Var : upperBounds) {
                t.d(e0Var, "upperBound");
                if (!c(e0Var, f1Var.u().W0(), set) || (e1Var != null && !t.a(e0Var.W0(), e1Var))) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean l(f1 f1Var, oe.e1 e1Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e1Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return k(f1Var, e1Var, set);
    }

    public static final boolean m(e0 e0Var) {
        t.e(e0Var, "<this>");
        if (!(e0Var instanceof e)) {
            if (!((e0Var instanceof p) && (((p) e0Var).i1() instanceof e))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(e0 e0Var) {
        t.e(e0Var, "<this>");
        if (!(e0Var instanceof u0)) {
            if (!((e0Var instanceof p) && (((p) e0Var).i1() instanceof u0))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(e0 e0Var, e0 e0Var2) {
        t.e(e0Var, "<this>");
        t.e(e0Var2, "superType");
        return pe.e.f19146a.d(e0Var, e0Var2);
    }

    public static final boolean p(h hVar) {
        t.e(hVar, "<this>");
        return (hVar instanceof f1) && (((f1) hVar).b() instanceof e1);
    }

    public static final boolean q(e0 e0Var) {
        t.e(e0Var, "<this>");
        return n1.m(e0Var);
    }

    public static final boolean r(e0 e0Var) {
        t.e(e0Var, "type");
        return (e0Var instanceof qe.h) && ((qe.h) e0Var).g1().h();
    }

    public static final e0 s(e0 e0Var) {
        t.e(e0Var, "<this>");
        e0 n10 = n1.n(e0Var);
        t.d(n10, "makeNotNullable(this)");
        return n10;
    }

    public static final e0 t(e0 e0Var) {
        t.e(e0Var, "<this>");
        e0 o10 = n1.o(e0Var);
        t.d(o10, "makeNullable(this)");
        return o10;
    }

    public static final e0 u(e0 e0Var, g gVar) {
        t.e(e0Var, "<this>");
        t.e(gVar, "newAnnotations");
        return (!e0Var.j().isEmpty() || !gVar.isEmpty()) ? e0Var.Z0().c1(b1.a(e0Var.V0(), gVar)) : e0Var;
    }

    public static final e0 v(e0 e0Var, l1 l1Var, Map<oe.e1, ? extends g1> map, r1 r1Var, Set<? extends f1> set) {
        q1 q1Var;
        int s10;
        Object Y;
        int s11;
        Object Y2;
        int s12;
        Object Y3;
        t.e(e0Var, "<this>");
        t.e(l1Var, "substitutor");
        t.e(map, "substitutionMap");
        t.e(r1Var, "variance");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            y yVar = (y) Z0;
            m0 e12 = yVar.e1();
            if (!e12.W0().getParameters().isEmpty() && e12.W0().z() != null) {
                List<f1> parameters = e12.W0().getParameters();
                t.d(parameters, "constructor.parameters");
                s12 = ub.v.s(parameters, 10);
                ArrayList arrayList = new ArrayList(s12);
                for (f1 f1Var : parameters) {
                    Y3 = c0.Y(e0Var.U0(), f1Var.l());
                    g1 g1Var = (g1) Y3;
                    if ((set != null && set.contains(f1Var)) || g1Var == null || !map.containsKey(g1Var.getType().W0())) {
                        g1Var = new s0(f1Var);
                    }
                    arrayList.add(g1Var);
                }
                e12 = k1.f(e12, arrayList, null, 2, null);
            }
            m0 f12 = yVar.f1();
            if (!f12.W0().getParameters().isEmpty() && f12.W0().z() != null) {
                List<f1> parameters2 = f12.W0().getParameters();
                t.d(parameters2, "constructor.parameters");
                s11 = ub.v.s(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(s11);
                for (f1 f1Var2 : parameters2) {
                    Y2 = c0.Y(e0Var.U0(), f1Var2.l());
                    g1 g1Var2 = (g1) Y2;
                    if ((set != null && set.contains(f1Var2)) || g1Var2 == null || !map.containsKey(g1Var2.getType().W0())) {
                        g1Var2 = new s0(f1Var2);
                    }
                    arrayList2.add(g1Var2);
                }
                f12 = k1.f(f12, arrayList2, null, 2, null);
            }
            q1Var = f0.d(e12, f12);
        } else if (!(Z0 instanceof m0)) {
            throw new tb.p();
        } else {
            m0 m0Var = (m0) Z0;
            if (m0Var.W0().getParameters().isEmpty() || m0Var.W0().z() == null) {
                q1Var = m0Var;
            } else {
                List<f1> parameters3 = m0Var.W0().getParameters();
                t.d(parameters3, "constructor.parameters");
                s10 = ub.v.s(parameters3, 10);
                ArrayList arrayList3 = new ArrayList(s10);
                for (f1 f1Var3 : parameters3) {
                    Y = c0.Y(e0Var.U0(), f1Var3.l());
                    g1 g1Var3 = (g1) Y;
                    if ((set != null && set.contains(f1Var3)) || g1Var3 == null || !map.containsKey(g1Var3.getType().W0())) {
                        g1Var3 = new s0(f1Var3);
                    }
                    arrayList3.add(g1Var3);
                }
                q1Var = k1.f(m0Var, arrayList3, null, 2, null);
            }
        }
        e0 n10 = l1Var.n(p1.b(q1Var, Z0), r1Var);
        t.d(n10, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return n10;
    }

    public static final e0 w(e0 e0Var) {
        m0 m0Var;
        int s10;
        int s11;
        int s12;
        t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            y yVar = (y) Z0;
            m0 e12 = yVar.e1();
            if (!e12.W0().getParameters().isEmpty() && e12.W0().z() != null) {
                List<f1> parameters = e12.W0().getParameters();
                t.d(parameters, "constructor.parameters");
                s12 = ub.v.s(parameters, 10);
                ArrayList arrayList = new ArrayList(s12);
                for (f1 f1Var : parameters) {
                    arrayList.add(new s0(f1Var));
                }
                e12 = k1.f(e12, arrayList, null, 2, null);
            }
            m0 f12 = yVar.f1();
            if (!f12.W0().getParameters().isEmpty() && f12.W0().z() != null) {
                List<f1> parameters2 = f12.W0().getParameters();
                t.d(parameters2, "constructor.parameters");
                s11 = ub.v.s(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(s11);
                for (f1 f1Var2 : parameters2) {
                    arrayList2.add(new s0(f1Var2));
                }
                f12 = k1.f(f12, arrayList2, null, 2, null);
            }
            m0Var = f0.d(e12, f12);
        } else if (!(Z0 instanceof m0)) {
            throw new tb.p();
        } else {
            m0 m0Var2 = (m0) Z0;
            boolean isEmpty = m0Var2.W0().getParameters().isEmpty();
            m0Var = m0Var2;
            if (!isEmpty) {
                h z10 = m0Var2.W0().z();
                m0Var = m0Var2;
                if (z10 != null) {
                    List<f1> parameters3 = m0Var2.W0().getParameters();
                    t.d(parameters3, "constructor.parameters");
                    s10 = ub.v.s(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(s10);
                    for (f1 f1Var3 : parameters3) {
                        arrayList3.add(new s0(f1Var3));
                    }
                    m0Var = k1.f(m0Var2, arrayList3, null, 2, null);
                }
            }
        }
        return p1.b(m0Var, Z0);
    }

    public static final boolean x(e0 e0Var) {
        t.e(e0Var, "<this>");
        return b(e0Var, b.f22228c);
    }
}
