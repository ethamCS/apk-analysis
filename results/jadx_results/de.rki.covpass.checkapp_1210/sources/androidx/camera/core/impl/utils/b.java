package androidx.camera.core.impl.utils;

import androidx.camera.core.s1;
/* loaded from: classes.dex */
public final class b {
    public static int a(int i10, int i11, boolean z10) {
        int i12 = (z10 ? (i11 - i10) + 360 : i11 + i10) % 360;
        if (s1.f("CameraOrientationUtil")) {
            s1.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 90;
            }
            if (i10 == 2) {
                return 180;
            }
            if (i10 == 3) {
                return 270;
            }
            throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
        }
        return 0;
    }
}
