package oe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public class n1 {

    /* renamed from: a */
    public static final m0 f18024a = qe.k.d(qe.j.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final m0 f18025b = qe.k.d(qe.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final m0 f18026c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final m0 f18027d = new a("UNIT_EXPECTED_TYPE");

    /* loaded from: classes3.dex */
    public static class a extends r {

        /* renamed from: d */
        private final String f18028d;

        public a(String str) {
            this.f18028d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void i1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.n1.a.i1(int):void");
        }

        @Override // oe.m0
        /* renamed from: d1 */
        public m0 a1(boolean z10) {
            throw new IllegalStateException(this.f18028d);
        }

        @Override // oe.m0
        /* renamed from: e1 */
        public m0 c1(a1 a1Var) {
            if (a1Var == null) {
                i1(0);
            }
            throw new IllegalStateException(this.f18028d);
        }

        @Override // oe.r
        protected m0 f1() {
            throw new IllegalStateException(this.f18028d);
        }

        @Override // oe.r
        public r h1(m0 m0Var) {
            if (m0Var == null) {
                i1(2);
            }
            throw new IllegalStateException(this.f18028d);
        }

        /* renamed from: j1 */
        public a g1(pe.g gVar) {
            if (gVar == null) {
                i1(3);
            }
            return this;
        }

        @Override // oe.m0
        public String toString() {
            String str = this.f18028d;
            if (str == null) {
                i1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.n1.a(int):void");
    }

    public static boolean b(e0 e0Var) {
        if (e0Var == null) {
            a(28);
        }
        if (e0Var.X0()) {
            return true;
        }
        return b0.b(e0Var) && b(b0.a(e0Var).f1());
    }

    public static boolean c(e0 e0Var, gc.l<q1, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(e0Var, lVar, null);
    }

    private static boolean d(e0 e0Var, gc.l<q1, Boolean> lVar, ye.f<e0> fVar) {
        if (lVar == null) {
            a(44);
        }
        if (e0Var == null) {
            return false;
        }
        q1 Z0 = e0Var.Z0();
        if (v(e0Var)) {
            return lVar.invoke(Z0).booleanValue();
        }
        if (fVar != null && fVar.contains(e0Var)) {
            return false;
        }
        if (lVar.invoke(Z0).booleanValue()) {
            return true;
        }
        if (fVar == null) {
            fVar = ye.f.a();
        }
        fVar.add(e0Var);
        y yVar = Z0 instanceof y ? (y) Z0 : null;
        if (yVar != null && (d(yVar.e1(), lVar, fVar) || d(yVar.f1(), lVar, fVar))) {
            return true;
        }
        if ((Z0 instanceof p) && d(((p) Z0).i1(), lVar, fVar)) {
            return true;
        }
        e1 W0 = e0Var.W0();
        if (W0 instanceof d0) {
            for (e0 e0Var2 : ((d0) W0).l()) {
                if (d(e0Var2, lVar, fVar)) {
                    return true;
                }
            }
            return false;
        }
        for (g1 g1Var : e0Var.U0()) {
            if (!g1Var.c()) {
                if (d(g1Var.getType(), lVar, fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static e0 e(e0 e0Var, e0 e0Var2, l1 l1Var) {
        if (e0Var == null) {
            a(20);
        }
        if (e0Var2 == null) {
            a(21);
        }
        if (l1Var == null) {
            a(22);
        }
        e0 p10 = l1Var.p(e0Var2, r1.INVARIANT);
        if (p10 != null) {
            return q(p10, e0Var.X0());
        }
        return null;
    }

    public static xc.e f(e0 e0Var) {
        if (e0Var == null) {
            a(30);
        }
        xc.h z10 = e0Var.W0().z();
        if (z10 instanceof xc.e) {
            return (xc.e) z10;
        }
        return null;
    }

    public static List<g1> g(List<xc.f1> list) {
        List<g1> F0;
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (xc.f1 f1Var : list) {
            arrayList.add(new i1(f1Var.u()));
        }
        F0 = ub.c0.F0(arrayList);
        if (F0 == null) {
            a(17);
        }
        return F0;
    }

    public static List<e0> h(e0 e0Var) {
        if (e0Var == null) {
            a(18);
        }
        l1 f10 = l1.f(e0Var);
        Collection<e0> l10 = e0Var.W0().l();
        ArrayList arrayList = new ArrayList(l10.size());
        for (e0 e0Var2 : l10) {
            e0 e10 = e(e0Var, e0Var2, f10);
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static xc.f1 i(e0 e0Var) {
        if (e0Var == null) {
            a(62);
        }
        if (e0Var.W0().z() instanceof xc.f1) {
            return (xc.f1) e0Var.W0().z();
        }
        return null;
    }

    public static boolean j(e0 e0Var) {
        if (e0Var == null) {
            a(29);
        }
        if (e0Var.W0().z() instanceof xc.e) {
            return false;
        }
        for (e0 e0Var2 : h(e0Var)) {
            if (l(e0Var2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(e0 e0Var) {
        return e0Var != null && e0Var.W0() == f18024a.W0();
    }

    public static boolean l(e0 e0Var) {
        if (e0Var == null) {
            a(27);
        }
        if (e0Var.X0()) {
            return true;
        }
        if (b0.b(e0Var) && l(b0.a(e0Var).f1())) {
            return true;
        }
        if (q0.c(e0Var)) {
            return false;
        }
        if (m(e0Var)) {
            return j(e0Var);
        }
        if (e0Var instanceof e) {
            xc.f1 c10 = ((e) e0Var).f1().c();
            return c10 == null || j(c10.u());
        }
        e1 W0 = e0Var.W0();
        if (W0 instanceof d0) {
            for (e0 e0Var2 : W0.l()) {
                if (l(e0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(e0 e0Var) {
        if (e0Var == null) {
            a(59);
        }
        return i(e0Var) != null || (e0Var.W0() instanceof pe.n);
    }

    public static e0 n(e0 e0Var) {
        if (e0Var == null) {
            a(2);
        }
        return p(e0Var, false);
    }

    public static e0 o(e0 e0Var) {
        if (e0Var == null) {
            a(1);
        }
        return p(e0Var, true);
    }

    public static e0 p(e0 e0Var, boolean z10) {
        if (e0Var == null) {
            a(3);
        }
        q1 a12 = e0Var.Z0().a1(z10);
        if (a12 == null) {
            a(4);
        }
        return a12;
    }

    public static e0 q(e0 e0Var, boolean z10) {
        if (e0Var == null) {
            a(8);
        }
        if (z10) {
            return o(e0Var);
        }
        if (e0Var == null) {
            a(9);
        }
        return e0Var;
    }

    public static m0 r(m0 m0Var, boolean z10) {
        if (m0Var == null) {
            a(5);
        }
        if (!z10) {
            if (m0Var == null) {
                a(7);
            }
            return m0Var;
        }
        m0 d12 = m0Var.d1(true);
        if (d12 == null) {
            a(6);
        }
        return d12;
    }

    public static g1 s(xc.f1 f1Var) {
        if (f1Var == null) {
            a(45);
        }
        return new s0(f1Var);
    }

    public static m0 t(e1 e1Var, he.h hVar, gc.l<pe.g, m0> lVar) {
        if (e1Var == null) {
            a(12);
        }
        if (hVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        m0 k10 = f0.k(a1.Companion.h(), e1Var, g(e1Var.getParameters()), false, hVar, lVar);
        if (k10 == null) {
            a(15);
        }
        return k10;
    }

    public static m0 u(xc.h hVar, he.h hVar2, gc.l<pe.g, m0> lVar) {
        if (qe.k.m(hVar)) {
            qe.h d10 = qe.k.d(qe.j.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
            if (d10 == null) {
                a(11);
            }
            return d10;
        }
        return t(hVar.r(), hVar2, lVar);
    }

    public static boolean v(e0 e0Var) {
        if (e0Var == null) {
            a(0);
        }
        return e0Var == f18026c || e0Var == f18027d;
    }
}
