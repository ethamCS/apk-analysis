package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    private final ViewGroup f7438a;

    /* renamed from: b */
    protected final o f7439b;

    /* renamed from: c */
    private final com.google.android.material.snackbar.a f7440c;

    /* renamed from: d */
    private boolean f7441d;

    /* renamed from: e */
    private final Runnable f7442e;

    /* renamed from: f */
    private int f7443f;

    /* renamed from: g */
    private int f7444g;

    /* renamed from: h */
    private int f7445h;

    /* renamed from: i */
    private int f7446i;

    /* renamed from: j */
    private int f7447j;

    /* renamed from: k */
    private boolean f7448k;

    /* renamed from: l */
    private List<m<B>> f7449l;

    /* renamed from: m */
    private Behavior f7450m;

    /* renamed from: n */
    private final AccessibilityManager f7451n;

    /* renamed from: o */
    b.AbstractC0107b f7452o;

    /* renamed from: q */
    private static final boolean f7435q = false;

    /* renamed from: r */
    private static final int[] f7436r = {b5.b.D_res_0x7f030376};

    /* renamed from: s */
    private static final String f7437s = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: p */
    static final Handler f7434p = new Handler(Looper.getMainLooper(), new h());

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final n f7453k = new n(this);

        public void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7453k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f7453k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f7453k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7454a;

        a(int i10) {
            BaseTransientBottomBar.this = r1;
            this.f7454a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.u(this.f7454a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f7439b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f7439b.setScaleX(floatValue);
            BaseTransientBottomBar.this.f7439b.setScaleY(floatValue);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.v();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7440c.a(70, 180);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7459a;

        /* renamed from: b */
        final /* synthetic */ int f7460b;

        e(int i10) {
            BaseTransientBottomBar.this = r1;
            this.f7460b = i10;
            this.f7459a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7435q) {
                y.Z(BaseTransientBottomBar.this.f7439b, intValue - this.f7459a);
            } else {
                BaseTransientBottomBar.this.f7439b.setTranslationY(intValue);
            }
            this.f7459a = intValue;
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7462a;

        f(int i10) {
            BaseTransientBottomBar.this = r1;
            this.f7462a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.u(this.f7462a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7440c.b(0, 180);
        }
    }

    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7464a = 0;

        g() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7435q) {
                y.Z(BaseTransientBottomBar.this.f7439b, intValue - this.f7464a);
            } else {
                BaseTransientBottomBar.this.f7439b.setTranslationY(intValue);
            }
            this.f7464a = intValue;
        }
    }

    /* loaded from: classes.dex */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).A();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).o(message.arg1);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.u(3);
        }
    }

    /* loaded from: classes.dex */
    public class j implements SwipeDismissBehavior.c {
        j() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.i(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f7452o);
            } else if (i10 != 1 && i10 != 2) {
            } else {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f7452o);
            }
        }
    }

    /* loaded from: classes.dex */
    public class k implements Runnable {
        k() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = BaseTransientBottomBar.this.f7439b;
            if (oVar == null) {
                return;
            }
            if (oVar.getParent() != null) {
                BaseTransientBottomBar.this.f7439b.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f7439b.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.C();
            } else {
                BaseTransientBottomBar.this.E();
            }
        }
    }

    /* loaded from: classes.dex */
    public class l extends AnimatorListenerAdapter {
        l() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.v();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m<B> {
        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a */
        private b.AbstractC0107b f7470a;

        public n(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof o;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (!coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return;
                }
                com.google.android.material.snackbar.b.c().j(this.f7470a);
            } else if (actionMasked != 1 && actionMasked != 3) {
            } else {
                com.google.android.material.snackbar.b.c().k(this.f7470a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7470a = baseTransientBottomBar.f7452o;
        }
    }

    /* loaded from: classes.dex */
    public static class o extends FrameLayout {
        private static final View.OnTouchListener Z3 = new a();
        private final int U3;
        private ColorStateList V3;
        private PorterDuff.Mode W3;
        private Rect X3;
        private boolean Y3;

        /* renamed from: c */
        private BaseTransientBottomBar<?> f7471c;

        /* renamed from: d */
        private int f7472d;

        /* renamed from: q */
        private final float f7473q;

        /* renamed from: x */
        private final float f7474x;

        /* renamed from: y */
        private final int f7475y;

        /* loaded from: classes.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public o(Context context, AttributeSet attributeSet) {
            super(v5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b5.l.K4);
            int i10 = b5.l.R4;
            if (obtainStyledAttributes.hasValue(i10)) {
                y.w0(this, obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f7472d = obtainStyledAttributes.getInt(b5.l.N4, 0);
            this.f7473q = obtainStyledAttributes.getFloat(b5.l.O4, 1.0f);
            setBackgroundTintList(q5.c.a(context2, obtainStyledAttributes, b5.l.P4));
            setBackgroundTintMode(com.google.android.material.internal.o.f(obtainStyledAttributes.getInt(b5.l.Q4, -1), PorterDuff.Mode.SRC_IN));
            this.f7474x = obtainStyledAttributes.getFloat(b5.l.M4, 1.0f);
            this.f7475y = obtainStyledAttributes.getDimensionPixelSize(b5.l.L4, -1);
            this.U3 = obtainStyledAttributes.getDimensionPixelSize(b5.l.S4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(Z3);
            setFocusable(true);
            if (getBackground() == null) {
                y.s0(this, c());
            }
        }

        private Drawable c() {
            float dimension = getResources().getDimension(b5.d.Z);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(i5.a.i(this, b5.b.m_res_0x7f0300fb, b5.b.j_res_0x7f0300ec, getBackgroundOverlayColorAlpha()));
            if (this.V3 != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(gradientDrawable);
                androidx.core.graphics.drawable.a.o(r10, this.V3);
                return r10;
            }
            return androidx.core.graphics.drawable.a.r(gradientDrawable);
        }

        private void d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.X3 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7471c = baseTransientBottomBar;
        }

        void b(ViewGroup viewGroup) {
            this.Y3 = true;
            viewGroup.addView(this);
            this.Y3 = false;
        }

        float getActionTextColorAlpha() {
            return this.f7474x;
        }

        int getAnimationMode() {
            return this.f7472d;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f7473q;
        }

        int getMaxInlineActionWidth() {
            return this.U3;
        }

        int getMaxWidth() {
            return this.f7475y;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7471c;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.r();
            }
            y.l0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7471c;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.s();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7471c;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.t();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f7475y > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f7475y;
                if (measuredWidth <= i12) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        void setAnimationMode(int i10) {
            this.f7472d = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.V3 != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.V3);
                androidx.core.graphics.drawable.a.p(drawable, this.W3);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.V3 = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r10, colorStateList);
                androidx.core.graphics.drawable.a.p(r10, this.W3);
                if (r10 == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(r10);
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.W3 = mode;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r10, mode);
                if (r10 == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(r10);
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.Y3 || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            d((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7471c;
            if (baseTransientBottomBar == null) {
                return;
            }
            baseTransientBottomBar.G();
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : Z3);
            super.setOnClickListener(onClickListener);
        }
    }

    private void B() {
        if (y()) {
            f();
            return;
        }
        if (this.f7439b.getParent() != null) {
            this.f7439b.setVisibility(0);
        }
        v();
    }

    public void C() {
        ValueAnimator j10 = j(0.0f, 1.0f);
        ValueAnimator m10 = m(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j10, m10);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new l());
        animatorSet.start();
    }

    private void D(int i10) {
        ValueAnimator j10 = j(1.0f, 0.0f);
        j10.setDuration(75L);
        j10.addListener(new a(i10));
        j10.start();
    }

    public void E() {
        int n10 = n();
        if (f7435q) {
            y.Z(this.f7439b, n10);
        } else {
            this.f7439b.setTranslationY(n10);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(n10, 0);
        valueAnimator.setInterpolator(c5.a.f6268b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(n10));
        valueAnimator.start();
    }

    private void F(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, n());
        valueAnimator.setInterpolator(c5.a.f6268b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public void G() {
        ViewGroup.LayoutParams layoutParams = this.f7439b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f7439b.X3 == null) {
            Log.w(f7437s, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.f7439b.getParent() == null) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f7439b.X3.bottom + (k() != null ? this.f7447j : this.f7443f);
            marginLayoutParams.leftMargin = this.f7439b.X3.left + this.f7444g;
            marginLayoutParams.rightMargin = this.f7439b.X3.right + this.f7445h;
            marginLayoutParams.topMargin = this.f7439b.X3.top;
            this.f7439b.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !z()) {
                return;
            }
            this.f7439b.removeCallbacks(this.f7442e);
            this.f7439b.post(this.f7442e);
        }
    }

    private void g(int i10) {
        if (this.f7439b.getAnimationMode() == 1) {
            D(i10);
        } else {
            F(i10);
        }
    }

    private int h() {
        if (k() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        k().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f7438a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f7438a.getHeight()) - i10;
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c5.a.f6267a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c5.a.f6270d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int n() {
        int height = this.f7439b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f7439b.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean q() {
        ViewGroup.LayoutParams layoutParams = this.f7439b.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void w() {
        this.f7447j = h();
        G();
    }

    private void x(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f7450m;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = l();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new j());
        fVar.o(swipeDismissBehavior);
        if (k() == null) {
            fVar.f3324g = 80;
        }
    }

    private boolean z() {
        return this.f7446i > 0 && !this.f7441d && q();
    }

    final void A() {
        if (this.f7439b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f7439b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                x((CoordinatorLayout.f) layoutParams);
            }
            this.f7439b.b(this.f7438a);
            w();
            this.f7439b.setVisibility(4);
        }
        if (y.S(this.f7439b)) {
            B();
        } else {
            this.f7448k = true;
        }
    }

    void f() {
        this.f7439b.post(new k());
    }

    protected void i(int i10) {
        com.google.android.material.snackbar.b.c().b(this.f7452o, i10);
    }

    public View k() {
        return null;
    }

    protected SwipeDismissBehavior<? extends View> l() {
        return new Behavior();
    }

    final void o(int i10) {
        if (!y() || this.f7439b.getVisibility() != 0) {
            u(i10);
        } else {
            g(i10);
        }
    }

    public boolean p() {
        return com.google.android.material.snackbar.b.c().e(this.f7452o);
    }

    void r() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f7439b.getRootWindowInsets()) == null) {
            return;
        }
        this.f7446i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        G();
    }

    void s() {
        if (p()) {
            f7434p.post(new i());
        }
    }

    void t() {
        if (this.f7448k) {
            B();
            this.f7448k = false;
        }
    }

    void u(int i10) {
        com.google.android.material.snackbar.b.c().h(this.f7452o);
        List<m<B>> list = this.f7449l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7449l.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f7439b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7439b);
        }
    }

    void v() {
        com.google.android.material.snackbar.b.c().i(this.f7452o);
        List<m<B>> list = this.f7449l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7449l.get(size).b(this);
            }
        }
    }

    boolean y() {
        AccessibilityManager accessibilityManager = this.f7451n;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }
}
