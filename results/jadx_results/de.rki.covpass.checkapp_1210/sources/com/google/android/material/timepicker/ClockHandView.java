package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.y;
import b5.k;
import b5.l;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ClockHandView extends View {
    private int U3;
    private final List<d> V3;
    private final int W3;
    private final float X3;
    private final Paint Y3;
    private final RectF Z3;

    /* renamed from: a4 */
    private final int f7749a4;

    /* renamed from: b4 */
    private float f7750b4;

    /* renamed from: c */
    private ValueAnimator f7751c;

    /* renamed from: c4 */
    private boolean f7752c4;

    /* renamed from: d */
    private boolean f7753d;

    /* renamed from: d4 */
    private c f7754d4;

    /* renamed from: e4 */
    private double f7755e4;

    /* renamed from: f4 */
    private int f7756f4;

    /* renamed from: q */
    private float f7757q;

    /* renamed from: x */
    private float f7758x;

    /* renamed from: y */
    private boolean f7759y;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(float f10, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.x_res_0x7f0302bb);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.V3 = new ArrayList();
        Paint paint = new Paint();
        this.Y3 = paint;
        this.Z3 = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f5609l1, i10, k.f5506y);
        this.f7756f4 = obtainStyledAttributes.getDimensionPixelSize(l.f5627n1, 0);
        this.W3 = obtainStyledAttributes.getDimensionPixelSize(l.f5636o1, 0);
        Resources resources = getResources();
        this.f7749a4 = resources.getDimensionPixelSize(b5.d.m_res_0x7f06016c);
        this.X3 = resources.getDimensionPixelSize(b5.d.k_res_0x7f06016a);
        int color = obtainStyledAttributes.getColor(l.f5618m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.U3 = ViewConfiguration.get(context).getScaledTouchSlop();
        y.y0(this, 2);
        obtainStyledAttributes.recycle();
    }

    private void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.Y3.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f7756f4 * ((float) Math.cos(this.f7755e4))) + width2, (this.f7756f4 * ((float) Math.sin(this.f7755e4))) + f10, this.W3, this.Y3);
        double sin = Math.sin(this.f7755e4);
        double cos = Math.cos(this.f7755e4);
        this.Y3.setStrokeWidth(this.f7749a4);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.Y3);
        canvas.drawCircle(width2, f10, this.X3, this.Y3);
    }

    private int e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f11), Float.valueOf(f10));
    }

    private boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float e10 = e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != e10;
        if (!z11 || !z14) {
            if (!z14 && !z10) {
                return false;
            }
            if (z12 && this.f7753d) {
                z13 = true;
            }
            l(e10, z13);
            return true;
        }
        return true;
    }

    public void m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f7750b4 = f11;
        this.f7755e4 = Math.toRadians(f11 - 90.0f);
        float width = (getWidth() / 2) + (this.f7756f4 * ((float) Math.cos(this.f7755e4)));
        float height = (getHeight() / 2) + (this.f7756f4 * ((float) Math.sin(this.f7755e4)));
        RectF rectF = this.Z3;
        int i10 = this.W3;
        rectF.set(width - i10, height - i10, width + i10, height + i10);
        for (d dVar : this.V3) {
            dVar.a(f11, z10);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.V3.add(dVar);
    }

    public RectF d() {
        return this.Z3;
    }

    public float f() {
        return this.f7750b4;
    }

    public int g() {
        return this.W3;
    }

    public void j(int i10) {
        this.f7756f4 = i10;
        invalidate();
    }

    public void k(float f10) {
        l(f10, false);
    }

    public void l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f7751c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f10, false);
            return;
        }
        Pair<Float, Float> h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h10.first).floatValue(), ((Float) h10.second).floatValue());
        this.f7751c = ofFloat;
        ofFloat.setDuration(200L);
        this.f7751c.addUpdateListener(new a());
        this.f7751c.addListener(new b());
        this.f7751c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f7757q = x10;
            this.f7758x = y10;
            this.f7759y = true;
            this.f7752c4 = false;
            z12 = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f7757q);
            int i11 = (int) (y10 - this.f7758x);
            this.f7759y = (i10 * i10) + (i11 * i11) > this.U3;
            boolean z13 = this.f7752c4;
            z12 = actionMasked == 1;
            z10 = false;
            z11 = z13;
        } else {
            z12 = false;
            z11 = false;
            z10 = false;
        }
        boolean i12 = i(x10, y10, z11, z10, z12) | this.f7752c4;
        this.f7752c4 = i12;
        if (i12 && z12 && (cVar = this.f7754d4) != null) {
            cVar.a(e(x10, y10), this.f7759y);
        }
        return true;
    }
}
