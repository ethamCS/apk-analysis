package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.n;
import d.a.a.a.a0.g;
import d.a.a.a.l.h;
import d.a.a.a.x.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a extends g implements b, Drawable.Callback, n.b {
    private static final int[] J0 = {16842910};
    private static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private float B;
    private int[] B0;
    private boolean C0;
    private ColorStateList D;
    private ColorStateList D0;
    private float E;
    private ColorStateList F;
    private TextUtils.TruncateAt F0;
    private boolean H;
    private int H0;
    private Drawable I;
    private boolean I0;
    private ColorStateList J;
    private float K;
    private boolean L;
    private boolean M;
    private Drawable N;
    private Drawable O;
    private ColorStateList P;
    private float Q;
    private CharSequence R;
    private boolean S;
    private boolean T;
    private Drawable U;
    private ColorStateList V;
    private h W;
    private h X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private final Context g0;
    private final n n0;
    private int o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private boolean u0;
    private int v0;
    private ColorFilter x0;
    private PorterDuffColorFilter y0;
    private ColorStateList z;
    private ColorStateList z0;
    private float C = -1.0f;
    private final Paint h0 = new Paint(1);
    private final Paint.FontMetrics j0 = new Paint.FontMetrics();
    private final RectF k0 = new RectF();
    private final PointF l0 = new PointF();
    private final Path m0 = new Path();
    private int w0 = 255;
    private PorterDuff.Mode A0 = PorterDuff.Mode.SRC_IN;
    private WeakReference<AbstractC0071a> E0 = new WeakReference<>(null);
    private CharSequence G = "";
    private final Paint i0 = null;
    private boolean G0 = true;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0071a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        M(context);
        this.g0 = context;
        n nVar = new n(this);
        this.n0 = nVar;
        nVar.e().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        h2(iArr);
        if (d.a.a.a.y.b.f3712a) {
            K0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        this.h0.setColor(this.s0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.k0, G0(), G0(), this.h0);
            return;
        }
        h(new RectF(rect), this.m0);
        super.p(canvas, this.h0, this.m0, u());
    }

    private void B0(Canvas canvas, Rect rect) {
        Paint paint = this.i0;
        if (paint != null) {
            paint.setColor(b.g.e.a.d(-16777216, 127));
            canvas.drawRect(rect, this.i0);
            if (J2() || I2()) {
                j0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            if (this.G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.i0);
            }
            if (K2()) {
                m0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            this.i0.setColor(b.g.e.a.d(-65536, 127));
            l0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
            this.i0.setColor(b.g.e.a.d(-16711936, 127));
            n0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.G != null) {
            Paint.Align r0 = r0(rect, this.l0);
            p0(rect, this.k0);
            if (this.n0.d() != null) {
                this.n0.e().drawableState = getState();
                this.n0.j(this.g0);
            }
            this.n0.e().setTextAlign(r0);
            int i = 0;
            boolean z = Math.round(this.n0.f(d1().toString())) > Math.round(this.k0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.k0);
            }
            CharSequence charSequence = this.G;
            if (z && this.F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.n0.e(), this.k0.width(), this.F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.n0.e());
            if (!z) {
                return;
            }
            canvas.restoreToCount(i);
        }
    }

    private boolean I2() {
        return this.T && this.U != null && this.u0;
    }

    private boolean J2() {
        return this.H && this.I != null;
    }

    private boolean K2() {
        return this.M && this.N != null;
    }

    private void L2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void M2() {
        this.D0 = this.C0 ? d.a.a.a.y.b.a(this.F) : null;
    }

    @TargetApi(21)
    private void N2() {
        this.O = new RippleDrawable(d.a.a.a.y.b.a(b1()), this.N, K0);
    }

    private void X1(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter h1() {
        ColorFilter colorFilter = this.x0;
        return colorFilter != null ? colorFilter : this.y0;
    }

    private void i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(U0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.P);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.I;
        if (drawable != drawable2 || !this.L) {
            return;
        }
        androidx.core.graphics.drawable.a.o(drawable2, this.J);
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2() || I2()) {
            float f2 = this.Y + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + this.K;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - this.K;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.K;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private static boolean j1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (K2()) {
            float f2 = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f2 = this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.Q;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.Q;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f2 = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean n1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean o1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float k0 = this.Y + k0() + this.b0;
            float o0 = this.f0 + o0() + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + k0;
                rectF.right = rect.right - o0;
            } else {
                rectF.left = rect.left + o0;
                rectF.right = rect.right - k0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean p1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f3696b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private float q0() {
        this.n0.e().getFontMetrics(this.j0);
        Paint.FontMetrics fontMetrics = this.j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.q1(android.util.AttributeSet, int, int):void");
    }

    private boolean s0() {
        return this.T && this.U != null && this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.s1(int[], int[]):boolean");
    }

    public static a t0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.q1(attributeSet, i, i2);
        return aVar;
    }

    private void u0(Canvas canvas, Rect rect) {
        if (I2()) {
            j0(rect, this.k0);
            RectF rectF = this.k0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.U.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.U.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (!this.I0) {
            this.h0.setColor(this.p0);
            this.h0.setStyle(Paint.Style.FILL);
            this.h0.setColorFilter(h1());
            this.k0.set(rect);
            canvas.drawRoundRect(this.k0, G0(), G0(), this.h0);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (J2()) {
            j0(rect, this.k0);
            RectF rectF = this.k0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.I.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.I.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.h0.setColor(this.r0);
        this.h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.h0.setColorFilter(h1());
        }
        RectF rectF = this.k0;
        float f2 = this.E;
        rectF.set(rect.left + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.k0, f3, f3, this.h0);
    }

    private void y0(Canvas canvas, Rect rect) {
        if (!this.I0) {
            this.h0.setColor(this.o0);
            this.h0.setStyle(Paint.Style.FILL);
            this.k0.set(rect);
            canvas.drawRoundRect(this.k0, G0(), G0(), this.h0);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (K2()) {
            m0(rect, this.k0);
            RectF rectF = this.k0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.N.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            if (d.a.a.a.y.b.f3712a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                drawable = this.O;
            } else {
                drawable = this.N;
            }
            drawable.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public void A1(boolean z) {
        if (this.T != z) {
            boolean I2 = I2();
            this.T = z;
            boolean I22 = I2();
            if (!(I2 != I22)) {
                return;
            }
            if (I22) {
                i0(this.U);
            } else {
                L2(this.U);
            }
            invalidateSelf();
            r1();
        }
    }

    public void A2(d dVar) {
        this.n0.h(dVar, this.g0);
    }

    public void B1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void B2(int i) {
        A2(new d(this.g0, i));
    }

    public void C1(int i) {
        B1(b.a.k.a.a.c(this.g0, i));
    }

    public void C2(float f2) {
        if (this.c0 != f2) {
            this.c0 = f2;
            invalidateSelf();
            r1();
        }
    }

    public Drawable D0() {
        return this.U;
    }

    @Deprecated
    public void D1(float f2) {
        if (this.C != f2) {
            this.C = f2;
            setShapeAppearanceModel(C().w(f2));
        }
    }

    public void D2(int i) {
        C2(this.g0.getResources().getDimension(i));
    }

    public ColorStateList E0() {
        return this.V;
    }

    @Deprecated
    public void E1(int i) {
        D1(this.g0.getResources().getDimension(i));
    }

    public void E2(float f2) {
        if (this.b0 != f2) {
            this.b0 = f2;
            invalidateSelf();
            r1();
        }
    }

    public ColorStateList F0() {
        return this.A;
    }

    public void F1(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            r1();
        }
    }

    public void F2(int i) {
        E2(this.g0.getResources().getDimension(i));
    }

    public float G0() {
        return this.I0 ? F() : this.C;
    }

    public void G1(int i) {
        F1(this.g0.getResources().getDimension(i));
    }

    public void G2(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            M2();
            onStateChange(getState());
        }
    }

    public float H0() {
        return this.f0;
    }

    public void H1(Drawable drawable) {
        Drawable I0 = I0();
        if (I0 != drawable) {
            float k0 = k0();
            this.I = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float k02 = k0();
            L2(I0);
            if (J2()) {
                i0(this.I);
            }
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public boolean H2() {
        return this.G0;
    }

    public Drawable I0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void I1(int i) {
        H1(b.a.k.a.a.d(this.g0, i));
    }

    public float J0() {
        return this.K;
    }

    public void J1(float f2) {
        if (this.K != f2) {
            float k0 = k0();
            this.K = f2;
            float k02 = k0();
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public ColorStateList K0() {
        return this.J;
    }

    public void K1(int i) {
        J1(this.g0.getResources().getDimension(i));
    }

    public float L0() {
        return this.B;
    }

    public void L1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (J2()) {
                androidx.core.graphics.drawable.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float M0() {
        return this.Y;
    }

    public void M1(int i) {
        L1(b.a.k.a.a.c(this.g0, i));
    }

    public ColorStateList N0() {
        return this.D;
    }

    public void N1(int i) {
        O1(this.g0.getResources().getBoolean(i));
    }

    public float O0() {
        return this.E;
    }

    public void O1(boolean z) {
        if (this.H != z) {
            boolean J2 = J2();
            this.H = z;
            boolean J22 = J2();
            if (!(J2 != J22)) {
                return;
            }
            if (J22) {
                i0(this.I);
            } else {
                L2(this.I);
            }
            invalidateSelf();
            r1();
        }
    }

    public Drawable P0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void P1(float f2) {
        if (this.B != f2) {
            this.B = f2;
            invalidateSelf();
            r1();
        }
    }

    public CharSequence Q0() {
        return this.R;
    }

    public void Q1(int i) {
        P1(this.g0.getResources().getDimension(i));
    }

    public float R0() {
        return this.e0;
    }

    public void R1(float f2) {
        if (this.Y != f2) {
            this.Y = f2;
            invalidateSelf();
            r1();
        }
    }

    public float S0() {
        return this.Q;
    }

    public void S1(int i) {
        R1(this.g0.getResources().getDimension(i));
    }

    public float T0() {
        return this.d0;
    }

    public void T1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public int[] U0() {
        return this.B0;
    }

    public void U1(int i) {
        T1(b.a.k.a.a.c(this.g0, i));
    }

    public ColorStateList V0() {
        return this.P;
    }

    public void V1(float f2) {
        if (this.E != f2) {
            this.E = f2;
            this.h0.setStrokeWidth(f2);
            if (this.I0) {
                super.e0(f2);
            }
            invalidateSelf();
        }
    }

    public void W0(RectF rectF) {
        n0(getBounds(), rectF);
    }

    public void W1(int i) {
        V1(this.g0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt X0() {
        return this.F0;
    }

    public h Y0() {
        return this.X;
    }

    public void Y1(Drawable drawable) {
        Drawable P0 = P0();
        if (P0 != drawable) {
            float o0 = o0();
            this.N = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (d.a.a.a.y.b.f3712a) {
                N2();
            }
            float o02 = o0();
            L2(P0);
            if (K2()) {
                i0(this.N);
            }
            invalidateSelf();
            if (o0 == o02) {
                return;
            }
            r1();
        }
    }

    public float Z0() {
        return this.a0;
    }

    public void Z1(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = b.g.j.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.n.b
    public void a() {
        r1();
        invalidateSelf();
    }

    public float a1() {
        return this.Z;
    }

    public void a2(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            if (!K2()) {
                return;
            }
            r1();
        }
    }

    public ColorStateList b1() {
        return this.F;
    }

    public void b2(int i) {
        a2(this.g0.getResources().getDimension(i));
    }

    public h c1() {
        return this.W;
    }

    public void c2(int i) {
        Y1(b.a.k.a.a.d(this.g0, i));
    }

    public CharSequence d1() {
        return this.G;
    }

    public void d2(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            invalidateSelf();
            if (!K2()) {
                return;
            }
            r1();
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = 0;
        int i2 = this.w0;
        if (i2 < 255) {
            i = d.a.a.a.m.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        }
        y0(canvas, bounds);
        v0(canvas, bounds);
        if (this.I0) {
            super.draw(canvas);
        }
        x0(canvas, bounds);
        A0(canvas, bounds);
        w0(canvas, bounds);
        u0(canvas, bounds);
        if (this.G0) {
            C0(canvas, bounds);
        }
        z0(canvas, bounds);
        B0(canvas, bounds);
        if (this.w0 >= 255) {
            return;
        }
        canvas.restoreToCount(i);
    }

    public d e1() {
        return this.n0.d();
    }

    public void e2(int i) {
        d2(this.g0.getResources().getDimension(i));
    }

    public float f1() {
        return this.c0;
    }

    public void f2(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            if (!K2()) {
                return;
            }
            r1();
        }
    }

    public float g1() {
        return this.b0;
    }

    public void g2(int i) {
        f2(this.g0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + k0() + this.b0 + this.n0.f(d1().toString()) + this.c0 + o0() + this.f0), this.H0);
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h2(int[] iArr) {
        if (!Arrays.equals(this.B0, iArr)) {
            this.B0 = iArr;
            if (!K2()) {
                return false;
            }
            return s1(getState(), iArr);
        }
        return false;
    }

    public boolean i1() {
        return this.C0;
    }

    public void i2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (K2()) {
                androidx.core.graphics.drawable.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return n1(this.z) || n1(this.A) || n1(this.D) || (this.C0 && n1(this.D0)) || p1(this.n0.d()) || s0() || o1(this.I) || o1(this.U) || n1(this.z0);
    }

    public void j2(int i) {
        i2(b.a.k.a.a.c(this.g0, i));
    }

    public float k0() {
        if (J2() || I2()) {
            return this.Z + this.K + this.a0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.S;
    }

    public void k2(boolean z) {
        if (this.M != z) {
            boolean K2 = K2();
            this.M = z;
            boolean K22 = K2();
            if (!(K2 != K22)) {
                return;
            }
            if (K22) {
                i0(this.N);
            } else {
                L2(this.N);
            }
            invalidateSelf();
            r1();
        }
    }

    public boolean l1() {
        return o1(this.N);
    }

    public void l2(AbstractC0071a abstractC0071a) {
        this.E0 = new WeakReference<>(abstractC0071a);
    }

    public boolean m1() {
        return this.M;
    }

    public void m2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public void n2(h hVar) {
        this.X = hVar;
    }

    public float o0() {
        if (K2()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public void o2(int i) {
        n2(h.c(this.g0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (J2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.I, i);
        }
        if (I2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.U, i);
        }
        if (K2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.N, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (J2()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (I2()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (K2()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable, com.google.android.material.internal.n.b
    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return s1(iArr, U0());
    }

    public void p2(float f2) {
        if (this.a0 != f2) {
            float k0 = k0();
            this.a0 = f2;
            float k02 = k0();
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public void q2(int i) {
        p2(this.g0.getResources().getDimension(i));
    }

    Paint.Align r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float k0 = this.Y + k0() + this.b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + k0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - k0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - q0();
        }
        return align;
    }

    protected void r1() {
        AbstractC0071a abstractC0071a = this.E0.get();
        if (abstractC0071a != null) {
            abstractC0071a.a();
        }
    }

    public void r2(float f2) {
        if (this.Z != f2) {
            float k0 = k0();
            this.Z = f2;
            float k02 = k0();
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public void s2(int i) {
        r2(this.g0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            invalidateSelf();
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.x0 != colorFilter) {
            this.x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.y0 = d.a.a.a.s.a.a(this, this.z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (J2()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (I2()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (K2()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(boolean z) {
        if (this.S != z) {
            this.S = z;
            float k0 = k0();
            if (!z && this.u0) {
                this.u0 = false;
            }
            float k02 = k0();
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public void t2(int i) {
        this.H0 = i;
    }

    public void u1(int i) {
        t1(this.g0.getResources().getBoolean(i));
    }

    public void u2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            M2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(Drawable drawable) {
        if (this.U != drawable) {
            float k0 = k0();
            this.U = drawable;
            float k02 = k0();
            L2(this.U);
            i0(this.U);
            invalidateSelf();
            if (k0 == k02) {
                return;
            }
            r1();
        }
    }

    public void v2(int i) {
        u2(b.a.k.a.a.c(this.g0, i));
    }

    public void w1(int i) {
        v1(b.a.k.a.a.d(this.g0, i));
    }

    public void w2(boolean z) {
        this.G0 = z;
    }

    public void x1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (s0()) {
                androidx.core.graphics.drawable.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void x2(h hVar) {
        this.W = hVar;
    }

    public void y1(int i) {
        x1(b.a.k.a.a.c(this.g0, i));
    }

    public void y2(int i) {
        x2(h.c(this.g0, i));
    }

    public void z1(int i) {
        A1(this.g0.getResources().getBoolean(i));
    }

    public void z2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.n0.i(true);
            invalidateSelf();
            r1();
        }
    }
}
