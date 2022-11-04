package xc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import ve.l;
import xc.m1;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a */
    public static final u f25577a;

    /* renamed from: b */
    public static final u f25578b;

    /* renamed from: c */
    public static final u f25579c;

    /* renamed from: d */
    public static final u f25580d;

    /* renamed from: e */
    public static final u f25581e;

    /* renamed from: f */
    public static final u f25582f;

    /* renamed from: g */
    public static final u f25583g;

    /* renamed from: h */
    public static final u f25584h;

    /* renamed from: i */
    public static final u f25585i;

    /* renamed from: j */
    public static final Set<u> f25586j;

    /* renamed from: k */
    private static final Map<u, Integer> f25587k;

    /* renamed from: l */
    public static final u f25588l;

    /* renamed from: m */
    private static final ie.f f25589m = new a();

    /* renamed from: n */
    public static final ie.f f25590n = new b();
    @Deprecated

    /* renamed from: o */
    public static final ie.f f25591o = new c();

    /* renamed from: p */
    private static final ve.l f25592p;

    /* renamed from: q */
    private static final Map<n1, u> f25593q;

    /* loaded from: classes.dex */
    static class a implements ie.f {
        a() {
        }

        @Override // ie.f
        public oe.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    static class b implements ie.f {
        b() {
        }

        @Override // ie.f
        public oe.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    static class c implements ie.f {
        c() {
        }

        @Override // ie.f
        public oe.e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    static class d extends r {
        d(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(m mVar) {
            if (mVar == null) {
                g(0);
            }
            return ae.d.j(mVar) != b1.f25526a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [xc.m, xc.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [xc.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [xc.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [xc.m] */
        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == 0) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (!ae.d.J(qVar) || !h(mVar)) {
                if (qVar instanceof xc.l) {
                    xc.i b10 = ((xc.l) qVar).b();
                    if (z10 && ae.d.G(b10) && ae.d.J(b10) && (mVar instanceof xc.l) && ae.d.J(mVar.b()) && t.f(qVar, mVar)) {
                        return true;
                    }
                }
                while (qVar != 0) {
                    qVar = qVar.b();
                    if (qVar instanceof xc.e) {
                        if (!ae.d.x(qVar)) {
                            break;
                        }
                    }
                    if (qVar instanceof l0) {
                        break;
                    }
                }
                if (qVar == 0) {
                    return false;
                }
                while (mVar != null) {
                    if (qVar == mVar) {
                        return true;
                    }
                    if (mVar instanceof l0) {
                        return (qVar instanceof l0) && qVar.d().equals(((l0) mVar).d()) && ae.d.b(mVar, qVar);
                    }
                    mVar = mVar.b();
                }
                return false;
            }
            return t.f(qVar, mVar);
        }
    }

    /* loaded from: classes.dex */
    static class e extends r {
        e(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            m q10;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (t.f25577a.e(fVar, qVar, mVar, z10)) {
                if (fVar == t.f25590n) {
                    return true;
                }
                if (fVar != t.f25589m && (q10 = ae.d.q(qVar, xc.e.class)) != null && (fVar instanceof ie.h)) {
                    return ((ie.h) fVar).q().a().equals(q10.a());
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static class f extends r {
        f(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(ie.f fVar, q qVar, xc.e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (fVar == t.f25591o) {
                return false;
            }
            if (!(qVar instanceof xc.b) || (qVar instanceof xc.l) || fVar == t.f25590n) {
                return true;
            }
            if (fVar == t.f25589m || fVar == null) {
                return false;
            }
            oe.e0 a10 = fVar instanceof ie.g ? ((ie.g) fVar).a() : fVar.getType();
            return ae.d.I(a10, eVar) || oe.w.a(a10);
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            xc.e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            xc.e eVar2 = (xc.e) ae.d.q(qVar, xc.e.class);
            xc.e eVar3 = (xc.e) ae.d.r(mVar, xc.e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && ae.d.x(eVar2) && (eVar = (xc.e) ae.d.q(eVar2, xc.e.class)) != null && ae.d.H(eVar3, eVar)) {
                return true;
            }
            q M = ae.d.M(qVar);
            xc.e eVar4 = (xc.e) ae.d.q(M, xc.e.class);
            if (eVar4 == null) {
                return false;
            }
            if (ae.d.H(eVar3, eVar4) && h(fVar, M, eVar3)) {
                return true;
            }
            return e(fVar, qVar, eVar3.b(), z10);
        }
    }

    /* loaded from: classes.dex */
    static class g extends r {
        g(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (!ae.d.g(mVar).O(ae.d.g(qVar))) {
                return false;
            }
            return t.f25592p.a(qVar, mVar);
        }
    }

    /* loaded from: classes.dex */
    static class h extends r {
        h(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class i extends r {
        i(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* loaded from: classes.dex */
    static class j extends r {
        j(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* loaded from: classes.dex */
    static class k extends r {
        k(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static class l extends r {
        l(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        Set e10;
        d dVar = new d(m1.e.f25563c);
        f25577a = dVar;
        e eVar = new e(m1.f.f25564c);
        f25578b = eVar;
        f fVar = new f(m1.g.f25565c);
        f25579c = fVar;
        g gVar = new g(m1.b.f25560c);
        f25580d = gVar;
        h hVar = new h(m1.h.f25566c);
        f25581e = hVar;
        i iVar = new i(m1.d.f25562c);
        f25582f = iVar;
        j jVar = new j(m1.a.f25559c);
        f25583g = jVar;
        k kVar = new k(m1.c.f25561c);
        f25584h = kVar;
        l lVar = new l(m1.i.f25567c);
        f25585i = lVar;
        e10 = ub.y0.e(dVar, eVar, gVar, iVar);
        f25586j = Collections.unmodifiableSet(e10);
        HashMap e11 = ye.a.e(4);
        e11.put(eVar, 0);
        e11.put(dVar, 0);
        e11.put(gVar, 1);
        e11.put(fVar, 1);
        e11.put(hVar, 2);
        f25587k = Collections.unmodifiableMap(e11);
        f25588l = hVar;
        Iterator it = ServiceLoader.load(ve.l.class, ve.l.class.getClassLoader()).iterator();
        f25592p = it.hasNext() ? (ve.l) it.next() : l.a.f24045a;
        f25593q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.t.a(int):void");
    }

    public static Integer d(u uVar, u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer a10 = uVar.a(uVar2);
        if (a10 != null) {
            return a10;
        }
        Integer a11 = uVar2.a(uVar);
        if (a11 == null) {
            return null;
        }
        return Integer.valueOf(-a11.intValue());
    }

    public static q e(ie.f fVar, q qVar, m mVar, boolean z10) {
        q e10;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        m a10 = qVar.a();
        while (true) {
            q qVar2 = (q) a10;
            if (qVar2 == null || qVar2.g() == f25582f) {
                break;
            } else if (!qVar2.g().e(fVar, qVar2, mVar, z10)) {
                return qVar2;
            } else {
                a10 = ae.d.q(qVar2, q.class);
            }
        }
        if (!(qVar instanceof ad.i0) || (e10 = e(fVar, ((ad.i0) qVar).a0(), mVar, z10)) == null) {
            return null;
        }
        return e10;
    }

    public static boolean f(m mVar, m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        b1 j10 = ae.d.j(mVar2);
        if (j10 != b1.f25526a) {
            return j10.equals(ae.d.j(mVar));
        }
        return false;
    }

    public static boolean g(u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f25577a || uVar == f25578b;
    }

    public static boolean h(q qVar, m mVar, boolean z10) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f25590n, qVar, mVar, z10) == null;
    }

    private static void i(u uVar) {
        f25593q.put(uVar.b(), uVar);
    }

    public static u j(n1 n1Var) {
        if (n1Var == null) {
            a(15);
        }
        u uVar = f25593q.get(n1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + n1Var);
    }
}
