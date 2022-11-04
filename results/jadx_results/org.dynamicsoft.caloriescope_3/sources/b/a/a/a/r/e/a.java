package b.a.a.a.r.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import b.a.a.a.r.c;
import b.a.a.a.r.d;
/* loaded from: classes.dex */
public class a extends b.a.a.a.p.a implements d {
    private final c o;

    @Override // b.a.a.a.r.d
    public void a() {
        this.o.b();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void b() {
        this.o.a();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        c cVar = this.o;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.o.c();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public int getCircularRevealScrimColor() {
        this.o.d();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public d.e getRevealInfo() {
        this.o.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.o;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.o.a(drawable);
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setCircularRevealScrimColor(int i) {
        this.o.a(i);
        throw null;
    }

    @Override // b.a.a.a.r.d
    public void setRevealInfo(d.e eVar) {
        this.o.a(eVar);
        throw null;
    }
}
