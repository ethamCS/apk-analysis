package r;

import android.hardware.camera2.CameraManager;
/* loaded from: classes.dex */
public class e {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
