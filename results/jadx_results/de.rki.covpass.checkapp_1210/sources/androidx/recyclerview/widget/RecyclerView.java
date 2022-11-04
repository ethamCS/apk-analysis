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
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.n {

    /* renamed from: r5 */
    private static final Class<?>[] f4464r5;
    private EdgeEffect A4;
    l B4;
    private int C4;
    private int D4;
    private VelocityTracker E4;
    private int F4;
    private int G4;
    private int H4;
    private int I4;
    private int J4;
    private r K4;
    private final int L4;
    private final int M4;
    private float N4;
    private float O4;
    private boolean P4;
    final c0 Q4;
    androidx.recyclerview.widget.e R4;
    e.b S4;
    final a0 T4;
    final androidx.recyclerview.widget.p U3;
    private t U4;
    boolean V3;
    private List<t> V4;
    final Runnable W3;
    boolean W4;
    final Rect X3;
    boolean X4;
    private final Rect Y3;
    private l.b Y4;
    final RectF Z3;
    boolean Z4;

    /* renamed from: a4 */
    g f4466a4;

    /* renamed from: a5 */
    androidx.recyclerview.widget.k f4467a5;

    /* renamed from: b4 */
    o f4468b4;

    /* renamed from: b5 */
    private j f4469b5;

    /* renamed from: c */
    private final x f4470c;

    /* renamed from: c4 */
    w f4471c4;

    /* renamed from: c5 */
    private final int[] f4472c5;

    /* renamed from: d */
    final v f4473d;

    /* renamed from: d4 */
    final ArrayList<n> f4474d4;

    /* renamed from: d5 */
    private androidx.core.view.o f4475d5;

    /* renamed from: e4 */
    private final ArrayList<s> f4476e4;

    /* renamed from: e5 */
    private final int[] f4477e5;

    /* renamed from: f4 */
    private s f4478f4;

    /* renamed from: f5 */
    private final int[] f4479f5;

    /* renamed from: g4 */
    boolean f4480g4;

    /* renamed from: g5 */
    final int[] f4481g5;

    /* renamed from: h4 */
    boolean f4482h4;

    /* renamed from: h5 */
    final List<d0> f4483h5;

    /* renamed from: i4 */
    boolean f4484i4;

    /* renamed from: i5 */
    private Runnable f4485i5;

    /* renamed from: j4 */
    boolean f4486j4;

    /* renamed from: j5 */
    private final p.b f4487j5;

    /* renamed from: k4 */
    private int f4488k4;

    /* renamed from: l4 */
    boolean f4489l4;

    /* renamed from: m4 */
    boolean f4490m4;

    /* renamed from: n4 */
    private boolean f4491n4;

    /* renamed from: o4 */
    private int f4492o4;

    /* renamed from: p4 */
    boolean f4493p4;

    /* renamed from: q */
    private y f4494q;

    /* renamed from: q4 */
    private final AccessibilityManager f4495q4;

    /* renamed from: r4 */
    private List<q> f4496r4;

    /* renamed from: s4 */
    boolean f4497s4;

    /* renamed from: t4 */
    boolean f4498t4;

    /* renamed from: u4 */
    private int f4499u4;

    /* renamed from: v4 */
    private int f4500v4;

    /* renamed from: w4 */
    private k f4501w4;

    /* renamed from: x */
    androidx.recyclerview.widget.a f4502x;

    /* renamed from: x4 */
    private EdgeEffect f4503x4;

    /* renamed from: y */
    androidx.recyclerview.widget.b f4504y;

    /* renamed from: y4 */
    private EdgeEffect f4505y4;

    /* renamed from: z4 */
    private EdgeEffect f4506z4;

    /* renamed from: k5 */
    private static final int[] f4457k5 = {16843830};

    /* renamed from: l5 */
    static final boolean f4458l5 = false;

    /* renamed from: m5 */
    static final boolean f4459m5 = true;

    /* renamed from: n5 */
    static final boolean f4460n5 = true;

    /* renamed from: o5 */
    static final boolean f4461o5 = true;

    /* renamed from: p5 */
    private static final boolean f4462p5 = false;

    /* renamed from: q5 */
    private static final boolean f4463q5 = false;

    /* renamed from: s5 */
    static final Interpolator f4465s5 = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4486j4 || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4480g4) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4490m4) {
                recyclerView2.f4489l4 = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: b */
        private SparseArray<Object> f4509b;

        /* renamed from: m */
        int f4520m;

        /* renamed from: n */
        long f4521n;

        /* renamed from: o */
        int f4522o;

        /* renamed from: p */
        int f4523p;

        /* renamed from: q */
        int f4524q;

        /* renamed from: a */
        int f4508a = -1;

        /* renamed from: c */
        int f4510c = 0;

        /* renamed from: d */
        int f4511d = 0;

        /* renamed from: e */
        int f4512e = 1;

        /* renamed from: f */
        int f4513f = 0;

        /* renamed from: g */
        boolean f4514g = false;

        /* renamed from: h */
        boolean f4515h = false;

        /* renamed from: i */
        boolean f4516i = false;

        /* renamed from: j */
        boolean f4517j = false;

        /* renamed from: k */
        boolean f4518k = false;

        /* renamed from: l */
        boolean f4519l = false;

        void a(int i10) {
            if ((this.f4512e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4512e));
        }

        public int b() {
            return this.f4515h ? this.f4510c - this.f4511d : this.f4513f;
        }

        public int c() {
            return this.f4508a;
        }

        public boolean d() {
            return this.f4508a != -1;
        }

        public boolean e() {
            return this.f4515h;
        }

        public void f(g gVar) {
            this.f4512e = 1;
            this.f4513f = gVar.e();
            this.f4515h = false;
            this.f4516i = false;
            this.f4517j = false;
        }

        public boolean g() {
            return this.f4519l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4508a + ", mData=" + this.f4509b + ", mItemCount=" + this.f4513f + ", mIsMeasuring=" + this.f4517j + ", mPreviousLayoutItemCount=" + this.f4510c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4511d + ", mStructureChanged=" + this.f4514g + ", mInPreLayout=" + this.f4515h + ", mRunSimpleAnimations=" + this.f4518k + ", mRunPredictiveAnimations=" + this.f4519l + '}';
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
            l lVar = RecyclerView.this.B4;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.Z4 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
    }

    /* loaded from: classes.dex */
    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: c */
        private int f4526c;

        /* renamed from: d */
        private int f4527d;

        /* renamed from: q */
        OverScroller f4528q;

        /* renamed from: x */
        Interpolator f4529x;

        /* renamed from: y */
        private boolean f4530y = false;
        private boolean U3 = false;

        c0() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.f4465s5;
            this.f4529x = interpolator;
            this.f4528q = new OverScroller(r3.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int i14;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i15 = width / 2;
            float f10 = width;
            float f11 = i15;
            float b10 = f11 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f10)) * f11);
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(b10 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i14 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            return Math.min(i14, 2000);
        }

        private float b(float f10) {
            return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.y.g0(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f4527d = 0;
            this.f4526c = 0;
            Interpolator interpolator = this.f4529x;
            Interpolator interpolator2 = RecyclerView.f4465s5;
            if (interpolator != interpolator2) {
                this.f4529x = interpolator2;
                this.f4528q = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4528q.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f4530y) {
                this.U3 = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f4465s5;
            }
            if (this.f4529x != interpolator) {
                this.f4529x = interpolator;
                this.f4528q = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4527d = 0;
            this.f4526c = 0;
            RecyclerView.this.setScrollState(2);
            this.f4528q.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f4528q.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4468b4 == null) {
                g();
                return;
            }
            this.U3 = false;
            this.f4530y = true;
            recyclerView.v();
            OverScroller overScroller = this.f4528q;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f4526c;
                int i13 = currY - this.f4527d;
                this.f4526c = currX;
                this.f4527d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4481g5;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4481g5;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4466a4 != null) {
                    int[] iArr3 = recyclerView3.f4481g5;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.g1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4481g5;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    z zVar = recyclerView4.f4468b4.f4572g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b10 = RecyclerView.this.T4.b();
                        if (b10 == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= b10) {
                                zVar.p(b10 - 1);
                            }
                            zVar.j(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f4474d4.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4481g5;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i10, i11, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4481g5;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.J(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                z zVar2 = RecyclerView.this.f4468b4.f4572g;
                if ((zVar2 != null && zVar2.g()) || !z10) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.R4;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f4461o5) {
                        RecyclerView.this.S4.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.f4468b4.f4572g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f4530y = false;
            if (this.U3) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.t1(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements p.b {
        d() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4468b4.m1(d0Var.f4533a, recyclerView.f4473d);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f4473d.J(d0Var);
            RecyclerView.this.o(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z10 = recyclerView.f4497s4;
            l lVar = recyclerView.B4;
            if (z10) {
                if (!lVar.b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.M0();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {

        /* renamed from: s */
        private static final List<Object> f4532s = Collections.emptyList();

        /* renamed from: a */
        public final View f4533a;

        /* renamed from: b */
        WeakReference<RecyclerView> f4534b;

        /* renamed from: j */
        int f4542j;

        /* renamed from: r */
        RecyclerView f4550r;

        /* renamed from: c */
        int f4535c = -1;

        /* renamed from: d */
        int f4536d = -1;

        /* renamed from: e */
        long f4537e = -1;

        /* renamed from: f */
        int f4538f = -1;

        /* renamed from: g */
        int f4539g = -1;

        /* renamed from: h */
        d0 f4540h = null;

        /* renamed from: i */
        d0 f4541i = null;

        /* renamed from: k */
        List<Object> f4543k = null;

        /* renamed from: l */
        List<Object> f4544l = null;

        /* renamed from: m */
        private int f4545m = 0;

        /* renamed from: n */
        v f4546n = null;

        /* renamed from: o */
        boolean f4547o = false;

        /* renamed from: p */
        private int f4548p = 0;

        /* renamed from: q */
        int f4549q = -1;

        public d0(View view) {
            if (view != null) {
                this.f4533a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f4543k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4543k = arrayList;
                this.f4544l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, boolean z10) {
            if (this.f4536d == -1) {
                this.f4536d = this.f4535c;
            }
            if (this.f4539g == -1) {
                this.f4539g = this.f4535c;
            }
            if (z10) {
                this.f4539g += i10;
            }
            this.f4535c += i10;
            if (this.f4533a.getLayoutParams() != null) {
                ((p) this.f4533a.getLayoutParams()).f4592c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i10 = this.f4549q;
            if (i10 == -1) {
                i10 = androidx.core.view.y.z(this.f4533a);
            }
            this.f4548p = i10;
            recyclerView.j1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.j1(this, this.f4548p);
            this.f4548p = 0;
        }

        void D() {
            this.f4542j = 0;
            this.f4535c = -1;
            this.f4536d = -1;
            this.f4537e = -1L;
            this.f4539g = -1;
            this.f4545m = 0;
            this.f4540h = null;
            this.f4541i = null;
            d();
            this.f4548p = 0;
            this.f4549q = -1;
            RecyclerView.s(this);
        }

        void E() {
            if (this.f4536d == -1) {
                this.f4536d = this.f4535c;
            }
        }

        void F(int i10, int i11) {
            this.f4542j = (i10 & i11) | (this.f4542j & (~i11));
        }

        public final void G(boolean z10) {
            int i10;
            int i11 = this.f4545m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f4545m = i12;
            if (i12 < 0) {
                this.f4545m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f4542j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f4542j & (-17);
            }
            this.f4542j = i10;
        }

        void H(v vVar, boolean z10) {
            this.f4546n = vVar;
            this.f4547o = z10;
        }

        boolean I() {
            return (this.f4542j & 16) != 0;
        }

        public boolean J() {
            return (this.f4542j & 128) != 0;
        }

        void K() {
            this.f4546n.J(this);
        }

        boolean L() {
            return (this.f4542j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f4542j) != 0) {
            } else {
                g();
                this.f4543k.add(obj);
            }
        }

        void b(int i10) {
            this.f4542j = i10 | this.f4542j;
        }

        void c() {
            this.f4536d = -1;
            this.f4539g = -1;
        }

        void d() {
            List<Object> list = this.f4543k;
            if (list != null) {
                list.clear();
            }
            this.f4542j &= -1025;
        }

        void e() {
            this.f4542j &= -33;
        }

        void f() {
            this.f4542j &= -257;
        }

        boolean h() {
            return (this.f4542j & 16) == 0 && androidx.core.view.y.P(this.f4533a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            A(i11, z10);
            this.f4535c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f4550r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        public final long k() {
            return this.f4537e;
        }

        public final int l() {
            return this.f4538f;
        }

        public final int m() {
            int i10 = this.f4539g;
            return i10 == -1 ? this.f4535c : i10;
        }

        public final int n() {
            return this.f4536d;
        }

        List<Object> o() {
            if ((this.f4542j & 1024) == 0) {
                List<Object> list = this.f4543k;
                return (list == null || list.size() == 0) ? f4532s : this.f4544l;
            }
            return f4532s;
        }

        boolean p(int i10) {
            return (i10 & this.f4542j) != 0;
        }

        boolean q() {
            return (this.f4542j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f4533a.getParent() == null || this.f4533a.getParent() == this.f4550r) ? false : true;
        }

        public boolean s() {
            return (this.f4542j & 1) != 0;
        }

        public boolean t() {
            return (this.f4542j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4535c + " id=" + this.f4537e + ", oldPos=" + this.f4536d + ", pLpos:" + this.f4539g);
            if (w()) {
                sb2.append(" scrap ");
                sb2.append(this.f4547o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb2.append(" invalid");
            }
            if (!s()) {
                sb2.append(" unbound");
            }
            if (z()) {
                sb2.append(" update");
            }
            if (v()) {
                sb2.append(" removed");
            }
            if (J()) {
                sb2.append(" ignored");
            }
            if (x()) {
                sb2.append(" tmpDetached");
            }
            if (!u()) {
                sb2.append(" not recyclable(" + this.f4545m + ")");
            }
            if (q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f4533a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final boolean u() {
            return (this.f4542j & 16) == 0 && !androidx.core.view.y.P(this.f4533a);
        }

        public boolean v() {
            return (this.f4542j & 8) != 0;
        }

        boolean w() {
            return this.f4546n != null;
        }

        boolean x() {
            return (this.f4542j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        }

        boolean y() {
            return (this.f4542j & 2) != 0;
        }

        boolean z() {
            return (this.f4542j & 2) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.AbstractC0057b {
        e() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void b(View view) {
            d0 g02 = RecyclerView.g0(view);
            if (g02 != null) {
                g02.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public d0 c(View view) {
            return RecyclerView.g0(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void d(int i10) {
            d0 g02;
            View a10 = a(i10);
            if (a10 != null && (g02 = RecyclerView.g0(a10)) != null) {
                if (g02.x() && !g02.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + g02 + RecyclerView.this.Q());
                }
                g02.b(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void e(View view) {
            d0 g02 = RecyclerView.g0(view);
            if (g02 != null) {
                g02.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void i() {
            int g10 = g();
            for (int i10 = 0; i10 < g10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.A(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            d0 g02 = RecyclerView.g0(view);
            if (g02 != null) {
                if (!g02.x() && !g02.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g02 + RecyclerView.this.Q());
                }
                g02.f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0057b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.AbstractC0056a {
        f() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void a(int i10, int i11) {
            RecyclerView.this.C0(i10, i11);
            RecyclerView.this.W4 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public d0 c(int i10) {
            d0 a02 = RecyclerView.this.a0(i10, true);
            if (a02 != null && !RecyclerView.this.f4504y.n(a02.f4533a)) {
                return a02;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void d(int i10, int i11) {
            RecyclerView.this.D0(i10, i11, false);
            RecyclerView.this.W4 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void e(int i10, int i11) {
            RecyclerView.this.B0(i10, i11);
            RecyclerView.this.W4 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void f(int i10, int i11) {
            RecyclerView.this.D0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.W4 = true;
            recyclerView.T4.f4511d += i11;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0056a
        public void h(int i10, int i11, Object obj) {
            RecyclerView.this.w1(i10, i11, obj);
            RecyclerView.this.X4 = true;
        }

        void i(a.b bVar) {
            int i10 = bVar.f4668a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4468b4.R0(recyclerView, bVar.f4669b, bVar.f4671d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4468b4.U0(recyclerView2, bVar.f4669b, bVar.f4671d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4468b4.W0(recyclerView3, bVar.f4669b, bVar.f4671d, bVar.f4670c);
            } else if (i10 != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4468b4.T0(recyclerView4, bVar.f4669b, bVar.f4671d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends d0> {

        /* renamed from: a */
        private final h f4553a = new h();

        /* renamed from: b */
        private boolean f4554b = false;

        public final void c(VH vh2, int i10) {
            vh2.f4535c = i10;
            if (i()) {
                vh2.f4537e = f(i10);
            }
            vh2.F(1, 519);
            androidx.core.os.i.a("RV OnBindView");
            m(vh2, i10, vh2.o());
            vh2.d();
            ViewGroup.LayoutParams layoutParams = vh2.f4533a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f4592c = true;
            }
            androidx.core.os.i.b();
        }

        public final VH d(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.i.a("RV CreateView");
                VH n10 = n(viewGroup, i10);
                if (n10.f4533a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                n10.f4538f = i10;
                return n10;
            } finally {
                androidx.core.os.i.b();
            }
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f4553a.a();
        }

        public final boolean i() {
            return this.f4554b;
        }

        public final void j() {
            this.f4553a.b();
        }

        public void k(RecyclerView recyclerView) {
        }

        public abstract void l(VH vh2, int i10);

        public void m(VH vh2, int i10, List<Object> list) {
            l(vh2, i10);
        }

        public abstract VH n(ViewGroup viewGroup, int i10);

        public void o(RecyclerView recyclerView) {
        }

        public boolean p(VH vh2) {
            return false;
        }

        public void q(VH vh2) {
        }

        public void r(VH vh2) {
        }

        public void s(VH vh2) {
        }

        public void t(i iVar) {
            this.f4553a.registerObserver(iVar);
        }

        public void u(boolean z10) {
            if (!h()) {
                this.f4554b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void v(i iVar) {
            this.f4553a.unregisterObserver(iVar);
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
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a */
        private b f4555a = null;

        /* renamed from: b */
        private ArrayList<a> f4556b = new ArrayList<>();

        /* renamed from: c */
        private long f4557c = 120;

        /* renamed from: d */
        private long f4558d = 120;

        /* renamed from: e */
        private long f4559e = 250;

        /* renamed from: f */
        private long f4560f = 250;

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
            public int f4561a;

            /* renamed from: b */
            public int f4562b;

            /* renamed from: c */
            public int f4563c;

            /* renamed from: d */
            public int f4564d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i10) {
                View view = d0Var.f4533a;
                this.f4561a = view.getLeft();
                this.f4562b = view.getTop();
                this.f4563c = view.getRight();
                this.f4564d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i10 = d0Var.f4542j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int n10 = d0Var.n();
            int j10 = d0Var.j();
            return (n10 == -1 || j10 == -1 || n10 == j10) ? i10 : i10 | 2048;
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
            r(d0Var);
            b bVar = this.f4555a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f4556b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4556b.get(i10).a();
            }
            this.f4556b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f4557c;
        }

        public long m() {
            return this.f4560f;
        }

        public long n() {
            return this.f4559e;
        }

        public long o() {
            return this.f4558d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i10, List<Object> list) {
            return q().a(d0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f4555a = bVar;
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
            if (d0Var.f4540h != null && d0Var.f4541i == null) {
                d0Var.f4540h = null;
            }
            d0Var.f4541i = null;
            if (d0Var.I() || RecyclerView.this.V0(d0Var.f4533a) || !d0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f4533a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a */
        androidx.recyclerview.widget.b f4566a;

        /* renamed from: b */
        RecyclerView f4567b;

        /* renamed from: c */
        private final o.b f4568c;

        /* renamed from: d */
        private final o.b f4569d;

        /* renamed from: e */
        androidx.recyclerview.widget.o f4570e;

        /* renamed from: f */
        androidx.recyclerview.widget.o f4571f;

        /* renamed from: g */
        z f4572g;

        /* renamed from: h */
        boolean f4573h = false;

        /* renamed from: i */
        boolean f4574i = false;

        /* renamed from: j */
        boolean f4575j = false;

        /* renamed from: k */
        private boolean f4576k = true;

        /* renamed from: l */
        private boolean f4577l = true;

        /* renamed from: m */
        int f4578m;

        /* renamed from: n */
        boolean f4579n;

        /* renamed from: o */
        private int f4580o;

        /* renamed from: p */
        private int f4581p;

        /* renamed from: q */
        private int f4582q;

        /* renamed from: r */
        private int f4583r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements o.b {
            a() {
                o.this = r1;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return o.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements o.b {
            b() {
                o.this = r1;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return o.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i10, int i11);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f4586a;

            /* renamed from: b */
            public int f4587b;

            /* renamed from: c */
            public boolean f4588c;

            /* renamed from: d */
            public boolean f4589d;
        }

        public o() {
            a aVar = new a();
            this.f4568c = aVar;
            b bVar = new b();
            this.f4569d = bVar;
            this.f4570e = new androidx.recyclerview.widget.o(aVar);
            this.f4571f = new androidx.recyclerview.widget.o(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
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
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - e02;
            int min = Math.min(0, i10);
            int i11 = top - g02;
            int min2 = Math.min(0, i11);
            int i12 = width - o02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void f(View view, int i10, boolean z10) {
            d0 g02 = RecyclerView.g0(view);
            if (z10 || g02.v()) {
                this.f4567b.U3.b(g02);
            } else {
                this.f4567b.U3.p(g02);
            }
            p pVar = (p) view.getLayoutParams();
            if (g02.L() || g02.w()) {
                if (g02.w()) {
                    g02.K();
                } else {
                    g02.e();
                }
                this.f4566a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4567b) {
                int m10 = this.f4566a.m(view);
                if (i10 == -1) {
                    i10 = this.f4566a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4567b.indexOfChild(view) + this.f4567b.Q());
                } else if (m10 != i10) {
                    this.f4567b.f4468b4.B0(m10, i10);
                }
            } else {
                this.f4566a.a(view, i10, false);
                pVar.f4592c = true;
                z zVar = this.f4572g;
                if (zVar != null && zVar.h()) {
                    this.f4572g.k(view);
                }
            }
            if (pVar.f4593d) {
                g02.f4533a.invalidate();
                pVar.f4593d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1.c.f10332f, i10, i11);
            dVar.f4586a = obtainStyledAttributes.getInt(g1.c.f10333g, 1);
            dVar.f4587b = obtainStyledAttributes.getInt(g1.c.f10343q, 1);
            dVar.f4588c = obtainStyledAttributes.getBoolean(g1.c.f10342p, false);
            dVar.f4589d = obtainStyledAttributes.getBoolean(g1.c.f10344r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.f4567b.X3;
            P(focusedChild, rect);
            return rect.left - i10 < o02 && rect.right - i10 > e02 && rect.top - i11 < W && rect.bottom - i11 > g02;
        }

        private void v1(v vVar, int i10, View view) {
            d0 g02 = RecyclerView.g0(view);
            if (g02.J()) {
                return;
            }
            if (g02.t() && !g02.v() && !this.f4567b.f4466a4.i()) {
                q1(i10);
                vVar.C(g02);
                return;
            }
            x(i10);
            vVar.D(view);
            this.f4567b.U3.k(g02);
        }

        private static boolean w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode == 0) {
                    return true;
                } else {
                    return mode == 1073741824 && size == i10;
                }
            }
            return false;
        }

        private void y(int i10, View view) {
            this.f4566a.d(i10);
        }

        void A(RecyclerView recyclerView, v vVar) {
            this.f4574i = false;
            I0(recyclerView, vVar);
        }

        public void A0(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect k02 = this.f4567b.k0(view);
            int i12 = i10 + k02.left + k02.right;
            int i13 = i11 + k02.top + k02.bottom;
            int K = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int K2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        void A1(int i10, int i11) {
            this.f4582q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4580o = mode;
            if (mode == 0 && !RecyclerView.f4459m5) {
                this.f4582q = 0;
            }
            this.f4583r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4581p = mode2;
            if (mode2 != 0 || RecyclerView.f4459m5) {
                return;
            }
            this.f4583r = 0;
        }

        public View B(View view) {
            View S;
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null || (S = recyclerView.S(view)) == null || this.f4566a.n(S)) {
                return null;
            }
            return S;
        }

        public void B0(int i10, int i11) {
            View I = I(i10);
            if (I != null) {
                x(i10);
                h(I, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f4567b.toString());
        }

        public void B1(int i10, int i11) {
            this.f4567b.setMeasuredDimension(i10, i11);
        }

        public View C(int i10) {
            int J = J();
            for (int i11 = 0; i11 < J; i11++) {
                View I = I(i11);
                d0 g02 = RecyclerView.g0(I);
                if (g02 != null && g02.m() == i10 && !g02.J() && (this.f4567b.T4.e() || !g02.v())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                recyclerView.z0(i10);
            }
        }

        public void C1(Rect rect, int i10, int i11) {
            B1(n(i10, rect.width() + e0() + f0(), c0()), n(i11, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i10) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                recyclerView.A0(i10);
            }
        }

        void D1(int i10, int i11) {
            int J = J();
            if (J == 0) {
                this.f4567b.x(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < J; i16++) {
                View I = I(i16);
                Rect rect = this.f4567b.X3;
                P(I, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f4567b.X3.set(i13, i14, i12, i15);
            C1(this.f4567b.X3, i10, i11);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        void E1(RecyclerView recyclerView) {
            int i10;
            if (recyclerView == null) {
                this.f4567b = null;
                this.f4566a = null;
                i10 = 0;
                this.f4582q = 0;
            } else {
                this.f4567b = recyclerView;
                this.f4566a = recyclerView.f4504y;
                this.f4582q = recyclerView.getWidth();
                i10 = recyclerView.getHeight();
            }
            this.f4583r = i10;
            this.f4580o = 1073741824;
            this.f4581p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public boolean F1(View view, int i10, int i11, p pVar) {
            return view.isLayoutRequested() || !this.f4576k || !w0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) || !w0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f4591b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        public boolean H1(View view, int i10, int i11, p pVar) {
            return !this.f4576k || !w0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) || !w0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public View I(int i10) {
            androidx.recyclerview.widget.b bVar = this.f4566a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, v vVar) {
            H0(recyclerView);
        }

        public void I1(RecyclerView recyclerView, a0 a0Var, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f4566a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View J0(View view, int i10, v vVar, a0 a0Var) {
            return null;
        }

        public void J1(z zVar) {
            z zVar2 = this.f4572g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f4572g.r();
            }
            this.f4572g = zVar;
            zVar.q(this.f4567b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4567b;
            L0(recyclerView.f4473d, recyclerView.T4, accessibilityEvent);
        }

        void K1() {
            z zVar = this.f4572g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void L0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4567b.canScrollVertically(-1) && !this.f4567b.canScrollHorizontally(-1) && !this.f4567b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            g gVar = this.f4567b.f4466a4;
            if (gVar == null) {
                return;
            }
            accessibilityEvent.setItemCount(gVar.e());
        }

        public boolean L1() {
            return false;
        }

        public boolean M() {
            RecyclerView recyclerView = this.f4567b;
            return recyclerView != null && recyclerView.V3;
        }

        public void M0(androidx.core.view.accessibility.d dVar) {
            RecyclerView recyclerView = this.f4567b;
            N0(recyclerView.f4473d, recyclerView.T4, dVar);
        }

        public int N(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null || recyclerView.f4466a4 == null || !k()) {
                return 1;
            }
            return this.f4567b.f4466a4.e();
        }

        public void N0(v vVar, a0 a0Var, androidx.core.view.accessibility.d dVar) {
            if (this.f4567b.canScrollVertically(-1) || this.f4567b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.q0(true);
            }
            if (this.f4567b.canScrollVertically(1) || this.f4567b.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.q0(true);
            }
            dVar.Z(d.b.a(k0(vVar, a0Var), N(vVar, a0Var), v0(vVar, a0Var), l0(vVar, a0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(View view, androidx.core.view.accessibility.d dVar) {
            d0 g02 = RecyclerView.g0(view);
            if (g02 == null || g02.v() || this.f4566a.n(g02.f4533a)) {
                return;
            }
            RecyclerView recyclerView = this.f4567b;
            P0(recyclerView.f4473d, recyclerView.T4, view, dVar);
        }

        public void P(View view, Rect rect) {
            RecyclerView.h0(view, rect);
        }

        public void P0(v vVar, a0 a0Var, View view, androidx.core.view.accessibility.d dVar) {
            int i10 = 0;
            int h02 = l() ? h0(view) : 0;
            if (k()) {
                i10 = h0(view);
            }
            dVar.a0(d.c.a(h02, 1, i10, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i10) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4591b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4591b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4566a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W() {
            return this.f4583r;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            V0(recyclerView, i10, i11);
        }

        public int X() {
            return this.f4581p;
        }

        public void X0(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Y() {
            RecyclerView recyclerView = this.f4567b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void Y0(a0 a0Var) {
        }

        public int Z() {
            return androidx.core.view.y.B(this.f4567b);
        }

        public void Z0(v vVar, a0 a0Var, int i10, int i11) {
            this.f4567b.x(i10, i11);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f4591b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.u0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return androidx.core.view.y.C(this.f4567b);
        }

        public boolean b1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            return androidx.core.view.y.D(this.f4567b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i10) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(z zVar) {
            if (this.f4572g == zVar) {
                this.f4572g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4567b;
            return h1(recyclerView.f4473d, recyclerView.T4, i10, bundle);
        }

        public void h(View view, int i10) {
            i(view, i10, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean h1(v vVar, a0 a0Var, int i10, Bundle bundle) {
            int i11;
            int i12;
            int i13;
            int i14;
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                i13 = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.f4567b.canScrollHorizontally(1)) {
                    i14 = (o0() - e0()) - f0();
                    i11 = i13;
                    i12 = i14;
                }
                i11 = i13;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                i13 = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.f4567b.canScrollHorizontally(-1)) {
                    i14 = -((o0() - e0()) - f0());
                    i11 = i13;
                    i12 = i14;
                }
                i11 = i13;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f4567b.o1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i10, p pVar) {
            d0 g02 = RecyclerView.g0(view);
            if (g02.v()) {
                this.f4567b.U3.b(g02);
            } else {
                this.f4567b.U3.p(g02);
            }
            this.f4566a.c(view, i10, pVar, g02.v());
        }

        public boolean i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4567b;
            return j1(recyclerView.f4473d, recyclerView.T4, view, i10, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.k0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f4591b.right;
        }

        public boolean j1(v vVar, a0 a0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView == null || recyclerView.f4466a4 == null || !l()) {
                return 1;
            }
            return this.f4567b.f4466a4.e();
        }

        public void k1(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.g0(I(J)).J()) {
                    n1(J, vVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, a0 a0Var) {
            return 0;
        }

        void l1(v vVar) {
            int j10 = vVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = vVar.n(i10);
                d0 g02 = RecyclerView.g0(n10);
                if (!g02.J()) {
                    g02.G(false);
                    if (g02.x()) {
                        this.f4567b.removeDetachedView(n10, false);
                    }
                    l lVar = this.f4567b.B4;
                    if (lVar != null) {
                        lVar.j(g02);
                    }
                    g02.G(true);
                    vVar.y(n10);
                }
            }
            vVar.e();
            if (j10 > 0) {
                this.f4567b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f4591b.top;
        }

        public void m1(View view, v vVar) {
            p1(view);
            vVar.B(view);
        }

        public void n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f4591b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4567b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4567b.Z3;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i10, v vVar) {
            View I = I(i10);
            q1(i10);
            vVar.B(I);
        }

        public void o(int i10, int i11, a0 a0Var, c cVar) {
        }

        public int o0() {
            return this.f4582q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i10, c cVar) {
        }

        public int p0() {
            return this.f4580o;
        }

        public void p1(View view) {
            this.f4566a.p(view);
        }

        public int q(a0 a0Var) {
            return 0;
        }

        public boolean q0() {
            int J = J();
            for (int i10 = 0; i10 < J; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i10) {
            if (I(i10) != null) {
                this.f4566a.q(i10);
            }
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public boolean r0() {
            return this.f4574i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return s1(recyclerView, view, rect, z10, false);
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.f4575j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] L = L(view, rect);
            int i10 = L[0];
            int i11 = L[1];
            if ((!z11 || t0(recyclerView, i10, i11)) && !(i10 == 0 && i11 == 0)) {
                if (z10) {
                    recyclerView.scrollBy(i10, i11);
                } else {
                    recyclerView.l1(i10, i11);
                }
                return true;
            }
            return false;
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public void t1() {
            RecyclerView recyclerView = this.f4567b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public final boolean u0() {
            return this.f4577l;
        }

        public void u1() {
            this.f4573h = true;
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public boolean v0(v vVar, a0 a0Var) {
            return false;
        }

        public void w(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(vVar, J, I(J));
            }
        }

        public int w1(int i10, v vVar, a0 a0Var) {
            return 0;
        }

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0() {
            z zVar = this.f4572g;
            return zVar != null && zVar.h();
        }

        public void x1(int i10) {
        }

        public boolean y0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f4570e.b(view, 24579) && this.f4571f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public int y1(int i10, v vVar, a0 a0Var) {
            return 0;
        }

        void z(RecyclerView recyclerView) {
            this.f4574i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f4591b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        d0 f4590a;

        /* renamed from: b */
        final Rect f4591b = new Rect();

        /* renamed from: c */
        boolean f4592c = true;

        /* renamed from: d */
        boolean f4593d = false;

        public p(int i10, int i11) {
            super(i10, i11);
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
            return this.f4590a.m();
        }

        public boolean b() {
            return this.f4590a.y();
        }

        public boolean c() {
            return this.f4590a.v();
        }

        public boolean d() {
            return this.f4590a.t();
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: a */
        SparseArray<a> f4594a = new SparseArray<>();

        /* renamed from: b */
        private int f4595b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<d0> f4596a = new ArrayList<>();

            /* renamed from: b */
            int f4597b = 5;

            /* renamed from: c */
            long f4598c = 0;

            /* renamed from: d */
            long f4599d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = this.f4594a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f4594a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f4595b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f4594a.size(); i10++) {
                this.f4594a.valueAt(i10).f4596a.clear();
            }
        }

        void c() {
            this.f4595b--;
        }

        void d(int i10, long j10) {
            a g10 = g(i10);
            g10.f4599d = j(g10.f4599d, j10);
        }

        void e(int i10, long j10) {
            a g10 = g(i10);
            g10.f4598c = j(g10.f4598c, j10);
        }

        public d0 f(int i10) {
            a aVar = this.f4594a.get(i10);
            if (aVar == null || aVar.f4596a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f4596a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f4595b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int l10 = d0Var.l();
            ArrayList<d0> arrayList = g(l10).f4596a;
            if (this.f4594a.get(l10).f4597b <= arrayList.size()) {
                return;
            }
            d0Var.D();
            arrayList.add(d0Var);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f4599d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f4598c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* loaded from: classes.dex */
    public final class v {

        /* renamed from: a */
        final ArrayList<d0> f4600a;

        /* renamed from: d */
        private final List<d0> f4603d;

        /* renamed from: g */
        u f4606g;

        /* renamed from: b */
        ArrayList<d0> f4601b = null;

        /* renamed from: c */
        final ArrayList<d0> f4602c = new ArrayList<>();

        /* renamed from: e */
        private int f4604e = 2;

        /* renamed from: f */
        int f4605f = 2;

        public v() {
            RecyclerView.this = r2;
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f4600a = arrayList;
            this.f4603d = Collections.unmodifiableList(arrayList);
        }

        private boolean H(d0 d0Var, int i10, int i11, long j10) {
            d0Var.f4550r = RecyclerView.this;
            int l10 = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 == Long.MAX_VALUE || this.f4606g.k(l10, nanoTime, j10)) {
                RecyclerView.this.f4466a4.c(d0Var, i10);
                this.f4606g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
                b(d0Var);
                if (!RecyclerView.this.T4.e()) {
                    return true;
                }
                d0Var.f4539g = i11;
                return true;
            }
            return false;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.t0()) {
                View view = d0Var.f4533a;
                if (androidx.core.view.y.z(view) == 0) {
                    androidx.core.view.y.y0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f4467a5;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.a n10 = kVar.n();
                if (n10 instanceof k.a) {
                    ((k.a) n10).o(view);
                }
                androidx.core.view.y.o0(view, n10);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (!z10) {
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
            View view = d0Var.f4533a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a(this.f4602c.get(i10), true);
            this.f4602c.remove(i10);
        }

        public void B(View view) {
            d0 g02 = RecyclerView.g0(view);
            if (g02.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g02.w()) {
                g02.K();
            } else if (g02.L()) {
                g02.e();
            }
            C(g02);
            if (RecyclerView.this.B4 == null || g02.u()) {
                return;
            }
            RecyclerView.this.B4.j(g02);
        }

        void C(d0 d0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (d0Var.w() || d0Var.f4533a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(d0Var.w());
                sb2.append(" isAttached:");
                if (d0Var.f4533a.getParent() != null) {
                    z11 = true;
                }
                sb2.append(z11);
                sb2.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb2.toString());
            } else if (d0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.Q());
            } else if (d0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            } else {
                boolean h10 = d0Var.h();
                g gVar = RecyclerView.this.f4466a4;
                if ((gVar != null && h10 && gVar.p(d0Var)) || d0Var.u()) {
                    if (this.f4605f <= 0 || d0Var.p(526)) {
                        z10 = false;
                    } else {
                        int size = this.f4602c.size();
                        if (size >= this.f4605f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.f4461o5 && size > 0 && !RecyclerView.this.S4.d(d0Var.f4535c)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!RecyclerView.this.S4.d(this.f4602c.get(i10).f4535c)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f4602c.add(size, d0Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(d0Var, true);
                    } else {
                        z12 = false;
                    }
                    z11 = z10;
                } else {
                    z12 = false;
                }
                RecyclerView.this.U3.q(d0Var);
                if (z11 || z12 || !h10) {
                    return;
                }
                d0Var.f4550r = null;
            }
        }

        void D(View view) {
            ArrayList<d0> arrayList;
            d0 g02 = RecyclerView.g0(view);
            if (!g02.p(12) && g02.y() && !RecyclerView.this.q(g02)) {
                if (this.f4601b == null) {
                    this.f4601b = new ArrayList<>();
                }
                g02.H(this, true);
                arrayList = this.f4601b;
            } else if (g02.t() && !g02.v() && !RecyclerView.this.f4466a4.i()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            } else {
                g02.H(this, false);
                arrayList = this.f4600a;
            }
            arrayList.add(g02);
        }

        void E(u uVar) {
            u uVar2 = this.f4606g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f4606g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4606g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i10) {
            this.f4604e = i10;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01cc A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            (d0Var.f4547o ? this.f4601b : this.f4600a).remove(d0Var);
            d0Var.f4546n = null;
            d0Var.f4547o = false;
            d0Var.e();
        }

        public void K() {
            o oVar = RecyclerView.this.f4468b4;
            this.f4605f = this.f4604e + (oVar != null ? oVar.f4578m : 0);
            for (int size = this.f4602c.size() - 1; size >= 0 && this.f4602c.size() > this.f4605f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.T4.e();
            }
            int i10 = d0Var.f4535c;
            if (i10 >= 0 && i10 < RecyclerView.this.f4466a4.e()) {
                if (!RecyclerView.this.T4.e() && RecyclerView.this.f4466a4.g(d0Var.f4535c) != d0Var.l()) {
                    return false;
                }
                return !RecyclerView.this.f4466a4.i() || d0Var.k() == RecyclerView.this.f4466a4.f(d0Var.f4535c);
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.Q());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4602c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4602c.get(size);
                if (d0Var != null && (i12 = d0Var.f4535c) >= i10 && i12 < i13) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(d0 d0Var, boolean z10) {
            RecyclerView.s(d0Var);
            View view = d0Var.f4533a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f4467a5;
            if (kVar != null) {
                androidx.core.view.a n10 = kVar.n();
                androidx.core.view.y.o0(view, n10 instanceof k.a ? ((k.a) n10).n(view) : null);
            }
            if (z10) {
                g(d0Var);
            }
            d0Var.f4550r = null;
            i().i(d0Var);
        }

        public void c() {
            this.f4600a.clear();
            z();
        }

        void d() {
            int size = this.f4602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4602c.get(i10).c();
            }
            int size2 = this.f4600a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f4600a.get(i11).c();
            }
            ArrayList<d0> arrayList = this.f4601b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f4601b.get(i12).c();
                }
            }
        }

        void e() {
            this.f4600a.clear();
            ArrayList<d0> arrayList = this.f4601b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.T4.b()) {
                return !RecyclerView.this.T4.e() ? i10 : RecyclerView.this.f4502x.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.T4.b() + RecyclerView.this.Q());
        }

        void g(d0 d0Var) {
            w wVar = RecyclerView.this.f4471c4;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.f4466a4;
            if (gVar != null) {
                gVar.s(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.T4 != null) {
                recyclerView.U3.q(d0Var);
            }
        }

        d0 h(int i10) {
            int size;
            int m10;
            ArrayList<d0> arrayList = this.f4601b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    d0 d0Var = this.f4601b.get(i11);
                    if (!d0Var.L() && d0Var.m() == i10) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f4466a4.i() && (m10 = RecyclerView.this.f4502x.m(i10)) > 0 && m10 < RecyclerView.this.f4466a4.e()) {
                    long f10 = RecyclerView.this.f4466a4.f(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        d0 d0Var2 = this.f4601b.get(i12);
                        if (!d0Var2.L() && d0Var2.k() == f10) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f4606g == null) {
                this.f4606g = new u();
            }
            return this.f4606g;
        }

        int j() {
            return this.f4600a.size();
        }

        public List<d0> k() {
            return this.f4603d;
        }

        d0 l(long j10, int i10, boolean z10) {
            for (int size = this.f4600a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4600a.get(size);
                if (d0Var.k() == j10 && !d0Var.L()) {
                    if (i10 == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.T4.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    } else if (!z10) {
                        this.f4600a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f4533a, false);
                        y(d0Var.f4533a);
                    }
                }
            }
            int size2 = this.f4602c.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    d0 d0Var2 = this.f4602c.get(size2);
                    if (d0Var2.k() == j10 && !d0Var2.r()) {
                        if (i10 == d0Var2.l()) {
                            if (!z10) {
                                this.f4602c.remove(size2);
                            }
                            return d0Var2;
                        } else if (!z10) {
                            A(size2);
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            }
        }

        d0 m(int i10, boolean z10) {
            View e10;
            int size = this.f4600a.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0 d0Var = this.f4600a.get(i11);
                if (!d0Var.L() && d0Var.m() == i10 && !d0Var.t() && (RecyclerView.this.T4.f4515h || !d0Var.v())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z10 || (e10 = RecyclerView.this.f4504y.e(i10)) == null) {
                int size2 = this.f4602c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    d0 d0Var2 = this.f4602c.get(i12);
                    if (!d0Var2.t() && d0Var2.m() == i10 && !d0Var2.r()) {
                        if (!z10) {
                            this.f4602c.remove(i12);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 g02 = RecyclerView.g0(e10);
            RecyclerView.this.f4504y.s(e10);
            int m10 = RecyclerView.this.f4504y.m(e10);
            if (m10 != -1) {
                RecyclerView.this.f4504y.d(m10);
                D(e10);
                g02.b(8224);
                return g02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g02 + RecyclerView.this.Q());
        }

        View n(int i10) {
            return this.f4600a.get(i10).f4533a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).f4533a;
        }

        void s() {
            int size = this.f4602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) this.f4602c.get(i10).f4533a.getLayoutParams();
                if (pVar != null) {
                    pVar.f4592c = true;
                }
            }
        }

        void t() {
            int size = this.f4602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = this.f4602c.get(i10);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.f4466a4;
            if (gVar == null || !gVar.i()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f4602c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d0 d0Var = this.f4602c.get(i12);
                if (d0Var != null && d0Var.f4535c >= i10) {
                    d0Var.A(i11, true);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f4602c.size();
            for (int i16 = 0; i16 < size; i16++) {
                d0 d0Var = this.f4602c.get(i16);
                if (d0Var != null && (i15 = d0Var.f4535c) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        d0Var.A(i11 - i10, false);
                    } else {
                        d0Var.A(i14, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4602c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4602c.get(size);
                if (d0Var != null) {
                    int i13 = d0Var.f4535c;
                    if (i13 >= i12) {
                        d0Var.A(-i11, z10);
                    } else if (i13 >= i10) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z10) {
            c();
            i().h(gVar, gVar2, z10);
        }

        void y(View view) {
            d0 g02 = RecyclerView.g0(view);
            g02.f4546n = null;
            g02.f4547o = false;
            g02.e();
            C(g02);
        }

        void z() {
            for (int size = this.f4602c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f4602c.clear();
            if (RecyclerView.f4461o5) {
                RecyclerView.this.S4.b();
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
            recyclerView.T4.f4514g = true;
            recyclerView.P0(true);
            if (!RecyclerView.this.f4502x.p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class y extends v0.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: q */
        Parcelable f4609q;

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
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4609q = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        void c(y yVar) {
            this.f4609q = yVar.f4609q;
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4609q, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: b */
        private RecyclerView f4611b;

        /* renamed from: c */
        private o f4612c;

        /* renamed from: d */
        private boolean f4613d;

        /* renamed from: e */
        private boolean f4614e;

        /* renamed from: f */
        private View f4615f;

        /* renamed from: h */
        private boolean f4617h;

        /* renamed from: a */
        private int f4610a = -1;

        /* renamed from: g */
        private final a f4616g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private int f4618a;

            /* renamed from: b */
            private int f4619b;

            /* renamed from: c */
            private int f4620c;

            /* renamed from: d */
            private int f4621d;

            /* renamed from: e */
            private Interpolator f4622e;

            /* renamed from: f */
            private boolean f4623f;

            /* renamed from: g */
            private int f4624g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4621d = -1;
                this.f4623f = false;
                this.f4624g = 0;
                this.f4618a = i10;
                this.f4619b = i11;
                this.f4620c = i12;
                this.f4622e = interpolator;
            }

            private void e() {
                if (this.f4622e == null || this.f4620c >= 1) {
                    if (this.f4620c < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    return;
                }
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }

            boolean a() {
                return this.f4621d >= 0;
            }

            public void b(int i10) {
                this.f4621d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f4621d;
                if (i10 >= 0) {
                    this.f4621d = -1;
                    recyclerView.w0(i10);
                    this.f4623f = false;
                } else if (!this.f4623f) {
                    this.f4624g = 0;
                } else {
                    e();
                    recyclerView.Q4.f(this.f4618a, this.f4619b, this.f4620c, this.f4622e);
                    int i11 = this.f4624g + 1;
                    this.f4624g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4623f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4618a = i10;
                this.f4619b = i11;
                this.f4620c = i12;
                this.f4622e = interpolator;
                this.f4623f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            o e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f4611b.f4468b4.C(i10);
        }

        public int c() {
            return this.f4611b.f4468b4.J();
        }

        public int d(View view) {
            return this.f4611b.e0(view);
        }

        public o e() {
            return this.f4612c;
        }

        public int f() {
            return this.f4610a;
        }

        public boolean g() {
            return this.f4613d;
        }

        public boolean h() {
            return this.f4614e;
        }

        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f4611b;
            if (this.f4610a == -1 || recyclerView == null) {
                r();
            }
            if (this.f4613d && this.f4615f == null && this.f4612c != null && (a10 = a(this.f4610a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.g1((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f4613d = false;
            View view = this.f4615f;
            if (view != null) {
                if (d(view) == this.f4610a) {
                    o(this.f4615f, recyclerView.T4, this.f4616g);
                    this.f4616g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4615f = null;
                }
            }
            if (this.f4614e) {
                l(i10, i11, recyclerView.T4, this.f4616g);
                boolean a11 = this.f4616g.a();
                this.f4616g.c(recyclerView);
                if (!a11 || !this.f4614e) {
                    return;
                }
                this.f4613d = true;
                recyclerView.Q4.e();
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f4615f = view;
            }
        }

        protected abstract void l(int i10, int i11, a0 a0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i10) {
            this.f4610a = i10;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.Q4.g();
            if (this.f4617h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4611b = recyclerView;
            this.f4612c = oVar;
            int i10 = this.f4610a;
            if (i10 != -1) {
                recyclerView.T4.f4508a = i10;
                this.f4614e = true;
                this.f4613d = true;
                this.f4615f = b(f());
                m();
                this.f4611b.Q4.e();
                this.f4617h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (!this.f4614e) {
                return;
            }
            this.f4614e = false;
            n();
            this.f4611b.T4.f4508a = -1;
            this.f4615f = null;
            this.f4610a = -1;
            this.f4613d = false;
            this.f4612c.f1(this);
            this.f4612c = null;
            this.f4611b = null;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f4464r5 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g1.a.a_res_0x7f030344);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4470c = new x();
        this.f4473d = new v();
        this.U3 = new androidx.recyclerview.widget.p();
        this.W3 = new a();
        this.X3 = new Rect();
        this.Y3 = new Rect();
        this.Z3 = new RectF();
        this.f4474d4 = new ArrayList<>();
        this.f4476e4 = new ArrayList<>();
        this.f4488k4 = 0;
        this.f4497s4 = false;
        this.f4498t4 = false;
        this.f4499u4 = 0;
        this.f4500v4 = 0;
        this.f4501w4 = new k();
        this.B4 = new androidx.recyclerview.widget.c();
        this.C4 = 0;
        this.D4 = -1;
        this.N4 = Float.MIN_VALUE;
        this.O4 = Float.MIN_VALUE;
        this.P4 = true;
        this.Q4 = new c0();
        this.S4 = f4461o5 ? new e.b() : null;
        this.T4 = new a0();
        this.W4 = false;
        this.X4 = false;
        this.Y4 = new m();
        this.Z4 = false;
        this.f4472c5 = new int[2];
        this.f4477e5 = new int[2];
        this.f4479f5 = new int[2];
        this.f4481g5 = new int[2];
        this.f4483h5 = new ArrayList();
        this.f4485i5 = new b();
        this.f4487j5 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.J4 = viewConfiguration.getScaledTouchSlop();
        this.N4 = androidx.core.view.a0.b(viewConfiguration, context);
        this.O4 = androidx.core.view.a0.d(viewConfiguration, context);
        this.L4 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.M4 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.B4.v(this.Y4);
        o0();
        q0();
        p0();
        if (androidx.core.view.y.z(this) == 0) {
            androidx.core.view.y.y0(this, 1);
        }
        this.f4495q4 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = g1.c.f10332f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        }
        String string = obtainStyledAttributes.getString(g1.c.f10341o);
        if (obtainStyledAttributes.getInt(g1.c.f10335i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.V3 = obtainStyledAttributes.getBoolean(g1.c.f10334h, true);
        boolean z10 = obtainStyledAttributes.getBoolean(g1.c.f10336j, false);
        this.f4484i4 = z10;
        if (z10) {
            r0((StateListDrawable) obtainStyledAttributes.getDrawable(g1.c.f10339m), obtainStyledAttributes.getDrawable(g1.c.f10340n), (StateListDrawable) obtainStyledAttributes.getDrawable(g1.c.f10337k), obtainStyledAttributes.getDrawable(g1.c.f10338l));
        }
        obtainStyledAttributes.recycle();
        w(context, string, attributeSet, i10, 0);
        int[] iArr2 = f4457k5;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        }
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    private void B() {
        int i10 = this.f4492o4;
        this.f4492o4 = 0;
        if (i10 == 0 || !t0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.core.view.accessibility.b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void D() {
        boolean z10 = true;
        this.T4.a(1);
        R(this.T4);
        this.T4.f4517j = false;
        q1();
        this.U3.f();
        G0();
        O0();
        d1();
        a0 a0Var = this.T4;
        if (!a0Var.f4518k || !this.X4) {
            z10 = false;
        }
        a0Var.f4516i = z10;
        this.X4 = false;
        this.W4 = false;
        a0Var.f4515h = a0Var.f4519l;
        a0Var.f4513f = this.f4466a4.e();
        V(this.f4472c5);
        if (this.T4.f4518k) {
            int g10 = this.f4504y.g();
            for (int i10 = 0; i10 < g10; i10++) {
                d0 g02 = g0(this.f4504y.f(i10));
                if (!g02.J() && (!g02.t() || this.f4466a4.i())) {
                    this.U3.e(g02, this.B4.t(this.T4, g02, l.e(g02), g02.o()));
                    if (this.T4.f4516i && g02.y() && !g02.v() && !g02.J() && !g02.t()) {
                        this.U3.c(d0(g02), g02);
                    }
                }
            }
        }
        if (this.T4.f4519l) {
            e1();
            a0 a0Var2 = this.T4;
            boolean z11 = a0Var2.f4514g;
            a0Var2.f4514g = false;
            this.f4468b4.X0(this.f4473d, a0Var2);
            this.T4.f4514g = z11;
            for (int i11 = 0; i11 < this.f4504y.g(); i11++) {
                d0 g03 = g0(this.f4504y.f(i11));
                if (!g03.J() && !this.U3.i(g03)) {
                    int e10 = l.e(g03);
                    boolean p10 = g03.p(8192);
                    if (!p10) {
                        e10 |= 4096;
                    }
                    l.c t10 = this.B4.t(this.T4, g03, e10, g03.o());
                    if (p10) {
                        R0(g03, t10);
                    } else {
                        this.U3.a(g03, t10);
                    }
                }
            }
        }
        t();
        H0();
        s1(false);
        this.T4.f4512e = 2;
    }

    private void E() {
        q1();
        G0();
        this.T4.a(6);
        this.f4502x.j();
        this.T4.f4513f = this.f4466a4.e();
        a0 a0Var = this.T4;
        a0Var.f4511d = 0;
        a0Var.f4515h = false;
        this.f4468b4.X0(this.f4473d, a0Var);
        a0 a0Var2 = this.T4;
        a0Var2.f4514g = false;
        this.f4494q = null;
        a0Var2.f4518k = a0Var2.f4518k && this.B4 != null;
        a0Var2.f4512e = 4;
        H0();
        s1(false);
    }

    private void F() {
        this.T4.a(4);
        q1();
        G0();
        a0 a0Var = this.T4;
        a0Var.f4512e = 1;
        if (a0Var.f4518k) {
            for (int g10 = this.f4504y.g() - 1; g10 >= 0; g10--) {
                d0 g02 = g0(this.f4504y.f(g10));
                if (!g02.J()) {
                    long d02 = d0(g02);
                    l.c s10 = this.B4.s(this.T4, g02);
                    d0 g11 = this.U3.g(d02);
                    if (g11 != null && !g11.J()) {
                        boolean h10 = this.U3.h(g11);
                        boolean h11 = this.U3.h(g02);
                        if (!h10 || g11 != g02) {
                            l.c n10 = this.U3.n(g11);
                            this.U3.d(g02, s10);
                            l.c m10 = this.U3.m(g02);
                            if (n10 == null) {
                                l0(d02, g02, g11);
                            } else {
                                n(g11, g02, n10, m10, h10, h11);
                            }
                        }
                    }
                    this.U3.d(g02, s10);
                }
            }
            this.U3.o(this.f4487j5);
        }
        this.f4468b4.l1(this.f4473d);
        a0 a0Var2 = this.T4;
        a0Var2.f4510c = a0Var2.f4513f;
        this.f4497s4 = false;
        this.f4498t4 = false;
        a0Var2.f4518k = false;
        a0Var2.f4519l = false;
        this.f4468b4.f4573h = false;
        ArrayList<d0> arrayList = this.f4473d.f4601b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f4468b4;
        if (oVar.f4579n) {
            oVar.f4578m = 0;
            oVar.f4579n = false;
            this.f4473d.K();
        }
        this.f4468b4.Y0(this.T4);
        H0();
        s1(false);
        this.U3.f();
        int[] iArr = this.f4472c5;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        S0();
        b1();
    }

    private void J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D4) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.D4 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.H4 = x10;
            this.F4 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.I4 = y10;
            this.G4 = y10;
        }
    }

    private boolean L(MotionEvent motionEvent) {
        s sVar = this.f4478f4;
        if (sVar == null) {
            if (motionEvent.getAction() != 0) {
                return U(motionEvent);
            }
            return false;
        }
        sVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4478f4 = null;
        }
        return true;
    }

    private boolean N0() {
        return this.B4 != null && this.f4468b4.L1();
    }

    private void O0() {
        boolean z10;
        if (this.f4497s4) {
            this.f4502x.u();
            if (this.f4498t4) {
                this.f4468b4.S0(this);
            }
        }
        if (N0()) {
            this.f4502x.s();
        } else {
            this.f4502x.j();
        }
        boolean z11 = false;
        boolean z12 = this.W4 || this.X4;
        this.T4.f4518k = this.f4486j4 && this.B4 != null && ((z10 = this.f4497s4) || z12 || this.f4468b4.f4573h) && (!z10 || this.f4466a4.i());
        a0 a0Var = this.T4;
        if (a0Var.f4518k && z12 && !this.f4497s4 && N0()) {
            z11 = true;
        }
        a0Var.f4519l = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r1 = r6.f4503x4
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            androidx.core.widget.e.c(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.O()
            android.widget.EdgeEffect r1 = r6.f4506z4
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
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.P()
            android.widget.EdgeEffect r9 = r6.f4505y4
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.e.c(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.M()
            android.widget.EdgeEffect r9 = r6.A4
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.e.c(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            androidx.core.view.y.f0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q0(float, float, float, float):void");
    }

    private void S0() {
        View findViewById;
        if (!this.P4 || this.f4466a4 == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f4463q5 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f4504y.n(focusedChild)) {
                    return;
                }
            } else if (this.f4504y.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        d0 Z = (this.T4.f4521n == -1 || !this.f4466a4.i()) ? null : Z(this.T4.f4521n);
        if (Z != null && !this.f4504y.n(Z.f4533a) && Z.f4533a.hasFocusable()) {
            view = Z.f4533a;
        } else if (this.f4504y.g() > 0) {
            view = X();
        }
        if (view == null) {
            return;
        }
        int i10 = this.T4.f4522o;
        if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
            view = findViewById;
        }
        view.requestFocus();
    }

    private void T0() {
        boolean z10;
        EdgeEffect edgeEffect = this.f4503x4;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f4503x4.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f4505y4;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f4505y4.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4506z4;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f4506z4.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A4;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.A4.isFinished();
        }
        if (z10) {
            androidx.core.view.y.f0(this);
        }
    }

    private boolean U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4476e4.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = this.f4476e4.get(i10);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.f4478f4 = sVar;
                return true;
            }
        }
        return false;
    }

    private void V(int[] iArr) {
        int g10 = this.f4504y.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            d0 g02 = g0(this.f4504y.f(i12));
            if (!g02.J()) {
                int m10 = g02.m();
                if (m10 < i10) {
                    i10 = m10;
                }
                if (m10 > i11) {
                    i11 = m10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView W = W(viewGroup.getChildAt(i10));
            if (W != null) {
                return W;
            }
        }
        return null;
    }

    private View X() {
        d0 Y;
        a0 a0Var = this.T4;
        int i10 = a0Var.f4520m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = a0Var.b();
        for (int i11 = i10; i11 < b10; i11++) {
            d0 Y2 = Y(i11);
            if (Y2 == null) {
                break;
            } else if (Y2.f4533a.hasFocusable()) {
                return Y2.f4533a;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (Y = Y(min)) == null) {
                return null;
            }
            if (Y.f4533a.hasFocusable()) {
                return Y.f4533a;
            }
        }
    }

    private void a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.X3.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f4592c) {
                Rect rect = pVar.f4591b;
                Rect rect2 = this.X3;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.X3);
            offsetRectIntoDescendantCoords(view, this.X3);
        }
        this.f4468b4.s1(this, view, this.X3, !this.f4486j4, view2 == null);
    }

    private void b1() {
        a0 a0Var = this.T4;
        a0Var.f4521n = -1L;
        a0Var.f4520m = -1;
        a0Var.f4522o = -1;
    }

    private void c1() {
        VelocityTracker velocityTracker = this.E4;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    private void d1() {
        d0 d0Var = null;
        View focusedChild = (!this.P4 || !hasFocus() || this.f4466a4 == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = T(focusedChild);
        }
        if (d0Var == null) {
            b1();
            return;
        }
        this.T4.f4521n = this.f4466a4.i() ? d0Var.k() : -1L;
        this.T4.f4520m = this.f4497s4 ? -1 : d0Var.v() ? d0Var.f4536d : d0Var.j();
        this.T4.f4522o = i0(d0Var.f4533a);
    }

    private void g(d0 d0Var) {
        View view = d0Var.f4533a;
        boolean z10 = view.getParent() == this;
        this.f4473d.J(f0(view));
        if (d0Var.x()) {
            this.f4504y.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f4504y;
        if (!z10) {
            bVar.b(view, true);
        } else {
            bVar.k(view);
        }
    }

    public static d0 g0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f4590a;
    }

    private androidx.core.view.o getScrollingChildHelper() {
        if (this.f4475d5 == null) {
            this.f4475d5 = new androidx.core.view.o(this);
        }
        return this.f4475d5;
    }

    static void h0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f4591b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int i0(View view) {
        int id2;
        loop0: while (true) {
            id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id2;
    }

    private void i1(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.f4466a4;
        if (gVar2 != null) {
            gVar2.v(this.f4470c);
            this.f4466a4.o(this);
        }
        if (!z10 || z11) {
            U0();
        }
        this.f4502x.u();
        g gVar3 = this.f4466a4;
        this.f4466a4 = gVar;
        if (gVar != null) {
            gVar.t(this.f4470c);
            gVar.k(this);
        }
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.E0(gVar3, this.f4466a4);
        }
        this.f4473d.x(gVar3, this.f4466a4, z10);
        this.T4.f4514g = true;
    }

    private String j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void l0(long j10, d0 d0Var, d0 d0Var2) {
        int g10 = this.f4504y.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 g02 = g0(this.f4504y.f(i10));
            if (g02 != d0Var && d0(g02) == j10) {
                g gVar = this.f4466a4;
                if (gVar == null || !gVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g02 + " \n View Holder 2:" + d0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g02 + " \n View Holder 2:" + d0Var + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + Q());
    }

    private void n(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z10, boolean z11) {
        d0Var.G(false);
        if (z10) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z11) {
                g(d0Var2);
            }
            d0Var.f4540h = d0Var2;
            g(d0Var);
            this.f4473d.J(d0Var);
            d0Var2.G(false);
            d0Var2.f4541i = d0Var;
        }
        if (this.B4.b(d0Var, d0Var2, cVar, cVar2)) {
            M0();
        }
    }

    private boolean n0() {
        int g10 = this.f4504y.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 g02 = g0(this.f4504y.f(i10));
            if (g02 != null && !g02.J() && g02.y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void p0() {
        if (androidx.core.view.y.A(this) == 0) {
            androidx.core.view.y.z0(this, 8);
        }
    }

    private void q0() {
        this.f4504y = new androidx.recyclerview.widget.b(new e());
    }

    private void r() {
        c1();
        setScrollState(0);
    }

    static void s(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f4534b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == d0Var.f4533a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                d0Var.f4534b = null;
                return;
            }
        }
    }

    private boolean v0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || S(view2) == null) {
            return false;
        }
        if (view == null || S(view) == null) {
            return true;
        }
        this.X3.set(0, 0, view.getWidth(), view.getHeight());
        this.Y3.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.X3);
        offsetDescendantRectToMyCoords(view2, this.Y3);
        char c10 = 65535;
        int i12 = this.f4468b4.Z() == 1 ? -1 : 1;
        Rect rect = this.X3;
        int i13 = rect.left;
        Rect rect2 = this.Y3;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 <= 0);
        } else if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 >= 0);
        } else if (i10 == 17) {
            return i11 < 0;
        } else if (i10 == 33) {
            return c10 < 0;
        } else if (i10 == 66) {
            return i11 > 0;
        } else if (i10 == 130) {
            return c10 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i10 + Q());
        }
    }

    private void v1() {
        this.Q4.g();
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.K1();
        }
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String j02 = j0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(j02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f4464r5);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + j02, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + j02, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + j02, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + j02, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j02, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j02, e16);
            }
        }
    }

    private boolean y(int i10, int i11) {
        V(this.f4472c5);
        int[] iArr = this.f4472c5;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    void A(View view) {
        d0 g02 = g0(view);
        F0(view);
        g gVar = this.f4466a4;
        if (gVar != null && g02 != null) {
            gVar.r(g02);
        }
        List<q> list = this.f4496r4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4496r4.get(size).b(view);
            }
        }
    }

    public void A0(int i10) {
        int g10 = this.f4504y.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f4504y.f(i11).offsetTopAndBottom(i10);
        }
    }

    void B0(int i10, int i11) {
        int j10 = this.f4504y.j();
        for (int i12 = 0; i12 < j10; i12++) {
            d0 g02 = g0(this.f4504y.i(i12));
            if (g02 != null && !g02.J() && g02.f4535c >= i10) {
                g02.A(i11, false);
                this.T4.f4514g = true;
            }
        }
        this.f4473d.u(i10, i11);
        requestLayout();
    }

    void C() {
        String str;
        if (this.f4466a4 == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f4468b4 != null) {
            a0 a0Var = this.T4;
            a0Var.f4517j = false;
            if (a0Var.f4512e == 1) {
                D();
            } else if (!this.f4502x.q() && this.f4468b4.o0() == getWidth() && this.f4468b4.W() == getHeight()) {
                this.f4468b4.z1(this);
                F();
                return;
            }
            this.f4468b4.z1(this);
            E();
            F();
            return;
        } else {
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    void C0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f4504y.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            d0 g02 = g0(this.f4504y.i(i16));
            if (g02 != null && (i15 = g02.f4535c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    g02.A(i11 - i10, false);
                } else {
                    g02.A(i14, false);
                }
                this.T4.f4514g = true;
            }
        }
        this.f4473d.v(i10, i11);
        requestLayout();
    }

    void D0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f4504y.j();
        for (int i13 = 0; i13 < j10; i13++) {
            d0 g02 = g0(this.f4504y.i(i13));
            if (g02 != null && !g02.J()) {
                int i14 = g02.f4535c;
                if (i14 >= i12) {
                    g02.A(-i11, z10);
                } else if (i14 >= i10) {
                    g02.i(i10 - 1, -i11, z10);
                }
                this.T4.f4514g = true;
            }
        }
        this.f4473d.w(i10, i11, z10);
        requestLayout();
    }

    public void E0(View view) {
    }

    public void F0(View view) {
    }

    public boolean G(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void G0() {
        this.f4499u4++;
    }

    public final void H(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void H0() {
        I0(true);
    }

    void I(int i10) {
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.e1(i10);
        }
        K0(i10);
        t tVar = this.U4;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List<t> list = this.V4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.V4.get(size).a(this, i10);
            }
        }
    }

    public void I0(boolean z10) {
        int i10 = this.f4499u4 - 1;
        this.f4499u4 = i10;
        if (i10 < 1) {
            this.f4499u4 = 0;
            if (!z10) {
                return;
            }
            B();
            K();
        }
    }

    void J(int i10, int i11) {
        this.f4500v4++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        L0(i10, i11);
        t tVar = this.U4;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List<t> list = this.V4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.V4.get(size).b(this, i10, i11);
            }
        }
        this.f4500v4--;
    }

    void K() {
        int i10;
        for (int size = this.f4483h5.size() - 1; size >= 0; size--) {
            d0 d0Var = this.f4483h5.get(size);
            if (d0Var.f4533a.getParent() == this && !d0Var.J() && (i10 = d0Var.f4549q) != -1) {
                androidx.core.view.y.y0(d0Var.f4533a, i10);
                d0Var.f4549q = -1;
            }
        }
        this.f4483h5.clear();
    }

    public void K0(int i10) {
    }

    public void L0(int i10, int i11) {
    }

    void M() {
        int i10;
        int i11;
        if (this.A4 != null) {
            return;
        }
        EdgeEffect a10 = this.f4501w4.a(this, 3);
        this.A4 = a10;
        if (this.V3) {
            i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i11 = getMeasuredWidth();
            i10 = getMeasuredHeight();
        }
        a10.setSize(i11, i10);
    }

    void M0() {
        if (this.Z4 || !this.f4480g4) {
            return;
        }
        androidx.core.view.y.g0(this, this.f4485i5);
        this.Z4 = true;
    }

    void N() {
        int i10;
        int i11;
        if (this.f4503x4 != null) {
            return;
        }
        EdgeEffect a10 = this.f4501w4.a(this, 0);
        this.f4503x4 = a10;
        if (this.V3) {
            i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i11 = getMeasuredHeight();
            i10 = getMeasuredWidth();
        }
        a10.setSize(i11, i10);
    }

    void O() {
        int i10;
        int i11;
        if (this.f4506z4 != null) {
            return;
        }
        EdgeEffect a10 = this.f4501w4.a(this, 2);
        this.f4506z4 = a10;
        if (this.V3) {
            i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i11 = getMeasuredHeight();
            i10 = getMeasuredWidth();
        }
        a10.setSize(i11, i10);
    }

    void P() {
        int i10;
        int i11;
        if (this.f4505y4 != null) {
            return;
        }
        EdgeEffect a10 = this.f4501w4.a(this, 1);
        this.f4505y4 = a10;
        if (this.V3) {
            i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i11 = getMeasuredWidth();
            i10 = getMeasuredHeight();
        }
        a10.setSize(i11, i10);
    }

    void P0(boolean z10) {
        this.f4498t4 = z10 | this.f4498t4;
        this.f4497s4 = true;
        y0();
    }

    String Q() {
        return " " + super.toString() + ", adapter:" + this.f4466a4 + ", layout:" + this.f4468b4 + ", context:" + getContext();
    }

    final void R(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.f4523p = 0;
            a0Var.f4524q = 0;
            return;
        }
        OverScroller overScroller = this.Q4.f4528q;
        a0Var.f4523p = overScroller.getFinalX() - overScroller.getCurrX();
        a0Var.f4524q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    void R0(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.T4.f4516i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.U3.c(d0(d0Var), d0Var);
        }
        this.U3.e(d0Var, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View S(android.view.View r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S(android.view.View):android.view.View");
    }

    public d0 T(View view) {
        View S = S(view);
        if (S == null) {
            return null;
        }
        return f0(S);
    }

    public void U0() {
        l lVar = this.B4;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.k1(this.f4473d);
            this.f4468b4.l1(this.f4473d);
        }
        this.f4473d.c();
    }

    boolean V0(View view) {
        q1();
        boolean r10 = this.f4504y.r(view);
        if (r10) {
            d0 g02 = g0(view);
            this.f4473d.J(g02);
            this.f4473d.C(g02);
        }
        s1(!r10);
        return r10;
    }

    public void W0(n nVar) {
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4474d4.remove(nVar);
        if (this.f4474d4.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        x0();
        requestLayout();
    }

    public void X0(s sVar) {
        this.f4476e4.remove(sVar);
        if (this.f4478f4 == sVar) {
            this.f4478f4 = null;
        }
    }

    public d0 Y(int i10) {
        d0 d0Var = null;
        if (this.f4497s4) {
            return null;
        }
        int j10 = this.f4504y.j();
        for (int i11 = 0; i11 < j10; i11++) {
            d0 g02 = g0(this.f4504y.i(i11));
            if (g02 != null && !g02.v() && c0(g02) == i10) {
                if (!this.f4504y.n(g02.f4533a)) {
                    return g02;
                }
                d0Var = g02;
            }
        }
        return d0Var;
    }

    public void Y0(t tVar) {
        List<t> list = this.V4;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public d0 Z(long j10) {
        g gVar = this.f4466a4;
        d0 d0Var = null;
        if (gVar != null && gVar.i()) {
            int j11 = this.f4504y.j();
            for (int i10 = 0; i10 < j11; i10++) {
                d0 g02 = g0(this.f4504y.i(i10));
                if (g02 != null && !g02.v() && g02.k() == j10) {
                    if (!this.f4504y.n(g02.f4533a)) {
                        return g02;
                    }
                    d0Var = g02;
                }
            }
        }
        return d0Var;
    }

    void Z0() {
        d0 d0Var;
        int g10 = this.f4504y.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.f4504y.f(i10);
            d0 f02 = f0(f10);
            if (f02 != null && (d0Var = f02.f4541i) != null) {
                View view = d0Var.f4533a;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            N();
            if (this.f4503x4.isFinished()) {
                this.f4503x4.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            O();
            if (this.f4506z4.isFinished()) {
                this.f4506z4.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            P();
            if (this.f4505y4.isFinished()) {
                this.f4505y4.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            M();
            if (this.A4.isFinished()) {
                this.A4.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        androidx.core.view.y.f0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.d0 a0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f4504y
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f4504y
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = g0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4535c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f4504y
            android.view.View r4 = r3.f4533a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        o oVar = this.f4468b4;
        if (oVar == null || !oVar.F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public boolean b0(int i10, int i11) {
        o oVar = this.f4468b4;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f4490m4) {
            return false;
        } else {
            boolean k10 = oVar.k();
            boolean l10 = this.f4468b4.l();
            if (!k10 || Math.abs(i10) < this.L4) {
                i10 = 0;
            }
            if (!l10 || Math.abs(i11) < this.L4) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = i10;
            float f11 = i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z10 = k10 || l10;
                dispatchNestedFling(f10, f11, z10);
                r rVar = this.K4;
                if (rVar != null && rVar.a(i10, i11)) {
                    return true;
                }
                if (z10) {
                    if (l10) {
                        boolean z11 = k10 ? 1 : 0;
                        char c10 = k10 ? 1 : 0;
                        k10 = z11 | true;
                    }
                    int i12 = k10 ? 1 : 0;
                    int i13 = k10 ? 1 : 0;
                    r1(i12, 1);
                    int i14 = this.M4;
                    int max = Math.max(-i14, Math.min(i10, i14));
                    int i15 = this.M4;
                    this.Q4.c(max, Math.max(-i15, Math.min(i11, i15)));
                    return true;
                }
            }
            return false;
        }
    }

    int c0(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.f4502x.e(d0Var.f4535c);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f4468b4.m((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.k()) {
            return this.f4468b4.q(this.T4);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.k()) {
            return this.f4468b4.r(this.T4);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.k()) {
            return this.f4468b4.s(this.T4);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.l()) {
            return this.f4468b4.t(this.T4);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.l()) {
            return this.f4468b4.u(this.T4);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f4468b4;
        if (oVar != null && oVar.l()) {
            return this.f4468b4.v(this.T4);
        }
        return 0;
    }

    long d0(d0 d0Var) {
        return this.f4466a4.i() ? d0Var.k() : d0Var.f4535c;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
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
        boolean z10;
        int i10;
        float f10;
        super.draw(canvas);
        int size = this.f4474d4.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f4474d4.get(i11).i(canvas, this, this.T4);
        }
        EdgeEffect edgeEffect = this.f4503x4;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.V3 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4503x4;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4505y4;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.V3) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4505y4;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4506z4;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.V3 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4506z4;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.A4;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.V3) {
                f10 = (-getWidth()) + getPaddingRight();
                i10 = (-getHeight()) + getPaddingBottom();
            } else {
                f10 = -getWidth();
                i10 = -getHeight();
            }
            canvas.translate(f10, i10);
            EdgeEffect edgeEffect8 = this.A4;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.B4 == null || this.f4474d4.size() <= 0 || !this.B4.p()) {
            z12 = z10;
        }
        if (z12) {
            androidx.core.view.y.f0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public int e0(View view) {
        d0 g02 = g0(view);
        if (g02 != null) {
            return g02.m();
        }
        return -1;
    }

    void e1() {
        int j10 = this.f4504y.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 g02 = g0(this.f4504y.i(i10));
            if (!g02.J()) {
                g02.E();
            }
        }
    }

    public d0 f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean f1(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        v();
        if (this.f4466a4 != null) {
            int[] iArr = this.f4481g5;
            iArr[0] = 0;
            iArr[1] = 0;
            g1(i10, i11, iArr);
            int[] iArr2 = this.f4481g5;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i15 = i17;
            i14 = i16;
            i13 = i10 - i16;
            i12 = i11 - i17;
        } else {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (!this.f4474d4.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4481g5;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i14, i15, i13, i12, this.f4477e5, 0, iArr3);
        int[] iArr4 = this.f4481g5;
        int i18 = i13 - iArr4[0];
        int i19 = i12 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i20 = this.H4;
        int[] iArr5 = this.f4477e5;
        this.H4 = i20 - iArr5[0];
        this.I4 -= iArr5[1];
        int[] iArr6 = this.f4479f5;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.m.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i18, motionEvent.getY(), i19);
            }
            u(i10, i11);
        }
        if (i14 != 0 || i15 != 0) {
            J(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i15 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View Q0 = this.f4468b4.Q0(view, i10);
        if (Q0 != null) {
            return Q0;
        }
        boolean z11 = true;
        boolean z12 = this.f4466a4 != null && this.f4468b4 != null && !u0() && !this.f4490m4;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z12 || !(i10 == 2 || i10 == 1)) {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus != null || !z12) {
                view2 = findNextFocus;
            } else {
                v();
                if (S(view) == null) {
                    return null;
                }
                q1();
                view2 = this.f4468b4.J0(view, i10, this.f4473d, this.T4);
                s1(false);
            }
        } else {
            if (this.f4468b4.l()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f4462p5) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f4468b4.k()) {
                int i12 = (this.f4468b4.Z() == 1) ^ (i10 == 2) ? 66 : 17;
                if (focusFinder.findNextFocus(this, view, i12) != null) {
                    z11 = false;
                }
                if (f4462p5) {
                    i10 = i12;
                }
                z10 = z11;
            }
            if (z10) {
                v();
                if (S(view) == null) {
                    return null;
                }
                q1();
                this.f4468b4.J0(view, i10, this.f4473d, this.T4);
                s1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        }
        if (view2 == null || view2.hasFocusable()) {
            return v0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        } else {
            a1(view2, null);
            return view;
        }
    }

    void g1(int i10, int i11, int[] iArr) {
        q1();
        G0();
        androidx.core.os.i.a("RV Scroll");
        R(this.T4);
        int w12 = i10 != 0 ? this.f4468b4.w1(i10, this.f4473d, this.T4) : 0;
        int y12 = i11 != 0 ? this.f4468b4.y1(i11, this.f4473d, this.T4) : 0;
        androidx.core.os.i.b();
        Z0();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = w12;
            iArr[1] = y12;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f4468b4;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f4468b4;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f4468b4;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f4466a4;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f4468b4;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        j jVar = this.f4469b5;
        return jVar == null ? super.getChildDrawingOrder(i10, i11) : jVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.V3;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f4467a5;
    }

    public k getEdgeEffectFactory() {
        return this.f4501w4;
    }

    public l getItemAnimator() {
        return this.B4;
    }

    public int getItemDecorationCount() {
        return this.f4474d4.size();
    }

    public o getLayoutManager() {
        return this.f4468b4;
    }

    public int getMaxFlingVelocity() {
        return this.M4;
    }

    public int getMinFlingVelocity() {
        return this.L4;
    }

    public long getNanoTime() {
        if (f4461o5) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.K4;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.P4;
    }

    public u getRecycledViewPool() {
        return this.f4473d.i();
    }

    public int getScrollState() {
        return this.C4;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public void h1(int i10) {
        if (this.f4490m4) {
            return;
        }
        u1();
        o oVar = this.f4468b4;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        oVar.x1(i10);
        awakenScrollBars();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i10) {
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4474d4.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f4474d4.add(nVar);
        } else {
            this.f4474d4.add(i10, nVar);
        }
        x0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4480g4;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4490m4;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(q qVar) {
        if (this.f4496r4 == null) {
            this.f4496r4 = new ArrayList();
        }
        this.f4496r4.add(qVar);
    }

    boolean j1(d0 d0Var, int i10) {
        if (!u0()) {
            androidx.core.view.y.y0(d0Var.f4533a, i10);
            return true;
        }
        d0Var.f4549q = i10;
        this.f4483h5.add(d0Var);
        return false;
    }

    public void k(s sVar) {
        this.f4476e4.add(sVar);
    }

    Rect k0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f4592c) {
            return pVar.f4591b;
        }
        if (this.T4.e() && (pVar.b() || pVar.d())) {
            return pVar.f4591b;
        }
        Rect rect = pVar.f4591b;
        rect.set(0, 0, 0, 0);
        int size = this.f4474d4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X3.set(0, 0, 0, 0);
            this.f4474d4.get(i10).e(this.X3, view, this, this.T4);
            int i11 = rect.left;
            Rect rect2 = this.X3;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f4592c = false;
        return rect;
    }

    boolean k1(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (u0()) {
            int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
            if (a10 != 0) {
                i10 = a10;
            }
            this.f4492o4 |= i10;
            return true;
        }
        return false;
    }

    public void l(t tVar) {
        if (this.V4 == null) {
            this.V4 = new ArrayList();
        }
        this.V4.add(tVar);
    }

    public void l1(int i10, int i11) {
        m1(i10, i11, null);
    }

    void m(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.B4.a(d0Var, cVar, cVar2)) {
            M0();
        }
    }

    public boolean m0() {
        return !this.f4486j4 || this.f4497s4 || this.f4502x.p();
    }

    public void m1(int i10, int i11, Interpolator interpolator) {
        n1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void n1(int i10, int i11, Interpolator interpolator, int i12) {
        o1(i10, i11, interpolator, i12, false);
    }

    void o(d0 d0Var, l.c cVar, l.c cVar2) {
        g(d0Var);
        d0Var.G(false);
        if (this.B4.c(d0Var, cVar, cVar2)) {
            M0();
        }
    }

    void o0() {
        this.f4502x = new androidx.recyclerview.widget.a(new f());
    }

    void o1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.f4468b4;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4490m4) {
        } else {
            int i13 = 0;
            if (!oVar.k()) {
                i10 = 0;
            }
            if (!this.f4468b4.l()) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return;
            }
            if (!(i12 == Integer.MIN_VALUE || i12 > 0)) {
                scrollBy(i10, i11);
                return;
            }
            if (z10) {
                if (i10 != 0) {
                    i13 = 1;
                }
                if (i11 != 0) {
                    i13 |= 2;
                }
                r1(i13, 1);
            }
            this.Q4.f(i10, i11, i12, interpolator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4499u4 = 0;
        boolean z10 = true;
        this.f4480g4 = true;
        if (!this.f4486j4 || isLayoutRequested()) {
            z10 = false;
        }
        this.f4486j4 = z10;
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.z(this);
        }
        this.Z4 = false;
        if (f4461o5) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f4759y;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.R4 = eVar;
            if (eVar == null) {
                this.R4 = new androidx.recyclerview.widget.e();
                Display v10 = androidx.core.view.y.v(this);
                float f10 = 60.0f;
                if (!isInEditMode() && v10 != null) {
                    float refreshRate = v10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.R4;
                eVar2.f4762q = 1.0E9f / f10;
                threadLocal.set(eVar2);
            }
            this.R4.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.B4;
        if (lVar != null) {
            lVar.k();
        }
        u1();
        this.f4480g4 = false;
        o oVar = this.f4468b4;
        if (oVar != null) {
            oVar.A(this, this.f4473d);
        }
        this.f4483h5.clear();
        removeCallbacks(this.f4485i5);
        this.U3.j();
        if (!f4461o5 || (eVar = this.R4) == null) {
            return;
        }
        eVar.j(this);
        this.R4 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4474d4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4474d4.get(i10).g(canvas, this, this.T4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4468b4
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4490m4
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4468b4
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4468b4
            boolean r3 = r3.k()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4468b4
            boolean r3 = r3.l()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4468b4
            boolean r3 = r3.k()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.N4
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.O4
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.f1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.f4490m4) {
            return false;
        }
        this.f4478f4 = null;
        if (U(motionEvent)) {
            r();
            return true;
        }
        o oVar = this.f4468b4;
        if (oVar == null) {
            return false;
        }
        boolean k10 = oVar.k();
        boolean l10 = this.f4468b4.l();
        if (this.E4 == null) {
            this.E4 = VelocityTracker.obtain();
        }
        this.E4.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4491n4) {
                this.f4491n4 = false;
            }
            this.D4 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.H4 = x10;
            this.F4 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.I4 = y10;
            this.G4 = y10;
            if (this.C4 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.f4479f5;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l10) {
                boolean z10 = k10 ? 1 : 0;
                char c10 = k10 ? 1 : 0;
                k10 = z10 | true;
            }
            int i10 = k10 ? 1 : 0;
            int i11 = k10 ? 1 : 0;
            r1(i10, 0);
        } else if (actionMasked == 1) {
            this.E4.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.D4);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.D4 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.C4 != 1) {
                int i12 = x11 - this.F4;
                int i13 = y11 - this.G4;
                if (!k10 || Math.abs(i12) <= this.J4) {
                    objArr = null;
                } else {
                    this.H4 = x11;
                    objArr = 1;
                }
                if (l10 && Math.abs(i13) > this.J4) {
                    this.I4 = y11;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.D4 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.H4 = x12;
            this.F4 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.I4 = y12;
            this.G4 = y12;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.C4 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.i.a("RV OnLayout");
        C();
        androidx.core.os.i.b();
        this.f4486j4 = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVar = this.f4468b4;
        if (oVar == null) {
            x(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4468b4.Z0(this.f4473d, this.T4, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (z10 || this.f4466a4 == null) {
                return;
            }
            if (this.T4.f4512e == 1) {
                D();
            }
            this.f4468b4.A1(i10, i11);
            this.T4.f4517j = true;
            E();
            this.f4468b4.D1(i10, i11);
            if (!this.f4468b4.G1()) {
                return;
            }
            this.f4468b4.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.T4.f4517j = true;
            E();
            this.f4468b4.D1(i10, i11);
        } else if (this.f4482h4) {
            this.f4468b4.Z0(this.f4473d, this.T4, i10, i11);
        } else {
            if (this.f4493p4) {
                q1();
                G0();
                O0();
                H0();
                a0 a0Var = this.T4;
                if (a0Var.f4519l) {
                    a0Var.f4515h = true;
                } else {
                    this.f4502x.j();
                    this.T4.f4515h = false;
                }
                this.f4493p4 = false;
                s1(false);
            } else if (this.T4.f4519l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.f4466a4;
            if (gVar != null) {
                this.T4.f4513f = gVar.e();
            } else {
                this.T4.f4513f = 0;
            }
            q1();
            this.f4468b4.Z0(this.f4473d, this.T4, i10, i11);
            s1(false);
            this.T4.f4515h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f4494q = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.f4468b4;
        if (oVar == null || (parcelable2 = this.f4494q.f4609q) == null) {
            return;
        }
        oVar.c1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f4494q;
        if (yVar2 != null) {
            yVar.c(yVar2);
        } else {
            o oVar = this.f4468b4;
            yVar.f4609q = oVar != null ? oVar.d1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        s0();
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
        if (u0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        } else if (this.f4500v4 <= 0) {
        } else {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + Q()));
        }
    }

    public void p1(int i10) {
        if (this.f4490m4) {
            return;
        }
        o oVar = this.f4468b4;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.I1(this, this.T4, i10);
        }
    }

    boolean q(d0 d0Var) {
        l lVar = this.B4;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    void q1() {
        int i10 = this.f4488k4 + 1;
        this.f4488k4 = i10;
        if (i10 != 1 || this.f4490m4) {
            return;
        }
        this.f4489l4 = false;
    }

    void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(g1.b.a_res_0x7f06009b), resources.getDimensionPixelSize(g1.b.c_res_0x7f06009d), resources.getDimensionPixelOffset(g1.b.b_res_0x7f06009c));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
    }

    public boolean r1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        d0 g02 = g0(view);
        if (g02 != null) {
            if (g02.x()) {
                g02.f();
            } else if (!g02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g02 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4468b4.b1(this, this.T4, view, view2) && view2 != null) {
            a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4468b4.r1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f4476e4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4476e4.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4488k4 != 0 || this.f4490m4) {
            this.f4489l4 = true;
        } else {
            super.requestLayout();
        }
    }

    void s0() {
        this.A4 = null;
        this.f4505y4 = null;
        this.f4506z4 = null;
        this.f4503x4 = null;
    }

    void s1(boolean z10) {
        if (this.f4488k4 < 1) {
            this.f4488k4 = 1;
        }
        if (!z10 && !this.f4490m4) {
            this.f4489l4 = false;
        }
        if (this.f4488k4 == 1) {
            if (z10 && this.f4489l4 && !this.f4490m4 && this.f4468b4 != null && this.f4466a4 != null) {
                C();
            }
            if (!this.f4490m4) {
                this.f4489l4 = false;
            }
        }
        this.f4488k4--;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.f4468b4;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4490m4) {
        } else {
            boolean k10 = oVar.k();
            boolean l10 = this.f4468b4.l();
            if (!k10 && !l10) {
                return;
            }
            if (!k10) {
                i10 = 0;
            }
            if (!l10) {
                i11 = 0;
            }
            f1(i10, i11, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f4467a5 = kVar;
        androidx.core.view.y.o0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        i1(gVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.f4469b5) {
            return;
        }
        this.f4469b5 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.V3) {
            s0();
        }
        this.V3 = z10;
        super.setClipToPadding(z10);
        if (this.f4486j4) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.h.g(kVar);
        this.f4501w4 = kVar;
        s0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f4482h4 = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.B4;
        if (lVar2 != null) {
            lVar2.k();
            this.B4.v(null);
        }
        this.B4 = lVar;
        if (lVar != null) {
            lVar.v(this.Y4);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f4473d.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f4468b4) {
            return;
        }
        u1();
        if (this.f4468b4 != null) {
            l lVar = this.B4;
            if (lVar != null) {
                lVar.k();
            }
            this.f4468b4.k1(this.f4473d);
            this.f4468b4.l1(this.f4473d);
            this.f4473d.c();
            if (this.f4480g4) {
                this.f4468b4.A(this, this.f4473d);
            }
            this.f4468b4.E1(null);
            this.f4468b4 = null;
        } else {
            this.f4473d.c();
        }
        this.f4504y.o();
        this.f4468b4 = oVar;
        if (oVar != null) {
            if (oVar.f4567b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f4567b.Q());
            }
            oVar.E1(this);
            if (this.f4480g4) {
                this.f4468b4.z(this);
            }
        }
        this.f4473d.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(r rVar) {
        this.K4 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.U4 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.P4 = z10;
    }

    public void setRecycledViewPool(u uVar) {
        this.f4473d.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.f4471c4 = wVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.C4) {
            return;
        }
        this.C4 = i10;
        if (i10 != 2) {
            v1();
        }
        I(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.J4 = i11;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.J4 = i11;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f4473d.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f4490m4) {
            p("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f4490m4 = true;
                this.f4491n4 = true;
                u1();
                return;
            }
            this.f4490m4 = false;
            if (this.f4489l4 && this.f4468b4 != null && this.f4466a4 != null) {
                requestLayout();
            }
            this.f4489l4 = false;
        }
    }

    void t() {
        int j10 = this.f4504y.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 g02 = g0(this.f4504y.i(i10));
            if (!g02.J()) {
                g02.c();
            }
        }
        this.f4473d.d();
    }

    boolean t0() {
        AccessibilityManager accessibilityManager = this.f4495q4;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void t1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    void u(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f4503x4;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f4503x4.onRelease();
            z10 = this.f4503x4.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4506z4;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f4506z4.onRelease();
            z10 |= this.f4506z4.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4505y4;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f4505y4.onRelease();
            z10 |= this.f4505y4.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A4;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.A4.onRelease();
            z10 |= this.A4.isFinished();
        }
        if (z10) {
            androidx.core.view.y.f0(this);
        }
    }

    public boolean u0() {
        return this.f4499u4 > 0;
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    void v() {
        if (!this.f4486j4 || this.f4497s4) {
            androidx.core.os.i.a("RV FullInvalidate");
            C();
            androidx.core.os.i.b();
        } else if (!this.f4502x.p()) {
        } else {
            if (this.f4502x.o(4) && !this.f4502x.o(11)) {
                androidx.core.os.i.a("RV PartialInvalidate");
                q1();
                G0();
                this.f4502x.s();
                if (!this.f4489l4) {
                    if (n0()) {
                        C();
                    } else {
                        this.f4502x.i();
                    }
                }
                s1(true);
                H0();
            } else if (!this.f4502x.p()) {
                return;
            } else {
                androidx.core.os.i.a("RV FullInvalidate");
                C();
            }
            androidx.core.os.i.b();
        }
    }

    void w0(int i10) {
        if (this.f4468b4 == null) {
            return;
        }
        setScrollState(2);
        this.f4468b4.x1(i10);
        awakenScrollBars();
    }

    void w1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f4504y.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f4504y.i(i14);
            d0 g02 = g0(i15);
            if (g02 != null && !g02.J() && (i12 = g02.f4535c) >= i10 && i12 < i13) {
                g02.b(2);
                g02.a(obj);
                ((p) i15.getLayoutParams()).f4592c = true;
            }
        }
        this.f4473d.M(i10, i11);
    }

    void x(int i10, int i11) {
        setMeasuredDimension(o.n(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.y.D(this)), o.n(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.y.C(this)));
    }

    void x0() {
        int j10 = this.f4504y.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((p) this.f4504y.i(i10).getLayoutParams()).f4592c = true;
        }
        this.f4473d.s();
    }

    void y0() {
        int j10 = this.f4504y.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 g02 = g0(this.f4504y.i(i10));
            if (g02 != null && !g02.J()) {
                g02.b(6);
            }
        }
        x0();
        this.f4473d.t();
    }

    void z(View view) {
        d0 g02 = g0(view);
        E0(view);
        g gVar = this.f4466a4;
        if (gVar != null && g02 != null) {
            gVar.q(g02);
        }
        List<q> list = this.f4496r4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4496r4.get(size).a(view);
            }
        }
    }

    public void z0(int i10) {
        int g10 = this.f4504y.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f4504y.f(i11).offsetLeftAndRight(i10);
        }
    }
}
