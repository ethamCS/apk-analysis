package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class h extends n {
    private j d;
    private j e;

    private float a(RecyclerView.o oVar, j jVar) {
        int e = oVar.e();
        if (e == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < e; i3++) {
            View d = oVar.d(i3);
            int l = oVar.l(d);
            if (l != -1) {
                if (l < i) {
                    view = d;
                    i = l;
                }
                if (l > i2) {
                    view2 = d;
                    i2 = l;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(jVar.a(view), jVar.a(view2)) - Math.min(jVar.d(view), jVar.d(view2));
        if (max != 0) {
            return (max * 1.0f) / ((i2 - i) + 1);
        }
        return 1.0f;
    }

    private int a(RecyclerView.o oVar, View view, j jVar) {
        return (jVar.d(view) + (jVar.b(view) / 2)) - (jVar.f() + (jVar.g() / 2));
    }

    private int a(RecyclerView.o oVar, j jVar, int i, int i2) {
        int[] b2 = b(i, i2);
        float a2 = a(oVar, jVar);
        if (a2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(b2[0]) > Math.abs(b2[1]) ? b2[0] : b2[1]) / a2);
    }

    private View b(RecyclerView.o oVar, j jVar) {
        int e = oVar.e();
        View view = null;
        if (e == 0) {
            return null;
        }
        int f = jVar.f() + (jVar.g() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < e; i2++) {
            View d = oVar.d(i2);
            int abs = Math.abs((jVar.d(d) + (jVar.b(d) / 2)) - f);
            if (abs < i) {
                view = d;
                i = abs;
            }
        }
        return view;
    }

    private j d(RecyclerView.o oVar) {
        j jVar = this.e;
        if (jVar == null || jVar.f1132a != oVar) {
            this.e = j.a(oVar);
        }
        return this.e;
    }

    private j e(RecyclerView.o oVar) {
        j jVar = this.d;
        if (jVar == null || jVar.f1132a != oVar) {
            this.d = j.b(oVar);
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.n
    public int a(RecyclerView.o oVar, int i, int i2) {
        int j;
        View c2;
        int l;
        int i3;
        PointF a2;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.z.b) || (j = oVar.j()) == 0 || (c2 = c(oVar)) == null || (l = oVar.l(c2)) == -1 || (a2 = ((RecyclerView.z.b) oVar).a(j - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.a()) {
            i4 = a(oVar, d(oVar), i, 0);
            if (a2.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.b()) {
            i5 = a(oVar, e(oVar), 0, i2);
            if (a2.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.b()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = l + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= j ? i3 : i6;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] a(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.a()) {
            iArr[0] = a(oVar, view, d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.b()) {
            iArr[1] = a(oVar, view, e(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public View c(RecyclerView.o oVar) {
        j d;
        if (oVar.b()) {
            d = e(oVar);
        } else if (!oVar.a()) {
            return null;
        } else {
            d = d(oVar);
        }
        return b(oVar, d);
    }
}
