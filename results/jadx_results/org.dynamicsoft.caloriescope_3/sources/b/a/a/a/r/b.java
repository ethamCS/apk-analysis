package b.a.a.a.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import b.a.a.a.r.d;
/* loaded from: classes.dex */
public class b extends FrameLayout implements d {

    /* renamed from: b */
    private final c f1233b;

    @Override // b.a.a.a.r.d
    public void a() {
        this.f1233b.b();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void b() {
        this.f1233b.a();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f1233b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f1233b.c();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public int getCircularRevealScrimColor() {
        this.f1233b.d();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public d.e getRevealInfo() {
        this.f1233b.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f1233b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1233b.a(drawable);
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setCircularRevealScrimColor(int i) {
        this.f1233b.a(i);
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setRevealInfo(d.e eVar) {
        this.f1233b.a(eVar);
        throw null;
    }
}
