package m0;

import java.util.ArrayList;
import m0.e;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    protected e f16132a;

    /* renamed from: b */
    protected e f16133b;

    /* renamed from: c */
    protected e f16134c;

    /* renamed from: d */
    protected e f16135d;

    /* renamed from: e */
    protected e f16136e;

    /* renamed from: f */
    protected e f16137f;

    /* renamed from: g */
    protected e f16138g;

    /* renamed from: h */
    protected ArrayList<e> f16139h;

    /* renamed from: i */
    protected int f16140i;

    /* renamed from: j */
    protected int f16141j;

    /* renamed from: k */
    protected float f16142k = 0.0f;

    /* renamed from: l */
    int f16143l;

    /* renamed from: m */
    int f16144m;

    /* renamed from: n */
    int f16145n;

    /* renamed from: o */
    boolean f16146o;

    /* renamed from: p */
    private int f16147p;

    /* renamed from: q */
    private boolean f16148q;

    /* renamed from: r */
    protected boolean f16149r;

    /* renamed from: s */
    protected boolean f16150s;

    /* renamed from: t */
    protected boolean f16151t;

    /* renamed from: u */
    protected boolean f16152u;

    /* renamed from: v */
    private boolean f16153v;

    public c(e eVar, int i10, boolean z10) {
        this.f16132a = eVar;
        this.f16147p = i10;
        this.f16148q = z10;
    }

    private void b() {
        int i10 = this.f16147p * 2;
        e eVar = this.f16132a;
        boolean z10 = true;
        this.f16146o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f16140i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f16147p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.T() != 8) {
                this.f16143l++;
                e.b s10 = eVar.s(this.f16147p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f16144m += eVar.C(this.f16147p);
                }
                int e10 = this.f16144m + eVar.W[i10].e();
                this.f16144m = e10;
                int i12 = i10 + 1;
                this.f16144m = e10 + eVar.W[i12].e();
                int e11 = this.f16145n + eVar.W[i10].e();
                this.f16145n = e11;
                this.f16145n = e11 + eVar.W[i12].e();
                if (this.f16133b == null) {
                    this.f16133b = eVar;
                }
                this.f16135d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f16147p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f16217y;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f16141j++;
                        float[] fArr = eVar.D0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f16142k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f16149r = true;
                            } else {
                                this.f16150s = true;
                            }
                            if (this.f16139h == null) {
                                this.f16139h = new ArrayList<>();
                            }
                            this.f16139h.add(eVar);
                        }
                        if (this.f16137f == null) {
                            this.f16137f = eVar;
                        }
                        e eVar4 = this.f16138g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f16147p] = eVar;
                        }
                        this.f16138g = eVar;
                    }
                    if (this.f16147p != 0 ? !(eVar.f16215x == 0 && eVar.C == 0 && eVar.D == 0) : !(eVar.f16213w == 0 && eVar.f16219z == 0 && eVar.A == 0)) {
                        this.f16146o = false;
                    }
                    if (eVar.f16176d0 != 0.0f) {
                        this.f16146o = false;
                        this.f16152u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f16147p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f16159f;
            if (dVar != null) {
                e eVar5 = dVar.f16157d;
                d[] dVarArr = eVar5.W;
                if (dVarArr[i10].f16159f != null && dVarArr[i10].f16159f.f16157d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f16133b;
        if (eVar6 != null) {
            this.f16144m -= eVar6.W[i10].e();
        }
        e eVar7 = this.f16135d;
        if (eVar7 != null) {
            this.f16144m -= eVar7.W[i10 + 1].e();
        }
        this.f16134c = eVar;
        if (this.f16147p != 0 || !this.f16148q) {
            this.f16136e = this.f16132a;
        } else {
            this.f16136e = eVar;
        }
        if (!this.f16150s || !this.f16149r) {
            z10 = false;
        }
        this.f16151t = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.T() != 8 && eVar.Z[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f16217y;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f16153v) {
            b();
        }
        this.f16153v = true;
    }
}
