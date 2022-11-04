package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import q.a;
/* loaded from: classes.dex */
public class w1 {

    /* renamed from: a */
    private final t f2043a;

    /* renamed from: b */
    private final x1 f2044b;

    /* renamed from: c */
    private final Executor f2045c;

    /* renamed from: d */
    private boolean f2046d = false;

    /* renamed from: e */
    private c.a<Integer> f2047e;

    /* renamed from: f */
    private t.c f2048f;

    public w1(t tVar, r.z zVar, Executor executor) {
        this.f2043a = tVar;
        this.f2044b = new x1(zVar, 0);
        this.f2045c = executor;
    }

    private void a() {
        c.a<Integer> aVar = this.f2047e;
        if (aVar != null) {
            aVar.f(new m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f2047e = null;
        }
        t.c cVar = this.f2048f;
        if (cVar != null) {
            this.f2043a.c0(cVar);
            this.f2048f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f2046d) {
            return;
        }
        this.f2046d = z10;
        if (z10) {
            return;
        }
        this.f2044b.b(0);
        a();
    }

    public void c(a.C0313a c0313a) {
        c0313a.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f2044b.a()));
    }
}
