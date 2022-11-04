package rk;
/* loaded from: classes3.dex */
public class j implements k {
    public double U3;
    public double V3;
    public double W3;
    public double X3;

    /* renamed from: c */
    public double f21291c;

    /* renamed from: d */
    public double f21292d;

    /* renamed from: q */
    public double f21293q;

    /* renamed from: x */
    public double f21294x;

    /* renamed from: y */
    public double f21295y;

    public j() {
    }

    public j(j jVar) {
        this.f21291c = jVar.f21291c;
        this.f21292d = jVar.f21292d;
        this.f21293q = jVar.f21293q;
        this.f21294x = jVar.f21294x;
        this.f21295y = jVar.f21295y;
        this.U3 = jVar.U3;
        this.V3 = jVar.V3;
        this.W3 = jVar.W3;
        this.X3 = jVar.X3;
    }

    @Override // rk.k
    public void F(int i10, int i11, double d10) {
        L(i10, i11, d10);
    }

    @Override // rk.k
    public void L(int i10, int i11, double d10) {
        if (i10 == 0) {
            if (i11 == 0) {
                this.f21291c = d10;
                return;
            } else if (i11 == 1) {
                this.f21292d = d10;
                return;
            } else if (i11 == 2) {
                this.f21293q = d10;
                return;
            }
        } else if (i10 == 1) {
            if (i11 == 0) {
                this.f21294x = d10;
                return;
            } else if (i11 == 1) {
                this.f21295y = d10;
                return;
            } else if (i11 == 2) {
                this.U3 = d10;
                return;
            }
        } else if (i10 == 2) {
            if (i11 == 0) {
                this.V3 = d10;
                return;
            } else if (i11 == 1) {
                this.W3 = d10;
                return;
            } else if (i11 == 2) {
                this.X3 = d10;
                return;
            }
        }
        throw new IllegalArgumentException("Row and/or column out of range. " + i10 + " " + i11);
    }

    @Override // rk.c0
    public int Z() {
        return 3;
    }

    @Override // rk.c0
    public <T extends c0> T a() {
        return new j(this);
    }

    public void b(c0 c0Var) {
        if (c0Var.w() == 3 && c0Var.Z() == 3) {
            k kVar = (k) c0Var;
            this.f21291c = kVar.d(0, 0);
            this.f21292d = kVar.d(0, 1);
            this.f21293q = kVar.d(0, 2);
            this.f21294x = kVar.d(1, 0);
            this.f21295y = kVar.d(1, 1);
            this.U3 = kVar.d(1, 2);
            this.V3 = kVar.d(2, 0);
            this.W3 = kVar.d(2, 1);
            this.X3 = kVar.d(2, 2);
            return;
        }
        throw new IllegalArgumentException("Rows and/or columns do not match");
    }

    @Override // rk.k
    public double d(int i10, int i11) {
        return l(i10, i11);
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.UNSPECIFIED;
    }

    @Override // rk.k
    public double l(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return this.f21291c;
            }
            if (i11 == 1) {
                return this.f21292d;
            }
            if (i11 == 2) {
                return this.f21293q;
            }
        } else if (i10 == 1) {
            if (i11 == 0) {
                return this.f21294x;
            }
            if (i11 == 1) {
                return this.f21295y;
            }
            if (i11 == 2) {
                return this.U3;
            }
        } else if (i10 == 2) {
            if (i11 == 0) {
                return this.V3;
            }
            if (i11 == 1) {
                return this.W3;
            }
            if (i11 == 2) {
                return this.X3;
            }
        }
        throw new IllegalArgumentException("Row and/or column out of range. " + i10 + " " + i11);
    }

    @Override // rk.c0
    public int w() {
        return 3;
    }
}
