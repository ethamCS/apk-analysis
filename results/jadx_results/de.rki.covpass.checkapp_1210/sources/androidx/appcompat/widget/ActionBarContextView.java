package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private CharSequence X3;
    private CharSequence Y3;
    private View Z3;

    /* renamed from: a4 */
    private View f1027a4;

    /* renamed from: b4 */
    private View f1028b4;

    /* renamed from: c4 */
    private LinearLayout f1029c4;

    /* renamed from: d4 */
    private TextView f1030d4;

    /* renamed from: e4 */
    private TextView f1031e4;

    /* renamed from: f4 */
    private int f1032f4;

    /* renamed from: g4 */
    private int f1033g4;

    /* renamed from: h4 */
    private boolean f1034h4;

    /* renamed from: i4 */
    private int f1035i4;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ k.b f1036c;

        a(k.b bVar) {
            ActionBarContextView.this = r1;
            this.f1036c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1036c.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.j_res_0x7f03001e);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1 v10 = a1.v(context, attributeSet, e.j.f9329y, i10, 0);
        androidx.core.view.y.s0(this, v10.g(e.j.f9334z));
        this.f1032f4 = v10.n(e.j.D, 0);
        this.f1033g4 = v10.n(e.j.C, 0);
        this.f1197y = v10.m(e.j.B, 0);
        this.f1035i4 = v10.n(e.j.A, e.g.d_res_0x7f0c0005);
        v10.w();
    }

    private void i() {
        if (this.f1029c4 == null) {
            LayoutInflater.from(getContext()).inflate(e.g.a_res_0x7f0c0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1029c4 = linearLayout;
            this.f1030d4 = (TextView) linearLayout.findViewById(e.f.e_res_0x7f09003b);
            this.f1031e4 = (TextView) this.f1029c4.findViewById(e.f.d_res_0x7f09003a);
            if (this.f1032f4 != 0) {
                this.f1030d4.setTextAppearance(getContext(), this.f1032f4);
            }
            if (this.f1033g4 != 0) {
                this.f1031e4.setTextAppearance(getContext(), this.f1033g4);
            }
        }
        this.f1030d4.setText(this.X3);
        this.f1031e4.setText(this.Y3);
        boolean z10 = !TextUtils.isEmpty(this.X3);
        boolean z11 = !TextUtils.isEmpty(this.Y3);
        int i10 = 0;
        this.f1031e4.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1029c4;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1029c4.getParent() == null) {
            addView(this.f1029c4);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.e0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.Z3 == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.Y3;
    }

    public CharSequence getTitle() {
        return this.X3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(k.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.Z3
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1035i4
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.Z3 = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.Z3
            goto L15
        L22:
            android.view.View r0 = r3.Z3
            int r1 = e.f.i_res_0x7f090044
            android.view.View r0 = r0.findViewById(r1)
            r3.f1027a4 = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f1196x
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1196x = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1196x
            android.content.Context r2 = r3.f1194d
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1196x
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1195q = r4
            r1 = 0
            androidx.core.view.y.s0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1195q
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(k.b):void");
    }

    public boolean j() {
        return this.f1034h4;
    }

    public void k() {
        removeAllViews();
        this.f1028b4 = null;
        this.f1195q = null;
        this.f1196x = null;
        View view = this.f1027a4;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1196x;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1196x;
        if (cVar != null) {
            cVar.B();
            this.f1196x.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = h1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.Z3;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Z3.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = androidx.appcompat.widget.a.d(paddingRight, i14, b10);
            paddingRight = androidx.appcompat.widget.a.d(d10 + e(this.Z3, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1029c4;
        if (linearLayout != null && this.f1028b4 == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f1029c4, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1028b4;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1195q;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f1197y;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.Z3;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Z3.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1195q;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1195q, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1029c4;
            if (linearLayout != null && this.f1028b4 == null) {
                if (this.f1034h4) {
                    this.f1029c4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1029c4.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1029c4.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1028b4;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f1028b4.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f1197y > 0) {
                setMeasuredDimension(size, i13);
                return;
            }
            int childCount = getChildCount();
            int i18 = 0;
            for (int i19 = 0; i19 < childCount; i19++) {
                int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i18) {
                    i18 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i18);
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1197y = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1028b4;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1028b4 = view;
        if (view != null && (linearLayout = this.f1029c4) != null) {
            removeView(linearLayout);
            this.f1029c4 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.Y3 = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.X3 = charSequence;
        i();
        androidx.core.view.y.r0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1034h4) {
            requestLayout();
        }
        this.f1034h4 = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
