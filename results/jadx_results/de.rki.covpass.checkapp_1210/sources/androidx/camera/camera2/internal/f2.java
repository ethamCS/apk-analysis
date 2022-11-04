package androidx.camera.camera2.internal;

import q.a;
import w.k0;
/* loaded from: classes.dex */
final class f2 extends l0 {

    /* renamed from: c */
    static final f2 f1687c = new f2(new u.i());

    /* renamed from: b */
    private final u.i f1688b;

    private f2(u.i iVar) {
        this.f1688b = iVar;
    }

    @Override // androidx.camera.camera2.internal.l0, w.k0.b
    public void a(w.o2<?> o2Var, k0.a aVar) {
        super.a(o2Var, aVar);
        if (o2Var instanceof w.a1) {
            w.a1 a1Var = (w.a1) o2Var;
            a.C0313a c0313a = new a.C0313a();
            if (a1Var.Q()) {
                this.f1688b.a(a1Var.I(), c0313a);
            }
            aVar.e(c0313a.c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
