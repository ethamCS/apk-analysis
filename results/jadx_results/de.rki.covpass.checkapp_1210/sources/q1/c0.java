package q1;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class c0 extends h0 {

    /* renamed from: c */
    private static boolean f19367c = true;

    @Override // q1.h0
    public void a(View view) {
    }

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f19367c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f19367c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // q1.h0
    public void c(View view) {
    }

    @Override // q1.h0
    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f19367c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f19367c = false;
            }
        }
        view.setAlpha(f10);
    }
}
