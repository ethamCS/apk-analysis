package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class Fragment$2 implements g {

    /* renamed from: a */
    final /* synthetic */ a f234a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        View view;
        if (aVar != e.a.ON_STOP || (view = this.f234a.f235a) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
