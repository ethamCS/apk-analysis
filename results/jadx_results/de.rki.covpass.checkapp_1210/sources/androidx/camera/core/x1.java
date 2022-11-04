package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a */
    private Rational f2547a;

    public x1() {
        this(null);
    }

    public x1(Rational rational) {
        this.f2547a = rational;
    }

    public static float d() {
        return 0.15f;
    }

    protected abstract PointF a(float f10, float f11);

    public final w1 b(float f10, float f11) {
        return c(f10, f11, d());
    }

    public final w1 c(float f10, float f11, float f12) {
        PointF a10 = a(f10, f11);
        return new w1(a10.x, a10.y, f12, this.f2547a);
    }
}
