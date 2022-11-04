package w;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes.dex */
public final class i0 {

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static void a(Context context, e0 e0Var, androidx.camera.core.s sVar) {
        Integer d10;
        if (sVar != null) {
            try {
                d10 = sVar.d();
                if (d10 == null) {
                    androidx.camera.core.s1.k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                androidx.camera.core.s1.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            d10 = null;
        }
        androidx.camera.core.s1.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d10);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (sVar == null || d10.intValue() == 1)) {
                androidx.camera.core.s.f2464c.e(e0Var.a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (sVar != null && d10.intValue() != 0) {
                return;
            }
            androidx.camera.core.s.f2463b.e(e0Var.a());
        } catch (IllegalArgumentException e11) {
            androidx.camera.core.s1.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + e0Var.a());
            throw new a("Expected camera missing from device.", e11);
        }
    }
}
