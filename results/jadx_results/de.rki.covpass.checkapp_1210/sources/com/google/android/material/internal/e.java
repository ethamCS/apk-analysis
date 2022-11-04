package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: c */
    private int f7385c;

    /* renamed from: d */
    private int f7386d;

    /* renamed from: q */
    private boolean f7387q;

    /* renamed from: x */
    private int f7388x;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7387q = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b5.l.J1, 0, 0);
        this.f7385c = obtainStyledAttributes.getDimensionPixelSize(b5.l.L1, 0);
        this.f7386d = obtainStyledAttributes.getDimensionPixelSize(b5.l.K1, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(b5.f.H_res_0x7f090202);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.f7387q;
    }

    protected int getItemSpacing() {
        return this.f7386d;
    }

    protected int getLineSpacing() {
        return this.f7385c;
    }

    public int getRowCount() {
        return this.f7388x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f7388x = 0;
            return;
        }
        this.f7388x = 1;
        boolean z11 = y.B(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(b5.f.H_res_0x7f090202, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = androidx.core.view.h.b(marginLayoutParams);
                    i15 = androidx.core.view.h.a(marginLayoutParams);
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                int measuredWidth = i17 + i14 + childAt.getMeasuredWidth();
                if (!this.f7387q && measuredWidth > i16) {
                    i18 = this.f7385c + paddingTop;
                    this.f7388x++;
                    i17 = paddingRight;
                }
                childAt.setTag(b5.f.H_res_0x7f090202, Integer.valueOf(this.f7388x - 1));
                int i20 = i17 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    i20 = i16 - measuredWidth2;
                    measuredWidth2 = (i16 - i17) - i14;
                }
                childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                i17 += i14 + i15 + childAt.getMeasuredWidth() + this.f7386d;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i12 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i14 = i19;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f7385c + paddingTop;
                }
                int measuredWidth = i14 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i13 + i12 + childAt.getMeasuredWidth() + this.f7386d;
                if (i18 == getChildCount() - 1) {
                    i17 += i12;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i10) {
        this.f7386d = i10;
    }

    public void setLineSpacing(int i10) {
        this.f7385c = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f7387q = z10;
    }
}
