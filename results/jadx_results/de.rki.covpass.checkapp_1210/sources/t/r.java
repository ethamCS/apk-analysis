package t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class r implements b0 {

    /* renamed from: a */
    private static final List<String> f21781a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    public static boolean a(r.z zVar) {
        return f21781a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
