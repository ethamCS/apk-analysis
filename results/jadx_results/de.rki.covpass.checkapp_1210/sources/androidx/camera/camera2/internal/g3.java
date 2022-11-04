package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.internal.t;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import q.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a */
    private final t f1749a;

    /* renamed from: b */
    private final Executor f1750b;

    /* renamed from: c */
    private final h3 f1751c;

    /* renamed from: d */
    private final androidx.lifecycle.d0<androidx.camera.core.j3> f1752d;

    /* renamed from: e */
    final b f1753e;

    /* renamed from: f */
    private boolean f1754f = false;

    /* renamed from: g */
    private t.c f1755g = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements t.c {
        a() {
            g3.this = r1;
        }

        @Override // androidx.camera.camera2.internal.t.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            g3.this.f1753e.a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        Rect b();

        float c();

        void d(a.C0313a c0313a);

        float e();

        void f();
    }

    public g3(t tVar, r.z zVar, Executor executor) {
        this.f1749a = tVar;
        this.f1750b = executor;
        b b10 = b(zVar);
        this.f1753e = b10;
        h3 h3Var = new h3(b10.c(), b10.e());
        this.f1751c = h3Var;
        h3Var.f(1.0f);
        this.f1752d = new androidx.lifecycle.d0<>(z.f.e(h3Var));
        tVar.u(this.f1755g);
    }

    private static b b(r.z zVar) {
        return f(zVar) ? new androidx.camera.camera2.internal.a(zVar) : new u1(zVar);
    }

    private static Range<Float> d(r.z zVar) {
        try {
            return (Range) zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            androidx.camera.core.s1.l("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    static boolean f(r.z zVar) {
        return Build.VERSION.SDK_INT >= 30 && d(zVar) != null;
    }

    private void h(androidx.camera.core.j3 j3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f1752d.m(j3Var);
        } else {
            this.f1752d.k(j3Var);
        }
    }

    public void a(a.C0313a c0313a) {
        this.f1753e.d(c0313a);
    }

    public Rect c() {
        return this.f1753e.b();
    }

    public LiveData<androidx.camera.core.j3> e() {
        return this.f1752d;
    }

    public void g(boolean z10) {
        androidx.camera.core.j3 e10;
        if (this.f1754f == z10) {
            return;
        }
        this.f1754f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f1751c) {
            this.f1751c.f(1.0f);
            e10 = z.f.e(this.f1751c);
        }
        h(e10);
        this.f1753e.f();
        this.f1749a.l0();
    }
}
