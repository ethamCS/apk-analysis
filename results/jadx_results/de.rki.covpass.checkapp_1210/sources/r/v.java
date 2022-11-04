package r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class v extends w {
    public v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // r.w, r.g.a
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f20346a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // r.w, r.g.a
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f20346a.captureBurstRequests(list, executor, captureCallback);
    }
}
