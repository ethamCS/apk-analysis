package q1;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
class k0 implements l0 {

    /* renamed from: a */
    private final WindowId f19413a;

    public k0(View view) {
        this.f19413a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f19413a.equals(this.f19413a);
    }

    public int hashCode() {
        return this.f19413a.hashCode();
    }
}
