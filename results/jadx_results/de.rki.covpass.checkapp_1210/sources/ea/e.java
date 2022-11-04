package ea;
/* loaded from: classes.dex */
public class e {
    public static float a(float f10) {
        return (fa.a.f10105a * f10) / 180.0f;
    }

    public static double b(double d10, double d11) {
        return Math.abs(c(d10, d11));
    }

    public static double c(double d10, double d11) {
        double d12;
        double d13 = d10 - d11;
        if (d13 > 3.141592653589793d) {
            d12 = fa.a.f10106b;
        } else if (d13 >= -3.141592653589793d) {
            return d13;
        } else {
            d12 = -fa.a.f10106b;
        }
        return d12 - d13;
    }

    public static float d(float f10) {
        return a(f10);
    }
}
