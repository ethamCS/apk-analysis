package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m0.e;
import n0.b;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private m0.f f16767a;

    /* renamed from: d */
    private m0.f f16770d;

    /* renamed from: b */
    private boolean f16768b = true;

    /* renamed from: c */
    private boolean f16769c = true;

    /* renamed from: e */
    private ArrayList<p> f16771e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<m> f16772f = new ArrayList<>();

    /* renamed from: g */
    private b.AbstractC0254b f16773g = null;

    /* renamed from: h */
    private b.a f16774h = new b.a();

    /* renamed from: i */
    ArrayList<m> f16775i = new ArrayList<>();

    public e(m0.f fVar) {
        this.f16767a = fVar;
        this.f16770d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f16779d;
        if (pVar.f16827c == null) {
            m0.f fVar3 = this.f16767a;
            if (pVar == fVar3.f16177e || pVar == fVar3.f16179f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f16827c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f16832h.f16786k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f16833i.f16786k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f16807k.f16786k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f16832h.f16787l) {
                if (fVar4 == fVar2) {
                    mVar.f16801b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f16833i.f16787l) {
                if (fVar5 == fVar2) {
                    mVar.f16801b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 != 1 || !(pVar instanceof n)) {
                return;
            }
            for (f fVar6 : ((n) pVar).f16807k.f16787l) {
                a(fVar6, i10, 2, fVar2, arrayList, mVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r2.f16215x == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(m0.f r17) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.e.b(m0.f):boolean");
    }

    private int e(m0.f fVar, int i10) {
        int size = this.f16775i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f16775i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f16832h.f16786k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f16833i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f16832h, i10, 0, pVar.f16833i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f16833i.f16786k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f16832h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f16833i, i10, 1, pVar.f16832h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f16807k.f16786k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(m0.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f16774h;
        aVar.f16755a = bVar;
        aVar.f16756b = bVar2;
        aVar.f16757c = i10;
        aVar.f16758d = i11;
        this.f16773g.a(eVar, aVar);
        eVar.h1(this.f16774h.f16759e);
        eVar.I0(this.f16774h.f16760f);
        eVar.H0(this.f16774h.f16762h);
        eVar.x0(this.f16774h.f16761g);
    }

    public void c() {
        d(this.f16771e);
        this.f16775i.clear();
        m.f16799h = 0;
        i(this.f16767a.f16177e, 0, this.f16775i);
        i(this.f16767a.f16179f, 1, this.f16775i);
        this.f16768b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f16770d.f16177e.f();
        this.f16770d.f16179f.f();
        arrayList.add(this.f16770d.f16177e);
        arrayList.add(this.f16770d.f16179f);
        Iterator<m0.e> it = this.f16770d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            m0.e next = it.next();
            if (next instanceof m0.g) {
                jVar = new j(next);
            } else {
                if (next.g0()) {
                    if (next.f16173c == null) {
                        next.f16173c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f16173c);
                } else {
                    arrayList.add(next.f16177e);
                }
                if (next.i0()) {
                    if (next.f16175d == null) {
                        next.f16175d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f16175d);
                } else {
                    arrayList.add(next.f16179f);
                }
                if (next instanceof m0.i) {
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
            if (next2.f16826b != this.f16770d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f16768b || this.f16769c) {
            Iterator<m0.e> it = this.f16767a.L0.iterator();
            while (it.hasNext()) {
                m0.e next = it.next();
                next.l();
                next.f16169a = false;
                next.f16177e.r();
                next.f16179f.q();
            }
            this.f16767a.l();
            m0.f fVar = this.f16767a;
            fVar.f16169a = false;
            fVar.f16177e.r();
            this.f16767a.f16179f.q();
            this.f16769c = false;
        }
        if (b(this.f16770d)) {
            return false;
        }
        this.f16767a.j1(0);
        this.f16767a.k1(0);
        e.b s10 = this.f16767a.s(0);
        e.b s11 = this.f16767a.s(1);
        if (this.f16768b) {
            c();
        }
        int V = this.f16767a.V();
        int W = this.f16767a.W();
        this.f16767a.f16177e.f16832h.d(V);
        this.f16767a.f16179f.f16832h.d(W);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f16771e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f16767a.M0(e.b.FIXED);
                m0.f fVar2 = this.f16767a;
                fVar2.h1(e(fVar2, 0));
                m0.f fVar3 = this.f16767a;
                fVar3.f16177e.f16829e.d(fVar3.U());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f16767a.d1(e.b.FIXED);
                m0.f fVar4 = this.f16767a;
                fVar4.I0(e(fVar4, 1));
                m0.f fVar5 = this.f16767a;
                fVar5.f16179f.f16829e.d(fVar5.v());
            }
        }
        m0.f fVar6 = this.f16767a;
        e.b[] bVarArr = fVar6.Z;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int U = fVar6.U() + V;
            this.f16767a.f16177e.f16833i.d(U);
            this.f16767a.f16177e.f16829e.d(U - V);
            m();
            m0.f fVar7 = this.f16767a;
            e.b[] bVarArr2 = fVar7.Z;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + W;
                this.f16767a.f16179f.f16833i.d(v10);
                this.f16767a.f16179f.f16829e.d(v10 - W);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f16771e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f16826b != this.f16767a || next2.f16831g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f16771e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z11 || next3.f16826b != this.f16767a) {
                if (!next3.f16832h.f16785j || ((!next3.f16833i.f16785j && !(next3 instanceof j)) || (!next3.f16829e.f16785j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f16767a.M0(s10);
        this.f16767a.d1(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f16768b) {
            Iterator<m0.e> it = this.f16767a.L0.iterator();
            while (it.hasNext()) {
                m0.e next = it.next();
                next.l();
                next.f16169a = false;
                l lVar = next.f16177e;
                lVar.f16829e.f16785j = false;
                lVar.f16831g = false;
                lVar.r();
                n nVar = next.f16179f;
                nVar.f16829e.f16785j = false;
                nVar.f16831g = false;
                nVar.q();
            }
            this.f16767a.l();
            m0.f fVar = this.f16767a;
            fVar.f16169a = false;
            l lVar2 = fVar.f16177e;
            lVar2.f16829e.f16785j = false;
            lVar2.f16831g = false;
            lVar2.r();
            n nVar2 = this.f16767a.f16179f;
            nVar2.f16829e.f16785j = false;
            nVar2.f16831g = false;
            nVar2.q();
            c();
        }
        if (b(this.f16770d)) {
            return false;
        }
        this.f16767a.j1(0);
        this.f16767a.k1(0);
        this.f16767a.f16177e.f16832h.d(0);
        this.f16767a.f16179f.f16832h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        int i11;
        g gVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f16767a.s(0);
        e.b s11 = this.f16767a.s(1);
        int V = this.f16767a.V();
        int W = this.f16767a.W();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<p> it = this.f16771e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f16830f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f16767a.M0(e.b.FIXED);
                    m0.f fVar = this.f16767a;
                    fVar.h1(e(fVar, 0));
                    m0.f fVar2 = this.f16767a;
                    gVar = fVar2.f16177e.f16829e;
                    i11 = fVar2.U();
                    gVar.d(i11);
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f16767a.d1(e.b.FIXED);
                m0.f fVar3 = this.f16767a;
                fVar3.I0(e(fVar3, 1));
                m0.f fVar4 = this.f16767a;
                gVar = fVar4.f16179f.f16829e;
                i11 = fVar4.v();
                gVar.d(i11);
            }
        }
        m0.f fVar5 = this.f16767a;
        if (i10 == 0) {
            e.b[] bVarArr = fVar5.Z;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int U = fVar5.U() + V;
                this.f16767a.f16177e.f16833i.d(U);
                this.f16767a.f16177e.f16829e.d(U - V);
                z11 = true;
            }
            z11 = false;
        } else {
            e.b[] bVarArr2 = fVar5.Z;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar5.v() + W;
                this.f16767a.f16179f.f16833i.d(v10);
                this.f16767a.f16179f.f16829e.d(v10 - W);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f16771e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f16830f == i10 && (next2.f16826b != this.f16767a || next2.f16831g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f16771e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f16830f == i10 && (z11 || next3.f16826b != this.f16767a)) {
                if (!next3.f16832h.f16785j || !next3.f16833i.f16785j || (!(next3 instanceof c) && !next3.f16829e.f16785j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f16767a.M0(s10);
        this.f16767a.d1(s11);
        return z12;
    }

    public void j() {
        this.f16768b = true;
    }

    public void k() {
        this.f16769c = true;
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
            m0.f r0 = r12.f16767a
            java.util.ArrayList<m0.e> r0 = r0.L0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            m0.e r1 = (m0.e) r1
            boolean r2 = r1.f16169a
            if (r2 == 0) goto L19
            goto L8
        L19:
            m0.e$b[] r2 = r1.Z
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f16213w
            int r4 = r1.f16215x
            m0.e$b r6 = m0.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            m0.e$b r5 = m0.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            if (r10 == r6) goto L3b
            m0.e$b r5 = m0.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            n0.l r4 = r1.f16177e
            n0.g r4 = r4.f16829e
            boolean r5 = r4.f16785j
            n0.n r7 = r1.f16179f
            n0.g r7 = r7.f16829e
            boolean r11 = r7.f16785j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            m0.e$b r6 = m0.e.b.FIXED
            int r5 = r4.f16782g
            int r7 = r7.f16782g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f16169a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            m0.e$b r5 = m0.e.b.FIXED
            int r8 = r4.f16782g
            int r7 = r7.f16782g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            m0.e$b r2 = m0.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            n0.n r2 = r1.f16179f
            n0.g r2 = r2.f16829e
            int r3 = r1.v()
        L78:
            r2.f16793m = r3
            goto Lae
        L7b:
            n0.n r2 = r1.f16179f
            n0.g r2 = r2.f16829e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f16782g
            m0.e$b r10 = m0.e.b.FIXED
            int r7 = r7.f16782g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            m0.e$b r2 = m0.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            n0.l r2 = r1.f16177e
            n0.g r2 = r2.f16829e
            int r3 = r1.U()
            goto L78
        La5:
            n0.l r2 = r1.f16177e
            n0.g r2 = r2.f16829e
            int r3 = r1.U()
            goto L83
        Lae:
            boolean r2 = r1.f16169a
            if (r2 == 0) goto L8
            n0.n r2 = r1.f16179f
            n0.g r2 = r2.f16808l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.e.m():void");
    }

    public void n(b.AbstractC0254b abstractC0254b) {
        this.f16773g = abstractC0254b;
    }
}
