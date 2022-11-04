package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class n extends u {

    /* renamed from: d */
    private q f1800d;

    /* renamed from: e */
    private q f1801e;

    private float m(RecyclerView.o oVar, q qVar) {
        int K = oVar.K();
        if (K == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < K; i3++) {
            View J = oVar.J(i3);
            int i0 = oVar.i0(J);
            if (i0 != -1) {
                if (i0 < i) {
                    view = J;
                    i = i0;
                }
                if (i0 > i2) {
                    view2 = J;
                    i2 = i0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(qVar.d(view), qVar.d(view2)) - Math.min(qVar.g(view), qVar.g(view2));
        if (max != 0) {
            return (max * 1.0f) / ((i2 - i) + 1);
        }
        return 1.0f;
    }

    private int n(RecyclerView.o oVar, View view, q qVar) {
        return (qVar.g(view) + (qVar.e(view) / 2)) - (qVar.m() + (qVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, q qVar, int i, int i2) {
        int[] d2 = d(i, i2);
        float m = m(oVar, qVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d2[0]) > Math.abs(d2[1]) ? d2[0] : d2[1]) / m);
    }

    private View p(RecyclerView.o oVar, q qVar) {
        int K = oVar.K();
        View view = null;
        if (K == 0) {
            return null;
        }
        int m = qVar.m() + (qVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < K; i2++) {
            View J = oVar.J(i2);
            int abs = Math.abs((qVar.g(J) + (qVar.e(J) / 2)) - m);
            if (abs < i) {
                view = J;
                i = abs;
            }
        }
        return view;
    }

    private q q(RecyclerView.o oVar) {
        q qVar = this.f1801e;
        if (qVar == null || qVar.f1803a != oVar) {
            this.f1801e = q.a(oVar);
        }
        return this.f1801e;
    }

    private q r(RecyclerView.o oVar) {
        q qVar = this.f1800d;
        if (qVar == null || qVar.f1803a != oVar) {
            this.f1800d = q.c(oVar);
        }
        return this.f1800d;
    }

    @Override // androidx.recyclerview.widget.u
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.l()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.m()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u
    public View h(RecyclerView.o oVar) {
        q q;
        if (oVar.m()) {
            q = r(oVar);
        } else if (!oVar.l()) {
            return null;
        } else {
            q = q(oVar);
        }
        return p(oVar, q);
    }

    @Override // androidx.recyclerview.widget.u
    public int i(RecyclerView.o oVar, int i, int i2) {
        int Z;
        View h2;
        int i0;
        int i3;
        PointF a2;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.z.b) || (Z = oVar.Z()) == 0 || (h2 = h(oVar)) == null || (i0 = oVar.i0(h2)) == -1 || (a2 = ((RecyclerView.z.b) oVar).a(Z - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.l()) {
            i4 = o(oVar, q(oVar), i, 0);
            if (a2.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.m()) {
            i5 = o(oVar, r(oVar), 0, i2);
            if (a2.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.m()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = i0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= Z ? i3 : i6;
    }
}
