package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.g.l.b0;
import b.g.l.t;
/* loaded from: classes.dex */
public class k extends FrameLayout {

    /* renamed from: b */
    Drawable f3203b;

    /* renamed from: c */
    Rect f3204c;

    /* renamed from: d */
    private Rect f3205d;

    /* renamed from: e */
    private boolean f3206e;

    /* renamed from: f */
    private boolean f3207f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.g.l.q {
        a() {
            k.this = r1;
        }

        @Override // b.g.l.q
        public b0 a(View view, b0 b0Var) {
            k kVar = k.this;
            if (kVar.f3204c == null) {
                kVar.f3204c = new Rect();
            }
            k.this.f3204c.set(b0Var.g(), b0Var.i(), b0Var.h(), b0Var.f());
            k.this.a(b0Var);
            k.this.setWillNotDraw(!b0Var.k() || k.this.f3203b == null);
            t.Z(k.this);
            return b0Var.c();
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3205d = new Rect();
        this.f3206e = true;
        this.f3207f = true;
        TypedArray h2 = o.h(context, attributeSet, d.a.a.a.k.A2, i, d.a.a.a.j.f3630g, new int[0]);
        this.f3203b = h2.getDrawable(d.a.a.a.k.B2);
        h2.recycle();
        setWillNotDraw(true);
        t.t0(this, new a());
    }

    protected void a(b0 b0Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f3204c == null || this.f3203b == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f3206e) {
            this.f3205d.set(0, 0, width, this.f3204c.top);
            this.f3203b.setBounds(this.f3205d);
            this.f3203b.draw(canvas);
        }
        if (this.f3207f) {
            this.f3205d.set(0, height - this.f3204c.bottom, width, height);
            this.f3203b.setBounds(this.f3205d);
            this.f3203b.draw(canvas);
        }
        Rect rect = this.f3205d;
        Rect rect2 = this.f3204c;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f3203b.setBounds(this.f3205d);
        this.f3203b.draw(canvas);
        Rect rect3 = this.f3205d;
        Rect rect4 = this.f3204c;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f3203b.setBounds(this.f3205d);
        this.f3203b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f3203b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f3203b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f3207f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f3206e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f3203b = drawable;
    }
}
