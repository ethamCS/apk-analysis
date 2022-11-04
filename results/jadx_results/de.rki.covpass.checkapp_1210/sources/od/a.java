package od;

import gd.x;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class a<TAnnotation> {

    /* renamed from: od.a$a */
    /* loaded from: classes.dex */
    public static final class C0276a {

        /* renamed from: a */
        private final se.i f17817a;

        /* renamed from: b */
        private final x f17818b;

        /* renamed from: c */
        private final se.o f17819c;

        public C0276a(se.i iVar, x xVar, se.o oVar) {
            this.f17817a = iVar;
            this.f17818b = xVar;
            this.f17819c = oVar;
        }

        public final x a() {
            return this.f17818b;
        }

        public final se.i b() {
            return this.f17817a;
        }

        public final se.o c() {
            return this.f17819c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<Integer, e> {

        /* renamed from: c */
        final /* synthetic */ q f17820c;

        /* renamed from: d */
        final /* synthetic */ e[] f17821d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, e[] eVarArr) {
            super(1);
            this.f17820c = qVar;
            this.f17821d = eVarArr;
        }

        public final e b(int i10) {
            int E;
            Map<Integer, e> a10;
            e eVar;
            q qVar = this.f17820c;
            if (qVar == null || (a10 = qVar.a()) == null || (eVar = a10.get(Integer.valueOf(i10))) == null) {
                e[] eVarArr = this.f17821d;
                if (i10 >= 0) {
                    E = ub.m.E(eVarArr);
                    if (i10 <= E) {
                        return eVarArr[i10];
                    }
                }
                return e.Companion.a();
            }
            return eVar;
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<TAnnotation, Boolean> {

        /* renamed from: c */
        final /* synthetic */ a<TAnnotation> f17822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<TAnnotation> aVar) {
            super(1);
            this.f17822c = aVar;
        }

        /* renamed from: b */
        public final Boolean invoke(TAnnotation tannotation) {
            t.e(tannotation, "$this$extractNullability");
            return Boolean.valueOf(this.f17822c.r(tannotation));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends v implements gc.l<C0276a, Iterable<? extends C0276a>> {

        /* renamed from: c */
        final /* synthetic */ a<TAnnotation> f17823c;

        /* renamed from: d */
        final /* synthetic */ se.p f17824d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<TAnnotation> aVar, se.p pVar) {
            super(1);
            this.f17823c = aVar;
            this.f17824d = pVar;
        }

        /* renamed from: b */
        public final Iterable<C0276a> invoke(C0276a c0276a) {
            se.n D0;
            List<se.o> R;
            int s10;
            int s11;
            C0276a c0276a2;
            se.g q02;
            t.e(c0276a, "it");
            if (this.f17823c.u()) {
                se.i b10 = c0276a.b();
                if (((b10 == null || (q02 = this.f17824d.q0(b10)) == null) ? null : this.f17824d.v0(q02)) != null) {
                    return null;
                }
            }
            se.i b11 = c0276a.b();
            if (b11 == null || (D0 = this.f17824d.D0(b11)) == null || (R = this.f17824d.R(D0)) == null) {
                return null;
            }
            List<se.m> G = this.f17824d.G(c0276a.b());
            se.p pVar = this.f17824d;
            a<TAnnotation> aVar = this.f17823c;
            Iterator<T> it = R.iterator();
            Iterator<T> it2 = G.iterator();
            s10 = ub.v.s(R, 10);
            s11 = ub.v.s(G, 10);
            ArrayList arrayList = new ArrayList(Math.min(s10, s11));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                se.m mVar = (se.m) it2.next();
                se.o oVar = (se.o) next;
                if (pVar.i(mVar)) {
                    c0276a2 = new C0276a(null, c0276a.a(), oVar);
                } else {
                    se.i q10 = pVar.q(mVar);
                    c0276a2 = new C0276a(q10, aVar.c(q10, c0276a.a()), oVar);
                }
                arrayList.add(c0276a2);
            }
            return arrayList;
        }
    }

    private final i B(i iVar, i iVar2) {
        return iVar == null ? iVar2 : iVar2 == null ? iVar : (!iVar.d() || iVar2.d()) ? (iVar.d() || !iVar2.d()) ? (iVar.c().compareTo(iVar2.c()) >= 0 && iVar.c().compareTo(iVar2.c()) > 0) ? iVar : iVar2 : iVar : iVar2;
    }

    private final List<C0276a> C(se.i iVar) {
        return f(new C0276a(iVar, c(iVar, m()), null), new d(this, v()));
    }

    public final x c(se.i iVar, x xVar) {
        return h().c(xVar, i(iVar));
    }

    private final e d(se.i iVar) {
        h hVar;
        h t10 = t(iVar);
        f fVar = null;
        if (t10 == null) {
            se.i p10 = p(iVar);
            hVar = p10 != null ? t(p10) : null;
        } else {
            hVar = t10;
        }
        se.p v10 = v();
        wc.c cVar = wc.c.f24707a;
        if (cVar.l(s(v10.x0(iVar)))) {
            fVar = f.READ_ONLY;
        } else if (cVar.k(s(v10.x(iVar)))) {
            fVar = f.MUTABLE;
        }
        boolean z10 = false;
        boolean z11 = v().Q(iVar) || A(iVar);
        if (hVar != t10) {
            z10 = true;
        }
        return new e(hVar, fVar, z11, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
        if ((r0 != null && r0.c()) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final od.e e(od.a.C0276a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od.a.e(od.a$a):od.e");
    }

    private final <T> List<T> f(T t10, gc.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        g(t10, arrayList, lVar);
        return arrayList;
    }

    private final <T> void g(T t10, List<T> list, gc.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t10);
        Iterable<? extends T> invoke = lVar.invoke(t10);
        if (invoke != null) {
            for (T t11 : invoke) {
                g(t11, list, lVar);
            }
        }
    }

    private final i j(se.o oVar) {
        boolean z10;
        boolean z11;
        List<se.i> list;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        se.p v10 = v();
        i iVar = null;
        if (!z(oVar)) {
            return null;
        }
        List<se.i> O = v10.O(oVar);
        boolean z16 = O instanceof Collection;
        boolean z17 = false;
        if (!z16 || !O.isEmpty()) {
            for (se.i iVar2 : O) {
                if (!v10.B(iVar2)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return null;
        }
        if (!z16 || !O.isEmpty()) {
            for (se.i iVar3 : O) {
                if (t(iVar3) != null) {
                    z15 = true;
                    continue;
                } else {
                    z15 = false;
                    continue;
                }
                if (z15) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            if (!z16 || !O.isEmpty()) {
                for (se.i iVar4 : O) {
                    if (p(iVar4) != null) {
                        z14 = true;
                        continue;
                    } else {
                        z14 = false;
                        continue;
                    }
                    if (z14) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            if (z13) {
                list = new ArrayList<>();
                for (se.i iVar5 : O) {
                    se.i p10 = p(iVar5);
                    if (p10 != null) {
                        list.add(p10);
                    }
                }
            }
            return iVar;
        }
        list = O;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (se.i iVar6 : list) {
                if (!v10.V(iVar6)) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        h hVar = z12 ? h.NULLABLE : h.NOT_NULL;
        if (list != O) {
            z17 = true;
        }
        iVar = new i(hVar, z17);
        return iVar;
    }

    private final h t(se.i iVar) {
        se.p v10 = v();
        if (v10.l(v10.x0(iVar))) {
            return h.NULLABLE;
        }
        if (v10.l(v10.x(iVar))) {
            return null;
        }
        return h.NOT_NULL;
    }

    public abstract boolean A(se.i iVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r10 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gc.l<java.lang.Integer, od.e> b(se.i r10, java.lang.Iterable<? extends se.i> r11, od.q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            hc.t.e(r10, r0)
            java.lang.String r0 = "overrides"
            hc.t.e(r11, r0)
            java.util.List r0 = r9.C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ub.s.s(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            se.i r3 = (se.i) r3
            java.util.List r3 = r9.C(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L6b
            boolean r2 = r9.x()
            if (r2 == 0) goto L69
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
        L4c:
            r10 = r3
            goto L66
        L4e:
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r11.next()
            se.i r2 = (se.i) r2
            boolean r2 = r9.y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L52
            r10 = r4
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = r3
            goto L6c
        L6b:
            r10 = r4
        L6c:
            if (r10 == 0) goto L70
            r10 = r4
            goto L74
        L70:
            int r10 = r0.size()
        L74:
            od.e[] r11 = new od.e[r10]
            r2 = r3
        L77:
            if (r2 >= r10) goto Ld1
            java.lang.Object r5 = r0.get(r2)
            od.a$a r5 = (od.a.C0276a) r5
            od.e r5 = r9.e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = ub.s.Y(r8, r2)
            od.a$a r8 = (od.a.C0276a) r8
            if (r8 == 0) goto Lab
            se.i r8 = r8.b()
            if (r8 == 0) goto Lab
            od.e r8 = r9.d(r8)
            goto Lac
        Lab:
            r8 = 0
        Lac:
            if (r8 == 0) goto L8c
            r6.add(r8)
            goto L8c
        Lb2:
            if (r2 != 0) goto Lbc
            boolean r7 = r9.x()
            if (r7 == 0) goto Lbc
            r7 = r4
            goto Lbd
        Lbc:
            r7 = r3
        Lbd:
            if (r2 != 0) goto Lc7
            boolean r8 = r9.n()
            if (r8 == 0) goto Lc7
            r8 = r4
            goto Lc8
        Lc7:
            r8 = r3
        Lc8:
            od.e r5 = od.s.a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L77
        Ld1:
            od.a$b r10 = new od.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: od.a.b(se.i, java.lang.Iterable, od.q, boolean):gc.l");
    }

    public abstract gd.a<TAnnotation> h();

    public abstract Iterable<TAnnotation> i(se.i iVar);

    public abstract Iterable<TAnnotation> k();

    public abstract gd.b l();

    public abstract x m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract se.i p(se.i iVar);

    public boolean q() {
        return false;
    }

    public abstract boolean r(TAnnotation tannotation);

    public abstract wd.d s(se.i iVar);

    public abstract boolean u();

    public abstract se.p v();

    public abstract boolean w(se.i iVar);

    public abstract boolean x();

    public abstract boolean y(se.i iVar, se.i iVar2);

    public abstract boolean z(se.o oVar);
}
