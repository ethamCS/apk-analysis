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
    private int f2933a = 0;

    /* renamed from: b */
    private int f2934b = 2;

    /* renamed from: c */
    private int f2935c = 0;

    /* renamed from: d */
    private ViewPropertyAnimator f2936d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            HideBottomViewOnScrollBehavior.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2936d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f2936d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public void G(V v, int i) {
        this.f2935c = i;
        if (this.f2934b == 1) {
            v.setTranslationY(this.f2933a + i);
        }
    }

    public void H(V v) {
        if (this.f2934b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2936d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f2934b = 1;
        F(v, this.f2933a + this.f2935c, 175L, d.a.a.a.l.a.f3642c);
    }

    public void I(V v) {
        if (this.f2934b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2936d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f2934b = 2;
        F(v, 0, 225L, d.a.a.a.l.a.f3643d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f2933a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            H(v);
        } else if (i2 >= 0) {
        } else {
            I(v);
        }
    }
}
