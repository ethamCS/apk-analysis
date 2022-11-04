package h0;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a */
    private static final double f11138a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f11138a) * f11)) : f10;
    }

    public static float b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        return z10 ? (float) (f12 + ((1.0d - f11138a) * f11)) : f12;
    }
}
