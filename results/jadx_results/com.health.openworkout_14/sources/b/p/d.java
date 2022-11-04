package b.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class d extends j0 {

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a */
        final /* synthetic */ View f2704a;

        a(d dVar, View view) {
            this.f2704a = view;
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            c0.g(this.f2704a, 1.0f);
            c0.a(this.f2704a);
            mVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f2705a;

        /* renamed from: b */
        private boolean f2706b = false;

        b(View view) {
            this.f2705a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f2705a, 1.0f);
            if (this.f2706b) {
                this.f2705a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!b.g.l.t.K(this.f2705a) || this.f2705a.getLayerType() != 0) {
                return;
            }
            this.f2706b = true;
            this.f2705a.setLayerType(2, null);
        }
    }

    public d(int i) {
        m0(i);
    }

    private Animator n0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f2703b, f3);
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    private static float o0(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.f2780a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // b.p.j0
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float o0 = o0(sVar, 0.0f);
        if (o0 != 1.0f) {
            f2 = o0;
        }
        return n0(view, f2, 1.0f);
    }

    @Override // b.p.j0
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return n0(view, o0(sVar, 1.0f), 0.0f);
    }

    @Override // b.p.j0, b.p.m
    public void l(s sVar) {
        super.l(sVar);
        sVar.f2780a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f2781b)));
    }
}
