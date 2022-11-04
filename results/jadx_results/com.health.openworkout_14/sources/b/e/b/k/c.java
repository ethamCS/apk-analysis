package b.e.b.k;

import b.e.b.k.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    protected e f2235a;

    /* renamed from: b */
    protected e f2236b;

    /* renamed from: c */
    protected e f2237c;

    /* renamed from: d */
    protected e f2238d;

    /* renamed from: e */
    protected e f2239e;

    /* renamed from: f */
    protected e f2240f;

    /* renamed from: g */
    protected e f2241g;

    /* renamed from: h */
    protected ArrayList<e> f2242h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    private int o;
    private boolean p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private boolean t;

    public c(e eVar, int i, boolean z) {
        this.p = false;
        this.f2235a = eVar;
        this.o = i;
        this.p = z;
    }

    private void b() {
        int i = this.o * 2;
        e eVar = this.f2235a;
        boolean z = false;
        e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            e[] eVarArr = eVar.l0;
            int i2 = this.o;
            e eVar3 = null;
            eVarArr[i2] = null;
            eVar.k0[i2] = null;
            if (eVar.Q() != 8) {
                this.l++;
                e.b s = eVar.s(this.o);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.m += eVar.C(this.o);
                }
                int e2 = this.m + eVar.N[i].e();
                this.m = e2;
                int i3 = i + 1;
                this.m = e2 + eVar.N[i3].e();
                int e3 = this.n + eVar.N[i].e();
                this.n = e3;
                this.n = e3 + eVar.N[i3].e();
                if (this.f2236b == null) {
                    this.f2236b = eVar;
                }
                this.f2238d = eVar;
                e.b[] bVarArr = eVar.Q;
                int i4 = this.o;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.p;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = eVar.j0;
                        float f2 = fArr[i4];
                        if (f2 > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (c(eVar, i4)) {
                            if (f2 < 0.0f) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.f2242h == null) {
                                this.f2242h = new ArrayList<>();
                            }
                            this.f2242h.add(eVar);
                        }
                        if (this.f2240f == null) {
                            this.f2240f = eVar;
                        }
                        e eVar4 = this.f2241g;
                        if (eVar4 != null) {
                            eVar4.k0[this.o] = eVar;
                        }
                        this.f2241g = eVar;
                    }
                    if (this.o == 0) {
                        if (eVar.n == 0 && eVar.q == 0) {
                            int i5 = eVar.r;
                        }
                    } else if (eVar.o == 0 && eVar.t == 0) {
                        int i6 = eVar.u;
                    }
                    int i7 = (eVar.U > 0.0f ? 1 : (eVar.U == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.l0[this.o] = eVar;
            }
            d dVar = eVar.N[i + 1].f2248f;
            if (dVar != null) {
                e eVar5 = dVar.f2246d;
                d[] dVarArr = eVar5.N;
                if (dVarArr[i].f2248f != null && dVarArr[i].f2248f.f2246d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f2236b;
        if (eVar6 != null) {
            this.m -= eVar6.N[i].e();
        }
        e eVar7 = this.f2238d;
        if (eVar7 != null) {
            this.m -= eVar7.N[i + 1].e();
        }
        this.f2237c = eVar;
        if (this.o != 0 || !this.p) {
            this.f2239e = this.f2235a;
        } else {
            this.f2239e = eVar;
        }
        if (this.r && this.q) {
            z = true;
        }
        this.s = z;
    }

    private static boolean c(e eVar, int i) {
        if (eVar.Q() != 8 && eVar.Q[i] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.p;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }
}
