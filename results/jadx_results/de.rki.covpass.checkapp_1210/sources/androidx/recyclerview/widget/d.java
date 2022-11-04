package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.y;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];

    /* renamed from: a */
    private final int f4728a;

    /* renamed from: b */
    private final int f4729b;

    /* renamed from: c */
    final StateListDrawable f4730c;

    /* renamed from: d */
    final Drawable f4731d;

    /* renamed from: e */
    private final int f4732e;

    /* renamed from: f */
    private final int f4733f;

    /* renamed from: g */
    private final StateListDrawable f4734g;

    /* renamed from: h */
    private final Drawable f4735h;

    /* renamed from: i */
    private final int f4736i;

    /* renamed from: j */
    private final int f4737j;

    /* renamed from: k */
    int f4738k;

    /* renamed from: l */
    int f4739l;

    /* renamed from: m */
    float f4740m;

    /* renamed from: n */
    int f4741n;

    /* renamed from: o */
    int f4742o;

    /* renamed from: p */
    float f4743p;

    /* renamed from: s */
    private RecyclerView f4746s;

    /* renamed from: z */
    final ValueAnimator f4753z;

    /* renamed from: q */
    private int f4744q = 0;

    /* renamed from: r */
    private int f4745r = 0;

    /* renamed from: t */
    private boolean f4747t = false;

    /* renamed from: u */
    private boolean f4748u = false;

    /* renamed from: v */
    private int f4749v = 0;

    /* renamed from: w */
    private int f4750w = 0;

    /* renamed from: x */
    private final int[] f4751x = new int[2];

    /* renamed from: y */
    private final int[] f4752y = new int[2];
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.t {
        b() {
            d.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4756a = false;

        c() {
            d.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4756a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4756a) {
                this.f4756a = false;
            } else if (((Float) d.this.f4753z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    public class C0059d implements ValueAnimator.AnimatorUpdateListener {
        C0059d() {
            d.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4730c.setAlpha(floatValue);
            d.this.f4731d.setAlpha(floatValue);
            d.this.v();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4753z = ofFloat;
        this.f4730c = stateListDrawable;
        this.f4731d = drawable;
        this.f4734g = stateListDrawable2;
        this.f4735h = drawable2;
        this.f4732e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4733f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4736i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4737j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4728a = i11;
        this.f4729b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0059d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] p10 = p();
        float max = Math.max(p10[0], Math.min(p10[1], f10));
        if (Math.abs(this.f4739l - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f4740m, max, p10, this.f4746s.computeVerticalScrollRange(), this.f4746s.computeVerticalScrollOffset(), this.f4745r);
        if (x10 != 0) {
            this.f4746s.scrollBy(0, x10);
        }
        this.f4740m = max;
    }

    private void k() {
        this.f4746s.removeCallbacks(this.B);
    }

    private void l() {
        this.f4746s.W0(this);
        this.f4746s.X0(this);
        this.f4746s.Y0(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f4745r;
        int i11 = this.f4736i;
        int i12 = i10 - i11;
        int i13 = this.f4742o;
        int i14 = this.f4741n;
        int i15 = i13 - (i14 / 2);
        this.f4734g.setBounds(0, 0, i14, i11);
        this.f4735h.setBounds(0, 0, this.f4744q, this.f4737j);
        canvas.translate(0.0f, i12);
        this.f4735h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f4734g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void n(Canvas canvas) {
        int i10 = this.f4744q;
        int i11 = this.f4732e;
        int i12 = i10 - i11;
        int i13 = this.f4739l;
        int i14 = this.f4738k;
        int i15 = i13 - (i14 / 2);
        this.f4730c.setBounds(0, 0, i11, i14);
        this.f4731d.setBounds(0, 0, this.f4733f, this.f4745r);
        if (s()) {
            this.f4731d.draw(canvas);
            canvas.translate(this.f4732e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4730c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i12 = this.f4732e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f4731d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f4730c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    private int[] o() {
        int[] iArr = this.f4752y;
        int i10 = this.f4729b;
        iArr[0] = i10;
        iArr[1] = this.f4744q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f4751x;
        int i10 = this.f4729b;
        iArr[0] = i10;
        iArr[1] = this.f4745r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] o10 = o();
        float max = Math.max(o10[0], Math.min(o10[1], f10));
        if (Math.abs(this.f4742o - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f4743p, max, o10, this.f4746s.computeHorizontalScrollRange(), this.f4746s.computeHorizontalScrollOffset(), this.f4744q);
        if (x10 != 0) {
            this.f4746s.scrollBy(x10, 0);
        }
        this.f4743p = max;
    }

    private boolean s() {
        return y.B(this.f4746s) == 1;
    }

    private void w(int i10) {
        k();
        this.f4746s.postDelayed(this.B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 < i14 && i16 >= 0) {
            return i15;
        }
        return 0;
    }

    private void z() {
        this.f4746s.h(this);
        this.f4746s.k(this);
        this.f4746s.l(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f4753z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f4753z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4753z.setDuration(500L);
        this.f4753z.setStartDelay(0L);
        this.f4753z.start();
    }

    void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f4746s.computeVerticalScrollRange();
        int i12 = this.f4745r;
        this.f4747t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f4728a;
        int computeHorizontalScrollRange = this.f4746s.computeHorizontalScrollRange();
        int i13 = this.f4744q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f4728a;
        this.f4748u = z10;
        boolean z11 = this.f4747t;
        if (!z11 && !z10) {
            if (this.f4749v == 0) {
                return;
            }
            y(0);
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f4739l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f4738k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f4748u) {
            float f11 = i13;
            this.f4742o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f4741n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f4749v;
        if (i14 != 0 && i14 != 1) {
            return;
        }
        y(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4749v;
        if (i10 == 1) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u10 && !t10) {
                return false;
            }
            if (t10) {
                this.f4750w = 1;
                this.f4743p = (int) motionEvent.getX();
            } else if (u10) {
                this.f4750w = 2;
                this.f4740m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4749v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (!u10 && !t10) {
                return;
            }
            if (t10) {
                this.f4750w = 1;
                this.f4743p = (int) motionEvent.getX();
            } else if (u10) {
                this.f4750w = 2;
                this.f4740m = (int) motionEvent.getY();
            }
            y(2);
        } else if (motionEvent.getAction() == 1 && this.f4749v == 2) {
            this.f4740m = 0.0f;
            this.f4743p = 0.0f;
            y(1);
            this.f4750w = 0;
        } else if (motionEvent.getAction() != 2 || this.f4749v != 2) {
        } else {
            A();
            if (this.f4750w == 1) {
                r(motionEvent.getX());
            }
            if (this.f4750w != 2) {
                return;
            }
            C(motionEvent.getY());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f4744q != this.f4746s.getWidth() || this.f4745r != this.f4746s.getHeight()) {
            this.f4744q = this.f4746s.getWidth();
            this.f4745r = this.f4746s.getHeight();
            y(0);
        } else if (this.A == 0) {
        } else {
            if (this.f4747t) {
                n(canvas);
            }
            if (!this.f4748u) {
                return;
            }
            m(canvas);
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4746s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f4746s = recyclerView;
        if (recyclerView == null) {
            return;
        }
        z();
    }

    void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f4753z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f4753z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4753z.setDuration(i10);
        this.f4753z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f4745r - this.f4736i) {
            int i10 = this.f4742o;
            int i11 = this.f4741n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f4744q - this.f4732e : f10 <= this.f4732e / 2) {
            int i10 = this.f4739l;
            int i11 = this.f4738k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f4746s.invalidate();
    }

    void y(int i10) {
        int i11;
        if (i10 == 2 && this.f4749v != 2) {
            this.f4730c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f4749v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f4749v = i10;
        }
        this.f4730c.setState(E);
        i11 = 1200;
        w(i11);
        this.f4749v = i10;
    }
}
