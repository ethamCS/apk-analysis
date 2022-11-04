package a.m;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
class a0 implements b0 {

    /* renamed from: a */
    private final ViewOverlay f326a;

    public a0(View view) {
        this.f326a = view.getOverlay();
    }

    @Override // a.m.b0
    public void a(Drawable drawable) {
        this.f326a.remove(drawable);
    }

    @Override // a.m.b0
    public void b(Drawable drawable) {
        this.f326a.add(drawable);
    }
}
