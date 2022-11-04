package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import androidx.core.view.y;
import com.google.android.material.internal.j;
import q5.a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: t0 */
    private static final boolean f7335t0 = false;

    /* renamed from: u0 */
    private static final Paint f7336u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private q5.a E;
    private q5.a F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a */
    private final View f7337a;

    /* renamed from: a0 */
    private float f7338a0;

    /* renamed from: b */
    private boolean f7339b;

    /* renamed from: b0 */
    private float f7340b0;

    /* renamed from: c */
    private float f7341c;

    /* renamed from: c0 */
    private ColorStateList f7342c0;

    /* renamed from: d */
    private boolean f7343d;

    /* renamed from: d0 */
    private float f7344d0;

    /* renamed from: e */
    private float f7345e;

    /* renamed from: e0 */
    private float f7346e0;

    /* renamed from: f0 */
    private float f7348f0;

    /* renamed from: g */
    private int f7349g;

    /* renamed from: g0 */
    private ColorStateList f7350g0;

    /* renamed from: h0 */
    private float f7352h0;

    /* renamed from: i0 */
    private float f7354i0;

    /* renamed from: j0 */
    private float f7356j0;

    /* renamed from: k0 */
    private StaticLayout f7358k0;

    /* renamed from: l0 */
    private float f7360l0;

    /* renamed from: m0 */
    private float f7362m0;

    /* renamed from: n0 */
    private float f7364n0;

    /* renamed from: o */
    private ColorStateList f7365o;

    /* renamed from: o0 */
    private CharSequence f7366o0;

    /* renamed from: p */
    private ColorStateList f7367p;

    /* renamed from: q */
    private int f7369q;

    /* renamed from: r */
    private float f7371r;

    /* renamed from: s */
    private float f7373s;

    /* renamed from: t */
    private float f7375t;

    /* renamed from: u */
    private float f7376u;

    /* renamed from: v */
    private float f7377v;

    /* renamed from: w */
    private float f7378w;

    /* renamed from: x */
    private Typeface f7379x;

    /* renamed from: y */
    private Typeface f7380y;

    /* renamed from: z */
    private Typeface f7381z;

    /* renamed from: k */
    private int f7357k = 16;

    /* renamed from: l */
    private int f7359l = 16;

    /* renamed from: m */
    private float f7361m = 15.0f;

    /* renamed from: n */
    private float f7363n = 15.0f;
    private boolean J = true;

    /* renamed from: p0 */
    private int f7368p0 = 1;

    /* renamed from: q0 */
    private float f7370q0 = 0.0f;

    /* renamed from: r0 */
    private float f7372r0 = 1.0f;

    /* renamed from: s0 */
    private int f7374s0 = j.f7402n;

    /* renamed from: i */
    private final Rect f7353i = new Rect();

    /* renamed from: h */
    private final Rect f7351h = new Rect();

    /* renamed from: j */
    private final RectF f7355j = new RectF();

    /* renamed from: f */
    private float f7347f = e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.AbstractC0317a {
        a() {
            b.this = r1;
        }

        @Override // q5.a.AbstractC0317a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f7337a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f7361m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f7354i0);
    }

    private void B(float f10) {
        if (this.f7343d) {
            this.f7355j.set(f10 < this.f7347f ? this.f7351h : this.f7353i);
            return;
        }
        this.f7355j.left = G(this.f7351h.left, this.f7353i.left, f10, this.X);
        this.f7355j.top = G(this.f7371r, this.f7373s, f10, this.X);
        this.f7355j.right = G(this.f7351h.right, this.f7353i.right, f10, this.X);
        this.f7355j.bottom = G(this.f7351h.bottom, this.f7353i.bottom, f10, this.X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return y.B(this.f7337a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? androidx.core.text.e.f3586d : androidx.core.text.e.f3585c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return c5.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f7362m0 = f10;
        y.f0(this.f7337a);
    }

    private boolean U(Typeface typeface) {
        q5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f7381z != typeface) {
            this.f7381z = typeface;
            Typeface b10 = q5.g.b(this.f7337a.getContext().getResources().getConfiguration(), typeface);
            this.f7380y = b10;
            if (b10 == null) {
                b10 = this.f7381z;
            }
            this.f7379x = b10;
            return true;
        }
        return false;
    }

    private void Y(float f10) {
        this.f7364n0 = f10;
        y.f0(this.f7337a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(boolean r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.b.b(boolean):void");
    }

    private void c() {
        g(this.f7341c);
    }

    private boolean c0(Typeface typeface) {
        q5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C != typeface) {
            this.C = typeface;
            Typeface b10 = q5.g.b(this.f7337a.getContext().getResources().getConfiguration(), typeface);
            this.B = b10;
            if (b10 == null) {
                b10 = this.C;
            }
            this.A = b10;
            return true;
        }
        return false;
    }

    private float d(float f10) {
        float f11 = this.f7347f;
        return f10 <= f11 ? c5.a.b(1.0f, 0.0f, this.f7345e, f11, f10) : c5.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f7345e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void e0(float f10) {
        h(f10);
        boolean z10 = f7335t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        y.f0(this.f7337a);
    }

    private boolean f(CharSequence charSequence) {
        boolean D = D();
        return this.J ? F(charSequence, D) : D;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f7343d) {
            this.f7377v = G(this.f7375t, this.f7376u, f10, this.X);
            this.f7378w = G(this.f7371r, this.f7373s, f10, this.X);
            e0(f10);
            f11 = f10;
        } else if (f10 < this.f7347f) {
            this.f7377v = this.f7375t;
            this.f7378w = this.f7371r;
            e0(0.0f);
            f11 = 0.0f;
        } else {
            this.f7377v = this.f7376u;
            this.f7378w = this.f7373s - Math.max(0, this.f7349g);
            e0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = c5.a.f6268b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f7367p != this.f7365o) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        float f12 = this.f7352h0;
        float f13 = this.f7354i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = G(this.f7344d0, this.Z, f10, null);
        this.Q = G(this.f7346e0, this.f7338a0, f10, null);
        this.R = G(this.f7348f0, this.f7340b0, f10, null);
        int a10 = a(u(this.f7350g0), u(this.f7342c0), f10);
        this.S = a10;
        this.V.setShadowLayer(this.P, this.Q, this.R, a10);
        if (this.f7343d) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
        }
        y.f0(this.f7337a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        boolean z12;
        if (this.G == null) {
            return;
        }
        float width = this.f7353i.width();
        float width2 = this.f7351h.width();
        boolean z13 = false;
        int i10 = 1;
        if (C(f10, 1.0f)) {
            f12 = this.f7363n;
            f11 = this.f7352h0;
            this.N = 1.0f;
            Typeface typeface = this.D;
            Typeface typeface2 = this.f7379x;
            if (typeface != typeface2) {
                this.D = typeface2;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            float f13 = this.f7361m;
            float f14 = this.f7354i0;
            Typeface typeface3 = this.D;
            Typeface typeface4 = this.A;
            if (typeface3 != typeface4) {
                this.D = typeface4;
                z12 = true;
            } else {
                z12 = false;
            }
            if (C(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f7361m, this.f7363n, f10, this.Y) / this.f7361m;
            }
            float f15 = this.f7363n / this.f7361m;
            width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
            f12 = f13;
            f11 = f14;
            z11 = z12;
        }
        if (width > 0.0f) {
            z11 = ((this.O > f12 ? 1 : (this.O == f12 ? 0 : -1)) != 0) || ((this.f7356j0 > f11 ? 1 : (this.f7356j0 == f11 ? 0 : -1)) != 0) || this.U || z11;
            this.O = f12;
            this.f7356j0 = f11;
            this.U = false;
        }
        if (this.H != null && !z11) {
            return;
        }
        this.V.setTextSize(this.O);
        this.V.setTypeface(this.D);
        this.V.setLetterSpacing(this.f7356j0);
        TextPaint textPaint = this.V;
        if (this.N != 1.0f) {
            z13 = true;
        }
        textPaint.setLinearText(z13);
        this.I = f(this.G);
        if (k0()) {
            i10 = this.f7368p0;
        }
        StaticLayout k10 = k(i10, width, this.I);
        this.f7358k0 = k10;
        this.H = k10.getText();
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = j.b(this.G, this.V, (int) f10).d(TextUtils.TruncateAt.END).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f7370q0, this.f7372r0).e(this.f7374s0).a();
        } catch (j.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayout = null;
        }
        return (StaticLayout) androidx.core.util.h.g(staticLayout);
    }

    private boolean k0() {
        return this.f7368p0 > 1 && (!this.I || this.f7343d) && !this.K;
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.V.setAlpha((int) (this.f7364n0 * f12));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, i5.a.a(this.S, textPaint.getAlpha()));
        }
        this.f7358k0.draw(canvas);
        this.V.setAlpha((int) (this.f7362m0 * f12));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, i5.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f7358k0.getLineBaseline(0);
        CharSequence charSequence = this.f7366o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (!this.f7343d) {
            String trim = this.f7366o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f7358k0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.V);
        }
    }

    private void n() {
        if (this.L != null || this.f7351h.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f7358k0.getWidth();
        int height = this.f7358k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f7358k0.draw(new Canvas(this.L));
        if (this.M != null) {
            return;
        }
        this.M = new Paint(3);
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f7360l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? this.f7353i.left : this.f7353i.right - this.f7360l0 : this.I ? this.f7353i.right - this.f7360l0 : this.f7353i.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f7360l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? rectF.left + this.f7360l0 : this.f7353i.right : this.I ? this.f7353i.right : rectF.left + this.f7360l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f7365o);
    }

    private Layout.Alignment y() {
        int b10 = androidx.core.view.e.b(this.f7357k, this.I ? 1 : 0) & 7;
        return b10 != 1 ? b10 != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f7363n);
        textPaint.setTypeface(this.f7379x);
        textPaint.setLetterSpacing(this.f7352h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f7367p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f7365o) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f7381z;
            if (typeface != null) {
                this.f7380y = q5.g.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = q5.g.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f7380y;
            if (typeface3 == null) {
                typeface3 = this.f7381z;
            }
            this.f7379x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            L(true);
        }
    }

    void J() {
        this.f7339b = this.f7353i.width() > 0 && this.f7353i.height() > 0 && this.f7351h.width() > 0 && this.f7351h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f7337a.getHeight() <= 0 || this.f7337a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (!M(this.f7353i, i10, i11, i12, i13)) {
            this.f7353i.set(i10, i11, i12, i13);
            this.U = true;
            J();
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        q5.d dVar = new q5.d(this.f7337a.getContext(), i10);
        if (dVar.i() != null) {
            this.f7367p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f7363n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f19651c;
        if (colorStateList != null) {
            this.f7342c0 = colorStateList;
        }
        this.f7338a0 = dVar.f19656h;
        this.f7340b0 = dVar.f19657i;
        this.Z = dVar.f19658j;
        this.f7352h0 = dVar.f19660l;
        q5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new q5.a(new a(), dVar.e());
        dVar.h(this.f7337a.getContext(), this.F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f7367p != colorStateList) {
            this.f7367p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f7359l != i10) {
            this.f7359l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (!M(this.f7351h, i10, i11, i12, i13)) {
            this.f7351h.set(i10, i11, i12, i13);
            this.U = true;
            J();
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f7354i0 != f10) {
            this.f7354i0 = f10;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f7365o != colorStateList) {
            this.f7365o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f7357k != i10) {
            this.f7357k = i10;
            K();
        }
    }

    public void b0(float f10) {
        if (this.f7361m != f10) {
            this.f7361m = f10;
            K();
        }
    }

    public void d0(float f10) {
        float a10 = s0.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f7341c) {
            this.f7341c = a10;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.T = iArr;
        if (E()) {
            K();
            return true;
        }
        return false;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean U = U(typeface);
        boolean c02 = c0(typeface);
        if (U || c02) {
            K();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H == null || !this.f7339b) {
            return;
        }
        this.V.setTextSize(this.O);
        float f10 = this.f7377v;
        float f11 = this.f7378w;
        boolean z10 = this.K && this.L != null;
        float f12 = this.N;
        if (f12 != 1.0f && !this.f7343d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f10, f11, this.M);
            canvas.restoreToCount(save);
            return;
        }
        if (!k0() || (this.f7343d && this.f7341c <= this.f7347f)) {
            canvas.translate(f10, f11);
            this.f7358k0.draw(canvas);
        } else {
            m(canvas, this.f7377v - this.f7358k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = r(i10, i11);
        rectF.top = this.f7353i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = this.f7353i.top + q();
    }

    public ColorStateList p() {
        return this.f7367p;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f7367p);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f7341c;
    }
}
