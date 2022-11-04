package q1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class d0 extends c0 {

    /* renamed from: d */
    private static boolean f19372d = true;

    /* renamed from: e */
    private static boolean f19373e = true;

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f19372d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f19372d = false;
            }
        }
    }

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f19373e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f19373e = false;
            }
        }
    }
}
