package rk;
/* loaded from: classes3.dex */
public class i0 extends h0 {
    public i0(int i10, int i11) {
        pk.d.k(i10, i11);
        this.f21289d = i10;
        this.f21290q = i11;
        this.f21288c = new double[i10 * i11 * 2];
    }

    public i0(i0 i0Var) {
        this(i0Var.f21289d, i0Var.f21290q);
        f(i0Var);
    }

    @Override // rk.g0
    public void D(int i10, int i11, double d10, double d11) {
        int i12 = (i10 * this.f21290q * 2) + (i11 * 2);
        double[] dArr = this.f21288c;
        dArr[i12] = d10;
        dArr[i12 + 1] = d11;
    }

    @Override // rk.g0
    public void Q(int i10, int i11, f fVar) {
        int i12 = (i10 * this.f21290q * 2) + (i11 * 2);
        double[] dArr = this.f21288c;
        fVar.f21284a = dArr[i12];
        fVar.f21285b = dArr[i12 + 1];
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        pk.d.k(i10, i11);
        int i12 = i10 * i11 * 2;
        if (i12 > this.f21288c.length) {
            this.f21288c = new double[i12];
        }
        this.f21289d = i10;
        this.f21290q = i11;
    }

    /* renamed from: b */
    public i0 a() {
        return new i0(this);
    }

    /* renamed from: c */
    public i0 T(int i10, int i11) {
        return new i0(i10, i11);
    }

    public int e() {
        return this.f21290q * 2;
    }

    public void f(i0 i0Var) {
        U(i0Var.f21289d, i0Var.f21290q);
        int i10 = this.f21290q * 2;
        for (int i11 = 0; i11 < this.f21289d; i11++) {
            int i12 = this.f21290q * i11 * 2;
            System.arraycopy(i0Var.f21288c, i12, this.f21288c, i12, i10);
        }
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.ZDRM;
    }

    @Override // rk.g0
    public double m(int i10, int i11) {
        return this.f21288c[(((i10 * this.f21290q) + i11) * 2) + 1];
    }

    @Override // rk.g0
    public double o(int i10, int i11) {
        return this.f21288c[((i10 * this.f21290q) + i11) * 2];
    }

    @Override // rk.g0
    public int q() {
        return this.f21289d * this.f21290q * 2;
    }
}
