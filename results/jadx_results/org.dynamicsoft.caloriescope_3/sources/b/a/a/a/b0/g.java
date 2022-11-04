package b.a.a.a.b0;

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
import b.a.a.a.b0.k;
import b.a.a.a.b0.l;
import b.a.a.a.b0.m;
/* loaded from: classes.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {
    private static final Paint w = new Paint(1);

    /* renamed from: b */
    private c f1173b;

    /* renamed from: c */
    private final m.g[] f1174c;
    private final m.g[] d;
    private boolean e;
    private final Matrix f;
    private final Path g;
    private final Path h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private k m;
    private final Paint n;
    private final Paint o;
    private final b.a.a.a.a0.a p;
    private final l.a q;
    private final l r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private Rect u;
    private final RectF v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.a {
        a() {
            g.this = r1;
        }

        @Override // b.a.a.a.b0.l.a
        public void a(m mVar, Matrix matrix, int i) {
            g.this.f1174c[i] = mVar.a(matrix);
        }

        @Override // b.a.a.a.b0.l.a
        public void b(m mVar, Matrix matrix, int i) {
            g.this.d[i] = mVar.a(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class b implements k.c {

        /* renamed from: a */
        final /* synthetic */ float f1176a;

        b(g gVar, float f) {
            this.f1176a = f;
        }

        @Override // b.a.a.a.b0.k.c
        public b.a.a.a.b0.c a(b.a.a.a.b0.c cVar) {
            return cVar instanceof i ? cVar : new b.a.a.a.b0.b(this.f1176a, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public k f1177a;

        /* renamed from: b */
        public b.a.a.a.u.a f1178b;

        /* renamed from: c */
        public ColorFilter f1179c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
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
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
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
            this.f1177a = cVar.f1177a;
            this.f1178b = cVar.f1178b;
            this.l = cVar.l;
            this.f1179c = cVar.f1179c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
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
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        public c(k kVar, b.a.a.a.u.a aVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
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
            this.f1177a = kVar;
            this.f1178b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.e = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.a(context, attributeSet, i, i2).a());
    }

    private g(c cVar) {
        this.f1174c = new m.g[4];
        this.d = new m.g[4];
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new b.a.a.a.a0.a();
        this.r = new l();
        this.v = new RectF();
        this.f1173b = cVar;
        this.o.setStyle(Paint.Style.STROKE);
        this.n.setStyle(Paint.Style.FILL);
        w.setColor(-1);
        w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A();
        a(getState());
        this.q = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.f1173b;
        this.s = a(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.f1173b;
        this.t = a(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.f1173b;
        if (cVar3.u) {
            this.p.a(cVar3.g.getColorForState(getState(), 0));
        }
        return !a.g.k.c.a(porterDuffColorFilter, this.s) || !a.g.k.c.a(porterDuffColorFilter2, this.t);
    }

    private void B() {
        float p = p();
        this.f1173b.r = (int) Math.ceil(0.75f * p);
        this.f1173b.s = (int) Math.ceil(p * 0.25f);
        A();
        y();
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? a(paint, z) : a(colorStateList, mode, z);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = b(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter a(Paint paint, boolean z) {
        int color;
        int b2;
        if (!z || (b2 = b((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN);
    }

    public static g a(Context context, float f) {
        int a2 = b.a.a.a.s.a.a(context, b.a.a.a.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.a(context);
        gVar.a(ColorStateList.valueOf(a2));
        gVar.b(f);
        return gVar;
    }

    private void a(Canvas canvas) {
        if (this.f1173b.s != 0) {
            canvas.drawPath(this.g, this.p.a());
        }
        for (int i = 0; i < 4; i++) {
            this.f1174c[i].a(this.p, this.f1173b.r, canvas);
            this.d[i].a(this.p, this.f1173b.r, canvas);
        }
        int h = h();
        int i2 = i();
        canvas.translate(-h, -i2);
        canvas.drawPath(this.g, w);
        canvas.translate(h, i2);
    }

    private void a(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.a(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = kVar.l().a(rectF);
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    private boolean a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1173b.d == null || color2 == (colorForState2 = this.f1173b.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f1173b.e == null || color == (colorForState = this.f1173b.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    private int b(int i) {
        float p = p() + g();
        b.a.a.a.u.a aVar = this.f1173b.f1178b;
        return aVar != null ? aVar.b(i, p) : i;
    }

    private void b(Canvas canvas) {
        a(canvas, this.n, this.g, this.f1173b.f1177a, d());
    }

    private void b(RectF rectF, Path path) {
        a(rectF, path);
        if (this.f1173b.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.f1173b.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    private void c(Canvas canvas) {
        a(canvas, this.o, this.h, this.m, t());
    }

    private void d(Canvas canvas) {
        int h = h();
        int i = i();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f1173b.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(h, i);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(h, i);
    }

    private void s() {
        k a2 = k().a(new b(this, -u()));
        this.m = a2;
        this.r.a(a2, this.f1173b.k, t(), this.h);
    }

    private RectF t() {
        RectF d = d();
        float u = u();
        this.j.set(d.left + u, d.top + u, d.right - u, d.bottom - u);
        return this.j;
    }

    private float u() {
        if (x()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean v() {
        c cVar = this.f1173b;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || z());
    }

    private boolean w() {
        Paint.Style style = this.f1173b.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean x() {
        Paint.Style style = this.f1173b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    private void y() {
        super.invalidateSelf();
    }

    private boolean z() {
        return Build.VERSION.SDK_INT < 21 || (!r() && !this.g.isConvex());
    }

    public void a(float f) {
        setShapeAppearanceModel(this.f1173b.f1177a.a(f));
    }

    public void a(float f, int i) {
        e(f);
        b(ColorStateList.valueOf(i));
    }

    public void a(float f, ColorStateList colorStateList) {
        e(f);
        b(colorStateList);
    }

    public void a(int i) {
        c cVar = this.f1173b;
        if (cVar.t != i) {
            cVar.t = i;
            y();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        c cVar = this.f1173b;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f1173b.i.set(i, i2, i3, i4);
        this.u = this.f1173b.i;
        invalidateSelf();
    }

    public void a(Context context) {
        this.f1173b.f1178b = new b.a.a.a.u.a(context);
        B();
    }

    public void a(ColorStateList colorStateList) {
        c cVar = this.f1173b;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.f1173b.f1177a, rectF);
    }

    public final void a(RectF rectF, Path path) {
        l lVar = this.r;
        c cVar = this.f1173b;
        lVar.a(cVar.f1177a, cVar.k, rectF, this.q, path);
    }

    public float b() {
        return this.f1173b.f1177a.c().a(d());
    }

    public void b(float f) {
        c cVar = this.f1173b;
        if (cVar.o != f) {
            cVar.o = f;
            B();
        }
    }

    public void b(ColorStateList colorStateList) {
        c cVar = this.f1173b;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public float c() {
        return this.f1173b.f1177a.e().a(d());
    }

    public void c(float f) {
        c cVar = this.f1173b;
        if (cVar.k != f) {
            cVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public RectF d() {
        Rect bounds = getBounds();
        this.i.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.i;
    }

    public void d(float f) {
        c cVar = this.f1173b;
        if (cVar.n != f) {
            cVar.n = f;
            B();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(a(alpha, this.f1173b.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.f1173b.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(a(alpha2, this.f1173b.m));
        if (this.e) {
            s();
            b(d(), this.g);
            this.e = false;
        }
        if (v()) {
            canvas.save();
            d(canvas);
            int width = (int) (this.v.width() - getBounds().width());
            int height = (int) (this.v.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.f1173b.r * 2) + width, ((int) this.v.height()) + (this.f1173b.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f1173b.r) - width;
            float f2 = (getBounds().top - this.f1173b.r) - height;
            canvas2.translate(-f, -f2);
            a(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (w()) {
            b(canvas);
        }
        if (x()) {
            c(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public float e() {
        return this.f1173b.o;
    }

    public void e(float f) {
        this.f1173b.l = f;
        invalidateSelf();
    }

    public ColorStateList f() {
        return this.f1173b.d;
    }

    public float g() {
        return this.f1173b.n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1173b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f1173b.q == 2) {
            return;
        }
        if (r()) {
            outline.setRoundRect(getBounds(), m());
            return;
        }
        b(d(), this.g);
        if (!this.g.isConvex()) {
            return;
        }
        outline.setConvexPath(this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.u;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        b(d(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public int h() {
        c cVar;
        double d = this.f1173b.s;
        double sin = Math.sin(Math.toRadians(cVar.t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public int i() {
        c cVar;
        double d = this.f1173b.s;
        double cos = Math.cos(Math.toRadians(cVar.t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f1173b.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1173b.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1173b.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1173b.d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        return this.f1173b.r;
    }

    public k k() {
        return this.f1173b.f1177a;
    }

    public ColorStateList l() {
        return this.f1173b.g;
    }

    public float m() {
        return this.f1173b.f1177a.j().a(d());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1173b = new c(this.f1173b);
        return this;
    }

    public float n() {
        return this.f1173b.f1177a.l().a(d());
    }

    public float o() {
        return this.f1173b.p;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = a(iArr) || A();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public float p() {
        return e() + o();
    }

    public boolean q() {
        b.a.a.a.u.a aVar = this.f1173b.f1178b;
        return aVar != null && aVar.a();
    }

    public boolean r() {
        return this.f1173b.f1177a.a(d());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.f1173b;
        if (cVar.m != i) {
            cVar.m = i;
            y();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1173b.f1179c = colorFilter;
        y();
    }

    @Override // b.a.a.a.b0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1173b.f1177a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1173b.g = colorStateList;
        A();
        y();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f1173b;
        if (cVar.h != mode) {
            cVar.h = mode;
            A();
            y();
        }
    }
}
