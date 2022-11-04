package q4;

import android.view.Choreographer;
/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {
    private e4.h Y3;

    /* renamed from: q */
    private float f19635q = 1.0f;

    /* renamed from: x */
    private boolean f19636x = false;

    /* renamed from: y */
    private long f19637y = 0;
    private float U3 = 0.0f;
    private int V3 = 0;
    private float W3 = -2.14748365E9f;
    private float X3 = 2.14748365E9f;
    protected boolean Z3 = false;

    private void I() {
        if (this.Y3 == null) {
            return;
        }
        float f10 = this.U3;
        if (f10 >= this.W3 && f10 <= this.X3) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.W3), Float.valueOf(this.X3), Float.valueOf(this.U3)));
    }

    private float k() {
        e4.h hVar = this.Y3;
        if (hVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hVar.i()) / Math.abs(this.f19635q);
    }

    private boolean p() {
        return o() < 0.0f;
    }

    public void A() {
        H(-o());
    }

    public void B(e4.h hVar) {
        float f10;
        float f11;
        boolean z10 = this.Y3 == null;
        this.Y3 = hVar;
        if (z10) {
            f11 = Math.max(this.W3, hVar.p());
            f10 = Math.min(this.X3, hVar.f());
        } else {
            f11 = (int) hVar.p();
            f10 = (int) hVar.f();
        }
        E(f11, f10);
        float f12 = this.U3;
        this.U3 = 0.0f;
        C((int) f12);
        f();
    }

    public void C(float f10) {
        if (this.U3 == f10) {
            return;
        }
        this.U3 = g.b(f10, m(), l());
        this.f19637y = 0L;
        f();
    }

    public void D(float f10) {
        E(this.W3, f10);
    }

    public void E(float f10, float f11) {
        if (f10 <= f11) {
            e4.h hVar = this.Y3;
            float p10 = hVar == null ? -3.4028235E38f : hVar.p();
            e4.h hVar2 = this.Y3;
            float f12 = hVar2 == null ? Float.MAX_VALUE : hVar2.f();
            float b10 = g.b(f10, p10, f12);
            float b11 = g.b(f11, p10, f12);
            if (b10 == this.W3 && b11 == this.X3) {
                return;
            }
            this.W3 = b10;
            this.X3 = b11;
            C((int) g.b(this.U3, b10, b11));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void F(int i10) {
        E(i10, (int) this.X3);
    }

    public void H(float f10) {
        this.f19635q = f10;
    }

    @Override // q4.a
    public void a() {
        super.a();
        c(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        w();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        v();
        if (this.Y3 == null || !isRunning()) {
            return;
        }
        e4.c.a("LottieValueAnimator#doFrame");
        long j11 = this.f19637y;
        long j12 = 0;
        if (j11 != 0) {
            j12 = j10 - j11;
        }
        float k10 = ((float) j12) / k();
        float f10 = this.U3;
        if (p()) {
            k10 = -k10;
        }
        float f11 = f10 + k10;
        this.U3 = f11;
        boolean z10 = !g.d(f11, m(), l());
        this.U3 = g.b(this.U3, m(), l());
        this.f19637y = j10;
        f();
        if (z10) {
            if (getRepeatCount() == -1 || this.V3 < getRepeatCount()) {
                d();
                this.V3++;
                if (getRepeatMode() == 2) {
                    this.f19636x = !this.f19636x;
                    A();
                } else {
                    this.U3 = p() ? l() : m();
                }
                this.f19637y = j10;
            } else {
                this.U3 = this.f19635q < 0.0f ? m() : l();
                w();
                c(p());
            }
        }
        I();
        e4.c.b("LottieValueAnimator#doFrame");
    }

    public void g() {
        this.Y3 = null;
        this.W3 = -2.14748365E9f;
        this.X3 = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float f10;
        float m10;
        if (this.Y3 == null) {
            return 0.0f;
        }
        if (p()) {
            f10 = l();
            m10 = this.U3;
        } else {
            f10 = this.U3;
            m10 = m();
        }
        return (f10 - m10) / (l() - m());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        e4.h hVar = this.Y3;
        if (hVar == null) {
            return 0L;
        }
        return hVar.d();
    }

    public void h() {
        w();
        c(p());
    }

    public float i() {
        e4.h hVar = this.Y3;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.U3 - hVar.p()) / (this.Y3.f() - this.Y3.p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.Z3;
    }

    public float j() {
        return this.U3;
    }

    public float l() {
        e4.h hVar = this.Y3;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.X3;
        return f10 == 2.14748365E9f ? hVar.f() : f10;
    }

    public float m() {
        e4.h hVar = this.Y3;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.W3;
        return f10 == -2.14748365E9f ? hVar.p() : f10;
    }

    public float o() {
        return this.f19635q;
    }

    public void q() {
        w();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f19636x) {
            return;
        }
        this.f19636x = false;
        A();
    }

    public void t() {
        this.Z3 = true;
        e(p());
        C((int) (p() ? l() : m()));
        this.f19637y = 0L;
        this.V3 = 0;
        v();
    }

    protected void v() {
        if (isRunning()) {
            x(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void w() {
        x(true);
    }

    protected void x(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.Z3 = false;
        }
    }

    public void y() {
        float m10;
        this.Z3 = true;
        v();
        this.f19637y = 0L;
        if (p() && j() == m()) {
            m10 = l();
        } else if (p() || j() != l()) {
            return;
        } else {
            m10 = m();
        }
        this.U3 = m10;
    }
}
