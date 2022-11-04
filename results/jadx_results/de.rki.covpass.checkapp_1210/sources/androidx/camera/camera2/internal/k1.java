package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import w.j;
/* loaded from: classes.dex */
final class k1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final w.h f1796a;

    public k1(w.h hVar) {
        Objects.requireNonNull(hVar, "cameraCaptureCallback is null");
        this.f1796a = hVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        w.j2 j2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            androidx.core.util.h.b(tag instanceof w.j2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            j2Var = (w.j2) tag;
        } else {
            j2Var = w.j2.a();
        }
        this.f1796a.b(new e(j2Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f1796a.c(new w.j(j.a.ERROR));
    }
}
