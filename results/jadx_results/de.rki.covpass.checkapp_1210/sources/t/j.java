package t;

import android.hardware.camera2.CameraCharacteristics;
import w.x1;
/* loaded from: classes.dex */
public class j implements x1 {
    public static boolean a(r.z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
