package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: a */
    private final d[] f236a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        l lVar = new l();
        for (d dVar : this.f236a) {
            dVar.a(iVar, aVar, false, lVar);
        }
        for (d dVar2 : this.f236a) {
            dVar2.a(iVar, aVar, true, lVar);
        }
    }
}
