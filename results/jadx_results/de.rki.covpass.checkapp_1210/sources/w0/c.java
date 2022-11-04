package w0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.y;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c {

    /* renamed from: x */
    private static final Interpolator f24636x = new a();

    /* renamed from: a */
    private int f24637a;

    /* renamed from: b */
    private int f24638b;

    /* renamed from: d */
    private float[] f24640d;

    /* renamed from: e */
    private float[] f24641e;

    /* renamed from: f */
    private float[] f24642f;

    /* renamed from: g */
    private float[] f24643g;

    /* renamed from: h */
    private int[] f24644h;

    /* renamed from: i */
    private int[] f24645i;

    /* renamed from: j */
    private int[] f24646j;

    /* renamed from: k */
    private int f24647k;

    /* renamed from: l */
    private VelocityTracker f24648l;

    /* renamed from: m */
    private float f24649m;

    /* renamed from: n */
    private float f24650n;

    /* renamed from: o */
    private int f24651o;

    /* renamed from: p */
    private final int f24652p;

    /* renamed from: q */
    private int f24653q;

    /* renamed from: r */
    private OverScroller f24654r;

    /* renamed from: s */
    private final AbstractC0436c f24655s;

    /* renamed from: t */
    private View f24656t;

    /* renamed from: u */
    private boolean f24657u;

    /* renamed from: v */
    private final ViewGroup f24658v;

    /* renamed from: c */
    private int f24639c = -1;

    /* renamed from: w */
    private final Runnable f24659w = new b();

    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: w0.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0436c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0436c abstractC0436c) {
        if (viewGroup != null) {
            if (abstractC0436c == null) {
                throw new IllegalArgumentException("Callback may not be null");
            }
            this.f24658v = viewGroup;
            this.f24655s = abstractC0436c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f24652p = i10;
            this.f24651o = i10;
            this.f24638b = viewConfiguration.getScaledTouchSlop();
            this.f24649m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f24650n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24654r = new OverScroller(context, f24636x);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private void A() {
        this.f24648l.computeCurrentVelocity(1000, this.f24649m);
        n(e(this.f24648l.getXVelocity(this.f24639c), this.f24650n, this.f24649m), e(this.f24648l.getYVelocity(this.f24639c), this.f24650n, this.f24649m));
    }

    private void B(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            boolean z10 = c10 ? 1 : 0;
            char c11 = c10 ? 1 : 0;
            c10 = z10 | true;
        }
        if (c(f11, f10, i10, 8)) {
            boolean z11 = c10 ? 1 : 0;
            char c12 = c10 ? 1 : 0;
            c10 = z11 | true;
        }
        if (c10) {
            int[] iArr = this.f24645i;
            iArr[i10] = iArr[i10] | (c10 ? 1 : 0);
            AbstractC0436c abstractC0436c = this.f24655s;
            int i11 = c10 ? 1 : 0;
            int i12 = c10 ? 1 : 0;
            int i13 = c10 ? 1 : 0;
            abstractC0436c.f(i11, i10);
        }
    }

    private void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f24640d;
        this.f24642f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f24641e;
        this.f24643g[i10] = f11;
        fArr2[i10] = f11;
        this.f24644h[i10] = t((int) f10, (int) f11);
        this.f24647k |= 1 << i10;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f24642f[pointerId] = x10;
                this.f24643g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f24644h[i10] & i11) != i11 || (this.f24653q & i11) == 0 || (this.f24646j[i10] & i11) == i11 || (this.f24645i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f24638b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f24655s.g(i11)) {
            return (this.f24645i[i10] & i11) == 0 && abs > ((float) this.f24638b);
        }
        int[] iArr = this.f24646j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f24655s.d(view) > 0;
        boolean z11 = this.f24655s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f24638b) : z11 && Math.abs(f11) > ((float) this.f24638b);
        }
        int i10 = this.f24638b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void g() {
        float[] fArr = this.f24640d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f24641e, 0.0f);
        Arrays.fill(this.f24642f, 0.0f);
        Arrays.fill(this.f24643g, 0.0f);
        Arrays.fill(this.f24644h, 0);
        Arrays.fill(this.f24645i, 0);
        Arrays.fill(this.f24646j, 0);
        this.f24647k = 0;
    }

    private void h(int i10) {
        if (this.f24640d == null || !w(i10)) {
            return;
        }
        this.f24640d[i10] = 0.0f;
        this.f24641e[i10] = 0.0f;
        this.f24642f[i10] = 0.0f;
        this.f24643g[i10] = 0.0f;
        this.f24644h[i10] = 0;
        this.f24645i[i10] = 0;
        this.f24646j[i10] = 0;
        this.f24647k = (~(1 << i10)) & this.f24647k;
    }

    private int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f24658v.getWidth();
        float f10 = width / 2;
        float o10 = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(o10 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int f14 = f(i12, (int) this.f24650n, (int) this.f24649m);
        int f15 = f(i13, (int) this.f24650n, (int) this.f24649m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (f14 != 0) {
            f11 = abs3;
            f10 = i14;
        } else {
            f11 = abs;
            f10 = i15;
        }
        float f16 = f11 / f10;
        if (f15 != 0) {
            f13 = abs4;
            f12 = i14;
        } else {
            f13 = abs2;
            f12 = i15;
        }
        return (int) ((i(i10, f14, this.f24655s.d(view)) * f16) + (i(i11, f15, this.f24655s.e(view)) * (f13 / f12)));
    }

    public static c l(ViewGroup viewGroup, float f10, AbstractC0436c abstractC0436c) {
        c m10 = m(viewGroup, abstractC0436c);
        m10.f24638b = (int) (m10.f24638b * (1.0f / f10));
        return m10;
    }

    public static c m(ViewGroup viewGroup, AbstractC0436c abstractC0436c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0436c);
    }

    private void n(float f10, float f11) {
        this.f24657u = true;
        this.f24655s.l(this.f24656t, f10, f11);
        this.f24657u = false;
        if (this.f24637a == 1) {
            E(0);
        }
    }

    private float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void p(int i10, int i11, int i12, int i13) {
        int left = this.f24656t.getLeft();
        int top = this.f24656t.getTop();
        if (i12 != 0) {
            i10 = this.f24655s.a(this.f24656t, i10, i12);
            y.Y(this.f24656t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f24655s.b(this.f24656t, i11, i13);
            y.Z(this.f24656t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f24655s.k(this.f24656t, i14, i15, i14 - left, i15 - top);
    }

    private void q(int i10) {
        float[] fArr = this.f24640d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f24641e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f24642f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f24643g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f24644h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f24645i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f24646j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f24640d = fArr2;
            this.f24641e = fArr3;
            this.f24642f = fArr4;
            this.f24643g = fArr5;
            this.f24644h = iArr;
            this.f24645i = iArr2;
            this.f24646j = iArr3;
        }
    }

    private boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f24656t.getLeft();
        int top = this.f24656t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f24654r.abortAnimation();
            E(0);
            return false;
        }
        this.f24654r.startScroll(left, top, i14, i15, j(this.f24656t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    private int t(int i10, int i11) {
        int i12 = i10 < this.f24658v.getLeft() + this.f24651o ? 1 : 0;
        if (i11 < this.f24658v.getTop() + this.f24651o) {
            i12 |= 4;
        }
        if (i10 > this.f24658v.getRight() - this.f24651o) {
            i12 |= 2;
        }
        return i11 > this.f24658v.getBottom() - this.f24651o ? i12 | 8 : i12;
    }

    private boolean x(int i10) {
        if (!w(i10)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    void E(int i10) {
        this.f24658v.removeCallbacks(this.f24659w);
        if (this.f24637a != i10) {
            this.f24637a = i10;
            this.f24655s.j(i10);
            if (this.f24637a != 0) {
                return;
            }
            this.f24656t = null;
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f24657u) {
            return s(i10, i11, (int) this.f24648l.getXVelocity(this.f24639c), (int) this.f24648l.getYVelocity(this.f24639c));
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
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f24656t = view;
        this.f24639c = -1;
        boolean s10 = s(i10, i11, 0, 0);
        if (!s10 && this.f24637a == 0 && this.f24656t != null) {
            this.f24656t = null;
        }
        return s10;
    }

    boolean I(View view, int i10) {
        if (view == this.f24656t && this.f24639c == i10) {
            return true;
        }
        if (view == null || !this.f24655s.m(view, i10)) {
            return false;
        }
        this.f24639c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f24639c = -1;
        g();
        VelocityTracker velocityTracker = this.f24648l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24648l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f24658v) {
            this.f24656t = view;
            this.f24639c = i10;
            this.f24655s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f24658v + ")");
    }

    public boolean k(boolean z10) {
        if (this.f24637a == 2) {
            boolean computeScrollOffset = this.f24654r.computeScrollOffset();
            int currX = this.f24654r.getCurrX();
            int currY = this.f24654r.getCurrY();
            int left = currX - this.f24656t.getLeft();
            int top = currY - this.f24656t.getTop();
            if (left != 0) {
                y.Y(this.f24656t, left);
            }
            if (top != 0) {
                y.Z(this.f24656t, top);
            }
            if (left != 0 || top != 0) {
                this.f24655s.k(this.f24656t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f24654r.getFinalX() && currY == this.f24654r.getFinalY()) {
                this.f24654r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f24658v.post(this.f24659w);
                } else {
                    E(0);
                }
            }
        }
        return this.f24637a == 2;
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f24658v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f24658v.getChildAt(this.f24655s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f24638b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f24656t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f24647k) != 0;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f24648l == null) {
            this.f24648l = VelocityTracker.obtain();
        }
        this.f24648l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r10 = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(r10, pointerId);
            int i12 = this.f24644h[pointerId];
            int i13 = this.f24653q;
            if ((i12 & i13) == 0) {
                return;
            }
            this.f24655s.h(i12 & i13, pointerId);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f24637a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i11 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (x(pointerId2)) {
                            float x11 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f10 = x11 - this.f24640d[pointerId2];
                            float f11 = y11 - this.f24641e[pointerId2];
                            B(f10, f11, pointerId2);
                            if (this.f24637a != 1) {
                                View r11 = r((int) x11, (int) y11);
                                if (d(r11, f10, f11) && I(r11, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                } else if (!x(this.f24639c)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f24639c);
                    float x12 = motionEvent.getX(findPointerIndex);
                    float y12 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f24642f;
                    int i14 = this.f24639c;
                    int i15 = (int) (x12 - fArr[i14]);
                    int i16 = (int) (y12 - this.f24643g[i14]);
                    p(this.f24656t.getLeft() + i15, this.f24656t.getTop() + i16, i15, i16);
                }
                D(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x13 = motionEvent.getX(actionIndex);
                    float y13 = motionEvent.getY(actionIndex);
                    C(x13, y13, pointerId3);
                    if (this.f24637a != 0) {
                        if (!v((int) x13, (int) y13)) {
                            return;
                        }
                        I(this.f24656t, pointerId3);
                        return;
                    }
                    I(r((int) x13, (int) y13), pointerId3);
                    int i17 = this.f24644h[pointerId3];
                    int i18 = this.f24653q;
                    if ((i17 & i18) == 0) {
                        return;
                    }
                    this.f24655s.h(i17 & i18, pointerId3);
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f24637a == 1 && pointerId4 == this.f24639c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i11 >= pointerCount2) {
                                i10 = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i11);
                            if (pointerId5 != this.f24639c) {
                                View r12 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                View view = this.f24656t;
                                if (r12 == view && I(view, pointerId5)) {
                                    i10 = this.f24639c;
                                    break;
                                }
                            }
                            i11++;
                        }
                        if (i10 == -1) {
                            A();
                        }
                    }
                    h(pointerId4);
                    return;
                }
            } else if (this.f24637a == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f24637a == 1) {
            A();
        }
        a();
    }
}
