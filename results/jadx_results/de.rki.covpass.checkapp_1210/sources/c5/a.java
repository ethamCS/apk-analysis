package c5;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static final TimeInterpolator f6267a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f6268b = new c1.b();

    /* renamed from: c */
    public static final TimeInterpolator f6269c = new c1.a();

    /* renamed from: d */
    public static final TimeInterpolator f6270d = new c1.c();

    /* renamed from: e */
    public static final TimeInterpolator f6271e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
