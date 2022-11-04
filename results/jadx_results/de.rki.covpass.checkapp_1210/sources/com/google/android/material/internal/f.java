package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.l0;
/* loaded from: classes.dex */
public class f extends l0 {

    /* renamed from: e4 */
    private Drawable f7389e4;

    /* renamed from: f4 */
    private final Rect f7390f4;

    /* renamed from: g4 */
    private final Rect f7391g4;

    /* renamed from: h4 */
    private int f7392h4;

    /* renamed from: i4 */
    protected boolean f7393i4;

    /* renamed from: j4 */
    boolean f7394j4;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7390f4 = new Rect();
        this.f7391g4 = new Rect();
        this.f7392h4 = 119;
        this.f7393i4 = true;
        this.f7394j4 = false;
        TypedArray h10 = m.h(context, attributeSet, b5.l.O1, i10, 0, new int[0]);
        this.f7392h4 = h10.getInt(b5.l.Q1, this.f7392h4);
        Drawable drawable = h10.getDrawable(b5.l.P1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7393i4 = h10.getBoolean(b5.l.R1, true);
        h10.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7389e4;
        if (drawable != null) {
            if (this.f7394j4) {
                this.f7394j4 = false;
                Rect rect = this.f7390f4;
                Rect rect2 = this.f7391g4;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7393i4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7392h4, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f7389e4;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7389e4;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f7389e4.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f7389e4;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f7392h4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7389e4;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f7394j4 = z10 | this.f7394j4;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7394j4 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7389e4;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f7389e4);
            }
            this.f7389e4 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7392h4 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f7392h4 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f7392h4 = i10;
            if (i10 == 119 && this.f7389e4 != null) {
                this.f7389e4.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7389e4;
    }
}
