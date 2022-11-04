package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.y;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: g4 */
    private static final int f3777g4 = ViewConfiguration.getTapTimeout();
    private int V3;
    private int W3;

    /* renamed from: a4 */
    private boolean f3778a4;

    /* renamed from: b4 */
    boolean f3779b4;

    /* renamed from: c4 */
    boolean f3781c4;

    /* renamed from: d4 */
    boolean f3783d4;

    /* renamed from: e4 */
    private boolean f3784e4;

    /* renamed from: f4 */
    private boolean f3785f4;

    /* renamed from: q */
    final View f3786q;

    /* renamed from: x */
    private Runnable f3787x;

    /* renamed from: c */
    final C0044a f3780c = new C0044a();

    /* renamed from: d */
    private final Interpolator f3782d = new AccelerateInterpolator();

    /* renamed from: y */
    private float[] f3788y = {0.0f, 0.0f};
    private float[] U3 = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] X3 = {0.0f, 0.0f};
    private float[] Y3 = {0.0f, 0.0f};
    private float[] Z3 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0044a {

        /* renamed from: a */
        private int f3789a;

        /* renamed from: b */
        private int f3790b;

        /* renamed from: c */
        private float f3791c;

        /* renamed from: d */
        private float f3792d;

        /* renamed from: j */
        private float f3798j;

        /* renamed from: k */
        private int f3799k;

        /* renamed from: e */
        private long f3793e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f3797i = -1;

        /* renamed from: f */
        private long f3794f = 0;

        /* renamed from: g */
        private int f3795g = 0;

        /* renamed from: h */
        private int f3796h = 0;

        C0044a() {
        }

        private float e(long j10) {
            long j11 = this.f3793e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f3797i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / this.f3789a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f3798j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f3799k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f3794f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f3794f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f3794f)) * g10;
                this.f3795g = (int) (this.f3791c * f10);
                this.f3796h = (int) (f10 * this.f3792d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f3795g;
        }

        public int c() {
            return this.f3796h;
        }

        public int d() {
            float f10 = this.f3791c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f3792d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f3797i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3797i + ((long) this.f3799k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3799k = a.f((int) (currentAnimationTimeMillis - this.f3793e), 0, this.f3790b);
            this.f3798j = e(currentAnimationTimeMillis);
            this.f3797i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f3790b = i10;
        }

        public void k(int i10) {
            this.f3789a = i10;
        }

        public void l(float f10, float f11) {
            this.f3791c = f10;
            this.f3792d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3793e = currentAnimationTimeMillis;
            this.f3797i = -1L;
            this.f3794f = currentAnimationTimeMillis;
            this.f3798j = 0.5f;
            this.f3795g = 0;
            this.f3796h = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (!aVar.f3783d4) {
                return;
            }
            if (aVar.f3779b4) {
                aVar.f3779b4 = false;
                aVar.f3780c.m();
            }
            C0044a c0044a = a.this.f3780c;
            if (c0044a.h() || !a.this.u()) {
                a.this.f3783d4 = false;
                return;
            }
            a aVar2 = a.this;
            if (aVar2.f3781c4) {
                aVar2.f3781c4 = false;
                aVar2.c();
            }
            c0044a.a();
            a.this.j(c0044a.b(), c0044a.c());
            y.g0(a.this.f3786q, this);
        }
    }

    public a(View view) {
        this.f3786q = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f3777g4);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f3788y[i10], f11, this.U3[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.X3[i10];
        float f14 = this.Y3[i10];
        float f15 = this.Z3[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.V3;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f3783d4 && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f3782d.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f3782d.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f3779b4) {
            this.f3783d4 = false;
        } else {
            this.f3780c.i();
        }
    }

    private void v() {
        int i10;
        if (this.f3787x == null) {
            this.f3787x = new b();
        }
        this.f3783d4 = true;
        this.f3779b4 = true;
        if (this.f3778a4 || (i10 = this.W3) <= 0) {
            this.f3787x.run();
        } else {
            y.h0(this.f3786q, this.f3787x, i10);
        }
        this.f3778a4 = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3786q.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.W3 = i10;
        return this;
    }

    public a l(int i10) {
        this.V3 = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f3784e4 && !z10) {
            i();
        }
        this.f3784e4 = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.U3;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.Z3;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3784e4
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f3781c4 = r2
            r5.f3778a4 = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3786q
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3786q
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3780c
            r7.l(r0, r6)
            boolean r6 = r5.f3783d4
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f3785f4
            if (r6 == 0) goto L61
            boolean r6 = r5.f3783d4
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.Y3;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f3780c.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f3780c.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f3788y;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.X3;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0044a c0044a = this.f3780c;
        int f10 = c0044a.f();
        int d10 = c0044a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
