package a.m;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
class v implements w {

    /* renamed from: a */
    private final ViewGroupOverlay f396a;

    public v(ViewGroup viewGroup) {
        this.f396a = viewGroup.getOverlay();
    }

    @Override // a.m.b0
    public void a(Drawable drawable) {
        this.f396a.remove(drawable);
    }

    @Override // a.m.w
    public void a(View view) {
        this.f396a.remove(view);
    }

    @Override // a.m.b0
    public void b(Drawable drawable) {
        this.f396a.add(drawable);
    }

    @Override // a.m.w
    public void b(View view) {
        this.f396a.add(view);
    }
}
