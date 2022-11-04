package u;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.s1;
import java.nio.BufferUnderflowException;
import r.z;
/* loaded from: classes.dex */
public final class f {
    private static boolean a(z zVar) {
        Boolean bool = (Boolean) zVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            s1.k("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static boolean b(z zVar) {
        try {
            return a(zVar);
        } catch (BufferUnderflowException unused) {
            return false;
        }
    }

    public static boolean c(z zVar) {
        if (t.l.a(t.q.class) != null) {
            s1.a("FlashAvailability", "Device has quirk " + t.q.class.getSimpleName() + ". Checking for flash availability safely...");
            return b(zVar);
        }
        return a(zVar);
    }
}
