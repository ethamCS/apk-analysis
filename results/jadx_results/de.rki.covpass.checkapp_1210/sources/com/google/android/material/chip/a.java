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
import c5.h;
import com.google.android.material.internal.k;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
import q5.d;
import r5.b;
import t5.g;
/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback, k.b {

    /* renamed from: y5 */
    private static final int[] f7066y5 = {16842910};

    /* renamed from: z5 */
    private static final ShapeDrawable f7067z5 = new ShapeDrawable(new OvalShape());
    private boolean A4;
    private boolean B4;
    private Drawable C4;
    private Drawable D4;
    private ColorStateList E4;
    private float F4;
    private CharSequence G4;
    private boolean H4;
    private boolean I4;
    private Drawable J4;
    private ColorStateList K4;
    private h L4;
    private h M4;
    private float N4;
    private float O4;
    private float P4;
    private float Q4;
    private float R4;
    private float S4;
    private float T4;
    private float U4;
    private final Context V4;

    /* renamed from: c5 */
    private final k f7070c5;

    /* renamed from: d5 */
    private int f7071d5;

    /* renamed from: e5 */
    private int f7072e5;

    /* renamed from: f5 */
    private int f7073f5;

    /* renamed from: g5 */
    private int f7074g5;

    /* renamed from: h5 */
    private int f7075h5;

    /* renamed from: i5 */
    private int f7076i5;

    /* renamed from: j5 */
    private boolean f7077j5;

    /* renamed from: k5 */
    private int f7078k5;

    /* renamed from: m5 */
    private ColorFilter f7080m5;

    /* renamed from: n5 */
    private PorterDuffColorFilter f7081n5;

    /* renamed from: o4 */
    private ColorStateList f7082o4;

    /* renamed from: o5 */
    private ColorStateList f7083o5;

    /* renamed from: p4 */
    private ColorStateList f7084p4;

    /* renamed from: q4 */
    private float f7086q4;

    /* renamed from: q5 */
    private int[] f7087q5;

    /* renamed from: r5 */
    private boolean f7089r5;

    /* renamed from: s4 */
    private ColorStateList f7090s4;

    /* renamed from: s5 */
    private ColorStateList f7091s5;

    /* renamed from: t4 */
    private float f7092t4;

    /* renamed from: u4 */
    private ColorStateList f7094u4;

    /* renamed from: u5 */
    private TextUtils.TruncateAt f7095u5;

    /* renamed from: w4 */
    private boolean f7098w4;

    /* renamed from: w5 */
    private int f7099w5;

    /* renamed from: x4 */
    private Drawable f7100x4;

    /* renamed from: x5 */
    private boolean f7101x5;

    /* renamed from: y4 */
    private ColorStateList f7102y4;

    /* renamed from: z4 */
    private float f7103z4;

    /* renamed from: r4 */
    private float f7088r4 = -1.0f;
    private final Paint W4 = new Paint(1);
    private final Paint.FontMetrics Y4 = new Paint.FontMetrics();
    private final RectF Z4 = new RectF();

    /* renamed from: a5 */
    private final PointF f7068a5 = new PointF();

    /* renamed from: b5 */
    private final Path f7069b5 = new Path();

    /* renamed from: l5 */
    private int f7079l5 = 255;

    /* renamed from: p5 */
    private PorterDuff.Mode f7085p5 = PorterDuff.Mode.SRC_IN;

    /* renamed from: t5 */
    private WeakReference<AbstractC0102a> f7093t5 = new WeakReference<>(null);

    /* renamed from: v4 */
    private CharSequence f7096v4 = BuildConfig.FLAVOR;
    private final Paint X4 = null;

    /* renamed from: v5 */
    private boolean f7097v5 = true;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0102a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        O(context);
        this.V4 = context;
        k kVar = new k(this);
        this.f7070c5 = kVar;
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f7066y5;
        setState(iArr);
        n2(iArr);
        if (b.f20473a) {
            f7067z5.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (P2()) {
            n0(rect, this.Z4);
            RectF rectF = this.Z4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f7100x4.setBounds(0, 0, (int) this.Z4.width(), (int) this.Z4.height());
            this.f7100x4.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (this.f7092t4 <= 0.0f || this.f7101x5) {
            return;
        }
        this.W4.setColor(this.f7074g5);
        this.W4.setStyle(Paint.Style.STROKE);
        if (!this.f7101x5) {
            this.W4.setColorFilter(n1());
        }
        RectF rectF = this.Z4;
        float f10 = this.f7092t4;
        rectF.set(rect.left + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.f7088r4 - (this.f7092t4 / 2.0f);
        canvas.drawRoundRect(this.Z4, f11, f11, this.W4);
    }

    private void C0(Canvas canvas, Rect rect) {
        if (!this.f7101x5) {
            this.W4.setColor(this.f7071d5);
            this.W4.setStyle(Paint.Style.FILL);
            this.Z4.set(rect);
            canvas.drawRoundRect(this.Z4, K0(), K0(), this.W4);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (Q2()) {
            q0(rect, this.Z4);
            RectF rectF = this.Z4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.C4.setBounds(0, 0, (int) this.Z4.width(), (int) this.Z4.height());
            if (b.f20473a) {
                this.D4.setBounds(this.C4.getBounds());
                this.D4.jumpToCurrentState();
                drawable = this.D4;
            } else {
                drawable = this.C4;
            }
            drawable.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void E0(Canvas canvas, Rect rect) {
        this.W4.setColor(this.f7075h5);
        this.W4.setStyle(Paint.Style.FILL);
        this.Z4.set(rect);
        if (!this.f7101x5) {
            canvas.drawRoundRect(this.Z4, K0(), K0(), this.W4);
            return;
        }
        h(new RectF(rect), this.f7069b5);
        super.p(canvas, this.W4, this.f7069b5, u());
    }

    private void F0(Canvas canvas, Rect rect) {
        Paint paint = this.X4;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.j(-16777216, 127));
            canvas.drawRect(rect, this.X4);
            if (P2() || O2()) {
                n0(rect, this.Z4);
                canvas.drawRect(this.Z4, this.X4);
            }
            if (this.f7096v4 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.X4);
            }
            if (Q2()) {
                q0(rect, this.Z4);
                canvas.drawRect(this.Z4, this.X4);
            }
            this.X4.setColor(androidx.core.graphics.a.j(-65536, 127));
            p0(rect, this.Z4);
            canvas.drawRect(this.Z4, this.X4);
            this.X4.setColor(androidx.core.graphics.a.j(-16711936, 127));
            r0(rect, this.Z4);
            canvas.drawRect(this.Z4, this.X4);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        if (this.f7096v4 != null) {
            Paint.Align v02 = v0(rect, this.f7068a5);
            t0(rect, this.Z4);
            if (this.f7070c5.d() != null) {
                this.f7070c5.e().drawableState = getState();
                this.f7070c5.j(this.V4);
            }
            this.f7070c5.e().setTextAlign(v02);
            int i10 = 0;
            boolean z10 = Math.round(this.f7070c5.f(j1().toString())) > Math.round(this.Z4.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.Z4);
            }
            CharSequence charSequence = this.f7096v4;
            if (z10 && this.f7095u5 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f7070c5.e(), this.Z4.width(), this.f7095u5);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f7068a5;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f7070c5.e());
            if (!z10) {
                return;
            }
            canvas.restoreToCount(i10);
        }
    }

    private boolean O2() {
        return this.I4 && this.J4 != null && this.f7077j5;
    }

    private boolean P2() {
        return this.f7098w4 && this.f7100x4 != null;
    }

    private boolean Q2() {
        return this.B4 && this.C4 != null;
    }

    private void R2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void S2() {
        this.f7091s5 = this.f7089r5 ? b.d(this.f7094u4) : null;
    }

    @TargetApi(21)
    private void T2() {
        this.D4 = new RippleDrawable(b.d(h1()), this.C4, f7067z5);
    }

    private float b1() {
        Drawable drawable = this.f7077j5 ? this.J4 : this.f7100x4;
        float f10 = this.f7103z4;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(o.b(this.V4, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float c1() {
        Drawable drawable = this.f7077j5 ? this.J4 : this.f7100x4;
        float f10 = this.f7103z4;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void d2(ColorStateList colorStateList) {
        if (this.f7082o4 != colorStateList) {
            this.f7082o4 = colorStateList;
            onStateChange(getState());
        }
    }

    private void m0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.C4) {
            if (drawable.isStateful()) {
                drawable.setState(Y0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.E4);
            return;
        }
        Drawable drawable2 = this.f7100x4;
        if (drawable == drawable2 && this.A4) {
            androidx.core.graphics.drawable.a.o(drawable2, this.f7102y4);
        }
        if (!drawable.isStateful()) {
            return;
        }
        drawable.setState(getState());
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P2() || O2()) {
            float f10 = this.N4 + this.O4;
            float c12 = c1();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + c12;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - c12;
            }
            float b12 = b1();
            float exactCenterY = rect.exactCenterY() - (b12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + b12;
        }
    }

    private ColorFilter n1() {
        ColorFilter colorFilter = this.f7080m5;
        return colorFilter != null ? colorFilter : this.f7081n5;
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Q2()) {
            float f10 = this.U4 + this.T4 + this.F4 + this.S4 + this.R4;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean p1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f10 = this.U4 + this.T4;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.F4;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.F4;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.F4;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f10 = this.U4 + this.T4 + this.F4 + this.S4 + this.R4;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f7096v4 != null) {
            float o02 = this.N4 + o0() + this.Q4;
            float s02 = this.U4 + s0() + this.R4;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + o02;
                rectF.right = rect.right - s02;
            } else {
                rectF.left = rect.left + s02;
                rectF.right = rect.right - o02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean t1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float u0() {
        this.f7070c5.e().getFontMetrics(this.Y4);
        Paint.FontMetrics fontMetrics = this.Y4;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean u1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean v1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean w0() {
        return this.I4 && this.J4 != null && this.H4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.w1(android.util.AttributeSet, int, int):void");
    }

    public static a x0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.w1(attributeSet, i10, i11);
        return aVar;
    }

    private void y0(Canvas canvas, Rect rect) {
        if (O2()) {
            n0(rect, this.Z4);
            RectF rectF = this.Z4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.J4.setBounds(0, 0, (int) this.Z4.width(), (int) this.Z4.height());
            this.J4.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean y1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f7082o4;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f7071d5) : 0);
        boolean z11 = true;
        if (this.f7071d5 != l10) {
            this.f7071d5 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f7084p4;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7072e5) : 0);
        if (this.f7072e5 != l11) {
            this.f7072e5 = l11;
            onStateChange = true;
        }
        int g10 = i5.a.g(l10, l11);
        if ((this.f7073f5 != g10) | (x() == null)) {
            this.f7073f5 = g10;
            Z(ColorStateList.valueOf(g10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7090s4;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7074g5) : 0;
        if (this.f7074g5 != colorForState) {
            this.f7074g5 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f7091s5 == null || !b.e(iArr)) ? 0 : this.f7091s5.getColorForState(iArr, this.f7075h5);
        if (this.f7075h5 != colorForState2) {
            this.f7075h5 = colorForState2;
            if (this.f7089r5) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f7070c5.d() == null || this.f7070c5.d().i() == null) ? 0 : this.f7070c5.d().i().getColorForState(iArr, this.f7076i5);
        if (this.f7076i5 != colorForState3) {
            this.f7076i5 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = p1(getState(), 16842912) && this.H4;
        if (this.f7077j5 == z12 || this.J4 == null) {
            z10 = false;
        } else {
            float o02 = o0();
            this.f7077j5 = z12;
            if (o02 != o0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f7083o5;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7078k5) : 0;
        if (this.f7078k5 != colorForState4) {
            this.f7078k5 = colorForState4;
            this.f7081n5 = k5.a.b(this, this.f7083o5, this.f7085p5);
        } else {
            z11 = onStateChange;
        }
        if (u1(this.f7100x4)) {
            z11 |= this.f7100x4.setState(iArr);
        }
        if (u1(this.J4)) {
            z11 |= this.J4.setState(iArr);
        }
        if (u1(this.C4)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.C4.setState(iArr3);
        }
        if (b.f20473a && u1(this.D4)) {
            z11 |= this.D4.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            x1();
        }
        return z11;
    }

    private void z0(Canvas canvas, Rect rect) {
        if (!this.f7101x5) {
            this.W4.setColor(this.f7072e5);
            this.W4.setStyle(Paint.Style.FILL);
            this.W4.setColorFilter(n1());
            this.Z4.set(rect);
            canvas.drawRoundRect(this.Z4, K0(), K0(), this.W4);
        }
    }

    public void A1(int i10) {
        z1(this.V4.getResources().getBoolean(i10));
    }

    public void A2(ColorStateList colorStateList) {
        if (this.f7094u4 != colorStateList) {
            this.f7094u4 = colorStateList;
            S2();
            onStateChange(getState());
        }
    }

    public void B1(Drawable drawable) {
        if (this.J4 != drawable) {
            float o02 = o0();
            this.J4 = drawable;
            float o03 = o0();
            R2(this.J4);
            m0(this.J4);
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public void B2(int i10) {
        A2(g.a.a(this.V4, i10));
    }

    public void C1(int i10) {
        B1(g.a.b(this.V4, i10));
    }

    public void C2(boolean z10) {
        this.f7097v5 = z10;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.K4 != colorStateList) {
            this.K4 = colorStateList;
            if (w0()) {
                androidx.core.graphics.drawable.a.o(this.J4, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void D2(h hVar) {
        this.L4 = hVar;
    }

    public void E1(int i10) {
        D1(g.a.a(this.V4, i10));
    }

    public void E2(int i10) {
        D2(h.c(this.V4, i10));
    }

    public void F1(int i10) {
        G1(this.V4.getResources().getBoolean(i10));
    }

    public void F2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.f7096v4, charSequence)) {
            this.f7096v4 = charSequence;
            this.f7070c5.i(true);
            invalidateSelf();
            x1();
        }
    }

    public void G1(boolean z10) {
        if (this.I4 != z10) {
            boolean O2 = O2();
            this.I4 = z10;
            boolean O22 = O2();
            if (!(O2 != O22)) {
                return;
            }
            if (O22) {
                m0(this.J4);
            } else {
                R2(this.J4);
            }
            invalidateSelf();
            x1();
        }
    }

    public void G2(d dVar) {
        this.f7070c5.h(dVar, this.V4);
    }

    public Drawable H0() {
        return this.J4;
    }

    public void H1(ColorStateList colorStateList) {
        if (this.f7084p4 != colorStateList) {
            this.f7084p4 = colorStateList;
            onStateChange(getState());
        }
    }

    public void H2(int i10) {
        G2(new d(this.V4, i10));
    }

    public ColorStateList I0() {
        return this.K4;
    }

    public void I1(int i10) {
        H1(g.a.a(this.V4, i10));
    }

    public void I2(float f10) {
        if (this.R4 != f10) {
            this.R4 = f10;
            invalidateSelf();
            x1();
        }
    }

    public ColorStateList J0() {
        return this.f7084p4;
    }

    @Deprecated
    public void J1(float f10) {
        if (this.f7088r4 != f10) {
            this.f7088r4 = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void J2(int i10) {
        I2(this.V4.getResources().getDimension(i10));
    }

    public float K0() {
        return this.f7101x5 ? H() : this.f7088r4;
    }

    @Deprecated
    public void K1(int i10) {
        J1(this.V4.getResources().getDimension(i10));
    }

    public void K2(float f10) {
        if (this.Q4 != f10) {
            this.Q4 = f10;
            invalidateSelf();
            x1();
        }
    }

    public float L0() {
        return this.U4;
    }

    public void L1(float f10) {
        if (this.U4 != f10) {
            this.U4 = f10;
            invalidateSelf();
            x1();
        }
    }

    public void L2(int i10) {
        K2(this.V4.getResources().getDimension(i10));
    }

    public Drawable M0() {
        Drawable drawable = this.f7100x4;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void M1(int i10) {
        L1(this.V4.getResources().getDimension(i10));
    }

    public void M2(boolean z10) {
        if (this.f7089r5 != z10) {
            this.f7089r5 = z10;
            S2();
            onStateChange(getState());
        }
    }

    public float N0() {
        return this.f7103z4;
    }

    public void N1(Drawable drawable) {
        Drawable M0 = M0();
        if (M0 != drawable) {
            float o02 = o0();
            this.f7100x4 = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float o03 = o0();
            R2(M0);
            if (P2()) {
                m0(this.f7100x4);
            }
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public boolean N2() {
        return this.f7097v5;
    }

    public ColorStateList O0() {
        return this.f7102y4;
    }

    public void O1(int i10) {
        N1(g.a.b(this.V4, i10));
    }

    public float P0() {
        return this.f7086q4;
    }

    public void P1(float f10) {
        if (this.f7103z4 != f10) {
            float o02 = o0();
            this.f7103z4 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public float Q0() {
        return this.N4;
    }

    public void Q1(int i10) {
        P1(this.V4.getResources().getDimension(i10));
    }

    public ColorStateList R0() {
        return this.f7090s4;
    }

    public void R1(ColorStateList colorStateList) {
        this.A4 = true;
        if (this.f7102y4 != colorStateList) {
            this.f7102y4 = colorStateList;
            if (P2()) {
                androidx.core.graphics.drawable.a.o(this.f7100x4, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float S0() {
        return this.f7092t4;
    }

    public void S1(int i10) {
        R1(g.a.a(this.V4, i10));
    }

    public Drawable T0() {
        Drawable drawable = this.C4;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void T1(int i10) {
        U1(this.V4.getResources().getBoolean(i10));
    }

    public CharSequence U0() {
        return this.G4;
    }

    public void U1(boolean z10) {
        if (this.f7098w4 != z10) {
            boolean P2 = P2();
            this.f7098w4 = z10;
            boolean P22 = P2();
            if (!(P2 != P22)) {
                return;
            }
            if (P22) {
                m0(this.f7100x4);
            } else {
                R2(this.f7100x4);
            }
            invalidateSelf();
            x1();
        }
    }

    public float V0() {
        return this.T4;
    }

    public void V1(float f10) {
        if (this.f7086q4 != f10) {
            this.f7086q4 = f10;
            invalidateSelf();
            x1();
        }
    }

    public float W0() {
        return this.F4;
    }

    public void W1(int i10) {
        V1(this.V4.getResources().getDimension(i10));
    }

    public float X0() {
        return this.S4;
    }

    public void X1(float f10) {
        if (this.N4 != f10) {
            this.N4 = f10;
            invalidateSelf();
            x1();
        }
    }

    public int[] Y0() {
        return this.f7087q5;
    }

    public void Y1(int i10) {
        X1(this.V4.getResources().getDimension(i10));
    }

    public ColorStateList Z0() {
        return this.E4;
    }

    public void Z1(ColorStateList colorStateList) {
        if (this.f7090s4 != colorStateList) {
            this.f7090s4 = colorStateList;
            if (this.f7101x5) {
                h0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        x1();
        invalidateSelf();
    }

    public void a1(RectF rectF) {
        r0(getBounds(), rectF);
    }

    public void a2(int i10) {
        Z1(g.a.a(this.V4, i10));
    }

    public void b2(float f10) {
        if (this.f7092t4 != f10) {
            this.f7092t4 = f10;
            this.W4.setStrokeWidth(f10);
            if (this.f7101x5) {
                super.i0(f10);
            }
            invalidateSelf();
        }
    }

    public void c2(int i10) {
        b2(this.V4.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt d1() {
        return this.f7095u5;
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = 0;
        int i11 = this.f7079l5;
        if (i11 < 255) {
            i10 = e5.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        }
        C0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f7101x5) {
            super.draw(canvas);
        }
        B0(canvas, bounds);
        E0(canvas, bounds);
        A0(canvas, bounds);
        y0(canvas, bounds);
        if (this.f7097v5) {
            G0(canvas, bounds);
        }
        D0(canvas, bounds);
        F0(canvas, bounds);
        if (this.f7079l5 >= 255) {
            return;
        }
        canvas.restoreToCount(i10);
    }

    public h e1() {
        return this.M4;
    }

    public void e2(Drawable drawable) {
        Drawable T0 = T0();
        if (T0 != drawable) {
            float s02 = s0();
            this.C4 = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f20473a) {
                T2();
            }
            float s03 = s0();
            R2(T0);
            if (Q2()) {
                m0(this.C4);
            }
            invalidateSelf();
            if (s02 == s03) {
                return;
            }
            x1();
        }
    }

    public float f1() {
        return this.P4;
    }

    public void f2(CharSequence charSequence) {
        if (this.G4 != charSequence) {
            this.G4 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float g1() {
        return this.O4;
    }

    public void g2(float f10) {
        if (this.T4 != f10) {
            this.T4 = f10;
            invalidateSelf();
            if (!Q2()) {
                return;
            }
            x1();
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7079l5;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7080m5;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f7086q4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.N4 + o0() + this.Q4 + this.f7070c5.f(j1().toString()) + this.R4 + s0() + this.U4), this.f7099w5);
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f7101x5) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f7088r4);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f7088r4);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList h1() {
        return this.f7094u4;
    }

    public void h2(int i10) {
        g2(this.V4.getResources().getDimension(i10));
    }

    public h i1() {
        return this.L4;
    }

    public void i2(int i10) {
        e2(g.a.b(this.V4, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return t1(this.f7082o4) || t1(this.f7084p4) || t1(this.f7090s4) || (this.f7089r5 && t1(this.f7091s5)) || v1(this.f7070c5.d()) || w0() || u1(this.f7100x4) || u1(this.J4) || t1(this.f7083o5);
    }

    public CharSequence j1() {
        return this.f7096v4;
    }

    public void j2(float f10) {
        if (this.F4 != f10) {
            this.F4 = f10;
            invalidateSelf();
            if (!Q2()) {
                return;
            }
            x1();
        }
    }

    public d k1() {
        return this.f7070c5.d();
    }

    public void k2(int i10) {
        j2(this.V4.getResources().getDimension(i10));
    }

    public float l1() {
        return this.R4;
    }

    public void l2(float f10) {
        if (this.S4 != f10) {
            this.S4 = f10;
            invalidateSelf();
            if (!Q2()) {
                return;
            }
            x1();
        }
    }

    public float m1() {
        return this.Q4;
    }

    public void m2(int i10) {
        l2(this.V4.getResources().getDimension(i10));
    }

    public boolean n2(int[] iArr) {
        if (!Arrays.equals(this.f7087q5, iArr)) {
            this.f7087q5 = iArr;
            if (!Q2()) {
                return false;
            }
            return y1(getState(), iArr);
        }
        return false;
    }

    public float o0() {
        if (P2() || O2()) {
            return this.O4 + c1() + this.P4;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.f7089r5;
    }

    public void o2(ColorStateList colorStateList) {
        if (this.E4 != colorStateList) {
            this.E4 = colorStateList;
            if (Q2()) {
                androidx.core.graphics.drawable.a.o(this.C4, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (P2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f7100x4, i10);
        }
        if (O2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.J4, i10);
        }
        if (Q2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.C4, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (P2()) {
            onLevelChange |= this.f7100x4.setLevel(i10);
        }
        if (O2()) {
            onLevelChange |= this.J4.setLevel(i10);
        }
        if (Q2()) {
            onLevelChange |= this.C4.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // t5.g, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        if (this.f7101x5) {
            super.onStateChange(iArr);
        }
        return y1(iArr, Y0());
    }

    public void p2(int i10) {
        o2(g.a.a(this.V4, i10));
    }

    public boolean q1() {
        return this.H4;
    }

    public void q2(boolean z10) {
        if (this.B4 != z10) {
            boolean Q2 = Q2();
            this.B4 = z10;
            boolean Q22 = Q2();
            if (!(Q2 != Q22)) {
                return;
            }
            if (Q22) {
                m0(this.C4);
            } else {
                R2(this.C4);
            }
            invalidateSelf();
            x1();
        }
    }

    public boolean r1() {
        return u1(this.C4);
    }

    public void r2(AbstractC0102a abstractC0102a) {
        this.f7093t5 = new WeakReference<>(abstractC0102a);
    }

    public float s0() {
        if (Q2()) {
            return this.S4 + this.F4 + this.T4;
        }
        return 0.0f;
    }

    public boolean s1() {
        return this.B4;
    }

    public void s2(TextUtils.TruncateAt truncateAt) {
        this.f7095u5 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f7079l5 != i10) {
            this.f7079l5 = i10;
            invalidateSelf();
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7080m5 != colorFilter) {
            this.f7080m5 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f7083o5 != colorStateList) {
            this.f7083o5 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // t5.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f7085p5 != mode) {
            this.f7085p5 = mode;
            this.f7081n5 = k5.a.b(this, this.f7083o5, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (P2()) {
            visible |= this.f7100x4.setVisible(z10, z11);
        }
        if (O2()) {
            visible |= this.J4.setVisible(z10, z11);
        }
        if (Q2()) {
            visible |= this.C4.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(h hVar) {
        this.M4 = hVar;
    }

    public void u2(int i10) {
        t2(h.c(this.V4, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    Paint.Align v0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f7096v4 != null) {
            float o02 = this.N4 + o0() + this.Q4;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + o02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - o02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - u0();
        }
        return align;
    }

    public void v2(float f10) {
        if (this.P4 != f10) {
            float o02 = o0();
            this.P4 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public void w2(int i10) {
        v2(this.V4.getResources().getDimension(i10));
    }

    protected void x1() {
        AbstractC0102a abstractC0102a = this.f7093t5.get();
        if (abstractC0102a != null) {
            abstractC0102a.a();
        }
    }

    public void x2(float f10) {
        if (this.O4 != f10) {
            float o02 = o0();
            this.O4 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public void y2(int i10) {
        x2(this.V4.getResources().getDimension(i10));
    }

    public void z1(boolean z10) {
        if (this.H4 != z10) {
            this.H4 = z10;
            float o02 = o0();
            if (!z10 && this.f7077j5) {
                this.f7077j5 = false;
            }
            float o03 = o0();
            invalidateSelf();
            if (o02 == o03) {
                return;
            }
            x1();
        }
    }

    public void z2(int i10) {
        this.f7099w5 = i10;
    }
}
