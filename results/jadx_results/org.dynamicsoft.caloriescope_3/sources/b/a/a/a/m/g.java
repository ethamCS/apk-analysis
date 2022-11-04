package b.a.a.a.m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f1216a = new float[9];

    /* renamed from: b */
    private final float[] f1217b = new float[9];

    /* renamed from: c */
    private final Matrix f1218c = new Matrix();

    public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f1216a);
        matrix2.getValues(this.f1217b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f1217b;
            float f2 = fArr[i];
            float[] fArr2 = this.f1216a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f1218c.setValues(this.f1217b);
        return this.f1218c;
    }
}
