package com.google.android.material.transformation;

import a.g.l.u;
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
import b.a.a.a.f;
import b.a.a.a.m.h;
import b.a.a.a.m.i;
import b.a.a.a.m.j;
import b.a.a.a.r.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f1607c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f1608a;

        /* renamed from: b */
        final /* synthetic */ View f1609b;

        /* renamed from: c */
        final /* synthetic */ View f1610c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f1608a = z;
            this.f1609b = view;
            this.f1610c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f1608a) {
                this.f1609b.setVisibility(4);
                this.f1610c.setAlpha(1.0f);
                this.f1610c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f1608a) {
                this.f1609b.setVisibility(0);
                this.f1610c.setAlpha(0.0f);
                this.f1610c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f1611a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f1611a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1611a.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ b.a.a.a.r.d f1612a;

        /* renamed from: b */
        final /* synthetic */ Drawable f1613b;

        c(FabTransformationBehavior fabTransformationBehavior, b.a.a.a.r.d dVar, Drawable drawable) {
            this.f1612a = dVar;
            this.f1613b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1612a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1612a.setCircularRevealOverlayDrawable(this.f1613b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ b.a.a.a.r.d f1614a;

        d(FabTransformationBehavior fabTransformationBehavior, b.a.a.a.r.d dVar) {
            this.f1614a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f1614a.getRevealInfo();
            revealInfo.f1241c = Float.MAX_VALUE;
            this.f1614a.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public h f1615a;

        /* renamed from: b */
        public j f1616b;
    }

    public FabTransformationBehavior() {
        this.f1607c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1607c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private float a(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(-c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float a(e eVar, i iVar, float f, float f2) {
        long a2 = iVar.a();
        long b2 = iVar.b();
        i a3 = eVar.f1615a.a("expansion");
        return b.a.a.a.m.a.a(f, f2, iVar.c().getInterpolation(((float) (((a3.a() + a3.b()) + 17) - a2)) / ((float) b2)));
    }

    private Pair<i, i> a(float f, float f2, boolean z, e eVar) {
        String str;
        h hVar;
        i iVar;
        if (f == 0.0f || f2 == 0.0f) {
            iVar = eVar.f1615a.a("translationXLinear");
            hVar = eVar.f1615a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar = eVar.f1615a.a("translationXCurveDownwards");
            hVar = eVar.f1615a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f1615a.a("translationXCurveUpwards");
            hVar = eVar.f1615a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.a(str));
    }

    private ViewGroup a(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        return findViewById != null ? c(findViewById) : ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? c(((ViewGroup) view).getChildAt(0)) : c(view);
    }

    private void a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    private void a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 >= j3) {
                return;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, RectF rectF) {
        b(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private void a(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float c2 = c(view, view2, eVar.f1616b);
        float d2 = d(view, view2, eVar.f1616b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c2 = this.g;
        }
        fArr[0] = c2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d2 = this.h;
        }
        fArr2[0] = d2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a((Animator) ofFloat);
        iVar2.a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof b.a.a.a.r.d)) {
            return;
        }
        b.a.a.a.r.d dVar = (b.a.a.a.r.d) view2;
        float a2 = a(view, view2, eVar.f1616b);
        float b2 = b(view, view2, eVar.f1616b);
        ((FloatingActionButton) view).a(this.f1607c);
        float width = this.f1607c.width() / 2.0f;
        i a3 = eVar.f1615a.a("expansion");
        if (z) {
            if (!z2) {
                dVar.setRevealInfo(new d.e(a2, b2, width));
            }
            if (z2) {
                width = dVar.getRevealInfo().f1241c;
            }
            animator = b.a.a.a.r.a.a(dVar, a2, b2, b.a.a.a.w.a.a(a2, b2, 0.0f, 0.0f, f, f2));
            animator.addListener(new d(this, dVar));
            a(view2, a3.a(), (int) a2, (int) b2, width, list);
        } else {
            float f3 = dVar.getRevealInfo().f1241c;
            Animator a4 = b.a.a.a.r.a.a(dVar, a2, b2, width);
            int i = (int) a2;
            int i2 = (int) b2;
            a(view2, a3.a(), i, i2, f3, list);
            a(view2, a3.a(), a3.b(), eVar.f1615a.a(), i, i2, width, list);
            animator = a4;
        }
        a3.a(animator);
        list.add(animator);
        list2.add(b.a.a.a.r.a.a(dVar));
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a2;
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof b.a.a.a.r.d) && b.a.a.a.r.c.f1234a == 0) || (a2 = a(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                b.a.a.a.m.d.f1212a.set(a2, Float.valueOf(0.0f));
            }
            objectAnimator = ObjectAnimator.ofFloat(a2, b.a.a.a.m.d.f1212a, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(a2, b.a.a.a.m.d.f1212a, 0.0f);
        }
        eVar.f1615a.a("contentFade").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float c2 = c(view, view2, eVar.f1616b);
        float d2 = d(view, view2, eVar.f1616b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-c2);
                view2.setTranslationY(-d2);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            a(view2, eVar, iVar, iVar2, -c2, -d2, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -c2);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d2);
        }
        iVar.a((Animator) objectAnimator2);
        iVar2.a((Animator) objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    private void a(View view, e eVar, i iVar, i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a2 = a(eVar, iVar, f, f3);
        float a3 = a(eVar, iVar2, f2, f4);
        Rect rect = this.f1607c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        b(view, rectF3);
        rectF3.offset(a2, a3);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float b(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(0.0f, -d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private int b(View view) {
        ColorStateList g = u.g(view);
        if (g != null) {
            return g.getColorForState(view.getDrawableState(), g.getDefaultColor());
        }
        return 0;
    }

    private void b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void b(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof b.a.a.a.r.d)) {
            return;
        }
        b.a.a.a.r.d dVar = (b.a.a.a.r.d) view2;
        int b2 = b(view);
        int i = 16777215 & b2;
        if (z) {
            if (!z2) {
                dVar.setCircularRevealScrimColor(b2);
            }
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0053d.f1238a, i);
        } else {
            objectAnimator = ObjectAnimator.ofInt(dVar, d.C0053d.f1238a, b2);
        }
        objectAnimator.setEvaluator(b.a.a.a.m.c.a());
        eVar.f1615a.a("color").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private float c(View view, View view2, j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f1224a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f1225b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f1225b;
    }

    private ViewGroup c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    private void c(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float k = u.k(view2) - u.k(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-k);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -k);
        }
        eVar.f1615a.a("elevation").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private float d(View view, View view2, j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f1224a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f1226c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f1226c;
    }

    private void d(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (!(view2 instanceof b.a.a.a.r.d) || !(view instanceof ImageView)) {
            return;
        }
        b.a.a.a.r.d dVar = (b.a.a.a.r.d) view2;
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.mutate();
        if (z) {
            if (!z2) {
                drawable.setAlpha(255);
            }
            objectAnimator = ObjectAnimator.ofInt(drawable, b.a.a.a.m.e.f1213b, 0);
        } else {
            objectAnimator = ObjectAnimator.ofInt(drawable, b.a.a.a.m.e.f1213b, 255);
        }
        objectAnimator.addUpdateListener(new b(this, view2));
        eVar.f1615a.a("iconFade").a((Animator) objectAnimator);
        list.add(objectAnimator);
        list2.add(new c(this, dVar, drawable));
    }

    protected abstract e a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        e a2 = a(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            c(view, view2, z, z2, a2, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        a(view, view2, z, z2, a2, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a(view, view2, z, a2, arrayList);
        d(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, width, height, arrayList, arrayList2);
        b(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        b.a.a.a.m.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }
}
