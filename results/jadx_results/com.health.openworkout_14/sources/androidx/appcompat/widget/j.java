package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    private static final PorterDuff.Mode f537b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static j f538c;

    /* renamed from: a */
    private m0 f539a;

    /* loaded from: classes.dex */
    public class a implements m0.e {

        /* renamed from: a */
        private final int[] f540a = {b.a.e.S, b.a.e.Q, b.a.e.f1988a};

        /* renamed from: b */
        private final int[] f541b = {b.a.e.o, b.a.e.B, b.a.e.t, b.a.e.p, b.a.e.q, b.a.e.s, b.a.e.r};

        /* renamed from: c */
        private final int[] f542c = {b.a.e.P, b.a.e.R, b.a.e.k, b.a.e.I, b.a.e.J, b.a.e.L, b.a.e.N, b.a.e.K, b.a.e.M, b.a.e.O};

        /* renamed from: d */
        private final int[] f543d = {b.a.e.w, b.a.e.i, b.a.e.v};

        /* renamed from: e */
        private final int[] f544e = {b.a.e.H, b.a.e.T};

        /* renamed from: f */
        private final int[] f545f = {b.a.e.c_res_0x7f080009, b.a.e.g_res_0x7f08000f, b.a.e.d_res_0x7f08000a, b.a.e.f1989h};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int c2 = r0.c(context, b.a.a.v);
            return new ColorStateList(new int[][]{r0.f618b, r0.f620d, r0.f619c, r0.f622f}, new int[]{r0.b(context, b.a.a.t_res_0x7f0400b3), b.g.e.a.b(c2, i), b.g.e.a.b(c2, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.c(context, b.a.a.s));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.c(context, b.a.a.t_res_0x7f0400b3));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = b.a.a.y_res_0x7f0400c5;
            ColorStateList e2 = r0.e(context, i);
            if (e2 == null || !e2.isStateful()) {
                iArr[0] = r0.f618b;
                iArr2[0] = r0.b(context, i);
                iArr[1] = r0.f621e;
                iArr2[1] = r0.c(context, b.a.a.u);
                iArr[2] = r0.f622f;
                iArr2[2] = r0.c(context, i);
            } else {
                iArr[0] = r0.f618b;
                iArr2[0] = e2.getColorForState(iArr[0], 0);
                iArr[1] = r0.f621e;
                iArr2[1] = r0.c(context, b.a.a.u);
                iArr[2] = r0.f622f;
                iArr2[2] = e2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f537b;
            }
            drawable.setColorFilter(j.e(i, mode));
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(m0 m0Var, Context context, int i) {
            if (i == b.a.e.j) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, b.a.e.i), m0Var.j(context, b.a.e.k)});
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f540a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = b.a.a.w_res_0x7f0400b6
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f542c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = b.a.a.u
                goto L14
            L22:
                int[] r1 = r6.f543d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = b.a.e.u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = b.a.e.l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.r0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList c(Context context, int i) {
            if (i == b.a.e.m) {
                return b.a.k.a.a.c(context, b.a.c.e_res_0x7f060015);
            }
            if (i == b.a.e.G) {
                return b.a.k.a.a.c(context, b.a.c.h_res_0x7f060018);
            }
            if (i == b.a.e.F) {
                return k(context);
            }
            if (i == b.a.e.f_res_0x7f08000e) {
                return j(context);
            }
            if (i == b.a.e.b_res_0x7f080008) {
                return g(context);
            }
            if (i == b.a.e.e_res_0x7f08000d) {
                return i(context);
            }
            if (i == b.a.e.D || i == b.a.e.E) {
                return b.a.k.a.a.c(context, b.a.c.g_res_0x7f060017);
            }
            if (f(this.f541b, i)) {
                return r0.e(context, b.a.a.w_res_0x7f0400b6);
            }
            if (f(this.f544e, i)) {
                return b.a.k.a.a.c(context, b.a.c.d_res_0x7f060014);
            }
            if (f(this.f545f, i)) {
                return b.a.k.a.a.c(context, b.a.c.c_res_0x7f060013);
            }
            if (i != b.a.e.A) {
                return null;
            }
            return b.a.k.a.a.c(context, b.a.c.f_res_0x7f060016);
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean d(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c2;
            if (i == b.a.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = b.a.a.w_res_0x7f0400b6;
                l(findDrawableByLayerId2, r0.c(context, i2), j.f537b);
                l(layerDrawable.findDrawableByLayerId(16908303), r0.c(context, i2), j.f537b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c2 = r0.c(context, b.a.a.u);
            } else if (i != b.a.e.y && i != b.a.e.x && i != b.a.e.z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), r0.b(context, b.a.a.w_res_0x7f0400b6), j.f537b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = b.a.a.u;
                l(findDrawableByLayerId3, r0.c(context, i3), j.f537b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c2 = r0.c(context, i3);
            }
            l(findDrawableByLayerId, c2, j.f537b);
            return true;
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode e(int i) {
            if (i == b.a.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f538c == null) {
                h();
            }
            jVar = f538c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (j.class) {
            l = m0.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f538c == null) {
                j jVar = new j();
                f538c = jVar;
                jVar.f539a = m0.h();
                f538c.f539a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.f539a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.f539a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.f539a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.f539a.s(context);
    }
}
