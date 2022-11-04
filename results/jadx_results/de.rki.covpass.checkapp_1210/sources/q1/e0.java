package q1;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class e0 extends d0 {

    /* renamed from: f */
    private static boolean f19388f = true;

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f19388f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f19388f = false;
            }
        }
    }
}
