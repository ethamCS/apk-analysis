package rk;
/* loaded from: classes3.dex */
public class x extends w {

    /* renamed from: x */
    public int f21320x;

    public x() {
    }

    public x(int i10, int i11, int i12) {
        pk.d.j(i10, i11);
        this.f21317c = new float[i10 * i11];
        this.f21320x = i12;
        this.f21318d = i10;
        this.f21319q = i11;
    }

    @Override // rk.v
    public void K(int i10, int i11, float f10) {
        this.f21317c[h(i10, i11)] = f10;
    }

    @Override // rk.c0
    public <T extends c0> T T(int i10, int i11) {
        return new x(i10, i11, this.f21320x);
    }

    @Override // rk.w, rk.c0
    public int Z() {
        return this.f21318d;
    }

    @Override // rk.v
    public float d(int i10, int i11) {
        return this.f21317c[h(i10, i11)];
    }

    @Override // rk.w
    public void e(int i10, int i11, boolean z10) {
        pk.d.j(i10, i11);
        int i12 = i10 * i11;
        float[] fArr = this.f21317c;
        if (i12 <= fArr.length) {
            this.f21318d = i10;
            this.f21319q = i11;
            return;
        }
        float[] fArr2 = new float[i12];
        if (z10) {
            System.arraycopy(fArr, 0, fArr2, 0, c());
        }
        this.f21318d = i10;
        this.f21319q = i11;
        this.f21317c = fArr2;
    }

    /* renamed from: g */
    public x a() {
        x xVar = new x(this.f21318d, this.f21319q, this.f21320x);
        xVar.i(this);
        return xVar;
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.UNSPECIFIED;
    }

    public int h(int i10, int i11) {
        int i12 = this.f21320x;
        int i13 = i10 / i12;
        int i14 = i11 / i12;
        int min = Math.min(this.f21318d - (i13 * i12), i12);
        int i15 = this.f21320x;
        int i16 = this.f21319q;
        int i17 = (i13 * i15 * i16) + (min * i14 * i15);
        int min2 = Math.min(i16 - (i14 * i15), i15);
        int i18 = this.f21320x;
        return i17 + (min2 * (i10 % i18)) + (i11 % i18);
    }

    public void i(x xVar) {
        this.f21320x = xVar.f21320x;
        int i10 = xVar.f21318d;
        this.f21318d = i10;
        int i11 = xVar.f21319q;
        this.f21319q = i11;
        int i12 = i11 * i10;
        if (this.f21317c.length < i12) {
            this.f21317c = new float[i12];
        }
        System.arraycopy(xVar.f21317c, 0, this.f21317c, 0, i12);
    }

    @Override // rk.v
    public float l(int i10, int i11) {
        return this.f21317c[h(i10, i11)];
    }

    @Override // rk.w, rk.c0
    public int w() {
        return this.f21319q;
    }
}
