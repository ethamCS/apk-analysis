package b.p;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class e0 extends d0 {

    /* renamed from: f */
    private static boolean f2719f = true;

    /* renamed from: g */
    private static boolean f2720g = true;

    @Override // b.p.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f2719f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2719f = false;
            }
        }
    }

    @Override // b.p.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f2720g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2720g = false;
            }
        }
    }
}
