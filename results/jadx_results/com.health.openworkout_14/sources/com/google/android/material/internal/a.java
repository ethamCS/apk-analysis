package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b.g.l.t;
import com.google.android.material.internal.m;
import d.a.a.a.x.a;
/* loaded from: classes.dex */
public final class a {
    private static final boolean Z;
    private static final Paint a0;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private final TextPaint I;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private ColorStateList O;
    private float P;
    private float Q;
    private float R;
    private ColorStateList S;
    private StaticLayout T;
    private float U;
    private float V;
    private float W;
    private CharSequence X;

    /* renamed from: a */
    private final View f3171a;

    /* renamed from: b */
    private boolean f3172b;

    /* renamed from: c */
    private float f3173c;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private d.a.a.a.x.a v;
    private d.a.a.a.x.a w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: g */
    private int f3177g = 16;

    /* renamed from: h */
    private int f3178h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private int Y = 1;

    /* renamed from: e */
    private final Rect f3175e = new Rect();

    /* renamed from: d */
    private final Rect f3174d = new Rect();

    /* renamed from: f */
    private final RectF f3176f = new RectF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    public class C0076a implements a.AbstractC0103a {
        C0076a() {
            a.this = r1;
        }

        @Override // d.a.a.a.x.a.AbstractC0103a
        public void a(Typeface typeface) {
            a.this.M(typeface);
        }
    }

    static {
        Z = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        a0 = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public a(View view) {
        this.f3171a = view;
        TextPaint textPaint = new TextPaint(129);
        this.H = textPaint;
        this.I = new TextPaint(textPaint);
    }

    private boolean A() {
        return t.y(this.f3171a) == 1;
    }

    private static float C(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return d.a.a.a.l.a.a(f2, f3, f4);
    }

    private static boolean F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void J(float f2) {
        this.U = f2;
        t.Z(this.f3171a);
    }

    private boolean N(Typeface typeface) {
        d.a.a.a.x.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.s != typeface) {
            this.s = typeface;
            return true;
        }
        return false;
    }

    private void Q(float f2) {
        this.V = f2;
        t.Z(this.f3171a);
    }

