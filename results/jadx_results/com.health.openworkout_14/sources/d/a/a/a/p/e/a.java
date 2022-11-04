package d.a.a.a.p.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import d.a.a.a.p.c;
import d.a.a.a.p.d;
/* loaded from: classes.dex */
public class a extends d.a.a.a.n.a implements d {
    private final c s;

    @Override // d.a.a.a.p.d
    public void a() {
        this.s.a();
    }

    @Override // d.a.a.a.p.d
    public void b() {
        this.s.b();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        c cVar = this.s;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.s.d();
    }

    @Override // d.a.a.a.p.d
    public int getCircularRevealScrimColor() {
        return this.s.e();
    }

    @Override // d.a.a.a.p.d
    public d.e getRevealInfo() {
        return this.s.f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.s;
        return cVar != null ? cVar.g() : super.isOpaque();
    }

    @Override // d.a.a.a.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.s.h(drawable);
    }

    @Override // d.a.a.a.p.d
    public void setCircularRevealScrimColor(int i) {
        this.s.i(i);
    }

    @Override // d.a.a.a.p.d
    public void setRevealInfo(d.e eVar) {
        this.s.j(eVar);
    }
}
