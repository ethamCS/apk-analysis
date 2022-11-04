package d.a.a.a.u;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final View f3685a;

    /* renamed from: b */
    private boolean f3686b = false;

    /* renamed from: c */
    private int f3687c = 0;

    public b(a aVar) {
        this.f3685a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f3685a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f3685a);
        }
    }

    public int b() {
        return this.f3687c;
    }

    public boolean c() {
        return this.f3686b;
    }

    public void d(Bundle bundle) {
        this.f3686b = bundle.getBoolean("expanded", false);
        this.f3687c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f3686b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f3686b);
        bundle.putInt("expandedComponentIdHint", this.f3687c);
        return bundle;
    }

    public void f(int i) {
        this.f3687c = i;
    }
}
