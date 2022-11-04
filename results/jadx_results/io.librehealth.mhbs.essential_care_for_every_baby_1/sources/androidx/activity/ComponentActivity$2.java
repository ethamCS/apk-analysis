package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class ComponentActivity$2 implements g {

    /* renamed from: a */
    final /* synthetic */ b f144a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        if (aVar == e.a.ON_STOP) {
            Window window = this.f144a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView == null) {
                return;
            }
            peekDecorView.cancelPendingInputEvents();
        }
    }
}
