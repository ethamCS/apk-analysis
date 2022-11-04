package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: a */
    private final d[] f1196a;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f1196a = dVarArr;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.a aVar) {
        m mVar = new m();
        for (d dVar : this.f1196a) {
            dVar.a(iVar, aVar, false, mVar);
        }
        for (d dVar2 : this.f1196a) {
            dVar2.a(iVar, aVar, true, mVar);
        }
    }
}
