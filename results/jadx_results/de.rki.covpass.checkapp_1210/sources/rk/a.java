package rk;
/* loaded from: classes3.dex */
public class a implements f0 {

    /* renamed from: c */
    public boolean[] f21257c;

    /* renamed from: d */
    public int f21258d;

    /* renamed from: q */
    public int f21259q;

    public a(int i10, int i11) {
        this.f21257c = new boolean[i10 * i11];
        this.f21258d = i10;
        this.f21259q = i11;
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        int i12 = i10 * i11;
        if (this.f21257c.length < i12) {
            this.f21257c = new boolean[i12];
        }
        this.f21258d = i10;
        this.f21259q = i11;
    }

    @Override // rk.c0
    public int Z() {
        return this.f21258d;
    }

    @Override // rk.c0
    public <T extends c0> T a() {
        a aVar = new a(this.f21258d, this.f21259q);
        aVar.h(this);
        return aVar;
    }

    /* renamed from: b */
    public a T(int i10, int i11) {
        return new a(i10, i11);
    }

    public boolean c(int i10, int i11) {
        if (f(i10, i11)) {
            return this.f21257c[(i10 * this.f21259q) + i11];
        }
        throw new IllegalArgumentException("Out of matrix bounds. " + i10 + " " + i11);
    }

    public int e() {
        return this.f21258d * this.f21259q;
    }

    public boolean f(int i10, int i11) {
        return i11 >= 0 && i11 < this.f21259q && i10 >= 0 && i10 < this.f21258d;
    }

    public void g(int i10, int i11, boolean z10) {
        if (f(i10, i11)) {
            this.f21257c[(i10 * this.f21259q) + i11] = z10;
            return;
        }
        throw new IllegalArgumentException("Out of matrix bounds. " + i10 + " " + i11);
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.UNSPECIFIED;
    }

    public void h(c0 c0Var) {
        a aVar = (a) c0Var;
        U(c0Var.Z(), c0Var.w());
        System.arraycopy(aVar.f21257c, 0, this.f21257c, 0, aVar.e());
    }

    @Override // rk.c0
    public int w() {
        return this.f21259q;
    }
}
