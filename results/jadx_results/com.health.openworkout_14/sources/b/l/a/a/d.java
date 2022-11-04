package b.l.a.a;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a */
    private final float[] f2643a;

    /* renamed from: b */
    private final float f2644b;

    public d(float[] fArr) {
        this.f2643a = fArr;
        this.f2644b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2643a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2644b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.f2643a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
