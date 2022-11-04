package q1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
class z implements a0 {

    /* renamed from: a */
    private final ViewOverlay f19486a;

    public z(View view) {
        this.f19486a = view.getOverlay();
    }

    @Override // q1.a0
    public void b(Drawable drawable) {
        this.f19486a.add(drawable);
    }

    @Override // q1.a0
    public void d(Drawable drawable) {
        this.f19486a.remove(drawable);
    }
}
