package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class i extends RecyclerView.n implements RecyclerView.q {
    private g A;
    private Rect C;
    private long D;

    /* renamed from: d */
    float f1764d;

    /* renamed from: e */
    float f1765e;

    /* renamed from: f */
    private float f1766f;

    /* renamed from: g */
    private float f1767g;

    /* renamed from: h */
    float f1768h;
    float i;
    private float j;
    private float k;
    f m;
    int o;
    private int q;
    RecyclerView r;
    VelocityTracker t;
    private List<RecyclerView.d0> u;
    private List<Integer> v;
    b.g.l.d z;

    /* renamed from: a */
    final List<View> f1761a = new ArrayList();

    /* renamed from: b */
    private final float[] f1762b = new float[2];

    /* renamed from: c */
    RecyclerView.d0 f1763c = null;
    int l = -1;
    private int n = 0;
    List<h> p = new ArrayList();
    final Runnable s = new a();
    private RecyclerView.j w = null;
    View x = null;
    int y = -1;
    private final RecyclerView.s B = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if (iVar.f1763c == null || !iVar.E()) {
                return;
            }
            i iVar2 = i.this;
            RecyclerView.d0 d0Var = iVar2.f1763c;
            if (d0Var != null) {
                iVar2.z(d0Var);
            }
            i iVar3 = i.this;
            iVar3.r.removeCallbacks(iVar3.s);
            b.g.l.t.a0(i.this.r, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.s {
        b() {
            i.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h s;
            i.this.z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                i.this.l = motionEvent.getPointerId(0);
                i.this.f1764d = motionEvent.getX();
                i.this.f1765e = motionEvent.getY();
                i.this.A();
                i iVar = i.this;
                if (iVar.f1763c == null && (s = iVar.s(motionEvent)) != null) {
                    i iVar2 = i.this;
                    iVar2.f1764d -= s.i;
                    iVar2.f1765e -= s.j;
                    iVar2.r(s.f1784e, true);
                    if (i.this.f1761a.remove(s.f1784e.f1551a)) {
                        i iVar3 = i.this;
                        iVar3.m.c(iVar3.r, s.f1784e);
                    }
                    i.this.F(s.f1784e, s.f1785f);
                    i iVar4 = i.this;
                    iVar4.L(motionEvent, iVar4.o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                i iVar5 = i.this;
                iVar5.l = -1;
                iVar5.F(null, 0);
            } else {
                int i = i.this.l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    i.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = i.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return i.this.f1763c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            i.this.z.a(motionEvent);
            VelocityTracker velocityTracker = i.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (i.this.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(i.this.l);
            if (findPointerIndex >= 0) {
                i.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            i iVar = i.this;
            RecyclerView.d0 d0Var = iVar.f1763c;
            if (d0Var == null) {
                return;
            }
            int i = 0;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex < 0) {
                        return;
                    }
                    iVar.L(motionEvent, iVar.o, findPointerIndex);
                    i.this.z(d0Var);
                    i iVar2 = i.this;
                    iVar2.r.removeCallbacks(iVar2.s);
                    i.this.s.run();
                    i.this.r.invalidate();
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    i iVar3 = i.this;
                    if (pointerId != iVar3.l) {
                        return;
                    }
                    if (actionIndex == 0) {
                        i = 1;
                    }
                    iVar3.l = motionEvent.getPointerId(i);
                    i iVar4 = i.this;
                    iVar4.L(motionEvent, iVar4.o, actionIndex);
                    return;
                } else {
                    VelocityTracker velocityTracker2 = iVar.t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            i.this.F(null, 0);
            i.this.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z) {
            if (!z) {
                return;
            }
            i.this.F(null, 0);
        }
    }

    /* loaded from: classes.dex */
    public class c extends h {
        final /* synthetic */ int n;
        final /* synthetic */ RecyclerView.d0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.d0 d0Var, int i, int i2, float f2, float f3, float f4, float f5, int i3, RecyclerView.d0 d0Var2) {
            super(d0Var, i, i2, f2, f3, f4, f5);
            i.this = r10;
            this.n = i3;
            this.o = d0Var2;
        }

        @Override // androidx.recyclerview.widget.i.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.k) {
                return;
            }
            if (this.n <= 0) {
                i iVar = i.this;
                iVar.m.c(iVar.r, this.o);
            } else {
                i.this.f1761a.add(this.o.f1551a);
                this.f1787h = true;
                int i = this.n;
                if (i > 0) {
                    i.this.B(this, i);
                }
            }
            i iVar2 = i.this;
            View view = iVar2.x;
            View view2 = this.o.f1551a;
            if (view != view2) {
                return;
            }
            iVar2.D(view2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ h f1771b;

        /* renamed from: c */
        final /* synthetic */ int f1772c;

        d(h hVar, int i) {
            i.this = r1;
            this.f1771b = hVar;
            this.f1772c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = i.this.r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f1771b;
            if (hVar.k || hVar.f1784e.j() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = i.this.r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !i.this.x()) {
                i.this.m.B(this.f1771b.f1784e, this.f1772c);
            } else {
                i.this.r.post(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements RecyclerView.j {
        e() {
            i.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i, int i2) {
            i iVar = i.this;
            View view = iVar.x;
            if (view == null) {
                return i2;
            }
            int i3 = iVar.y;
            if (i3 == -1) {
                i3 = iVar.r.indexOfChild(view);
                i.this.y = i3;
            }
            return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b */
        private static final Interpolator f1775b = new a();

        /* renamed from: c */
        private static final Interpolator f1776c = new b();

        /* renamed from: a */
        private int f1777a = -1;

        /* loaded from: classes.dex */
        static class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* loaded from: classes.dex */
        static class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        private int i(RecyclerView recyclerView) {
            if (this.f1777a == -1) {
                this.f1777a = recyclerView.getResources().getDimensionPixelSize(b.n.b.d_res_0x7f07009c);
            }
            return this.f1777a;
        }

        public static int s(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int t(int i, int i2) {
            int s = s(0, i2 | i);
            return s(2, i) | s(1, i2) | s;
        }

        public void A(RecyclerView.d0 d0Var, int i) {
            if (d0Var != null) {
                k.f1791a.d(d0Var.f1551a);
            }
        }

        public abstract void B(RecyclerView.d0 d0Var, int i);

        public boolean a(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        public RecyclerView.d0 b(RecyclerView.d0 d0Var, List<RecyclerView.d0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + d0Var.f1551a.getWidth();
            int height = i2 + d0Var.f1551a.getHeight();
            int left2 = i - d0Var.f1551a.getLeft();
            int top2 = i2 - d0Var.f1551a.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.d0 d0Var3 = list.get(i4);
                if (left2 > 0 && (right = d0Var3.f1551a.getRight() - width) < 0 && d0Var3.f1551a.getRight() > d0Var.f1551a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = d0Var3.f1551a.getLeft() - i) > 0 && d0Var3.f1551a.getLeft() < d0Var.f1551a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = d0Var3.f1551a.getTop() - i2) > 0 && d0Var3.f1551a.getTop() < d0Var.f1551a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = d0Var3.f1551a.getBottom() - height) < 0 && d0Var3.f1551a.getBottom() > d0Var.f1551a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs;
                }
            }
            return d0Var2;
        }

        public void c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            k.f1791a.a(d0Var.f1551a);
        }

        public int d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        final int f(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return d(k(recyclerView, d0Var), b.g.l.t.y(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i, float f2, float f3) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        public float l(float f2) {
            return f2;
        }

        public float m(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public float n(float f2) {
            return f2;
        }

        boolean o(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (f(recyclerView, d0Var) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f2 = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * i(recyclerView) * f1776c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= 2000) {
                f2 = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f1775b.getInterpolation(f2));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean q() {
            return true;
        }

        public abstract boolean r();

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f2, float f3, int i, boolean z) {
            k.f1791a.c(canvas, recyclerView, d0Var.f1551a, f2, f3, i, z);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f2, float f3, int i, boolean z) {
            k.f1791a.b(canvas, recyclerView, d0Var.f1551a, f2, f3, i, z);
        }

        void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                hVar.e();
                int save = canvas.save();
                u(canvas, recyclerView, hVar.f1784e, hVar.i, hVar.j, hVar.f1785f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                u(canvas, recyclerView, d0Var, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
        }

        void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                int save = canvas.save();
                v(canvas, recyclerView, hVar.f1784e, hVar.i, hVar.j, hVar.f1785f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                v(canvas, recyclerView, d0Var, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                h hVar2 = list.get(i3);
                boolean z2 = hVar2.l;
                if (z2 && !hVar2.f1787h) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        public void z(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(d0Var.f1551a, d0Var2.f1551a, i3, i4);
                return;
            }
            if (layoutManager.l()) {
                if (layoutManager.R(d0Var2.f1551a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m1(i2);
                }
                if (layoutManager.U(d0Var2.f1551a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m1(i2);
                }
            }
            if (!layoutManager.m()) {
                return;
            }
            if (layoutManager.V(d0Var2.f1551a) <= recyclerView.getPaddingTop()) {
                recyclerView.m1(i2);
            }
            if (layoutManager.P(d0Var2.f1551a) < recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                return;
            }
            recyclerView.m1(i2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        private boolean f1778a = true;

        g() {
            i.this = r1;
        }

        void a() {
            this.f1778a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.d0 i0;
            if (!this.f1778a || (t = i.this.t(motionEvent)) == null || (i0 = i.this.r.i0(t)) == null) {
                return;
            }
            i iVar = i.this;
            if (!iVar.m.o(iVar.r, i0)) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            int i = i.this.l;
            if (pointerId != i) {
                return;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            i iVar2 = i.this;
            iVar2.f1764d = x;
            iVar2.f1765e = y;
            iVar2.i = 0.0f;
            iVar2.f1768h = 0.0f;
            if (!iVar2.m.r()) {
                return;
            }
            i.this.F(i0, 2);
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a */
        final float f1780a;

        /* renamed from: b */
        final float f1781b;

        /* renamed from: c */
        final float f1782c;

        /* renamed from: d */
        final float f1783d;

        /* renamed from: e */
        final RecyclerView.d0 f1784e;

        /* renamed from: f */
        final int f1785f;

        /* renamed from: g */
        private final ValueAnimator f1786g;

        /* renamed from: h */
        boolean f1787h;
        float i;
        float j;
        boolean k = false;
        boolean l = false;
        private float m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
                h.this = r1;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.d0 d0Var, int i, int i2, float f2, float f3, float f4, float f5) {
            this.f1785f = i2;
            this.f1784e = d0Var;
            this.f1780a = f2;
            this.f1781b = f3;
            this.f1782c = f4;
            this.f1783d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1786g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(d0Var.f1551a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f1786g.cancel();
        }

        public void b(long j) {
            this.f1786g.setDuration(j);
        }

        public void c(float f2) {
            this.m = f2;
        }

        public void d() {
            this.f1784e.G(false);
            this.f1786g.start();
        }

        public void e() {
            float f2 = this.f1780a;
            float f3 = this.f1782c;
            this.i = f2 == f3 ? this.f1784e.f1551a.getTranslationX() : f2 + (this.m * (f3 - f2));
            float f4 = this.f1781b;
            float f5 = this.f1783d;
            this.j = f4 == f5 ? this.f1784e.f1551a.getTranslationY() : f4 + (this.m * (f5 - f4));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.f1784e.G(true);
            }
            this.l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0030i extends f {

        /* renamed from: d */
        private int f1789d;

        /* renamed from: e */
        private int f1790e;

        public AbstractC0030i(int i, int i2) {
            this.f1789d = i2;
            this.f1790e = i;
        }

        public int C(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f1790e;
        }

        public int D(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f1789d;
        }

        @Override // androidx.recyclerview.widget.i.f
        public int k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return f.t(C(recyclerView, d0Var), D(recyclerView, d0Var));
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void b(View view, View view2, int i, int i2);
    }

    public i(f fVar) {
        this.m = fVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.h(this);
        this.r.k(this.B);
        this.r.j(this);
        I();
    }

    private void I() {
        this.A = new g();
        this.z = new b.g.l.d(this.r.getContext(), this.A);
    }

    private void J() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    private int K(RecyclerView.d0 d0Var) {
        if (this.n == 2) {
            return 0;
        }
        int k = this.m.k(this.r, d0Var);
        int d2 = (this.m.d(k, b.g.l.t.y(this.r)) & 65280) >> 8;
        if (d2 == 0) {
            return 0;
        }
        int i = (k & 65280) >> 8;
        if (Math.abs(this.f1768h) > Math.abs(this.i)) {
            int n = n(d0Var, d2);
            if (n > 0) {
                return (i & n) == 0 ? f.e(n, b.g.l.t.y(this.r)) : n;
            }
            int p = p(d0Var, d2);
            if (p > 0) {
                return p;
            }
        } else {
            int p2 = p(d0Var, d2);
            if (p2 > 0) {
                return p2;
            }
            int n2 = n(d0Var, d2);
            if (n2 > 0) {
                return (i & n2) == 0 ? f.e(n2, b.g.l.t.y(this.r)) : n2;
            }
        }
        return 0;
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.w == null) {
            this.w = new e();
        }
        this.r.setChildDrawingOrderCallback(this.w);
    }

    private int n(RecyclerView.d0 d0Var, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.f1768h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                f fVar = this.m;
                float f2 = this.f1767g;
                fVar.n(f2);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2) {
                    f fVar2 = this.m;
                    float f3 = this.f1766f;
                    fVar2.l(f3);
                    if (abs >= f3 && abs > Math.abs(yVelocity)) {
                        return i2;
                    }
                }
            }
            float width = this.r.getWidth() * this.m.m(d0Var);
            if ((i & i3) != 0 && Math.abs(this.f1768h) > width) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private int p(RecyclerView.d0 d0Var, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                f fVar = this.m;
                float f2 = this.f1767g;
                fVar.n(f2);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3) {
                    f fVar2 = this.m;
                    float f3 = this.f1766f;
                    fVar2.l(f3);
                    if (abs >= f3 && abs > Math.abs(xVelocity)) {
                        return i2;
                    }
                }
            }
            float height = this.r.getHeight() * this.m.m(d0Var);
            if ((i & i3) != 0 && Math.abs(this.i) > height) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private void q() {
        this.r.a1(this);
        this.r.c1(this.B);
        this.r.b1(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.m.c(this.r, this.p.get(0).f1784e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        C();
        J();
    }

    private List<RecyclerView.d0> u(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List<RecyclerView.d0> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int h2 = this.m.h();
        int round = Math.round(this.j + this.f1768h) - h2;
        int round2 = Math.round(this.k + this.i) - h2;
        int i = h2 * 2;
        int width = d0Var2.f1551a.getWidth() + round + i;
        int height = d0Var2.f1551a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int K = layoutManager.K();
        int i4 = 0;
        while (i4 < K) {
            View J = layoutManager.J(i4);
            if (J != d0Var2.f1551a && J.getBottom() >= round2 && J.getTop() <= height && J.getRight() >= round && J.getLeft() <= width) {
                RecyclerView.d0 i0 = this.r.i0(J);
                if (this.m.a(this.r, this.f1763c, i0)) {
                    int abs = Math.abs(i2 - ((J.getLeft() + J.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((J.getTop() + J.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.v.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.u.add(i6, i0);
                    this.v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            d0Var2 = d0Var;
        }
        return this.u;
    }

    private RecyclerView.d0 v(MotionEvent motionEvent) {
        View t;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int i = this.l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f1764d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f1765e);
        int i2 = this.q;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.l()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.m()) || (t = t(motionEvent)) == null) {
            return null;
        }
        return this.r.i0(t);
    }

    private void w(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.f1768h) - this.f1763c.f1551a.getLeft();
        } else {
            fArr[0] = this.f1763c.f1551a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.f1763c.f1551a.getTop();
        } else {
            fArr[1] = this.f1763c.f1551a.getTranslationY();
        }
    }

    private static boolean y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    void B(h hVar, int i) {
        this.r.post(new d(hVar, i));
    }

    void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w == null) {
                return;
            }
            this.r.setChildDrawingOrderCallback(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(androidx.recyclerview.widget.RecyclerView.d0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.F(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    public void H(RecyclerView.d0 d0Var) {
        if (!this.m.o(this.r, d0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (d0Var.f1551a.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            A();
            this.i = 0.0f;
            this.f1768h = 0.0f;
            F(d0Var, 2);
        }
    }

    void L(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.f1764d;
        this.f1768h = f2;
        this.i = y - this.f1765e;
        if ((i & 4) == 0) {
            this.f1768h = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.f1768h = Math.min(0.0f, this.f1768h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(View view) {
        D(view);
        RecyclerView.d0 i0 = this.r.i0(view);
        if (i0 == null) {
            return;
        }
        RecyclerView.d0 d0Var = this.f1763c;
        if (d0Var != null && i0 == d0Var) {
            F(null, 0);
            return;
        }
        r(i0, false);
        if (!this.f1761a.remove(i0.f1551a)) {
            return;
        }
        this.m.c(this.r, i0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        this.y = -1;
        if (this.f1763c != null) {
            w(this.f1762b);
            float[] fArr = this.f1762b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.w(canvas, recyclerView, this.f1763c, this.p, this.n, f3, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        if (this.f1763c != null) {
            w(this.f1762b);
            float[] fArr = this.f1762b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.x(canvas, recyclerView, this.f1763c, this.p, this.n, f3, f2);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.r = recyclerView;
        if (recyclerView == null) {
            return;
        }
        Resources resources = recyclerView.getResources();
        this.f1766f = resources.getDimension(b.n.b.f_res_0x7f07009e);
        this.f1767g = resources.getDimension(b.n.b.e_res_0x7f07009d);
        G();
    }

    void o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.d0 v;
        int f2;
        if (this.f1763c != null || i != 2 || this.n == 2 || !this.m.q() || this.r.getScrollState() == 1 || (v = v(motionEvent)) == null || (f2 = (this.m.f(this.r, v) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f3 = x - this.f1764d;
        float f4 = y - this.f1765e;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        int i3 = this.q;
        if (abs < i3 && abs2 < i3) {
            return;
        }
        if (abs > abs2) {
            if (f3 < 0.0f && (f2 & 4) == 0) {
                return;
            }
            if (f3 > 0.0f && (f2 & 8) == 0) {
                return;
            }
        } else if (f4 < 0.0f && (f2 & 1) == 0) {
            return;
        } else {
            if (f4 > 0.0f && (f2 & 2) == 0) {
                return;
            }
        }
        this.i = 0.0f;
        this.f1768h = 0.0f;
        this.l = motionEvent.getPointerId(0);
        F(v, 1);
    }

    void r(RecyclerView.d0 d0Var, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.f1784e == d0Var) {
                hVar.k |= z;
                if (!hVar.l) {
                    hVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    h s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View t = t(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.f1784e.f1551a == t) {
                return hVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.d0 d0Var = this.f1763c;
        if (d0Var != null) {
            View view = d0Var.f1551a;
            if (y(view, x, y, this.j + this.f1768h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            View view2 = hVar.f1784e.f1551a;
            if (y(view2, x, y, hVar.i, hVar.j)) {
                return view2;
            }
        }
        return this.r.S(x, y);
    }

    boolean x() {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (!this.p.get(i).l) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.d0 d0Var) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float j2 = this.m.j(d0Var);
            int i = (int) (this.j + this.f1768h);
            int i2 = (int) (this.k + this.i);
            if (Math.abs(i2 - d0Var.f1551a.getTop()) < d0Var.f1551a.getHeight() * j2 && Math.abs(i - d0Var.f1551a.getLeft()) < d0Var.f1551a.getWidth() * j2) {
                return;
            }
            List<RecyclerView.d0> u = u(d0Var);
            if (u.size() == 0) {
                return;
            }
            RecyclerView.d0 b2 = this.m.b(d0Var, u, i, i2);
            if (b2 == null) {
                this.u.clear();
                this.v.clear();
                return;
            }
            int j3 = b2.j();
            int j4 = d0Var.j();
            if (!this.m.y(this.r, d0Var, b2)) {
                return;
            }
            this.m.z(this.r, d0Var, j4, b2, j3, i, i2);
        }
    }
}
