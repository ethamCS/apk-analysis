package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class s {
    public static int a(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.K() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.i0(view) - oVar.i0(view2)) + 1;
        }
        return Math.min(qVar.n(), qVar.d(view2) - qVar.g(view));
    }

    public static int b(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.K() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.b() - Math.max(oVar.i0(view), oVar.i0(view2))) - 1) : Math.max(0, Math.min(oVar.i0(view), oVar.i0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(qVar.d(view2) - qVar.g(view)) / (Math.abs(oVar.i0(view) - oVar.i0(view2)) + 1))) + (qVar.m() - qVar.g(view)));
    }

    public static int c(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.K() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((qVar.d(view2) - qVar.g(view)) / (Math.abs(oVar.i0(view) - oVar.i0(view2)) + 1)) * a0Var.b());
    }
}
