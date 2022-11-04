package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements g {

    /* renamed from: a */
    final /* synthetic */ Handler f1983a;

    /* renamed from: b */
    final /* synthetic */ Runnable f1984b;

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f1983a.removeCallbacks(this.f1984b);
            iVar.a().c(this);
        }
    }
}
