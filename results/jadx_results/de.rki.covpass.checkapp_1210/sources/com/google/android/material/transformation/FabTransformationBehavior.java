package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import b5.f;
import c5.h;
import c5.i;
import c5.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import g5.d;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f7793c;

    /* renamed from: d */
    private final RectF f7794d;

    /* renamed from: e */
    private final RectF f7795e;

    /* renamed from: f */
    private final int[] f7796f;

    /* renamed from: g */
    private float f7797g;

    /* renamed from: h */
    private float f7798h;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7799a;

        /* renamed from: b */
        final /* synthetic */ View f7800b;

        /* renamed from: c */
        final /* synthetic */ View f7801c;

        a(boolean z10, View view, View view2) {
            FabTransformationBehavior.this = r1;
            this.f7799a = z10;
            this.f7800b = view;
            this.f7801c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f7799a) {
                this.f7800b.setVisibility(4);
                this.f7801c.setAlpha(1.0f);
                this.f7801c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f7799a) {
                this.f7800b.setVisibility(0);
                this.f7801c.setAlpha(0.0f);
                this.f7801c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f7803a;

        b(View view) {
            FabTransformationBehavior.this = r1;
            this.f7803a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7803a.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ g5.d f7805a;

        /* renamed from: b */
        final /* synthetic */ Drawable f7806b;

        c(g5.d dVar, Drawable drawable) {
            FabTransformationBehavior.this = r1;
            this.f7805a = dVar;
            this.f7806b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7805a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f7805a.setCircularRevealOverlayDrawable(this.f7806b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ g5.d f7808a;

        d(g5.d dVar) {
            FabTransformationBehavior.this = r1;
            this.f7808a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f7808a.getRevealInfo();
            revealInfo.f10539c = Float.MAX_VALUE;
            this.f7808a.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public h f7810a;

        /* renamed from: b */
        public j f7811b;
    }

    public FabTransformationBehavior() {
        this.f7793c = new Rect();
        this.f7794d = new RectF();
        this.f7795e = new RectF();
        this.f7796f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7793c = new Rect();
        this.f7794d = new RectF();
        this.f7795e = new RectF();
        this.f7796f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.C_res_0x7f09018a);
        return findViewById != null ? f0(findViewById) : ((view instanceof w5.b) || (view instanceof w5.a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float S = S(eVar, iVar, f10, f12);
        float S2 = S(eVar, iVar2, f11, f13);
        Rect rect = this.f7793c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f7794d;
        rectF2.set(rect);
        RectF rectF3 = this.f7795e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f7797g, this.f7798h);
    }

    private Pair<i, i> N(float f10, float f11, boolean z10, e eVar) {
        String str;
        h hVar;
        i iVar;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVar = eVar.f7810a.e("translationXLinear");
            hVar = eVar.f7810a;
            str = "translationYLinear";
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            iVar = eVar.f7810a.e("translationXCurveDownwards");
            hVar = eVar.f7810a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f7810a.e("translationXCurveUpwards");
            hVar = eVar.f7810a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.e(str));
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f7794d;
        RectF rectF2 = this.f7795e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f7794d;
        RectF rectF2 = this.f7795e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f7794d;
        RectF rectF2 = this.f7795e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f6287a & 7;
        if (i10 == 1) {
            f12 = rectF2.centerX();
            f11 = rectF.centerX();
        } else if (i10 == 3) {
            f12 = rectF2.left;
            f11 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + jVar.f6288b;
        } else {
            f12 = rectF2.right;
            f11 = rectF.right;
        }
        f10 = f12 - f11;
        return f10 + jVar.f6288b;
    }

    private float R(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f7794d;
        RectF rectF2 = this.f7795e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f6287a & 112;
        if (i10 == 16) {
            f12 = rectF2.centerY();
            f11 = rectF.centerY();
        } else if (i10 == 48) {
            f12 = rectF2.top;
            f11 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + jVar.f6289c;
        } else {
            f12 = rectF2.bottom;
            f11 = rectF.bottom;
        }
        f10 = f12 - f11;
        return f10 + jVar.f6289c;
    }

    private float S(e eVar, i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i e10 = eVar.f7810a.e("expansion");
        return c5.a.a(f10, f11, iVar.e().getInterpolation(((float) (((e10.c() + e10.d()) + 17) - c10)) / ((float) d10)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f7796f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof g5.d) && g5.c.f10532a == 0) || (K = K(view2)) == null) {
            return;
        }
        if (z10) {
            if (!z11) {
                c5.d.f6273a.set(K, Float.valueOf(0.0f));
            }
            objectAnimator = ObjectAnimator.ofFloat(K, c5.d.f6273a, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(K, c5.d.f6273a, 0.0f);
        }
        eVar.f7810a.e("contentFade").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void V(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof g5.d)) {
            return;
        }
        g5.d dVar = (g5.d) view2;
        int d02 = d0(view);
        int i10 = 16777215 & d02;
        if (z10) {
            if (!z11) {
                dVar.setCircularRevealScrimColor(d02);
            }
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0154d.f10536a, i10);
        } else {
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0154d.f10536a, d02);
        }
        objectAnimator.setEvaluator(c5.c.b());
        eVar.f7810a.e("color").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void W(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f7811b);
        float R = R(view, view2, eVar.f7811b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            Q = this.f7797g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            R = this.f7798h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w9 = y.w(view2) - y.w(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-w9);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -w9);
        }
        eVar.f7810a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof g5.d)) {
            return;
        }
        g5.d dVar = (g5.d) view2;
        float O = O(view, view2, eVar.f7811b);
        float P = P(view, view2, eVar.f7811b);
        ((FloatingActionButton) view).i(this.f7793c);
        float width = this.f7793c.width() / 2.0f;
        i e10 = eVar.f7810a.e("expansion");
        if (z10) {
            if (!z11) {
                dVar.setRevealInfo(new d.e(O, P, width));
            }
            if (z11) {
                width = dVar.getRevealInfo().f10539c;
            }
            animator = g5.a.a(dVar, O, P, n5.a.b(O, P, 0.0f, 0.0f, f10, f11));
            animator.addListener(new d(dVar));
            b0(view2, e10.c(), (int) O, (int) P, width, list);
        } else {
            float f12 = dVar.getRevealInfo().f10539c;
            Animator a10 = g5.a.a(dVar, O, P, width);
            int i10 = (int) O;
            int i11 = (int) P;
            b0(view2, e10.c(), i10, i11, f12, list);
            a0(view2, e10.c(), e10.d(), eVar.f7810a.f(), i10, i11, width, list);
            animator = a10;
        }
        e10.a(animator);
        list.add(animator);
        list2.add(g5.a.b(dVar));
    }

    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof g5.d) || !(view instanceof ImageView)) {
            return;
        }
        g5.d dVar = (g5.d) view2;
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.mutate();
        if (z10) {
            if (!z11) {
                drawable.setAlpha(255);
            }
            objectAnimator = ObjectAnimator.ofInt(drawable, c5.e.f6274b, 0);
        } else {
            objectAnimator = ObjectAnimator.ofInt(drawable, c5.e.f6274b, 255);
        }
        objectAnimator.addUpdateListener(new b(view2));
        eVar.f7810a.e("iconFade").a(objectAnimator);
        list.add(objectAnimator);
        list2.add(new c(dVar, drawable));
    }

    private void a0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    private void b0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float Q = Q(view, view2, eVar.f7811b);
        float R = R(view, view2, eVar.f7811b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.a(objectAnimator2);
        iVar2.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    private int d0(View view) {
        ColorStateList s10 = y.s(view);
        if (s10 != null) {
            return s10.getColorForState(view.getDrawableState(), s10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        e e02 = e0(view2.getContext(), z10);
        if (z10) {
            this.f7797g = view.getTranslationX();
            this.f7798h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        X(view, view2, z10, z11, e02, arrayList, arrayList2);
        RectF rectF = this.f7794d;
        c0(view, view2, z10, z11, e02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z10, e02, arrayList);
        Z(view, view2, z10, z11, e02, arrayList, arrayList2);
        Y(view, view2, z10, z11, e02, width, height, arrayList, arrayList2);
        V(view, view2, z10, z11, e02, arrayList, arrayList2);
        U(view, view2, z10, z11, e02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        c5.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    protected abstract e e0(Context context, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f3325h == 0) {
            fVar.f3325h = 80;
        }
    }
}
