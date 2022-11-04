package t5;

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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import t5.k;
import t5.l;
import t5.m;
/* loaded from: classes.dex */
public class g extends Drawable implements n {

    /* renamed from: m4 */
    private static final String f21812m4 = g.class.getSimpleName();

    /* renamed from: n4 */
    private static final Paint f21813n4;
    private final Matrix U3;
    private final Path V3;
    private final Path W3;
    private final RectF X3;
    private final RectF Y3;
    private final Region Z3;

    /* renamed from: a4 */
    private final Region f21814a4;

    /* renamed from: b4 */
    private k f21815b4;

    /* renamed from: c */
    private c f21816c;

    /* renamed from: c4 */
    private final Paint f21817c4;

    /* renamed from: d */
    private final m.g[] f21818d;

    /* renamed from: d4 */
    private final Paint f21819d4;

    /* renamed from: e4 */
    private final s5.a f21820e4;

    /* renamed from: f4 */
    private final l.b f21821f4;

    /* renamed from: g4 */
    private final l f21822g4;

    /* renamed from: h4 */
    private PorterDuffColorFilter f21823h4;

    /* renamed from: i4 */
    private PorterDuffColorFilter f21824i4;

    /* renamed from: j4 */
    private int f21825j4;

    /* renamed from: k4 */
    private final RectF f21826k4;

    /* renamed from: l4 */
    private boolean f21827l4;

    /* renamed from: q */
    private final m.g[] f21828q;

    /* renamed from: x */
    private final BitSet f21829x;

    /* renamed from: y */
    private boolean f21830y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.b {
        a() {
            g.this = r1;
        }

        @Override // t5.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f21829x.set(i10 + 4, mVar.e());
            g.this.f21828q[i10] = mVar.f(matrix);
        }

