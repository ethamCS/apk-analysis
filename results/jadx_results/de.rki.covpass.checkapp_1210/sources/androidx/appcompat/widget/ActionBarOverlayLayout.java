package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.j0;
import org.conscrypt.PSKKeyManager;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements f0, androidx.core.view.p, androidx.core.view.q {

    /* renamed from: u4 */
    static final int[] f1038u4 = {e.a.f9177b, 16842841};
    private Drawable U3;
    private boolean V3;
    private boolean W3;
    private boolean X3;
    private boolean Y3;
    boolean Z3;

    /* renamed from: a4 */
    private int f1039a4;

    /* renamed from: b4 */
    private int f1040b4;

    /* renamed from: c */
    private int f1041c;

    /* renamed from: j4 */
    private androidx.core.view.j0 f1050j4;

    /* renamed from: k4 */
    private androidx.core.view.j0 f1051k4;

    /* renamed from: l4 */
    private androidx.core.view.j0 f1052l4;

    /* renamed from: m4 */
    private androidx.core.view.j0 f1053m4;

    /* renamed from: n4 */
    private d f1054n4;

    /* renamed from: o4 */
    private OverScroller f1055o4;

    /* renamed from: p4 */
    ViewPropertyAnimator f1056p4;

    /* renamed from: q */
    private ContentFrameLayout f1057q;

    /* renamed from: x */
    ActionBarContainer f1062x;

    /* renamed from: y */
    private g0 f1063y;

    /* renamed from: d */
    private int f1043d = 0;

    /* renamed from: c4 */
    private final Rect f1042c4 = new Rect();

    /* renamed from: d4 */
    private final Rect f1044d4 = new Rect();

    /* renamed from: e4 */
    private final Rect f1045e4 = new Rect();

    /* renamed from: f4 */
    private final Rect f1046f4 = new Rect();

    /* renamed from: g4 */
    private final Rect f1047g4 = new Rect();

    /* renamed from: h4 */
    private final Rect f1048h4 = new Rect();

    /* renamed from: i4 */
    private final Rect f1049i4 = new Rect();

    /* renamed from: q4 */
    final AnimatorListenerAdapter f1058q4 = new a();

    /* renamed from: r4 */
    private final Runnable f1059r4 = new b();

    /* renamed from: s4 */
    private final Runnable f1060s4 = new c();

    /* renamed from: t4 */
    private final androidx.core.view.r f1061t4 = new androidx.core.view.r(this);

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1056p4 = null;
            actionBarOverlayLayout.Z3 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1056p4 = null;
            actionBarOverlayLayout.Z3 = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1056p4 = actionBarOverlayLayout.f1062x.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1058q4);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1056p4 = actionBarOverlayLayout.f1062x.animate().translationY(-ActionBarOverlayLayout.this.f1062x.getHeight()).setListener(ActionBarOverlayLayout.this.f1058q4);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z10);

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.j0 j0Var = androidx.core.view.j0.f3681b;
        this.f1050j4 = j0Var;
        this.f1051k4 = j0Var;
        this.f1052l4 = j0Var;
        this.f1053m4 = j0Var;
        v(context);
    }

    private void A() {
        u();
        this.f1059r4.run();
    }

    private boolean B(float f10) {
        this.f1055o4.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1055o4.getFinalY() > this.f1062x.getHeight();
    }

    private void p() {
        u();
        this.f1060s4.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private g0 t(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1038u4);
        boolean z10 = false;
        this.f1041c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.U3 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.V3 = z10;
        this.f1055o4 = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.f1060s4, 600L);
    }

    private void y() {
        u();
        postDelayed(this.f1059r4, 600L);
    }

    @Override // androidx.appcompat.widget.f0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f1063y.a(menu, aVar);
    }

    @Override // androidx.core.view.p
    public void b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public boolean c() {
        z();
        return this.f1063y.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.f0
    public void d() {
        z();
        this.f1063y.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.U3 == null || this.V3) {
            return;
        }
        int bottom = this.f1062x.getVisibility() == 0 ? (int) (this.f1062x.getBottom() + this.f1062x.getTranslationY() + 0.5f) : 0;
        this.U3.setBounds(0, bottom, getWidth(), this.U3.getIntrinsicHeight() + bottom);
        this.U3.draw(canvas);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean e() {
        z();
        return this.f1063y.e();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean f() {
        z();
        return this.f1063y.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean g() {
        z();
        return this.f1063y.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1062x;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1061t4.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f1063y.getTitle();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean h() {
        z();
        return this.f1063y.h();
    }

    @Override // androidx.core.view.p
    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.p
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f1063y.w();
        } else if (i10 == 5) {
            this.f1063y.x();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void l() {
        z();
        this.f1063y.i();
    }

    @Override // androidx.core.view.q
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.p
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.p
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.j0 v10 = androidx.core.view.j0.v(windowInsets, this);
        boolean q10 = q(this.f1062x, new Rect(v10.i(), v10.k(), v10.j(), v10.h()), true, true, false, true);
        androidx.core.view.y.f(this, v10, this.f1042c4);
        Rect rect = this.f1042c4;
        androidx.core.view.j0 l10 = v10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1050j4 = l10;
        boolean z10 = true;
        if (!this.f1051k4.equals(l10)) {
            this.f1051k4 = this.f1050j4;
            q10 = true;
        }
        if (!this.f1044d4.equals(this.f1042c4)) {
            this.f1044d4.set(this.f1042c4);
        } else {
            z10 = q10;
        }
        if (z10) {
            requestLayout();
        }
        return v10.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.y.l0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        androidx.core.view.j0 j0Var;
        z();
        measureChildWithMargins(this.f1062x, i10, 0, i11, 0);
        e eVar = (e) this.f1062x.getLayoutParams();
        int max = Math.max(0, this.f1062x.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1062x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1062x.getMeasuredState());
        boolean z10 = (androidx.core.view.y.K(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z10) {
            i12 = this.f1041c;
            if (this.X3 && this.f1062x.getTabContainer() != null) {
                i12 += this.f1041c;
            }
        } else {
            i12 = this.f1062x.getVisibility() != 8 ? this.f1062x.getMeasuredHeight() : 0;
        }
        this.f1045e4.set(this.f1042c4);
        androidx.core.view.j0 j0Var2 = this.f1050j4;
        this.f1052l4 = j0Var2;
        if (this.W3 || z10) {
            j0Var = new j0.b(this.f1052l4).c(androidx.core.graphics.b.b(j0Var2.i(), this.f1052l4.k() + i12, this.f1052l4.j(), this.f1052l4.h() + 0)).a();
        } else {
            Rect rect = this.f1045e4;
            rect.top += i12;
            rect.bottom += 0;
            j0Var = j0Var2.l(0, i12, 0, 0);
        }
        this.f1052l4 = j0Var;
        q(this.f1057q, this.f1045e4, true, true, true, true);
        if (!this.f1053m4.equals(this.f1052l4)) {
            androidx.core.view.j0 j0Var3 = this.f1052l4;
            this.f1053m4 = j0Var3;
            androidx.core.view.y.g(this.f1057q, j0Var3);
        }
        measureChildWithMargins(this.f1057q, i10, 0, i11, 0);
        e eVar2 = (e) this.f1057q.getLayoutParams();
        int max3 = Math.max(max, this.f1057q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1057q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1057q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.Y3 || !z10) {
            return false;
        }
        if (B(f11)) {
            p();
        } else {
            A();
        }
        this.Z3 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1039a4 + i11;
        this.f1039a4 = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1061t4.b(view, view2, i10);
        this.f1039a4 = getActionBarHideOffset();
        u();
        d dVar = this.f1054n4;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1062x.getVisibility() != 0) {
            return false;
        }
        return this.Y3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.Y3 && !this.Z3) {
            if (this.f1039a4 <= this.f1062x.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f1054n4;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f1040b4 ^ i10;
        this.f1040b4 = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            z10 = true;
        }
        d dVar = this.f1054n4;
        if (dVar != null) {
            dVar.e(!z10);
            if (z11 || !z10) {
                this.f1054n4.a();
            } else {
                this.f1054n4.f();
            }
        }
        if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f1054n4 == null) {
            return;
        }
        androidx.core.view.y.l0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1043d = i10;
        d dVar = this.f1054n4;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f1062x.setTranslationY(-Math.max(0, Math.min(i10, this.f1062x.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1054n4 = dVar;
        if (getWindowToken() != null) {
            this.f1054n4.c(this.f1043d);
            int i10 = this.f1040b4;
            if (i10 == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(i10);
            androidx.core.view.y.l0(this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.X3 = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.Y3) {
            this.Y3 = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f1063y.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f1063y.setIcon(drawable);
    }

    public void setLogo(int i10) {
        z();
        this.f1063y.s(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.W3 = z10;
        this.V3 = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f1063y.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f1063y.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.f1059r4);
        removeCallbacks(this.f1060s4);
        ViewPropertyAnimator viewPropertyAnimator = this.f1056p4;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.W3;
    }

    void z() {
        if (this.f1057q == null) {
            this.f1057q = (ContentFrameLayout) findViewById(e.f.b_res_0x7f090036);
            this.f1062x = (ActionBarContainer) findViewById(e.f.c_res_0x7f090037);
            this.f1063y = t(findViewById(e.f.a_res_0x7f090035));
        }
    }
}
