package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
/* loaded from: classes.dex */
public class l0 extends ViewGroup {
    private int U3;
    private float V3;
    private boolean W3;
    private int[] X3;
    private int[] Y3;
    private Drawable Z3;

    /* renamed from: a4 */
    private int f1387a4;

    /* renamed from: b4 */
    private int f1388b4;

    /* renamed from: c */
    private boolean f1389c;

    /* renamed from: c4 */
    private int f1390c4;

    /* renamed from: d */
    private int f1391d;

    /* renamed from: d4 */
    private int f1392d4;

    /* renamed from: q */
    private int f1393q;

    /* renamed from: x */
    private int f1394x;

    /* renamed from: y */
    private int f1395y;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public l0(Context context) {
        this(context, null);
    }

    public l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1389c = true;
        this.f1391d = -1;
        this.f1393q = 0;
        this.f1395y = 8388659;
        int[] iArr = e.j.f9211a1;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.y.m0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        int k10 = v10.k(e.j.f9221c1, -1);
        if (k10 >= 0) {
            setOrientation(k10);
        }
        int k11 = v10.k(e.j.f9216b1, -1);
        if (k11 >= 0) {
            setGravity(k11);
        }
        boolean a10 = v10.a(e.j.f9226d1, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.V3 = v10.i(e.j.f9236f1, -1.0f);
        this.f1391d = v10.k(e.j.f9231e1, -1);
        this.W3 = v10.a(e.j.f9251i1, false);
        setDividerDrawable(v10.g(e.j.f9241g1));
        this.f1390c4 = v10.k(e.j.f9256j1, 0);
        this.f1392d4 = v10.f(e.j.f9246h1, 0);
        v10.w();
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private void k(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s10.getMeasuredWidth();
                    measureChildWithMargins(s10, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s10.getMeasuredHeight();
                    measureChildWithMargins(s10, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = h1.b(this);
        for (int i13 = 0; i13 < virtualChildCount; i13++) {
            View s10 = s(i13);
            if (s10 != null && s10.getVisibility() != 8 && t(i13)) {
                a aVar = (a) s10.getLayoutParams();
                j(canvas, b10 ? s10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (s10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1387a4);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            if (s11 == null) {
                if (b10) {
                    i10 = getPaddingLeft();
                    j(canvas, i10);
                }
                i12 = getWidth();
                i11 = getPaddingRight();
                i10 = (i12 - i11) - this.f1387a4;
                j(canvas, i10);
            }
            a aVar2 = (a) s11.getLayoutParams();
            if (!b10) {
                i10 = s11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                j(canvas, i10);
            }
            i12 = s11.getLeft();
            i11 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
            i10 = (i12 - i11) - this.f1387a4;
            j(canvas, i10);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1391d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1391d;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1391d != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i12 = this.f1393q;
        if (this.f1394x == 1 && (i10 = this.f1395y & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.U3) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.U3;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1391d;
    }

    public Drawable getDividerDrawable() {
        return this.Z3;
    }

    public int getDividerPadding() {
        return this.f1392d4;
    }

    public int getDividerWidth() {
        return this.f1387a4;
    }

    public int getGravity() {
        return this.f1395y;
    }

    public int getOrientation() {
        return this.f1394x;
    }

    public int getShowDividers() {
        return this.f1390c4;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.V3;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View s10 = s(i10);
            if (s10 != null && s10.getVisibility() != 8 && t(i10)) {
                i(canvas, (s10.getTop() - ((LinearLayout.LayoutParams) ((a) s10.getLayoutParams())).topMargin) - this.f1388b4);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            i(canvas, s11 == null ? (getHeight() - getPaddingBottom()) - this.f1388b4 : s11.getBottom() + ((LinearLayout.LayoutParams) ((a) s11.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i10) {
        this.Z3.setBounds(getPaddingLeft() + this.f1392d4, i10, (getWidth() - getPaddingRight()) - this.f1392d4, this.f1388b4 + i10);
        this.Z3.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.Z3.setBounds(i10, getPaddingTop() + this.f1392d4, this.f1387a4 + i10, (getHeight() - getPaddingBottom()) - this.f1392d4);
        this.Z3.draw(canvas);
    }

    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1394x;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 != 1) {
            return null;
        }
        return new a(-1, -2);
    }

    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.Z3 == null) {
            return;
        }
        if (this.f1394x == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1394x == 1) {
            v(i10, i11, i12, i13);
        } else {
            u(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1394x == 1) {
            z(i10, i11);
        } else {
            x(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1389c = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1391d = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.Z3) {
            return;
        }
        this.Z3 = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f1387a4 = drawable.getIntrinsicWidth();
            this.f1388b4 = drawable.getIntrinsicHeight();
        } else {
            this.f1387a4 = 0;
            this.f1388b4 = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1392d4 = i10;
    }

    public void setGravity(int i10) {
        if (this.f1395y != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1395y = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1395y;
        if ((8388615 & i12) != i11) {
            this.f1395y = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.W3 = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1394x != i10) {
            this.f1394x = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1390c4) {
            requestLayout();
        }
        this.f1390c4 = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1395y;
        if ((i12 & 112) != i11) {
            this.f1395y = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.V3 = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t(int i10) {
        if (i10 == 0) {
            return (this.f1390c4 & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.f1390c4 & 4) != 0;
        } else if ((this.f1390c4 & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1395y
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.U3
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.U3
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.l0$a r5 = (androidx.appcompat.widget.l0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.y.B(r17)
            int r1 = androidx.core.view.e.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1388b4
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc6
        Lc5:
            r1 = r14
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.v(int, int, int, int):void");
    }

    void w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03a5, code lost:
        if (r8 > 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b0, code lost:
        if (r8 < 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b2, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b3, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void x(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.x(int, int):void");
    }

    int y(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cf, code lost:
        if (r15 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02da, code lost:
        if (r15 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02dc, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02dd, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.z(int, int):void");
    }
}
