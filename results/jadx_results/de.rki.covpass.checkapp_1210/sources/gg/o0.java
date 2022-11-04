package gg;
/* loaded from: classes3.dex */
public abstract class o0 extends k0 {

    /* renamed from: b */
    final i0 f10868b;

    public o0(Class cls, int i10) {
        super(cls);
        this.f10868b = i0.a(0, i10);
    }

    public final a0 a(a0 a0Var) {
        if (this.f10848a.isInstance(a0Var)) {
            return a0Var;
        }
        throw new IllegalStateException("unexpected object: " + a0Var.getClass().getName());
    }

    public final a0 b(byte[] bArr) {
        return a(a0.u(bArr));
    }

    public a0 c(d0 d0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public a0 d(t1 t1Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public final a0 e(j0 j0Var, boolean z10) {
        if (128 == j0Var.P()) {
            return a(j0Var.J(z10, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}
