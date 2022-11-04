package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import b5.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int Z4 = k.f5495n;
    private Integer G4;
    private final int H4;
    private final t5.g I4;
    private Animator J4;
    private Animator K4;
    private int L4;
    private int M4;
    private boolean N4;
    private int O4;
    private ArrayList<g> P4;
    private int Q4;
    private boolean R4;
    private boolean S4;
    private Behavior T4;
    private int U4;
    private int V4;
    private int W4;
    AnimatorListenerAdapter X4;
    c5.k<FloatingActionButton> Y4;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: f */
        private WeakReference<BottomAppBar> f6889f;

        /* renamed from: g */
        private int f6890g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f6891h = new a();

        /* renamed from: e */
        private final Rect f6888e = new Rect();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            a() {
                Behavior.this = r1;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f6889f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.f6888e);
                int height = Behavior.this.f6888e.height();
                bottomAppBar.D0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f6888e)));
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f6890g != 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(b5.d.J) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                if (o.e(floatingActionButton)) {
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.H4;
                } else {
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.H4;
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: Q */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f6889f = new WeakReference<>(bottomAppBar);
            View s02 = bottomAppBar.s0();
            if (s02 != null && !y.S(s02)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) s02.getLayoutParams();
                fVar.f3321d = 49;
                this.f6890g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (s02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) s02;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(b5.a.b_res_0x7f02001d);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(b5.a.a_res_0x7f02001c);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f6891h);
                    bottomAppBar.k0(floatingActionButton);
                }
                bottomAppBar.B0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: R */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.p0();
            BottomAppBar.this.J4 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.q0();
        }
    }

    /* loaded from: classes.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a */
        final /* synthetic */ int f6894a;

        /* loaded from: classes.dex */
        class a extends FloatingActionButton.b {
            a() {
                b.this = r1;
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.p0();
            }
        }

        b(int i10) {
            BottomAppBar.this = r1;
            this.f6894a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.u0(this.f6894a));
            floatingActionButton.s(new a());
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.p0();
            BottomAppBar.this.R4 = false;
            BottomAppBar.this.K4 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.q0();
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f6898a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f6899b;

        /* renamed from: c */
        final /* synthetic */ int f6900c;

        /* renamed from: d */
        final /* synthetic */ boolean f6901d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            BottomAppBar.this = r1;
            this.f6899b = actionMenuView;
            this.f6900c = i10;
            this.f6901d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6898a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f6898a) {
                boolean z10 = BottomAppBar.this.Q4 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.z0(bottomAppBar.Q4);
                BottomAppBar.this.F0(this.f6899b, this.f6900c, this.f6901d, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ActionMenuView f6903c;

        /* renamed from: d */
        final /* synthetic */ int f6904d;

        /* renamed from: q */
        final /* synthetic */ boolean f6905q;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            BottomAppBar.this = r1;
            this.f6903c = actionMenuView;
            this.f6904d = i10;
            this.f6905q = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f6903c;
            actionMenuView.setTranslationX(BottomAppBar.this.t0(actionMenuView, this.f6904d, this.f6905q));
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.X4.onAnimationStart(animator);
            FloatingActionButton r02 = BottomAppBar.this.r0();
            if (r02 != null) {
                r02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* loaded from: classes.dex */
    public static class h extends v0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: q */
        int f6908q;

        /* renamed from: x */
        boolean f6909x;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6908q = parcel.readInt();
            this.f6909x = parcel.readInt() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6908q);
            parcel.writeInt(this.f6909x ? 1 : 0);
        }
    }

    private void A0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.K4 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!v0()) {
            E0(actionMenuView, 0, false);
        } else {
            E0(actionMenuView, this.L4, this.S4);
        }
    }

    public void B0() {
        getTopEdgeTreatment().o(getFabTranslationX());
        View s02 = s0();
        this.I4.a0((!this.S4 || !v0()) ? 0.0f : 1.0f);
        if (s02 != null) {
            s02.setTranslationY(getFabTranslationY());
            s02.setTranslationX(getFabTranslationX());
        }
    }

    private void E0(ActionMenuView actionMenuView, int i10, boolean z10) {
        F0(actionMenuView, i10, z10, false);
    }

    public void F0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return this.U4;
    }

    public float getFabTranslationX() {
        return u0(this.L4);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    public int getLeftInset() {
        return this.W4;
    }

    public int getRightInset() {
        return this.V4;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.I4.E().p();
    }

    public void k0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.X4);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.Y4);
    }

    private void l0() {
        Animator animator = this.K4;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.J4;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void n0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r0(), "translationX", u0(i10));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void o0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - t0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() >= 1.0f) {
                return;
            }
            list.add(ofFloat);
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
        ofFloat2.addListener(new d(actionMenuView, i10, z10));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playSequentially(ofFloat2, ofFloat);
        list.add(animatorSet);
    }

    public void p0() {
        ArrayList<g> arrayList;
        int i10 = this.O4 - 1;
        this.O4 = i10;
        if (i10 != 0 || (arrayList = this.P4) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public void q0() {
        ArrayList<g> arrayList;
        int i10 = this.O4;
        this.O4 = i10 + 1;
        if (i10 != 0 || (arrayList = this.P4) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public FloatingActionButton r0() {
        View s02 = s0();
        if (s02 instanceof FloatingActionButton) {
            return (FloatingActionButton) s02;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View s0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.s0():android.view.View");
    }

    public float u0(int i10) {
        boolean e10 = o.e(this);
        int i11 = 1;
        if (i10 == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) - (this.H4 + (e10 ? this.W4 : this.V4));
            if (e10) {
                i11 = -1;
            }
            return measuredWidth * i11;
        }
        return 0.0f;
    }

    private boolean v0() {
        FloatingActionButton r02 = r0();
        return r02 != null && r02.o();
    }

    private void w0(int i10, boolean z10) {
        if (!y.S(this)) {
            this.R4 = false;
            z0(this.Q4);
            return;
        }
        Animator animator = this.K4;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!v0()) {
            i10 = 0;
            z10 = false;
        }
        o0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.K4 = animatorSet;
        animatorSet.addListener(new c());
        this.K4.start();
    }

    private void x0(int i10) {
        if (this.L4 == i10 || !y.S(this)) {
            return;
        }
        Animator animator = this.J4;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.M4 == 1) {
            n0(i10, arrayList);
        } else {
            m0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.J4 = animatorSet;
        animatorSet.addListener(new a());
        this.J4.start();
    }

    private Drawable y0(Drawable drawable) {
        if (drawable == null || this.G4 == null) {
            return drawable;
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(r10, this.G4.intValue());
        return r10;
    }

    public void C0(int i10, int i11) {
        this.Q4 = i11;
        this.R4 = true;
        w0(i10, this.S4);
        x0(i10);
        this.L4 = i10;
    }

    boolean D0(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().h()) {
            getTopEdgeTreatment().m(f10);
            this.I4.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.I4.G();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.T4 == null) {
            this.T4 = new Behavior();
        }
        return this.T4;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.L4;
    }

    public int getFabAnimationMode() {
        return this.M4;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.N4;
    }

    protected void m0(int i10, List<Animator> list) {
        FloatingActionButton r02 = r0();
        if (r02 == null || r02.n()) {
            return;
        }
        q0();
        r02.l(new b(i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5.h.f(this, this.I4);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l0();
            B0();
        }
        A0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.L4 = hVar.f6908q;
        this.S4 = hVar.f6909x;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f6908q = this.L4;
        hVar.f6909x = this.S4;
        return hVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.I4, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f10);
            this.I4.invalidateSelf();
            B0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.I4.Y(f10);
        getBehavior().I(this, this.I4.D() - this.I4.C());
    }

    public void setFabAlignmentMode(int i10) {
        C0(i10, 0);
    }

    public void setFabAnimationMode(int i10) {
        this.M4 = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().j(f10);
            this.I4.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f10);
            this.I4.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f10);
            this.I4.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.N4 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(y0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.G4 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    protected int t0(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 != 1 || !z10) {
            return 0;
        }
        boolean e10 = o.e(this);
        int measuredWidth = e10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f706a & 8388615) == 8388611) {
                measuredWidth = e10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((e10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (e10 ? this.V4 : -this.W4));
    }

    public void z0(int i10) {
        if (i10 != 0) {
            this.Q4 = 0;
            getMenu().clear();
            y(i10);
        }
    }
}
