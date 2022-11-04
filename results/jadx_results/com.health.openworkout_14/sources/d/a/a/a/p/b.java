package d.a.a.a.p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import d.a.a.a.p.d;
/* loaded from: classes.dex */
public class b extends FrameLayout implements d {

    /* renamed from: b */
    private final c f3668b;

    @Override // d.a.a.a.p.d
    public void a() {
        this.f3668b.a();
    }

    @Override // d.a.a.a.p.d
    public void b() {
        this.f3668b.b();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f3668b;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3668b.d();
    }

    @Override // d.a.a.a.p.d
    public int getCircularRevealScrimColor() {
        return this.f3668b.e();
    }

    @Override // d.a.a.a.p.d
    public d.e getRevealInfo() {
        return this.f3668b.f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f3668b;
        return cVar != null ? cVar.g() : super.isOpaque();
    }

    @Override // d.a.a.a.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3668b.h(drawable);
    }

    @Override // d.a.a.a.p.d
    public void setCircularRevealScrimColor(int i) {
        this.f3668b.i(i);
    }

    @Override // d.a.a.a.p.d
    public void setRevealInfo(d.e eVar) {
        this.f3668b.j(eVar);
    }
}
