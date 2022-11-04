package q1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class d extends i0 {

    /* loaded from: classes.dex */
    public class a extends o {

        /* renamed from: a */
        final /* synthetic */ View f19368a;

        a(View view) {
            d.this = r1;
            this.f19368a = view;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            b0.g(this.f19368a, 1.0f);
            b0.a(this.f19368a);
            nVar.W(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f19370a;

        /* renamed from: b */
        private boolean f19371b = false;

        b(View view) {
            this.f19370a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b0.g(this.f19370a, 1.0f);
            if (this.f19371b) {
                this.f19370a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!androidx.core.view.y.O(this.f19370a) || this.f19370a.getLayerType() != 0) {
                return;
            }
            this.f19371b = true;
            this.f19370a.setLayerType(2, null);
        }
    }

    public d() {
    }

    public d(int i10) {
        p0(i10);
    }

    private Animator q0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        b0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, b0.f19338b, f11);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float r0(t tVar, float f10) {
        Float f11;
        return (tVar == null || (f11 = (Float) tVar.f19468a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // q1.i0, q1.n
    public void j(t tVar) {
        super.j(tVar);
        tVar.f19468a.put("android:fade:transitionAlpha", Float.valueOf(b0.c(tVar.f19469b)));
    }

    @Override // q1.i0
    public Animator l0(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        float f10 = 0.0f;
        float r02 = r0(tVar, 0.0f);
        if (r02 != 1.0f) {
            f10 = r02;
        }
        return q0(view, f10, 1.0f);
    }

    @Override // q1.i0
    public Animator n0(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        b0.e(view);
        return q0(view, r0(tVar, 1.0f), 0.0f);
    }
}
