package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
/* loaded from: classes.dex */
final class m3 {
    public static boolean a(r.z zVar, int i10) {
        int[] iArr = (int[]) zVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
