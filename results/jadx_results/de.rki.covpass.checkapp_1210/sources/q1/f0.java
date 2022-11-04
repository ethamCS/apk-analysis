package q1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
class f0 extends e0 {

    /* renamed from: g */
    private static boolean f19389g = true;

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (!f19389g) {
        } else {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f19389g = false;
            }
        }
    }
}
