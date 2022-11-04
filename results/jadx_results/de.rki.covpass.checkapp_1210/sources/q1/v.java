package q1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import q1.n;
/* loaded from: classes.dex */
class v {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements n.f {

        /* renamed from: a */
        private final View f19475a;

        /* renamed from: b */
        private final View f19476b;

        /* renamed from: c */
        private final int f19477c;

        /* renamed from: d */
        private final int f19478d;

        /* renamed from: e */
        private int[] f19479e;

        /* renamed from: f */
        private float f19480f;

        /* renamed from: g */
        private float f19481g;

        /* renamed from: h */
        private final float f19482h;

        /* renamed from: i */
        private final float f19483i;

        a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f19476b = view;
            this.f19475a = view2;
            this.f19477c = i10 - Math.round(view.getTranslationX());
            this.f19478d = i11 - Math.round(view.getTranslationY());
            this.f19482h = f10;
            this.f19483i = f11;
            int i12 = i.c_res_0x7f090289;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f19479e = iArr;
            if (iArr != null) {
                view2.setTag(i12, null);
            }
        }

        @Override // q1.n.f
        public void a(n nVar) {
            this.f19476b.setTranslationX(this.f19482h);
            this.f19476b.setTranslationY(this.f19483i);
            nVar.W(this);
        }

        @Override // q1.n.f
        public void b(n nVar) {
        }

        @Override // q1.n.f
        public void c(n nVar) {
        }

        @Override // q1.n.f
        public void d(n nVar) {
        }

        @Override // q1.n.f
        public void e(n nVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f19479e == null) {
                this.f19479e = new int[2];
            }
            this.f19479e[0] = Math.round(this.f19477c + this.f19476b.getTranslationX());
            this.f19479e[1] = Math.round(this.f19478d + this.f19476b.getTranslationY());
            this.f19475a.setTag(i.c_res_0x7f090289, this.f19479e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f19480f = this.f19476b.getTranslationX();
            this.f19481g = this.f19476b.getTranslationY();
            this.f19476b.setTranslationX(this.f19482h);
            this.f19476b.setTranslationY(this.f19483i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f19476b.setTranslationX(this.f19480f);
            this.f19476b.setTranslationY(this.f19481g);
        }
    }

    public static Animator a(View view, t tVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, n nVar) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) tVar.f19469b.getTag(i.c_res_0x7f090289);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int round = i10 + Math.round(f14 - translationX);
        int round2 = i11 + Math.round(f15 - translationY);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, tVar.f19469b, round, round2, translationX, translationY);
        nVar.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        q1.a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
