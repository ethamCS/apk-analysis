package b.p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
class v implements w {

    /* renamed from: a */
    private final ViewGroupOverlay f2787a;

    public v(ViewGroup viewGroup) {
        this.f2787a = viewGroup.getOverlay();
    }

    @Override // b.p.w
    public void a(View view) {
        this.f2787a.add(view);
    }

    @Override // b.p.b0
    public void b(Drawable drawable) {
        this.f2787a.add(drawable);
    }

    @Override // b.p.w
    public void c(View view) {
        this.f2787a.remove(view);
    }

    @Override // b.p.b0
    public void d(Drawable drawable) {
        this.f2787a.remove(drawable);
    }
}
