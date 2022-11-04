package rk;
/* loaded from: classes3.dex */
public class d extends c {
    public d(int i10, int i11) {
        pk.d.k(i10, i11);
        this.f21268d = i10;
        this.f21269q = i11;
        this.f21267c = new float[i10 * i11 * 2];
    }

    public d(d dVar) {
        this(dVar.f21268d, dVar.f21269q);
        f(dVar);
    }

    @Override // rk.b
    public void P(int i10, int i11, e eVar) {
        int i12 = (i10 * this.f21269q * 2) + (i11 * 2);
        float[] fArr = this.f21267c;
        eVar.f21270a = fArr[i12];
        eVar.f21271b = fArr[i12 + 1];
    }

    @Override // rk.b
    public void R(int i10, int i11, float f10, float f11) {
        int i12 = (i10 * this.f21269q * 2) + (i11 * 2);
        float[] fArr = this.f21267c;
        fArr[i12] = f10;
        fArr[i12 + 1] = f11;
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        pk.d.k(i10, i11);
        int i12 = i10 * i11 * 2;
        if (i12 > this.f21267c.length) {
            this.f21267c = new float[i12];
        }
        this.f21268d = i10;
        this.f21269q = i11;
    }

    /* renamed from: b */
    public d a() {
        return new d(this);
    }

    /* renamed from: c */
    public d T(int i10, int i11) {
        return new d(i10, i11);
    }

    public int e() {
        return this.f21269q * 2;
    }

    public void f(d dVar) {
        U(dVar.f21268d, dVar.f21269q);
        int i10 = this.f21269q * 2;
        for (int i11 = 0; i11 < this.f21268d; i11++) {
            int i12 = this.f21269q * i11 * 2;
            System.arraycopy(dVar.f21267c, i12, this.f21267c, i12, i10);
        }
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.CDRM;
    }

    @Override // rk.b
    public float m(int i10, int i11) {
        return this.f21267c[(((i10 * this.f21269q) + i11) * 2) + 1];
    }

    @Override // rk.b
    public float o(int i10, int i11) {
        return this.f21267c[((i10 * this.f21269q) + i11) * 2];
    }

    @Override // rk.b
    public int q() {
        return this.f21268d * this.f21269q * 2;
    }
}
