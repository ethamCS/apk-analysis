package b.i.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import b.g.l.t;
import java.util.Arrays;
/* loaded from: classes.dex */
public class d {
    private static final Interpolator x = new a();

    /* renamed from: a */
    private int f2616a;

    /* renamed from: b */
    private int f2617b;

    /* renamed from: d */
    private float[] f2619d;

    /* renamed from: e */
    private float[] f2620e;

    /* renamed from: f */
    private float[] f2621f;

    /* renamed from: g */
    private float[] f2622g;

    /* renamed from: h */
    private int[] f2623h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;

    /* renamed from: c */
    private int f2618c = -1;
    private final Runnable w = new b();

    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.K(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(int i) {
            return i;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i, int i2) {
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
        }

        public void i(View view, int i) {
        }

        public abstract void j(int i);

        public abstract void k(View view, int i, int i2, int i3, int i4);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i);
    }

    private d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup != null) {
            if (cVar == null) {
                throw new IllegalArgumentException("Callback may not be null");
            }
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.p = i;
            this.o = i;
            this.f2617b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, x);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private boolean D(int i) {
        if (!C(i)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    private void G() {
        this.l.computeCurrentVelocity(1000, this.m);
        p(g(this.l.getXVelocity(this.f2618c), this.n, this.m), g(this.l.getYVelocity(this.f2618c), this.n, this.m));
    }

    private void H(float f2, float f3, int i) {
        int i2 = 1;
        if (!c(f2, f3, i, 1)) {
            i2 = 0;
        }
        if (c(f3, f2, i, 4)) {
            i2 |= 4;
        }
        if (c(f2, f3, i, 2)) {
            i2 |= 2;
        }
        if (c(f3, f2, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            this.s.f(i2, i);
        }
    }

    private void I(float f2, float f3, int i) {
        s(i);
        float[] fArr = this.f2619d;
        this.f2621f[i] = f2;
        fArr[i] = f2;
        float[] fArr2 = this.f2620e;
        this.f2622g[i] = f3;
        fArr2[i] = f3;
        this.f2623h[i] = y((int) f2, (int) f3);
        this.k |= 1 << i;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (D(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2621f[pointerId] = x2;
                this.f2622g[pointerId] = y;
            }
        }
    }

    private boolean c(float f2, float f3, int i, int i2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2623h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f2617b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.s.g(i2)) {
            return (this.i[i] & i2) == 0 && abs > ((float) this.f2617b);
        }
        int[] iArr = this.j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    private boolean f(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.d(view) > 0;
        boolean z2 = this.s.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2617b) : z2 && Math.abs(f3) > ((float) this.f2617b);
        }
        int i = this.f2617b;
        return (f2 * f2) + (f3 * f3) > ((float) (i * i));
    }

    private float g(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private void i() {
        float[] fArr = this.f2619d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2620e, 0.0f);
        Arrays.fill(this.f2621f, 0.0f);
        Arrays.fill(this.f2622g, 0.0f);
        Arrays.fill(this.f2623h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void j(int i) {
        if (this.f2619d == null || !C(i)) {
            return;
        }
        this.f2619d[i] = 0.0f;
        this.f2620e[i] = 0.0f;
        this.f2621f[i] = 0.0f;
        this.f2622g[i] = 0.0f;
        this.f2623h[i] = 0;
        this.i[i] = 0;
        this.j[i] = 0;
        this.k = (~(1 << i)) & this.k;
    }

    private int k(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = width / 2;
        float q = f2 + (q(Math.min(1.0f, Math.abs(i) / width)) * f2);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(q / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int h2 = h(i3, (int) this.n, (int) this.m);
        int h3 = h(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h2);
        int abs4 = Math.abs(h3);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h2 != 0) {
            f3 = abs3;
            f2 = i5;
        } else {
            f3 = abs;
            f2 = i6;
        }
        float f6 = f3 / f2;
        if (h3 != 0) {
            f5 = abs4;
            f4 = i5;
        } else {
            f5 = abs2;
            f4 = i6;
        }
        return (int) ((k(i, h2, this.s.d(view)) * f6) + (k(i2, h3, this.s.e(view)) * (f5 / f4)));
    }

    public static d n(ViewGroup viewGroup, float f2, c cVar) {
        d o = o(viewGroup, cVar);
        o.f2617b = (int) (o.f2617b * (1.0f / f2));
        return o;
    }

    public static d o(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f2, float f3) {
        this.u = true;
        this.s.l(this.t, f2, f3);
        this.u = false;
        if (this.f2616a == 1) {
            K(0);
        }
    }

    private float q(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void r(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i3 != 0) {
            i = this.s.a(this.t, i, i3);
            t.T(this.t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.s.b(this.t, i2, i4);
            t.U(this.t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.s.k(this.t, i5, i6, i5 - left, i6 - top);
    }

    private void s(int i) {
        float[] fArr = this.f2619d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2620e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2621f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2622g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2623h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2619d = fArr2;
            this.f2620e = fArr3;
            this.f2621f = fArr4;
            this.f2622g = fArr5;
            this.f2623h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean u(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.r.abortAnimation();
            K(0);
            return false;
        }
        this.r.startScroll(left, top, i5, i6, l(this.t, i5, i6, i3, i4));
        K(2);
        return true;
    }

    private int y(int i, int i2) {
        int i3 = i < this.v.getLeft() + this.o ? 1 : 0;
        if (i2 < this.v.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.v.getRight() - this.o) {
            i3 |= 2;
        }
        return i2 > this.v.getBottom() - this.o ? i3 | 8 : i3;
    }

    public int A() {
        return this.f2616a;
    }

    public boolean B(int i, int i2) {
        return E(this.t, i, i2);
    }

    public boolean C(int i) {
        return ((1 << i) & this.k) != 0;
    }

    public boolean E(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t = t((int) x2, (int) y);
            I(x2, y, pointerId);
            R(t, pointerId);
            int i3 = this.f2623h[pointerId];
            int i4 = this.q;
            if ((i3 & i4) == 0) {
                return;
            }
            this.s.h(i3 & i4, pointerId);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f2616a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (D(pointerId2)) {
                            float x3 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x3 - this.f2619d[pointerId2];
                            float f3 = y2 - this.f2620e[pointerId2];
                            H(f2, f3, pointerId2);
                            if (this.f2616a != 1) {
                                View t2 = t((int) x3, (int) y2);
                                if (f(t2, f2, f3) && R(t2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else if (!D(this.f2618c)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2618c);
                    float x4 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2621f;
                    int i5 = this.f2618c;
                    int i6 = (int) (x4 - fArr[i5]);
                    int i7 = (int) (y3 - this.f2622g[i5]);
                    r(this.t.getLeft() + i6, this.t.getTop() + i7, i6, i7);
                }
                J(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x5 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    I(x5, y4, pointerId3);
                    if (this.f2616a != 0) {
                        if (!B((int) x5, (int) y4)) {
                            return;
                        }
                        R(this.t, pointerId3);
                        return;
                    }
                    R(t((int) x5, (int) y4), pointerId3);
                    int i8 = this.f2623h[pointerId3];
                    int i9 = this.q;
                    if ((i8 & i9) == 0) {
                        return;
                    }
                    this.s.h(i8 & i9, pointerId3);
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f2616a == 1 && pointerId4 == this.f2618c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f2618c) {
                                View t3 = t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.t;
                                if (t3 == view && R(view, pointerId5)) {
                                    i = this.f2618c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            G();
                        }
                    }
                    j(pointerId4);
                    return;
                }
            } else if (this.f2616a == 1) {
                p(0.0f, 0.0f);
            }
        } else if (this.f2616a == 1) {
            G();
        }
        a();
    }

    void K(int i) {
        this.v.removeCallbacks(this.w);
        if (this.f2616a != i) {
            this.f2616a = i;
            this.s.j(i);
            if (this.f2616a != 0) {
                return;
            }
            this.t = null;
        }
    }

    public void L(int i) {
        this.o = i;
    }

    public void M(int i) {
        this.q = i;
    }

    public void N(float f2) {
        this.n = f2;
    }

    public boolean O(int i, int i2) {
        if (this.u) {
            return u(i, i2, (int) this.l.getXVelocity(this.f2618c), (int) this.l.getYVelocity(this.f2618c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r12 != r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean P(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.b.d.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i, int i2) {
        this.t = view;
        this.f2618c = -1;
        boolean u = u(i, i2, 0, 0);
        if (!u && this.f2616a == 0 && this.t != null) {
            this.t = null;
        }
        return u;
    }

    boolean R(View view, int i) {
        if (view == this.t && this.f2618c == i) {
            return true;
        }
        if (view == null || !this.s.m(view, i)) {
            return false;
        }
        this.f2618c = i;
        b(view, i);
        return true;
    }

    public void a() {
        this.f2618c = -1;
        i();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f2618c = i;
            this.s.i(view, i);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean d(int i) {
        int length = this.f2619d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i, int i2) {
        if (!C(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f2 = this.f2621f[i2] - this.f2619d[i2];
        float f3 = this.f2622g[i2] - this.f2620e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2617b) : z2 && Math.abs(f3) > ((float) this.f2617b);
        }
        int i3 = this.f2617b;
        return (f2 * f2) + (f3 * f3) > ((float) (i3 * i3));
    }

    public boolean m(boolean z) {
        if (this.f2616a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                t.T(this.t, left);
            }
            if (top != 0) {
                t.U(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.k(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    K(0);
                }
            }
        }
        return this.f2616a == 2;
    }

    public View t(int i, int i2) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            this.s.c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.t;
    }

    public int w() {
        return this.p;
    }

    public int x() {
        return this.o;
    }

    public int z() {
        return this.f2617b;
    }
}
