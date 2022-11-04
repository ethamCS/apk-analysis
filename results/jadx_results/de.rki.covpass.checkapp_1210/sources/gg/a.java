package gg;
/* loaded from: classes3.dex */
public abstract class a extends a0 implements t2 {

    /* renamed from: c */
    final j0 f10782c;

    public a(j0 j0Var) {
        C(j0Var.P());
        this.f10782c = j0Var;
    }

    private static int C(int i10) {
        if (64 == i10) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public j0 D() {
        return this.f10782c;
    }

    @Override // gg.t2
    public final a0 e() {
        return this;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return this.f10782c.hashCode();
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        j0 j0Var;
        if (a0Var instanceof a) {
            j0Var = ((a) a0Var).f10782c;
        } else if (!(a0Var instanceof j0)) {
            return false;
        } else {
            j0Var = (j0) a0Var;
        }
        return this.f10782c.s(j0Var);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        this.f10782c.m(yVar, z10);
    }

    @Override // gg.a0
    public boolean n() {
        return this.f10782c.n();
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return this.f10782c.q(z10);
    }

    @Override // gg.a0
    public a0 w() {
        return new i1((j0) this.f10782c.w());
    }

    @Override // gg.a0
    public a0 z() {
        return new f2((j0) this.f10782c.z());
    }
}
