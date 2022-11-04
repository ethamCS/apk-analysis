package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.p0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    private static final PorterDuff.Mode f1364b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static j f1365c;

    /* renamed from: a */
    private p0 f1366a;

    /* loaded from: classes.dex */
    public class a implements p0.f {

        /* renamed from: a */
        private final int[] f1367a = {e.e.R, e.e.P, e.e.f9188a};

        /* renamed from: b */
        private final int[] f1368b = {e.e.f9196o, e.e.B, e.e.f9201t, e.e.f9197p, e.e.f9198q, e.e.f9200s, e.e.f9199r};

        /* renamed from: c */
        private final int[] f1369c = {e.e.O, e.e.Q, e.e.f9192k, e.e.K, e.e.L, e.e.M, e.e.N};

        /* renamed from: d */
        private final int[] f1370d = {e.e.f9204w, e.e.f9190i, e.e.f9203v};

        /* renamed from: e */
        private final int[] f1371e = {e.e.J, e.e.S};

        /* renamed from: f */
        private final int[] f1372f = {e.e.c_res_0x7f07000a, e.e.g_res_0x7f070010, e.e.d_res_0x7f07000b, e.e.f9189h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = v0.c(context, e.a.f9185w);
            return new ColorStateList(new int[][]{v0.f1550b, v0.f1553e, v0.f1551c, v0.f1557i}, new int[]{v0.b(context, e.a.u_res_0x7f0300dc), androidx.core.graphics.a.f(c10, i10), androidx.core.graphics.a.f(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, v0.c(context, e.a.t_res_0x7f0300da));
        }

        private ColorStateList j(Context context) {
            return h(context, v0.c(context, e.a.u_res_0x7f0300dc));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = e.a.y_res_0x7f0300fe;
            ColorStateList e10 = v0.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = v0.f1550b;
                iArr2[0] = v0.b(context, i10);
                iArr[1] = v0.f1554f;
                iArr2[1] = v0.c(context, e.a.f9184v);
                iArr[2] = v0.f1557i;
                iArr2[2] = v0.c(context, i10);
            } else {
                iArr[0] = v0.f1550b;
                iArr2[0] = e10.getColorForState(iArr[0], 0);
                iArr[1] = v0.f1554f;
                iArr2[1] = v0.c(context, e.a.f9184v);
                iArr[2] = v0.f1557i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(p0 p0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = p0Var.j(context, e.e.F);
            Drawable j11 = p0Var.j(context, e.e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1364b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.p0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f1367a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = e.a.x_res_0x7f0300e0
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1369c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = e.a.f9184v
                goto L14
            L22:
                int[] r1 = r6.f1370d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = e.e.f9202u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = e.e.f9193l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.h0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.v0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.p0.f
        public PorterDuff.Mode b(int i10) {
            if (i10 == e.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0.f
        public Drawable c(p0 p0Var, Context context, int i10) {
            int i11;
            if (i10 == e.e.f9191j) {
                return new LayerDrawable(new Drawable[]{p0Var.j(context, e.e.f9190i), p0Var.j(context, e.e.f9192k)});
            }
            if (i10 == e.e.f9206y) {
                i11 = e.d.i_res_0x7f06003b;
            } else if (i10 == e.e.f9205x) {
                i11 = e.d.j_res_0x7f06003c;
            } else if (i10 != e.e.f9207z) {
                return null;
            } else {
                i11 = e.d.k_res_0x7f06003d;
            }
            return l(p0Var, context, i11);
        }

        @Override // androidx.appcompat.widget.p0.f
        public ColorStateList d(Context context, int i10) {
            if (i10 == e.e.f9194m) {
                return g.a.a(context, e.c.e_res_0x7f050015);
            }
            if (i10 == e.e.I) {
                return g.a.a(context, e.c.f9187h);
            }
            if (i10 == e.e.H) {
                return k(context);
            }
            if (i10 == e.e.f_res_0x7f07000f) {
                return j(context);
            }
            if (i10 == e.e.b_res_0x7f070009) {
                return g(context);
            }
            if (i10 == e.e.e_res_0x7f07000e) {
                return i(context);
            }
            if (i10 == e.e.D || i10 == e.e.E) {
                return g.a.a(context, e.c.f9186g);
            }
            if (f(this.f1368b, i10)) {
                return v0.e(context, e.a.x_res_0x7f0300e0);
            }
            if (f(this.f1371e, i10)) {
                return g.a.a(context, e.c.d_res_0x7f050014);
            }
            if (f(this.f1372f, i10)) {
                return g.a.a(context, e.c.c_res_0x7f050013);
            }
            if (i10 != e.e.A) {
                return null;
            }
            return g.a.a(context, e.c.f_res_0x7f050016);
        }

        @Override // androidx.appcompat.widget.p0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c10;
            if (i10 == e.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = e.a.x_res_0x7f0300e0;
                m(findDrawableByLayerId2, v0.c(context, i11), j.f1364b);
                m(layerDrawable.findDrawableByLayerId(16908303), v0.c(context, i11), j.f1364b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c10 = v0.c(context, e.a.f9184v);
            } else if (i10 != e.e.f9206y && i10 != e.e.f9205x && i10 != e.e.f9207z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), v0.b(context, e.a.x_res_0x7f0300e0), j.f1364b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = e.a.f9184v;
                m(findDrawableByLayerId3, v0.c(context, i12), j.f1364b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c10 = v0.c(context, i12);
            }
            m(findDrawableByLayerId, c10, j.f1364b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1365c == null) {
                h();
            }
            jVar = f1365c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = p0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1365c == null) {
                j jVar = new j();
                f1365c = jVar;
                jVar.f1366a = p0.h();
                f1365c.f1366a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, y0 y0Var, int[] iArr) {
        p0.w(drawable, y0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1366a.j(context, i10);
    }

    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1366a.k(context, i10, z10);
    }

    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1366a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1366a.s(context);
    }
}
