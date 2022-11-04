package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class y extends t {

    /* renamed from: d */
    private final SeekBar f1564d;

    /* renamed from: e */
    private Drawable f1565e;

    /* renamed from: f */
    private ColorStateList f1566f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1567g = null;

    /* renamed from: h */
    private boolean f1568h = false;

    /* renamed from: i */
    private boolean f1569i = false;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f1564d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1565e;
        if (drawable != null) {
            if (!this.f1568h && !this.f1569i) {
                return;
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
            this.f1565e = r10;
            if (this.f1568h) {
                androidx.core.graphics.drawable.a.o(r10, this.f1566f);
            }
            if (this.f1569i) {
                androidx.core.graphics.drawable.a.p(this.f1565e, this.f1567g);
            }
            if (!this.f1565e.isStateful()) {
                return;
            }
            this.f1565e.setState(this.f1564d.getDrawableState());
        }
    }

    @Override // androidx.appcompat.widget.t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1564d.getContext();
        int[] iArr = e.j.T;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1564d;
        androidx.core.view.y.m0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(e.j.U);
        if (h10 != null) {
            this.f1564d.setThumb(h10);
        }
        j(v10.g(e.j.V));
        int i11 = e.j.X;
        if (v10.s(i11)) {
            this.f1567g = h0.e(v10.k(i11, -1), this.f1567g);
            this.f1569i = true;
        }
        int i12 = e.j.W;
        if (v10.s(i12)) {
            this.f1566f = v10.c(i12);
            this.f1568h = true;
        }
        v10.w();
        f();
    }

    public void g(Canvas canvas) {
        if (this.f1565e != null) {
            int max = this.f1564d.getMax();
            int i10 = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.f1565e.getIntrinsicWidth();
            int intrinsicHeight = this.f1565e.getIntrinsicHeight();
            int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i10 = intrinsicHeight / 2;
            }
            this.f1565e.setBounds(-i11, -i10, i11, i10);
            float width = ((this.f1564d.getWidth() - this.f1564d.getPaddingLeft()) - this.f1564d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.f1564d.getPaddingLeft(), this.f1564d.getHeight() / 2);
            for (int i12 = 0; i12 <= max; i12++) {
                this.f1565e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    public void h() {
        Drawable drawable = this.f1565e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.f1564d.getDrawableState())) {
            return;
        }
        this.f1564d.invalidateDrawable(drawable);
    }

    public void i() {
        Drawable drawable = this.f1565e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1565e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1565e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1564d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.y.B(this.f1564d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1564d.getDrawableState());
            }
            f();
        }
        this.f1564d.invalidate();
    }
}
