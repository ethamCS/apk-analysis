package b.e.b.k.m;

import b.e.b.k.e;
import b.e.b.k.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private b.e.b.k.f f2287a;

    /* renamed from: d */
    private b.e.b.k.f f2290d;

    /* renamed from: b */
    private boolean f2288b = true;

    /* renamed from: c */
    private boolean f2289c = true;

    /* renamed from: e */
    private ArrayList<p> f2291e = new ArrayList<>();

    /* renamed from: f */
    private b.AbstractC0041b f2292f = null;

    /* renamed from: g */
    private b.a f2293g = new b.a();

    /* renamed from: h */
    ArrayList<m> f2294h = new ArrayList<>();

    public e(b.e.b.k.f fVar) {
        new ArrayList();
        this.f2287a = fVar;
        this.f2290d = fVar;
    }

    private void a(f fVar, int i, int i2, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f2298d;
        if (pVar.f2325c == null) {
            b.e.b.k.f fVar3 = this.f2287a;
            if (pVar == fVar3.f2262d || pVar == fVar3.f2263e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i2);
                arrayList.add(mVar);
            }
            pVar.f2325c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f2330h.k) {
                if (dVar instanceof f) {
                    a((f) dVar, i, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, 1, fVar2, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f2330h.l) {
                if (fVar4 == fVar2) {
                    mVar.f2313a = true;
                }
                a(fVar4, i, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.i.l) {
                if (fVar5 == fVar2) {
                    mVar.f2313a = true;
                }
                a(fVar5, i, 1, fVar2, arrayList, mVar);
            }
            if (i != 1 || !(pVar instanceof n)) {
                return;
            }
            for (f fVar6 : ((n) pVar).k.l) {
                a(fVar6, i, 2, fVar2, arrayList, mVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r2.o == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(b.e.b.k.f r17) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.e.b(b.e.b.k.f):boolean");
    }

    private int e(b.e.b.k.f fVar, int i) {
        int size = this.f2294h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f2294h.get(i2).b(fVar, i));
        }
        return (int) j;
    }

    private void i(p pVar, int i, ArrayList<m> arrayList) {
        for (d dVar : pVar.f2330h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, pVar.i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f2330h, i, 0, pVar.i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, pVar.f2330h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, pVar.f2330h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((n) pVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(b.e.b.k.e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        b.a aVar = this.f2293g;
        aVar.f2279a = bVar;
        aVar.f2280b = bVar2;
        aVar.f2281c = i;
        aVar.f2282d = i2;
        this.f2292f.a(eVar, aVar);
        eVar.U0(this.f2293g.f2283e);
        eVar.v0(this.f2293g.f2284f);
        eVar.u0(this.f2293g.f2286h);
        eVar.k0(this.f2293g.f2285g);
    }

    public void c() {
        d(this.f2291e);
        this.f2294h.clear();
        m.f2312d = 0;
        i(this.f2287a.f2262d, 0, this.f2294h);
        i(this.f2287a.f2263e, 1, this.f2294h);
        this.f2288b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f2290d.f2262d.f();
        this.f2290d.f2263e.f();
        arrayList.add(this.f2290d.f2262d);
        arrayList.add(this.f2290d.f2263e);
        Iterator<b.e.b.k.e> it = this.f2290d.p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            b.e.b.k.e next = it.next();
            if (next instanceof b.e.b.k.g) {
                jVar = new j(next);
            } else {
                if (next.Z()) {
                    if (next.f2260b == null) {
                        next.f2260b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2260b);
                } else {
                    arrayList.add(next.f2262d);
                }
                if (next.b0()) {
                    if (next.f2261c == null) {
                        next.f2261c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2261c);
                } else {
                    arrayList.add(next.f2263e);
                }
                if (next instanceof b.e.b.k.i) {
                    jVar = new k(next);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2324b != this.f2290d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f2288b || this.f2289c) {
            Iterator<b.e.b.k.e> it = this.f2287a.p0.iterator();
            while (it.hasNext()) {
                b.e.b.k.e next = it.next();
                next.l();
                next.f2259a = false;
                next.f2262d.r();
                next.f2263e.q();
            }
            this.f2287a.l();
            b.e.b.k.f fVar = this.f2287a;
            fVar.f2259a = false;
            fVar.f2262d.r();
            this.f2287a.f2263e.q();
            this.f2289c = false;
        }
        if (b(this.f2290d)) {
            return false;
        }
        this.f2287a.V0(0);
        this.f2287a.W0(0);
        e.b s = this.f2287a.s(0);
        e.b s2 = this.f2287a.s(1);
        if (this.f2288b) {
            c();
        }
        int S = this.f2287a.S();
        int T = this.f2287a.T();
        this.f2287a.f2262d.f2330h.d(S);
        this.f2287a.f2263e.f2330h.d(T);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<p> it2 = this.f2291e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == e.b.WRAP_CONTENT) {
                this.f2287a.z0(e.b.FIXED);
                b.e.b.k.f fVar2 = this.f2287a;
                fVar2.U0(e(fVar2, 0));
                b.e.b.k.f fVar3 = this.f2287a;
                fVar3.f2262d.f2327e.d(fVar3.R());
            }
            if (z4 && s2 == e.b.WRAP_CONTENT) {
                this.f2287a.Q0(e.b.FIXED);
                b.e.b.k.f fVar4 = this.f2287a;
                fVar4.v0(e(fVar4, 1));
                b.e.b.k.f fVar5 = this.f2287a;
                fVar5.f2263e.f2327e.d(fVar5.v());
            }
        }
        b.e.b.k.f fVar6 = this.f2287a;
        e.b[] bVarArr = fVar6.Q;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int R = fVar6.R() + S;
            this.f2287a.f2262d.i.d(R);
            this.f2287a.f2262d.f2327e.d(R - S);
            m();
            b.e.b.k.f fVar7 = this.f2287a;
            e.b[] bVarArr2 = fVar7.Q;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v = fVar7.v() + T;
                this.f2287a.f2263e.i.d(v);
                this.f2287a.f2263e.f2327e.d(v - T);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<p> it3 = this.f2291e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2324b != this.f2287a || next2.f2329g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f2291e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z2 || next3.f2324b != this.f2287a) {
                if (!next3.f2330h.j || ((!next3.i.j && !(next3 instanceof j)) || (!next3.f2327e.j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f2287a.z0(s);
        this.f2287a.Q0(s2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f2288b) {
            Iterator<b.e.b.k.e> it = this.f2287a.p0.iterator();
            while (it.hasNext()) {
                b.e.b.k.e next = it.next();
                next.l();
                next.f2259a = false;
                l lVar = next.f2262d;
                lVar.f2327e.j = false;
                lVar.f2329g = false;
                lVar.r();
                n nVar = next.f2263e;
                nVar.f2327e.j = false;
                nVar.f2329g = false;
                nVar.q();
            }
            this.f2287a.l();
            b.e.b.k.f fVar = this.f2287a;
            fVar.f2259a = false;
            l lVar2 = fVar.f2262d;
            lVar2.f2327e.j = false;
            lVar2.f2329g = false;
            lVar2.r();
            n nVar2 = this.f2287a.f2263e;
            nVar2.f2327e.j = false;
            nVar2.f2329g = false;
            nVar2.q();
            c();
        }
        if (b(this.f2290d)) {
            return false;
        }
        this.f2287a.V0(0);
        this.f2287a.W0(0);
        this.f2287a.f2262d.f2330h.d(0);
        this.f2287a.f2263e.f2330h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        e.b bVar;
        int i2;
        g gVar;
        boolean z3 = true;
        boolean z4 = z & true;
        e.b s = this.f2287a.s(0);
        e.b s2 = this.f2287a.s(1);
        int S = this.f2287a.S();
        int T = this.f2287a.T();
        if (z4 && (s == (bVar = e.b.WRAP_CONTENT) || s2 == bVar)) {
            Iterator<p> it = this.f2291e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f2328f == i && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && s == e.b.WRAP_CONTENT) {
                    this.f2287a.z0(e.b.FIXED);
                    b.e.b.k.f fVar = this.f2287a;
                    fVar.U0(e(fVar, 0));
                    b.e.b.k.f fVar2 = this.f2287a;
                    gVar = fVar2.f2262d.f2327e;
                    i2 = fVar2.R();
                    gVar.d(i2);
                }
            } else if (z4 && s2 == e.b.WRAP_CONTENT) {
                this.f2287a.Q0(e.b.FIXED);
                b.e.b.k.f fVar3 = this.f2287a;
                fVar3.v0(e(fVar3, 1));
                b.e.b.k.f fVar4 = this.f2287a;
                gVar = fVar4.f2263e.f2327e;
                i2 = fVar4.v();
                gVar.d(i2);
            }
        }
        b.e.b.k.f fVar5 = this.f2287a;
        if (i == 0) {
            e.b[] bVarArr = fVar5.Q;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int R = fVar5.R() + S;
                this.f2287a.f2262d.i.d(R);
                this.f2287a.f2262d.f2327e.d(R - S);
                z2 = true;
            }
            z2 = false;
        } else {
            e.b[] bVarArr2 = fVar5.Q;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v = fVar5.v() + T;
                this.f2287a.f2263e.i.d(v);
                this.f2287a.f2263e.f2327e.d(v - T);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<p> it2 = this.f2291e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f2328f == i && (next2.f2324b != this.f2287a || next2.f2329g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f2291e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f2328f == i && (z2 || next3.f2324b != this.f2287a)) {
                if (!next3.f2330h.j || !next3.i.j || (!(next3 instanceof c) && !next3.f2327e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f2287a.z0(s);
        this.f2287a.Q0(s2);
        return z3;
    }

    public void j() {
        this.f2288b = true;
    }

    public void k() {
        this.f2289c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r12 = this;
            b.e.b.k.f r0 = r12.f2287a
            java.util.ArrayList<b.e.b.k.e> r0 = r0.p0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            b.e.b.k.e r1 = (b.e.b.k.e) r1
            boolean r2 = r1.f2259a
            if (r2 == 0) goto L19
            goto L8
        L19:
            b.e.b.k.e$b[] r2 = r1.Q
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.n
            int r4 = r1.o
            b.e.b.k.e$b r6 = b.e.b.k.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            b.e.b.k.e$b r5 = b.e.b.k.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            b.e.b.k.e$b r5 = b.e.b.k.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            b.e.b.k.m.l r4 = r1.f2262d
            b.e.b.k.m.g r4 = r4.f2327e
            boolean r5 = r4.j
            b.e.b.k.m.n r7 = r1.f2263e
            b.e.b.k.m.g r7 = r7.f2327e
            boolean r11 = r7.j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            b.e.b.k.e$b r6 = b.e.b.k.e.b.FIXED
            int r5 = r4.f2301g
            int r7 = r7.f2301g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f2259a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            b.e.b.k.e$b r5 = b.e.b.k.e.b.FIXED
            int r8 = r4.f2301g
            int r7 = r7.f2301g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            b.e.b.k.e$b r2 = b.e.b.k.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            b.e.b.k.m.n r2 = r1.f2263e
            b.e.b.k.m.g r2 = r2.f2327e
            int r3 = r1.v()
        L78:
            r2.m = r3
            goto Lae
        L7b:
            b.e.b.k.m.n r2 = r1.f2263e
            b.e.b.k.m.g r2 = r2.f2327e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f2301g
            b.e.b.k.e$b r10 = b.e.b.k.e.b.FIXED
            int r7 = r7.f2301g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            b.e.b.k.e$b r2 = b.e.b.k.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            b.e.b.k.m.l r2 = r1.f2262d
            b.e.b.k.m.g r2 = r2.f2327e
            int r3 = r1.R()
            goto L78
        La5:
            b.e.b.k.m.l r2 = r1.f2262d
            b.e.b.k.m.g r2 = r2.f2327e
            int r3 = r1.R()
            goto L83
        Lae:
            boolean r2 = r1.f2259a
            if (r2 == 0) goto L8
            b.e.b.k.m.n r2 = r1.f2263e
            b.e.b.k.m.g r2 = r2.l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.e.m():void");
    }

    public void n(b.AbstractC0041b abstractC0041b) {
        this.f2292f = abstractC0041b;
    }
}
