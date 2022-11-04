package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.u;
import b.g.h.a;
/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class a implements a.AbstractC0045a {

        /* renamed from: a */
        final /* synthetic */ Fragment f1042a;

        a(Fragment fragment) {
            this.f1042a = fragment;
        }

        @Override // b.g.h.a.AbstractC0045a
        public void a() {
            if (this.f1042a.p() != null) {
                View p = this.f1042a.p();
                this.f1042a.m1(null);
                p.clearAnimation();
            }
            this.f1042a.n1(null);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1043a;

        /* renamed from: b */
        final /* synthetic */ Fragment f1044b;

        /* renamed from: c */
        final /* synthetic */ u.g f1045c;

        /* renamed from: d */
        final /* synthetic */ b.g.h.a f1046d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
                b.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f1044b.p() != null) {
                    b.this.f1044b.m1(null);
                    b bVar = b.this;
                    bVar.f1045c.a(bVar.f1044b, bVar.f1046d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, u.g gVar, b.g.h.a aVar) {
            this.f1043a = viewGroup;
            this.f1044b = fragment;
            this.f1045c = gVar;
            this.f1046d = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1043a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1048a;

        /* renamed from: b */
        final /* synthetic */ View f1049b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1050c;

        /* renamed from: d */
        final /* synthetic */ u.g f1051d;

        /* renamed from: e */
        final /* synthetic */ b.g.h.a f1052e;

        c(ViewGroup viewGroup, View view, Fragment fragment, u.g gVar, b.g.h.a aVar) {
            this.f1048a = viewGroup;
            this.f1049b = view;
            this.f1050c = fragment;
            this.f1051d = gVar;
            this.f1052e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1048a.endViewTransition(this.f1049b);
            Animator q = this.f1050c.q();
            this.f1050c.n1(null);
            if (q == null || this.f1048a.indexOfChild(this.f1049b) >= 0) {
                return;
            }
            this.f1051d.a(this.f1050c, this.f1052e);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final Animation f1053a;

        /* renamed from: b */
        public final Animator f1054b;

        d(Animator animator) {
            this.f1053a = null;
            this.f1054b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        d(Animation animation) {
            this.f1053a = animation;
            this.f1054b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    public static class RunnableC0018e extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f1055b;

        /* renamed from: c */
        private final View f1056c;

        /* renamed from: d */
        private boolean f1057d;

        /* renamed from: e */
        private boolean f1058e;

        /* renamed from: f */
        private boolean f1059f = true;

        RunnableC0018e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1055b = viewGroup;
            this.f1056c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f1059f = true;
            if (this.f1057d) {
                return !this.f1058e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1057d = true;
                b.g.l.r.a(this.f1055b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1059f = true;
            if (this.f1057d) {
                return !this.f1058e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1057d = true;
                b.g.l.r.a(this.f1055b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1057d || !this.f1059f) {
                this.f1055b.endViewTransition(this.f1056c);
                this.f1058e = true;
                return;
            }
            this.f1059f = false;
            this.f1055b.post(this);
        }
    }

    public static void a(Fragment fragment, d dVar, u.g gVar) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        b.g.h.a aVar = new b.g.h.a();
        aVar.c(new a(fragment));
        gVar.b(fragment, aVar);
        if (dVar.f1053a != null) {
            RunnableC0018e runnableC0018e = new RunnableC0018e(dVar.f1053a, viewGroup, view);
            fragment.m1(fragment.H);
            runnableC0018e.setAnimationListener(new b(viewGroup, fragment, gVar, aVar));
            fragment.H.startAnimation(runnableC0018e);
            return;
        }
        Animator animator = dVar.f1054b;
        fragment.n1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, aVar));
        animator.setTarget(fragment.H);
        animator.start();
    }

    public static d b(Context context, f fVar, Fragment fragment, boolean z) {
        int c2;
        int D = fragment.D();
        int C = fragment.C();
        boolean z2 = false;
        fragment.r1(0);
        View e2 = fVar.e(fragment.x);
        if (e2 != null) {
            int i = b.k.b.b_res_0x7f0901f6;
            if (e2.getTag(i) != null) {
                e2.setTag(i, null);
            }
        }
        ViewGroup viewGroup = fragment.G;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation j0 = fragment.j0(D, z, C);
            if (j0 != null) {
                return new d(j0);
            }
            Animator k0 = fragment.k0(D, z, C);
            if (k0 != null) {
                return new d(k0);
            }
            if (C != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(C));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, C);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z2 = true;
                    } catch (Resources.NotFoundException e3) {
                        throw e3;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z2) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, C);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e4) {
                        if (equals) {
                            throw e4;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    }
                }
            }
            if (D == 0 || (c2 = c(D, z)) < 0) {
                return null;
            }
            return new d(AnimationUtils.loadAnimation(context, c2));
        }
        return null;
    }

    private static int c(int i, boolean z) {
        if (i == 4097) {
            return z ? b.k.a.f2631e : b.k.a.f2632f;
        } else if (i == 4099) {
            return z ? b.k.a.f2629c : b.k.a.f2630d;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? b.k.a.f2627a : b.k.a.f2628b;
        }
    }
}
