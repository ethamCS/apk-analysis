package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import b.g.l.c0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements b.g.l.k {
    static final boolean A0;
    static final boolean B0;
    static final boolean C0;
    static final boolean D0;
    private static final boolean E0;
    private static final boolean F0;
    private static final Class<?>[] G0;
    static final Interpolator H0;
    private static final int[] z0 = {16843830};
    private int A;
    boolean B;
    private final AccessibilityManager C;
    private List<q> D;
    boolean E;
    boolean F;
    private int G;
    private int H;
    private k I;
    private EdgeEffect J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    l N;
    private int O;
    private int P;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private r W;
    private final int a0;

    /* renamed from: b */
    private final x f1526b;
    private final int b0;

    /* renamed from: c */
    final v f1527c;
    private float c0;

    /* renamed from: d */
    private y f1528d;
    private float d0;

    /* renamed from: e */
    androidx.recyclerview.widget.a f1529e;
    private boolean e0;

    /* renamed from: f */
    androidx.recyclerview.widget.d f1530f;
    final c0 f0;

    /* renamed from: g */
    final androidx.recyclerview.widget.w f1531g;
    androidx.recyclerview.widget.h g0;

    /* renamed from: h */
    boolean f1532h;
    h.b h0;
    final Runnable i;
    final a0 i0;
    final Rect j;
    private t j0;
    private final Rect k;
    private List<t> k0;
    final RectF l;
    boolean l0;
    g m;
    boolean m0;
    o n;
    private l.b n0;
    w o;
    boolean o0;
    final ArrayList<n> p;
    androidx.recyclerview.widget.r p0;
    private final ArrayList<s> q;
    private j q0;
    private s r;
    private final int[] r0;
    boolean s;
    private b.g.l.l s0;
    boolean t;
    private final int[] t0;
    boolean u;
    private final int[] u0;
    boolean v;
    final int[] v0;
    private int w;
    final List<d0> w0;
    boolean x;
    private Runnable x0;
    boolean y;
    private final w.b y0;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.y) {
                recyclerView2.x = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: b */
        private SparseArray<Object> f1535b;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* renamed from: a */
        int f1534a = -1;

        /* renamed from: c */
        int f1536c = 0;

        /* renamed from: d */
        int f1537d = 0;

        /* renamed from: e */
        int f1538e = 1;

        /* renamed from: f */
        int f1539f = 0;

        /* renamed from: g */
        boolean f1540g = false;

        /* renamed from: h */
        boolean f1541h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;

        void a(int i) {
            if ((this.f1538e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f1538e));
        }

        public int b() {
            return this.f1541h ? this.f1536c - this.f1537d : this.f1539f;
        }

        public int c() {
            return this.f1534a;
        }

        public boolean d() {
            return this.f1534a != -1;
        }

        public boolean e() {
            return this.f1541h;
        }

        public void f(g gVar) {
            this.f1538e = 1;
            this.f1539f = gVar.f();
            this.f1541h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1534a + ", mData=" + this.f1535b + ", mItemCount=" + this.f1539f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f1536c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1537d + ", mStructureChanged=" + this.f1540g + ", mInPreLayout=" + this.f1541h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.N;
            if (lVar != null) {
                lVar.v();
            }
            RecyclerView.this.o0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        public abstract View a(v vVar, int i, int i2);
    }

    /* loaded from: classes.dex */
    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: b */
        private int f1543b;

        /* renamed from: c */
        private int f1544c;

        /* renamed from: d */
        OverScroller f1545d;

        /* renamed from: e */
        Interpolator f1546e;

        /* renamed from: f */
        private boolean f1547f = false;

        /* renamed from: g */
        private boolean f1548g = false;

        c0() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.H0;
            this.f1546e = interpolator;
            this.f1545d = new OverScroller(r3.getContext(), interpolator);
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float b2 = f3 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b2 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private float b(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            b.g.l.t.a0(RecyclerView.this, this);
        }

        public void c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f1544c = 0;
            this.f1543b = 0;
            Interpolator interpolator = this.f1546e;
            Interpolator interpolator2 = RecyclerView.H0;
            if (interpolator != interpolator2) {
                this.f1546e = interpolator2;
                this.f1545d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f1545d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f1547f) {
                this.f1548g = true;
            } else {
                d();
            }
        }

        public void f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.H0;
            }
            if (this.f1546e != interpolator) {
                this.f1546e = interpolator;
                this.f1545d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1544c = 0;
            this.f1543b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1545d.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1545d.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f1545d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.n == null) {
                g();
                return;
            }
            this.f1548g = false;
            this.f1547f = true;
            recyclerView.v();
            OverScroller overScroller = this.f1545d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1543b;
                int i4 = currY - this.f1544c;
                this.f1543b = currX;
                this.f1544c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.v0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.m != null) {
                    int[] iArr3 = recyclerView3.v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.l1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.v0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    z zVar = recyclerView4.n.f1578g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b2 = RecyclerView.this.i0.b();
                        if (b2 == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= b2) {
                                zVar.p(b2 - 1);
                            }
                            zVar.j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i, i2, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.v0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i != 0 || i2 != 0) {
                    recyclerView6.J(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.n.f1578g;
                if ((zVar2 != null && zVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.h hVar = recyclerView7.g0;
                    if (hVar != null) {
                        hVar.f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i7, currVelocity);
                    }
                    if (RecyclerView.D0) {
                        RecyclerView.this.h0.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.n.f1578g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f1547f = false;
            if (this.f1548g) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.y1(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements w.b {
        d() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.w.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.n.n1(d0Var.f1551a, recyclerView.f1527c);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f1527c.J(d0Var);
            RecyclerView.this.o(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.E;
            l lVar = recyclerView.N;
            if (z) {
                if (!lVar.b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.Q0();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        private static final List<Object> s = Collections.emptyList();

        /* renamed from: a */
        public final View f1551a;

        /* renamed from: b */
        WeakReference<RecyclerView> f1552b;
        int j;
        RecyclerView r;

        /* renamed from: c */
        int f1553c = -1;

        /* renamed from: d */
        int f1554d = -1;

        /* renamed from: e */
        long f1555e = -1;

        /* renamed from: f */
        int f1556f = -1;

        /* renamed from: g */
        int f1557g = -1;

        /* renamed from: h */
        d0 f1558h = null;
        d0 i = null;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        v n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;

        public d0(View view) {
            if (view != null) {
                this.f1551a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i, boolean z) {
            if (this.f1554d == -1) {
                this.f1554d = this.f1553c;
            }
            if (this.f1557g == -1) {
                this.f1557g = this.f1553c;
            }
            if (z) {
                this.f1557g += i;
            }
            this.f1553c += i;
            if (this.f1551a.getLayoutParams() != null) {
                ((p) this.f1551a.getLayoutParams()).f1588c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i = this.q;
            if (i == -1) {
                i = b.g.l.t.w(this.f1551a);
            }
            this.p = i;
            recyclerView.o1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.o1(this, this.p);
            this.p = 0;
        }

        void D() {
            this.j = 0;
            this.f1553c = -1;
            this.f1554d = -1;
            this.f1555e = -1L;
            this.f1557g = -1;
            this.m = 0;
            this.f1558h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.s(this);
        }

        void E() {
            if (this.f1554d == -1) {
                this.f1554d = this.f1553c;
            }
        }

        void F(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void G(boolean z) {
            int i;
            int i2 = this.m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.m = i3;
            if (i3 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.j & (-17);
            }
            this.j = i;
        }

        void H(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        boolean I() {
            return (this.j & 16) != 0;
        }

        public boolean J() {
            return (this.j & 128) != 0;
        }

        void K() {
            this.n.J(this);
        }

        boolean L() {
            return (this.j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) != 0) {
            } else {
                g();
                this.k.add(obj);
            }
        }

        void b(int i) {
            this.j = i | this.j;
        }

        void c() {
            this.f1554d = -1;
            this.f1557g = -1;
        }

        void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        void e() {
            this.j &= -33;
        }

        void f() {
            this.j &= -257;
        }

        boolean h() {
            return (this.j & 16) == 0 && b.g.l.t.L(this.f1551a);
        }

        void i(int i, int i2, boolean z) {
            b(8);
            A(i2, z);
            this.f1553c = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.e0(this);
        }

        public final long k() {
            return this.f1555e;
        }

        public final int l() {
            return this.f1556f;
        }

        public final int m() {
            int i = this.f1557g;
            return i == -1 ? this.f1553c : i;
        }

        public final int n() {
            return this.f1554d;
        }

        List<Object> o() {
            if ((this.j & 1024) == 0) {
                List<Object> list = this.k;
                return (list == null || list.size() == 0) ? s : this.l;
            }
            return s;
        }

        boolean p(int i) {
            return (i & this.j) != 0;
        }

        boolean q() {
            return (this.j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f1551a.getParent() == null || this.f1551a.getParent() == this.r) ? false : true;
        }

        public boolean s() {
            return (this.j & 1) != 0;
        }

        public boolean t() {
            return (this.j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1553c + " id=" + this.f1555e + ", oldPos=" + this.f1554d + ", pLpos:" + this.f1557g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1551a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.j & 16) == 0 && !b.g.l.t.L(this.f1551a);
        }

        public boolean v() {
            return (this.j & 8) != 0;
        }

        boolean w() {
            return this.n != null;
        }

        boolean x() {
            return (this.j & 256) != 0;
        }

        boolean y() {
            return (this.j & 2) != 0;
        }

        boolean z() {
            return (this.j & 2) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class e implements d.b {
        e() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.d.b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void b(View view) {
            d0 j0 = RecyclerView.j0(view);
            if (j0 != null) {
                j0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public void c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void d() {
            int k = k();
            for (int i = 0; i < k; i++) {
                View a2 = a(i);
                RecyclerView.this.A(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.d.b
        public d0 e(View view) {
            return RecyclerView.j0(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void f(int i) {
            d0 j0;
            View a2 = a(i);
            if (a2 != null && (j0 = RecyclerView.j0(a2)) != null) {
                if (j0.x() && !j0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + j0 + RecyclerView.this.Q());
                }
                j0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void g(View view) {
            d0 j0 = RecyclerView.j0(view);
            if (j0 != null) {
                j0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public void h(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 j0 = RecyclerView.j0(view);
            if (j0 != null) {
                if (!j0.x() && !j0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + j0 + RecyclerView.this.Q());
                }
                j0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public int j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public int k() {
            return RecyclerView.this.getChildCount();
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.AbstractC0027a {
        f() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void a(int i, int i2) {
            RecyclerView.this.G0(i, i2);
            RecyclerView.this.l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public d0 c(int i) {
            d0 c0 = RecyclerView.this.c0(i, true);
            if (c0 != null && !RecyclerView.this.f1530f.n(c0.f1551a)) {
                return c0;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void d(int i, int i2) {
            RecyclerView.this.H0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l0 = true;
            recyclerView.i0.f1537d += i2;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void e(int i, int i2) {
            RecyclerView.this.H0(i, i2, false);
            RecyclerView.this.l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void f(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void g(int i, int i2) {
            RecyclerView.this.F0(i, i2);
            RecyclerView.this.l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0027a
        public void h(int i, int i2, Object obj) {
            RecyclerView.this.B1(i, i2, obj);
            RecyclerView.this.m0 = true;
        }

        void i(a.b bVar) {
            int i = bVar.f1658a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.n.S0(recyclerView, bVar.f1659b, bVar.f1661d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.n.V0(recyclerView2, bVar.f1659b, bVar.f1661d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.n.X0(recyclerView3, bVar.f1659b, bVar.f1661d, bVar.f1660c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.n.U0(recyclerView4, bVar.f1659b, bVar.f1661d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends d0> {

        /* renamed from: a */
        private final h f1561a = new h();

        /* renamed from: b */
        private boolean f1562b = false;

        public void A(VH vh) {
        }

        public void B(VH vh) {
        }

        public void C(i iVar) {
            this.f1561a.registerObserver(iVar);
        }

        public void D(boolean z) {
            if (!i()) {
                this.f1562b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void E(i iVar) {
            this.f1561a.unregisterObserver(iVar);
        }

        public final void d(VH vh, int i) {
            vh.f1553c = i;
            if (j()) {
                vh.f1555e = g(i);
            }
            vh.F(1, 519);
            b.g.h.b.a("RV OnBindView");
            v(vh, i, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.f1551a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f1588c = true;
            }
            b.g.h.b.b();
        }

        public final VH e(ViewGroup viewGroup, int i) {
            try {
                b.g.h.b.a("RV CreateView");
                VH w = w(viewGroup, i);
                if (w.f1551a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                w.f1556f = i;
                return w;
            } finally {
                b.g.h.b.b();
            }
        }

        public abstract int f();

        public long g(int i) {
            return -1L;
        }

        public int h(int i) {
            return 0;
        }

        public final boolean i() {
            return this.f1561a.a();
        }

        public final boolean j() {
            return this.f1562b;
        }

        public final void k() {
            this.f1561a.b();
        }

        public final void l(int i) {
            this.f1561a.d(i, 1);
        }

        public final void m(int i, Object obj) {
            this.f1561a.e(i, 1, obj);
        }

        public final void n(int i) {
            this.f1561a.f(i, 1);
        }

        public final void o(int i, int i2) {
            this.f1561a.c(i, i2);
        }

        public final void p(int i, int i2, Object obj) {
            this.f1561a.e(i, i2, obj);
        }

        public final void q(int i, int i2) {
            this.f1561a.f(i, i2);
        }

        public final void r(int i, int i2) {
            this.f1561a.g(i, i2);
        }

        public final void s(int i) {
            this.f1561a.g(i, 1);
        }

        public void t(RecyclerView recyclerView) {
        }

        public abstract void u(VH vh, int i);

        public void v(VH vh, int i, List<Object> list) {
            u(vh, i);
        }

        public abstract VH w(ViewGroup viewGroup, int i);

        public void x(RecyclerView recyclerView) {
        }

        public boolean y(VH vh) {
            return false;
        }

        public void z(VH vh) {
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, null);
        }

        public void e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a */
        private b f1563a = null;

        /* renamed from: b */
        private ArrayList<a> f1564b = new ArrayList<>();

        /* renamed from: c */
        private long f1565c = 120;

        /* renamed from: d */
        private long f1566d = 120;

        /* renamed from: e */
        private long f1567e = 250;

        /* renamed from: f */
        private long f1568f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
            void a(d0 d0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f1569a;

            /* renamed from: b */
            public int f1570b;

            public c a(d0 d0Var) {
                b(d0Var, 0);
                return this;
            }

            public c b(d0 d0Var, int i) {
                View view = d0Var.f1551a;
                this.f1569a = view.getLeft();
                this.f1570b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i = d0Var.j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.n();
            int j = d0Var.j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            s(d0Var);
            b bVar = this.f1563a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f1564b.size();
            for (int i = 0; i < size; i++) {
                this.f1564b.get(i).a();
            }
            this.f1564b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f1565c;
        }

        public long m() {
            return this.f1568f;
        }

        public long n() {
            return this.f1567e;
        }

        public long o() {
            return this.f1566d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p = p();
            if (aVar != null) {
                if (!p) {
                    aVar.a();
                } else {
                    this.f1564b.add(aVar);
                }
            }
            return p;
        }

        public c r() {
            return new c();
        }

        public void s(d0 d0Var) {
        }

        public c t(a0 a0Var, d0 d0Var) {
            c r = r();
            r.a(d0Var);
            return r;
        }

        public c u(a0 a0Var, d0 d0Var, int i, List<Object> list) {
            c r = r();
            r.a(d0Var);
            return r;
        }

        public abstract void v();

        void w(b bVar) {
            this.f1563a = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m implements l.b {
        m() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.G(true);
            if (d0Var.f1558h != null && d0Var.i == null) {
                d0Var.f1558h = null;
            }
            d0Var.i = null;
            if (d0Var.I() || RecyclerView.this.Z0(d0Var.f1551a) || !d0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f1551a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            f(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a */
        androidx.recyclerview.widget.d f1572a;

        /* renamed from: b */
        RecyclerView f1573b;

        /* renamed from: c */
        private final v.b f1574c;

        /* renamed from: d */
        private final v.b f1575d;

        /* renamed from: e */
        androidx.recyclerview.widget.v f1576e;

        /* renamed from: f */
        androidx.recyclerview.widget.v f1577f;

        /* renamed from: g */
        z f1578g;

        /* renamed from: h */
        boolean f1579h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements v.b {
            a() {
                o.this = r1;
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i) {
                return o.this.J(i);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b() {
                return o.this.p0() - o.this.g0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return o.this.f0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d(View view) {
                return o.this.U(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return o.this.R(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements v.b {
            b() {
                o.this = r1;
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i) {
                return o.this.J(i);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b() {
                return o.this.X() - o.this.e0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return o.this.h0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d(View view) {
                return o.this.P(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return o.this.V(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f1582a;

            /* renamed from: b */
            public int f1583b;

            /* renamed from: c */
            public boolean f1584c;

            /* renamed from: d */
            public boolean f1585d;
        }

        public o() {
            a aVar = new a();
            this.f1574c = aVar;
            b bVar = new b();
            this.f1575d = bVar;
            this.f1576e = new androidx.recyclerview.widget.v(aVar);
            this.f1577f = new androidx.recyclerview.widget.v(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.L(int, int, int, int, boolean):int");
        }

        private int[] M(View view, Rect rect) {
            int[] iArr = new int[2];
            int f0 = f0();
            int h0 = h0();
            int p0 = p0() - g0();
            int X = X() - e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - f0;
            int min = Math.min(0, i);
            int i2 = top - h0;
            int min2 = Math.min(0, i2);
            int i3 = width - p0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - X);
            if (a0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void g(View view, int i, boolean z) {
            d0 j0 = RecyclerView.j0(view);
            if (z || j0.v()) {
                this.f1573b.f1531g.b(j0);
            } else {
                this.f1573b.f1531g.p(j0);
            }
            p pVar = (p) view.getLayoutParams();
            if (j0.L() || j0.w()) {
                if (j0.w()) {
                    j0.K();
                } else {
                    j0.e();
                }
                this.f1572a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1573b) {
                int m = this.f1572a.m(view);
                if (i == -1) {
                    i = this.f1572a.g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1573b.indexOfChild(view) + this.f1573b.Q());
                } else if (m != i) {
                    this.f1573b.n.C0(m, i);
                }
            } else {
                this.f1572a.a(view, i, false);
                pVar.f1588c = true;
                z zVar = this.f1578g;
                if (zVar != null && zVar.h()) {
                    this.f1578g.k(view);
                }
            }
            if (pVar.f1589d) {
                j0.f1551a.invalidate();
                pVar.f1589d = false;
            }
        }

        public static d j0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.n.d.f2650a, i, i2);
            dVar.f1582a = obtainStyledAttributes.getInt(b.n.d.f2651b, 1);
            dVar.f1583b = obtainStyledAttributes.getInt(b.n.d.l, 1);
            dVar.f1584c = obtainStyledAttributes.getBoolean(b.n.d.k, false);
            dVar.f1585d = obtainStyledAttributes.getBoolean(b.n.d.m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private boolean u0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int f0 = f0();
            int h0 = h0();
            int p0 = p0() - g0();
            int X = X() - e0();
            Rect rect = this.f1573b.j;
            Q(focusedChild, rect);
            return rect.left - i < p0 && rect.right - i > f0 && rect.top - i2 < X && rect.bottom - i2 > h0;
        }

        private void w1(v vVar, int i, View view) {
            d0 j0 = RecyclerView.j0(view);
            if (j0.J()) {
                return;
            }
            if (j0.t() && !j0.v() && !this.f1573b.m.j()) {
                r1(i);
                vVar.C(j0);
                return;
            }
            y(i);
            vVar.D(view);
            this.f1573b.f1531g.k(j0);
        }

        private static boolean x0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode == 0) {
                    return true;
                } else {
                    return mode == 1073741824 && size == i;
                }
            }
            return false;
        }

        private void z(int i, View view) {
            this.f1572a.d(i);
        }

        void A(RecyclerView recyclerView) {
            this.i = true;
            H0(recyclerView);
        }

        public void A0(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f1587b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void A1(RecyclerView recyclerView) {
            B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void B(RecyclerView recyclerView, v vVar) {
            this.i = false;
            J0(recyclerView, vVar);
        }

        public void B0(View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect n0 = this.f1573b.n0(view);
            int i3 = i + n0.left + n0.right;
            int i4 = i2 + n0.top + n0.bottom;
            int L = L(p0(), q0(), f0() + g0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, l());
            int L2 = L(X(), Y(), h0() + e0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, m());
            if (G1(view, L, L2, pVar)) {
                view.measure(L, L2);
            }
        }

        void B1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.B0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.B0) {
                return;
            }
            this.r = 0;
        }

        public View C(View view) {
            View T;
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null || (T = recyclerView.T(view)) == null || this.f1572a.n(T)) {
                return null;
            }
            return T;
        }

        public void C0(int i, int i2) {
            View J = J(i);
            if (J != null) {
                y(i);
                i(J, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f1573b.toString());
        }

        public void C1(int i, int i2) {
            this.f1573b.setMeasuredDimension(i, i2);
        }

        public View D(int i) {
            int K = K();
            for (int i2 = 0; i2 < K; i2++) {
                View J = J(i2);
                d0 j0 = RecyclerView.j0(J);
                if (j0 != null && j0.m() == i && !j0.J() && (this.f1573b.i0.e() || !j0.v())) {
                    return J;
                }
            }
            return null;
        }

        public void D0(int i) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                recyclerView.D0(i);
            }
        }

        public void D1(Rect rect, int i, int i2) {
            C1(o(i, rect.width() + f0() + g0(), d0()), o(i2, rect.height() + h0() + e0(), c0()));
        }

        public abstract p E();

        public void E0(int i) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                recyclerView.E0(i);
            }
        }

        void E1(int i, int i2) {
            int K = K();
            if (K == 0) {
                this.f1573b.x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < K; i7++) {
                View J = J(i7);
                Rect rect = this.f1573b.j;
                Q(J, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f1573b.j.set(i5, i6, i3, i4);
            D1(this.f1573b.j, i, i2);
        }

        public p F(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void F0(g gVar, g gVar2) {
        }

        void F1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f1573b = null;
                this.f1572a = null;
                i = 0;
                this.q = 0;
            } else {
                this.f1573b = recyclerView;
                this.f1572a = recyclerView.f1530f;
                this.q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.r = i;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public p G(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean G0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public boolean G1(View view, int i, int i2, p pVar) {
            return view.isLayoutRequested() || !this.k || !x0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !x0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public int H() {
            return -1;
        }

        public void H0(RecyclerView recyclerView) {
        }

        boolean H1() {
            return false;
        }

        public int I(View view) {
            return ((p) view.getLayoutParams()).f1587b.bottom;
        }

        @Deprecated
        public void I0(RecyclerView recyclerView) {
        }

        public boolean I1(View view, int i, int i2, p pVar) {
            return !this.k || !x0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !x0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public View J(int i) {
            androidx.recyclerview.widget.d dVar = this.f1572a;
            if (dVar != null) {
                return dVar.f(i);
            }
            return null;
        }

        public void J0(RecyclerView recyclerView, v vVar) {
            I0(recyclerView);
        }

        public void J1(RecyclerView recyclerView, a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int K() {
            androidx.recyclerview.widget.d dVar = this.f1572a;
            if (dVar != null) {
                return dVar.g();
            }
            return 0;
        }

        public View K0(View view, int i, v vVar, a0 a0Var) {
            return null;
        }

        public void K1(z zVar) {
            z zVar2 = this.f1578g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f1578g.r();
            }
            this.f1578g = zVar;
            zVar.q(this.f1573b, this);
        }

        public void L0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1573b;
            M0(recyclerView.f1527c, recyclerView.i0, accessibilityEvent);
        }

        void L1() {
            z zVar = this.f1578g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void M0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1573b.canScrollVertically(-1) && !this.f1573b.canScrollHorizontally(-1) && !this.f1573b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.f1573b.m;
            if (gVar == null) {
                return;
            }
            accessibilityEvent.setItemCount(gVar.f());
        }

        public boolean M1() {
            return false;
        }

        public boolean N() {
            RecyclerView recyclerView = this.f1573b;
            return recyclerView != null && recyclerView.f1532h;
        }

        public void N0(b.g.l.c0.c cVar) {
            RecyclerView recyclerView = this.f1573b;
            O0(recyclerView.f1527c, recyclerView.i0, cVar);
        }

        public int O(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null || recyclerView.m == null || !l()) {
                return 1;
            }
            return this.f1573b.m.f();
        }

        public void O0(v vVar, a0 a0Var, b.g.l.c0.c cVar) {
            if (this.f1573b.canScrollVertically(-1) || this.f1573b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.s0(true);
            }
            if (this.f1573b.canScrollVertically(1) || this.f1573b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.s0(true);
            }
            cVar.d0(c.b.b(l0(vVar, a0Var), O(vVar, a0Var), w0(vVar, a0Var), m0(vVar, a0Var)));
        }

        public int P(View view) {
            return view.getBottom() + I(view);
        }

        public void P0(View view, b.g.l.c0.c cVar) {
            d0 j0 = RecyclerView.j0(view);
            if (j0 == null || j0.v() || this.f1572a.n(j0.f1551a)) {
                return;
            }
            RecyclerView recyclerView = this.f1573b;
            Q0(recyclerView.f1527c, recyclerView.i0, view, cVar);
        }

        public void Q(View view, Rect rect) {
            RecyclerView.k0(view, rect);
        }

        public void Q0(v vVar, a0 a0Var, View view, b.g.l.c0.c cVar) {
            cVar.e0(c.C0053c.f(m() ? i0(view) : 0, 1, l() ? i0(view) : 0, 1, false, false));
        }

        public int R(View view) {
            return view.getLeft() - b0(view);
        }

        public View R0(View view, int i) {
            return null;
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1587b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void S0(RecyclerView recyclerView, int i, int i2) {
        }

        public int T(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1587b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void T0(RecyclerView recyclerView) {
        }

        public int U(View view) {
            return view.getRight() + k0(view);
        }

        public void U0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int V(View view) {
            return view.getTop() - n0(view);
        }

        public void V0(RecyclerView recyclerView, int i, int i2) {
        }

        public View W() {
            View focusedChild;
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1572a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void W0(RecyclerView recyclerView, int i, int i2) {
        }

        public int X() {
            return this.r;
        }

        public void X0(RecyclerView recyclerView, int i, int i2, Object obj) {
            W0(recyclerView, i, i2);
        }

        public int Y() {
            return this.p;
        }

        public void Y0(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Z() {
            RecyclerView recyclerView = this.f1573b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.f();
            }
            return 0;
        }

        public void Z0(a0 a0Var) {
        }

        public int a0() {
            return b.g.l.t.y(this.f1573b);
        }

        public void a1(v vVar, a0 a0Var, int i, int i2) {
            this.f1573b.x(i, i2);
        }

        public int b0(View view) {
            return ((p) view.getLayoutParams()).f1587b.left;
        }

        @Deprecated
        public boolean b1(RecyclerView recyclerView, View view, View view2) {
            return y0() || recyclerView.y0();
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            return b.g.l.t.z(this.f1573b);
        }

        public boolean c1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return b1(recyclerView, view, view2);
        }

        public void d(View view, int i) {
            g(view, i, true);
        }

        public int d0() {
            return b.g.l.t.A(this.f1573b);
        }

        public void d1(Parcelable parcelable) {
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0() {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable e1() {
            return null;
        }

        public void f(View view, int i) {
            g(view, i, false);
        }

        public int f0() {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void f1(int i) {
        }

        public int g0() {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void g1(z zVar) {
            if (this.f1578g == zVar) {
                this.f1578g = null;
            }
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean h1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1573b;
            return i1(recyclerView.f1527c, recyclerView.i0, i, bundle);
        }

        public void i(View view, int i) {
            j(view, i, (p) view.getLayoutParams());
        }

        public int i0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean i1(v vVar, a0 a0Var, int i, Bundle bundle) {
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                i4 = recyclerView.canScrollVertically(1) ? (X() - h0()) - e0() : 0;
                if (this.f1573b.canScrollHorizontally(1)) {
                    i5 = (p0() - f0()) - g0();
                    i2 = i4;
                    i3 = i5;
                }
                i2 = i4;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                i4 = recyclerView.canScrollVertically(-1) ? -((X() - h0()) - e0()) : 0;
                if (this.f1573b.canScrollHorizontally(-1)) {
                    i5 = -((p0() - f0()) - g0());
                    i2 = i4;
                    i3 = i5;
                }
                i2 = i4;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f1573b.t1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void j(View view, int i, p pVar) {
            d0 j0 = RecyclerView.j0(view);
            if (j0.v()) {
                this.f1573b.f1531g.b(j0);
            } else {
                this.f1573b.f1531g.p(j0);
            }
            this.f1572a.c(view, i, pVar, j0.v());
        }

        public boolean j1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1573b;
            return k1(recyclerView.f1527c, recyclerView.i0, view, i, bundle);
        }

        public void k(View view, Rect rect) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.n0(view));
            }
        }

        public int k0(View view) {
            return ((p) view.getLayoutParams()).f1587b.right;
        }

        public boolean k1(v vVar, a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView == null || recyclerView.m == null || !m()) {
                return 1;
            }
            return this.f1573b.m.f();
        }

        public void l1(v vVar) {
            for (int K = K() - 1; K >= 0; K--) {
                if (!RecyclerView.j0(J(K)).J()) {
                    o1(K, vVar);
                }
            }
        }

        public boolean m() {
            return false;
        }

        public int m0(v vVar, a0 a0Var) {
            return 0;
        }

        void m1(v vVar) {
            int j = vVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.n(i);
                d0 j0 = RecyclerView.j0(n);
                if (!j0.J()) {
                    j0.G(false);
                    if (j0.x()) {
                        this.f1573b.removeDetachedView(n, false);
                    }
                    l lVar = this.f1573b.N;
                    if (lVar != null) {
                        lVar.j(j0);
                    }
                    j0.G(true);
                    vVar.y(n);
                }
            }
            vVar.e();
            if (j > 0) {
                this.f1573b.invalidate();
            }
        }

        public boolean n(p pVar) {
            return pVar != null;
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).f1587b.top;
        }

        public void n1(View view, v vVar) {
            q1(view);
            vVar.B(view);
        }

        public void o0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f1587b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1573b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1573b.l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void o1(int i, v vVar) {
            View J = J(i);
            r1(i);
            vVar.B(J);
        }

        public void p(int i, int i2, a0 a0Var, c cVar) {
        }

        public int p0() {
            return this.q;
        }

        public boolean p1(Runnable runnable) {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void q(int i, c cVar) {
        }

        public int q0() {
            return this.o;
        }

        public void q1(View view) {
            this.f1572a.p(view);
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public boolean r0() {
            int K = K();
            for (int i = 0; i < K; i++) {
                ViewGroup.LayoutParams layoutParams = J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void r1(int i) {
            if (J(i) != null) {
                this.f1572a.q(i);
            }
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.i;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return t1(recyclerView, view, rect, z, false);
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public boolean t0() {
            return this.j;
        }

        public boolean t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] M = M(view, rect);
            int i = M[0];
            int i2 = M[1];
            if ((!z2 || u0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.q1(i, i2);
                }
                return true;
            }
            return false;
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public void u1() {
            RecyclerView recyclerView = this.f1573b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public final boolean v0() {
            return this.l;
        }

        public void v1() {
            this.f1579h = true;
        }

        public int w(a0 a0Var) {
            return 0;
        }

        public boolean w0(v vVar, a0 a0Var) {
            return false;
        }

        public void x(v vVar) {
            for (int K = K() - 1; K >= 0; K--) {
                w1(vVar, K, J(K));
            }
        }

        public int x1(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public void y(int i) {
            z(i, J(i));
        }

        public boolean y0() {
            z zVar = this.f1578g;
            return zVar != null && zVar.h();
        }

        public void y1(int i) {
        }

        public boolean z0(View view, boolean z, boolean z2) {
            boolean z3 = this.f1576e.b(view, 24579) && this.f1577f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int z1(int i, v vVar, a0 a0Var) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        d0 f1586a;

        /* renamed from: b */
        final Rect f1587b = new Rect();

        /* renamed from: c */
        boolean f1588c = true;

        /* renamed from: d */
        boolean f1589d = false;

        public p(int i, int i2) {
            super(i, i2);
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
        }

        public int a() {
            return this.f1586a.m();
        }

        public boolean b() {
            return this.f1586a.y();
        }

        public boolean c() {
            return this.f1586a.v();
        }

        public boolean d() {
            return this.f1586a.t();
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void c(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: a */
        SparseArray<a> f1590a = new SparseArray<>();

        /* renamed from: b */
        private int f1591b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<d0> f1592a = new ArrayList<>();

            /* renamed from: b */
            int f1593b = 5;

            /* renamed from: c */
            long f1594c = 0;

            /* renamed from: d */
            long f1595d = 0;

            a() {
            }
        }

        private a g(int i) {
            a aVar = this.f1590a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.f1590a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f1591b++;
        }

        public void b() {
            for (int i = 0; i < this.f1590a.size(); i++) {
                this.f1590a.valueAt(i).f1592a.clear();
            }
        }

        void c() {
            this.f1591b--;
        }

        void d(int i, long j) {
            a g2 = g(i);
            g2.f1595d = j(g2.f1595d, j);
        }

        void e(int i, long j) {
            a g2 = g(i);
            g2.f1594c = j(g2.f1594c, j);
        }

        public d0 f(int i) {
            a aVar = this.f1590a.get(i);
            if (aVar == null || aVar.f1592a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f1592a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f1591b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int l = d0Var.l();
            ArrayList<d0> arrayList = g(l).f1592a;
            if (this.f1590a.get(l).f1593b <= arrayList.size()) {
                return;
            }
            d0Var.D();
            arrayList.add(d0Var);
        }

        long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        boolean k(int i, long j, long j2) {
            long j3 = g(i).f1595d;
            return j3 == 0 || j + j3 < j2;
        }

        boolean l(int i, long j, long j2) {
            long j3 = g(i).f1594c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public final class v {

        /* renamed from: a */
        final ArrayList<d0> f1596a;

        /* renamed from: d */
        private final List<d0> f1599d;

        /* renamed from: g */
        u f1602g;

        /* renamed from: h */
        private b0 f1603h;

        /* renamed from: b */
        ArrayList<d0> f1597b = null;

        /* renamed from: c */
        final ArrayList<d0> f1598c = new ArrayList<>();

        /* renamed from: e */
        private int f1600e = 2;

        /* renamed from: f */
        int f1601f = 2;

        public v() {
            RecyclerView.this = r2;
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f1596a = arrayList;
            this.f1599d = Collections.unmodifiableList(arrayList);
        }

        private boolean H(d0 d0Var, int i, int i2, long j) {
            d0Var.r = RecyclerView.this;
            int l = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.f1602g.k(l, nanoTime, j)) {
                RecyclerView.this.m.d(d0Var, i);
                this.f1602g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
                b(d0Var);
                if (!RecyclerView.this.i0.e()) {
                    return true;
                }
                d0Var.f1557g = i2;
                return true;
            }
            return false;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.x0()) {
                View view = d0Var.f1551a;
                if (b.g.l.t.w(view) == 0) {
                    b.g.l.t.r0(view, 1);
                }
                androidx.recyclerview.widget.r rVar = RecyclerView.this.p0;
                if (rVar == null) {
                    return;
                }
                b.g.l.a n = rVar.n();
                if (n instanceof r.a) {
                    ((r.a) n).o(view);
                }
                b.g.l.t.i0(view, n);
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        private void r(d0 d0Var) {
            View view = d0Var.f1551a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i) {
            a(this.f1598c.get(i), true);
            this.f1598c.remove(i);
        }

        public void B(View view) {
            d0 j0 = RecyclerView.j0(view);
            if (j0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (j0.w()) {
                j0.K();
            } else if (j0.L()) {
                j0.e();
            }
            C(j0);
            if (RecyclerView.this.N == null || j0.u()) {
                return;
            }
            RecyclerView.this.N.j(j0);
        }

        void C(d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.w() || d0Var.f1551a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.w());
                sb.append(" isAttached:");
                if (d0Var.f1551a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.Q());
            } else if (d0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            } else {
                boolean h2 = d0Var.h();
                g gVar = RecyclerView.this.m;
                if ((gVar != null && h2 && gVar.y(d0Var)) || d0Var.u()) {
                    if (this.f1601f <= 0 || d0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.f1598c.size();
                        if (size >= this.f1601f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.D0 && size > 0 && !RecyclerView.this.h0.d(d0Var.f1553c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.h0.d(this.f1598c.get(i).f1553c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f1598c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.f1531g.q(d0Var);
                        if (z2 || z3 || !h2) {
                            return;
                        }
                        d0Var.r = null;
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f1531g.q(d0Var);
                if (z2) {
                }
            }
        }

        void D(View view) {
            ArrayList<d0> arrayList;
            d0 j0 = RecyclerView.j0(view);
            if (!j0.p(12) && j0.y() && !RecyclerView.this.q(j0)) {
                if (this.f1597b == null) {
                    this.f1597b = new ArrayList<>();
                }
                j0.H(this, true);
                arrayList = this.f1597b;
            } else if (j0.t() && !j0.v() && !RecyclerView.this.m.j()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            } else {
                j0.H(this, false);
                arrayList = this.f1596a;
            }
            arrayList.add(j0);
        }

        void E(u uVar) {
            u uVar2 = this.f1602g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f1602g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f1602g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i) {
            this.f1600e = i;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x020c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            (d0Var.o ? this.f1597b : this.f1596a).remove(d0Var);
            d0Var.n = null;
            d0Var.o = false;
            d0Var.e();
        }

        public void K() {
            o oVar = RecyclerView.this.n;
            this.f1601f = this.f1600e + (oVar != null ? oVar.m : 0);
            for (int size = this.f1598c.size() - 1; size >= 0 && this.f1598c.size() > this.f1601f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.i0.e();
            }
            int i = d0Var.f1553c;
            if (i >= 0 && i < RecyclerView.this.m.f()) {
                if (!RecyclerView.this.i0.e() && RecyclerView.this.m.h(d0Var.f1553c) != d0Var.l()) {
                    return false;
                }
                return !RecyclerView.this.m.j() || d0Var.k() == RecyclerView.this.m.g(d0Var.f1553c);
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.Q());
        }

        void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f1598c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1598c.get(size);
                if (d0Var != null && (i3 = d0Var.f1553c) >= i && i3 < i4) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(d0 d0Var, boolean z) {
            RecyclerView.s(d0Var);
            View view = d0Var.f1551a;
            androidx.recyclerview.widget.r rVar = RecyclerView.this.p0;
            if (rVar != null) {
                b.g.l.a n = rVar.n();
                b.g.l.t.i0(view, n instanceof r.a ? ((r.a) n).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.r = null;
            i().i(d0Var);
        }

        public void c() {
            this.f1596a.clear();
            z();
        }

        void d() {
            int size = this.f1598c.size();
            for (int i = 0; i < size; i++) {
                this.f1598c.get(i).c();
            }
            int size2 = this.f1596a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f1596a.get(i2).c();
            }
            ArrayList<d0> arrayList = this.f1597b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f1597b.get(i3).c();
                }
            }
        }

        void e() {
            this.f1596a.clear();
            ArrayList<d0> arrayList = this.f1597b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.i0.b()) {
                return !RecyclerView.this.i0.e() ? i : RecyclerView.this.f1529e.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.i0.b() + RecyclerView.this.Q());
        }

        void g(d0 d0Var) {
            w wVar = RecyclerView.this.o;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.m;
            if (gVar != null) {
                gVar.B(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.i0 != null) {
                recyclerView.f1531g.q(d0Var);
            }
        }

        d0 h(int i) {
            int size;
            int m;
            ArrayList<d0> arrayList = this.f1597b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    d0 d0Var = this.f1597b.get(i2);
                    if (!d0Var.L() && d0Var.m() == i) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.m.j() && (m = RecyclerView.this.f1529e.m(i)) > 0 && m < RecyclerView.this.m.f()) {
                    long g2 = RecyclerView.this.m.g(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        d0 d0Var2 = this.f1597b.get(i3);
                        if (!d0Var2.L() && d0Var2.k() == g2) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f1602g == null) {
                this.f1602g = new u();
            }
            return this.f1602g;
        }

        int j() {
            return this.f1596a.size();
        }

        public List<d0> k() {
            return this.f1599d;
        }

        d0 l(long j, int i, boolean z) {
            for (int size = this.f1596a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1596a.get(size);
                if (d0Var.k() == j && !d0Var.L()) {
                    if (i == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.i0.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f1596a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f1551a, false);
                        y(d0Var.f1551a);
                    }
                }
            }
            int size2 = this.f1598c.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    d0 d0Var2 = this.f1598c.get(size2);
                    if (d0Var2.k() == j && !d0Var2.r()) {
                        if (i == d0Var2.l()) {
                            if (!z) {
                                this.f1598c.remove(size2);
                            }
                            return d0Var2;
                        } else if (!z) {
                            A(size2);
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            }
        }

        d0 m(int i, boolean z) {
            View e2;
            int size = this.f1596a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.f1596a.get(i2);
                if (!d0Var.L() && d0Var.m() == i && !d0Var.t() && (RecyclerView.this.i0.f1541h || !d0Var.v())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z || (e2 = RecyclerView.this.f1530f.e(i)) == null) {
                int size2 = this.f1598c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d0 d0Var2 = this.f1598c.get(i3);
                    if (!d0Var2.t() && d0Var2.m() == i && !d0Var2.r()) {
                        if (!z) {
                            this.f1598c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 j0 = RecyclerView.j0(e2);
            RecyclerView.this.f1530f.s(e2);
            int m = RecyclerView.this.f1530f.m(e2);
            if (m != -1) {
                RecyclerView.this.f1530f.d(m);
                D(e2);
                j0.b(8224);
                return j0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + j0 + RecyclerView.this.Q());
        }

        View n(int i) {
            return this.f1596a.get(i).f1551a;
        }

        public View o(int i) {
            return p(i, false);
        }

        View p(int i, boolean z) {
            return I(i, z, Long.MAX_VALUE).f1551a;
        }

        void s() {
            int size = this.f1598c.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) this.f1598c.get(i).f1551a.getLayoutParams();
                if (pVar != null) {
                    pVar.f1588c = true;
                }
            }
        }

        void t() {
            int size = this.f1598c.size();
            for (int i = 0; i < size; i++) {
                d0 d0Var = this.f1598c.get(i);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.m;
            if (gVar == null || !gVar.j()) {
                z();
            }
        }

        void u(int i, int i2) {
            int size = this.f1598c.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.f1598c.get(i3);
                if (d0Var != null && d0Var.f1553c >= i) {
                    d0Var.A(i2, true);
                }
            }
        }

        void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f1598c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = this.f1598c.get(i7);
                if (d0Var != null && (i6 = d0Var.f1553c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.A(i2 - i, false);
                    } else {
                        d0Var.A(i5, false);
                    }
                }
            }
        }

        void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f1598c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1598c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f1553c;
                    if (i4 >= i3) {
                        d0Var.A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        void y(View view) {
            d0 j0 = RecyclerView.j0(view);
            j0.n = null;
            j0.o = false;
            j0.e();
            C(j0);
        }

        void z() {
            for (int size = this.f1598c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f1598c.clear();
            if (RecyclerView.D0) {
                RecyclerView.this.h0.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(d0 d0Var);
    }

    /* loaded from: classes.dex */
    public class x extends i {
        x() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i0.f1540g = true;
            recyclerView.T0(true);
            if (!RecyclerView.this.f1529e.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f1529e.r(i, i2, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i, int i2) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f1529e.s(i, i2)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i, int i2, int i3) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f1529e.t(i, i2, i3)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i, int i2) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f1529e.u(i, i2)) {
                g();
            }
        }

        void g() {
            if (RecyclerView.C0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.t && recyclerView.s) {
                    b.g.l.t.a0(recyclerView, recyclerView.i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.B = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class y extends b.i.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: d */
        Parcelable f1605d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            /* renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            /* renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            /* renamed from: c */
            public y[] newArray(int i) {
                return new y[i];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1605d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        void c(y yVar) {
            this.f1605d = yVar.f1605d;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1605d, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: b */
        private RecyclerView f1607b;

        /* renamed from: c */
        private o f1608c;

        /* renamed from: d */
        private boolean f1609d;

        /* renamed from: e */
        private boolean f1610e;

        /* renamed from: f */
        private View f1611f;

        /* renamed from: h */
        private boolean f1613h;

        /* renamed from: a */
        private int f1606a = -1;

        /* renamed from: g */
        private final a f1612g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private int f1614a;

            /* renamed from: b */
            private int f1615b;

            /* renamed from: c */
            private int f1616c;

            /* renamed from: d */
            private int f1617d;

            /* renamed from: e */
            private Interpolator f1618e;

            /* renamed from: f */
            private boolean f1619f;

            /* renamed from: g */
            private int f1620g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.f1617d = -1;
                this.f1619f = false;
                this.f1620g = 0;
                this.f1614a = i;
                this.f1615b = i2;
                this.f1616c = i3;
                this.f1618e = interpolator;
            }

            private void e() {
                if (this.f1618e == null || this.f1616c >= 1) {
                    if (this.f1616c < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    return;
                }
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }

            boolean a() {
                return this.f1617d >= 0;
            }

            public void b(int i) {
                this.f1617d = i;
            }

            void c(RecyclerView recyclerView) {
                int i = this.f1617d;
                if (i >= 0) {
                    this.f1617d = -1;
                    recyclerView.A0(i);
                    this.f1619f = false;
                } else if (!this.f1619f) {
                    this.f1620g = 0;
                } else {
                    e();
                    recyclerView.f0.f(this.f1614a, this.f1615b, this.f1616c, this.f1618e);
                    int i2 = this.f1620g + 1;
                    this.f1620g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f1619f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.f1614a = i;
                this.f1615b = i2;
                this.f1616c = i3;
                this.f1618e = interpolator;
                this.f1619f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            o e2 = e();
            if (e2 instanceof b) {
                return ((b) e2).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.f1607b.n.D(i);
        }

        public int c() {
            return this.f1607b.n.K();
        }

        public int d(View view) {
            return this.f1607b.h0(view);
        }

        public o e() {
            return this.f1608c;
        }

        public int f() {
            return this.f1606a;
        }

        public boolean g() {
            return this.f1609d;
        }

        public boolean h() {
            return this.f1610e;
        }

        public void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.f1607b;
            if (this.f1606a == -1 || recyclerView == null) {
                r();
            }
            if (this.f1609d && this.f1611f == null && this.f1608c != null && (a2 = a(this.f1606a)) != null) {
                float f2 = a2.x;
                if (f2 != 0.0f || a2.y != 0.0f) {
                    recyclerView.l1((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            this.f1609d = false;
            View view = this.f1611f;
            if (view != null) {
                if (d(view) == this.f1606a) {
                    o(this.f1611f, recyclerView.i0, this.f1612g);
                    this.f1612g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1611f = null;
                }
            }
            if (this.f1610e) {
                l(i, i2, recyclerView.i0, this.f1612g);
                boolean a3 = this.f1612g.a();
                this.f1612g.c(recyclerView);
                if (!a3 || !this.f1610e) {
                    return;
                }
                this.f1609d = true;
                recyclerView.f0.e();
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f1611f = view;
            }
        }

        protected abstract void l(int i, int i2, a0 a0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i) {
            this.f1606a = i;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f0.g();
            if (this.f1613h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f1607b = recyclerView;
            this.f1608c = oVar;
            int i = this.f1606a;
            if (i != -1) {
                recyclerView.i0.f1534a = i;
                this.f1610e = true;
                this.f1609d = true;
                this.f1611f = b(f());
                m();
                this.f1607b.f0.e();
                this.f1613h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (!this.f1610e) {
                return;
            }
            this.f1610e = false;
            n();
            this.f1607b.i0.f1534a = -1;
            this.f1611f = null;
            this.f1606a = -1;
            this.f1609d = false;
            this.f1608c.g1(this);
            this.f1608c = null;
            this.f1607b = null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        A0 = i2 == 18 || i2 == 19 || i2 == 20;
        B0 = i2 >= 23;
        C0 = i2 >= 16;
        D0 = i2 >= 21;
        E0 = i2 <= 15;
        F0 = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        H0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.n.a.a_res_0x7f0402a7);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1526b = new x();
        this.f1527c = new v();
        this.f1531g = new androidx.recyclerview.widget.w();
        this.i = new a();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new k();
        this.N = new androidx.recyclerview.widget.e();
        this.O = 0;
        this.P = -1;
        this.c0 = Float.MIN_VALUE;
        this.d0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.e0 = true;
        this.f0 = new c0();
        this.h0 = D0 ? new h.b() : null;
        this.i0 = new a0();
        this.l0 = false;
        this.m0 = false;
        this.n0 = new m();
        this.o0 = false;
        this.r0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new ArrayList();
        this.x0 = new b();
        this.y0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.c0 = b.g.l.u.b(viewConfiguration, context);
        this.d0 = b.g.l.u.d(viewConfiguration, context);
        this.a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.w(this.n0);
        r0();
        t0();
        s0();
        if (b.g.l.t.w(this) == 0) {
            b.g.l.t.r0(this, 1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.r(this));
        int[] iArr = b.n.d.f2650a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(b.n.d.j);
        if (obtainStyledAttributes.getInt(b.n.d.f2653d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1532h = obtainStyledAttributes.getBoolean(b.n.d.f2652c, true);
        boolean z3 = obtainStyledAttributes.getBoolean(b.n.d.f2654e, false);
        this.u = z3;
        if (z3) {
            u0((StateListDrawable) obtainStyledAttributes.getDrawable(b.n.d.f2657h), obtainStyledAttributes.getDrawable(b.n.d.i), (StateListDrawable) obtainStyledAttributes.getDrawable(b.n.d.f2655f), obtainStyledAttributes.getDrawable(b.n.d.f2656g));
        }
        obtainStyledAttributes.recycle();
        w(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = z0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void A1() {
        this.f0.g();
        o oVar = this.n;
        if (oVar != null) {
            oVar.L1();
        }
    }

    private void B() {
        int i2 = this.A;
        this.A = 0;
        if (i2 == 0 || !x0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        b.g.l.c0.b.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void D() {
        boolean z2 = true;
        this.i0.a(1);
        R(this.i0);
        this.i0.j = false;
        v1();
        this.f1531g.f();
        K0();
        S0();
        i1();
        a0 a0Var = this.i0;
        if (!a0Var.k || !this.m0) {
            z2 = false;
        }
        a0Var.i = z2;
        this.m0 = false;
        this.l0 = false;
        a0Var.f1541h = a0Var.l;
        a0Var.f1539f = this.m.f();
        W(this.r0);
        if (this.i0.k) {
            int g2 = this.f1530f.g();
            for (int i2 = 0; i2 < g2; i2++) {
                d0 j0 = j0(this.f1530f.f(i2));
                if (!j0.J() && (!j0.t() || this.m.j())) {
                    this.f1531g.e(j0, this.N.u(this.i0, j0, l.e(j0), j0.o()));
                    if (this.i0.i && j0.y() && !j0.v() && !j0.J() && !j0.t()) {
                        this.f1531g.c(f0(j0), j0);
                    }
                }
            }
        }
        if (this.i0.l) {
            j1();
            a0 a0Var2 = this.i0;
            boolean z3 = a0Var2.f1540g;
            a0Var2.f1540g = false;
            this.n.Y0(this.f1527c, a0Var2);
            this.i0.f1540g = z3;
            for (int i3 = 0; i3 < this.f1530f.g(); i3++) {
                d0 j02 = j0(this.f1530f.f(i3));
                if (!j02.J() && !this.f1531g.i(j02)) {
                    int e2 = l.e(j02);
                    boolean p2 = j02.p(8192);
                    if (!p2) {
                        e2 |= 4096;
                    }
                    l.c u2 = this.N.u(this.i0, j02, e2, j02.o());
                    if (p2) {
                        V0(j02, u2);
                    } else {
                        this.f1531g.a(j02, u2);
                    }
                }
            }
        }
        t();
        L0();
        x1(false);
        this.i0.f1538e = 2;
    }

    private void E() {
        v1();
        K0();
        this.i0.a(6);
        this.f1529e.j();
        this.i0.f1539f = this.m.f();
        a0 a0Var = this.i0;
        a0Var.f1537d = 0;
        a0Var.f1541h = false;
        this.n.Y0(this.f1527c, a0Var);
        a0 a0Var2 = this.i0;
        a0Var2.f1540g = false;
        this.f1528d = null;
        a0Var2.k = a0Var2.k && this.N != null;
        a0Var2.f1538e = 4;
        L0();
        x1(false);
    }

    private void F() {
        this.i0.a(4);
        v1();
        K0();
        a0 a0Var = this.i0;
        a0Var.f1538e = 1;
        if (a0Var.k) {
            for (int g2 = this.f1530f.g() - 1; g2 >= 0; g2--) {
                d0 j0 = j0(this.f1530f.f(g2));
                if (!j0.J()) {
                    long f0 = f0(j0);
                    l.c t2 = this.N.t(this.i0, j0);
                    d0 g3 = this.f1531g.g(f0);
                    if (g3 != null && !g3.J()) {
                        boolean h2 = this.f1531g.h(g3);
                        boolean h3 = this.f1531g.h(j0);
                        if (!h2 || g3 != j0) {
                            l.c n2 = this.f1531g.n(g3);
                            this.f1531g.d(j0, t2);
                            l.c m2 = this.f1531g.m(j0);
                            if (n2 == null) {
                                o0(f0, j0, g3);
                            } else {
                                n(g3, j0, n2, m2, h2, h3);
                            }
                        }
                    }
                    this.f1531g.d(j0, t2);
                }
            }
            this.f1531g.o(this.y0);
        }
        this.n.m1(this.f1527c);
        a0 a0Var2 = this.i0;
        a0Var2.f1536c = a0Var2.f1539f;
        this.E = false;
        this.F = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.n.f1579h = false;
        ArrayList<d0> arrayList = this.f1527c.f1597b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.n;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.f1527c.K();
        }
        this.n.Z0(this.i0);
        L0();
        x1(false);
        this.f1531g.f();
        int[] iArr = this.r0;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        W0();
        g1();
    }

    private boolean L(MotionEvent motionEvent) {
        s sVar = this.r;
        if (sVar == null) {
            if (motionEvent.getAction() != 0) {
                return V(motionEvent);
            }
            return false;
        }
        sVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.r = null;
        }
        return true;
    }

    private void N0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.U = y2;
            this.S = y2;
        }
    }

    private boolean R0() {
        return this.N != null && this.n.M1();
    }

    private void S0() {
        boolean z2;
        if (this.E) {
            this.f1529e.y();
            if (this.F) {
                this.n.T0(this);
            }
        }
        if (R0()) {
            this.f1529e.w();
        } else {
            this.f1529e.j();
        }
        boolean z3 = false;
        boolean z4 = this.l0 || this.m0;
        this.i0.k = this.v && this.N != null && ((z2 = this.E) || z4 || this.n.f1579h) && (!z2 || this.m.j());
        a0 a0Var = this.i0;
        if (a0Var.k && z4 && !this.E && R0()) {
            z3 = true;
        }
        a0Var.l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r3 = r6.J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.d.a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.O()
            android.widget.EdgeEffect r3 = r6.L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.P()
            android.widget.EdgeEffect r9 = r6.K
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.M()
            android.widget.EdgeEffect r9 = r6.M
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            b.g.l.t.Z(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U0(float, float, float, float):void");
    }

    private boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.q.get(i2);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.r = sVar;
                return true;
            }
        }
        return false;
    }

    private void W(int[] iArr) {
        int g2 = this.f1530f.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            d0 j0 = j0(this.f1530f.f(i4));
            if (!j0.J()) {
                int m2 = j0.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private void W0() {
        View findViewById;
        if (!this.e0 || this.m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!F0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f1530f.n(focusedChild)) {
                    return;
                }
            } else if (this.f1530f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        d0 a02 = (this.i0.n == -1 || !this.m.j()) ? null : a0(this.i0.n);
        if (a02 != null && !this.f1530f.n(a02.f1551a) && a02.f1551a.hasFocusable()) {
            view = a02.f1551a;
        } else if (this.f1530f.g() > 0) {
            view = Y();
        }
        if (view == null) {
            return;
        }
        int i2 = this.i0.o;
        if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
            view = findViewById;
        }
        view.requestFocus();
    }

    static RecyclerView X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView X = X(viewGroup.getChildAt(i2));
            if (X != null) {
                return X;
            }
        }
        return null;
    }

    private void X0() {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.J.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            b.g.l.t.Z(this);
        }
    }

    private View Y() {
        d0 Z;
        a0 a0Var = this.i0;
        int i2 = a0Var.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = a0Var.b();
        for (int i3 = i2; i3 < b2; i3++) {
            d0 Z2 = Z(i3);
            if (Z2 == null) {
                break;
            } else if (Z2.f1551a.hasFocusable()) {
                return Z2.f1551a;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (Z = Z(min)) == null) {
                return null;
            }
            if (Z.f1551a.hasFocusable()) {
                return Z.f1551a;
            }
        }
    }

    private void f1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f1588c) {
                Rect rect = pVar.f1587b;
                Rect rect2 = this.j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        }
        this.n.t1(this, view, this.j, !this.v, view2 == null);
    }

    private void g(d0 d0Var) {
        View view = d0Var.f1551a;
        boolean z2 = view.getParent() == this;
        this.f1527c.J(i0(view));
        if (d0Var.x()) {
            this.f1530f.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.d dVar = this.f1530f;
        if (!z2) {
            dVar.b(view, true);
        } else {
            dVar.k(view);
        }
    }

    private void g1() {
        a0 a0Var = this.i0;
        a0Var.n = -1L;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private b.g.l.l getScrollingChildHelper() {
        if (this.s0 == null) {
            this.s0 = new b.g.l.l(this);
        }
        return this.s0;
    }

    private void h1() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        y1(0);
        X0();
    }

    private void i1() {
        d0 d0Var = null;
        View focusedChild = (!this.e0 || !hasFocus() || this.m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = U(focusedChild);
        }
        if (d0Var == null) {
            g1();
            return;
        }
        this.i0.n = this.m.j() ? d0Var.k() : -1L;
        this.i0.m = this.E ? -1 : d0Var.v() ? d0Var.f1554d : d0Var.j();
        this.i0.o = l0(d0Var.f1551a);
    }

    public static d0 j0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f1586a;
    }

    static void k0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f1587b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int l0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void n(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.G(false);
        if (z2) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                g(d0Var2);
            }
            d0Var.f1558h = d0Var2;
            g(d0Var);
            this.f1527c.J(d0Var);
            d0Var2.G(false);
            d0Var2.i = d0Var;
        }
        if (this.N.b(d0Var, d0Var2, cVar, cVar2)) {
            Q0();
        }
    }

    private void n1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.m;
        if (gVar2 != null) {
            gVar2.E(this.f1526b);
            this.m.x(this);
        }
        if (!z2 || z3) {
            Y0();
        }
        this.f1529e.y();
        g gVar3 = this.m;
        this.m = gVar;
        if (gVar != null) {
            gVar.C(this.f1526b);
            gVar.t(this);
        }
        o oVar = this.n;
        if (oVar != null) {
            oVar.F0(gVar3, this.m);
        }
        this.f1527c.x(gVar3, this.m, z2);
        this.i0.f1540g = true;
    }

    private void o0(long j2, d0 d0Var, d0 d0Var2) {
        int g2 = this.f1530f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 j0 = j0(this.f1530f.f(i2));
            if (j0 != d0Var && f0(j0) == j2) {
                g gVar = this.m;
                if (gVar == null || !gVar.j()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + j0 + " \n View Holder 2:" + d0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + j0 + " \n View Holder 2:" + d0Var + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + Q());
    }

    private boolean q0() {
        int g2 = this.f1530f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 j0 = j0(this.f1530f.f(i2));
            if (j0 != null && !j0.J() && j0.y()) {
                return true;
            }
        }
        return false;
    }

    private void r() {
        h1();
        setScrollState(0);
    }

    static void s(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f1552b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == d0Var.f1551a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                d0Var.f1552b = null;
                return;
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private void s0() {
        if (b.g.l.t.x(this) == 0) {
            b.g.l.t.s0(this, 8);
        }
    }

    private void t0() {
        this.f1530f = new androidx.recyclerview.widget.d(new e());
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m0 = m0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(m0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(G0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m0, e8);
            }
        }
    }

    private boolean y(int i2, int i3) {
        W(this.r0);
        int[] iArr = this.r0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private boolean z0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.j.set(0, 0, view.getWidth(), view.getHeight());
        this.k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.j);
        offsetDescendantRectToMyCoords(view2, this.k);
        char c2 = 65535;
        int i4 = this.n.a0() == 1 ? -1 : 1;
        Rect rect = this.j;
        int i5 = rect.left;
        Rect rect2 = this.k;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i2 + Q());
        }
    }

    void A(View view) {
        d0 j0 = j0(view);
        J0(view);
        g gVar = this.m;
        if (gVar != null && j0 != null) {
            gVar.A(j0);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).d(view);
            }
        }
    }

    void A0(int i2) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.y1(i2);
        awakenScrollBars();
    }

    void B0() {
        int j2 = this.f1530f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.f1530f.i(i2).getLayoutParams()).f1588c = true;
        }
        this.f1527c.s();
    }

    void B1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.f1530f.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.f1530f.i(i6);
            d0 j0 = j0(i7);
            if (j0 != null && !j0.J() && (i4 = j0.f1553c) >= i2 && i4 < i5) {
                j0.b(2);
                j0.a(obj);
                ((p) i7.getLayoutParams()).f1588c = true;
            }
        }
        this.f1527c.M(i2, i3);
    }

    void C() {
        String str;
        if (this.m == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.n != null) {
            a0 a0Var = this.i0;
            a0Var.j = false;
            if (a0Var.f1538e == 1) {
                D();
            } else if (!this.f1529e.q() && this.n.p0() == getWidth() && this.n.X() == getHeight()) {
                this.n.A1(this);
                F();
                return;
            }
            this.n.A1(this);
            E();
            F();
            return;
        } else {
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    void C0() {
        int j2 = this.f1530f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 j0 = j0(this.f1530f.i(i2));
            if (j0 != null && !j0.J()) {
                j0.b(6);
            }
        }
        B0();
        this.f1527c.t();
    }

    public void D0(int i2) {
        int g2 = this.f1530f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f1530f.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void E0(int i2) {
        int g2 = this.f1530f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f1530f.f(i3).offsetTopAndBottom(i2);
        }
    }

    void F0(int i2, int i3) {
        int j2 = this.f1530f.j();
        for (int i4 = 0; i4 < j2; i4++) {
            d0 j0 = j0(this.f1530f.i(i4));
            if (j0 != null && !j0.J() && j0.f1553c >= i2) {
                j0.A(i3, false);
                this.i0.f1540g = true;
            }
        }
        this.f1527c.u(i2, i3);
        requestLayout();
    }

    public boolean G(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    void G0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.f1530f.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            d0 j0 = j0(this.f1530f.i(i8));
            if (j0 != null && (i7 = j0.f1553c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    j0.A(i3 - i2, false);
                } else {
                    j0.A(i6, false);
                }
                this.i0.f1540g = true;
            }
        }
        this.f1527c.v(i2, i3);
        requestLayout();
    }

    public final void H(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    void H0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.f1530f.j();
        for (int i5 = 0; i5 < j2; i5++) {
            d0 j0 = j0(this.f1530f.i(i5));
            if (j0 != null && !j0.J()) {
                int i6 = j0.f1553c;
                if (i6 >= i4) {
                    j0.A(-i3, z2);
                } else if (i6 >= i2) {
                    j0.i(i2 - 1, -i3, z2);
                }
                this.i0.f1540g = true;
            }
        }
        this.f1527c.w(i2, i3, z2);
        requestLayout();
    }

    void I(int i2) {
        o oVar = this.n;
        if (oVar != null) {
            oVar.f1(i2);
        }
        O0(i2);
        t tVar = this.j0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.k0.get(size).a(this, i2);
            }
        }
    }

    public void I0(View view) {
    }

    void J(int i2, int i3) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        P0(i2, i3);
        t tVar = this.j0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.k0.get(size).b(this, i2, i3);
            }
        }
        this.H--;
    }

    public void J0(View view) {
    }

    void K() {
        int i2;
        for (int size = this.w0.size() - 1; size >= 0; size--) {
            d0 d0Var = this.w0.get(size);
            if (d0Var.f1551a.getParent() == this && !d0Var.J() && (i2 = d0Var.q) != -1) {
                b.g.l.t.r0(d0Var.f1551a, i2);
                d0Var.q = -1;
            }
        }
        this.w0.clear();
    }

    public void K0() {
        this.G++;
    }

    void L0() {
        M0(true);
    }

    void M() {
        int i2;
        int i3;
        if (this.M != null) {
            return;
        }
        EdgeEffect a2 = this.I.a(this, 3);
        this.M = a2;
        if (this.f1532h) {
            i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i3 = getMeasuredWidth();
            i2 = getMeasuredHeight();
        }
        a2.setSize(i3, i2);
    }

    public void M0(boolean z2) {
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 < 1) {
            this.G = 0;
            if (!z2) {
                return;
            }
            B();
            K();
        }
    }

    void N() {
        int i2;
        int i3;
        if (this.J != null) {
            return;
        }
        EdgeEffect a2 = this.I.a(this, 0);
        this.J = a2;
        if (this.f1532h) {
            i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i3 = getMeasuredHeight();
            i2 = getMeasuredWidth();
        }
        a2.setSize(i3, i2);
    }

    void O() {
        int i2;
        int i3;
        if (this.L != null) {
            return;
        }
        EdgeEffect a2 = this.I.a(this, 2);
        this.L = a2;
        if (this.f1532h) {
            i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i3 = getMeasuredHeight();
            i2 = getMeasuredWidth();
        }
        a2.setSize(i3, i2);
    }

    public void O0(int i2) {
    }

    void P() {
        int i2;
        int i3;
        if (this.K != null) {
            return;
        }
        EdgeEffect a2 = this.I.a(this, 1);
        this.K = a2;
        if (this.f1532h) {
            i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i3 = getMeasuredWidth();
            i2 = getMeasuredHeight();
        }
        a2.setSize(i3, i2);
    }

    public void P0(int i2, int i3) {
    }

    String Q() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    void Q0() {
        if (this.o0 || !this.s) {
            return;
        }
        b.g.l.t.a0(this, this.x0);
        this.o0 = true;
    }

    final void R(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.p = 0;
            a0Var.q = 0;
            return;
        }
        OverScroller overScroller = this.f0.f1545d;
        a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
        a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public View S(float f2, float f3) {
        for (int g2 = this.f1530f.g() - 1; g2 >= 0; g2--) {
            View f4 = this.f1530f.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= f4.getLeft() + translationX && f2 <= f4.getRight() + translationX && f3 >= f4.getTop() + translationY && f3 <= f4.getBottom() + translationY) {
                return f4;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View T(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.T(android.view.View):android.view.View");
    }

    void T0(boolean z2) {
        this.F = z2 | this.F;
        this.E = true;
        C0();
    }

    public d0 U(View view) {
        View T = T(view);
        if (T == null) {
            return null;
        }
        return i0(T);
    }

    void V0(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.i0.i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.f1531g.c(f0(d0Var), d0Var);
        }
        this.f1531g.e(d0Var, cVar);
    }

    public void Y0() {
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.n;
        if (oVar != null) {
            oVar.l1(this.f1527c);
            this.n.m1(this.f1527c);
        }
        this.f1527c.c();
    }

    public d0 Z(int i2) {
        d0 d0Var = null;
        if (this.E) {
            return null;
        }
        int j2 = this.f1530f.j();
        for (int i3 = 0; i3 < j2; i3++) {
            d0 j0 = j0(this.f1530f.i(i3));
            if (j0 != null && !j0.v() && e0(j0) == i2) {
                if (!this.f1530f.n(j0.f1551a)) {
                    return j0;
                }
                d0Var = j0;
            }
        }
        return d0Var;
    }

    boolean Z0(View view) {
        v1();
        boolean r2 = this.f1530f.r(view);
        if (r2) {
            d0 j0 = j0(view);
            this.f1527c.J(j0);
            this.f1527c.C(j0);
        }
        x1(!r2);
        return r2;
    }

    void a(int i2, int i3) {
        if (i2 < 0) {
            N();
            if (this.J.isFinished()) {
                this.J.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            O();
            if (this.L.isFinished()) {
                this.L.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            P();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            M();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        b.g.l.t.Z(this);
    }

    public d0 a0(long j2) {
        g gVar = this.m;
        d0 d0Var = null;
        if (gVar != null && gVar.j()) {
            int j3 = this.f1530f.j();
            for (int i2 = 0; i2 < j3; i2++) {
                d0 j0 = j0(this.f1530f.i(i2));
                if (j0 != null && !j0.v() && j0.k() == j2) {
                    if (!this.f1530f.n(j0.f1551a)) {
                        return j0;
                    }
                    d0Var = j0;
                }
            }
        }
        return d0Var;
    }

    public void a1(n nVar) {
        o oVar = this.n;
        if (oVar != null) {
            oVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.p.remove(nVar);
        if (this.p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        B0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.n;
        if (oVar == null || !oVar.G0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public d0 b0(int i2) {
        return c0(i2, false);
    }

    public void b1(q qVar) {
        List<q> list = this.D;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.d0 c0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.f1530f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.f1530f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = j0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f1553c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.f1530f
            android.view.View r4 = r3.f1551a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public void c1(s sVar) {
        this.q.remove(sVar);
        if (this.r == sVar) {
            this.r = null;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.n.n((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.n;
        if (oVar != null && oVar.l()) {
            return this.n.r(this.i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.n;
        if (oVar != null && oVar.l()) {
            return this.n.s(this.i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.n;
        if (oVar != null && oVar.l()) {
            return this.n.t(this.i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.n;
        if (oVar != null && oVar.m()) {
            return this.n.u(this.i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.n;
        if (oVar != null && oVar.m()) {
            return this.n.v(this.i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.n;
        if (oVar != null && oVar.m()) {
            return this.n.w(this.i0);
        }
        return 0;
    }

    public boolean d0(int i2, int i3) {
        o oVar = this.n;
        int i4 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.y) {
            return false;
        } else {
            boolean l2 = oVar.l();
            boolean m2 = this.n.m();
            if (!l2 || Math.abs(i2) < this.a0) {
                i2 = 0;
            }
            if (!m2 || Math.abs(i3) < this.a0) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = i2;
            float f3 = i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = l2 || m2;
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.W;
                if (rVar != null && rVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (l2) {
                        i4 = 1;
                    }
                    if (m2) {
                        i4 |= 2;
                    }
                    w1(i4, 1);
                    int i5 = this.b0;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.b0;
                    this.f0.c(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    public void d1(t tVar) {
        List<t> list = this.k0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        int i2;
        float f2;
        super.draw(canvas);
        int size = this.p.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.p.get(i3).k(canvas, this, this.i0);
        }
        EdgeEffect edgeEffect = this.J;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1532h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1532h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1532h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.L;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1532h) {
                f2 = (-getWidth()) + getPaddingRight();
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = -getWidth();
                i2 = -getHeight();
            }
            canvas.translate(f2, i2);
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.N == null || this.p.size() <= 0 || !this.N.p()) {
            z4 = z2;
        }
        if (z4) {
            b.g.l.t.Z(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    int e0(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.f1529e.e(d0Var.f1553c);
    }

    void e1() {
        d0 d0Var;
        int g2 = this.f1530f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.f1530f.f(i2);
            d0 i0 = i0(f2);
            if (i0 != null && (d0Var = i0.i) != null) {
                View view = d0Var.f1551a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    long f0(d0 d0Var) {
        return this.m.j() ? d0Var.k() : d0Var.f1553c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View R0 = this.n.R0(view, i2);
        if (R0 != null) {
            return R0;
        }
        boolean z3 = true;
        boolean z4 = this.m != null && this.n != null && !y0() && !this.y;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                view2 = this.n.K0(view, i2, this.f1527c, this.i0);
                x1(false);
            }
        } else {
            if (this.n.m()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (E0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.n.l()) {
                int i4 = (this.n.a0() == 1) ^ (i2 == 2) ? 66 : 17;
                if (focusFinder.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (E0) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                this.n.K0(view, i2, this.f1527c, this.i0);
                x1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return z0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            f1(view2, null);
            return view;
        }
    }

    public int g0(View view) {
        d0 j0 = j0(view);
        if (j0 != null) {
            return j0.j();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.n;
        if (oVar != null) {
            return oVar.E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.n;
        if (oVar != null) {
            return oVar.F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.n;
        if (oVar != null) {
            return oVar.G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.n;
        return oVar != null ? oVar.H() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.q0;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1532h;
    }

    public androidx.recyclerview.widget.r getCompatAccessibilityDelegate() {
        return this.p0;
    }

    public k getEdgeEffectFactory() {
        return this.I;
    }

    public l getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public o getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.b0;
    }

    public int getMinFlingVelocity() {
        return this.a0;
    }

    public long getNanoTime() {
        if (D0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.e0;
    }

    public u getRecycledViewPool() {
        return this.f1527c.i();
    }

    public int getScrollState() {
        return this.O;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public int h0(View view) {
        d0 j0 = j0(view);
        if (j0 != null) {
            return j0.m();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i2) {
        o oVar = this.n;
        if (oVar != null) {
            oVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.p.add(nVar);
        } else {
            this.p.add(i2, nVar);
        }
        B0();
        requestLayout();
    }

    public d0 i0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return j0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.y;
    }

    @Override // android.view.View, b.g.l.k
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(q qVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(qVar);
    }

    void j1() {
        int j2 = this.f1530f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 j0 = j0(this.f1530f.i(i2));
            if (!j0.J()) {
                j0.E();
            }
        }
    }

    public void k(s sVar) {
        this.q.add(sVar);
    }

    boolean k1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        v();
        if (this.m != null) {
            int[] iArr = this.v0;
            iArr[0] = 0;
            iArr[1] = 0;
            l1(i2, i3, iArr);
            int[] iArr2 = this.v0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i7 = i9;
            i6 = i8;
            i5 = i2 - i8;
            i4 = i3 - i9;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.v0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i6, i7, i5, i4, this.t0, 0, iArr3);
        int[] iArr4 = this.v0;
        int i10 = i5 - iArr4[0];
        int i11 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.T;
        int[] iArr5 = this.t0;
        this.T = i12 - iArr5[0];
        this.U -= iArr5[1];
        int[] iArr6 = this.u0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !b.g.l.j.a(motionEvent, 8194)) {
                U0(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            u(i2, i3);
        }
        if (i6 != 0 || i7 != 0) {
            J(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i7 == 0) ? false : true;
    }

    public void l(t tVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(tVar);
    }

    void l1(int i2, int i3, int[] iArr) {
        v1();
        K0();
        b.g.h.b.a("RV Scroll");
        R(this.i0);
        int x1 = i2 != 0 ? this.n.x1(i2, this.f1527c, this.i0) : 0;
        int z1 = i3 != 0 ? this.n.z1(i3, this.f1527c, this.i0) : 0;
        b.g.h.b.b();
        e1();
        L0();
        x1(false);
        if (iArr != null) {
            iArr[0] = x1;
            iArr[1] = z1;
        }
    }

    void m(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.N.a(d0Var, cVar, cVar2)) {
            Q0();
        }
    }

    public void m1(int i2) {
        if (this.y) {
            return;
        }
        z1();
        o oVar = this.n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        oVar.y1(i2);
        awakenScrollBars();
    }

    Rect n0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f1588c) {
            return pVar.f1587b;
        }
        if (this.i0.e() && (pVar.b() || pVar.d())) {
            return pVar.f1587b;
        }
        Rect rect = pVar.f1587b;
        rect.set(0, 0, 0, 0);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.j.set(0, 0, 0, 0);
            this.p.get(i2).g(this.j, view, this, this.i0);
            int i3 = rect.left;
            Rect rect2 = this.j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f1588c = false;
        return rect;
    }

    void o(d0 d0Var, l.c cVar, l.c cVar2) {
        g(d0Var);
        d0Var.G(false);
        if (this.N.c(d0Var, cVar, cVar2)) {
            Q0();
        }
    }

    boolean o1(d0 d0Var, int i2) {
        if (!y0()) {
            b.g.l.t.r0(d0Var.f1551a, i2);
            return true;
        }
        d0Var.q = i2;
        this.w0.add(d0Var);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = 0;
        boolean z2 = true;
        this.s = true;
        if (!this.v || isLayoutRequested()) {
            z2 = false;
        }
        this.v = z2;
        o oVar = this.n;
        if (oVar != null) {
            oVar.A(this);
        }
        this.o0 = false;
        if (D0) {
            ThreadLocal<androidx.recyclerview.widget.h> threadLocal = androidx.recyclerview.widget.h.f1746f;
            androidx.recyclerview.widget.h hVar = threadLocal.get();
            this.g0 = hVar;
            if (hVar == null) {
                this.g0 = new androidx.recyclerview.widget.h();
                Display s2 = b.g.l.t.s(this);
                float f2 = 60.0f;
                if (!isInEditMode() && s2 != null) {
                    float refreshRate = s2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.h hVar2 = this.g0;
                hVar2.f1750d = 1.0E9f / f2;
                threadLocal.set(hVar2);
            }
            this.g0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.h hVar;
        super.onDetachedFromWindow();
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        z1();
        this.s = false;
        o oVar = this.n;
        if (oVar != null) {
            oVar.B(this, this.f1527c);
        }
        this.w0.clear();
        removeCallbacks(this.x0);
        this.f1531g.j();
        if (!D0 || (hVar = this.g0) == null) {
            return;
        }
        hVar.j(this);
        this.g0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).i(canvas, this, this.i0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.y
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.n
            boolean r0 = r0.m()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.n
            boolean r3 = r3.l()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.n
            boolean r3 = r3.m()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.n
            boolean r3 = r3.l()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.k1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.y) {
            return false;
        }
        this.r = null;
        if (V(motionEvent)) {
            r();
            return true;
        }
        o oVar = this.n;
        if (oVar == null) {
            return false;
        }
        boolean l2 = oVar.l();
        boolean m2 = this.n.m();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.z) {
                this.z = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.U = y2;
            this.S = y2;
            if (this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                y1(1);
            }
            int[] iArr = this.u0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (m2) {
                boolean z3 = l2 ? 1 : 0;
                char c2 = l2 ? 1 : 0;
                l2 = z3 | true;
            }
            int i2 = l2 ? 1 : 0;
            int i3 = l2 ? 1 : 0;
            w1(i2, 0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            y1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i4 = x3 - this.R;
                int i5 = y3 - this.S;
                if (!l2 || Math.abs(i4) <= this.V) {
                    z2 = false;
                } else {
                    this.T = x3;
                    z2 = true;
                }
                if (m2 && Math.abs(i5) > this.V) {
                    this.U = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x4;
            this.R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y4;
            this.S = y4;
        } else if (actionMasked == 6) {
            N0(motionEvent);
        }
        return this.O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        b.g.h.b.a("RV OnLayout");
        C();
        b.g.h.b.b();
        this.v = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        o oVar = this.n;
        if (oVar == null) {
            x(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.t0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.a1(this.f1527c, this.i0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.m == null) {
                return;
            }
            if (this.i0.f1538e == 1) {
                D();
            }
            this.n.B1(i2, i3);
            this.i0.j = true;
            E();
            this.n.E1(i2, i3);
            if (!this.n.H1()) {
                return;
            }
            this.n.B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.i0.j = true;
            E();
            this.n.E1(i2, i3);
        } else if (this.t) {
            this.n.a1(this.f1527c, this.i0, i2, i3);
        } else {
            if (this.B) {
                v1();
                K0();
                S0();
                L0();
                a0 a0Var = this.i0;
                if (a0Var.l) {
                    a0Var.f1541h = true;
                } else {
                    this.f1529e.j();
                    this.i0.f1541h = false;
                }
                this.B = false;
                x1(false);
            } else if (this.i0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.m;
            if (gVar != null) {
                this.i0.f1539f = gVar.f();
            } else {
                this.i0.f1539f = 0;
            }
            v1();
            this.n.a1(this.f1527c, this.i0, i2, i3);
            x1(false);
            this.i0.f1541h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (y0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f1528d = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.n;
        if (oVar == null || (parcelable2 = this.f1528d.f1605d) == null) {
            return;
        }
        oVar.d1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f1528d;
        if (yVar2 != null) {
            yVar.c(yVar2);
        } else {
            o oVar = this.n;
            yVar.f1605d = oVar != null ? oVar.e1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p(String str) {
        if (y0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        } else if (this.H <= 0) {
        } else {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    public boolean p0() {
        return !this.v || this.E || this.f1529e.p();
    }

    boolean p1(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (y0()) {
            int a2 = accessibilityEvent != null ? b.g.l.c0.b.a(accessibilityEvent) : 0;
            if (a2 != 0) {
                i2 = a2;
            }
            this.A |= i2;
            return true;
        }
        return false;
    }

    boolean q(d0 d0Var) {
        l lVar = this.N;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    public void q1(int i2, int i3) {
        r1(i2, i3, null);
    }

    void r0() {
        this.f1529e = new androidx.recyclerview.widget.a(new f());
    }

    public void r1(int i2, int i3, Interpolator interpolator) {
        s1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        d0 j0 = j0(view);
        if (j0 != null) {
            if (j0.x()) {
                j0.f();
            } else if (!j0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + j0 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.n.c1(this, this.i0, view, view2) && view2 != null) {
            f1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.s1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.w != 0 || this.y) {
            this.x = true;
        } else {
            super.requestLayout();
        }
    }

    public void s1(int i2, int i3, Interpolator interpolator, int i4) {
        t1(i2, i3, interpolator, i4, false);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.y) {
        } else {
            boolean l2 = oVar.l();
            boolean m2 = this.n.m();
            if (!l2 && !m2) {
                return;
            }
            if (!l2) {
                i2 = 0;
            }
            if (!m2) {
                i3 = 0;
            }
            k1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (p1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.r rVar) {
        this.p0 = rVar;
        b.g.l.t.i0(this, rVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        n1(gVar, false, true);
        T0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.q0) {
            return;
        }
        this.q0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1532h) {
            v0();
        }
        this.f1532h = z2;
        super.setClipToPadding(z2);
        if (this.v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        b.g.k.h.c(kVar);
        this.I = kVar;
        v0();
    }

    public void setHasFixedSize(boolean z2) {
        this.t = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.N;
        if (lVar2 != null) {
            lVar2.k();
            this.N.w(null);
        }
        this.N = lVar;
        if (lVar != null) {
            lVar.w(this.n0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f1527c.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.n) {
            return;
        }
        z1();
        if (this.n != null) {
            l lVar = this.N;
            if (lVar != null) {
                lVar.k();
            }
            this.n.l1(this.f1527c);
            this.n.m1(this.f1527c);
            this.f1527c.c();
            if (this.s) {
                this.n.B(this, this.f1527c);
            }
            this.n.F1(null);
            this.n = null;
        } else {
            this.f1527c.c();
        }
        this.f1530f.o();
        this.n = oVar;
        if (oVar != null) {
            if (oVar.f1573b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f1573b.Q());
            }
            oVar.F1(this);
            if (this.s) {
                this.n.A(this);
            }
        }
        this.f1527c.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.W = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.j0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.e0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.f1527c.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.o = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.O) {
            return;
        }
        this.O = i2;
        if (i2 != 2) {
            A1();
        }
        I(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.V = i3;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.V = i3;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f1527c.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, b.g.l.k
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.y) {
            p("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.y = true;
                this.z = true;
                z1();
                return;
            }
            this.y = false;
            if (this.x && this.n != null && this.m != null) {
                requestLayout();
            }
            this.x = false;
        }
    }

    void t() {
        int j2 = this.f1530f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 j0 = j0(this.f1530f.i(i2));
            if (!j0.J()) {
                j0.c();
            }
        }
        this.f1527c.d();
    }

    void t1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.y) {
        } else {
            int i5 = 0;
            if (!oVar.l()) {
                i2 = 0;
            }
            if (!this.n.m()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
                scrollBy(i2, i3);
                return;
            }
            if (z2) {
                if (i2 != 0) {
                    i5 = 1;
                }
                if (i3 != 0) {
                    i5 |= 2;
                }
                w1(i5, 1);
            }
            this.f0.f(i2, i3, i4, interpolator);
        }
    }

    void u(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.J.onRelease();
            z2 = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            b.g.l.t.Z(this);
        }
    }

    void u0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(b.n.b.a_res_0x7f070092), resources.getDimensionPixelSize(b.n.b.c_res_0x7f070094), resources.getDimensionPixelOffset(b.n.b.b_res_0x7f070093));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
    }

    public void u1(int i2) {
        if (this.y) {
            return;
        }
        o oVar = this.n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.J1(this, this.i0, i2);
        }
    }

    void v() {
        if (!this.v || this.E) {
            b.g.h.b.a("RV FullInvalidate");
            C();
            b.g.h.b.b();
        } else if (!this.f1529e.p()) {
        } else {
            if (this.f1529e.o(4) && !this.f1529e.o(11)) {
                b.g.h.b.a("RV PartialInvalidate");
                v1();
                K0();
                this.f1529e.w();
                if (!this.x) {
                    if (q0()) {
                        C();
                    } else {
                        this.f1529e.i();
                    }
                }
                x1(true);
                L0();
            } else if (!this.f1529e.p()) {
                return;
            } else {
                b.g.h.b.a("RV FullInvalidate");
                C();
            }
            b.g.h.b.b();
        }
    }

    void v0() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    void v1() {
        int i2 = this.w + 1;
        this.w = i2;
        if (i2 != 1 || this.y) {
            return;
        }
        this.x = false;
    }

    public void w0() {
        if (this.p.size() == 0) {
            return;
        }
        o oVar = this.n;
        if (oVar != null) {
            oVar.h("Cannot invalidate item decorations during a scroll or layout");
        }
        B0();
        requestLayout();
    }

    public boolean w1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    void x(int i2, int i3) {
        setMeasuredDimension(o.o(i2, getPaddingLeft() + getPaddingRight(), b.g.l.t.A(this)), o.o(i3, getPaddingTop() + getPaddingBottom(), b.g.l.t.z(this)));
    }

    boolean x0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void x1(boolean z2) {
        if (this.w < 1) {
            this.w = 1;
        }
        if (!z2 && !this.y) {
            this.x = false;
        }
        if (this.w == 1) {
            if (z2 && this.x && !this.y && this.n != null && this.m != null) {
                C();
            }
            if (!this.y) {
                this.x = false;
            }
        }
        this.w--;
    }

    public boolean y0() {
        return this.G > 0;
    }

    public void y1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    void z(View view) {
        d0 j0 = j0(view);
        I0(view);
        g gVar = this.m;
        if (gVar != null && j0 != null) {
            gVar.z(j0);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).c(view);
            }
        }
    }

    public void z1() {
        setScrollState(0);
        A1();
    }
}
