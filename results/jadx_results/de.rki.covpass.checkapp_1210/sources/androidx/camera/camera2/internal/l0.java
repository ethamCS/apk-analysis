package androidx.camera.camera2.internal;

import w.k0;
/* loaded from: classes.dex */
class l0 implements k0.b {

    /* renamed from: a */
    static final l0 f1801a = new l0();

    @Override // w.k0.b
    public void a(w.o2<?> o2Var, k0.a aVar) {
        w.k0 i10 = o2Var.i(null);
        w.o0 I = w.u1.I();
        int g10 = w.k0.a().g();
        if (i10 != null) {
            g10 = i10.g();
            aVar.a(i10.b());
            I = i10.d();
        }
        aVar.o(I);
        q.a aVar2 = new q.a(o2Var);
        aVar.p(aVar2.L(g10));
        aVar.c(l1.d(aVar2.O(k0.c())));
        aVar.e(aVar2.J());
    }
}
