package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
/* loaded from: classes.dex */
public interface o2 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public void n(o2 o2Var) {
        }

        public void o(o2 o2Var) {
        }

        public void p(o2 o2Var) {
        }

        public void q(o2 o2Var) {
        }

        public void r(o2 o2Var) {
        }

        public void s(o2 o2Var) {
        }

        public void t(o2 o2Var) {
        }

        public void u(o2 o2Var, Surface surface) {
        }
    }

    a a();

    void b();

    void close();

    void e();

    int g(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    x5.a<Void> h();

    r.g i();

    void j();

    CameraDevice k();

    int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
}
