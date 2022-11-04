package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class ComponentActivity$3 implements g {

    /* renamed from: a */
    final /* synthetic */ b f145a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        if (aVar != e.a.ON_DESTROY || this.f145a.isChangingConfigurations()) {
            return;
        }
        this.f145a.b().a();
    }
}
