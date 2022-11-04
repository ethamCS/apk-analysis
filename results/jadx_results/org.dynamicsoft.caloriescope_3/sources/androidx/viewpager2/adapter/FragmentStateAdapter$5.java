package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements f {

    /* renamed from: a */
    final /* synthetic */ Handler f1163a;

    /* renamed from: b */
    final /* synthetic */ Runnable f1164b;

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f1163a.removeCallbacks(this.f1164b);
            hVar.a().b(this);
        }
    }
}
