package com.google.android.material.internal;

import a.g.l.c0;
import a.g.l.q;
import a.g.l.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class i extends FrameLayout {

    /* renamed from: b */
    Drawable f1529b;

    /* renamed from: c */
    Rect f1530c;
    private Rect d;
    private boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements q {
        a() {
            i.this = r1;
        }

        @Override // a.g.l.q
        public c0 a(View view, c0 c0Var) {
            i iVar = i.this;
            if (iVar.f1530c == null) {
                iVar.f1530c = new Rect();
            }
            i.this.f1530c.set(c0Var.c(), c0Var.e(), c0Var.d(), c0Var.b());
            i.this.a(c0Var);
            i.this.setWillNotDraw(!c0Var.f() || i.this.f1529b == null);
            u.H(i.this);
            return c0Var.a();
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = true;
        this.f = true;
        TypedArray c2 = m.c(context, attributeSet, b.a.a.a.l.ScrimInsetsFrameLayout, i, b.a.a.a.k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f1529b = c2.getDrawable(b.a.a.a.l.ScrimInsetsFrameLayout_insetForeground);
        c2.recycle();
        setWillNotDraw(true);
        u.a(this, new a());
    }

    protected void a(c0 c0Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1530c == null || this.f1529b == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.e) {
            this.d.set(0, 0, width, this.f1530c.top);
            this.f1529b.setBounds(this.d);
            this.f1529b.draw(canvas);
        }
        if (this.f) {
            this.d.set(0, height - this.f1530c.bottom, width, height);
            this.f1529b.setBounds(this.d);
            this.f1529b.draw(canvas);
        }
        Rect rect = this.d;
        Rect rect2 = this.f1530c;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f1529b.setBounds(this.d);
        this.f1529b.draw(canvas);
        Rect rect3 = this.d;
        Rect rect4 = this.f1530c;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f1529b.setBounds(this.d);
        this.f1529b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f1529b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f1529b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f1529b = drawable;
    }
}
