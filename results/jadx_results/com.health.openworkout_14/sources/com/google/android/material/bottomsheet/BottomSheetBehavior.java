package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.b0;
import b.g.l.c0.c;
import b.g.l.c0.f;
import b.g.l.t;
import b.i.b.d;
import com.google.android.material.internal.p;
import d.a.a.a.a0.k;
import d.a.a.a.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int Q = j.d_res_0x7f110274;
    b.i.b.d A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    int F;
    int G;
    WeakReference<V> H;
    WeakReference<View> I;
    private final ArrayList<f> J;
    private VelocityTracker K;
    int L;
    private int M;
    boolean N;
    private Map<View, Integer> O;
    private final d.c P;

    /* renamed from: a */
    private int f2976a;

    /* renamed from: b */
    private boolean f2977b;

    /* renamed from: c */
    private boolean f2978c;

    /* renamed from: d */
    private float f2979d;

    /* renamed from: e */
    private int f2980e;

    /* renamed from: f */
    private boolean f2981f;

    /* renamed from: g */
    private int f2982g;

    /* renamed from: h */
    private int f2983h;
    private boolean i;
    private d.a.a.a.a0.g j;
    private int k;
    private boolean l;
    private k m;
    private boolean n;
    private BottomSheetBehavior<V>.h o;
    private ValueAnimator p;
    int q;
    int r;
    int s;
    float t;
    int u;
    float v;
    boolean w;
    private boolean x;
    private boolean y;
    int z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f2984b;

        /* renamed from: c */
        final /* synthetic */ int f2985c;

        a(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.f2984b = view;
            this.f2985c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m0(this.f2984b, this.f2985c);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
            BottomSheetBehavior.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.W(floatValue);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements p.c {
        c() {
            BottomSheetBehavior.this = r1;
        }

        @Override // com.google.android.material.internal.p.c
        public b0 a(View view, b0 b0Var, p.d dVar) {
            BottomSheetBehavior.this.k = b0Var.d().f2381d;
            BottomSheetBehavior.this.t0(false);
            return b0Var;
        }
    }

    /* loaded from: classes.dex */
    class d extends d.c {
        d() {
            BottomSheetBehavior.this = r1;
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.G + bottomSheetBehavior.U()) / 2;
        }

        @Override // b.i.b.d.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // b.i.b.d.c
        public int b(View view, int i, int i2) {
            int U = BottomSheetBehavior.this.U();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.g.g.a.b(i, U, bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u);
        }

        @Override // b.i.b.d.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u;
        }

        @Override // b.i.b.d.c
        public void j(int i) {
            if (i != 1 || !BottomSheetBehavior.this.y) {
                return;
            }
            BottomSheetBehavior.this.k0(1);
        }

        @Override // b.i.b.d.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.S(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.q) < java.lang.Math.abs(r7.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.s)) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
            r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.s) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.u)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.r) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.u)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.u)) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.u)) goto L37;
         */
        @Override // b.i.b.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // b.i.b.d.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.z;
            if (i2 != 1 && !bottomSheetBehavior.N) {
                if (i2 == 3 && bottomSheetBehavior.L == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.I;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.H;
                return weakReference2 != null && weakReference2.get() == view;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.g.l.c0.f {

        /* renamed from: a */
        final /* synthetic */ int f2990a;

        e(int i) {
            BottomSheetBehavior.this = r1;
            this.f2990a = i;
        }

        @Override // b.g.l.c0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.j0(this.f2990a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i);
    }

    /* loaded from: classes.dex */
    public static class g extends b.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d */
        final int f2992d;

        /* renamed from: e */
        int f2993e;

        /* renamed from: f */
        boolean f2994f;

        /* renamed from: g */
        boolean f2995g;

        /* renamed from: h */
        boolean f2996h;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2992d = parcel.readInt();
            this.f2993e = parcel.readInt();
            boolean z = false;
            this.f2994f = parcel.readInt() == 1;
            this.f2995g = parcel.readInt() == 1;
            this.f2996h = parcel.readInt() == 1 ? true : z;
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f2992d = bottomSheetBehavior.z;
            this.f2993e = ((BottomSheetBehavior) bottomSheetBehavior).f2980e;
            this.f2994f = ((BottomSheetBehavior) bottomSheetBehavior).f2977b;
            this.f2995g = bottomSheetBehavior.w;
            this.f2996h = ((BottomSheetBehavior) bottomSheetBehavior).x;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2992d);
            parcel.writeInt(this.f2993e);
            parcel.writeInt(this.f2994f ? 1 : 0);
            parcel.writeInt(this.f2995g ? 1 : 0);
            parcel.writeInt(this.f2996h ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: b */
        private final View f2997b;

        /* renamed from: c */
        private boolean f2998c;

        /* renamed from: d */
        int f2999d;

        h(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.f2997b = view;
            this.f2999d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.i.b.d dVar = BottomSheetBehavior.this.A;
            if (dVar == null || !dVar.m(true)) {
                BottomSheetBehavior.this.k0(this.f2999d);
            } else {
                t.a0(this.f2997b, this);
            }
            this.f2998c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f2976a = 0;
        this.f2977b = true;
        this.f2978c = false;
        this.o = null;
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f2976a = 0;
        this.f2977b = true;
        this.f2978c = false;
        this.o = null;
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = new d();
        this.f2983h = context.getResources().getDimensionPixelSize(d.a.a.a.d.z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.a.a.k.m);
        this.i = obtainStyledAttributes.hasValue(d.a.a.a.k.y);
        int i2 = d.a.a.a.k.o;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            Q(context, attributeSet, hasValue, d.a.a.a.x.c.a(context, obtainStyledAttributes, i2));
        } else {
            P(context, attributeSet, hasValue);
        }
        R();
        if (Build.VERSION.SDK_INT >= 21) {
            this.v = obtainStyledAttributes.getDimension(d.a.a.a.k.n, -1.0f);
        }
        int i3 = d.a.a.a.k.u;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            f0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            f0(i);
        }
        e0(obtainStyledAttributes.getBoolean(d.a.a.a.k.t, false));
        c0(obtainStyledAttributes.getBoolean(d.a.a.a.k.x, false));
        b0(obtainStyledAttributes.getBoolean(d.a.a.a.k.r, true));
        i0(obtainStyledAttributes.getBoolean(d.a.a.a.k.w, false));
        Z(obtainStyledAttributes.getBoolean(d.a.a.a.k.p, true));
        h0(obtainStyledAttributes.getInt(d.a.a.a.k.v, 0));
        d0(obtainStyledAttributes.getFloat(d.a.a.a.k.s, 0.5f));
        int i4 = d.a.a.a.k.q;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        a0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i4, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.f2979d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void L(V v, c.a aVar, int i) {
        t.e0(v, aVar, null, new e(i));
    }

    private void M() {
        int O = O();
        if (this.f2977b) {
            this.u = Math.max(this.G - O, this.r);
        } else {
            this.u = this.G - O;
        }
    }

    private void N() {
        this.s = (int) (this.G * (1.0f - this.t));
    }

    private int O() {
        int i;
        return this.f2981f ? Math.min(Math.max(this.f2982g, this.G - ((this.F * 9) / 16)), this.E) : (this.l || (i = this.k) <= 0) ? this.f2980e : Math.max(this.f2980e, i + this.f2983h);
    }

    private void P(Context context, AttributeSet attributeSet, boolean z) {
        Q(context, attributeSet, z, null);
    }

    private void Q(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.i) {
            this.m = k.e(context, attributeSet, d.a.a.a.b.c_res_0x7f040062, Q).m();
            d.a.a.a.a0.g gVar = new d.a.a.a.a0.g(this.m);
            this.j = gVar;
            gVar.M(context);
            if (z && colorStateList != null) {
                this.j.V(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.j.setTint(typedValue.data);
        }
    }

    private void R() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        ofFloat.setDuration(500L);
        this.p.addUpdateListener(new b());
    }

    private float V() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f2979d);
        return this.K.getYVelocity(this.L);
    }

    private void X() {
        this.L = -1;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    private void Y(g gVar) {
        int i = this.f2976a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f2980e = gVar.f2993e;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f2977b = gVar.f2994f;
        }
        if (i == -1 || (i & 4) == 4) {
            this.w = gVar.f2995g;
        }
        if (i != -1 && (i & 8) != 8) {
            return;
        }
        this.x = gVar.f2996h;
    }

    private void l0(View view) {
        if (Build.VERSION.SDK_INT < 29 || W() || this.f2981f) {
            return;
        }
        p.a(view, new c());
    }

    private void n0(int i) {
        V v = this.H.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !t.N(v)) {
            m0(v, i);
        } else {
            v.post(new a(v, i));
        }
    }

    private void q0() {
        V v;
        c.a aVar;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        t.c0(v, 524288);
        t.c0(v, 262144);
        t.c0(v, 1048576);
        if (this.w && this.z != 5) {
            L(v, c.a.l, 5);
        }
        int i = this.z;
        int i2 = 6;
        if (i == 3) {
            if (this.f2977b) {
                i2 = 4;
            }
            aVar = c.a.k;
        } else if (i != 4) {
            if (i != 6) {
                return;
            }
            L(v, c.a.k, 4);
            L(v, c.a.j, 3);
            return;
        } else {
            if (this.f2977b) {
                i2 = 3;
            }
            aVar = c.a.j;
        }
        L(v, aVar, i2);
    }

    private void r0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (this.j == null || (valueAnimator = this.p) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.p.reverse();
            return;
        }
        float f2 = z ? 0.0f : 1.0f;
        this.p.setFloatValues(1.0f - f2, f2);
        this.p.start();
    }

    private void s0(boolean z) {
        Map<View, Integer> map;
        int intValue;
        int i = Build.VERSION.SDK_INT;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (i >= 16 && z) {
            if (this.O != null) {
                return;
            }
            this.O = new HashMap(childCount);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            if (childAt != this.H.get()) {
                if (z) {
                    if (i >= 16) {
                        this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    if (this.f2978c) {
                        intValue = 4;
                        t.r0(childAt, intValue);
                    }
                } else if (this.f2978c && (map = this.O) != null && map.containsKey(childAt)) {
                    intValue = this.O.get(childAt).intValue();
                    t.r0(childAt, intValue);
                }
            }
        }
        if (z) {
            return;
        }
        this.O = null;
    }

    public void t0(boolean z) {
        V v;
        if (this.H != null) {
            M();
            if (this.z != 4 || (v = this.H.get()) == null) {
                return;
            }
            if (z) {
                n0(this.z);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.C = 0;
        this.D = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.r) < java.lang.Math.abs(r3 - r2.u)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.u)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.u)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.s) < java.lang.Math.abs(r3 - r2.u)) goto L43;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.U()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.k0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.I
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb1
            boolean r3 = r2.D
            if (r3 != 0) goto L1f
            goto Lb1
        L1f:
            int r3 = r2.C
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.f2977b
            if (r3 == 0) goto L2d
        L29:
            int r3 = r2.r
            goto Lab
        L2d:
            int r3 = r4.getTop()
            int r5 = r2.s
            if (r3 <= r5) goto L38
            r3 = r5
            goto Laa
        L38:
            int r3 = r2.q
            goto Lab
        L3c:
            boolean r3 = r2.w
            if (r3 == 0) goto L4e
            float r3 = r2.V()
            boolean r3 = r2.o0(r4, r3)
            if (r3 == 0) goto L4e
            int r3 = r2.G
            r0 = 5
            goto Lab
        L4e:
            int r3 = r2.C
            if (r3 != 0) goto L8b
            int r3 = r4.getTop()
            boolean r1 = r2.f2977b
            if (r1 == 0) goto L6c
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L8f
            goto L29
        L6c:
            int r1 = r2.s
            if (r3 >= r1) goto L7b
            int r5 = r2.u
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto La8
            goto L38
        L7b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
            goto La8
        L8b:
            boolean r3 = r2.f2977b
            if (r3 == 0) goto L93
        L8f:
            int r3 = r2.u
            r0 = 4
            goto Lab
        L93:
            int r3 = r4.getTop()
            int r0 = r2.s
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
        La8:
            int r3 = r2.s
        Laa:
            r0 = 6
        Lab:
            r5 = 0
            r2.p0(r4, r0, r3, r5)
            r2.D = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.z == 1 && actionMasked == 0) {
            return true;
        }
        b.i.b.d dVar = this.A;
        if (dVar != null) {
            dVar.F(motionEvent);
        }
        if (actionMasked == 0) {
            X();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (this.A != null && actionMasked == 2 && !this.B && Math.abs(this.M - motionEvent.getY()) > this.A.z()) {
            this.A.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.B;
    }

    void S(int i) {
        float f2;
        float f3;
        V v = this.H.get();
        if (v == null || this.J.isEmpty()) {
            return;
        }
        int i2 = this.u;
        if (i > i2 || i2 == U()) {
            int i3 = this.u;
            f2 = i3 - i;
            f3 = this.G - i3;
        } else {
            int i4 = this.u;
            f2 = i4 - i;
            f3 = i4 - U();
        }
        float f4 = f2 / f3;
        for (int i5 = 0; i5 < this.J.size(); i5++) {
            this.J.get(i5).a(v, f4);
        }
    }

    View T(View view) {
        if (t.P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View T = T(viewGroup.getChildAt(i));
            if (T != null) {
                return T;
            }
        }
        return null;
    }

    public int U() {
        return this.f2977b ? this.r : this.q;
    }

    public boolean W() {
        return this.l;
    }

    public void Z(boolean z) {
        this.y = z;
    }

    public void a0(int i) {
        if (i >= 0) {
            this.q = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void b0(boolean z) {
        if (this.f2977b == z) {
            return;
        }
        this.f2977b = z;
        if (this.H != null) {
            M();
        }
        k0((!this.f2977b || this.z != 6) ? this.z : 3);
        q0();
    }

    public void c0(boolean z) {
        this.l = z;
    }

    public void d0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.t = f2;
        if (this.H == null) {
            return;
        }
        N();
    }

    public void e0(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z && this.z == 5) {
                j0(4);
            }
            q0();
        }
    }

    public void f0(int i) {
        g0(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.H = null;
        this.A = null;
    }

    public final void g0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f2981f) {
                this.f2981f = true;
            }
            z2 = false;
        } else {
            if (this.f2981f || this.f2980e != i) {
                this.f2981f = false;
                this.f2980e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            t0(z);
        }
    }

    public void h0(int i) {
        this.f2976a = i;
    }

    public void i0(boolean z) {
        this.x = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.H = null;
        this.A = null;
    }

    public void j0(int i) {
        if (i == this.z) {
            return;
        }
        if (this.H != null) {
            n0(i);
        } else if (i != 4 && i != 3 && i != 6 && (!this.w || i != 5)) {
        } else {
            this.z = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        b.i.b.d dVar;
        if (!v.isShown() || !this.y) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            X();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.z != 2) {
                WeakReference<View> weakReference = this.I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x, this.M)) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
            }
            this.B = this.L == -1 && !coordinatorLayout.B(v, x, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
            this.L = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (!this.B && (dVar = this.A) != null && dVar.P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.I;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.B && this.z != 1 && !coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.A != null && Math.abs(((float) this.M) - motionEvent.getY()) > ((float) this.A.z());
    }

    void k0(int i) {
        V v;
        if (this.z == i) {
            return;
        }
        this.z = i;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            s0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            s0(false);
        }
        r0(i);
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            this.J.get(i2).b(v, i);
        }
        q0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        d.a.a.a.a0.g gVar;
        if (t.v(coordinatorLayout) && !t.v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.f2982g = coordinatorLayout.getResources().getDimensionPixelSize(d.a.a.a.d.b_res_0x7f07006f);
            l0(v);
            this.H = new WeakReference<>(v);
            if (this.i && (gVar = this.j) != null) {
                t.l0(v, gVar);
            }
            d.a.a.a.a0.g gVar2 = this.j;
            if (gVar2 != null) {
                float f2 = this.v;
                if (f2 == -1.0f) {
                    f2 = t.t(v);
                }
                gVar2.U(f2);
                boolean z = this.z == 3;
                this.n = z;
                this.j.W(z ? 0.0f : 1.0f);
            }
            q0();
            if (t.w(v) == 0) {
                t.r0(v, 1);
            }
        }
        if (this.A == null) {
            this.A = b.i.b.d.o(coordinatorLayout, this.P);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.E = height;
        this.r = Math.max(0, this.G - height);
        N();
        M();
        int i3 = this.z;
        if (i3 == 3) {
            i2 = U();
        } else if (i3 == 6) {
            i2 = this.s;
        } else if (this.w && i3 == 5) {
            i2 = this.G;
        } else if (i3 != 4) {
            if (i3 == 1 || i3 == 2) {
                t.U(v, top - v.getTop());
            }
            this.I = new WeakReference<>(T(v));
            return true;
        } else {
            i2 = this.u;
        }
        t.U(v, i2);
        this.I = new WeakReference<>(T(v));
        return true;
    }

    void m0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.u;
        } else if (i == 6) {
            int i4 = this.s;
            if (!this.f2977b || i4 > (i3 = this.r)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = U();
        } else if (!this.w || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.G;
        }
        p0(view, i, i2, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.z != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    boolean o0(View view, float f2) {
        if (this.x) {
            return true;
        }
        if (view.getTop() < this.u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.u)) / ((float) O()) > 0.5f;
    }

    void p0(View view, int i, int i2, boolean z) {
        b.i.b.d dVar = this.A;
        if (!(dVar != null && (!z ? dVar.Q(view, view.getLeft(), i2) : dVar.O(view.getLeft(), i2)))) {
            k0(i);
            return;
        }
        k0(2);
        r0(i);
        if (this.o == null) {
            this.o = new h(view, i);
        }
        if (((h) this.o).f2998c) {
            this.o.f2999d = i;
            return;
        }
        BottomSheetBehavior<V>.h hVar = this.o;
        hVar.f2999d = i;
        t.a0(view, hVar);
        ((h) this.o).f2998c = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.I;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < U()) {
                iArr[1] = top - U();
                t.U(v, -iArr[1]);
                i4 = 3;
                k0(i4);
            } else if (!this.y) {
                return;
            } else {
                iArr[1] = i2;
                t.U(v, -i2);
                k0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.u;
            if (i5 > i6 && !this.w) {
                iArr[1] = top - i6;
                t.U(v, -iArr[1]);
                i4 = 4;
                k0(i4);
            } else if (!this.y) {
                return;
            } else {
                iArr[1] = i2;
                t.U(v, -i2);
                k0(1);
            }
        }
        S(v.getTop());
        this.C = i2;
        this.D = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v, gVar.a());
        Y(gVar);
        int i = gVar.f2992d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.z = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new g(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
