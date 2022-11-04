package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;
/* loaded from: classes.dex */
final class l1 extends w.h {

    /* renamed from: a */
    private final CameraCaptureSession.CaptureCallback f1802a;

    private l1(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f1802a = captureCallback;
    }

    public static l1 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new l1(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback e() {
        return this.f1802a;
    }
}
