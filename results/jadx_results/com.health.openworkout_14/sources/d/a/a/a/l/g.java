package d.a.a.a.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f3650a = new float[9];

    /* renamed from: b */
    private final float[] f3651b = new float[9];

    /* renamed from: c */
    private final Matrix f3652c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f3650a);
        matrix2.getValues(this.f3651b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f3651b;
            float f3 = fArr[i];
            float[] fArr2 = this.f3650a;
            fArr[i] = fArr2[i] + ((f3 - fArr2[i]) * f2);
        }
        this.f3652c.setValues(this.f3651b);
        return this.f3652c;
    }
}
