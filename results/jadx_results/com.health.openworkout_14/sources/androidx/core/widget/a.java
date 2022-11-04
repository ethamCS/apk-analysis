package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.g.l.t;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final View f961d;

    /* renamed from: e */
    private Runnable f962e;

    /* renamed from: h */
    private int f965h;
    private int i;
    private boolean m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* renamed from: b */
    final C0016a f959b = new C0016a();

    /* renamed from: c */
    private final Interpolator f960c = new AccelerateInterpolator();

    /* renamed from: f */
    private float[] f963f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f964g = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0016a {

        /* renamed from: a */
        private int f966a;

        /* renamed from: b */
        private int f967b;

        /* renamed from: c */
        private float f968c;

        /* renamed from: d */
        private float f969d;
        private float j;
        private int k;

        /* renamed from: e */
        private long f970e = Long.MIN_VALUE;
        private long i = -1;

        /* renamed from: f */
        private long f971f = 0;

        /* renamed from: g */
        private int f972g = 0;

        /* renamed from: h */
        private int f973h = 0;

        C0016a() {
        }

        private float e(long j) {
            long j2 = this.f970e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j < j3) {
                return a.e(((float) (j - j2)) / this.f966a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e(((float) (j - j3)) / this.k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f971f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f971f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f971f)) * g2;
                this.f972g = (int) (this.f968c * f2);
                this.f973h = (int) (f2 * this.f969d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f972g;
        }

        public int c() {
            return this.f973h;
        }

        public int d() {
            float f2 = this.f968c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f969d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentAnimationTimeMillis - this.f970e), 0, this.f967b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.f967b = i;
        }

        public void k(int i) {
            this.f966a = i;
        }

        public void l(float f2, float f3) {
            this.f968c = f2;
            this.f969d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f970e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f971f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.f972g = 0;
            this.f973h = 0;
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
            if (!aVar.p) {
                return;
            }
            if (aVar.n) {
                aVar.n = false;
                aVar.f959b.m();
            }
            C0016a c0016a = a.this.f959b;
            if (c0016a.h() || !a.this.u()) {
                a.this.p = false;
                return;
            }
            a aVar2 = a.this;
            if (aVar2.o) {
                aVar2.o = false;
                aVar2.c();
            }
            c0016a.a();
            a.this.j(c0016a.b(), c0016a.c());
            t.a0(a.this.f961d, this);
        }
    }

    public a(View view) {
        this.f961d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(s);
        r(500);
        q(500);
    }

    private float d(int i, float f2, float f3, float f4) {
        float h2 = h(this.f963f[i], f3, this.f964g[i], f2);
        int i2 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = this.l[i];
        float f8 = f5 * f4;
        return i2 > 0 ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f965h;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.p && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f960c.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f960c.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.n) {
            this.p = false;
        } else {
            this.f959b.i();
        }
    }

    private void v() {
        int i;
        if (this.f962e == null) {
            this.f962e = new b();
        }
        this.p = true;
        this.n = true;
        if (this.m || (i = this.i) <= 0) {
            this.f962e.run();
        } else {
            t.b0(this.f961d, this.f962e, i);
        }
        this.m = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f961d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i, int i2);

    public a k(int i) {
        this.i = i;
        return this;
    }

    public a l(int i) {
        this.f965h = i;
        return this;
    }

    public a m(boolean z) {
        if (this.q && !z) {
            i();
        }
        this.q = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f964g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
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
            boolean r0 = r5.q
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
            r5.o = r2
            r5.m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f961d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f961d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f959b
            r7.l(r0, r6)
            boolean r6 = r5.p
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.r
            if (r6 == 0) goto L61
            boolean r6 = r5.p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i) {
        this.f959b.j(i);
        return this;
    }

    public a r(int i) {
        this.f959b.k(i);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f963f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0016a c0016a = this.f959b;
        int f2 = c0016a.f();
        int d2 = c0016a.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
