package d.a.a.a.a0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import d.a.a.a.a0.k;
import d.a.a.a.a0.l;
import d.a.a.a.a0.m;
import java.util.BitSet;
/* loaded from: classes.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {
    private static final String x = g.class.getSimpleName();
    private static final Paint y = new Paint(1);

    /* renamed from: b */
    private c f3549b;

    /* renamed from: c */
    private final m.g[] f3550c;

    /* renamed from: d */
    private final m.g[] f3551d;

    /* renamed from: e */
    private final BitSet f3552e;

    /* renamed from: f */
    private boolean f3553f;

    /* renamed from: g */
    private final Matrix f3554g;

    /* renamed from: h */
    private final Path f3555h;
    private final Path i;
    private final RectF j;
    private final RectF k;
    private final Region l;
    private final Region m;
    private k n;
    private final Paint o;
    private final Paint p;
    private final d.a.a.a.z.a q;
    private final l.a r;
    private final l s;
    private PorterDuffColorFilter t;
    private PorterDuffColorFilter u;
    private final RectF v;
    private boolean w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.a {
        a() {
            g.this = r1;
        }

        @Override // d.a.a.a.a0.l.a
        public void a(m mVar, Matrix matrix, int i) {
            g.this.f3552e.set(i + 4, mVar.e());
            g.this.f3551d[i] = mVar.f(matrix);
        }

        @Override // d.a.a.a.a0.l.a
        public void b(m mVar, Matrix matrix, int i) {
            g.this.f3552e.set(i, mVar.e());
            g.this.f3550c[i] = mVar.f(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class b implements k.c {

        /* renamed from: a */
        final /* synthetic */ float f3557a;

        b(g gVar, float f2) {
            this.f3557a = f2;
        }

        @Override // d.a.a.a.a0.k.c
        public d.a.a.a.a0.c a(d.a.a.a.a0.c cVar) {
            return cVar instanceof i ? cVar : new d.a.a.a.a0.b(this.f3557a, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public k f3558a;

        /* renamed from: b */
        public d.a.a.a.t.a f3559b;

        /* renamed from: c */
        public ColorFilter f3560c;

        /* renamed from: d */
        public ColorStateList f3561d;

        /* renamed from: e */
        public ColorStateList f3562e;

        /* renamed from: f */
        public ColorStateList f3563f;

        /* renamed from: g */
        public ColorStateList f3564g;

        /* renamed from: h */
        public PorterDuff.Mode f3565h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(c cVar) {
            this.f3561d = null;
            this.f3562e = null;
            this.f3563f = null;
            this.f3564g = null;
            this.f3565h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f3558a = cVar.f3558a;
            this.f3559b = cVar.f3559b;
            this.l = cVar.l;
            this.f3560c = cVar.f3560c;
            this.f3561d = cVar.f3561d;
            this.f3562e = cVar.f3562e;
            this.f3565h = cVar.f3565h;
            this.f3564g = cVar.f3564g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f3563f = cVar.f3563f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        public c(k kVar, d.a.a.a.t.a aVar) {
            this.f3561d = null;
            this.f3562e = null;
            this.f3563f = null;
            this.f3564g = null;
            this.f3565h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f3558a = kVar;
            this.f3559b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f3553f = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.e(context, attributeSet, i, i2).m());
    }

    private g(c cVar) {
        this.f3550c = new m.g[4];
        this.f3551d = new m.g[4];
        this.f3552e = new BitSet(8);
        this.f3554g = new Matrix();
        this.f3555h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new d.a.a.a.z.a();
        this.s = new l();
        this.v = new RectF();
        this.w = true;
        this.f3549b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        g0();
        f0(getState());
        this.r = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private float D() {
        if (L()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f3549b;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.f3549b.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.f3549b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (!J()) {
            return;
        }
        canvas.save();
        S(canvas);
        if (!this.w) {
            n(canvas);
        } else {
            int width = (int) (this.v.width() - getBounds().width());
            int height = (int) (this.v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.f3549b.r * 2) + width, ((int) this.v.height()) + (this.f3549b.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (getBounds().left - this.f3549b.r) - width;
            float f3 = (getBounds().top - this.f3549b.r) - height;
            canvas2.translate(-f2, -f3);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
        }
        canvas.restore();
    }

    private static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        int z = z();
        int A = A();
        if (Build.VERSION.SDK_INT < 21 && this.w) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f3549b.r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(z, A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(z, A);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    private boolean f0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f3549b.f3561d == null || color2 == (colorForState2 = this.f3549b.f3561d.getColorForState(iArr, (color2 = this.o.getColor())))) {
            z = false;
        } else {
            this.o.setColor(colorForState2);
            z = true;
        }
        if (this.f3549b.f3562e == null || color == (colorForState = this.f3549b.f3562e.getColorForState(iArr, (color = this.p.getColor())))) {
            return z;
        }
        this.p.setColor(colorForState);
        return true;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f3549b.j != 1.0f) {
            this.f3554g.reset();
            Matrix matrix = this.f3554g;
            float f2 = this.f3549b.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f3554g);
        }
        path.computeBounds(this.v, true);
    }

    private boolean g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        c cVar = this.f3549b;
        this.t = k(cVar.f3564g, cVar.f3565h, this.o, true);
        c cVar2 = this.f3549b;
        this.u = k(cVar2.f3563f, cVar2.f3565h, this.p, false);
        c cVar3 = this.f3549b;
        if (cVar3.u) {
            this.q.d(cVar3.f3564g.getColorForState(getState(), 0));
        }
        return !b.g.k.c.a(porterDuffColorFilter, this.t) || !b.g.k.c.a(porterDuffColorFilter2, this.u);
    }

    private void h0() {
        float I = I();
        this.f3549b.r = (int) Math.ceil(0.75f * I);
        this.f3549b.s = (int) Math.ceil(I * 0.25f);
        g0();
        N();
    }

    private void i() {
        k x2 = C().x(new b(this, -D()));
        this.n = x2;
        this.s.d(x2, this.f3549b.k, v(), this.i);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    private int l(int i) {
        float I = I() + y();
        d.a.a.a.t.a aVar = this.f3549b.f3559b;
        return aVar != null ? aVar.c(i, I) : i;
    }

    public static g m(Context context, float f2) {
        int b2 = d.a.a.a.q.a.b(context, d.a.a.a.b.l_res_0x7f0400c4, g.class.getSimpleName());
        g gVar = new g();
        gVar.M(context);
        gVar.V(ColorStateList.valueOf(b2));
        gVar.U(f2);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f3552e.cardinality() > 0) {
            Log.w(x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f3549b.s != 0) {
            canvas.drawPath(this.f3555h, this.q.c());
        }
        for (int i = 0; i < 4; i++) {
            this.f3550c[i].b(this.q, this.f3549b.r, canvas);
            this.f3551d[i].b(this.q, this.f3549b.r, canvas);
        }
        if (this.w) {
            int z = z();
            int A = A();
            canvas.translate(-z, -A);
            canvas.drawPath(this.f3555h, y);
            canvas.translate(z, A);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.o, this.f3555h, this.f3549b.f3558a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = kVar.t().a(rectF) * this.f3549b.k;
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    private void r(Canvas canvas) {
        q(canvas, this.p, this.i, this.n, v());
    }

    private RectF v() {
        this.k.set(u());
        float D = D();
        this.k.inset(D, D);
        return this.k;
    }

    public int A() {
        c cVar = this.f3549b;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public int B() {
        return this.f3549b.r;
    }

    public k C() {
        return this.f3549b.f3558a;
    }

    public ColorStateList E() {
        return this.f3549b.f3564g;
    }

    public float F() {
        return this.f3549b.f3558a.r().a(u());
    }

    public float G() {
        return this.f3549b.f3558a.t().a(u());
    }

    public float H() {
        return this.f3549b.p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f3549b.f3559b = new d.a.a.a.t.a(context);
        h0();
    }

    public boolean O() {
        d.a.a.a.t.a aVar = this.f3549b.f3559b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f3549b.f3558a.u(u());
    }

    public boolean T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || (!P() && !this.f3555h.isConvex() && i < 29);
    }

    public void U(float f2) {
        c cVar = this.f3549b;
        if (cVar.o != f2) {
            cVar.o = f2;
            h0();
        }
    }

    public void V(ColorStateList colorStateList) {
        c cVar = this.f3549b;
        if (cVar.f3561d != colorStateList) {
            cVar.f3561d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f2) {
        c cVar = this.f3549b;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.f3553f = true;
            invalidateSelf();
        }
    }

    public void X(int i, int i2, int i3, int i4) {
        c cVar = this.f3549b;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f3549b.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Y(float f2) {
        c cVar = this.f3549b;
        if (cVar.n != f2) {
            cVar.n = f2;
            h0();
        }
    }

    public void Z(int i) {
        this.q.d(i);
        this.f3549b.u = false;
        N();
    }

    public void a0(int i) {
        c cVar = this.f3549b;
        if (cVar.t != i) {
            cVar.t = i;
            N();
        }
    }

    public void b0(float f2, int i) {
        e0(f2);
        d0(ColorStateList.valueOf(i));
    }

    public void c0(float f2, ColorStateList colorStateList) {
        e0(f2);
        d0(colorStateList);
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.f3549b;
        if (cVar.f3562e != colorStateList) {
            cVar.f3562e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.o.setColorFilter(this.t);
        int alpha = this.o.getAlpha();
        this.o.setAlpha(R(alpha, this.f3549b.m));
        this.p.setColorFilter(this.u);
        this.p.setStrokeWidth(this.f3549b.l);
        int alpha2 = this.p.getAlpha();
        this.p.setAlpha(R(alpha2, this.f3549b.m));
        if (this.f3553f) {
            i();
            g(u(), this.f3555h);
            this.f3553f = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.o.setAlpha(alpha);
        this.p.setAlpha(alpha2);
    }

    public void e0(float f2) {
        this.f3549b.l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3549b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f3549b.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.f3549b.k);
            return;
        }
        g(u(), this.f3555h);
        if (!this.f3555h.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.f3555h);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f3549b.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.l.set(getBounds());
        g(u(), this.f3555h);
        this.m.setPath(this.f3555h, this.l);
        this.l.op(this.m, Region.Op.DIFFERENCE);
        return this.l;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.s;
        c cVar = this.f3549b;
        lVar.e(cVar.f3558a, cVar.k, rectF, this.r, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f3553f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f3549b.f3564g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f3549b.f3563f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f3549b.f3562e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f3549b.f3561d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3549b = new c(this.f3549b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f3553f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.n.b
    public boolean onStateChange(int[] iArr) {
        boolean z = f0(iArr) || g0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f3549b.f3558a, rectF);
    }

    public float s() {
        return this.f3549b.f3558a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.f3549b;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3549b.f3560c = colorFilter;
        N();
    }

    @Override // d.a.a.a.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f3549b.f3558a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f3549b.f3564g = colorStateList;
        g0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f3549b;
        if (cVar.f3565h != mode) {
            cVar.f3565h = mode;
            g0();
            N();
        }
    }

    public float t() {
        return this.f3549b.f3558a.l().a(u());
    }

    public RectF u() {
        this.j.set(getBounds());
        return this.j;
    }

    public float w() {
        return this.f3549b.o;
    }

    public ColorStateList x() {
        return this.f3549b.f3561d;
    }

    public float y() {
        return this.f3549b.n;
    }

    public int z() {
        c cVar = this.f3549b;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }
}
