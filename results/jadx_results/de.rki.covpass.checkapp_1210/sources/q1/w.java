package q1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
class w implements x {

    /* renamed from: a */
    private final ViewGroupOverlay f19484a;

    public w(ViewGroup viewGroup) {
        this.f19484a = viewGroup.getOverlay();
    }

    @Override // q1.x
    public void a(View view) {
        this.f19484a.add(view);
    }

    @Override // q1.a0
    public void b(Drawable drawable) {
        this.f19484a.add(drawable);
    }

    @Override // q1.x
    public void c(View view) {
        this.f19484a.remove(view);
    }

    @Override // q1.a0
    public void d(Drawable drawable) {
        this.f19484a.remove(drawable);
    }
}
