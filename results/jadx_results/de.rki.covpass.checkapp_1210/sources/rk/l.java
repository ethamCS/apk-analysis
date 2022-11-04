package rk;
/* loaded from: classes3.dex */
public abstract class l implements f0, k {

    /* renamed from: c */
    public double[] f21296c = pk.d.f19279r;

    /* renamed from: d */
    public int f21297d;

    /* renamed from: q */
    public int f21298q;

    @Override // rk.f0
    public void U(int i10, int i11) {
        e(i10, i11, false);
    }

    @Override // rk.c0
    public int Z() {
        return this.f21297d;
    }

    public double b(int i10) {
        return this.f21296c[i10];
    }

    public /* synthetic */ int c() {
        return h.a(this);
    }

    public abstract void e(int i10, int i11, boolean z10);

    public double f(int i10, double d10) {
        this.f21296c[i10] = d10;
        return d10;
    }

    public void g(l lVar) {
        U(lVar.f21297d, lVar.f21298q);
        System.arraycopy(lVar.f21296c, 0, this.f21296c, 0, lVar.c());
    }

    @Override // rk.c0
    public int w() {
        return this.f21298q;
    }
}
