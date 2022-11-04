package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a */
    private final t f1689a;

    /* renamed from: b */
    private final androidx.lifecycle.d0<Integer> f1690b = new androidx.lifecycle.d0<>(0);

    /* renamed from: c */
    private final boolean f1691c;

    /* renamed from: d */
    private final Executor f1692d;

    /* renamed from: e */
    private boolean f1693e;

    /* renamed from: f */
    c.a<Void> f1694f;

    /* renamed from: g */
    boolean f1695g;

    public f3(t tVar, r.z zVar, Executor executor) {
        this.f1689a = tVar;
        this.f1692d = executor;
        this.f1691c = u.f.c(zVar);
        tVar.u(new t.c() { // from class: androidx.camera.camera2.internal.c3
            @Override // androidx.camera.camera2.internal.t.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean i10;
                i10 = f3.this.i(totalCaptureResult);
                return i10;
            }
        });
    }

    public /* synthetic */ Object h(final boolean z10, final c.a aVar) {
        this.f1692d.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e3
            @Override // java.lang.Runnable
            public final void run() {
                f3.this.g(aVar, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    public /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f1694f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f1695g) {
                this.f1694f.c(null);
                this.f1694f = null;
            }
        }
        return false;
    }

    private <T> void k(androidx.lifecycle.d0<T> d0Var, T t10) {
        if (androidx.camera.core.impl.utils.l.b()) {
            d0Var.m(t10);
        } else {
            d0Var.k(t10);
        }
    }

    public x5.a<Void> d(final boolean z10) {
        if (!this.f1691c) {
            androidx.camera.core.s1.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return y.f.f(new IllegalStateException("No flash unit"));
        }
        k(this.f1690b, Integer.valueOf(z10 ? 1 : 0));
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.d3
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object h10;
                h10 = f3.this.h(z10, aVar);
                return h10;
            }
        });
    }

    /* renamed from: e */
    public void g(c.a<Void> aVar, boolean z10) {
        if (!this.f1691c) {
            if (aVar == null) {
                return;
            }
            aVar.f(new IllegalStateException("No flash unit"));
        } else if (!this.f1693e) {
            k(this.f1690b, 0);
            if (aVar == null) {
                return;
            }
            aVar.f(new m.a("Camera is not active."));
        } else {
            this.f1695g = z10;
            this.f1689a.x(z10);
            k(this.f1690b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f1694f;
            if (aVar2 != null) {
                aVar2.f(new m.a("There is a new enableTorch being set"));
            }
            this.f1694f = aVar;
        }
    }

    public LiveData<Integer> f() {
        return this.f1690b;
    }

    public void j(boolean z10) {
        if (this.f1693e == z10) {
            return;
        }
        this.f1693e = z10;
        if (z10) {
            return;
        }
        if (this.f1695g) {
            this.f1695g = false;
            this.f1689a.x(false);
            k(this.f1690b, 0);
        }
        c.a<Void> aVar = this.f1694f;
        if (aVar == null) {
            return;
        }
        aVar.f(new m.a("Camera is not active."));
        this.f1694f = null;
    }
}
