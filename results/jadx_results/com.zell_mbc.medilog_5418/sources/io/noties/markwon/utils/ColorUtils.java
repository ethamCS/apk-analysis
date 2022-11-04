package io.noties.markwon.utils;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
/* loaded from: classes2.dex */
public abstract class ColorUtils {
    public static int applyAlpha(int i, int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    public static int blend(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((f2 * Color.blue(i)) + (f * Color.blue(i2))));
    }

    private ColorUtils() {
    }
}
