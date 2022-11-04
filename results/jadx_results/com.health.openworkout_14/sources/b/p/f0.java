package b.p;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class f0 extends e0 {

    /* renamed from: h */
    private static boolean f2721h = true;

    @Override // b.p.i0
    @SuppressLint({"NewApi"})
    public void e(View view, int i, int i2, int i3, int i4) {
        if (f2721h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2721h = false;
            }
        }
    }
}
