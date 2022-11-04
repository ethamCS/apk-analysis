package oe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oe.d1;
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    public static final f f17953a = new f();

    /* renamed from: b */
    public static boolean f17954b;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17955a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f17956b;

        static {
            int[] iArr = new int[se.u.values().length];
            iArr[se.u.INV.ordinal()] = 1;
            iArr[se.u.OUT.ordinal()] = 2;
            iArr[se.u.IN.ordinal()] = 3;
            f17955a = iArr;
            int[] iArr2 = new int[d1.b.values().length];
            iArr2[d1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[d1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[d1.b.SKIP_LOWER.ordinal()] = 3;
            f17956b = iArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.l<d1.a, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ List<se.k> f17957c;

        /* renamed from: d */
        final /* synthetic */ d1 f17958d;

        /* renamed from: q */
        final /* synthetic */ se.p f17959q;

        /* renamed from: x */
        final /* synthetic */ se.k f17960x;

        /* loaded from: classes3.dex */
        public static final class a extends hc.v implements gc.a<Boolean> {

            /* renamed from: c */
            final /* synthetic */ d1 f17961c;

            /* renamed from: d */
            final /* synthetic */ se.p f17962d;

            /* renamed from: q */
            final /* synthetic */ se.k f17963q;

            /* renamed from: x */
            final /* synthetic */ se.k f17964x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d1 d1Var, se.p pVar, se.k kVar, se.k kVar2) {
                super(0);
                this.f17961c = d1Var;
                this.f17962d = pVar;
                this.f17963q = kVar;
                this.f17964x = kVar2;
            }

            /* renamed from: b */
            public final Boolean invoke() {
                return Boolean.valueOf(f.f17953a.q(this.f17961c, this.f17962d.u0(this.f17963q), this.f17964x));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends se.k> list, d1 d1Var, se.p pVar, se.k kVar) {
            super(1);
            this.f17957c = list;
            this.f17958d = d1Var;
            this.f17959q = pVar;
            this.f17960x = kVar;
        }

        public final void b(d1.a aVar) {
            hc.t.e(aVar, "$this$runForkingPoint");
            for (se.k kVar : this.f17957c) {
                aVar.a(new a(this.f17958d, this.f17959q, kVar, this.f17960x));
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(d1.a aVar) {
            b(aVar);
            return tb.e0.f22152a;
        }
    }

    private f() {
    }

    private final Boolean a(d1 d1Var, se.k kVar, se.k kVar2) {
        se.p j10 = d1Var.j();
        if (j10.u(kVar) || j10.u(kVar2)) {
            if (d(j10, kVar) && d(j10, kVar2)) {
                return Boolean.TRUE;
            }
            if (j10.u(kVar)) {
                if (e(j10, d1Var, kVar, kVar2, false)) {
                    return Boolean.TRUE;
                }
            } else if (j10.u(kVar2) && (c(j10, kVar) || e(j10, d1Var, kVar2, kVar, true))) {
                return Boolean.TRUE;
            }
            return null;
        }
        return null;
    }

    private static final boolean b(se.p pVar, se.k kVar) {
        if (!(kVar instanceof se.d)) {
            return false;
        }
        se.m s10 = pVar.s(pVar.d0((se.d) kVar));
        return !pVar.i(s10) && pVar.u(pVar.x(pVar.q(s10)));
    }

    private static final boolean c(se.p pVar, se.k kVar) {
        boolean z10;
        boolean z11;
        se.n c10 = pVar.c(kVar);
        if (c10 instanceof se.h) {
            Collection<se.i> m02 = pVar.m0(c10);
            if (!(m02 instanceof Collection) || !m02.isEmpty()) {
                for (se.i iVar : m02) {
                    se.k d10 = pVar.d(iVar);
                    if (d10 == null || !pVar.u(d10)) {
                        z11 = false;
                        continue;
                    } else {
                        z11 = true;
                        continue;
                    }
                    if (z11) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private static final boolean d(se.p pVar, se.k kVar) {
        return pVar.u(kVar) || b(pVar, kVar);
    }

    private static final boolean e(se.p pVar, d1 d1Var, se.k kVar, se.k kVar2, boolean z10) {
        boolean z11;
        Collection<se.i> w02 = pVar.w0(kVar);
        if (!(w02 instanceof Collection) || !w02.isEmpty()) {
            for (se.i iVar : w02) {
                if (hc.t.a(pVar.D0(iVar), pVar.c(kVar2)) || (z10 && t(f17953a, d1Var, kVar2, iVar, false, 8, null))) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0127, code lost:
        if (r10 != false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean f(oe.d1 r15, se.k r16, se.k r17) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.f(oe.d1, se.k, se.k):java.lang.Boolean");
    }

    private final List<se.k> g(d1 d1Var, se.k kVar, se.n nVar) {
        String e02;
        d1.c cVar;
        List<se.k> h10;
        List<se.k> d10;
        List<se.k> h11;
        se.p j10 = d1Var.j();
        List<se.k> Z = j10.Z(kVar, nVar);
        if (Z != null) {
            return Z;
        }
        if (!j10.A(nVar) && j10.h0(kVar)) {
            h11 = ub.u.h();
            return h11;
        } else if (j10.j(nVar)) {
            if (!j10.F(j10.c(kVar), nVar)) {
                h10 = ub.u.h();
                return h10;
            }
            se.k w9 = j10.w(kVar, se.b.FOR_SUBTYPING);
            if (w9 != null) {
                kVar = w9;
            }
            d10 = ub.t.d(kVar);
            return d10;
        } else {
            ye.e eVar = new ye.e();
            d1Var.k();
            ArrayDeque<se.k> h12 = d1Var.h();
            hc.t.b(h12);
            Set<se.k> i10 = d1Var.i();
            hc.t.b(i10);
            h12.push(kVar);
            while (!h12.isEmpty()) {
                if (i10.size() > 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(kVar);
                    sb2.append(". Supertypes = ");
                    e02 = ub.c0.e0(i10, null, null, null, 0, null, null, 63, null);
                    sb2.append(e02);
                    throw new IllegalStateException(sb2.toString().toString());
                }
                se.k pop = h12.pop();
                hc.t.d(pop, "current");
                if (i10.add(pop)) {
                    se.k w10 = j10.w(pop, se.b.FOR_SUBTYPING);
                    if (w10 == null) {
                        w10 = pop;
                    }
                    if (j10.F(j10.c(w10), nVar)) {
                        eVar.add(w10);
                        cVar = d1.c.C0280c.f17947a;
                    } else {
                        cVar = j10.t0(w10) == 0 ? d1.c.b.f17946a : d1Var.j().i0(w10);
                    }
                    if (!(!hc.t.a(cVar, d1.c.C0280c.f17947a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        se.p j11 = d1Var.j();
                        for (se.i iVar : j11.m0(j11.c(pop))) {
                            h12.add(cVar.a(d1Var, iVar));
                        }
                    }
                }
            }
            d1Var.e();
            return eVar;
        }
    }

    private final List<se.k> h(d1 d1Var, se.k kVar, se.n nVar) {
        return w(d1Var, g(d1Var, kVar, nVar));
    }

    private final boolean i(d1 d1Var, se.i iVar, se.i iVar2, boolean z10) {
        se.p j10 = d1Var.j();
        se.i o10 = d1Var.o(d1Var.p(iVar));
        se.i o11 = d1Var.o(d1Var.p(iVar2));
        f fVar = f17953a;
        Boolean f10 = fVar.f(d1Var, j10.x0(o10), j10.x(o11));
        if (f10 == null) {
            Boolean c10 = d1Var.c(o10, o11, z10);
            return c10 != null ? c10.booleanValue() : fVar.u(d1Var, j10.x0(o10), j10.x(o11));
        }
        boolean booleanValue = f10.booleanValue();
        d1Var.c(o10, o11, z10);
        return booleanValue;
    }

    private final se.o m(se.p pVar, se.i iVar, se.i iVar2) {
        se.i q10;
        int t02 = pVar.t0(iVar);
        int i10 = 0;
        while (true) {
            se.m mVar = null;
            if (i10 >= t02) {
                return null;
            }
            se.m X = pVar.X(iVar, i10);
            boolean z10 = true;
            if (!pVar.i(X)) {
                mVar = X;
            }
            if (mVar != null && (q10 = pVar.q(mVar)) != null) {
                if (!pVar.l0(pVar.x0(q10)) || !pVar.l0(pVar.x0(iVar2))) {
                    z10 = false;
                }
                if (hc.t.a(q10, iVar2) || (z10 && hc.t.a(pVar.D0(q10), pVar.D0(iVar2)))) {
                    break;
                }
                se.o m10 = m(pVar, q10, iVar2);
                if (m10 != null) {
                    return m10;
                }
            }
            i10++;
        }
        return pVar.J(pVar.D0(iVar), i10);
    }

    private final boolean n(d1 d1Var, se.k kVar) {
        String e02;
        se.p j10 = d1Var.j();
        se.n c10 = j10.c(kVar);
        if (j10.A(c10)) {
            return j10.U(c10);
        }
        if (j10.U(j10.c(kVar))) {
            return true;
        }
        d1Var.k();
        ArrayDeque<se.k> h10 = d1Var.h();
        hc.t.b(h10);
        Set<se.k> i10 = d1Var.i();
        hc.t.b(i10);
        h10.push(kVar);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(kVar);
                sb2.append(". Supertypes = ");
                e02 = ub.c0.e0(i10, null, null, null, 0, null, null, 63, null);
                sb2.append(e02);
                throw new IllegalStateException(sb2.toString().toString());
            }
            se.k pop = h10.pop();
            hc.t.d(pop, "current");
            if (i10.add(pop)) {
                d1.c cVar = j10.h0(pop) ? d1.c.C0280c.f17947a : d1.c.b.f17946a;
                if (!(!hc.t.a(cVar, d1.c.C0280c.f17947a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    se.p j11 = d1Var.j();
                    for (se.i iVar : j11.m0(j11.c(pop))) {
                        se.k a10 = cVar.a(d1Var, iVar);
                        if (j10.U(j10.c(a10))) {
                            d1Var.e();
                            return true;
                        }
                        h10.add(a10);
                    }
                    continue;
                }
            }
        }
        d1Var.e();
        return false;
    }

    private final boolean o(se.p pVar, se.i iVar) {
        return pVar.r0(pVar.D0(iVar)) && !pVar.z0(iVar) && !pVar.Q(iVar) && !pVar.k0(iVar) && hc.t.a(pVar.c(pVar.x0(iVar)), pVar.c(pVar.x(iVar)));
    }

    private final boolean p(se.p pVar, se.k kVar, se.k kVar2) {
        se.k kVar3;
        se.k kVar4;
        se.e C = pVar.C(kVar);
        if (C == null || (kVar3 = pVar.A0(C)) == null) {
            kVar3 = kVar;
        }
        se.e C2 = pVar.C(kVar2);
        if (C2 == null || (kVar4 = pVar.A0(C2)) == null) {
            kVar4 = kVar2;
        }
        if (pVar.c(kVar3) != pVar.c(kVar4)) {
            return false;
        }
        if (!pVar.Q(kVar) && pVar.Q(kVar2)) {
            return false;
        }
        return !pVar.l(kVar) || pVar.l(kVar2);
    }

    public static /* synthetic */ boolean t(f fVar, d1 d1Var, se.i iVar, se.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return fVar.s(d1Var, iVar, iVar2, z10);
    }

    private final boolean u(d1 d1Var, se.k kVar, se.k kVar2) {
        int s10;
        Object V;
        int s11;
        se.i q10;
        se.p j10 = d1Var.j();
        if (f17954b) {
            if (!j10.a(kVar) && !j10.k(j10.c(kVar))) {
                d1Var.l(kVar);
            }
            if (!j10.a(kVar2)) {
                d1Var.l(kVar2);
            }
        }
        boolean z10 = false;
        if (!c.f17919a.d(d1Var, kVar, kVar2)) {
            return false;
        }
        f fVar = f17953a;
        Boolean a10 = fVar.a(d1Var, j10.x0(kVar), j10.x(kVar2));
        if (a10 != null) {
            boolean booleanValue = a10.booleanValue();
            d1.d(d1Var, kVar, kVar2, false, 4, null);
            return booleanValue;
        }
        se.n c10 = j10.c(kVar2);
        boolean z11 = true;
        if ((j10.F(j10.c(kVar), c10) && j10.K(c10) == 0) || j10.E0(j10.c(kVar2))) {
            return true;
        }
        List<se.k> l10 = fVar.l(d1Var, kVar, c10);
        int i10 = 10;
        s10 = ub.v.s(l10, 10);
        ArrayList<se.k> arrayList = new ArrayList(s10);
        for (se.k kVar3 : l10) {
            se.k d10 = j10.d(d1Var.o(kVar3));
            if (d10 != null) {
                kVar3 = d10;
            }
            arrayList.add(kVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f17953a.n(d1Var, kVar);
        }
        if (size == 1) {
            f fVar2 = f17953a;
            V = ub.c0.V(arrayList);
            return fVar2.q(d1Var, j10.u0((se.k) V), kVar2);
        }
        se.a aVar = new se.a(j10.K(c10));
        int K = j10.K(c10);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < K) {
            z12 = (z12 || j10.o(j10.J(c10, i11)) != se.u.OUT) ? z11 : z10;
            if (!z12) {
                s11 = ub.v.s(arrayList, i10);
                List<? extends se.i> arrayList2 = new ArrayList<>(s11);
                for (se.k kVar4 : arrayList) {
                    se.m H = j10.H(kVar4, i11);
                    if (H != null) {
                        if (!(j10.I(H) == se.u.INV)) {
                            H = null;
                        }
                        if (H != null && (q10 = j10.q(H)) != null) {
                            arrayList2.add(q10);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + kVar4 + ", subType: " + kVar + ", superType: " + kVar2).toString());
                }
                aVar.add(j10.B0(j10.p0(arrayList2)));
            }
            i11++;
            z10 = false;
            z11 = true;
            i10 = 10;
        }
        if (!z12 && f17953a.q(d1Var, aVar, kVar2)) {
            return true;
        }
        return d1Var.q(new b(arrayList, d1Var, j10, kVar2));
    }

    private final boolean v(se.p pVar, se.i iVar, se.i iVar2, se.n nVar) {
        se.o L;
        se.k d10 = pVar.d(iVar);
        if (d10 instanceof se.d) {
            se.d dVar = (se.d) d10;
            if (pVar.y(dVar) || !pVar.i(pVar.s(pVar.d0(dVar))) || pVar.j0(dVar) != se.b.FOR_SUBTYPING) {
                return false;
            }
            se.n D0 = pVar.D0(iVar2);
            se.t tVar = D0 instanceof se.t ? (se.t) D0 : null;
            return (tVar == null || (L = pVar.L(tVar)) == null || !pVar.S(L, nVar)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<se.k> w(d1 d1Var, List<? extends se.k> list) {
        se.p j10 = d1Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            se.l u02 = j10.u0((se.k) next);
            int z11 = j10.z(u02);
            int i10 = 0;
            while (true) {
                if (i10 >= z11) {
                    break;
                }
                if (!(j10.q0(j10.q(j10.b0(u02, i10))) == null)) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    public final se.u j(se.u uVar, se.u uVar2) {
        hc.t.e(uVar, "declared");
        hc.t.e(uVar2, "useSite");
        se.u uVar3 = se.u.INV;
        if (uVar == uVar3) {
            return uVar2;
        }
        if (uVar2 != uVar3 && uVar != uVar2) {
            return null;
        }
        return uVar;
    }

    public final boolean k(d1 d1Var, se.i iVar, se.i iVar2) {
        hc.t.e(d1Var, "state");
        hc.t.e(iVar, "a");
        hc.t.e(iVar2, "b");
        se.p j10 = d1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        f fVar = f17953a;
        if (fVar.o(j10, iVar) && fVar.o(j10, iVar2)) {
            se.i o10 = d1Var.o(d1Var.p(iVar));
            se.i o11 = d1Var.o(d1Var.p(iVar2));
            se.k x02 = j10.x0(o10);
            if (!j10.F(j10.D0(o10), j10.D0(o11))) {
                return false;
            }
            if (j10.t0(x02) == 0) {
                return j10.f0(o10) || j10.f0(o11) || j10.l(x02) == j10.l(j10.x0(o11));
            }
        }
        return t(fVar, d1Var, iVar, iVar2, false, 8, null) && t(fVar, d1Var, iVar2, iVar, false, 8, null);
    }

    public final List<se.k> l(d1 d1Var, se.k kVar, se.n nVar) {
        String e02;
        d1.c cVar;
        hc.t.e(d1Var, "state");
        hc.t.e(kVar, "subType");
        hc.t.e(nVar, "superConstructor");
        se.p j10 = d1Var.j();
        if (j10.h0(kVar)) {
            return f17953a.h(d1Var, kVar, nVar);
        }
        if (!j10.A(nVar) && !j10.e0(nVar)) {
            return f17953a.g(d1Var, kVar, nVar);
        }
        ye.e<se.k> eVar = new ye.e();
        d1Var.k();
        ArrayDeque<se.k> h10 = d1Var.h();
        hc.t.b(h10);
        Set<se.k> i10 = d1Var.i();
        hc.t.b(i10);
        h10.push(kVar);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(kVar);
                sb2.append(". Supertypes = ");
                e02 = ub.c0.e0(i10, null, null, null, 0, null, null, 63, null);
                sb2.append(e02);
                throw new IllegalStateException(sb2.toString().toString());
            }
            se.k pop = h10.pop();
            hc.t.d(pop, "current");
            if (i10.add(pop)) {
                if (j10.h0(pop)) {
                    eVar.add(pop);
                    cVar = d1.c.C0280c.f17947a;
                } else {
                    cVar = d1.c.b.f17946a;
                }
                if (!(!hc.t.a(cVar, d1.c.C0280c.f17947a))) {
                    cVar = null;
                }
                if (cVar != null) {
                    se.p j11 = d1Var.j();
                    for (se.i iVar : j11.m0(j11.c(pop))) {
                        h10.add(cVar.a(d1Var, iVar));
                    }
                }
            }
        }
        d1Var.e();
        ArrayList arrayList = new ArrayList();
        for (se.k kVar2 : eVar) {
            f fVar = f17953a;
            hc.t.d(kVar2, "it");
            ub.z.x(arrayList, fVar.h(d1Var, kVar2, nVar));
        }
        return arrayList;
    }

    public final boolean q(d1 d1Var, se.l lVar, se.k kVar) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        Object obj;
        int i13;
        boolean z11;
        se.i iVar;
        d1 d1Var2;
        f fVar;
        hc.t.e(d1Var, "<this>");
        hc.t.e(lVar, "capturedSubArguments");
        hc.t.e(kVar, "superType");
        se.p j10 = d1Var.j();
        se.n c10 = j10.c(kVar);
        int z12 = j10.z(lVar);
        int K = j10.K(c10);
        if (z12 == K && z12 == j10.t0(kVar)) {
            for (int i14 = 0; i14 < K; i14++) {
                se.m X = j10.X(kVar, i14);
                if (!j10.i(X)) {
                    se.i q10 = j10.q(X);
                    se.m b02 = j10.b0(lVar, i14);
                    j10.I(b02);
                    se.u uVar = se.u.INV;
                    se.i q11 = j10.q(b02);
                    f fVar2 = f17953a;
                    se.u j11 = fVar2.j(j10.o(j10.J(c10, i14)), j10.I(X));
                    if (j11 == null) {
                        return d1Var.m();
                    }
                    if (j11 == uVar && (fVar2.v(j10, q11, q10, c10) || fVar2.v(j10, q10, q11, c10))) {
                        continue;
                    } else {
                        i10 = d1Var.f17937g;
                        if (i10 > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + q11).toString());
                        }
                        i11 = d1Var.f17937g;
                        d1Var.f17937g = i11 + 1;
                        int i15 = a.f17955a[j11.ordinal()];
                        if (i15 != 1) {
                            if (i15 == 2) {
                                z11 = false;
                                i13 = 8;
                                obj = null;
                                fVar = fVar2;
                                d1Var2 = d1Var;
                                iVar = q11;
                            } else if (i15 != 3) {
                                throw new tb.p();
                            } else {
                                z11 = false;
                                i13 = 8;
                                obj = null;
                                fVar = fVar2;
                                d1Var2 = d1Var;
                                iVar = q10;
                                q10 = q11;
                            }
                            z10 = t(fVar, d1Var2, iVar, q10, z11, i13, obj);
                        } else {
                            z10 = fVar2.k(d1Var, q11, q10);
                        }
                        i12 = d1Var.f17937g;
                        d1Var.f17937g = i12 - 1;
                        if (!z10) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean r(d1 d1Var, se.i iVar, se.i iVar2) {
        hc.t.e(d1Var, "state");
        hc.t.e(iVar, "subType");
        hc.t.e(iVar2, "superType");
        return t(this, d1Var, iVar, iVar2, false, 8, null);
    }

    public final boolean s(d1 d1Var, se.i iVar, se.i iVar2, boolean z10) {
        hc.t.e(d1Var, "state");
        hc.t.e(iVar, "subType");
        hc.t.e(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (d1Var.f(iVar, iVar2)) {
            return i(d1Var, iVar, iVar2, z10);
        }
        return false;
    }
}
