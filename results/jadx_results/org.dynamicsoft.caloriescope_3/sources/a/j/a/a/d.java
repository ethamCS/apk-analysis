package a.j.a.a;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a */
    private final float[] f319a;

    /* renamed from: b */
    private final float f320b;

    public d(float[] fArr) {
        this.f319a = fArr;
        this.f320b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f319a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f320b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f319a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
