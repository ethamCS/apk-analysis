package b.e.b.k;

import b.e.b.k.d;
import b.e.b.k.e;
/* loaded from: classes.dex */
public class a extends i {
    private int r0 = 0;
    private boolean s0 = true;
    private int t0 = 0;
    boolean u0 = false;

    public boolean c1() {
        int i;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            e eVar = this.p0[i4];
            if ((this.s0 || eVar.h()) && ((((i2 = this.r0) == 0 || i2 == 1) && !eVar.e0()) || (((i3 = this.r0) == 2 || i3 == 3) && !eVar.f0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.q0; i6++) {
            e eVar2 = this.p0[i6];
            if (this.s0 || eVar2.h()) {
                if (!z2) {
                    int i7 = this.r0;
                    if (i7 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i7 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i7 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i7 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z2 = true;
                    }
                    i5 = eVar2.m(bVar3).d();
                    z2 = true;
                }
                int i8 = this.r0;
                if (i8 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i8 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i8 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i8 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i5 = Math.max(i5, eVar2.m(bVar).d());
                }
                i5 = Math.min(i5, eVar2.m(bVar2).d());
            }
        }
        int i9 = i5 + this.t0;
        int i10 = this.r0;
        if (i10 == 0 || i10 == 1) {
            p0(i9, i9);
        } else {
            s0(i9, i9);
        }
        this.u0 = true;
        return true;
    }

    public boolean d1() {
        return this.s0;
    }

    @Override // b.e.b.k.e
    public boolean e0() {
        return this.u0;
    }

    public int e1() {
        return this.r0;
    }

    @Override // b.e.b.k.e
    public boolean f0() {
        return this.u0;
    }

    public int f1() {
        return this.t0;
    }

    @Override // b.e.b.k.e
    public void g(b.e.b.d dVar, boolean z) {
        Object[] objArr;
        boolean z2;
        b.e.b.i iVar;
        d dVar2;
        int i;
        int i2;
        int i3;
        b.e.b.i iVar2;
        int i4;
        d[] dVarArr = this.N;
        dVarArr[0] = this.F;
        dVarArr[2] = this.G;
        dVarArr[1] = this.H;
        dVarArr[3] = this.I;
        int i5 = 0;
        while (true) {
            objArr = this.N;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].i = dVar.q(objArr[i5]);
            i5++;
        }
        int i6 = this.r0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        d dVar3 = objArr[i6];
        if (!this.u0) {
            c1();
        }
        if (this.u0) {
            this.u0 = false;
            int i7 = this.r0;
            if (i7 == 0 || i7 == 1) {
                dVar.f(this.F.i, this.W);
                iVar2 = this.H.i;
                i4 = this.W;
            } else if (i7 != 2 && i7 != 3) {
                return;
            } else {
                dVar.f(this.G.i, this.X);
                iVar2 = this.I.i;
                i4 = this.X;
            }
            dVar.f(iVar2, i4);
            return;
        }
        for (int i8 = 0; i8 < this.q0; i8++) {
            e eVar = this.p0[i8];
            if ((this.s0 || eVar.h()) && ((((i2 = this.r0) == 0 || i2 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.F.f2248f != null && eVar.H.f2248f != null) || (((i3 = this.r0) == 2 || i3 == 3) && eVar.O() == e.b.MATCH_CONSTRAINT && eVar.G.f2248f != null && eVar.I.f2248f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.F.k() || this.H.k();
        boolean z4 = this.G.k() || this.I.k();
        boolean z5 = !z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
        int i9 = 5;
        if (!z5) {
            i9 = 4;
        }
        for (int i10 = 0; i10 < this.q0; i10++) {
            e eVar2 = this.p0[i10];
            if (this.s0 || eVar2.h()) {
                b.e.b.i q = dVar.q(eVar2.N[this.r0]);
                d[] dVarArr2 = eVar2.N;
                int i11 = this.r0;
                dVarArr2[i11].i = q;
                int i12 = (dVarArr2[i11].f2248f == null || dVarArr2[i11].f2248f.f2246d != this) ? 0 : dVarArr2[i11].f2249g + 0;
                if (i11 == 0 || i11 == 2) {
                    dVar.i(dVar3.i, q, this.t0 - i12, z2);
                } else {
                    dVar.g(dVar3.i, q, this.t0 + i12, z2);
                }
                dVar.e(dVar3.i, q, this.t0 + i12, i9);
            }
        }
        int i13 = this.r0;
        if (i13 == 0) {
            dVar.e(this.H.i, this.F.i, 0, 8);
            dVar.e(this.F.i, this.R.H.i, 0, 4);
            iVar = this.F.i;
            dVar2 = this.R.F;
        } else if (i13 == 1) {
            dVar.e(this.F.i, this.H.i, 0, 8);
            dVar.e(this.F.i, this.R.F.i, 0, 4);
            iVar = this.F.i;
            dVar2 = this.R.H;
        } else if (i13 == 2) {
            dVar.e(this.I.i, this.G.i, 0, 8);
            dVar.e(this.G.i, this.R.I.i, 0, 4);
            iVar = this.G.i;
            dVar2 = this.R.G;
        } else if (i13 != 3) {
            return;
        } else {
            dVar.e(this.G.i, this.I.i, 0, 8);
            dVar.e(this.G.i, this.R.G.i, 0, 4);
            iVar = this.G.i;
            dVar2 = this.R.I;
        }
        dVar.e(iVar, dVar2.i, 0, 0);
    }

    public int g1() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // b.e.b.k.e
    public boolean h() {
        return true;
    }

    public void h1() {
        for (int i = 0; i < this.q0; i++) {
            e eVar = this.p0[i];
            int i2 = this.r0;
            if (i2 == 0 || i2 == 1) {
                eVar.C0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.C0(1, true);
            }
        }
    }

    public void i1(boolean z) {
        this.s0 = z;
    }

    public void j1(int i) {
        this.r0 = i;
    }

    public void k1(int i) {
        this.t0 = i;
    }

    @Override // b.e.b.k.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i = 0; i < this.q0; i++) {
            e eVar = this.p0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
