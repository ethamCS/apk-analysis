package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q.a;
import w.k0;
import w.y;
/* loaded from: classes.dex */
public class e2 {

    /* renamed from: u */
    private static final MeteringRectangle[] f1654u = new MeteringRectangle[0];

    /* renamed from: a */
    private final t f1655a;

    /* renamed from: b */
    final Executor f1656b;

    /* renamed from: c */
    private final ScheduledExecutorService f1657c;

    /* renamed from: f */
    private final u.k f1660f;

    /* renamed from: i */
    private ScheduledFuture<?> f1663i;

    /* renamed from: p */
    private MeteringRectangle[] f1670p;

    /* renamed from: q */
    private MeteringRectangle[] f1671q;

    /* renamed from: r */
    private MeteringRectangle[] f1672r;

    /* renamed from: d */
    private volatile boolean f1658d = false;

    /* renamed from: e */
    private volatile Rational f1659e = null;

    /* renamed from: g */
    private boolean f1661g = false;

    /* renamed from: h */
    Integer f1662h = 0;

    /* renamed from: j */
    long f1664j = 0;

    /* renamed from: k */
    boolean f1665k = false;

    /* renamed from: l */
    boolean f1666l = false;

    /* renamed from: m */
    private int f1667m = 1;

    /* renamed from: n */
    private t.c f1668n = null;

    /* renamed from: o */
    private t.c f1669o = null;

    /* renamed from: s */
    c.a<androidx.camera.core.j0> f1673s = null;

    /* renamed from: t */
    c.a<Void> f1674t = null;

    /* loaded from: classes.dex */
    public class a extends w.h {

        /* renamed from: a */
        final /* synthetic */ c.a f1675a;

        a(c.a aVar) {
            e2.this = r1;
            this.f1675a = aVar;
        }

        @Override // w.h
        public void a() {
            c.a aVar = this.f1675a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override // w.h
        public void b(w.q qVar) {
            c.a aVar = this.f1675a;
            if (aVar != null) {
                aVar.c(qVar);
            }
        }

        @Override // w.h
        public void c(w.j jVar) {
            c.a aVar = this.f1675a;
            if (aVar != null) {
                aVar.f(new y.b(jVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends w.h {

        /* renamed from: a */
        final /* synthetic */ c.a f1677a;

        b(c.a aVar) {
            e2.this = r1;
            this.f1677a = aVar;
        }

        @Override // w.h
        public void a() {
            c.a aVar = this.f1677a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override // w.h
        public void b(w.q qVar) {
            c.a aVar = this.f1677a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override // w.h
        public void c(w.j jVar) {
            c.a aVar = this.f1677a;
            if (aVar != null) {
                aVar.f(new y.b(jVar));
            }
        }
    }

    public e2(t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, w.y1 y1Var) {
        MeteringRectangle[] meteringRectangleArr = f1654u;
        this.f1670p = meteringRectangleArr;
        this.f1671q = meteringRectangleArr;
        this.f1672r = meteringRectangleArr;
        this.f1655a = tVar;
        this.f1656b = executor;
        this.f1657c = scheduledExecutorService;
        this.f1660f = new u.k(y1Var);
    }

    public /* synthetic */ void A(final long j10) {
        this.f1656b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b2
            @Override // java.lang.Runnable
            public final void run() {
                e2.this.z(j10);
            }
        });
    }

    public /* synthetic */ Object C(final androidx.camera.core.i0 i0Var, final c.a aVar) {
        this.f1656b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d2
            @Override // java.lang.Runnable
            public final void run() {
                e2.this.B(aVar, i0Var);
            }
        });
        return "startFocusAndMetering";
    }

    private static int D(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    private boolean H() {
        return this.f1670p.length > 0;
    }

    private void k(boolean z10) {
        c.a<androidx.camera.core.j0> aVar = this.f1673s;
        if (aVar != null) {
            aVar.c(androidx.camera.core.j0.a(z10));
            this.f1673s = null;
        }
    }

    private void l() {
        c.a<Void> aVar = this.f1674t;
        if (aVar != null) {
            aVar.c(null);
            this.f1674t = null;
        }
    }

    private void m() {
        ScheduledFuture<?> scheduledFuture = this.f1663i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f1663i = null;
        }
    }

    private void n(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, androidx.camera.core.i0 i0Var) {
        final long j10;
        this.f1655a.c0(this.f1668n);
        m();
        this.f1670p = meteringRectangleArr;
        this.f1671q = meteringRectangleArr2;
        this.f1672r = meteringRectangleArr3;
        if (H()) {
            this.f1661g = true;
            this.f1665k = false;
            this.f1666l = false;
            j10 = this.f1655a.l0();
            L(null, true);
        } else {
            this.f1661g = false;
            this.f1665k = true;
            this.f1666l = false;
            j10 = this.f1655a.l0();
        }
        this.f1662h = 0;
        final boolean v10 = v();
        t.c cVar = new t.c() { // from class: androidx.camera.camera2.internal.z1
            @Override // androidx.camera.camera2.internal.t.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean y10;
                y10 = e2.this.y(v10, j10, totalCaptureResult);
                return y10;
            }
        };
        this.f1668n = cVar;
        this.f1655a.u(cVar);
        if (i0Var.e()) {
            final long j11 = this.f1664j + 1;
            this.f1664j = j11;
            this.f1663i = this.f1657c.schedule(new Runnable() { // from class: androidx.camera.camera2.internal.c2
                @Override // java.lang.Runnable
                public final void run() {
                    e2.this.A(j11);
                }
            }, i0Var.a(), TimeUnit.MILLISECONDS);
        }
    }

    private void o(String str) {
        this.f1655a.c0(this.f1668n);
        c.a<androidx.camera.core.j0> aVar = this.f1673s;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f1673s = null;
        }
    }

    private void p(String str) {
        this.f1655a.c0(this.f1669o);
        c.a<Void> aVar = this.f1674t;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f1674t = null;
        }
    }

