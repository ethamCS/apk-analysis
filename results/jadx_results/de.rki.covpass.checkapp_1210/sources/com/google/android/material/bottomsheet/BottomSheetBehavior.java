package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.y;
import b5.j;
import b5.k;
import b5.l;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import w0.c;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: d0 */
    private static final int f6915d0 = k.f5489h;
    private ValueAnimator A;
    int B;
    int C;
    int D;
    float E;
    int F;
    float G;
    boolean H;
    private boolean I;
    private boolean J;
    int K;
    int L;
    w0.c M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    int R;
    int S;
    WeakReference<V> T;
    WeakReference<View> U;
    private final ArrayList<f> V;
    private VelocityTracker W;
    int X;
    private int Y;
    boolean Z;

    /* renamed from: a */
    private int f6916a;

    /* renamed from: a0 */
    private Map<View, Integer> f6917a0;

    /* renamed from: b */
    private boolean f6918b;

    /* renamed from: b0 */
    private int f6919b0;

    /* renamed from: c */
    private boolean f6920c;

    /* renamed from: c0 */
    private final c.AbstractC0436c f6921c0;

    /* renamed from: d */
    private float f6922d;

    /* renamed from: e */
    private int f6923e;

    /* renamed from: f */
    private boolean f6924f;

    /* renamed from: g */
    private int f6925g;

    /* renamed from: h */
    private int f6926h;

    /* renamed from: i */
    private t5.g f6927i;

    /* renamed from: j */
    private ColorStateList f6928j;

    /* renamed from: k */
    private int f6929k;

    /* renamed from: l */
    private int f6930l;

    /* renamed from: m */
    private int f6931m;

    /* renamed from: n */
    private boolean f6932n;

    /* renamed from: o */
    private boolean f6933o;

    /* renamed from: p */
    private boolean f6934p;

    /* renamed from: q */
    private boolean f6935q;

    /* renamed from: r */
    private boolean f6936r;

    /* renamed from: s */
    private boolean f6937s;

    /* renamed from: t */
    private boolean f6938t;

    /* renamed from: u */
    private boolean f6939u;

    /* renamed from: v */
    private int f6940v;

    /* renamed from: w */
    private int f6941w;

    /* renamed from: x */
    private t5.k f6942x;

    /* renamed from: y */
    private boolean f6943y;

    /* renamed from: z */
    private final BottomSheetBehavior<V>.h f6944z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f6945c;

        /* renamed from: d */
        final /* synthetic */ int f6946d;

        a(View view, int i10) {
            BottomSheetBehavior.this = r1;
            this.f6945c = view;
            this.f6946d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f6945c, this.f6946d, false);
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
            if (BottomSheetBehavior.this.f6927i != null) {
                BottomSheetBehavior.this.f6927i.a0(floatValue);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements o.d {

        /* renamed from: a */
        final /* synthetic */ boolean f6949a;

        c(boolean z10) {
            BottomSheetBehavior.this = r1;
            this.f6949a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.o.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.j0 a(android.view.View r11, androidx.core.view.j0 r12, com.google.android.material.internal.o.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.j0.m.c()
                androidx.core.graphics.b r0 = r12.f(r0)
                int r1 = androidx.core.view.j0.m.b()
                androidx.core.graphics.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f3453b
                com.google.android.material.bottomsheet.BottomSheetBehavior.N(r2, r3)
                boolean r2 = com.google.android.material.internal.o.e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r3, r6)
                int r3 = r13.f7432d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.P(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f7431c
                goto L50
            L4e:
                int r4 = r13.f7429a
            L50:
                int r6 = r0.f3452a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.S(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f7429a
                goto L62
            L60:
                int r13 = r13.f7431c
            L62:
                int r2 = r0.f3454c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f3452a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f3454c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f3453b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f6949a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f3455d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f6949a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.j0, com.google.android.material.internal.o$e):androidx.core.view.j0");
        }
    }

    /* loaded from: classes.dex */
    class d extends c.AbstractC0436c {

        /* renamed from: a */
        private long f6951a;

        d() {
            BottomSheetBehavior.this = r1;
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.S + bottomSheetBehavior.f0()) / 2;
        }

        @Override // w0.c.AbstractC0436c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // w0.c.AbstractC0436c
        public int b(View view, int i10, int i11) {
            int f02 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return s0.a.b(i10, f02, bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F);
        }

        @Override // w0.c.AbstractC0436c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F;
        }

        @Override // w0.c.AbstractC0436c
        public void j(int i10) {
            if (i10 != 1 || !BottomSheetBehavior.this.J) {
                return;
            }
            BottomSheetBehavior.this.C0(1);
        }

        @Override // w0.c.AbstractC0436c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.c0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.E0(r0, (r9 * 100.0f) / r10.S) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            if (r9 > com.google.android.material.bottomsheet.BottomSheetBehavior.this.D) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f0()) < java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.D)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.H0() == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.C) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.H0() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.H0() == false) goto L53;
         */
        @Override // w0.c.AbstractC0436c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // w0.c.AbstractC0436c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.K;
            if (i11 != 1 && !bottomSheetBehavior.Z) {
                if (i11 == 3 && bottomSheetBehavior.X == i10) {
                    WeakReference<View> weakReference = bottomSheetBehavior.U;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.f6951a = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.T;
                return weakReference2 != null && weakReference2.get() == view;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements androidx.core.view.accessibility.g {

        /* renamed from: a */
        final /* synthetic */ int f6953a;

        e(int i10) {
            BottomSheetBehavior.this = r1;
            this.f6953a = i10;
        }

        @Override // androidx.core.view.accessibility.g
        public boolean a(View view, g.a aVar) {
            BottomSheetBehavior.this.B0(this.f6953a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    /* loaded from: classes.dex */
    public static class g extends v0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        boolean U3;
        boolean V3;

        /* renamed from: q */
        final int f6955q;

        /* renamed from: x */
        int f6956x;

        /* renamed from: y */
        boolean f6957y;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
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
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6955q = parcel.readInt();
            this.f6956x = parcel.readInt();
            boolean z10 = false;
            this.f6957y = parcel.readInt() == 1;
            this.U3 = parcel.readInt() == 1;
            this.V3 = parcel.readInt() == 1 ? true : z10;
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f6955q = bottomSheetBehavior.K;
            this.f6956x = ((BottomSheetBehavior) bottomSheetBehavior).f6923e;
            this.f6957y = ((BottomSheetBehavior) bottomSheetBehavior).f6918b;
            this.U3 = bottomSheetBehavior.H;
            this.V3 = ((BottomSheetBehavior) bottomSheetBehavior).I;
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6955q);
            parcel.writeInt(this.f6956x);
            parcel.writeInt(this.f6957y ? 1 : 0);
            parcel.writeInt(this.U3 ? 1 : 0);
            parcel.writeInt(this.V3 ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a */
        private int f6958a;

        /* renamed from: b */
        private boolean f6959b;

        /* renamed from: c */
        private final Runnable f6960c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
                h.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f6959b = false;
                w0.c cVar = BottomSheetBehavior.this.M;
                if (cVar != null && cVar.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f6958a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K != 2) {
                    return;
                }
                bottomSheetBehavior.C0(hVar2.f6958a);
            }
        }

        private h() {
            BottomSheetBehavior.this = r1;
            this.f6960c = new a();
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f6958a = i10;
            if (this.f6959b) {
                return;
            }
            y.g0(BottomSheetBehavior.this.T.get(), this.f6960c);
            this.f6959b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f6916a = 0;
        this.f6918b = true;
        this.f6920c = false;
        this.f6929k = -1;
        this.f6930l = -1;
        this.f6944z = new h(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.f6919b0 = -1;
        this.f6921c0 = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f6916a = 0;
        this.f6918b = true;
        this.f6920c = false;
        this.f6929k = -1;
        this.f6930l = -1;
        this.f6944z = new h(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.f6919b0 = -1;
        this.f6921c0 = new d();
        this.f6926h = context.getResources().getDimensionPixelSize(b5.d.X);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.L);
        int i11 = l.P;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f6928j = q5.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(l.f5563g0)) {
            this.f6942x = t5.k.e(context, attributeSet, b5.b.d_res_0x7f030069, f6915d0).m();
        }
        a0(context);
        b0();
        this.G = obtainStyledAttributes.getDimension(l.O, -1.0f);
        int i12 = l.M;
        if (obtainStyledAttributes.hasValue(i12)) {
            w0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = l.N;
        if (obtainStyledAttributes.hasValue(i13)) {
            v0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = l.V;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            x0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            x0(i10);
        }
        u0(obtainStyledAttributes.getBoolean(l.U, false));
        s0(obtainStyledAttributes.getBoolean(l.Y, false));
        r0(obtainStyledAttributes.getBoolean(l.S, true));
        A0(obtainStyledAttributes.getBoolean(l.X, false));
        p0(obtainStyledAttributes.getBoolean(l.Q, true));
        z0(obtainStyledAttributes.getInt(l.W, 0));
        t0(obtainStyledAttributes.getFloat(l.T, 0.5f));
        int i15 = l.R;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        q0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i15, 0) : peekValue2.data);
        this.f6933o = obtainStyledAttributes.getBoolean(l.f5527c0, false);
        this.f6934p = obtainStyledAttributes.getBoolean(l.f5536d0, false);
        this.f6935q = obtainStyledAttributes.getBoolean(l.f5545e0, false);
        this.f6936r = obtainStyledAttributes.getBoolean(l.f5554f0, true);
        this.f6937s = obtainStyledAttributes.getBoolean(l.Z, false);
        this.f6938t = obtainStyledAttributes.getBoolean(l.f5509a0, false);
        this.f6939u = obtainStyledAttributes.getBoolean(l.f5518b0, false);
        obtainStyledAttributes.recycle();
        this.f6922d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void D0(View view) {
        boolean z10 = Build.VERSION.SDK_INT >= 29 && !i0() && !this.f6924f;
        if (this.f6933o || this.f6934p || this.f6935q || this.f6937s || this.f6938t || this.f6939u || z10) {
            o.a(view, new c(z10));
        }
    }

    private boolean F0() {
        return this.M != null && (this.J || this.K == 1);
    }

    public void J0(View view, int i10, boolean z10) {
        int g02 = g0(i10);
        w0.c cVar = this.M;
        if (!(cVar != null && (!z10 ? cVar.H(view, view.getLeft(), g02) : cVar.F(view.getLeft(), g02)))) {
            C0(i10);
            return;
        }
        C0(2);
        L0(i10);
        this.f6944z.c(i10);
    }

    private void K0() {
        V v10;
        d.a aVar;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        y.i0(v10, 524288);
        y.i0(v10, 262144);
        y.i0(v10, 1048576);
        int i10 = this.f6919b0;
        if (i10 != -1) {
            y.i0(v10, i10);
        }
        int i11 = 6;
        if (!this.f6918b && this.K != 6) {
            this.f6919b0 = V(v10, j.a_res_0x7f1000dc, 6);
        }
        if (this.H && this.K != 5) {
            l0(v10, d.a.f3634y, 5);
        }
        int i12 = this.K;
        if (i12 == 3) {
            if (this.f6918b) {
                i11 = 4;
            }
            aVar = d.a.f3633x;
        } else if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            l0(v10, d.a.f3633x, 4);
            l0(v10, d.a.f3632w, 3);
            return;
        } else {
            if (this.f6918b) {
                i11 = 3;
            }
            aVar = d.a.f3632w;
        }
        l0(v10, aVar, i11);
    }

    private void L0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f6943y == z10) {
            return;
        }
        this.f6943y = z10;
        if (this.f6927i == null || (valueAnimator = this.A) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.A.reverse();
            return;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        this.A.setFloatValues(1.0f - f10, f10);
        this.A.start();
    }

    private void M0(boolean z10) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f6917a0 != null) {
                return;
            }
            this.f6917a0 = new HashMap(childCount);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.T.get()) {
                if (z10) {
                    this.f6917a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f6920c) {
                        intValue = 4;
                        y.y0(childAt, intValue);
                    }
                } else if (this.f6920c && (map = this.f6917a0) != null && map.containsKey(childAt)) {
                    intValue = this.f6917a0.get(childAt).intValue();
                    y.y0(childAt, intValue);
                }
            }
        }
        if (!z10) {
            this.f6917a0 = null;
        } else if (this.f6920c) {
            this.T.get().sendAccessibilityEvent(8);
        }
    }

    public void N0(boolean z10) {
        V v10;
        if (this.T != null) {
            W();
            if (this.K != 4 || (v10 = this.T.get()) == null) {
                return;
            }
            if (z10) {
                B0(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private int V(V v10, int i10, int i11) {
        return y.c(v10, v10.getResources().getString(i10), Z(i11));
    }

    private void W() {
        int Y = Y();
        if (this.f6918b) {
            this.F = Math.max(this.S - Y, this.C);
        } else {
            this.F = this.S - Y;
        }
    }

    private void X() {
        this.D = (int) (this.S * (1.0f - this.E));
    }

    private int Y() {
        int i10;
        return this.f6924f ? Math.min(Math.max(this.f6925g, this.S - ((this.R * 9) / 16)), this.Q) + this.f6940v : (this.f6932n || this.f6933o || (i10 = this.f6931m) <= 0) ? this.f6923e + this.f6940v : Math.max(this.f6923e, i10 + this.f6926h);
    }

    private androidx.core.view.accessibility.g Z(int i10) {
        return new e(i10);
    }

    private void a0(Context context) {
        if (this.f6942x == null) {
            return;
        }
        t5.g gVar = new t5.g(this.f6942x);
        this.f6927i = gVar;
        gVar.O(context);
        ColorStateList colorStateList = this.f6928j;
        if (colorStateList != null) {
            this.f6927i.Z(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f6927i.setTint(typedValue.data);
    }

    private void b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = ofFloat;
        ofFloat.setDuration(500L);
        this.A.addUpdateListener(new b());
    }

    private int e0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int g0(int i10) {
        if (i10 != 3) {
            if (i10 == 4) {
                return this.F;
            }
            if (i10 == 5) {
                return this.S;
            }
            if (i10 == 6) {
                return this.D;
            }
            throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
        }
        return f0();
    }

    private float h0() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6922d);
        return this.W.getYVelocity(this.X);
    }

    private boolean j0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && y.R(v10);
    }

    private void l0(V v10, d.a aVar, int i10) {
        y.k0(v10, aVar, null, Z(i10));
    }

    private void m0() {
        this.X = -1;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    private void n0(g gVar) {
        int i10 = this.f6916a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f6923e = gVar.f6956x;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f6918b = gVar.f6957y;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.H = gVar.U3;
        }
        if (i10 != -1 && (i10 & 8) != 8) {
            return;
        }
        this.I = gVar.V3;
    }

    private void o0(V v10, Runnable runnable) {
        if (j0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.I = z10;
    }

    public void B0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (!this.H && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
        } else {
            int i11 = (i10 != 6 || !this.f6918b || g0(i10) > this.C) ? i10 : 3;
            WeakReference<V> weakReference = this.T;
            if (weakReference == null || weakReference.get() == null) {
                C0(i10);
                return;
            }
            V v10 = this.T.get();
            o0(v10, new a(v10, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r4.getTop() <= r2.D) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.C) < java.lang.Math.abs(r3 - r2.F)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (H0() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.F)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.F)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        r0 = 6;
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
            int r6 = r2.f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C0(r0)
            return
        Lf:
            boolean r3 = r2.k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.O
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.f6918b
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.D
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.H
            if (r3 == 0) goto L4a
            float r3 = r2.h0()
            boolean r3 = r2.G0(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.O
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f6918b
            if (r1 == 0) goto L68
            int r5 = r2.C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.D
            if (r3 >= r1) goto L7e
            int r1 = r2.F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f6918b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.J0(r4, r0, r3)
            r2.P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    void C0(int i10) {
        V v10;
        if (this.K == i10) {
            return;
        }
        this.K = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.H && i10 == 5)) {
            this.L = i10;
        }
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            M0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            M0(false);
        }
        L0(i10);
        for (int i11 = 0; i11 < this.V.size(); i11++) {
            this.V.get(i11).c(v10, i10);
        }
        K0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.K == 1 && actionMasked == 0) {
            return true;
        }
        if (F0()) {
            this.M.z(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (F0() && actionMasked == 2 && !this.N && Math.abs(this.Y - motionEvent.getY()) > this.M.u()) {
            this.M.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.N;
    }

    public boolean E0(long j10, float f10) {
        return false;
    }

    boolean G0(View view, float f10) {
        if (this.I) {
            return true;
        }
        if (view.getTop() < this.F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    void c0(int i10) {
        float f10;
        float f11;
        V v10 = this.T.get();
        if (v10 == null || this.V.isEmpty()) {
            return;
        }
        int i11 = this.F;
        if (i10 > i11 || i11 == f0()) {
            int i12 = this.F;
            f10 = i12 - i10;
            f11 = this.S - i12;
        } else {
            int i13 = this.F;
            f10 = i13 - i10;
            f11 = i13 - f0();
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.V.size(); i14++) {
            this.V.get(i14).b(v10, f12);
        }
    }

    View d0(View view) {
        if (y.T(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View d02 = d0(viewGroup.getChildAt(i10));
            if (d02 != null) {
                return d02;
            }
        }
        return null;
    }

    public int f0() {
        if (this.f6918b) {
            return this.C;
        }
        return Math.max(this.B, this.f6936r ? 0 : this.f6941w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.T = null;
        this.M = null;
    }

    public boolean i0() {
        return this.f6932n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        w0.c cVar;
        if (!v10.isShown() || !this.J) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.Y = (int) motionEvent.getY();
            if (this.K != 2) {
                WeakReference<View> weakReference = this.U;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x10, this.Y)) {
                    this.X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.Z = true;
                }
            }
            this.N = this.X == -1 && !coordinatorLayout.B(v10, x10, this.Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.Z = false;
            this.X = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (cVar = this.M) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.U;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.N && this.K != 1 && !coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.M != null && Math.abs(((float) this.Y) - motionEvent.getY()) > ((float) this.M.u());
    }

    public boolean k0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[LOOP:0: B:58:0x00ed->B:60:0x00f5, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(e0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f6929k, marginLayoutParams.width), e0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f6930l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (!k0() || (weakReference = this.U) == null || view != weakReference.get()) {
            return false;
        }
        return this.K != 3 || super.o(coordinatorLayout, v10, view, f10, f11);
    }

    public void p0(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.U;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (k0() && view != view2) {
            return;
        }
        int top = v10.getTop();
        int i14 = top - i11;
        if (i11 > 0) {
            if (i14 < f0()) {
                iArr[1] = top - f0();
                y.Z(v10, -iArr[1]);
                i13 = 3;
                C0(i13);
            } else if (!this.J) {
                return;
            } else {
                iArr[1] = i11;
                y.Z(v10, -i11);
                C0(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.F;
            if (i14 > i15 && !this.H) {
                iArr[1] = top - i15;
                y.Z(v10, -iArr[1]);
                i13 = 4;
                C0(i13);
            } else if (!this.J) {
                return;
            } else {
                iArr[1] = i11;
                y.Z(v10, -i11);
                C0(1);
            }
        }
        c0(v10.getTop());
        this.O = i11;
        this.P = true;
    }

    public void q0(int i10) {
        if (i10 >= 0) {
            this.B = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void r0(boolean z10) {
        if (this.f6918b == z10) {
            return;
        }
        this.f6918b = z10;
        if (this.T != null) {
            W();
        }
        C0((!this.f6918b || this.K != 6) ? this.K : 3);
        K0();
    }

    public void s0(boolean z10) {
        this.f6932n = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void t0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.E = f10;
        if (this.T == null) {
            return;
        }
        X();
    }

    public void u0(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10 && this.K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i10) {
        this.f6930l = i10;
    }

    public void w0(int i10) {
        this.f6929k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v10, gVar.a());
        n0(gVar);
        int i10 = gVar.f6955q;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.K = i10;
        this.L = i10;
    }

    public void x0(int i10) {
        y0(i10, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new g(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public final void y0(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f6924f) {
                this.f6924f = true;
            }
            z11 = false;
        } else {
            if (this.f6924f || this.f6923e != i10) {
                this.f6924f = false;
                this.f6923e = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11) {
            N0(z10);
        }
    }

    public void z0(int i10) {
        this.f6916a = i10;
    }
}
