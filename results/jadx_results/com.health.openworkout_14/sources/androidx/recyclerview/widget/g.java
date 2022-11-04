package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class g extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];

    /* renamed from: a */
    private final int f1733a;

    /* renamed from: b */
    private final int f1734b;

    /* renamed from: c */
    final StateListDrawable f1735c;

    /* renamed from: d */
    final Drawable f1736d;

    /* renamed from: e */
    private final int f1737e;

    /* renamed from: f */
    private final int f1738f;

    /* renamed from: g */
    private final StateListDrawable f1739g;

    /* renamed from: h */
    private final Drawable f1740h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private RecyclerView s;
    final ValueAnimator z;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.s(500);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.t {
        b() {
            g.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            g.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1743a = false;

        c() {
            g.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1743a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1743a) {
                this.f1743a = false;
            } else if (((Float) g.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                g gVar = g.this;
                gVar.A = 0;
                gVar.A(0);
            } else {
                g gVar2 = g.this;
                gVar2.A = 2;
                gVar2.x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
            g.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            g.this.f1735c.setAlpha(floatValue);
            g.this.f1736d.setAlpha(floatValue);
            g.this.x();
        }
    }

    public g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.f1735c = stateListDrawable;
        this.f1736d = drawable;
        this.f1739g = stateListDrawable2;
        this.f1740h = drawable2;
        this.f1737e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f1738f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1733a = i2;
        this.f1734b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void B() {
        this.s.h(this);
        this.s.k(this);
        this.s.l(this.C);
    }

    private void E(float f2) {
        int[] r = r();
        float max = Math.max(r[0], Math.min(r[1], f2));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int z = z(this.m, max, r, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (z != 0) {
            this.s.scrollBy(0, z);
        }
        this.m = max;
    }

    private void m() {
        this.s.removeCallbacks(this.B);
    }

    private void n() {
        this.s.a1(this);
        this.s.c1(this);
        this.s.d1(this.C);
        m();
    }

    private void o(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.f1739g.setBounds(0, 0, i5, i2);
        this.f1740h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.f1740h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f1739g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void p(Canvas canvas) {
        int i = this.q;
        int i2 = this.f1737e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.f1735c.setBounds(0, 0, i2, i5);
        this.f1736d.setBounds(0, 0, this.f1738f, this.r);
        if (u()) {
            this.f1736d.draw(canvas);
            canvas.translate(this.f1737e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f1735c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f1737e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f1736d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f1735c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    private int[] q() {
        int[] iArr = this.y;
        int i = this.f1734b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    private int[] r() {
        int[] iArr = this.x;
        int i = this.f1734b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    private void t(float f2) {
        int[] q = q();
        float max = Math.max(q[0], Math.min(q[1], f2));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        int z = z(this.p, max, q, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (z != 0) {
            this.s.scrollBy(z, 0);
        }
        this.p = max;
    }

    private boolean u() {
        return b.g.l.t.y(this.s) == 1;
    }

    private void y(int i) {
        m();
        this.s.postDelayed(this.B, i);
    }

    private int z(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 < i5 && i7 >= 0) {
            return i6;
        }
        return 0;
    }

    void A(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.f1735c.setState(D);
            m();
        }
        if (i == 0) {
            x();
        } else {
            C();
        }
        if (this.v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.v = i;
        }
        this.f1735c.setState(E);
        i2 = 1200;
        y(i2);
        this.v = i;
    }

    public void C() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void D(int i, int i2) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f1733a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f1733a;
        this.u = z;
        boolean z2 = this.t;
        if (!z2 && !z) {
            if (this.v == 0) {
                return;
            }
            A(0);
            return;
        }
        if (z2) {
            float f2 = i3;
            this.l = (int) ((f2 * (i2 + (f2 / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f3 = i4;
            this.o = (int) ((f3 * (i + (f3 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        A(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean w = w(motionEvent.getX(), motionEvent.getY());
            boolean v = v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!w && !v) {
                return false;
            }
            if (v) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (w) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            A(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean w = w(motionEvent.getX(), motionEvent.getY());
            boolean v = v(motionEvent.getX(), motionEvent.getY());
            if (!w && !v) {
                return;
            }
            if (v) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (w) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            A(2);
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            A(1);
            this.w = 0;
        } else if (motionEvent.getAction() != 2 || this.v != 2) {
        } else {
            C();
            if (this.w == 1) {
                t(motionEvent.getX());
            }
            if (this.w != 2) {
                return;
            }
            E(motionEvent.getY());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            A(0);
        } else if (this.A == 0) {
        } else {
            if (this.t) {
                p(canvas);
            }
            if (!this.u) {
                return;
            }
            o(canvas);
        }
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.s = recyclerView;
        if (recyclerView == null) {
            return;
        }
        B();
    }

    void s(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    boolean v(float f2, float f3) {
        if (f3 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean w(float f2, float f3) {
        if (!u() ? f2 >= this.q - this.f1737e : f2 <= this.f1737e / 2) {
            int i = this.l;
            int i2 = this.k;
            if (f3 >= i - (i2 / 2) && f3 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    void x() {
        this.s.invalidate();
    }
}
