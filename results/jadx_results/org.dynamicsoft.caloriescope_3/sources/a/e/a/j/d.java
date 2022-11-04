package a.e.a.j;

import a.e.a.j.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    protected f f121a;

    /* renamed from: b */
    protected f f122b;

    /* renamed from: c */
    protected f f123c;
    protected f d;
    protected f e;
    protected f f;
    protected f g;
    protected ArrayList<f> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public d(f fVar, int i, boolean z) {
        this.m = false;
        this.f121a = fVar;
        this.l = i;
        this.m = z;
    }

    private static boolean a(f fVar, int i) {
        if (fVar.r() != 8 && fVar.C[i] == f.b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i = this.l * 2;
        f fVar = this.f121a;
        boolean z = false;
        f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            f[] fVarArr = fVar.i0;
            int i2 = this.l;
            f fVar3 = null;
            fVarArr[i2] = null;
            fVar.h0[i2] = null;
            if (fVar.r() != 8) {
                if (this.f122b == null) {
                    this.f122b = fVar;
                }
                this.d = fVar;
                f.b[] bVarArr = fVar.C;
                int i3 = this.l;
                if (bVarArr[i3] == f.b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.j++;
                        float[] fArr = fVar.g0;
                        int i4 = this.l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (a(fVar, this.l)) {
                            if (f < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(fVar);
                        }
                        if (this.f == null) {
                            this.f = fVar;
                        }
                        f fVar4 = this.g;
                        if (fVar4 != null) {
                            fVar4.h0[this.l] = fVar;
                        }
                        this.g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.i0[this.l] = fVar;
            }
            e eVar = fVar.A[i + 1].d;
            if (eVar != null) {
                f fVar5 = eVar.f125b;
                e[] eVarArr = fVar5.A;
                if (eVarArr[i].d != null && eVarArr[i].d.f125b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z2 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.f123c = fVar;
        if (this.l != 0 || !this.m) {
            this.e = this.f121a;
        } else {
            this.e = fVar;
        }
        if (this.o && this.n) {
            z = true;
        }
        this.p = z;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