    private boolean U(Typeface typeface) {
        d.a.a.a.x.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.t != typeface) {
            this.t = typeface;
            return true;
        }
        return false;
    }

    private void W(float f2) {
        g(f2);
        boolean z = Z && this.D != 1.0f;
        this.A = z;
        if (z) {
            l();
        }
        t.Z(this.f3171a);
    }

    private static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i) * f3) + (Color.alpha(i2) * f2)), (int) ((Color.red(i) * f3) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f3) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f3) + (Color.blue(i2) * f2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b():void");
    }

    private boolean c0() {
        return this.Y > 1 && !this.z && !this.A;
    }

    private void d() {
        f(this.f3173c);
    }

    private boolean e(CharSequence charSequence) {
        return (A() ? b.g.j.e.f2483d : b.g.j.e.f2482c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f2) {
        int i;
        TextPaint textPaint;
        y(f2);
        this.q = C(this.o, this.p, f2, this.J);
        this.r = C(this.m, this.n, f2, this.J);
        W(C(this.i, this.j, f2, this.K));
        TimeInterpolator timeInterpolator = d.a.a.a.l.a.f3641b;
        J(1.0f - C(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        Q(C(1.0f, 0.0f, f2, timeInterpolator));
        if (this.l != this.k) {
            textPaint = this.H;
            i = a(t(), r(), f2);
        } else {
            textPaint = this.H;
            i = r();
        }
        textPaint.setColor(i);
        this.H.setShadowLayer(C(this.P, this.L, f2, null), C(this.Q, this.M, f2, null), C(this.R, this.N, f2, null), a(s(this.S), s(this.O), f2));
        t.Z(this.f3171a);
    }

    private void g(float f2) {
        float f3;
        boolean z;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float width = this.f3175e.width();
        float width2 = this.f3174d.width();
        boolean z3 = false;
        int i = 1;
        if (z(f2, this.j)) {
            f3 = this.j;
            this.D = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f4 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z(f2, f4)) {
                this.D = 1.0f;
            } else {
                this.D = f2 / this.i;
            }
            float f5 = this.j / this.i;
            width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            f3 = f4;
            z = z2;
        }
        if (width > 0.0f) {
            z = this.E != f3 || this.G || z;
            this.E = f3;
            this.G = false;
        }
        if (this.y != null && !z) {
            return;
        }
        this.H.setTextSize(this.E);
        this.H.setTypeface(this.u);
        TextPaint textPaint = this.H;
        if (this.D != 1.0f) {
            z3 = true;
        }
        textPaint.setLinearText(z3);
        this.z = e(this.x);
        if (c0()) {
            i = this.Y;
        }
        StaticLayout i2 = i(i, width, this.z);
        this.T = i2;
        this.y = i2.getText();
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private StaticLayout i(int i, float f2, boolean z) {
        StaticLayout staticLayout;
        try {
            m c2 = m.c(this.x, this.H, (int) f2);
            c2.e(TextUtils.TruncateAt.END);
            c2.g(z);
            c2.d(Layout.Alignment.ALIGN_NORMAL);
            c2.f(false);
            c2.h(i);
            staticLayout = c2.a();
        } catch (m.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayout = null;
        }
        b.g.k.h.c(staticLayout);
        return staticLayout;
    }

    private void k(Canvas canvas, float f2, float f3) {
        int alpha = this.H.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.H.setAlpha((int) (this.V * f4));
        this.T.draw(canvas);
        this.H.setAlpha((int) (this.U * f4));
        int lineBaseline = this.T.getLineBaseline(0);
        CharSequence charSequence = this.X;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.H);
        String trim = this.X.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.T.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.H);
    }

    private void l() {
        if (this.B != null || this.f3174d.isEmpty() || TextUtils.isEmpty(this.y)) {
            return;
        }
        f(0.0f);
        int width = this.T.getWidth();
        int height = this.T.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.T.draw(new Canvas(this.B));
        if (this.C != null) {
            return;
        }
        this.C = new Paint(3);
    }

    private float p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.z ? this.f3175e.left : this.f3175e.right - c() : this.z ? this.f3175e.right - c() : this.f3175e.left;
    }

    private float q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.z ? rectF.left + c() : this.f3175e.right : this.z ? this.f3175e.right : rectF.left + c();
    }

    private int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int t() {
        return s(this.k);
    }

    private void w(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private void x(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private void y(float f2) {
        this.f3176f.left = C(this.f3174d.left, this.f3175e.left, f2, this.J);
        this.f3176f.top = C(this.m, this.n, f2, this.J);
        this.f3176f.right = C(this.f3174d.right, this.f3175e.right, f2, this.J);
        this.f3176f.bottom = C(this.f3174d.bottom, this.f3175e.bottom, f2, this.J);
    }

    private static boolean z(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    public final boolean B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    void D() {
        this.f3172b = this.f3175e.width() > 0 && this.f3175e.height() > 0 && this.f3174d.width() > 0 && this.f3174d.height() > 0;
    }

    public void E() {
        if (this.f3171a.getHeight() <= 0 || this.f3171a.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void G(int i, int i2, int i3, int i4) {
        if (!F(this.f3175e, i, i2, i3, i4)) {
            this.f3175e.set(i, i2, i3, i4);
            this.G = true;
            D();
        }
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i) {
        d.a.a.a.x.d dVar = new d.a.a.a.x.d(this.f3171a.getContext(), i);
        ColorStateList colorStateList = dVar.f3696b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = dVar.f3695a;
        if (f2 != 0.0f) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = dVar.f3700f;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = dVar.f3701g;
        this.N = dVar.f3702h;
        this.L = dVar.i;
        d.a.a.a.x.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        this.w = new d.a.a.a.x.a(new C0076a(), dVar.e());
        dVar.h(this.f3171a.getContext(), this.w);
        E();
    }

    public void K(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            E();
        }
    }

    public void L(int i) {
        if (this.f3178h != i) {
            this.f3178h = i;
            E();
        }
    }

    public void M(Typeface typeface) {
        if (N(typeface)) {
            E();
        }
    }

    public void O(int i, int i2, int i3, int i4) {
        if (!F(this.f3174d, i, i2, i3, i4)) {
            this.f3174d.set(i, i2, i3, i4);
            this.G = true;
            D();
        }
    }

    public void P(Rect rect) {
        O(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void R(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            E();
        }
    }

    public void S(int i) {
        if (this.f3177g != i) {
            this.f3177g = i;
            E();
        }
    }

    public void T(float f2) {
        if (this.i != f2) {
            this.i = f2;
            E();
        }
    }

    public void V(float f2) {
        float a2 = b.g.g.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f3173c) {
            this.f3173c = a2;
            d();
        }
    }

    public void X(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) {
        this.F = iArr;
        if (B()) {
            E();
            return true;
        }
        return false;
    }

    public void Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        E();
    }

    public void b0(Typeface typeface) {
        boolean N = N(typeface);
        boolean U = U(typeface);
        if (N || U) {
            E();
        }
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        w(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.y == null || !this.f3172b) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.q + this.T.getLineLeft(0)) - (this.W * 2.0f);
        this.H.setTextSize(this.E);
        float f2 = this.q;
        float f3 = this.r;
        if (this.A && this.B != null) {
            z = true;
        }
        float f4 = this.D;
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.B, f2, f3, this.C);
            canvas.restoreToCount(save);
            return;
        }
        if (c0()) {
            k(canvas, lineLeft, f3);
        } else {
            canvas.translate(f2, f3);
            this.T.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void m(RectF rectF, int i, int i2) {
        this.z = e(this.x);
        rectF.left = p(i, i2);
        rectF.top = this.f3175e.top;
        rectF.right = q(rectF, i, i2);
        rectF.bottom = this.f3175e.top + o();
    }

    public ColorStateList n() {
        return this.l;
    }

    public float o() {
        w(this.I);
        return -this.I.ascent();
    }

    public int r() {
        return s(this.l);
    }

    public float u() {
        x(this.I);
        return -this.I.ascent();
    }

    public float v() {
        return this.f3173c;
    }
}
