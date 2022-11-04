package xc;
/* loaded from: classes.dex */
public abstract class r extends u {

    /* renamed from: a */
    private final n1 f25573a;

    public r(n1 n1Var) {
        hc.t.e(n1Var, "delegate");
        this.f25573a = n1Var;
    }

    @Override // xc.u
    public n1 b() {
        return this.f25573a;
    }

    @Override // xc.u
    public String c() {
        return b().b();
    }

    @Override // xc.u
    public u f() {
        u j10 = t.j(b().d());
        hc.t.d(j10, "toDescriptorVisibility(delegate.normalize())");
        return j10;
    }
}
