package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.g.l.t;
import com.google.android.material.internal.p;
import d.a.a.a.k;
/* loaded from: classes.dex */
public class d extends FrameLayout {
    private static final View.OnTouchListener i = new a();

    /* renamed from: b */
    private c f3250b;

    /* renamed from: c */
    private b f3251c;

    /* renamed from: d */
    private int f3252d;

    /* renamed from: e */
    private final float f3253e;

    /* renamed from: f */
    private final float f3254f;

    /* renamed from: g */
    private ColorStateList f3255g;

    /* renamed from: h */
    private PorterDuff.Mode f3256h;

    /* loaded from: classes.dex */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, k.P2);
        int i2 = k.W2;
        if (obtainStyledAttributes.hasValue(i2)) {
            t.p0(this, obtainStyledAttributes.getDimensionPixelSize(i2, 0));
        }
        this.f3252d = obtainStyledAttributes.getInt(k.S2, 0);
        this.f3253e = obtainStyledAttributes.getFloat(k.T2, 1.0f);
        setBackgroundTintList(d.a.a.a.x.c.a(context2, obtainStyledAttributes, k.U2));
        setBackgroundTintMode(p.e(obtainStyledAttributes.getInt(k.V2, -1), PorterDuff.Mode.SRC_IN));
        this.f3254f = obtainStyledAttributes.getFloat(k.R2, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            t.l0(this, a());
        }
    }

    private Drawable a() {
        float dimension = getResources().getDimension(d.a.a.a.d.B);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(d.a.a.a.q.a.g(this, d.a.a.a.b.l_res_0x7f0400c4, d.a.a.a.b.i_res_0x7f0400bd, getBackgroundOverlayColorAlpha()));
        if (this.f3255g != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(r, this.f3255g);
            return r;
        }
        return androidx.core.graphics.drawable.a.r(gradientDrawable);
    }

    float getActionTextColorAlpha() {
        return this.f3254f;
    }

    int getAnimationMode() {
        return this.f3252d;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f3253e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f3251c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        t.f0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f3251c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f3250b;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    void setAnimationMode(int i2) {
        this.f3252d = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3255g != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
            androidx.core.graphics.drawable.a.o(drawable, this.f3255g);
            androidx.core.graphics.drawable.a.p(drawable, this.f3256h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3255g = colorStateList;
        if (getBackground() != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
            androidx.core.graphics.drawable.a.o(r, colorStateList);
            androidx.core.graphics.drawable.a.p(r, this.f3256h);
            if (r == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(r);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3256h = mode;
        if (getBackground() != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
            androidx.core.graphics.drawable.a.p(r, mode);
            if (r == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(r);
        }
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.f3251c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(c cVar) {
        this.f3250b = cVar;
    }
}
