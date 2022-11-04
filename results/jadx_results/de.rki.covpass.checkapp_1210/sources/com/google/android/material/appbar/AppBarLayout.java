package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.j0;
import androidx.core.view.n;
import androidx.core.view.y;
import b5.k;
import b5.l;
import java.lang.ref.WeakReference;
import java.util.List;
import t5.h;
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: i4 */
    private static final int f6799i4 = k.f5488g;
    private int U3;
    private j0 V3;
    private List<b> W3;
    private boolean X3;
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private boolean f6800a4;

    /* renamed from: b4 */
    private int f6801b4;

    /* renamed from: c */
    private int f6802c;

    /* renamed from: c4 */
    private WeakReference<View> f6803c4;

    /* renamed from: d */
    private int f6804d;

    /* renamed from: d4 */
    private ValueAnimator f6805d4;

    /* renamed from: e4 */
    private final List<f> f6806e4;

    /* renamed from: f4 */
    private int[] f6807f4;

    /* renamed from: g4 */
    private Drawable f6808g4;

    /* renamed from: h4 */
    private Behavior f6809h4;

    /* renamed from: q */
    private int f6810q;

    /* renamed from: x */
    private int f6811x;

    /* renamed from: y */
    private boolean f6812y;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        /* renamed from: k */
        private int f6813k;

        /* renamed from: l */
        private int f6814l;

        /* renamed from: m */
        private ValueAnimator f6815m;

        /* renamed from: n */
        private e f6816n;

        /* renamed from: o */
        private WeakReference<View> f6817o;

        /* renamed from: p */
        private boolean f6818p;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f6819a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f6820b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                BaseBehavior.this = r1;
                this.f6819a = coordinatorLayout;
                this.f6820b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f6819a, this.f6820b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes.dex */
        public class b extends androidx.core.view.a {
            b() {
                BaseBehavior.this = r1;
            }

            @Override // androidx.core.view.a
            public void g(View view, androidx.core.view.accessibility.d dVar) {
                super.g(view, dVar);
                dVar.q0(BaseBehavior.this.f6818p);
                dVar.X(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public class c implements g {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f6823a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f6824b;

            /* renamed from: c */
            final /* synthetic */ View f6825c;

            /* renamed from: d */
            final /* synthetic */ int f6826d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                BaseBehavior.this = r1;
                this.f6823a = coordinatorLayout;
                this.f6824b = appBarLayout;
                this.f6825c = view;
                this.f6826d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                BaseBehavior.this.q(this.f6823a, this.f6824b, this.f6825c, 0, this.f6826d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class d implements g {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f6828a;

            /* renamed from: b */
            final /* synthetic */ boolean f6829b;

            d(AppBarLayout appBarLayout, boolean z10) {
                BaseBehavior.this = r1;
                this.f6828a = appBarLayout;
                this.f6829b = z10;
            }

            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                this.f6828a.setExpanded(this.f6829b);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public static class e extends v0.a {
            public static final Parcelable.Creator<e> CREATOR = new a();
            float U3;
            boolean V3;

            /* renamed from: q */
            boolean f6831q;

            /* renamed from: x */
            boolean f6832x;

            /* renamed from: y */
            int f6833y;

            /* loaded from: classes.dex */
            class a implements Parcelable.ClassLoaderCreator<e> {
                a() {
                }

                /* renamed from: a */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                /* renamed from: b */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                /* renamed from: c */
                public e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f6831q = parcel.readByte() != 0;
                this.f6832x = parcel.readByte() != 0;
                this.f6833y = parcel.readInt();
                this.U3 = parcel.readFloat();
                this.V3 = parcel.readByte() == 0 ? false : z10;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // v0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f6831q ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f6832x ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f6833y);
                parcel.writeFloat(this.U3);
                parcel.writeByte(this.V3 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean T(CoordinatorLayout coordinatorLayout, T t10, View view) {
            boolean z10 = false;
            if (M() != (-t10.getTotalScrollRange())) {
                U(coordinatorLayout, t10, d.a.f3626q, false);
                z10 = true;
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    U(coordinatorLayout, t10, d.a.f3627r, true);
                    return true;
                }
                int i10 = -t10.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    y.k0(coordinatorLayout, d.a.f3627r, null, new c(coordinatorLayout, t10, view, i10));
                    return true;
                }
            }
            return z10;
        }

        private void U(CoordinatorLayout coordinatorLayout, T t10, d.a aVar, boolean z10) {
            y.k0(coordinatorLayout, aVar, null, new d(t10, z10));
        }

        private void V(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            W(coordinatorLayout, t10, i10, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f6815m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f6815m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6815m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6815m = valueAnimator3;
                valueAnimator3.setInterpolator(c5.a.f6271e);
                this.f6815m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f6815m.setDuration(Math.min(i11, 600));
            this.f6815m.setIntValues(M, i10);
            this.f6815m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.j() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f6838a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof n) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (a0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= y.C(childAt);
                        }
                    }
                    if (y.y(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> s10 = coordinatorLayout.s(t10);
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int M = M() - topInset;
            int e02 = e0(t10, M);
            if (e02 >= 0) {
                View childAt = t10.getChildAt(e02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) != 17) {
                    return;
                }
                int i10 = -childAt.getTop();
                int i11 = -childAt.getBottom();
                if (e02 == 0 && y.y(t10) && y.y(childAt)) {
                    i10 -= t10.getTopInset();
                }
                if (a0(c10, 2)) {
                    i11 += y.C(childAt);
                } else if (a0(c10, 5)) {
                    int C = y.C(childAt) + i11;
                    if (M < C) {
                        i10 = C;
                    } else {
                        i11 = C;
                    }
                }
                if (a0(c10, 32)) {
                    i10 += ((LinearLayout.LayoutParams) eVar).topMargin;
                    i11 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                V(coordinatorLayout, t10, s0.a.b(X(M, i11, i10) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, T t10) {
            View f02;
            y.i0(coordinatorLayout, d.a.f3626q.b());
            y.i0(coordinatorLayout, d.a.f3627r.b());
            if (t10.getTotalScrollRange() == 0 || (f02 = f0(coordinatorLayout)) == null || !b0(t10)) {
                return;
            }
            if (!y.M(coordinatorLayout)) {
                y.o0(coordinatorLayout, new b());
            }
            this.f6818p = T(coordinatorLayout, t10, f02);
        }

        private void y0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View d02 = d0(t10, i10);
            boolean z11 = false;
            if (d02 != null) {
                int c10 = ((e) d02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int C = y.C(d02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (d02.getBottom() - C) - t10.getTopInset()) : (-i10) >= (d02.getBottom() - C) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (t10.l()) {
                z11 = t10.u(c0(coordinatorLayout));
            }
            boolean r10 = t10.r(z11);
            if (z10 || (r10 && v0(coordinatorLayout, t10))) {
                t10.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f6813k;
        }

        /* renamed from: Y */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f6817o;
            if (weakReference != null) {
                View view = weakReference.get();
                return view != null && view.isShown() && !view.canScrollVertically(-1);
            }
            return true;
        }

        /* renamed from: g0 */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* renamed from: h0 */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        /* renamed from: j0 */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            w0(coordinatorLayout, t10);
            if (t10.l()) {
                t10.r(t10.u(c0(coordinatorLayout)));
            }
        }

        /* renamed from: k0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int i11;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            e eVar = this.f6816n;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            V(coordinatorLayout, t10, i11, 0.0f);
                        }
                        P(coordinatorLayout, t10, i11);
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            V(coordinatorLayout, t10, 0, 0.0f);
                        }
                        P(coordinatorLayout, t10, 0);
                    }
                }
            } else if (eVar.f6831q) {
                i11 = -t10.getTotalScrollRange();
                P(coordinatorLayout, t10, i11);
            } else {
                if (!eVar.f6832x) {
                    View childAt = t10.getChildAt(eVar.f6833y);
                    P(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f6816n.V3 ? y.C(childAt) + t10.getTopInset() : Math.round(childAt.getHeight() * this.f6816n.U3)));
                }
                P(coordinatorLayout, t10, 0);
            }
            t10.n();
            this.f6816n = null;
            G(s0.a.b(E(), -t10.getTotalScrollRange(), 0));
            y0(coordinatorLayout, t10, E(), 0, true);
            t10.m(E());
            x0(coordinatorLayout, t10);
            return l10;
        }

        /* renamed from: l0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.J(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        /* renamed from: m0 */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i14 = -t10.getTotalScrollRange();
                    i13 = t10.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -t10.getUpNestedPreScrollRange();
                    i13 = 0;
                }
                int i15 = i14;
                int i16 = i13;
                if (i15 != i16) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i15, i16);
                }
            }
            if (t10.l()) {
                t10.r(t10.u(view));
            }
        }

        /* renamed from: n0 */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                x0(coordinatorLayout, t10);
            }
        }

        /* renamed from: o0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof e) {
                s0((e) parcelable, true);
                super.x(coordinatorLayout, t10, this.f6816n.a());
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f6816n = null;
        }

        /* renamed from: p0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            e t02 = t0(y10, t10);
            return t02 == null ? y10 : t02;
        }

        /* renamed from: q0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.l() || Z(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f6815m) != null) {
                valueAnimator.cancel();
            }
            this.f6817o = null;
            this.f6814l = i11;
            return z10;
        }

        /* renamed from: r0 */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f6814l == 0 || i10 == 1) {
                w0(coordinatorLayout, t10);
                if (t10.l()) {
                    t10.r(t10.u(view));
                }
            }
            this.f6817o = new WeakReference<>(view);
        }

        void s0(e eVar, boolean z10) {
            if (this.f6816n == null || z10) {
                this.f6816n = eVar;
            }
        }

        e t0(Parcelable parcelable, T t10) {
            int E = E();
            int childCount = t10.getChildCount();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = v0.a.f23836d;
                    }
                    e eVar = new e(parcelable);
                    boolean z11 = E == 0;
                    eVar.f6832x = z11;
                    eVar.f6831q = !z11 && (-E) >= t10.getTotalScrollRange();
                    eVar.f6833y = i10;
                    if (bottom == y.C(childAt) + t10.getTopInset()) {
                        z10 = true;
                    }
                    eVar.V3 = z10;
                    eVar.U3 = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        /* renamed from: u0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int M = M();
            int i13 = 0;
            if (i11 == 0 || M < i11 || M > i12) {
                this.f6813k = 0;
            } else {
                int b10 = s0.a.b(i10, i11, i12);
                if (M != b10) {
                    int i02 = t10.h() ? i0(t10, b10) : b10;
                    boolean G = G(i02);
                    int i14 = M - b10;
                    this.f6813k = b10 - i02;
                    int i15 = 1;
                    if (G) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(t10, t10.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!G && t10.h()) {
                        coordinatorLayout.g(t10);
                    }
                    t10.m(E());
                    if (b10 < M) {
                        i15 = -1;
                    }
                    y0(coordinatorLayout, t10, b10, i15, false);
                    i13 = i14;
                }
            }
            x0(coordinatorLayout, t10);
            return i13;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f5684t4);
            O(obtainStyledAttributes.getDimensionPixelSize(l.f5693u4, 0));
            obtainStyledAttributes.recycle();
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                y.Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f6813k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.l()) {
                    return;
                }
                appBarLayout.r(appBarLayout.u(view));
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                y.i0(coordinatorLayout, d.a.f3626q.b());
                y.i0(coordinatorLayout, d.a.f3627r.b());
                y.o0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H = H(coordinatorLayout.r(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6851d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.o(false, !z10);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ t5.g f6834a;

        a(t5.g gVar) {
            AppBarLayout.this = r1;
            this.f6834a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f6834a.Y(floatValue);
            if (AppBarLayout.this.f6808g4 instanceof t5.g) {
                ((t5.g) AppBarLayout.this.f6808g4).Y(floatValue);
            }
            for (f fVar : AppBarLayout.this.f6806e4) {
                fVar.a(floatValue, this.f6834a.A());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: a */
        private final Rect f6836a = new Rect();

        /* renamed from: b */
        private final Rect f6837b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f6836a, appBarLayout, view);
            float abs = this.f6836a.top - Math.abs(f10);
            if (abs > 0.0f) {
                y.v0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float a10 = 1.0f - s0.a.a(Math.abs(abs / this.f6836a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f6836a.height() * 0.3f) * (1.0f - (a10 * a10)));
            view.setTranslationY(height);
            view.getDrawingRect(this.f6837b);
            this.f6837b.offset(0, (int) (-height));
            y.v0(view, this.f6837b);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f6838a;

        /* renamed from: b */
        private c f6839b;

        /* renamed from: c */
        Interpolator f6840c;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f6838a = 1;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6838a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f5616m);
            this.f6838a = obtainStyledAttributes.getInt(l.f5634o, 0);
            f(a(obtainStyledAttributes.getInt(l.f5625n, 0)));
            int i10 = l.f5643p;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f6840c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6838a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6838a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6838a = 1;
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f6839b;
        }

        public int c() {
            return this.f6838a;
        }

        public Interpolator d() {
            return this.f6840c;
        }

        boolean e() {
            int i10 = this.f6838a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(c cVar) {
            this.f6839b = cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(float f10, int i10);
    }

    private void c() {
        WeakReference<View> weakReference = this.f6803c4;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6803c4 = null;
    }

    private View d(View view) {
        int i10;
        if (this.f6803c4 == null && (i10 = this.f6801b4) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f6801b4);
            }
            if (findViewById != null) {
                this.f6803c4 = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f6803c4;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        Behavior behavior = this.f6809h4;
        BaseBehavior.e t02 = (behavior == null || this.f6804d == -1 || this.U3 != 0) ? null : behavior.t0(v0.a.f23836d, this);
        this.f6804d = -1;
        this.f6810q = -1;
        this.f6811x = -1;
        if (t02 != null) {
            this.f6809h4.s0(t02, false);
        }
    }

    private void p(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.U3 = i11 | i10;
        requestLayout();
    }

    private boolean q(boolean z10) {
        if (this.Y3 != z10) {
            this.Y3 = z10;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean t() {
        return this.f6808g4 != null && getTopInset() > 0;
    }

    private boolean v() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return childAt.getVisibility() != 8 && !y.y(childAt);
        }
        return false;
    }

    private void w(t5.g gVar, boolean z10) {
        float dimension = getResources().getDimension(b5.d.a_res_0x7f060066);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f6805d4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.f6805d4 = ofFloat;
        ofFloat.setDuration(getResources().getInteger(b5.g.f5483a));
        this.f6805d4.setInterpolator(c5.a.f6267a);
        this.f6805d4.addUpdateListener(new a(gVar));
        this.f6805d4.start();
    }

    private void x() {
        setWillNotDraw(!t());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f6802c);
            this.f6808g4.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6808g4;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    /* renamed from: e */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    /* renamed from: f */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: g */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f6809h4 = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int C;
        int i11 = this.f6810q;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f6838a;
            if ((i13 & 5) == 5) {
                int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if ((i13 & 8) != 0) {
                    C = y.C(childAt);
                } else if ((i13 & 2) != 0) {
                    C = measuredHeight - y.C(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && y.y(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + C;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f6810q = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f6811x;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            int i13 = eVar.f6838a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= y.C(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6811x = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6801b4;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = y.C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? y.C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    int getPendingAction() {
        return this.U3;
    }

    public Drawable getStatusBarForeground() {
        return this.f6808g4;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        j0 j0Var = this.V3;
        if (j0Var != null) {
            return j0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f6804d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f6838a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            if (i11 == 0 && y.y(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= y.C(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6804d = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f6812y;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f6800a4;
    }

    void m(int i10) {
        this.f6802c = i10;
        if (!willNotDraw()) {
            y.f0(this);
        }
        List<b> list = this.W3;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.W3.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    void n() {
        this.U3 = 0;
    }

    public void o(boolean z10, boolean z11) {
        p(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f6807f4 == null) {
            this.f6807f4 = new int[4];
        }
        int[] iArr = this.f6807f4;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.Y3;
        int i11 = b5.b.H_res_0x7f03038e;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z10 || !this.Z3) ? -b5.b.I_res_0x7f03038f : b5.b.I_res_0x7f03038f;
        int i12 = b5.b.F_res_0x7f03038c;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z10 || !this.Z3) ? -b5.b.E_res_0x7f03038b : b5.b.E_res_0x7f03038b;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (y.y(this) && v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                y.Z(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f6812y = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f6812y = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f6808g4;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.X3) {
            if (!this.f6800a4 && !i()) {
                z11 = false;
            }
            q(z11);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && y.y(this) && v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = s0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    boolean r(boolean z10) {
        return s(z10, !this.X3);
    }

    boolean s(boolean z10, boolean z11) {
        if (!z11 || this.Z3 == z10) {
            return false;
        }
        this.Z3 = z10;
        refreshDrawableState();
        if (!this.f6800a4 || !(getBackground() instanceof t5.g)) {
            return true;
        }
        w((t5.g) getBackground(), z10);
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        o(z10, y.S(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f6800a4 = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f6801b4 = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.X3 = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f6808g4;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6808g4 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6808g4.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f6808g4, y.B(this));
                this.f6808g4.setVisible(getVisibility() == 0, false);
                this.f6808g4.setCallback(this);
            }
            x();
            y.f0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        com.google.android.material.appbar.e.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f6808g4;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    boolean u(View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6808g4;
    }
}
