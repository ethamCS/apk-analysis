package t;

import android.hardware.camera2.CameraCharacteristics;
import w.x1;
/* loaded from: classes.dex */
public class c implements x1 {
    public static boolean b(r.z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
            return false;
        }
        return false;
    }

    public int a() {
        return 2;
    }
}
