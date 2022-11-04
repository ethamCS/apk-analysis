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
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.t;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.a.a.a.f;
import d.a.a.a.l.h;
import d.a.a.a.l.i;
import d.a.a.a.l.j;
import d.a.a.a.p.d;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f3350c;

    /* renamed from: d */
    private final RectF f3351d;

    /* renamed from: e */
    private final RectF f3352e;

    /* renamed from: f */
    private final int[] f3353f;

    /* renamed from: g */
    private float f3354g;

    /* renamed from: h */
    private float f3355h;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3356a;

        /* renamed from: b */
        final /* synthetic */ View f3357b;

        /* renamed from: c */
        final /* synthetic */ View f3358c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f3356a = z;
            this.f3357b = view;
            this.f3358c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3356a) {
                this.f3357b.setVisibility(4);
                this.f3358c.setAlpha(1.0f);
                this.f3358c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f3356a) {
                this.f3357b.setVisibility(0);
                this.f3358c.setAlpha(0.0f);
                this.f3358c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f3359a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f3359a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3359a.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ d.a.a.a.p.d f3360a;

        /* renamed from: b */
        final /* synthetic */ Drawable f3361b;

        c(FabTransformationBehavior fabTransformationBehavior, d.a.a.a.p.d dVar, Drawable drawable) {
            this.f3360a = dVar;
            this.f3361b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3360a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3360a.setCircularRevealOverlayDrawable(this.f3361b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ d.a.a.a.p.d f3362a;

        d(FabTransformationBehavior fabTransformationBehavior, d.a.a.a.p.d dVar) {
            this.f3362a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f3362a.getRevealInfo();
            revealInfo.f3676c = Float.MAX_VALUE;
            this.f3362a.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public h f3363a;

        /* renamed from: b */
        public j f3364b;
    }

    public FabTransformationBehavior() {
        this.f3350c = new Rect();
        this.f3351d = new RectF();
        this.f3352e = new RectF();
        this.f3353f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3350c = new Rect();
        this.f3351d = new RectF();
        this.f3352e = new RectF();
        this.f3353f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.p_res_0x7f09011a);
        return findViewById != null ? f0(findViewById) : ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float S = S(eVar, iVar, f2, f4);
        float S2 = S(eVar, iVar2, f3, f5);
        Rect rect = this.f3350c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f3351d;
        rectF2.set(rect);
        RectF rectF3 = this.f3352e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f3354g, this.f3355h);
    }

    private Pair<i, i> N(float f2, float f3, boolean z, e eVar) {
        String str;
        h hVar;
        i iVar;
        int i;
        if (f2 == 0.0f || f3 == 0.0f) {
            iVar = eVar.f3363a.e("translationXLinear");
            hVar = eVar.f3363a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || i <= 0)) {
            iVar = eVar.f3363a.e("translationXCurveDownwards");
            hVar = eVar.f3363a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f3363a.e("translationXCurveUpwards");
            hVar = eVar.f3363a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.e(str));
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f3351d;
        RectF rectF2 = this.f3352e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f3351d;
        RectF rectF2 = this.f3352e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f3351d;
        RectF rectF2 = this.f3352e;
        M(view, rectF);
        T(view2, rectF2);
        int i = jVar.f3660a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + jVar.f3661b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + jVar.f3661b;
    }

    private float R(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f3351d;
        RectF rectF2 = this.f3352e;
        M(view, rectF);
        T(view2, rectF2);
        int i = jVar.f3660a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + jVar.f3662c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + jVar.f3662c;
    }

    private float S(e eVar, i iVar, float f2, float f3) {
        long c2 = iVar.c();
        long d2 = iVar.d();
        i e2 = eVar.f3363a.e("expansion");
        return d.a.a.a.l.a.a(f2, f3, iVar.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f3353f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof d.a.a.a.p.d) && d.a.a.a.p.c.f3669a == 0) || (K = K(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                d.a.a.a.l.d.f3646a.set(K, Float.valueOf(0.0f));
            }
            objectAnimator = ObjectAnimator.ofFloat(K, d.a.a.a.l.d.f3646a, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(K, d.a.a.a.l.d.f3646a, 0.0f);
        }
        eVar.f3363a.e("contentFade").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof d.a.a.a.p.d)) {
            return;
        }
        d.a.a.a.p.d dVar = (d.a.a.a.p.d) view2;
        int d0 = d0(view);
        int i = 16777215 & d0;
        if (z) {
            if (!z2) {
                dVar.setCircularRevealScrimColor(d0);
            }
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0102d.f3673a, i);
        } else {
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0102d.f3673a, d0);
        }
        objectAnimator.setEvaluator(d.a.a.a.l.c.b());
        eVar.f3363a.e("color").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f3364b);
        float R = R(view, view2, eVar.f3364b);
        Pair<i, i> N = N(Q, R, z, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f3354g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f3355h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t = t.t(view2) - t.t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-t);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -t);
        }
        eVar.f3363a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof d.a.a.a.p.d)) {
            return;
        }
        d.a.a.a.p.d dVar = (d.a.a.a.p.d) view2;
        float O = O(view, view2, eVar.f3364b);
        float P = P(view, view2, eVar.f3364b);
        ((FloatingActionButton) view).i(this.f3350c);
        float width = this.f3350c.width() / 2.0f;
        i e2 = eVar.f3363a.e("expansion");
        if (z) {
            if (!z2) {
                dVar.setRevealInfo(new d.e(O, P, width));
            }
            if (z2) {
                width = dVar.getRevealInfo().f3676c;
            }
            animator = d.a.a.a.p.a.a(dVar, O, P, d.a.a.a.v.a.b(O, P, 0.0f, 0.0f, f2, f3));
            animator.addListener(new d(this, dVar));
            b0(view2, e2.c(), (int) O, (int) P, width, list);
        } else {
            float f4 = dVar.getRevealInfo().f3676c;
            Animator a2 = d.a.a.a.p.a.a(dVar, O, P, width);
            int i = (int) O;
            int i2 = (int) P;
            b0(view2, e2.c(), i, i2, f4, list);
            a0(view2, e2.c(), e2.d(), eVar.f3363a.f(), i, i2, width, list);
            animator = a2;
        }
        e2.a(animator);
        list.add(animator);
        list2.add(d.a.a.a.p.a.b(dVar));
    }

    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof d.a.a.a.p.d) || !(view instanceof ImageView)) {
            return;
        }
        d.a.a.a.p.d dVar = (d.a.a.a.p.d) view2;
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.mutate();
        if (z) {
            if (!z2) {
                drawable.setAlpha(255);
            }
            objectAnimator = ObjectAnimator.ofInt(drawable, d.a.a.a.l.e.f3647b, 0);
        } else {
            objectAnimator = ObjectAnimator.ofInt(drawable, d.a.a.a.l.e.f3647b, 255);
        }
        objectAnimator.addUpdateListener(new b(this, view2));
        eVar.f3363a.e("iconFade").a(objectAnimator);
        list.add(objectAnimator);
        list2.add(new c(this, dVar, drawable));
    }

    private void a0(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 >= j3) {
                return;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void b0(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    private void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float Q = Q(view, view2, eVar.f3364b);
        float R = R(view, view2, eVar.f3364b);
        Pair<i, i> N = N(Q, R, z, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z) {
            if (!z2) {
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
        ColorStateList p = t.p(view);
        if (p != null) {
            return p.getColorForState(view.getDrawableState(), p.getDefaultColor());
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
    protected AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        e e0 = e0(view2.getContext(), z);
        if (z) {
            this.f3354g = view.getTranslationX();
            this.f3355h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f3351d;
        c0(view, view2, z, z2, e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z, e0, arrayList);
        Z(view, view2, z, z2, e0, arrayList, arrayList2);
        Y(view, view2, z, z2, e0, width, height, arrayList, arrayList2);
        V(view, view2, z, z2, e0, arrayList, arrayList2);
        U(view, view2, z, z2, e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        d.a.a.a.l.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
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

    protected abstract e e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f859h == 0) {
            fVar.f859h = 80;
        }
    }
}
