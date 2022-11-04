package b.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    private WeakReference<View> f2584a;

    /* renamed from: b */
    Runnable f2585b = null;

    /* renamed from: c */
    Runnable f2586c = null;

    /* renamed from: d */
    int f2587d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ y f2588a;

        /* renamed from: b */
        final /* synthetic */ View f2589b;

        a(x xVar, y yVar, View view) {
            this.f2588a = yVar;
            this.f2589b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2588a.c(this.f2589b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2588a.a(this.f2589b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2588a.b(this.f2589b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ a0 f2590a;

        /* renamed from: b */
        final /* synthetic */ View f2591b;

        b(x xVar, a0 a0Var, View view) {
            this.f2590a = a0Var;
            this.f2591b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2590a.a(this.f2591b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements y {

        /* renamed from: a */
        x f2592a;

        /* renamed from: b */
        boolean f2593b;

        c(x xVar) {
            this.f2592a = xVar;
        }

        @Override // b.g.l.y
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i = this.f2592a.f2587d;
            y yVar = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f2592a.f2587d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f2593b) {
                x xVar = this.f2592a;
                Runnable runnable = xVar.f2586c;
                if (runnable != null) {
                    xVar.f2586c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof y) {
                    yVar = (y) tag;
                }
                if (yVar != null) {
                    yVar.a(view);
                }
                this.f2593b = true;
            }
        }

        @Override // b.g.l.y
        public void b(View view) {
            this.f2593b = false;
            y yVar = null;
            if (this.f2592a.f2587d > -1) {
                view.setLayerType(2, null);
            }
            x xVar = this.f2592a;
            Runnable runnable = xVar.f2585b;
            if (runnable != null) {
                xVar.f2585b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof y) {
                yVar = (y) tag;
            }
            if (yVar != null) {
                yVar.b(view);
            }
        }

        @Override // b.g.l.y
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            y yVar = tag instanceof y ? (y) tag : null;
            if (yVar != null) {
                yVar.c(view);
            }
        }
    }

    public x(View view) {
        this.f2584a = new WeakReference<>(view);
    }

    private void g(View view, y yVar) {
        if (yVar != null) {
            view.animate().setListener(new a(this, yVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x a(float f2) {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f2584a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public x d(long j) {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public x e(Interpolator interpolator) {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x f(y yVar) {
        View view = this.f2584a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, yVar);
                yVar = new c(this);
            }
            g(view, yVar);
        }
        return this;
    }

    public x h(long j) {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public x i(a0 a0Var) {
        View view = this.f2584a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (a0Var != null) {
                bVar = new b(this, a0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x k(float f2) {
        View view = this.f2584a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
