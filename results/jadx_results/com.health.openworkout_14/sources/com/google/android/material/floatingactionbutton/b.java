package com.google.android.material.floatingactionbutton;

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
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import b.g.l.t;
import d.a.a.a.a0.n;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    static final TimeInterpolator F = d.a.a.a.l.a.f3642c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a */
    d.a.a.a.a0.k f3138a;

    /* renamed from: b */
    d.a.a.a.a0.g f3139b;

    /* renamed from: c */
    Drawable f3140c;

    /* renamed from: d */
    com.google.android.material.floatingactionbutton.a f3141d;

    /* renamed from: e */
    Drawable f3142e;

    /* renamed from: f */
    boolean f3143f;

    /* renamed from: h */
    float f3145h;
    float i;
    float j;
    int k;
    private final com.google.android.material.internal.l l;
    private d.a.a.a.l.h m;
    private d.a.a.a.l.h n;
    private Animator o;
    private d.a.a.a.l.h p;
    private d.a.a.a.l.h q;
    private float r;
    private int t;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final d.a.a.a.z.b z;

    /* renamed from: g */
    boolean f3144g = true;
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
        private boolean f3146a;

        /* renamed from: b */
        final /* synthetic */ boolean f3147b;

        /* renamed from: c */
        final /* synthetic */ j f3148c;

        a(boolean z, j jVar) {
            b.this = r1;
            this.f3147b = z;
            this.f3148c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3146a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            if (!this.f3146a) {
                FloatingActionButton floatingActionButton = b.this.y;
                boolean z = this.f3147b;
                floatingActionButton.b(z ? 8 : 4, z);
                j jVar = this.f3148c;
                if (jVar == null) {
                    return;
                }
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.f3147b);
            b.this.u = 1;
            b.this.o = animator;
            this.f3146a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes.dex */
    public class C0075b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3150a;

        /* renamed from: b */
        final /* synthetic */ j f3151b;

        C0075b(boolean z, j jVar) {
            b.this = r1;
            this.f3150a = z;
            this.f3151b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            j jVar = this.f3151b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.f3150a);
            b.this.u = 2;
            b.this.o = animator;
        }
    }

    /* loaded from: classes.dex */
    public class c extends d.a.a.a.l.g {
        c() {
            b.this = r1;
        }

        @Override // d.a.a.a.l.g
        public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
            b.this.s = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f3154a = new FloatEvaluator();

        d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = this.f3154a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
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
            b.this.H();
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
            return bVar.f3145h + bVar.i;
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
            return bVar.f3145h + bVar.j;
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
            return b.this.f3145h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f3159a;

        /* renamed from: b */
        private float f3160b;

        /* renamed from: c */
        private float f3161c;

        private l() {
            b.this = r1;
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.g0((int) this.f3161c);
            this.f3159a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f3159a) {
                d.a.a.a.a0.g gVar = b.this.f3139b;
                this.f3160b = gVar == null ? 0.0f : gVar.w();
                this.f3161c = a();
                this.f3159a = true;
            }
            b bVar = b.this;
            float f2 = this.f3160b;
            bVar.g0((int) (f2 + ((this.f3161c - f2) * valueAnimator.getAnimatedFraction())));
        }
    }

    public b(FloatingActionButton floatingActionButton, d.a.a.a.z.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        com.google.android.material.internal.l lVar = new com.google.android.material.internal.l();
        this.l = lVar;
        lVar.a(G, i(new h()));
        lVar.a(H, i(new g()));
        lVar.a(I, i(new g()));
        lVar.a(J, i(new g()));
        lVar.a(K, i(new k()));
        lVar.a(L, i(new f(this)));
        this.r = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return t.O(this.y) && !this.y.isInEditMode();
    }

    private void g(float f2, Matrix matrix) {
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

    private AnimatorSet h(d.a.a.a.l.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new d.a.a.a.l.f(), new c(), new Matrix(this.D));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        d.a.a.a.l.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d(this));
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private d.a.a.a.l.h l() {
        if (this.n == null) {
            this.n = d.a.a.a.l.h.c(this.y.getContext(), d.a.a.a.a.a_res_0x7f020001);
        }
        d.a.a.a.l.h hVar = this.n;
        b.g.k.h.c(hVar);
        return hVar;
    }

    private d.a.a.a.l.h m() {
        if (this.m == null) {
            this.m = d.a.a.a.l.h.c(this.y.getContext(), d.a.a.a.a.b_res_0x7f020002);
        }
        d.a.a.a.l.h hVar = this.m;
        b.g.k.h.c(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public void A() {
        this.l.c();
    }

    public void B() {
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            d.a.a.a.a0.h.f(this.y, gVar);
        }
        if (K()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    public void E(int[] iArr) {
        this.l.d(iArr);
    }

    void F(float f2, float f3, float f4) {
        f0();
        g0(f2);
    }

    void G(Rect rect) {
        d.a.a.a.z.b bVar;
        Drawable drawable;
        b.g.k.h.d(this.f3142e, "Didn't initialize content background");
        if (Z()) {
            drawable = new InsetDrawable(this.f3142e, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.z;
        } else {
            bVar = this.z;
            drawable = this.f3142e;
        }
        bVar.c(drawable);
    }

    void H() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void J() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    boolean K() {
        return true;
    }

    public void L(ColorStateList colorStateList) {
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f3141d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f2) {
        if (this.f3145h != f2) {
            this.f3145h = f2;
            F(f2, this.i, this.j);
        }
    }

    public void O(boolean z) {
        this.f3143f = z;
    }

    public final void P(d.a.a.a.l.h hVar) {
        this.q = hVar;
    }

    public final void Q(float f2) {
        if (this.i != f2) {
            this.i = f2;
            F(this.f3145h, f2, this.j);
        }
    }

    final void R(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    public final void S(int i2) {
        if (this.t != i2) {
            this.t = i2;
            e0();
        }
    }

    public void T(int i2) {
        this.k = i2;
    }

    public final void U(float f2) {
        if (this.j != f2) {
            this.j = f2;
            F(this.f3145h, this.i, f2);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f3140c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, d.a.a.a.y.b.a(colorStateList));
        }
    }

    public void W(boolean z) {
        this.f3144g = z;
        f0();
    }

    public final void X(d.a.a.a.a0.k kVar) {
        this.f3138a = kVar;
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f3140c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f3141d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(d.a.a.a.l.h hVar) {
        this.p = hVar;
    }

    boolean Z() {
        return true;
    }

    public final boolean b0() {
        return !this.f3143f || this.y.getSizeDimension() >= this.k;
    }

    public void c0(j jVar, boolean z) {
        if (z()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.y.b(0, z);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            R(1.0f);
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
            R(0.0f);
        }
        d.a.a.a.l.h hVar = this.p;
        if (hVar == null) {
            hVar = m();
        }
        AnimatorSet h2 = h(hVar, 1.0f, 1.0f, 1.0f);
        h2.addListener(new C0075b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h2.addListener(it.next());
            }
        }
        h2.start();
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    void d0() {
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
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            gVar.a0((int) this.r);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public final void e0() {
        R(this.s);
    }

    public void f(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    public final void f0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g0(float f2) {
        d.a.a.a.a0.g gVar = this.f3139b;
        if (gVar != null) {
            gVar.U(f2);
        }
    }

    d.a.a.a.a0.g j() {
        d.a.a.a.a0.k kVar = this.f3138a;
        b.g.k.h.c(kVar);
        return new d.a.a.a.a0.g(kVar);
    }

    public final Drawable k() {
        return this.f3142e;
    }

    public float n() {
        return this.f3145h;
    }

    public boolean o() {
        return this.f3143f;
    }

    public final d.a.a.a.l.h p() {
        return this.q;
    }

    public float q() {
        return this.i;
    }

    public void s(Rect rect) {
        int sizeDimension = this.f3143f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float n = this.f3144g ? n() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(n * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.j;
    }

    public final d.a.a.a.a0.k u() {
        return this.f3138a;
    }

    public final d.a.a.a.l.h v() {
        return this.p;
    }

    public void w(j jVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.y.b(z ? 8 : 4, z);
            if (jVar == null) {
                return;
            }
            jVar.b();
            return;
        }
        d.a.a.a.l.h hVar = this.q;
        if (hVar == null) {
            hVar = l();
        }
        AnimatorSet h2 = h(hVar, 0.0f, 0.0f, 0.0f);
        h2.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h2.addListener(it.next());
            }
        }
        h2.start();
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        d.a.a.a.a0.g j2 = j();
        this.f3139b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.f3139b.setTintMode(mode);
        }
        this.f3139b.Z(-12303292);
        this.f3139b.M(this.y.getContext());
        d.a.a.a.y.a aVar = new d.a.a.a.y.a(this.f3139b.C());
        aVar.setTintList(d.a.a.a.y.b.a(colorStateList2));
        this.f3140c = aVar;
        d.a.a.a.a0.g gVar = this.f3139b;
        b.g.k.h.c(gVar);
        this.f3142e = new LayerDrawable(new Drawable[]{gVar, aVar});
    }

    public boolean y() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    public boolean z() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }
}
