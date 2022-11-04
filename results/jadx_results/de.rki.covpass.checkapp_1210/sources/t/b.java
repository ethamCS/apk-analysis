package t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.x1;
/* loaded from: classes.dex */
public class b implements x1 {
    public static boolean a(r.z zVar) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
