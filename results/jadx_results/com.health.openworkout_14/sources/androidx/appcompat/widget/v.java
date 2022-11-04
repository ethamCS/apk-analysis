package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d */
    private final SeekBar f637d;

    /* renamed from: e */
    private Drawable f638e;

    /* renamed from: f */
    private ColorStateList f639f = null;

    /* renamed from: g */
    private PorterDuff.Mode f640g = null;

    /* renamed from: h */
    private boolean f641h = false;
    private boolean i = false;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.f637d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f638e;
        if (drawable != null) {
            if (!this.f641h && !this.i) {
                return;
            }
            Drawable r = androidx.core.graphics.drawable.a.r(drawable.mutate());
            this.f638e = r;
            if (this.f641h) {
                androidx.core.graphics.drawable.a.o(r, this.f639f);
            }
            if (this.i) {
                androidx.core.graphics.drawable.a.p(this.f638e, this.f640g);
            }
            if (!this.f638e.isStateful()) {
                return;
            }
            this.f638e.setState(this.f637d.getDrawableState());
        }
    }

    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.f637d.getContext();
        int[] iArr = b.a.j.Q;
        w0 v = w0.v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f637d;
        b.g.l.t.g0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i, 0);
        Drawable h2 = v.h(b.a.j.R);
        if (h2 != null) {
            this.f637d.setThumb(h2);
        }
        j(v.g(b.a.j.S));
        int i2 = b.a.j.U;
        if (v.s(i2)) {
            this.f640g = e0.e(v.k(i2, -1), this.f640g);
            this.i = true;
        }
        int i3 = b.a.j.T;
        if (v.s(i3)) {
            this.f639f = v.c(i3);
            this.f641h = true;
        }
        v.w();
        f();
    }

    public void g(Canvas canvas) {
        if (this.f638e != null) {
            int max = this.f637d.getMax();
            int i = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.f638e.getIntrinsicWidth();
            int intrinsicHeight = this.f638e.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.f638e.setBounds(-i2, -i, i2, i);
            float width = ((this.f637d.getWidth() - this.f637d.getPaddingLeft()) - this.f637d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.f637d.getPaddingLeft(), this.f637d.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.f638e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    public void h() {
        Drawable drawable = this.f638e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.f637d.getDrawableState())) {
            return;
        }
        this.f637d.invalidateDrawable(drawable);
    }

    public void i() {
        Drawable drawable = this.f638e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f638e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f638e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f637d);
            androidx.core.graphics.drawable.a.m(drawable, b.g.l.t.y(this.f637d));
            if (drawable.isStateful()) {
                drawable.setState(this.f637d.getDrawableState());
            }
            f();
        }
        this.f637d.invalidate();
    }
}
