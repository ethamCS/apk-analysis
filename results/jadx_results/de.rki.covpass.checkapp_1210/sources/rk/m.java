package rk;
/* loaded from: classes3.dex */
public class m extends l {

    /* renamed from: x */
    public int f21299x;

    public m() {
    }

    public m(int i10, int i11, int i12) {
        pk.d.j(i10, i11);
        this.f21296c = new double[i10 * i11];
        this.f21299x = i12;
        this.f21297d = i10;
        this.f21298q = i11;
    }

    @Override // rk.k
    public void F(int i10, int i11, double d10) {
        this.f21296c[i(i10, i11)] = d10;
    }

    @Override // rk.k
    public void L(int i10, int i11, double d10) {
        this.f21296c[i(i10, i11)] = d10;
    }

    @Override // rk.c0
    public <T extends c0> T T(int i10, int i11) {
        return new m(i10, i11, this.f21299x);
    }

    @Override // rk.l, rk.c0
    public int Z() {
        return this.f21297d;
    }

    @Override // rk.k
    public double d(int i10, int i11) {
        return this.f21296c[i(i10, i11)];
    }

    @Override // rk.l
    public void e(int i10, int i11, boolean z10) {
        pk.d.j(i10, i11);
        int i12 = i10 * i11;
        double[] dArr = this.f21296c;
        if (i12 <= dArr.length) {
            this.f21297d = i10;
            this.f21298q = i11;
            return;
        }
        double[] dArr2 = new double[i12];
        if (z10) {
            System.arraycopy(dArr, 0, dArr2, 0, c());
        }
        this.f21297d = i10;
        this.f21298q = i11;
        this.f21296c = dArr2;
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.UNSPECIFIED;
    }

    /* renamed from: h */
    public m a() {
        m mVar = new m(this.f21297d, this.f21298q, this.f21299x);
        mVar.j(this);
        return mVar;
    }

    public int i(int i10, int i11) {
        int i12 = this.f21299x;
        int i13 = i10 / i12;
        int i14 = i11 / i12;
        int min = Math.min(this.f21297d - (i13 * i12), i12);
        int i15 = this.f21299x;
        int i16 = this.f21298q;
        int i17 = (i13 * i15 * i16) + (min * i14 * i15);
        int min2 = Math.min(i16 - (i14 * i15), i15);
        int i18 = this.f21299x;
        return i17 + (min2 * (i10 % i18)) + (i11 % i18);
    }

    public void j(m mVar) {
        this.f21299x = mVar.f21299x;
        int i10 = mVar.f21297d;
        this.f21297d = i10;
        int i11 = mVar.f21298q;
        this.f21298q = i11;
        int i12 = i11 * i10;
        if (this.f21296c.length < i12) {
            this.f21296c = new double[i12];
        }
        System.arraycopy(mVar.f21296c, 0, this.f21296c, 0, i12);
    }

    @Override // rk.k
    public double l(int i10, int i11) {
        return this.f21296c[i(i10, i11)];
    }

    @Override // rk.l, rk.c0
    public int w() {
        return this.f21298q;
    }
}
