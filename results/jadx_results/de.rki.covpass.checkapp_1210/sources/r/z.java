package r;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f20350a = new HashMap();

    /* renamed from: b */
    private final a f20351b;

    /* loaded from: classes.dex */
    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    private z(CameraCharacteristics cameraCharacteristics) {
        this.f20351b = Build.VERSION.SDK_INT >= 28 ? new x(cameraCharacteristics) : new y(cameraCharacteristics);
    }

    private boolean b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static z c(CameraCharacteristics cameraCharacteristics) {
        return new z(cameraCharacteristics);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (b(key)) {
            return (T) this.f20351b.a(key);
        }
        synchronized (this) {
            T t10 = (T) this.f20350a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f20351b.a(key);
            if (t11 != null) {
                this.f20350a.put(key, t11);
            }
            return t11;
        }
    }
}
