package a.m;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class d0 extends i0 {
    private static boolean e = true;

    @Override // a.m.i0
    public void a(View view) {
    }

    @Override // a.m.i0
    @SuppressLint({"NewApi"})
    public void a(View view, float f) {
        if (e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // a.m.i0
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a.m.i0
    public void c(View view) {
    }
}
