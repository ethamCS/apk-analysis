package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a */
    private final c[] f962a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f962a = cVarArr;
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        l lVar = new l();
        for (c cVar : this.f962a) {
            cVar.a(hVar, aVar, false, lVar);
        }
        for (c cVar2 : this.f962a) {
            cVar2.a(hVar, aVar, true, lVar);
        }
    }
}
