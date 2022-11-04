package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    private final WeakReference<View> f3665a;

    /* renamed from: b */
    Runnable f3666b = null;

    /* renamed from: c */
    Runnable f3667c = null;

    /* renamed from: d */
    int f3668d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ f0 f3669a;

        /* renamed from: b */
        final /* synthetic */ View f3670b;

        a(f0 f0Var, View view) {
            e0.this = r1;
            this.f3669a = f0Var;
            this.f3670b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3669a.a(this.f3670b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3669a.b(this.f3670b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3669a.c(this.f3670b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public e0(View view) {
        this.f3665a = new WeakReference<>(view);
    }

    private void i(View view, f0 f0Var) {
        if (f0Var != null) {
            view.animate().setListener(new a(f0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public e0 b(float f10) {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f3665a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public e0 f(long j10) {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public e0 g(Interpolator interpolator) {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public e0 h(f0 f0Var) {
        View view = this.f3665a.get();
        if (view != null) {
            i(view, f0Var);
        }
        return this;
    }

    public e0 j(long j10) {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public e0 k(final h0 h0Var) {
        final View view = this.f3665a.get();
        if (view != null) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (h0Var != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.d0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        h0.this.a(view);
                    }
                };
            }
            b.a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public void l() {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public e0 m(float f10) {
        View view = this.f3665a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
