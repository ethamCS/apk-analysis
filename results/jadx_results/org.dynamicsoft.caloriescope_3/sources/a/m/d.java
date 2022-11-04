package a.m;

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
        final /* synthetic */ View f342a;

        a(d dVar, View view) {
            this.f342a = view;
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            c0.a(this.f342a, 1.0f);
            c0.a(this.f342a);
            mVar.b(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f343a;

        /* renamed from: b */
        private boolean f344b = false;

        b(View view) {
            this.f343a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.a(this.f343a, 1.0f);
            if (this.f344b) {
                this.f343a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!a.g.l.u.z(this.f343a) || this.f343a.getLayerType() != 0) {
                return;
            }
            this.f344b = true;
            this.f343a.setLayerType(2, null);
        }
    }

    public d(int i) {
        a(i);
    }

    private static float a(s sVar, float f) {
        Float f2;
        return (sVar == null || (f2 = (Float) sVar.f390a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        c0.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f341b, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // a.m.j0
    public Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f = 0.0f;
        float a2 = a(sVar, 0.0f);
        if (a2 != 1.0f) {
            f = a2;
        }
        return a(view, f, 1.0f);
    }

    @Override // a.m.j0
    public Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return a(view, a(sVar, 1.0f), 0.0f);
    }

    @Override // a.m.j0, a.m.m
    public void c(s sVar) {
        super.c(sVar);
        sVar.f390a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f391b)));
    }
}
