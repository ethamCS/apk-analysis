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
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.Iterator;
import t5.n;
/* loaded from: classes.dex */
public class a {
    static final TimeInterpolator C = c5.a.f6269c;
    static final int[] D = {16842919, 16842910};
    static final int[] E = {16843623, 16842908, 16842910};
    static final int[] F = {16842908, 16842910};
    static final int[] G = {16843623, 16842910};
    static final int[] H = {16842910};
    static final int[] I = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* renamed from: a */
    t5.k f7258a;

    /* renamed from: b */
    t5.g f7259b;

    /* renamed from: c */
    Drawable f7260c;

    /* renamed from: d */
    Drawable f7261d;

    /* renamed from: e */
    boolean f7262e;

    /* renamed from: g */
    float f7264g;

    /* renamed from: h */
    float f7265h;

    /* renamed from: i */
    float f7266i;

    /* renamed from: j */
    int f7267j;

    /* renamed from: k */
    private final com.google.android.material.internal.i f7268k;

    /* renamed from: l */
    private Animator f7269l;

    /* renamed from: m */
    private c5.h f7270m;

    /* renamed from: n */
    private c5.h f7271n;

    /* renamed from: o */
    private float f7272o;

    /* renamed from: q */
    private int f7274q;

    /* renamed from: s */
    private ArrayList<Animator.AnimatorListener> f7276s;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f7277t;

    /* renamed from: u */
    private ArrayList<j> f7278u;

    /* renamed from: v */
    final FloatingActionButton f7279v;

    /* renamed from: w */
    final s5.b f7280w;

    /* renamed from: f */
    boolean f7263f = true;

    /* renamed from: p */
    private float f7273p = 1.0f;

    /* renamed from: r */
    private int f7275r = 0;

    /* renamed from: x */
    private final Rect f7281x = new Rect();

    /* renamed from: y */
    private final RectF f7282y = new RectF();

    /* renamed from: z */
    private final RectF f7283z = new RectF();
    private final Matrix A = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes.dex */
    public class C0105a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7284a;

        /* renamed from: b */
        final /* synthetic */ boolean f7285b;

        /* renamed from: c */
        final /* synthetic */ k f7286c;

        C0105a(boolean z10, k kVar) {
            a.this = r1;
            this.f7285b = z10;
            this.f7286c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7284a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f7275r = 0;
            a.this.f7269l = null;
            if (!this.f7284a) {
                FloatingActionButton floatingActionButton = a.this.f7279v;
                boolean z10 = this.f7285b;
                floatingActionButton.b(z10 ? 8 : 4, z10);
                k kVar = this.f7286c;
                if (kVar == null) {
                    return;
                }
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f7279v.b(0, this.f7285b);
            a.this.f7275r = 1;
            a.this.f7269l = animator;
            this.f7284a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7288a;

        /* renamed from: b */
        final /* synthetic */ k f7289b;

        b(boolean z10, k kVar) {
            a.this = r1;
            this.f7288a = z10;
            this.f7289b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f7275r = 0;
            a.this.f7269l = null;
            k kVar = this.f7289b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f7279v.b(0, this.f7288a);
            a.this.f7275r = 2;
            a.this.f7269l = animator;
        }
    }

    /* loaded from: classes.dex */
    public class c extends c5.g {
        c() {
            a.this = r1;
        }

        @Override // c5.g
        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f7273p = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f7292a;

        /* renamed from: b */
        final /* synthetic */ float f7293b;

        /* renamed from: c */
        final /* synthetic */ float f7294c;

        /* renamed from: d */
        final /* synthetic */ float f7295d;

        /* renamed from: e */
        final /* synthetic */ float f7296e;

        /* renamed from: f */
        final /* synthetic */ float f7297f;

        /* renamed from: g */
        final /* synthetic */ float f7298g;

        /* renamed from: h */
        final /* synthetic */ Matrix f7299h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            a.this = r1;
            this.f7292a = f10;
            this.f7293b = f11;
            this.f7294c = f12;
            this.f7295d = f13;
            this.f7296e = f14;
            this.f7297f = f15;
            this.f7298g = f16;
            this.f7299h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f7279v.setAlpha(c5.a.b(this.f7292a, this.f7293b, 0.0f, 0.2f, floatValue));
            a.this.f7279v.setScaleX(c5.a.a(this.f7294c, this.f7295d, floatValue));
            a.this.f7279v.setScaleY(c5.a.a(this.f7296e, this.f7295d, floatValue));
            a.this.f7273p = c5.a.a(this.f7297f, this.f7298g, floatValue);
            a.this.h(c5.a.a(this.f7297f, this.f7298g, floatValue), this.f7299h);
            a.this.f7279v.setImageMatrix(this.f7299h);
        }
    }

