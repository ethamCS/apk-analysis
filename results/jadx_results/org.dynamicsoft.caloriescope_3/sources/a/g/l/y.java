package a.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    private WeakReference<View> f293a;

    /* renamed from: b */
    Runnable f294b = null;

    /* renamed from: c */
    Runnable f295c = null;
    int d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ z f296a;

        /* renamed from: b */
        final /* synthetic */ View f297b;

        a(y yVar, z zVar, View view) {
            this.f296a = zVar;
            this.f297b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f296a.c(this.f297b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f296a.a(this.f297b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f296a.b(this.f297b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ b0 f298a;

        /* renamed from: b */
        final /* synthetic */ View f299b;

        b(y yVar, b0 b0Var, View view) {
            this.f298a = b0Var;
            this.f299b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f298a.a(this.f299b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements z {

        /* renamed from: a */
        y f300a;

        /* renamed from: b */
        boolean f301b;

        c(y yVar) {
            this.f300a = yVar;
        }

        @Override // a.g.l.z
        public void a(View view) {
            int i = this.f300a.d;
            z zVar = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f300a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f301b) {
                y yVar = this.f300a;
                Runnable runnable = yVar.f295c;
                if (runnable != null) {
                    yVar.f295c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof z) {
                    zVar = (z) tag;
                }
                if (zVar != null) {
                    zVar.a(view);
                }
                this.f301b = true;
            }
        }

        @Override // a.g.l.z
        public void b(View view) {
            this.f301b = false;
            z zVar = null;
            if (this.f300a.d > -1) {
                view.setLayerType(2, null);
            }
            y yVar = this.f300a;
            Runnable runnable = yVar.f294b;
            if (runnable != null) {
                yVar.f294b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof z) {
                zVar = (z) tag;
            }
            if (zVar != null) {
                zVar.b(view);
            }
        }

        @Override // a.g.l.z
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            z zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                zVar.c(view);
            }
        }
    }

    public y(View view) {
        this.f293a = new WeakReference<>(view);
    }

    private void a(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y a(float f) {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public y a(long j) {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public y a(b0 b0Var) {
        View view = this.f293a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public y a(z zVar) {
        View view = this.f293a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, zVar);
                zVar = new c(this);
            }
            a(view, zVar);
        }
        return this;
    }

    public y a(Interpolator interpolator) {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public void a() {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.f293a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public y b(float f) {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public y b(long j) {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = this.f293a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
