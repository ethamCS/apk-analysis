package r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
/* loaded from: classes.dex */
public class h0 extends g0 {
    public h0(CameraDevice cameraDevice) {
        super((CameraDevice) androidx.core.util.h.g(cameraDevice), null);
    }

    @Override // r.g0, r.f0, r.a0.a
    public void a(s.g gVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.i();
        androidx.core.util.h.g(sessionConfiguration);
        try {
            this.f20291a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }
}