        @Override // t5.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f21829x.set(i10, mVar.e());
            g.this.f21818d[i10] = mVar.f(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class b implements k.c {

        /* renamed from: a */
        final /* synthetic */ float f21832a;

        b(float f10) {
            g.this = r1;
            this.f21832a = f10;
        }

        @Override // t5.k.c
        public t5.c a(t5.c cVar) {
            return cVar instanceof i ? cVar : new t5.b(this.f21832a, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public k f21834a;

        /* renamed from: b */
        public l5.a f21835b;

        /* renamed from: c */
        public ColorFilter f21836c;

        /* renamed from: d */
        public ColorStateList f21837d;

        /* renamed from: e */
        public ColorStateList f21838e;

        /* renamed from: f */
        public ColorStateList f21839f;

        /* renamed from: g */
        public ColorStateList f21840g;

        /* renamed from: h */
        public PorterDuff.Mode f21841h;

        /* renamed from: i */
        public Rect f21842i;

        /* renamed from: j */
        public float f21843j;

        /* renamed from: k */
        public float f21844k;

        /* renamed from: l */
        public float f21845l;

        /* renamed from: m */
        public int f21846m;

        /* renamed from: n */
        public float f21847n;

        /* renamed from: o */
        public float f21848o;

        /* renamed from: p */
        public float f21849p;

        /* renamed from: q */
        public int f21850q;

        /* renamed from: r */
        public int f21851r;

        /* renamed from: s */
        public int f21852s;

        /* renamed from: t */
        public int f21853t;

        /* renamed from: u */
        public boolean f21854u;

        /* renamed from: v */
        public Paint.Style f21855v;

        public c(c cVar) {
            this.f21837d = null;
            this.f21838e = null;
            this.f21839f = null;
            this.f21840g = null;
            this.f21841h = PorterDuff.Mode.SRC_IN;
            this.f21842i = null;
            this.f21843j = 1.0f;
            this.f21844k = 1.0f;
            this.f21846m = 255;
            this.f21847n = 0.0f;
            this.f21848o = 0.0f;
            this.f21849p = 0.0f;
            this.f21850q = 0;
            this.f21851r = 0;
            this.f21852s = 0;
            this.f21853t = 0;
            this.f21854u = false;
            this.f21855v = Paint.Style.FILL_AND_STROKE;
            this.f21834a = cVar.f21834a;
            this.f21835b = cVar.f21835b;
            this.f21845l = cVar.f21845l;
            this.f21836c = cVar.f21836c;
            this.f21837d = cVar.f21837d;
            this.f21838e = cVar.f21838e;
            this.f21841h = cVar.f21841h;
            this.f21840g = cVar.f21840g;
            this.f21846m = cVar.f21846m;
            this.f21843j = cVar.f21843j;
            this.f21852s = cVar.f21852s;
            this.f21850q = cVar.f21850q;
            this.f21854u = cVar.f21854u;
            this.f21844k = cVar.f21844k;
            this.f21847n = cVar.f21847n;
            this.f21848o = cVar.f21848o;
            this.f21849p = cVar.f21849p;
            this.f21851r = cVar.f21851r;
            this.f21853t = cVar.f21853t;
            this.f21839f = cVar.f21839f;
            this.f21855v = cVar.f21855v;
            if (cVar.f21842i != null) {
                this.f21842i = new Rect(cVar.f21842i);
            }
        }

        public c(k kVar, l5.a aVar) {
            this.f21837d = null;
            this.f21838e = null;
            this.f21839f = null;
            this.f21840g = null;
            this.f21841h = PorterDuff.Mode.SRC_IN;
            this.f21842i = null;
            this.f21843j = 1.0f;
            this.f21844k = 1.0f;
            this.f21846m = 255;
            this.f21847n = 0.0f;
            this.f21848o = 0.0f;
            this.f21849p = 0.0f;
            this.f21850q = 0;
            this.f21851r = 0;
            this.f21852s = 0;
            this.f21853t = 0;
            this.f21854u = false;
            this.f21855v = Paint.Style.FILL_AND_STROKE;
            this.f21834a = kVar;
            this.f21835b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f21830y = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f21813n4 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    private g(c cVar) {
        this.f21818d = new m.g[4];
        this.f21828q = new m.g[4];
        this.f21829x = new BitSet(8);
        this.U3 = new Matrix();
        this.V3 = new Path();
        this.W3 = new Path();
        this.X3 = new RectF();
        this.Y3 = new RectF();
        this.Z3 = new Region();
        this.f21814a4 = new Region();
        Paint paint = new Paint(1);
        this.f21817c4 = paint;
        Paint paint2 = new Paint(1);
        this.f21819d4 = paint2;
        this.f21820e4 = new s5.a();
        this.f21822g4 = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f21826k4 = new RectF();
        this.f21827l4 = true;
        this.f21816c = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k0();
        j0(getState());
        this.f21821f4 = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private float F() {
        if (N()) {
            return this.f21819d4.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean L() {
        c cVar = this.f21816c;
        int i10 = cVar.f21850q;
        return i10 != 1 && cVar.f21851r > 0 && (i10 == 2 || V());
    }

    private boolean M() {
        Paint.Style style = this.f21816c.f21855v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean N() {
        Paint.Style style = this.f21816c.f21855v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f21819d4.getStrokeWidth() > 0.0f;
    }

    private void P() {
        super.invalidateSelf();
    }

    private void S(Canvas canvas) {
        if (!L()) {
            return;
        }
        canvas.save();
        U(canvas);
        if (!this.f21827l4) {
            n(canvas);
        } else {
            int width = (int) (this.f21826k4.width() - getBounds().width());
            int height = (int) (this.f21826k4.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f21826k4.width()) + (this.f21816c.f21851r * 2) + width, ((int) this.f21826k4.height()) + (this.f21816c.f21851r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f21816c.f21851r) - width;
            float f11 = (getBounds().top - this.f21816c.f21851r) - height;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
        }
        canvas.restore();
    }

    private static int T(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void U(Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (z10) {
            int color = paint.getColor();
            int l10 = l(color);
            this.f21825j4 = l10;
            if (l10 == color) {
                return null;
            }
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f21816c.f21843j != 1.0f) {
            this.U3.reset();
            Matrix matrix = this.U3;
            float f10 = this.f21816c.f21843j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.U3);
        }
        path.computeBounds(this.f21826k4, true);
    }

    private void i() {
        k y10 = E().y(new b(-F()));
        this.f21815b4 = y10;
        this.f21822g4.d(y10, this.f21816c.f21844k, v(), this.W3);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f21825j4 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private boolean j0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f21816c.f21837d == null || color2 == (colorForState2 = this.f21816c.f21837d.getColorForState(iArr, (color2 = this.f21817c4.getColor())))) {
            z10 = false;
        } else {
            this.f21817c4.setColor(colorForState2);
            z10 = true;
        }
        if (this.f21816c.f21838e == null || color == (colorForState = this.f21816c.f21838e.getColorForState(iArr, (color = this.f21819d4.getColor())))) {
            return z10;
        }
        this.f21819d4.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    private boolean k0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f21823h4;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f21824i4;
        c cVar = this.f21816c;
        this.f21823h4 = k(cVar.f21840g, cVar.f21841h, this.f21817c4, true);
        c cVar2 = this.f21816c;
        this.f21824i4 = k(cVar2.f21839f, cVar2.f21841h, this.f21819d4, false);
        c cVar3 = this.f21816c;
        if (cVar3.f21854u) {
            this.f21820e4.d(cVar3.f21840g.getColorForState(getState(), 0));
        }
        return !androidx.core.util.c.a(porterDuffColorFilter, this.f21823h4) || !androidx.core.util.c.a(porterDuffColorFilter2, this.f21824i4);
    }

    private void l0() {
        float K = K();
        this.f21816c.f21851r = (int) Math.ceil(0.75f * K);
        this.f21816c.f21852s = (int) Math.ceil(K * 0.25f);
        k0();
        P();
    }

    public static g m(Context context, float f10) {
        int c10 = i5.a.c(context, b5.b.m_res_0x7f0300fb, g.class.getSimpleName());
        g gVar = new g();
        gVar.O(context);
        gVar.Z(ColorStateList.valueOf(c10));
        gVar.Y(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f21829x.cardinality() > 0) {
            Log.w(f21812m4, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f21816c.f21852s != 0) {
            canvas.drawPath(this.V3, this.f21820e4.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21818d[i10].b(this.f21820e4, this.f21816c.f21851r, canvas);
            this.f21828q[i10].b(this.f21820e4, this.f21816c.f21851r, canvas);
        }
        if (this.f21827l4) {
            int B = B();
            int C = C();
            canvas.translate(-B, -C);
            canvas.drawPath(this.V3, f21813n4);
            canvas.translate(B, C);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f21817c4, this.V3, this.f21816c.f21834a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a10 = kVar.t().a(rectF) * this.f21816c.f21844k;
        canvas.drawRoundRect(rectF, a10, a10, paint);
    }

    private RectF v() {
        this.Y3.set(u());
        float F = F();
        this.Y3.inset(F, F);
        return this.Y3;
    }

    public int A() {
        return this.f21825j4;
    }

    public int B() {
        c cVar = this.f21816c;
        return (int) (cVar.f21852s * Math.sin(Math.toRadians(cVar.f21853t)));
    }

    public int C() {
        c cVar = this.f21816c;
        return (int) (cVar.f21852s * Math.cos(Math.toRadians(cVar.f21853t)));
    }

    public int D() {
        return this.f21816c.f21851r;
    }

    public k E() {
        return this.f21816c.f21834a;
    }

    public ColorStateList G() {
        return this.f21816c.f21840g;
    }

    public float H() {
        return this.f21816c.f21834a.r().a(u());
    }

    public float I() {
        return this.f21816c.f21834a.t().a(u());
    }

    public float J() {
        return this.f21816c.f21849p;
    }

    public float K() {
        return w() + J();
    }

    public void O(Context context) {
        this.f21816c.f21835b = new l5.a(context);
        l0();
    }

    public boolean Q() {
        l5.a aVar = this.f21816c.f21835b;
        return aVar != null && aVar.d();
    }

    public boolean R() {
        return this.f21816c.f21834a.u(u());
    }

    public boolean V() {
        return !R() && !this.V3.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void W(float f10) {
        setShapeAppearanceModel(this.f21816c.f21834a.w(f10));
    }

    public void X(t5.c cVar) {
        setShapeAppearanceModel(this.f21816c.f21834a.x(cVar));
    }

    public void Y(float f10) {
        c cVar = this.f21816c;
        if (cVar.f21848o != f10) {
            cVar.f21848o = f10;
            l0();
        }
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.f21816c;
        if (cVar.f21837d != colorStateList) {
            cVar.f21837d = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f10) {
        c cVar = this.f21816c;
        if (cVar.f21844k != f10) {
            cVar.f21844k = f10;
            this.f21830y = true;
            invalidateSelf();
        }
    }

    public void b0(int i10, int i11, int i12, int i13) {
        c cVar = this.f21816c;
        if (cVar.f21842i == null) {
            cVar.f21842i = new Rect();
        }
        this.f21816c.f21842i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void c0(float f10) {
        c cVar = this.f21816c;
        if (cVar.f21847n != f10) {
            cVar.f21847n = f10;
            l0();
        }
    }

    public void d0(boolean z10) {
        this.f21827l4 = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f21817c4.setColorFilter(this.f21823h4);
        int alpha = this.f21817c4.getAlpha();
        this.f21817c4.setAlpha(T(alpha, this.f21816c.f21846m));
        this.f21819d4.setColorFilter(this.f21824i4);
        this.f21819d4.setStrokeWidth(this.f21816c.f21845l);
        int alpha2 = this.f21819d4.getAlpha();
        this.f21819d4.setAlpha(T(alpha2, this.f21816c.f21846m));
        if (this.f21830y) {
            i();
            g(u(), this.V3);
            this.f21830y = false;
        }
        S(canvas);
        if (M()) {
            o(canvas);
        }
        if (N()) {
            r(canvas);
        }
        this.f21817c4.setAlpha(alpha);
        this.f21819d4.setAlpha(alpha2);
    }

    public void e0(int i10) {
        this.f21820e4.d(i10);
        this.f21816c.f21854u = false;
        P();
    }

    public void f0(float f10, int i10) {
        i0(f10);
        h0(ColorStateList.valueOf(i10));
    }

    public void g0(float f10, ColorStateList colorStateList) {
        i0(f10);
        h0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21816c.f21846m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21816c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f21816c.f21850q == 2) {
            return;
        }
        if (R()) {
            outline.setRoundRect(getBounds(), H() * this.f21816c.f21844k);
            return;
        }
        g(u(), this.V3);
        if (!this.V3.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.V3);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f21816c.f21842i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.Z3.set(getBounds());
        g(u(), this.V3);
        this.f21814a4.setPath(this.V3, this.Z3);
        this.Z3.op(this.f21814a4, Region.Op.DIFFERENCE);
        return this.Z3;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.f21822g4;
        c cVar = this.f21816c;
        lVar.e(cVar.f21834a, cVar.f21844k, rectF, this.f21821f4, path);
    }

    public void h0(ColorStateList colorStateList) {
        c cVar = this.f21816c;
        if (cVar.f21838e != colorStateList) {
            cVar.f21838e = colorStateList;
            onStateChange(getState());
        }
    }

    public void i0(float f10) {
        this.f21816c.f21845l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f21830y = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f21816c.f21840g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f21816c.f21839f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f21816c.f21838e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f21816c.f21837d) != null && colorStateList4.isStateful())));
    }

    public int l(int i10) {
        float K = K() + z();
        l5.a aVar = this.f21816c.f21835b;
        return aVar != null ? aVar.c(i10, K) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21816c = new c(this.f21816c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21830y = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = j0(iArr) || k0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f21816c.f21834a, rectF);
    }

    public void r(Canvas canvas) {
        q(canvas, this.f21819d4, this.W3, this.f21815b4, v());
    }

    public float s() {
        return this.f21816c.f21834a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f21816c;
        if (cVar.f21846m != i10) {
            cVar.f21846m = i10;
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21816c.f21836c = colorFilter;
        P();
    }

    @Override // t5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f21816c.f21834a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21816c.f21840g = colorStateList;
        k0();
        P();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f21816c;
        if (cVar.f21841h != mode) {
            cVar.f21841h = mode;
            k0();
            P();
        }
    }

    public float t() {
        return this.f21816c.f21834a.l().a(u());
    }

    public RectF u() {
        this.X3.set(getBounds());
        return this.X3;
    }

    public float w() {
        return this.f21816c.f21848o;
    }

    public ColorStateList x() {
        return this.f21816c.f21837d;
    }

    public float y() {
        return this.f21816c.f21844k;
    }

    public float z() {
        return this.f21816c.f21847n;
    }
}