    private Rational r() {
        if (this.f1659e != null) {
            return this.f1659e;
        }
        Rect y10 = this.f1655a.y();
        return new Rational(y10.width(), y10.height());
    }

    private static PointF s(androidx.camera.core.w1 w1Var, Rational rational, Rational rational2, int i10, u.k kVar) {
        if (w1Var.b() != null) {
            rational2 = w1Var.b();
        }
        PointF a10 = kVar.a(w1Var, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a10.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a10.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                a10.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a10.x) * (1.0f / doubleValue2);
            }
        }
        return a10;
    }

    private static MeteringRectangle t(androidx.camera.core.w1 w1Var, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a10 = ((int) (w1Var.a() * rect.width())) / 2;
        int a11 = ((int) (w1Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a10, height - a11, width + a10, height + a11);
        rect2.left = D(rect2.left, rect.right, rect.left);
        rect2.right = D(rect2.right, rect.right, rect.left);
        rect2.top = D(rect2.top, rect.bottom, rect.top);
        rect2.bottom = D(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private List<MeteringRectangle> u(List<androidx.camera.core.w1> list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (androidx.camera.core.w1 w1Var : list) {
            if (arrayList.size() == i10) {
                break;
            } else if (w(w1Var)) {
                MeteringRectangle t10 = t(w1Var, s(w1Var, rational2, rational, i11, this.f1660f), rect);
                if (t10.getWidth() != 0 && t10.getHeight() != 0) {
                    arrayList.add(t10);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean v() {
        return this.f1655a.H(1) == 1;
    }

    private static boolean w(androidx.camera.core.w1 w1Var) {
        return w1Var.c() >= 0.0f && w1Var.c() <= 1.0f && w1Var.d() >= 0.0f && w1Var.d() <= 1.0f;
    }

    public /* synthetic */ boolean x(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !t.Q(totalCaptureResult, j10)) {
            return false;
        }
        l();
        return true;
    }

    public /* synthetic */ boolean y(boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (H()) {
            if (z10 && num != null) {
                if (this.f1662h.intValue() == 3) {
                    if (num.intValue() != 4) {
                        if (num.intValue() == 5) {
                            this.f1666l = false;
                            this.f1665k = true;
                        }
                    }
                }
            }
            this.f1666l = true;
            this.f1665k = true;
        }
        if (this.f1665k && t.Q(totalCaptureResult, j10)) {
            k(this.f1666l);
            return true;
        }
        if (!this.f1662h.equals(num) && num != null) {
            this.f1662h = num;
        }
        return false;
    }

    public /* synthetic */ void z(long j10) {
        if (j10 == this.f1664j) {
            j();
        }
    }

    public void E(boolean z10) {
        if (z10 == this.f1658d) {
            return;
        }
        this.f1658d = z10;
        if (this.f1658d) {
            return;
        }
        j();
    }

    public void F(Rational rational) {
        this.f1659e = rational;
    }

    public void G(int i10) {
        this.f1667m = i10;
    }

    public x5.a<androidx.camera.core.j0> I(final androidx.camera.core.i0 i0Var) {
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.a2
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object C;
                C = e2.this.C(i0Var, aVar);
                return C;
            }
        });
    }

    /* renamed from: J */
    public void B(c.a<androidx.camera.core.j0> aVar, androidx.camera.core.i0 i0Var) {
        if (!this.f1658d) {
            aVar.f(new m.a("Camera is not active."));
            return;
        }
        Rect y10 = this.f1655a.y();
        Rational r10 = r();
        List<MeteringRectangle> u10 = u(i0Var.c(), this.f1655a.C(), r10, y10, 1);
        List<MeteringRectangle> u11 = u(i0Var.b(), this.f1655a.B(), r10, y10, 2);
        List<MeteringRectangle> u12 = u(i0Var.d(), this.f1655a.D(), r10, y10, 4);
        if (u10.isEmpty() && u11.isEmpty() && u12.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        o("Cancelled by another startFocusAndMetering()");
        p("Cancelled by another startFocusAndMetering()");
        m();
        this.f1673s = aVar;
        MeteringRectangle[] meteringRectangleArr = f1654u;
        n((MeteringRectangle[]) u10.toArray(meteringRectangleArr), (MeteringRectangle[]) u11.toArray(meteringRectangleArr), (MeteringRectangle[]) u12.toArray(meteringRectangleArr), i0Var);
    }

    public void K(c.a<Void> aVar) {
        if (!this.f1658d) {
            if (aVar == null) {
                return;
            }
            aVar.f(new m.a("Camera is not active."));
            return;
        }
        k0.a aVar2 = new k0.a();
        aVar2.p(this.f1667m);
        aVar2.q(true);
        a.C0313a c0313a = new a.C0313a();
        c0313a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0313a.c());
        aVar2.c(new b(aVar));
        this.f1655a.i0(Collections.singletonList(aVar2.h()));
    }

    public void L(c.a<w.q> aVar, boolean z10) {
        if (!this.f1658d) {
            if (aVar == null) {
                return;
            }
            aVar.f(new m.a("Camera is not active."));
            return;
        }
        k0.a aVar2 = new k0.a();
        aVar2.p(this.f1667m);
        aVar2.q(true);
        a.C0313a c0313a = new a.C0313a();
        c0313a.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0313a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f1655a.G(1)));
        }
        aVar2.e(c0313a.c());
        aVar2.c(new a(aVar));
        this.f1655a.i0(Collections.singletonList(aVar2.h()));
    }

    public void g(a.C0313a c0313a) {
        c0313a.e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f1655a.H(this.f1661g ? 1 : q())));
        MeteringRectangle[] meteringRectangleArr = this.f1670p;
        if (meteringRectangleArr.length != 0) {
            c0313a.e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f1671q;
        if (meteringRectangleArr2.length != 0) {
            c0313a.e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f1672r;
        if (meteringRectangleArr3.length != 0) {
            c0313a.e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void h(boolean z10, boolean z11) {
        if (!this.f1658d) {
            return;
        }
        k0.a aVar = new k0.a();
        aVar.q(true);
        aVar.p(this.f1667m);
        a.C0313a c0313a = new a.C0313a();
        if (z10) {
            c0313a.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z11) {
            c0313a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        aVar.e(c0313a.c());
        this.f1655a.i0(Collections.singletonList(aVar.h()));
    }

    void i(c.a<Void> aVar) {
        p("Cancelled by another cancelFocusAndMetering()");
        o("Cancelled by cancelFocusAndMetering()");
        this.f1674t = aVar;
        m();
        if (H()) {
            h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f1654u;
        this.f1670p = meteringRectangleArr;
        this.f1671q = meteringRectangleArr;
        this.f1672r = meteringRectangleArr;
        this.f1661g = false;
        final long l02 = this.f1655a.l0();
        if (this.f1674t != null) {
            final int H = this.f1655a.H(q());
            t.c cVar = new t.c() { // from class: androidx.camera.camera2.internal.y1
                @Override // androidx.camera.camera2.internal.t.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean x10;
                    x10 = e2.this.x(H, l02, totalCaptureResult);
                    return x10;
                }
            };
            this.f1669o = cVar;
            this.f1655a.u(cVar);
        }
    }

    void j() {
        i(null);
    }

    int q() {
        return this.f1667m != 3 ? 4 : 3;
    }
}
