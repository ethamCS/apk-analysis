package com.google.android.material.bottomsheet;

import a.g.l.d0.c;
import a.g.l.d0.f;
import a.g.l.u;
import a.i.b.c;
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
import b.a.a.a.k;
import b.a.a.a.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = k.Widget_Design_BottomSheet_Modal;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D;
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.AbstractC0022c J;

    /* renamed from: a */
    private int f1427a;

    /* renamed from: b */
    private boolean f1428b;

    /* renamed from: c */
    private float f1429c;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private b.a.a.a.b0.g h;
    private b.a.a.a.b0.k i;
    private boolean j;
    private BottomSheetBehavior<V>.g k;
    private ValueAnimator l;
    int m;
    int n;
    int o;
    float p;
    int q;
    float r;
    boolean s;
    private boolean t;
    int u;
    a.i.b.c v;
    private boolean w;
    private int x;
    private boolean y;
    int z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1430b;

        /* renamed from: c */
        final /* synthetic */ int f1431c;

        a(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.f1430b = view;
            this.f1431c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.a(this.f1430b, this.f1431c);
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
            if (BottomSheetBehavior.this.h != null) {
                BottomSheetBehavior.this.h.c(floatValue);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends c.AbstractC0022c {
        c() {
            BottomSheetBehavior.this = r1;
        }

        @Override // a.i.b.c.AbstractC0022c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
            if (java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.o) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.q)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
            if (java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.n) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.q)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.q)) goto L30;
         */
        @Override // a.i.b.c.AbstractC0022c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, float, float):void");
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.a(i2);
        }

        @Override // a.i.b.c.AbstractC0022c
        public int b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
        }

        @Override // a.i.b.c.AbstractC0022c
        public int b(View view, int i, int i2) {
            int e = BottomSheetBehavior.this.e();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.g.g.a.a(i, e, bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q);
        }

        @Override // a.i.b.c.AbstractC0022c
        public boolean b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.u;
            if (i2 != 1 && !bottomSheetBehavior.H) {
                if (i2 == 3 && bottomSheetBehavior.F == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.C;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
                return weakReference2 != null && weakReference2.get() == view;
            }
            return false;
        }

        @Override // a.i.b.c.AbstractC0022c
        public void c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.f(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.g.l.d0.f {

        /* renamed from: a */
        final /* synthetic */ int f1434a;

        d(int i) {
            BottomSheetBehavior.this = r1;
            this.f1434a = i;
        }

        @Override // a.g.l.d0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.e(this.f1434a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a(View view, float f);

        public abstract void a(View view, int i);
    }

    /* loaded from: classes.dex */
    public static class f extends a.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        final int d;
        int e;
        boolean f;
        boolean g;
        boolean h;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            boolean z = false;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1 ? true : z;
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d = bottomSheetBehavior.u;
            this.e = ((BottomSheetBehavior) bottomSheetBehavior).d;
            this.f = ((BottomSheetBehavior) bottomSheetBehavior).f1428b;
            this.g = bottomSheetBehavior.s;
            this.h = ((BottomSheetBehavior) bottomSheetBehavior).t;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: b */
        private final View f1436b;

        /* renamed from: c */
        private boolean f1437c;
        int d;

        g(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.f1436b = view;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.i.b.c cVar = BottomSheetBehavior.this.v;
            if (cVar == null || !cVar.a(true)) {
                BottomSheetBehavior.this.f(this.d);
            } else {
                u.a(this.f1436b, this);
            }
            this.f1437c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f1427a = 0;
        this.f1428b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        this.f1427a = 0;
        this.f1428b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.BottomSheetBehavior_Layout);
        this.g = obtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            a(context, attributeSet, hasValue, b.a.a.a.y.c.a(context, obtainStyledAttributes, l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            a(context, attributeSet, hasValue);
        }
        d();
        if (Build.VERSION.SDK_INT >= 21) {
            this.r = obtainStyledAttributes.getDimension(l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(l.BottomSheetBehavior_Layout_behavior_peekHeight);
        c((peekValue == null || (dimensionPixelSize = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(l.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : dimensionPixelSize);
        b(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_hideable, false));
        a(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        d(obtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        a(obtainStyledAttributes.getFloat(l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        b(obtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.f1429c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void a(Context context, AttributeSet attributeSet, boolean z) {
        a(context, attributeSet, z, (ColorStateList) null);
    }

    private void a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.g) {
            this.i = b.a.a.a.b0.k.a(context, attributeSet, b.a.a.a.b.bottomSheetStyle, K).a();
            b.a.a.a.b0.g gVar = new b.a.a.a.b0.g(this.i);
            this.h = gVar;
            gVar.a(context);
            if (z && colorStateList != null) {
                this.h.a(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.h.setTint(typedValue.data);
        }
    }

    private void a(V v, c.a aVar, int i) {
        u.a(v, aVar, null, new d(i));
    }

    private void a(f fVar) {
        int i = this.f1427a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.d = fVar.e;
        }
        int i2 = this.f1427a;
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f1428b = fVar.f;
        }
        int i3 = this.f1427a;
        if (i3 == -1 || (i3 & 4) == 4) {
            this.s = fVar.g;
        }
        int i4 = this.f1427a;
        if (i4 != -1 && (i4 & 8) != 8) {
            return;
        }
        this.t = fVar.h;
    }

    private void b() {
        int max = this.e ? Math.max(this.f, this.A - ((this.z * 9) / 16)) : this.d;
        if (this.f1428b) {
            this.q = Math.max(this.A - max, this.n);
        } else {
            this.q = this.A - max;
        }
    }

    private void c() {
        this.o = (int) (this.A * (1.0f - this.p));
    }

    private void d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.setDuration(500L);
        this.l.addUpdateListener(new b());
    }

    private void d(boolean z) {
        int i;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (Build.VERSION.SDK_INT >= 16 && z) {
            if (this.I != null) {
                return;
            }
            this.I = new HashMap(childCount);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            if (childAt != this.B.get()) {
                if (!z) {
                    Map<View, Integer> map = this.I;
                    if (map != null && map.containsKey(childAt)) {
                        i = this.I.get(childAt).intValue();
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 16) {
                        this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    i = 4;
                }
                u.h(childAt, i);
            }
        }
        if (z) {
            return;
        }
        this.I = null;
    }

    public int e() {
        return this.f1428b ? this.n : this.m;
    }

    private float f() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f1429c);
        return this.E.getYVelocity(this.F);
    }

    private void g() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void g(int i) {
        V v = this.B.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !u.C(v)) {
            a((View) v, i);
        } else {
            v.post(new a(v, i));
        }
    }

    private void h() {
        V v;
        c.a aVar;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        u.f(v, 524288);
        u.f(v, 262144);
        u.f(v, 1048576);
        if (this.s && this.u != 5) {
            a((BottomSheetBehavior<V>) v, c.a.j, 5);
        }
        int i = this.u;
        int i2 = 6;
        if (i == 3) {
            if (this.f1428b) {
                i2 = 4;
            }
            aVar = c.a.i;
        } else if (i != 4) {
            if (i != 6) {
                return;
            }
            a((BottomSheetBehavior<V>) v, c.a.i, 4);
            a((BottomSheetBehavior<V>) v, c.a.h, 3);
            return;
        } else {
            if (this.f1428b) {
                i2 = 3;
            }
            aVar = c.a.h;
        }
        a((BottomSheetBehavior<V>) v, aVar, i2);
    }

    private void h(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.j == z) {
            return;
        }
        this.j = z;
        if (this.h == null || (valueAnimator = this.l) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.l.reverse();
            return;
        }
        float f2 = z ? 0.0f : 1.0f;
        this.l.setFloatValues(1.0f - f2, f2);
        this.l.start();
    }

    View a(View view) {
        if (u.E(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a() {
        super.a();
        this.B = null;
        this.v = null;
    }

    public void a(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.p = f2;
    }

    void a(int i) {
        float f2;
        float f3;
        V v = this.B.get();
        if (v == null || this.D.isEmpty()) {
            return;
        }
        int i2 = this.q;
        if (i > i2) {
            f2 = i2 - i;
            f3 = this.A - i2;
        } else {
            f2 = i2 - i;
            f3 = i2 - e();
        }
        float f4 = f2 / f3;
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            this.D.get(i3).a(v, f4);
        }
    }

    public final void a(int i, boolean z) {
        V v;
        boolean z2 = true;
        if (i == -1) {
            if (!this.e) {
                this.e = true;
            }
            z2 = false;
        } else {
            if (this.e || this.d != i) {
                this.e = false;
                this.d = Math.max(0, i);
            }
            z2 = false;
        }
        if (!z2 || this.B == null) {
            return;
        }
        b();
        if (this.u != 4 || (v = this.B.get()) == null) {
            return;
        }
        if (z) {
            g(this.u);
        } else {
            v.requestLayout();
        }
    }

    void a(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.q;
        } else if (i == 6) {
            int i4 = this.o;
            if (!this.f1428b || i4 > (i3 = this.n)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = e();
        } else if (!this.s || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.A;
        }
        a(view, i, i2, false);
    }

    void a(View view, int i, int i2, boolean z) {
        if (!(z ? this.v.d(view.getLeft(), i2) : this.v.b(view, view.getLeft(), i2))) {
            f(i);
            return;
        }
        f(2);
        h(i);
        if (this.k == null) {
            this.k = new g(view, i);
        }
        if (((g) this.k).f1437c) {
            this.k.d = i;
            return;
        }
        BottomSheetBehavior<V>.g gVar = this.k;
        gVar.d = i;
        u.a(view, gVar);
        ((g) this.k).f1437c = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        super.a(fVar);
        this.B = null;
        this.v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.a(coordinatorLayout, (CoordinatorLayout) v, fVar.d());
        a(fVar);
        int i = fVar.d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.q)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.o) < java.lang.Math.abs(r3 - r2.q)) goto L39;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.e()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.f(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.C
            if (r3 == 0) goto La4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto La4
            boolean r3 = r2.y
            if (r3 != 0) goto L1f
            goto La4
        L1f:
            int r3 = r2.x
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L2b
            int r3 = r2.e()
            goto L9e
        L2b:
            boolean r3 = r2.s
            if (r3 == 0) goto L3d
            float r3 = r2.f()
            boolean r3 = r2.a(r4, r3)
            if (r3 == 0) goto L3d
            int r3 = r2.A
            r0 = 5
            goto L9e
        L3d:
            int r3 = r2.x
            if (r3 != 0) goto L7e
            int r3 = r4.getTop()
            boolean r1 = r2.f1428b
            if (r1 == 0) goto L5d
            int r5 = r2.n
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L82
            int r3 = r2.n
            goto L9e
        L5d:
            int r1 = r2.o
            if (r3 >= r1) goto L6e
            int r6 = r2.q
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L9b
            int r3 = r2.m
            goto L9e
        L6e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
            goto L9b
        L7e:
            boolean r3 = r2.f1428b
            if (r3 == 0) goto L86
        L82:
            int r3 = r2.q
            r0 = 4
            goto L9e
        L86:
            int r3 = r4.getTop()
            int r0 = r2.o
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
        L9b:
            int r3 = r2.o
            r0 = 6
        L9e:
            r5 = 0
            r2.a(r4, r0, r3, r5)
            r2.y = r5
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < e()) {
                iArr[1] = top - e();
                u.e(v, -iArr[1]);
                i4 = 3;
                f(i4);
            } else {
                iArr[1] = i2;
                u.e(v, -i2);
                f(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.q;
            if (i5 <= i6 || this.s) {
                iArr[1] = i2;
                u.e(v, -i2);
                f(1);
            } else {
                iArr[1] = top - i6;
                u.e(v, -iArr[1]);
                i4 = 4;
                f(i4);
            }
        }
        a(v.getTop());
        this.x = i2;
        this.y = true;
    }

    public void a(boolean z) {
        if (this.f1428b == z) {
            return;
        }
        this.f1428b = z;
        if (this.B != null) {
            b();
        }
        f((!this.f1428b || this.u != 6) ? this.u : 3);
        h();
    }

    boolean a(View view, float f2) {
        if (this.t) {
            return true;
        }
        return view.getTop() >= this.q && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.q)) / ((float) this.d) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        b.a.a.a.b0.g gVar;
        if (u.l(coordinatorLayout) && !u.l(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(b.a.a.a.d.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v);
            if (this.g && (gVar = this.h) != null) {
                u.a(v, gVar);
            }
            b.a.a.a.b0.g gVar2 = this.h;
            if (gVar2 != null) {
                float f2 = this.r;
                if (f2 == -1.0f) {
                    f2 = u.k(v);
                }
                gVar2.b(f2);
                boolean z = this.u == 3;
                this.j = z;
                this.h.c(z ? 0.0f : 1.0f);
            }
            h();
            if (u.m(v) == 0) {
                u.h(v, 1);
            }
        }
        if (this.v == null) {
            this.v = a.i.b.c.a(coordinatorLayout, this.J);
        }
        int top = v.getTop();
        coordinatorLayout.c(v, i);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.n = Math.max(0, height - v.getHeight());
        c();
        b();
        int i3 = this.u;
        if (i3 == 3) {
            i2 = e();
        } else if (i3 == 6) {
            i2 = this.o;
        } else if (!this.s || i3 != 5) {
            int i4 = this.u;
            if (i4 != 4) {
                if (i4 == 1 || i4 == 2) {
                    u.e(v, top - v.getTop());
                }
                this.C = new WeakReference<>(a(v));
                return true;
            }
            i2 = this.q;
        } else {
            i2 = this.A;
        }
        u.e(v, i2);
        this.C = new WeakReference<>(a(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar;
        if (!v.isShown()) {
            this.w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            g();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.u != 2) {
                WeakReference<View> weakReference = this.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.a(view2, x, this.G)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            this.w = this.F == -1 && !coordinatorLayout.a(v, x, this.G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
            this.F = -1;
            if (this.w) {
                this.w = false;
                return false;
            }
        }
        if (!this.w && (cVar = this.v) != null && cVar.b(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.C;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.w && this.u != 1 && !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.v != null && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.v.d());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.u != 3 || super.a(coordinatorLayout, (CoordinatorLayout) v, view, f2, f3);
    }

    public void b(int i) {
        if (i >= 0) {
            this.m = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void b(boolean z) {
        if (this.s != z) {
            this.s = z;
            if (!z && this.u == 5) {
                e(4);
            }
            h();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        a.i.b.c cVar = this.v;
        if (cVar != null) {
            cVar.a(motionEvent);
        }
        if (actionMasked == 0) {
            g();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.w && Math.abs(this.G - motionEvent.getY()) > this.v.d()) {
            this.v.a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.w;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.x = 0;
        this.y = false;
        return (i & 2) != 0;
    }

    public void c(int i) {
        a(i, false);
    }

    public void c(boolean z) {
        this.t = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable d(CoordinatorLayout coordinatorLayout, V v) {
        return new f(super.d(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public void d(int i) {
        this.f1427a = i;
    }

    public void e(int i) {
        if (i == this.u) {
            return;
        }
        if (this.B != null) {
            g(i);
        } else if (i != 4 && i != 3 && i != 6 && (!this.s || i != 5)) {
        } else {
            this.u = i;
        }
    }

    void f(int i) {
        V v;
        if (this.u == i) {
            return;
        }
        this.u = i;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            d(true);
        } else if (i == 5 || i == 4) {
            d(false);
        }
        h(i);
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            this.D.get(i2).a((View) v, i);
        }
        h();
    }
}
