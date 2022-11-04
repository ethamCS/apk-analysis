package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    private int f6866a = 0;

    /* renamed from: b */
    private int f6867b = 2;

    /* renamed from: c */
    private int f6868c = 0;

    /* renamed from: d */
    private ViewPropertyAnimator f6869d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            HideBottomViewOnScrollBehavior.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f6869d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f6869d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f6867b == 1;
    }

    public boolean H() {
        return this.f6867b == 2;
    }

    public void I(V v10, int i10) {
        this.f6868c = i10;
        if (this.f6867b == 1) {
            v10.setTranslationY(this.f6866a + i10);
        }
    }

    public void J(V v10) {
        K(v10, true);
    }

    public void K(V v10, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f6869d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f6867b = 1;
        int i10 = this.f6866a + this.f6868c;
        if (z10) {
            F(v10, i10, 175L, c5.a.f6269c);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void L(V v10) {
        M(v10, true);
    }

    public void M(V v10, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f6869d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f6867b = 2;
        if (z10) {
            F(v10, 0, 225L, c5.a.f6270d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f6866a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            J(v10);
        } else if (i11 >= 0) {
        } else {
            L(v10);
        }
    }
}
