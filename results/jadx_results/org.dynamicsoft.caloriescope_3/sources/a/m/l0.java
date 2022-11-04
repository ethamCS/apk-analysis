package a.m;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
class l0 implements m0 {

    /* renamed from: a */
    private final WindowId f369a;

    public l0(View view) {
        this.f369a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f369a.equals(this.f369a);
    }

    public int hashCode() {
        return this.f369a.hashCode();
    }
}
