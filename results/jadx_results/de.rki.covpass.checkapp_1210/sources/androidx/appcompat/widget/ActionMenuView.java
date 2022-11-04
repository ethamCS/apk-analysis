package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;
/* loaded from: classes.dex */
public class ActionMenuView extends l0 implements e.b, androidx.appcompat.view.menu.k {

    /* renamed from: e4 */
    private androidx.appcompat.view.menu.e f1067e4;

    /* renamed from: f4 */
    private Context f1068f4;

    /* renamed from: g4 */
    private int f1069g4;

    /* renamed from: h4 */
    private boolean f1070h4;

    /* renamed from: i4 */
    private androidx.appcompat.widget.c f1071i4;

    /* renamed from: j4 */
    private j.a f1072j4;

    /* renamed from: k4 */
    e.a f1073k4;

    /* renamed from: l4 */
    private boolean f1074l4;

    /* renamed from: m4 */
    private int f1075m4;

    /* renamed from: n4 */
    private int f1076n4;

    /* renamed from: o4 */
    private int f1077o4;

    /* renamed from: p4 */
    e f1078p4;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1079a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1080b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1081c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1082d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1083e;

        /* renamed from: f */
        boolean f1084f;

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1079a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1079a = cVar.f1079a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.a {
        d() {
            ActionMenuView.this = r1;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f1078p4;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1073k4;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1076n4 = (int) (56.0f * f10);
        this.f1077o4 = (int) (f10 * 4.0f);
        this.f1068f4 = context;
        this.f1069g4 = 0;
    }

    public static int L(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.f();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f1079a || !z11) {
            z10 = false;
        }
        cVar.f1082d = z10;
        cVar.f1080b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f1076n4;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z14) {
                    int i29 = this.f1077o4;
                    i16 = i28;
                    r14 = 0;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1084f = r14;
                int i30 = r14 == true ? 1 : 0;
                int i31 = r14 == true ? 1 : 0;
                cVar.f1081c = i30;
                cVar.f1080b = r14;
                cVar.f1082d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1083e = z14 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i21, cVar.f1079a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, L);
                if (cVar.f1082d) {
                    i26++;
                }
                if (cVar.f1079a) {
                    z13 = true;
                }
                i19 -= L;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (L == 1) {
                    j10 |= 1 << i23;
                    i22 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i32 = size2;
        boolean z15 = z13 && i24 == 2;
        boolean z16 = false;
        while (i26 > 0 && i19 > 0) {
            int i33 = Integer.MAX_VALUE;
            int i34 = 0;
            int i35 = 0;
            long j11 = 0;
            while (i35 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i35).getLayoutParams();
                int i36 = i22;
                if (cVar2.f1082d) {
                    int i37 = cVar2.f1080b;
                    if (i37 < i33) {
                        j11 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        i34++;
                        j11 |= 1 << i35;
                    }
                }
                i35++;
                i22 = i36;
                z16 = z17;
            }
            z10 = z16;
            i13 = i22;
            j10 |= j11;
            if (i34 > i19) {
                i14 = mode;
                i12 = i17;
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount) {
                View childAt2 = getChildAt(i39);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i40 = i17;
                int i41 = mode;
                long j12 = 1 << i39;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1080b == i38) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (!z15 || !cVar3.f1083e || i19 != 1) {
                        z12 = z15;
                    } else {
                        int i42 = this.f1077o4;
                        z12 = z15;
                        childAt2.setPadding(i42 + i21, 0, i42, 0);
                    }
                    cVar3.f1080b++;
                    cVar3.f1084f = true;
                    i19--;
                }
                i39++;
                mode = i41;
                i17 = i40;
                z15 = z12;
            }
            i22 = i13;
            z16 = true;
        }
        i14 = mode;
        i12 = i17;
        z10 = z16;
        i13 = i22;
        boolean z18 = !z13 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z18 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = Long.bitCount(j10);
            if (!z18) {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1083e) {
                    bitCount -= 0.5f;
                }
                int i43 = childCount - 1;
                if ((j10 & (1 << i43)) != 0 && !((c) getChildAt(i43).getLayoutParams()).f1083e) {
                    bitCount -= 0.5f;
                }
            } else {
                i15 = 0;
            }
            int i44 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : i15;
            z11 = z10;
            for (int i45 = i15; i45 < childCount; i45++) {
                if ((j10 & (1 << i45)) != 0) {
                    View childAt3 = getChildAt(i45);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1081c = i44;
                        cVar4.f1084f = true;
                        if (i45 == 0 && !cVar4.f1083e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i44) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f1079a) {
                        cVar4.f1081c = i44;
                        cVar4.f1084f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i44) / 2;
                        z11 = true;
                    } else {
                        if (i45 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i44 / 2;
                        }
                        if (i45 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i44 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i46 = i15; i46 < childCount; i46++) {
                View childAt4 = getChildAt(i46);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1084f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1080b * i21) + cVar5.f1081c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i32);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.f1071i4;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return m();
    }

    public c F() {
        c m10 = m();
        m10.f1079a = true;
        return m10;
    }

    protected boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f1071i4;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.f1071i4;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.f1071i4;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f1070h4;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f1067e4;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f1072j4 = aVar;
        this.f1073k4 = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.f1071i4;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f1067e4.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f1067e4 = eVar;
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1067e4 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1067e4 = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1071i4 = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f1071i4;
            j.a aVar = this.f1072j4;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.k(aVar);
            this.f1067e4.c(this.f1071i4, this.f1068f4);
            this.f1071i4.H(this);
        }
        return this.f1067e4;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1071i4.A();
    }

    public int getPopupTheme() {
        return this.f1069g4;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1071i4;
        if (cVar != null) {
            cVar.f(false);
            if (!this.f1071i4.E()) {
                return;
            }
            this.f1071i4.B();
            this.f1071i4.K();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.f1074l4) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = h1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1079a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1079a) {
                    int i26 = width - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1079a) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1074l4;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1074l4 = z11;
        if (z10 != z11) {
            this.f1075m4 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1074l4 && (eVar = this.f1067e4) != null && size != this.f1075m4) {
            this.f1075m4 = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1074l4 && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1071i4.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1078p4 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1071i4.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1070h4 = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1069g4 != i10) {
            this.f1069g4 = i10;
            if (i10 == 0) {
                this.f1068f4 = getContext();
            } else {
                this.f1068f4 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1071i4 = cVar;
        cVar.H(this);
    }
}
