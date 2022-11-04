package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.m;
import java.util.Map;
/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.s {

    /* renamed from: c */
    final /* synthetic */ String f3974c;

    /* renamed from: d */
    final /* synthetic */ b0 f3975d;

    /* renamed from: q */
    final /* synthetic */ androidx.lifecycle.m f3976q;

    /* renamed from: x */
    final /* synthetic */ w f3977x;

    @Override // androidx.lifecycle.s
    public void f(androidx.lifecycle.v vVar, m.b bVar) {
        Map map;
        Map map2;
        if (bVar == m.b.ON_START) {
            map2 = this.f3977x.f4203k;
            Bundle bundle = (Bundle) map2.get(this.f3974c);
            if (bundle != null) {
                this.f3975d.a(this.f3974c, bundle);
                this.f3977x.u(this.f3974c);
            }
        }
        if (bVar == m.b.ON_DESTROY) {
            this.f3976q.c(this);
            map = this.f3977x.f4204l;
            map.remove(this.f3974c);
        }
    }
}
