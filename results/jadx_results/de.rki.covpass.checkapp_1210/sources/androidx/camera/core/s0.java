package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.p0;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import w.h1;
/* loaded from: classes.dex */
public abstract class s0 implements h1.a {

    /* renamed from: t */
    private static final RectF f2467t = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    private p0.a f2468a;

    /* renamed from: b */
    private volatile int f2469b;

    /* renamed from: c */
    private volatile int f2470c;

    /* renamed from: e */
    private volatile boolean f2472e;

    /* renamed from: f */
    private volatile boolean f2473f;

    /* renamed from: g */
    private Executor f2474g;

    /* renamed from: h */
    private o2 f2475h;

    /* renamed from: i */
    private ImageWriter f2476i;

    /* renamed from: n */
    ByteBuffer f2481n;

    /* renamed from: o */
    ByteBuffer f2482o;

    /* renamed from: p */
    ByteBuffer f2483p;

    /* renamed from: q */
    ByteBuffer f2484q;

    /* renamed from: d */
    private volatile int f2471d = 1;

    /* renamed from: j */
    private Rect f2477j = new Rect();

    /* renamed from: k */
    private Rect f2478k = new Rect();

    /* renamed from: l */
    private Matrix f2479l = new Matrix();

    /* renamed from: m */
    private Matrix f2480m = new Matrix();

    /* renamed from: r */
    private final Object f2485r = new Object();

    /* renamed from: s */
    protected boolean f2486s = true;

    private void h(n1 n1Var) {
        if (this.f2471d != 1) {
            if (this.f2471d != 2 || this.f2481n != null) {
                return;
            }
            this.f2481n = ByteBuffer.allocateDirect(n1Var.d() * n1Var.a() * 4);
            return;
        }
        if (this.f2482o == null) {
            this.f2482o = ByteBuffer.allocateDirect(n1Var.d() * n1Var.a());
        }
        this.f2482o.position(0);
        if (this.f2483p == null) {
            this.f2483p = ByteBuffer.allocateDirect((n1Var.d() * n1Var.a()) / 4);
        }
        this.f2483p.position(0);
        if (this.f2484q == null) {
            this.f2484q = ByteBuffer.allocateDirect((n1Var.d() * n1Var.a()) / 4);
        }
        this.f2484q.position(0);
    }

    private static o2 i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new o2(p1.a(i15, i10, i13, i14));
    }

    static Matrix k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), f2467t, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(l(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    private static Matrix l(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2467t, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    static Rect m(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public /* synthetic */ void n(n1 n1Var, Matrix matrix, n1 n1Var2, Rect rect, p0.a aVar, c.a aVar2) {
        if (!this.f2486s) {
            aVar2.f(new androidx.core.os.h("ImageAnalysis is detached"));
            return;
        }
        p2 p2Var = new p2(n1Var2, q1.f(n1Var.I().a(), n1Var.I().c(), this.f2472e ? 0 : this.f2469b, matrix));
        if (!rect.isEmpty()) {
            p2Var.D(rect);
        }
        aVar.b(p2Var);
        aVar2.c(null);
    }

    public /* synthetic */ Object o(Executor executor, final n1 n1Var, final Matrix matrix, final n1 n1Var2, final Rect rect, final p0.a aVar, final c.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.this.n(n1Var, matrix, n1Var2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void q(int i10, int i11, int i12, int i13) {
        Matrix k10 = k(i10, i11, i12, i13, this.f2469b);
        this.f2478k = m(this.f2477j, k10);
        this.f2480m.setConcat(this.f2479l, k10);
    }

    private void r(n1 n1Var, int i10) {
        o2 o2Var = this.f2475h;
        if (o2Var == null) {
            return;
        }
        o2Var.n();
        this.f2475h = i(n1Var.d(), n1Var.a(), i10, this.f2475h.f(), this.f2475h.i());
        if (this.f2471d != 1) {
            return;
        }
        ImageWriter imageWriter = this.f2476i;
        if (imageWriter != null) {
            a0.a.a(imageWriter);
        }
        this.f2476i = a0.a.c(this.f2475h.b(), this.f2475h.i());
    }

    @Override // w.h1.a
    public void a(w.h1 h1Var) {
        try {
            n1 d10 = d(h1Var);
            if (d10 == null) {
                return;
            }
            p(d10);
        } catch (IllegalStateException e10) {
            s1.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    abstract n1 d(w.h1 h1Var);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x5.a<java.lang.Void> e(final androidx.camera.core.n1 r17) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.s0.e(androidx.camera.core.n1):x5.a");
    }

    public void f() {
        this.f2486s = true;
    }

    public abstract void g();

    public void j() {
        this.f2486s = false;
        g();
    }

    abstract void p(n1 n1Var);

    public void s(Executor executor, p0.a aVar) {
        synchronized (this.f2485r) {
            if (aVar == null) {
                g();
            }
            this.f2468a = aVar;
            this.f2474g = executor;
        }
    }

    public void t(boolean z10) {
        this.f2473f = z10;
    }

    public void u(int i10) {
        this.f2471d = i10;
    }

    public void v(boolean z10) {
        this.f2472e = z10;
    }

    public void w(o2 o2Var) {
        synchronized (this.f2485r) {
            this.f2475h = o2Var;
        }
    }

    public void x(int i10) {
        this.f2469b = i10;
    }

    public void y(Matrix matrix) {
        synchronized (this.f2485r) {
            this.f2479l = matrix;
            this.f2480m = new Matrix(this.f2479l);
        }
    }

    public void z(Rect rect) {
        synchronized (this.f2485r) {
            this.f2477j = rect;
            this.f2478k = new Rect(this.f2477j);
        }
    }
}
