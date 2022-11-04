package com.google.android.material.floatingactionbutton;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import b.a.a.a.b0.n;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    static final TimeInterpolator F = b.a.a.a.m.a.f1210c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a */
    b.a.a.a.b0.k f1498a;

    /* renamed from: b */
    b.a.a.a.b0.g f1499b;

    /* renamed from: c */
    Drawable f1500c;
    com.google.android.material.floatingactionbutton.a d;
    Drawable e;
    boolean f;
    float h;
    float i;
    float j;
    int k;
    private final com.google.android.material.internal.j l;
    private b.a.a.a.m.h m;
    private b.a.a.a.m.h n;
    private Animator o;
    private b.a.a.a.m.h p;
    private b.a.a.a.m.h q;
    private float r;
    private int t;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final b.a.a.a.a0.b z;
    boolean g = true;
    private float s = 1.0f;
    private int u = 0;
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1501a;

        /* renamed from: b */
        final /* synthetic */ boolean f1502b;

        /* renamed from: c */
        final /* synthetic */ j f1503c;

        a(boolean z, j jVar) {
            b.this = r1;
            this.f1502b = z;
            this.f1503c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1501a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            if (!this.f1501a) {
                b.this.y.a(this.f1502b ? 8 : 4, this.f1502b);
                j jVar = this.f1503c;
                if (jVar == null) {
                    return;
                }
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f1502b);
            b.this.u = 1;
            b.this.o = animator;
            this.f1501a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes.dex */
    public class C0066b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f1504a;

        /* renamed from: b */
        final /* synthetic */ j f1505b;

        C0066b(boolean z, j jVar) {
            b.this = r1;
            this.f1504a = z;
            this.f1505b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            j jVar = this.f1505b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f1504a);
            b.this.u = 2;
            b.this.o = animator;
        }
    }

    /* loaded from: classes.dex */
    public class c extends b.a.a.a.m.g {
        c() {
            b.this = r1;
        }

        @Override // b.a.a.a.m.g
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            b.this.s = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f1507a = new FloatEvaluator();

        d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f1507a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
            b.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.o();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends l {
        f(b bVar) {
            super(bVar, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(r2, null);
            b.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.h + bVar.i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(r2, null);
            b.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.h + bVar.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class k extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(r2, null);
            b.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return b.this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f1509a;

        /* renamed from: b */
        private float f1510b;

        /* renamed from: c */
        private float f1511c;

        private l() {
            b.this = r1;
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.e((int) this.f1511c);
            this.f1509a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1509a) {
                b.a.a.a.b0.g gVar = b.this.f1499b;
                this.f1510b = gVar == null ? 0.0f : gVar.e();
                this.f1511c = a();
                this.f1509a = true;
            }
            b bVar = b.this;
            float f = this.f1510b;
            bVar.e((int) (f + ((this.f1511c - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    public b(FloatingActionButton floatingActionButton, b.a.a.a.a0.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        com.google.android.material.internal.j jVar = new com.google.android.material.internal.j();
        this.l = jVar;
        jVar.a(G, a((l) new h()));
        this.l.a(H, a((l) new g()));
        this.l.a(I, a((l) new g()));
        this.l.a(J, a((l) new g()));
        this.l.a(K, a((l) new k()));
        this.l.a(L, a((l) new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean A() {
        return u.D(this.y) && !this.y.isInEditMode();
    }

    private AnimatorSet a(b.a.a.a.m.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        hVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        hVar.a("scale").a((Animator) ofFloat2);
        a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        hVar.a("scale").a((Animator) ofFloat3);
        a(ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new b.a.a.a.m.f(), new c(), new Matrix(this.D));
        hVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.a.a.a.m.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable == null || this.t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.t;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.t;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private void a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d(this));
    }

    private b.a.a.a.m.h x() {
        if (this.n == null) {
            this.n = b.a.a.a.m.h.a(this.y.getContext(), b.a.a.a.a.design_fab_hide_motion_spec);
        }
        b.a.a.a.m.h hVar = this.n;
        a.g.k.h.a(hVar);
        return hVar;
    }

    private b.a.a.a.m.h y() {
        if (this.m == null) {
            this.m = b.a.a.a.m.h.a(this.y.getContext(), b.a.a.a.a.design_fab_show_motion_spec);
        }
        b.a.a.a.m.h hVar = this.m;
        a.g.k.h.a(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener z() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public final Drawable a() {
        return this.e;
    }

    public final void a(float f2) {
        if (this.h != f2) {
            this.h = f2;
            a(f2, this.i, this.j);
        }
    }

    void a(float f2, float f3, float f4) {
        w();
        e(f2);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    public void a(ColorStateList colorStateList) {
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(colorStateList);
        throw null;
    }

    public void a(PorterDuff.Mode mode) {
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public void a(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float b2 = this.g ? b() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(b2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(b2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public final void a(b.a.a.a.b0.k kVar) {
        this.f1498a = kVar;
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f1500c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(kVar);
        throw null;
    }

    public final void a(b.a.a.a.m.h hVar) {
        this.q = hVar;
    }

    public void a(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    public void a(j jVar, boolean z) {
        if (i()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!A()) {
            this.y.a(z ? 8 : 4, z);
            if (jVar == null) {
                return;
            }
            jVar.b();
            return;
        }
        b.a.a.a.m.h hVar = this.q;
        if (hVar == null) {
            hVar = x();
        }
        AnimatorSet a2 = a(hVar, 0.0f, 0.0f, 0.0f);
        a2.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void a(int[] iArr) {
        this.l.a(iArr);
    }

    public float b() {
        return this.h;
    }

    public final void b(float f2) {
        if (this.i != f2) {
            this.i = f2;
            a(this.h, f2, this.j);
        }
    }

    public void b(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f1500c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, b.a.a.a.z.b.b(colorStateList));
        }
    }

    void b(Rect rect) {
        b.a.a.a.a0.b bVar;
        Drawable drawable;
        a.g.k.h.a(this.e, "Didn't initialize content background");
        if (s()) {
            drawable = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.z;
        } else {
            bVar = this.z;
            drawable = this.e;
        }
        bVar.a(drawable);
    }

    public final void b(b.a.a.a.m.h hVar) {
        this.p = hVar;
    }

    public void b(j jVar, boolean z) {
        if (j()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!A()) {
            this.y.a(0, z);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            c(1.0f);
            if (jVar == null) {
                return;
            }
            jVar.a();
            return;
        }
        if (this.y.getVisibility() != 0) {
            this.y.setAlpha(0.0f);
            this.y.setScaleY(0.0f);
            this.y.setScaleX(0.0f);
            c(0.0f);
        }
        b.a.a.a.m.h hVar = this.p;
        if (hVar == null) {
            hVar = y();
        }
        AnimatorSet a2 = a(hVar, 1.0f, 1.0f, 1.0f);
        a2.addListener(new C0066b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    public void b(boolean z) {
        this.g = z;
        w();
    }

    final void c(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        a(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    public boolean c() {
        return this.f;
    }

    public final b.a.a.a.m.h d() {
        return this.q;
    }

    public final void d(float f2) {
        if (this.j != f2) {
            this.j = f2;
            a(this.h, this.i, f2);
        }
    }

    public float e() {
        return this.i;
    }

    public void e(float f2) {
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            gVar.b(f2);
        }
    }

    public float f() {
        return this.j;
    }

    public final b.a.a.a.b0.k g() {
        return this.f1498a;
    }

    public final b.a.a.a.m.h h() {
        return this.p;
    }

    public boolean i() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    public boolean j() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }

    public void k() {
        this.l.a();
    }

    public void l() {
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            b.a.a.a.b0.h.a(this.y, gVar);
        }
        if (r()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(z());
        }
    }

    public void m() {
    }

    public void n() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    void o() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            u();
        }
    }

    public void p() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void q() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    boolean r() {
        return true;
    }

    boolean s() {
        return true;
    }

    public final boolean t() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    void u() {
        int i2;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                i2 = 1;
                if (this.y.getLayerType() != 1) {
                    floatingActionButton = this.y;
                    floatingActionButton.setLayerType(i2, null);
                }
            } else if (this.y.getLayerType() != 0) {
                floatingActionButton = this.y;
                i2 = 0;
                floatingActionButton.setLayerType(i2, null);
            }
        }
        b.a.a.a.b0.g gVar = this.f1499b;
        if (gVar != null) {
            gVar.a((int) this.r);
        }
    }

    public final void v() {
        c(this.s);
    }

    public final void w() {
        Rect rect = this.A;
        a(rect);
        b(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
