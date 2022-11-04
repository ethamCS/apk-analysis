package m0;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m0.e;
import n0.b;
/* loaded from: classes.dex */
public class f extends l {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    n0.b M0 = new n0.b(this);
    public n0.e N0 = new n0.e(this);
    protected b.AbstractC0254b P0 = null;
    private boolean Q0 = false;
    protected j0.d R0 = new j0.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* renamed from: a1 */
    public boolean f16228a1 = false;

    /* renamed from: b1 */
    public boolean f16229b1 = false;

    /* renamed from: c1 */
    public boolean f16230c1 = false;

    /* renamed from: d1 */
    public int f16231d1 = 0;

    /* renamed from: e1 */
    public int f16232e1 = 0;

    /* renamed from: f1 */
    private int f16233f1 = 257;

    /* renamed from: g1 */
    public boolean f16234g1 = false;

    /* renamed from: h1 */
    private boolean f16235h1 = false;

    /* renamed from: i1 */
    private boolean f16236i1 = false;

    /* renamed from: j1 */
    int f16237j1 = 0;

    /* renamed from: k1 */
    private WeakReference<d> f16238k1 = null;

    /* renamed from: l1 */
    private WeakReference<d> f16239l1 = null;

    /* renamed from: m1 */
    private WeakReference<d> f16240m1 = null;

    /* renamed from: n1 */
    private WeakReference<d> f16241n1 = null;

    /* renamed from: o1 */
    HashSet<e> f16242o1 = new HashSet<>();

    /* renamed from: p1 */
    public b.a f16243p1 = new b.a();

    public static boolean O1(int i10, e eVar, b.AbstractC0254b abstractC0254b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (abstractC0254b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f16759e = 0;
            aVar.f16760f = 0;
            return false;
        }
        aVar.f16755a = eVar.y();
        aVar.f16756b = eVar.R();
        aVar.f16757c = eVar.U();
        aVar.f16758d = eVar.v();
        aVar.f16763i = false;
        aVar.f16764j = i11;
        e.b bVar = aVar.f16755a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f16756b == bVar2;
        boolean z12 = z10 && eVar.f16176d0 > 0.0f;
        boolean z13 = z11 && eVar.f16176d0 > 0.0f;
        if (z10 && eVar.Y(0) && eVar.f16213w == 0 && !z12) {
            aVar.f16755a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f16215x == 0) {
                aVar.f16755a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.Y(1) && eVar.f16215x == 0 && !z13) {
            aVar.f16756b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f16213w == 0) {
                aVar.f16756b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.l0()) {
            aVar.f16755a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.m0()) {
            aVar.f16756b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f16217y[0] == 4) {
                aVar.f16755a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f16756b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f16758d;
                } else {
                    aVar.f16755a = e.b.WRAP_CONTENT;
                    abstractC0254b.a(eVar, aVar);
                    i13 = aVar.f16760f;
                }
                aVar.f16755a = bVar4;
                aVar.f16757c = (int) (eVar.t() * i13);
            }
        }
        if (z13) {
            if (eVar.f16217y[1] == 4) {
                aVar.f16756b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f16755a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f16757c;
                } else {
                    aVar.f16756b = e.b.WRAP_CONTENT;
                    abstractC0254b.a(eVar, aVar);
                    i12 = aVar.f16759e;
                }
                aVar.f16756b = bVar6;
                aVar.f16758d = eVar.u() == -1 ? (int) (i12 / eVar.t()) : (int) (eVar.t() * i12);
            }
        }
        abstractC0254b.a(eVar, aVar);
        eVar.h1(aVar.f16759e);
        eVar.I0(aVar.f16760f);
        eVar.H0(aVar.f16762h);
        eVar.x0(aVar.f16761g);
        aVar.f16764j = b.a.f16752k;
        return aVar.f16763i;
    }

    private void Q1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void u1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, L1());
        this.W0++;
    }

    private void x1(d dVar, j0.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void y1(d dVar, j0.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void z1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, L1());
        this.X0++;
    }

    public void A1(d dVar) {
        WeakReference<d> weakReference = this.f16240m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f16240m1.get().d()) {
            this.f16240m1 = new WeakReference<>(dVar);
        }
    }

    public void B1(d dVar) {
        WeakReference<d> weakReference = this.f16238k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f16238k1.get().d()) {
            this.f16238k1 = new WeakReference<>(dVar);
        }
    }

    public boolean C1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean D1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean E1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public b.AbstractC0254b F1() {
        return this.P0;
    }

    public int G1() {
        return this.f16233f1;
    }

    public j0.d H1() {
        return this.R0;
    }

    public void I1() {
        this.N0.j();
    }

    public void J1() {
        this.N0.k();
    }

    public boolean K1() {
        return this.f16236i1;
    }

    public boolean L1() {
        return this.Q0;
    }

    @Override // m0.e
    public void M(StringBuilder sb2) {
        sb2.append(this.f16197o + ":{\n");
        sb2.append("  actualWidth:" + this.f16172b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f16174c0);
        sb2.append("\n");
        Iterator<e> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean M1() {
        return this.f16235h1;
    }

    public long N1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.S0 = i17;
        this.T0 = i18;
        return this.M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean P1(int i10) {
        return (this.f16233f1 & i10) == i10;
    }

    public void R1(b.AbstractC0254b abstractC0254b) {
        this.P0 = abstractC0254b;
        this.N0.n(abstractC0254b);
    }

    public void S1(int i10) {
        this.f16233f1 = i10;
        j0.d.f13871r = P1(512);
    }

    public void T1(int i10) {
        this.O0 = i10;
    }

    public void U1(boolean z10) {
        this.Q0 = z10;
    }

    public boolean V1(j0.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = P1(64);
        n1(dVar, P1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.n1(dVar, P1);
            if (eVar.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void W1() {
        this.M0.e(this);
    }

    @Override // m0.e
    public void m1(boolean z10, boolean z11) {
        super.m1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).m1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0310  */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // m0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f.p1():void");
    }

    @Override // m0.l, m0.e
    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f16234g1 = false;
        super.r0();
    }

    public void s1(e eVar, int i10) {
        if (i10 == 0) {
            u1(eVar);
        } else if (i10 != 1) {
        } else {
            z1(eVar);
        }
    }

    public boolean t1(j0.d dVar) {
        boolean P1 = P1(64);
        g(dVar, P1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).v1();
                }
            }
        }
        this.f16242o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.f16242o1.add(eVar3);
                } else {
                    eVar3.g(dVar, P1);
                }
            }
        }
        while (this.f16242o1.size() > 0) {
            int size2 = this.f16242o1.size();
            Iterator<e> it = this.f16242o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.r1(this.f16242o1)) {
                    kVar.g(dVar, P1);
                    this.f16242o1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f16242o1.size()) {
                Iterator<e> it2 = this.f16242o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, P1);
                }
                this.f16242o1.clear();
            }
        }
        if (j0.d.f13871r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, dVar, next);
                next.g(dVar, P1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = this.L0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.d1(e.b.FIXED);
                    }
                    eVar5.g(dVar, P1);
                    if (bVar == bVar3) {
                        eVar5.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.d1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, P1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.f16241n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f16241n1.get().d()) {
            this.f16241n1 = new WeakReference<>(dVar);
        }
    }

    public void w1(d dVar) {
        WeakReference<d> weakReference = this.f16239l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f16239l1.get().d()) {
            this.f16239l1 = new WeakReference<>(dVar);
        }
    }
}
