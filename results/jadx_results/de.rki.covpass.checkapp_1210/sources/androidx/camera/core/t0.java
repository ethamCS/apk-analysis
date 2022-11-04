package androidx.camera.core;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 extends s0 {

    /* loaded from: classes.dex */
    class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ n1 f2495a;

        a(n1 n1Var) {
            t0.this = r1;
            this.f2495a = n1Var;
        }

        @Override // y.c
        public void a(Throwable th2) {
            this.f2495a.close();
        }

        /* renamed from: c */
        public void b(Void r12) {
        }
    }

    @Override // androidx.camera.core.s0
    n1 d(w.h1 h1Var) {
        return h1Var.j();
    }

    @Override // androidx.camera.core.s0
    public void g() {
    }

    @Override // androidx.camera.core.s0
    void p(n1 n1Var) {
        y.f.b(e(n1Var), new a(n1Var), x.a.a());
    }
}
