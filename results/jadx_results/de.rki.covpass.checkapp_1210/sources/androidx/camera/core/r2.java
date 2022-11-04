package androidx.camera.core;
/* loaded from: classes.dex */
final class r2 extends k0 {

    /* renamed from: q */
    private boolean f2462q = false;

    public r2(n1 n1Var) {
        super(n1Var);
    }

    @Override // androidx.camera.core.k0, androidx.camera.core.n1, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f2462q) {
            this.f2462q = true;
            super.close();
        }
    }
}
