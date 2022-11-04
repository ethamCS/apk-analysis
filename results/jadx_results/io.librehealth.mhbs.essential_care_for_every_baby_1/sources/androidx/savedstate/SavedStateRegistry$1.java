package androidx.savedstate;

import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class SavedStateRegistry$1 implements g {

    /* renamed from: a */
    final /* synthetic */ a f298a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == e.a.ON_START) {
            aVar2 = this.f298a;
            z = true;
        } else if (aVar != e.a.ON_STOP) {
            return;
        } else {
            aVar2 = this.f298a;
            z = false;
        }
        aVar2.f299a = z;
    }
}
