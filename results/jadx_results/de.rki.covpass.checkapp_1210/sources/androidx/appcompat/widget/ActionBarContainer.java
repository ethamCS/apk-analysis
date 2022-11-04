package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    Drawable U3;
    Drawable V3;
    boolean W3;
    boolean X3;
    private int Y3;

    /* renamed from: c */
    private boolean f1022c;

    /* renamed from: d */
    private View f1023d;

    /* renamed from: q */
    private View f1024q;

    /* renamed from: x */
    private View f1025x;

    /* renamed from: y */
    Drawable f1026y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.y.s0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f9209a);
        this.f1026y = obtainStyledAttributes.getDrawable(e.j.f9214b);
        this.U3 = obtainStyledAttributes.getDrawable(e.j.f9224d);
        this.Y3 = obtainStyledAttributes.getDimensionPixelSize(e.j.f9254j, -1);
        boolean z10 = true;
        if (getId() == e.f.H_res_0x7f09023d) {
            this.W3 = true;
            this.V3 = obtainStyledAttributes.getDrawable(e.j.f9219c);
        }
        obtainStyledAttributes.recycle();
        if (!this.W3 ? this.f1026y != null || this.U3 != null : this.V3 != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1026y;
        if (drawable != null && drawable.isStateful()) {
            this.f1026y.setState(getDrawableState());
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null && drawable2.isStateful()) {
            this.U3.setState(getDrawableState());
        }
        Drawable drawable3 = this.V3;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.V3.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1023d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1026y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.V3;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1024q = findViewById(e.f.a_res_0x7f090035);
        this.f1025x = findViewById(e.f.f_res_0x7f09003d);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1022c || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f1023d;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i10, (measuredHeight - view2.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.W3) {
            Drawable drawable3 = this.V3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f1026y != null) {
                if (this.f1024q.getVisibility() == 0) {
                    drawable2 = this.f1026y;
                    left = this.f1024q.getLeft();
                    top = this.f1024q.getTop();
                    right = this.f1024q.getRight();
                    view = this.f1024q;
                } else {
                    View view3 = this.f1025x;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1026y.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f1026y;
                        left = this.f1025x.getLeft();
                        top = this.f1025x.getTop();
                        right = this.f1025x.getRight();
                        view = this.f1025x;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.X3 = z13;
            if (z13 && (drawable = this.U3) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1024q
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.Y3
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1024q
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1023d
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1024q
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1024q
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1025x
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1025x
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1023d
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1026y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1026y);
        }
        this.f1026y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1024q;
            if (view != null) {
                this.f1026y.setBounds(view.getLeft(), this.f1024q.getTop(), this.f1024q.getRight(), this.f1024q.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.W3 ? this.f1026y != null || this.U3 != null : this.V3 != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.V3;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.V3);
        }
        this.V3 = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.W3 && (drawable2 = this.V3) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.W3 ? !(this.f1026y != null || this.U3 != null) : this.V3 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.U3;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.U3);
        }
        this.U3 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.X3 && (drawable2 = this.U3) != null) {
                drawable2.setBounds(this.f1023d.getLeft(), this.f1023d.getTop(), this.f1023d.getRight(), this.f1023d.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.W3 ? this.f1026y != null || this.U3 != null : this.V3 != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f1023d;
        if (view != null) {
            removeView(view);
        }
        this.f1023d = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1022c = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1026y;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.V3;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1026y && !this.W3) || (drawable == this.U3 && this.X3) || ((drawable == this.V3 && this.W3) || super.verifyDrawable(drawable));
    }
}
