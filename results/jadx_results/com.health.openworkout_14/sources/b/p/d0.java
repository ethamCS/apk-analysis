package b.p;

import android.annotation.SuppressLint;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 extends i0 {

    /* renamed from: e */
    private static boolean f2707e = true;

    @Override // b.p.i0
    public void a(View view) {
    }

    @Override // b.p.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f2707e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2707e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // b.p.i0
    public void d(View view) {
    }

    @Override // b.p.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f2707e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2707e = false;
            }
        }
        view.setAlpha(f2);
    }
}
