package com.google.android.material.snackbar;

import a.g.l.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.a.a.a.l;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class d extends FrameLayout {
    private static final View.OnTouchListener g = new a();

    /* renamed from: b */
    private c f1557b;

    /* renamed from: c */
    private b f1558c;
    private int d;
    private final float e;
    private final float f;

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

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(m.b(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(l.SnackbarLayout_elevation)) {
            u.a(this, obtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_elevation, 0));
        }
        this.d = obtainStyledAttributes.getInt(l.SnackbarLayout_animationMode, 0);
        this.e = obtainStyledAttributes.getFloat(l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f = obtainStyledAttributes.getFloat(l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(g);
        setFocusable(true);
    }

    float getActionTextColorAlpha() {
        return this.f;
    }

    int getAnimationMode() {
        return this.d;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f1558c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        u.I(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1558c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.f1557b;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    void setAnimationMode(int i) {
        this.d = i;
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.f1558c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : g);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(c cVar) {
        this.f1557b = cVar;
    }
}
