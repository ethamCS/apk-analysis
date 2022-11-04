package r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import r.g;
/* loaded from: classes.dex */
public class w implements g.a {

    /* renamed from: a */
    final CameraCaptureSession f20346a;

    /* renamed from: b */
    final Object f20347b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f20348a;

        a(Handler handler) {
            this.f20348a = handler;
        }
    }

    public w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f20346a = (CameraCaptureSession) androidx.core.util.h.g(cameraCaptureSession);
        this.f20347b = obj;
    }

    public static g.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new w(cameraCaptureSession, new a(handler));
    }

    @Override // r.g.a
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f20346a.setRepeatingRequest(captureRequest, new g.b(executor, captureCallback), ((a) this.f20347b).f20348a);
    }

    @Override // r.g.a
    public CameraCaptureSession b() {
        return this.f20346a;
    }

    @Override // r.g.a
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f20346a.captureBurst(list, new g.b(executor, captureCallback), ((a) this.f20347b).f20348a);
    }
}
