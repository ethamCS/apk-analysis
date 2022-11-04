package rk;
/* loaded from: classes3.dex */
public abstract class w implements f0, v {

    /* renamed from: c */
    public float[] f21317c = pk.d.f19278q;

    /* renamed from: d */
    public int f21318d;

    /* renamed from: q */
    public int f21319q;

    @Override // rk.f0
    public void U(int i10, int i11) {
        e(i10, i11, false);
    }

    @Override // rk.c0
    public int Z() {
        return this.f21318d;
    }

    public float b(int i10) {
        return this.f21317c[i10];
    }

    public /* synthetic */ int c() {
        return s.a(this);
    }

    public abstract void e(int i10, int i11, boolean z10);

    public float f(int i10, float f10) {
        this.f21317c[i10] = f10;
        return f10;
    }

    @Override // rk.c0
    public int w() {
        return this.f21319q;
    }
}