    /* loaded from: classes.dex */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f7301a = new FloatEvaluator();

        e() {
            a.this = r1;
        }

        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f7301a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
            a.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(r2, null);
            a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(r2, null);
            a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f7264g + aVar.f7265h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(r2, null);
            a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f7264g + aVar.f7266i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface k {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l() {
            super(r2, null);
            a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return a.this.f7264g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f7308a;

        /* renamed from: b */
        private float f7309b;

        /* renamed from: c */
        private float f7310c;

        private m() {
            a.this = r1;
        }

        /* synthetic */ m(a aVar, C0105a c0105a) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.d0((int) this.f7310c);
            this.f7308a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f7308a) {
                t5.g gVar = a.this.f7259b;
                this.f7309b = gVar == null ? 0.0f : gVar.w();
                this.f7310c = a();
                this.f7308a = true;
            }
            a aVar = a.this;
            float f10 = this.f7309b;
            aVar.d0((int) (f10 + ((this.f7310c - f10) * valueAnimator.getAnimatedFraction())));
        }
    }

    public a(FloatingActionButton floatingActionButton, s5.b bVar) {
        this.f7279v = floatingActionButton;
        this.f7280w = bVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f7268k = iVar;
        iVar.a(D, k(new i()));
        iVar.a(E, k(new h()));
        iVar.a(F, k(new h()));
        iVar.a(G, k(new h()));
        iVar.a(H, k(new l()));
        iVar.a(I, k(new g()));
        this.f7272o = floatingActionButton.getRotation();
    }

    private boolean X() {
        return y.S(this.f7279v) && !this.f7279v.isInEditMode();
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    public void h(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7279v.getDrawable();
        if (drawable == null || this.f7274q == 0) {
            return;
        }
        RectF rectF = this.f7282y;
        RectF rectF2 = this.f7283z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f7274q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f7274q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet i(c5.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7279v, View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7279v, View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f7279v, View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f7279v, new c5.f(), new c(), new Matrix(this.A));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c5.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f7279v.getAlpha(), f10, this.f7279v.getScaleX(), f11, this.f7279v.getScaleY(), this.f7273p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        c5.b.a(animatorSet, arrayList);
        animatorSet.setDuration(o5.a.d(this.f7279v.getContext(), b5.b.z_res_0x7f0302dc, this.f7279v.getContext().getResources().getInteger(b5.g.f5484b)));
        animatorSet.setInterpolator(o5.a.e(this.f7279v.getContext(), b5.b.A_res_0x7f0302e6, c5.a.f6268b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.B == null) {
            this.B = new f();
        }
        return this.B;
    }

    public void A() {
        throw null;
    }

    public void B() {
        ViewTreeObserver viewTreeObserver = this.f7279v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    public void C(int[] iArr) {
        throw null;
    }

    void D(float f10, float f11, float f12) {
        throw null;
    }

    void E(Rect rect) {
        s5.b bVar;
        Drawable drawable;
        androidx.core.util.h.h(this.f7261d, "Didn't initialize content background");
        if (W()) {
            drawable = new InsetDrawable(this.f7261d, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.f7280w;
        } else {
            bVar = this.f7280w;
            drawable = this.f7261d;
        }
        bVar.b(drawable);
    }

    void F() {
        float rotation = this.f7279v.getRotation();
        if (this.f7272o != rotation) {
            this.f7272o = rotation;
            a0();
        }
    }

    public void G() {
        ArrayList<j> arrayList = this.f7278u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void H() {
        ArrayList<j> arrayList = this.f7278u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean I() {
        throw null;
    }

    public void J(ColorStateList colorStateList) {
        t5.g gVar = this.f7259b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    public void K(PorterDuff.Mode mode) {
        t5.g gVar = this.f7259b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void L(float f10) {
        if (this.f7264g != f10) {
            this.f7264g = f10;
            D(f10, this.f7265h, this.f7266i);
        }
    }

    public void M(boolean z10) {
        this.f7262e = z10;
    }

    public final void N(c5.h hVar) {
        this.f7271n = hVar;
    }

    public final void O(float f10) {
        if (this.f7265h != f10) {
            this.f7265h = f10;
            D(this.f7264g, f10, this.f7266i);
        }
    }

    final void P(float f10) {
        this.f7273p = f10;
        Matrix matrix = this.A;
        h(f10, matrix);
        this.f7279v.setImageMatrix(matrix);
    }

    public final void Q(int i10) {
        if (this.f7274q != i10) {
            this.f7274q = i10;
            b0();
        }
    }

    public final void R(float f10) {
        if (this.f7266i != f10) {
            this.f7266i = f10;
            D(this.f7264g, this.f7265h, f10);
        }
    }

    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f7260c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, r5.b.d(colorStateList));
        }
    }

    public void T(boolean z10) {
        this.f7263f = z10;
        c0();
    }

    public final void U(t5.k kVar) {
        this.f7258a = kVar;
        t5.g gVar = this.f7259b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f7260c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    public final void V(c5.h hVar) {
        this.f7270m = hVar;
    }

    boolean W() {
        throw null;
    }

    public final boolean Y() {
        return !this.f7262e || this.f7279v.getSizeDimension() >= this.f7267j;
    }

    public void Z(k kVar, boolean z10) {
        if (x()) {
            return;
        }
        Animator animator = this.f7269l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f7270m == null;
        if (!X()) {
            this.f7279v.b(0, z10);
            this.f7279v.setAlpha(1.0f);
            this.f7279v.setScaleY(1.0f);
            this.f7279v.setScaleX(1.0f);
            P(1.0f);
            if (kVar == null) {
                return;
            }
            kVar.a();
            return;
        }
        if (this.f7279v.getVisibility() != 0) {
            float f10 = 0.0f;
            this.f7279v.setAlpha(0.0f);
            this.f7279v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f7279v.setScaleX(z11 ? 0.4f : 0.0f);
            if (z11) {
                f10 = 0.4f;
            }
            P(f10);
        }
        c5.h hVar = this.f7270m;
        AnimatorSet i10 = hVar != null ? i(hVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f);
        i10.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f7276s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                i10.addListener(it.next());
            }
        }
        i10.start();
    }

    void a0() {
        throw null;
    }

    public final void b0() {
        P(this.f7273p);
    }

    public final void c0() {
        Rect rect = this.f7281x;
        r(rect);
        E(rect);
        this.f7280w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f10) {
        t5.g gVar = this.f7259b;
        if (gVar != null) {
            gVar.Y(f10);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f7277t == null) {
            this.f7277t = new ArrayList<>();
        }
        this.f7277t.add(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f7276s == null) {
            this.f7276s = new ArrayList<>();
        }
        this.f7276s.add(animatorListener);
    }

    public void g(j jVar) {
        if (this.f7278u == null) {
            this.f7278u = new ArrayList<>();
        }
        this.f7278u.add(jVar);
    }

    public final Drawable l() {
        return this.f7261d;
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f7262e;
    }

    public final c5.h o() {
        return this.f7271n;
    }

    public float p() {
        return this.f7265h;
    }

    public void r(Rect rect) {
        int sizeDimension = this.f7262e ? (this.f7267j - this.f7279v.getSizeDimension()) / 2 : 0;
        float m10 = this.f7263f ? m() + this.f7266i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(m10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(m10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float s() {
        return this.f7266i;
    }

    public final t5.k t() {
        return this.f7258a;
    }

    public final c5.h u() {
        return this.f7270m;
    }

    public void v(k kVar, boolean z10) {
        if (w()) {
            return;
        }
        Animator animator = this.f7269l;
        if (animator != null) {
            animator.cancel();
        }
        if (!X()) {
            this.f7279v.b(z10 ? 8 : 4, z10);
            if (kVar == null) {
                return;
            }
            kVar.b();
            return;
        }
        c5.h hVar = this.f7271n;
        AnimatorSet i10 = hVar != null ? i(hVar, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f);
        i10.addListener(new C0105a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f7277t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                i10.addListener(it.next());
            }
        }
        i10.start();
    }

    public boolean w() {
        return this.f7279v.getVisibility() == 0 ? this.f7275r == 1 : this.f7275r != 2;
    }

    public boolean x() {
        return this.f7279v.getVisibility() != 0 ? this.f7275r == 2 : this.f7275r != 1;
    }

    public void y() {
        throw null;
    }

    public void z() {
        t5.g gVar = this.f7259b;
        if (gVar != null) {
            t5.h.f(this.f7279v, gVar);
        }
        if (I()) {
            this.f7279v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
