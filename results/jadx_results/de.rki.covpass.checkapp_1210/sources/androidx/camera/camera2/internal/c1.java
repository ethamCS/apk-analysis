package androidx.camera.camera2.internal;

import w.c2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 implements c2.d {

    /* renamed from: a */
    static final c1 f1632a = new c1();

    @Override // w.c2.d
    public void a(w.o2<?> o2Var, c2.b bVar) {
        w.c2 w9 = o2Var.w(null);
        w.o0 I = w.u1.I();
        int k10 = w.c2.a().k();
        if (w9 != null) {
            k10 = w9.k();
            bVar.a(w9.b());
            bVar.c(w9.h());
            bVar.b(w9.f());
            I = w9.d();
        }
        bVar.q(I);
        q.a aVar = new q.a(o2Var);
        bVar.s(aVar.L(k10));
        bVar.e(aVar.M(g1.b()));
        bVar.j(aVar.P(f1.b()));
        bVar.d(l1.d(aVar.O(k0.c())));
        w.q1 L = w.q1.L();
        L.g(q.a.E, aVar.I(q.c.e()));
        L.g(q.a.G, aVar.N(null));
        bVar.g(L);
        bVar.g(aVar.J());
    }
}
