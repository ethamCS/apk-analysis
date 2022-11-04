package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    private boolean U3;
    private boolean W3;
    private Runnable X3;
    private long Y3;
    private long Z3;

    /* renamed from: a4 */
    private c f11083a4;

    /* renamed from: c */
    private d f11084c;

    /* renamed from: d */
    private Rect f11085d;

    /* renamed from: q */
    private Drawable f11086q;

    /* renamed from: x */
    private Drawable f11087x;

    /* renamed from: y */
    private int f11088y = 255;
    private int V3 = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b */
    /* loaded from: classes.dex */
    public static class C0163b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: c */
        private Drawable.Callback f11090c;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f11090c;
            this.f11090c = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f11090c = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f11090c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f11090c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a */
        final b f11091a;

        /* renamed from: b */
        Resources f11092b;

        /* renamed from: c */
        int f11093c;

        /* renamed from: d */
        int f11094d;

        /* renamed from: e */
        int f11095e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f11096f;

        /* renamed from: g */
        Drawable[] f11097g;

        /* renamed from: h */
        int f11098h;

        /* renamed from: i */
        boolean f11099i;

        /* renamed from: j */
        boolean f11100j;

        /* renamed from: k */
        Rect f11101k;

        /* renamed from: l */
        boolean f11102l;

        /* renamed from: m */
        boolean f11103m;

        /* renamed from: n */
        int f11104n;

        /* renamed from: o */
        int f11105o;

        /* renamed from: p */
        int f11106p;

        /* renamed from: q */
        int f11107q;

        /* renamed from: r */
        boolean f11108r;

        /* renamed from: s */
        int f11109s;

        /* renamed from: t */
        boolean f11110t;

        /* renamed from: u */
        boolean f11111u;

        /* renamed from: v */
        boolean f11112v;

        /* renamed from: w */
        boolean f11113w;

        /* renamed from: x */
        boolean f11114x;

        /* renamed from: y */
        boolean f11115y;

        /* renamed from: z */
        int f11116z;

        public d(d dVar, b bVar, Resources resources) {
            this.f11099i = false;
            this.f11102l = false;
            this.f11114x = true;
            this.A = 0;
            this.B = 0;
            this.f11091a = bVar;
            Rect rect = null;
            this.f11092b = resources != null ? resources : dVar != null ? dVar.f11092b : null;
            int f10 = b.f(resources, dVar != null ? dVar.f11093c : 0);
            this.f11093c = f10;
            if (dVar == null) {
                this.f11097g = new Drawable[10];
                this.f11098h = 0;
                return;
            }
            this.f11094d = dVar.f11094d;
            this.f11095e = dVar.f11095e;
            this.f11112v = true;
            this.f11113w = true;
            this.f11099i = dVar.f11099i;
            this.f11102l = dVar.f11102l;
            this.f11114x = dVar.f11114x;
            this.f11115y = dVar.f11115y;
            this.f11116z = dVar.f11116z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f11093c == f10) {
                if (dVar.f11100j) {
                    this.f11101k = dVar.f11101k != null ? new Rect(dVar.f11101k) : rect;
                    this.f11100j = true;
                }
                if (dVar.f11103m) {
                    this.f11104n = dVar.f11104n;
                    this.f11105o = dVar.f11105o;
                    this.f11106p = dVar.f11106p;
                    this.f11107q = dVar.f11107q;
                    this.f11103m = true;
                }
            }
            if (dVar.f11108r) {
                this.f11109s = dVar.f11109s;
                this.f11108r = true;
            }
            if (dVar.f11110t) {
                this.f11111u = dVar.f11111u;
                this.f11110t = true;
            }
            Drawable[] drawableArr = dVar.f11097g;
            this.f11097g = new Drawable[drawableArr.length];
            this.f11098h = dVar.f11098h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f11096f;
            this.f11096f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f11098h);
            int i10 = this.f11098h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null) {
                    Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                    if (constantState != null) {
                        this.f11096f.put(i11, constantState);
                    } else {
                        this.f11097g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f11096f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f11097g[this.f11096f.keyAt(i10)] = s(this.f11096f.valueAt(i10).newDrawable(this.f11092b));
                }
                this.f11096f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            androidx.core.graphics.drawable.a.m(drawable, this.f11116z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f11091a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f11098h;
            if (i10 >= this.f11097g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f11091a);
            this.f11097g[i10] = drawable;
            this.f11098h++;
            this.f11095e = drawable.getChangingConfigurations() | this.f11095e;
            p();
            this.f11101k = null;
            this.f11100j = false;
            this.f11103m = false;
            this.f11112v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f11098h;
                Drawable[] drawableArr = this.f11097g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f11095e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0163b.c(theme));
            }
        }

        public boolean c() {
            if (this.f11112v) {
                return this.f11113w;
            }
            e();
            this.f11112v = true;
            int i10 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f11113w = false;
                    return false;
                }
            }
            this.f11113w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f11096f.get(i11);
                    if (constantState != null && C0163b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f11103m = true;
            e();
            int i10 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            this.f11105o = -1;
            this.f11104n = -1;
            this.f11107q = 0;
            this.f11106p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f11104n) {
                    this.f11104n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f11105o) {
                    this.f11105o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f11106p) {
                    this.f11106p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f11107q) {
                    this.f11107q = minimumHeight;
                }
            }
        }

        public final int f() {
            return this.f11097g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f11097g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f11096f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f11096f.valueAt(indexOfKey).newDrawable(this.f11092b));
            this.f11097g[i10] = s10;
            this.f11096f.removeAt(indexOfKey);
            if (this.f11096f.size() == 0) {
                this.f11096f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11094d | this.f11095e;
        }

        public final int h() {
            return this.f11098h;
        }

        public final int i() {
            if (!this.f11103m) {
                d();
            }
            return this.f11105o;
        }

        public final int j() {
            if (!this.f11103m) {
                d();
            }
            return this.f11107q;
        }

        public final int k() {
            if (!this.f11103m) {
                d();
            }
            return this.f11106p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f11099i) {
                return null;
            }
            Rect rect2 = this.f11101k;
            if (rect2 != null || this.f11100j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f11100j = true;
            this.f11101k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f11103m) {
                d();
            }
            return this.f11104n;
        }

        public final int n() {
            if (this.f11108r) {
                return this.f11109s;
            }
            e();
            int i10 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f11109s = opacity;
            this.f11108r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11097g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11097g = drawableArr;
        }

        void p() {
            this.f11108r = false;
            this.f11110t = false;
        }

        public final boolean q() {
            return this.f11102l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f11102l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f11098h;
            Drawable[] drawableArr = this.f11097g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m10 = androidx.core.graphics.drawable.a.m(drawableArr[i13], i10);
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f11116z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f11099i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f11092b = resources;
                int f10 = b.f(resources, this.f11093c);
                int i10 = this.f11093c;
                this.f11093c = f10;
                if (i10 == f10) {
                    return;
                }
                this.f11103m = false;
                this.f11100j = false;
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f11083a4 == null) {
            this.f11083a4 = new c();
        }
        drawable.setCallback(this.f11083a4.b(drawable.getCallback()));
        try {
            if (this.f11084c.A <= 0 && this.U3) {
                drawable.setAlpha(this.f11088y);
            }
            d dVar = this.f11084c;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f11084c;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f11084c.f11114x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            androidx.core.graphics.drawable.a.j(drawable, this.f11084c.C);
            Rect rect = this.f11085d;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f11083a4.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.U3 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f11086q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.Y3
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f11088y
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$d r10 = r13.f11084c
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f11088y
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.Y3 = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f11087x
            if (r9 == 0) goto L5d
            long r10 = r13.Z3
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f11087x = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f11084c
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f11088y
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.Z3 = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.X3
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f11084c.b(theme);
    }

    d b() {
        throw null;
    }

    public int c() {
        return this.V3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f11084c.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11086q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f11087x;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.V3
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f11084c
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f11087x
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f11086q
            if (r0 == 0) goto L29
            r9.f11087x = r0
            h.b$d r0 = r9.f11084c
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.Z3 = r0
            goto L35
        L29:
            r9.f11087x = r4
            r9.Z3 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f11086q
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$d r0 = r9.f11084c
            int r1 = r0.f11098h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f11086q = r0
            r9.V3 = r10
            if (r0 == 0) goto L5a
            h.b$d r10 = r9.f11084c
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.Y3 = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f11086q = r4
            r10 = -1
            r9.V3 = r10
        L5a:
            long r0 = r9.Y3
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.Z3
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.X3
            if (r10 != 0) goto L73
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.X3 = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11088y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f11084c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11084c.c()) {
            this.f11084c.f11094d = getChangingConfigurations();
            return this.f11084c;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f11086q;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f11085d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f11084c.q()) {
            return this.f11084c.i();
        }
        Drawable drawable = this.f11086q;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f11084c.q()) {
            return this.f11084c.m();
        }
        Drawable drawable = this.f11086q;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f11084c.q()) {
            return this.f11084c.j();
        }
        Drawable drawable = this.f11086q;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f11084c.q()) {
            return this.f11084c.k();
        }
        Drawable drawable = this.f11086q;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11086q;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f11084c.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f11086q;
        if (drawable != null) {
            C0163b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean z10;
        Rect l10 = this.f11084c.l();
        if (l10 != null) {
            rect.set(l10);
            z10 = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f11086q;
            z10 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z10;
    }

    public void h(d dVar) {
        this.f11084c = dVar;
        int i10 = this.V3;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f11086q = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f11087x = null;
    }

    public final void i(Resources resources) {
        this.f11084c.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f11084c;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f11086q || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f11084c.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f11087x;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f11087x = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f11086q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.U3) {
                this.f11086q.setAlpha(this.f11088y);
            }
        }
        if (this.Z3 != 0) {
            this.Z3 = 0L;
            z10 = true;
        }
        if (this.Y3 != 0) {
            this.Y3 = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.W3 && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.W3 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11087x;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f11086q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f11084c.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f11087x;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f11086q;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11087x;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f11086q;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f11086q || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (!this.U3 || this.f11088y != i10) {
            this.U3 = true;
            this.f11088y = i10;
            Drawable drawable = this.f11086q;
            if (drawable == null) {
                return;
            }
            if (this.Y3 == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f11084c;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f11086q;
            if (drawable == null) {
                return;
            }
            androidx.core.graphics.drawable.a.j(drawable, z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f11084c;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f11086q;
            if (drawable == null) {
                return;
            }
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f11084c;
        if (dVar.f11114x != z10) {
            dVar.f11114x = z10;
            Drawable drawable = this.f11086q;
            if (drawable == null) {
                return;
            }
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f11086q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11085d;
        if (rect == null) {
            this.f11085d = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f11086q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f11084c;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f11086q, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f11084c;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f11086q, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f11087x;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f11086q;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f11086q || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
