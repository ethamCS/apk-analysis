package com.google.android.material.internal;

import a.g.l.u;
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
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import b.a.a.a.y.a;
/* loaded from: classes.dex */
public final class a {
    private static final boolean V;
    private static final Paint W;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;

    /* renamed from: a */
    private final View f1513a;

    /* renamed from: b */
    private boolean f1514b;

    /* renamed from: c */
    private float f1515c;
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
    private b.a.a.a.y.a v;
    private b.a.a.a.y.a w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private final TextPaint J = new TextPaint(129);
    private final TextPaint K = new TextPaint(this.J);
    private final Rect e = new Rect();
    private final Rect d = new Rect();
    private final RectF f = new RectF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    public class C0067a implements a.AbstractC0054a {
        C0067a() {
            a.this = r1;
        }

        @Override // b.a.a.a.y.a.AbstractC0054a
        public void a(Typeface typeface) {
            a.this.a(typeface);
        }
    }

    static {
        V = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        W = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            W.setColor(-65281);
        }
    }

    public a(View view) {
        this.f1513a = view;
    }

    private static float a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return b.a.a.a.m.a.a(f, f2, f3);
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void b(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private boolean b(CharSequence charSequence) {
        boolean z = true;
        if (u.o(this.f1513a) != 1) {
            z = false;
        }
        return (z ? a.g.j.e.d : a.g.j.e.f235c).a(charSequence, 0, charSequence.length());
    }

    private int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void c(float f) {
        int i;
        TextPaint textPaint;
        e(f);
        this.q = a(this.o, this.p, f, this.L);
        this.r = a(this.m, this.n, f, this.L);
        f(a(this.i, this.j, f, this.M));
        if (this.l != this.k) {
            textPaint = this.J;
            i = a(n(), d(), f);
        } else {
            textPaint = this.J;
            i = d();
        }
        textPaint.setColor(i);
        this.J.setShadowLayer(a(this.R, this.N, f, (TimeInterpolator) null), a(this.S, this.O, f, (TimeInterpolator) null), a(this.T, this.P, f, (TimeInterpolator) null), a(c(this.U), c(this.Q), f));
        u.H(this.f1513a);
    }

    private boolean c(Typeface typeface) {
        b.a.a.a.y.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.s != typeface) {
            this.s = typeface;
            return true;
        }
        return false;
    }

    private void d(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float width = this.e.width();
        float width2 = this.d.width();
        boolean z3 = true;
        if (a(f, this.j)) {
            f2 = this.j;
            this.F = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (a(f, this.i)) {
                this.F = 1.0f;
            } else {
                this.F = f / this.i;
            }
            float f4 = this.j / this.i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z = z2;
        }
        if (width > 0.0f) {
            z = this.G != f2 || this.I || z;
            this.G = f2;
            this.I = false;
        }
        if (this.y != null && !z) {
            return;
        }
        this.J.setTextSize(this.G);
        this.J.setTypeface(this.u);
        TextPaint textPaint = this.J;
        if (this.F == 1.0f) {
            z3 = false;
        }
        textPaint.setLinearText(z3);
        CharSequence ellipsize = TextUtils.ellipsize(this.x, this.J, width, TextUtils.TruncateAt.END);
        if (TextUtils.equals(ellipsize, this.y)) {
            return;
        }
        this.y = ellipsize;
        this.z = b(ellipsize);
    }

    private boolean d(Typeface typeface) {
        b.a.a.a.y.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
        if (this.t != typeface) {
            this.t = typeface;
            return true;
        }
        return false;
    }

    private void e(float f) {
        this.f.left = a(this.d.left, this.e.left, f, this.L);
        this.f.top = a(this.m, this.n, f, this.L);
        this.f.right = a(this.d.right, this.e.right, f, this.L);
        this.f.bottom = a(this.d.bottom, this.e.bottom, f, this.L);
    }

    private void f(float f) {
        d(f);
        boolean z = V && this.F != 1.0f;
        this.A = z;
        if (z) {
            m();
        }
        u.H(this.f1513a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.j():void");
    }

    private void k() {
        c(this.f1515c);
    }

    private void l() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void m() {
        if (this.B != null || this.d.isEmpty() || TextUtils.isEmpty(this.y)) {
            return;
        }
        c(0.0f);
        this.D = this.J.ascent();
        this.E = this.J.descent();
        TextPaint textPaint = this.J;
        CharSequence charSequence = this.y;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.E - this.D);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.B);
        CharSequence charSequence2 = this.y;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.J.descent(), this.J);
        if (this.C != null) {
            return;
        }
        this.C = new Paint(3);
    }

    private int n() {
        return c(this.k);
    }

    public float a() {
        if (this.x == null) {
            return 0.0f;
        }
        a(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void a(float f) {
        if (this.i != f) {
            this.i = f;
            i();
        }
    }

    public void a(int i) {
        b.a.a.a.y.d dVar = new b.a.a.a.y.d(this.f1513a.getContext(), i);
        ColorStateList colorStateList = dVar.f1249b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = dVar.f1248a;
        if (f != 0.0f) {
            this.j = f;
        }
        ColorStateList colorStateList2 = dVar.f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.g;
        this.P = dVar.h;
        this.N = dVar.i;
        b.a.a.a.y.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        this.w = new b.a.a.a.y.a(new C0067a(), dVar.a());
        dVar.a(this.f1513a.getContext(), this.w);
        i();
    }

    public void a(int i, int i2, int i3, int i4) {
        if (!a(this.e, i, i2, i3, i4)) {
            this.e.set(i, i2, i3, i4);
            this.I = true;
            h();
        }
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        i();
    }

    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.y != null && this.f1514b) {
            float f2 = this.q;
            float f3 = this.r;
            boolean z = this.A && this.B != null;
            if (z) {
                f = this.D * this.F;
            } else {
                f = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.B, f2, f4, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(Rect rect) {
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(RectF rectF) {
        boolean b2 = b(this.x);
        Rect rect = this.e;
        float a2 = !b2 ? rect.left : rect.right - a();
        rectF.left = a2;
        Rect rect2 = this.e;
        rectF.top = rect2.top;
        rectF.right = !b2 ? a2 + a() : rect2.right;
        rectF.bottom = this.e.top + c();
    }

    public void a(Typeface typeface) {
        if (c(typeface)) {
            i();
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            l();
            i();
        }
    }

    public final boolean a(int[] iArr) {
        this.H = iArr;
        if (g()) {
            i();
            return true;
        }
        return false;
    }

    public ColorStateList b() {
        return this.l;
    }

    public void b(float f) {
        float a2 = a.g.g.a.a(f, 0.0f, 1.0f);
        if (a2 != this.f1515c) {
            this.f1515c = a2;
            k();
        }
    }

    public void b(int i) {
        if (this.h != i) {
            this.h = i;
            i();
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        if (!a(this.d, i, i2, i3, i4)) {
            this.d.set(i, i2, i3, i4);
            this.I = true;
            h();
        }
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        i();
    }

    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            i();
        }
    }

    public void b(Rect rect) {
        b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void b(Typeface typeface) {
        boolean c2 = c(typeface);
        boolean d = d(typeface);
        if (c2 || d) {
            i();
        }
    }

    public float c() {
        a(this.K);
        return -this.K.ascent();
    }

    public void c(int i) {
        if (this.g != i) {
            this.g = i;
            i();
        }
    }

    public int d() {
        return c(this.l);
    }

    public float e() {
        b(this.K);
        return -this.K.ascent();
    }

    public float f() {
        return this.f1515c;
    }

    public final boolean g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    void h() {
        this.f1514b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void i() {
        if (this.f1513a.getHeight() <= 0 || this.f1513a.getWidth() <= 0) {
            return;
        }
        j();
        k();
    }
}
