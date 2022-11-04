package b.e.b.k;

import b.e.b.k.e;
import b.e.b.k.m.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f extends l {
    public b.e.b.e u0;
    int w0;
    int x0;
    b.e.b.k.m.b q0 = new b.e.b.k.m.b(this);
    public b.e.b.k.m.e r0 = new b.e.b.k.m.e(this);
    protected b.AbstractC0041b s0 = null;
    private boolean t0 = false;
    protected b.e.b.d v0 = new b.e.b.d();
    public int y0 = 0;
    public int z0 = 0;
    c[] A0 = new c[4];
    c[] B0 = new c[4];
    private int C0 = 257;
    private boolean D0 = false;
    private boolean E0 = false;
    private WeakReference<d> F0 = null;
    private WeakReference<d> G0 = null;
    private WeakReference<d> H0 = null;
    private WeakReference<d> I0 = null;
    public b.a J0 = new b.a();

    public static boolean A1(e eVar, b.AbstractC0041b abstractC0041b, b.a aVar, int i) {
        int i2;
        int i3;
        if (abstractC0041b == null) {
            return false;
        }
        aVar.f2279a = eVar.y();
        aVar.f2280b = eVar.O();
        aVar.f2281c = eVar.R();
        aVar.f2282d = eVar.v();
        aVar.i = false;
        aVar.j = i;
        e.b bVar = aVar.f2279a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f2280b == bVar2;
        boolean z3 = z && eVar.U > 0.0f;
        boolean z4 = z2 && eVar.U > 0.0f;
        if (z && eVar.V(0) && eVar.n == 0 && !z3) {
            aVar.f2279a = e.b.WRAP_CONTENT;
            if (z2 && eVar.o == 0) {
                aVar.f2279a = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.V(1) && eVar.o == 0 && !z4) {
            aVar.f2280b = e.b.WRAP_CONTENT;
            if (z && eVar.n == 0) {
                aVar.f2280b = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.e0()) {
            aVar.f2279a = e.b.FIXED;
            z = false;
        }
        if (eVar.f0()) {
            aVar.f2280b = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.p[0] == 4) {
                aVar.f2279a = e.b.FIXED;
            } else if (!z2) {
                e.b bVar3 = aVar.f2280b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i3 = aVar.f2282d;
                } else {
                    aVar.f2279a = e.b.WRAP_CONTENT;
                    abstractC0041b.a(eVar, aVar);
                    i3 = aVar.f2284f;
                }
                aVar.f2279a = bVar4;
                int i4 = eVar.V;
                aVar.f2281c = (int) ((i4 == 0 || i4 == -1) ? eVar.t() * i3 : eVar.t() / i3);
            }
        }
        if (z4) {
            if (eVar.p[1] == 4) {
                aVar.f2280b = e.b.FIXED;
            } else if (!z) {
                e.b bVar5 = aVar.f2279a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i2 = aVar.f2281c;
                } else {
                    aVar.f2280b = e.b.WRAP_CONTENT;
                    abstractC0041b.a(eVar, aVar);
                    i2 = aVar.f2283e;
                }
                aVar.f2280b = bVar6;
                int i5 = eVar.V;
                aVar.f2282d = (int) ((i5 == 0 || i5 == -1) ? i2 / eVar.t() : i2 * eVar.t());
            }
        }
        abstractC0041b.a(eVar, aVar);
        eVar.U0(aVar.f2283e);
        eVar.v0(aVar.f2284f);
        eVar.u0(aVar.f2286h);
        eVar.k0(aVar.f2285g);
        aVar.j = b.a.k;
        return aVar.i;
    }

    private void C1() {
        this.y0 = 0;
        this.z0 = 0;
    }

    private void g1(e eVar) {
        int i = this.y0 + 1;
        c[] cVarArr = this.B0;
        if (i >= cVarArr.length) {
            this.B0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B0[this.y0] = new c(eVar, 0, x1());
        this.y0++;
    }

    private void j1(d dVar, b.e.b.i iVar) {
        this.v0.h(iVar, this.v0.q(dVar), 0, 5);
    }

    private void k1(d dVar, b.e.b.i iVar) {
        this.v0.h(this.v0.q(dVar), iVar, 0, 5);
    }

    private void l1(e eVar) {
        int i = this.z0 + 1;
        c[] cVarArr = this.A0;
        if (i >= cVarArr.length) {
            this.A0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.A0[this.z0] = new c(eVar, 1, x1());
        this.z0++;
    }

    public boolean B1(int i) {
        return (this.C0 & i) == i;
    }

    public void D1(b.AbstractC0041b abstractC0041b) {
        this.s0 = abstractC0041b;
        this.r0.n(abstractC0041b);
    }

    public void E1(int i) {
        this.C0 = i;
        b.e.b.d.r = B1(512);
    }

    public void F1(boolean z) {
        this.t0 = z;
    }

    public void G1(b.e.b.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean B1 = B1(64);
        Z0(dVar, B1);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            this.p0.get(i).Z0(dVar, B1);
        }
    }

    public void H1() {
        this.q0.e(this);
    }

    @Override // b.e.b.k.e
    public void Y0(boolean z, boolean z2) {
        super.Y0(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            this.p0.get(i).Y0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // b.e.b.k.l
    public void b1() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        ?? r6;
        boolean z3;
        e.b bVar;
        this.W = 0;
        this.X = 0;
        this.D0 = false;
        this.E0 = false;
        int size = this.p0.size();
        int max = Math.max(0, R());
        int max2 = Math.max(0, v());
        e.b[] bVarArr = this.Q;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        b.e.b.e eVar = this.u0;
        if (eVar != null) {
            eVar.z++;
        }
        if (j.b(this.C0, 1)) {
            b.e.b.k.m.h.h(this, r1());
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.p0.get(i3);
                if (eVar2.d0() && !(eVar2 instanceof g) && !(eVar2 instanceof a) && !(eVar2 instanceof k) && !eVar2.c0()) {
                    e.b s = eVar2.s(0);
                    e.b s2 = eVar2.s(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(s == bVar4 && eVar2.n != 1 && s2 == bVar4 && eVar2.o != 1)) {
                        A1(eVar2, this.s0, new b.a(), b.a.k);
                    }
                }
            }
        }
        if (size <= 2 || (!(bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) || !j.b(this.C0, 1024) || !b.e.b.k.m.i.c(this, r1()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (bVar3 == bVar) {
                if (max >= R() || max <= 0) {
                    max = R();
                } else {
                    U0(max);
                    this.D0 = true;
                }
            }
            if (bVar2 == bVar) {
                if (max2 >= v() || max2 <= 0) {
                    max2 = v();
                } else {
                    v0(max2);
                    this.E0 = true;
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z4 = B1(64) || B1(128);
        b.e.b.d dVar = this.v0;
        dVar.f2198h = false;
        dVar.i = false;
        if (this.C0 != 0 && z4) {
            dVar.i = true;
        }
        ArrayList<e> arrayList = this.p0;
        e.b y = y();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z5 = y == bVar5 || O() == bVar5;
        C1();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = this.p0.get(i4);
            if (eVar3 instanceof l) {
                ((l) eVar3).b1();
            }
        }
        boolean B1 = B1(64);
        boolean z6 = z;
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            int i6 = i5 + 1;
            try {
                this.v0.D();
                C1();
                k(this.v0);
                for (int i7 = 0; i7 < size; i7++) {
                    this.p0.get(i7).k(this.v0);
                }
                z7 = f1(this.v0);
                WeakReference<d> weakReference = this.F0;
                if (weakReference != null && weakReference.get() != null) {
                    k1(this.F0.get(), this.v0.q(this.G));
                    this.F0 = null;
                }
                WeakReference<d> weakReference2 = this.H0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    j1(this.H0.get(), this.v0.q(this.I));
                    this.H0 = null;
                }
                WeakReference<d> weakReference3 = this.G0;
                if (weakReference3 != null && weakReference3.get() != null) {
                    k1(this.G0.get(), this.v0.q(this.F));
                    this.G0 = null;
                }
                WeakReference<d> weakReference4 = this.I0;
                if (weakReference4 != null && weakReference4.get() != null) {
                    j1(this.I0.get(), this.v0.q(this.H));
                    this.I0 = null;
                }
                if (z7) {
                    this.v0.z();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
            }
            b.e.b.d dVar2 = this.v0;
            if (z7) {
                G1(dVar2, j.f2275a);
            } else {
                Z0(dVar2, B1);
                for (int i8 = 0; i8 < size; i8++) {
                    this.p0.get(i8).Z0(this.v0, B1);
                }
            }
            if (!z5 || i6 >= 8 || !j.f2275a[2]) {
                z2 = false;
            } else {
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar4 = this.p0.get(i11);
                    i9 = Math.max(i9, eVar4.W + eVar4.R());
                    i10 = Math.max(i10, eVar4.X + eVar4.v());
                }
                int max3 = Math.max(this.Z, i9);
                int max4 = Math.max(this.a0, i10);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || R() >= max3) {
                    z2 = false;
                } else {
                    U0(max3);
                    this.Q[0] = bVar6;
                    z2 = true;
                    z6 = true;
                }
                if (bVar2 == bVar6 && v() < max4) {
                    v0(max4);
                    this.Q[1] = bVar6;
                    z2 = true;
                    z6 = true;
                }
            }
            int max5 = Math.max(this.Z, R());
            if (max5 > R()) {
                U0(max5);
                this.Q[0] = e.b.FIXED;
                z2 = true;
                z6 = true;
            }
            int max6 = Math.max(this.a0, v());
            if (max6 > v()) {
                v0(max6);
                r6 = 1;
                this.Q[1] = e.b.FIXED;
                z2 = true;
                z3 = true;
            } else {
                r6 = 1;
                z3 = z6;
            }
            if (!z3) {
                e.b bVar7 = this.Q[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i2 > 0 && R() > i2) {
                    this.D0 = r6;
                    this.Q[0] = e.b.FIXED;
                    U0(i2);
                    z2 = true;
                    z3 = true;
                }
                e.b[] bVarArr2 = this.Q;
                char c2 = r6 == true ? 1 : 0;
                char c3 = r6 == true ? 1 : 0;
                if (bVarArr2[c2] == bVar8 && i > 0 && v() > i) {
                    this.E0 = r6;
                    this.Q[r6] = e.b.FIXED;
                    v0(i);
                    z6 = true;
                    z7 = true;
                    i5 = i6;
                }
            }
            z7 = z2;
            z6 = z3;
            i5 = i6;
        }
        this.p0 = arrayList;
        if (z6) {
            e.b[] bVarArr3 = this.Q;
            bVarArr3[0] = bVar3;
            bVarArr3[1] = bVar2;
        }
        j0(this.v0.v());
    }

    public void e1(e eVar, int i) {
        if (i == 0) {
            g1(eVar);
        } else if (i != 1) {
        } else {
            l1(eVar);
        }
    }

    public boolean f1(b.e.b.d dVar) {
        boolean B1 = B1(64);
        g(dVar, B1);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.p0.get(i);
            eVar.C0(0, false);
            eVar.C0(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e eVar2 = this.p0.get(i2);
                if (eVar2 instanceof a) {
                    ((a) eVar2).h1();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            e eVar3 = this.p0.get(i3);
            if (eVar3.f()) {
                eVar3.g(dVar, B1);
            }
        }
        if (b.e.b.d.r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar4 = this.p0.get(i4);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                j.a(this, dVar, next);
                next.g(dVar, B1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar5 = this.p0.get(i5);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.Q;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.z0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    eVar5.g(dVar, B1);
                    if (bVar == bVar3) {
                        eVar5.z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, B1);
                    }
                }
            }
        }
        if (this.y0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.z0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    @Override // b.e.b.k.l, b.e.b.k.e
    public void h0() {
        this.v0.D();
        this.w0 = 0;
        this.x0 = 0;
        super.h0();
    }

    public void h1(d dVar) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.I0.get().d()) {
            this.I0 = new WeakReference<>(dVar);
        }
    }

    public void i1(d dVar) {
        WeakReference<d> weakReference = this.G0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.G0.get().d()) {
            this.G0 = new WeakReference<>(dVar);
        }
    }

    public void m1(d dVar) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.H0.get().d()) {
            this.H0 = new WeakReference<>(dVar);
        }
    }

    public void n1(d dVar) {
        WeakReference<d> weakReference = this.F0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.F0.get().d()) {
            this.F0 = new WeakReference<>(dVar);
        }
    }

    public boolean o1(boolean z) {
        return this.r0.f(z);
    }

    public boolean p1(boolean z) {
        return this.r0.g(z);
    }

    public boolean q1(boolean z, int i) {
        return this.r0.h(z, i);
    }

    public b.AbstractC0041b r1() {
        return this.s0;
    }

    public int s1() {
        return this.C0;
    }

    public b.e.b.d t1() {
        return this.v0;
    }

    public void u1() {
        this.r0.j();
    }

    public void v1() {
        this.r0.k();
    }

    public boolean w1() {
        return this.E0;
    }

    public boolean x1() {
        return this.t0;
    }

    public boolean y1() {
        return this.D0;
    }

    public long z1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.w0 = i8;
        this.x0 = i9;
        return this.q0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }
}
