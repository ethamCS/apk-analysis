package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.o2;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import u.u;
import w.r0;
import w.y1;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    private final boolean f22487a;

    /* renamed from: c */
    private final x5.a<Void> f22489c;

    /* renamed from: d */
    c.a<Void> f22490d;

    /* renamed from: e */
    private boolean f22491e;

    /* renamed from: b */
    private final Object f22488b = new Object();

    /* renamed from: f */
    private final CameraCaptureSession.CaptureCallback f22492f = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a() {
            u.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            c.a<Void> aVar = u.this.f22490d;
            if (aVar != null) {
                aVar.d();
                u.this.f22490d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            c.a<Void> aVar = u.this.f22490d;
            if (aVar != null) {
                aVar.c(null);
                u.this.f22490d = null;
            }
        }
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface b {
        x5.a<Void> a(CameraDevice cameraDevice, s.g gVar, List<r0> list);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface c {
        int a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public u(y1 y1Var) {
        this.f22487a = y1Var.a(t.i.class);
        this.f22489c = i() ? androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: u.s
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = u.this.d(aVar);
                return d10;
            }
        }) : y.f.h(null);
    }

    public /* synthetic */ Object d(c.a aVar) {
        this.f22490d = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    public x5.a<Void> c() {
        return y.f.j(this.f22489c);
    }

    public void f() {
        synchronized (this.f22488b) {
            if (i() && !this.f22491e) {
                this.f22489c.cancel(true);
            }
        }
    }

    public x5.a<Void> g(final CameraDevice cameraDevice, final s.g gVar, final List<r0> list, List<o2> list2, final b bVar) {
        ArrayList arrayList = new ArrayList();
        for (o2 o2Var : list2) {
            arrayList.add(o2Var.h());
        }
        return y.d.a(y.f.n(arrayList)).f(new y.a() { // from class: u.t
            @Override // y.a
            public final x5.a apply(Object obj) {
                x5.a a10;
                List list3 = (List) obj;
                a10 = u.b.this.a(cameraDevice, gVar, list);
                return a10;
            }
        }, x.a.a());
    }

    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) {
        int a10;
        synchronized (this.f22488b) {
            if (i()) {
                captureCallback = k0.b(this.f22492f, captureCallback);
                this.f22491e = true;
            }
            a10 = cVar.a(captureRequest, captureCallback);
        }
        return a10;
    }

    public boolean i() {
        return this.f22487a;
    }
}
