package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class v extends r {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    private void d() {
        if (this.e != null) {
            if (!this.h && !this.i) {
                return;
            }
            Drawable i = androidx.core.graphics.drawable.a.i(this.e.mutate());
            this.e = i;
            if (this.h) {
                androidx.core.graphics.drawable.a.a(i, this.f);
            }
            if (this.i) {
                androidx.core.graphics.drawable.a.a(this.e, this.g);
            }
            if (!this.e.isStateful()) {
                return;
            }
            this.e.setState(this.d.getDrawableState());
        }
    }

    public void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.e.getIntrinsicWidth();
            int intrinsicHeight = this.e.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.e.setBounds(-i2, -i, i2, i);
            float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    void a(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            androidx.core.graphics.drawable.a.a(drawable, a.g.l.u.o(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            d();
        }
        this.d.invalidate();
    }

    @Override // androidx.appcompat.widget.r
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        w0 a2 = w0.a(this.d.getContext(), attributeSet, a.a.j.AppCompatSeekBar, i, 0);
        Drawable c2 = a2.c(a.a.j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.d.setThumb(c2);
        }
        a(a2.b(a.a.j.AppCompatSeekBar_tickMark));
        if (a2.g(a.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.a(a2.d(a.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (a2.g(a.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f = a2.a(a.a.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a2.a();
        d();
    }

    public void b() {
        Drawable drawable = this.e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.d.getDrawableState())) {
            return;
        }
        this.d.invalidateDrawable(drawable);
    }

    public void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
