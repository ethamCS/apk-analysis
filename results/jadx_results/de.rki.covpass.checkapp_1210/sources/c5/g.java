package c5;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f6277a = new float[9];

    /* renamed from: b */
    private final float[] f6278b = new float[9];

    /* renamed from: c */
    private final Matrix f6279c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f6277a);
        matrix2.getValues(this.f6278b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f6278b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f6277a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f6279c.setValues(this.f6278b);
        return this.f6279c;
    }
}
