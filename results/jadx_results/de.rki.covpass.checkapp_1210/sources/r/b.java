package r;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
/* loaded from: classes.dex */
public class b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
