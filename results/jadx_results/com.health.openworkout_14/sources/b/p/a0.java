package b.p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
class a0 implements b0 {

    /* renamed from: a */
    private final ViewOverlay f2679a;

    public a0(View view) {
        this.f2679a = view.getOverlay();
    }

    @Override // b.p.b0
    public void b(Drawable drawable) {
        this.f2679a.add(drawable);
    }

    @Override // b.p.b0
    public void d(Drawable drawable) {
        this.f2679a.remove(drawable);
    }
}
