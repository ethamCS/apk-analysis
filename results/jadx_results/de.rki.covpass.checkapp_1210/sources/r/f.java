package r;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class f extends Exception {

    /* renamed from: q */
    static final Set<Integer> f20275q = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: x */
    static final Set<Integer> f20276x = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: c */
    private final int f20277c;

    /* renamed from: d */
    private final CameraAccessException f20278d;

    public f(int i10, String str, Throwable th2) {
        super(b(i10, str), th2);
        this.f20277c = i10;
        this.f20278d = f20275q.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th2) : null;
    }

    public f(int i10, Throwable th2) {
        super(c(i10), th2);
        this.f20277c = i10;
        this.f20278d = f20275q.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th2) : null;
    }

    private f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f20277c = cameraAccessException.getReason();
        this.f20278d = cameraAccessException;
    }

    private static String b(int i10, String str) {
        return String.format("%s (%d): %s", e(i10), Integer.valueOf(i10), str);
    }

    private static String c(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
            }
            if (i10 == 3) {
                return "The camera device is currently in the error state; no further calls to it will succeed.";
            }
            if (i10 == 4) {
                return "The camera device is in use already";
            }
            if (i10 == 5) {
                return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
            }
            if (i10 == 10001) {
                return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
            }
            if (i10 == 10002) {
                return "Failed to create CameraCharacteristics.";
            }
            return null;
        }
        return "The camera is disabled due to a device policy, and cannot be opened.";
    }

    private static String e(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static f g(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new f(cameraAccessException);
    }

    public final int f() {
        return this.f20277c;
    }
}
