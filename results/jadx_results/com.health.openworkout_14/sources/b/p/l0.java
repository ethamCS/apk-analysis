package b.p;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
class l0 implements m0 {

    /* renamed from: a */
    private final WindowId f2752a;

    public l0(View view) {
        this.f2752a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f2752a.equals(this.f2752a);
    }

    public int hashCode() {
        return this.f2752a.hashCode();
    }
}
