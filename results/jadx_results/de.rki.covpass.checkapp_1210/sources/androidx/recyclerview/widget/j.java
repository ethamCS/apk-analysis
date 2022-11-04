package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: d */
    private i f4794d;

    /* renamed from: e */
    private i f4795e;

    /* loaded from: classes.dex */
    class a extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(context);
            j.this = r1;
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            j jVar = j.this;
            int[] c10 = jVar.c(jVar.f4802a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w9 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w9 > 0) {
                aVar.d(i10, i11, w9, this.f4783j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.g
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View m(RecyclerView.o oVar, i iVar) {
        int J = oVar.J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m10 = iVar.m() + (iVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < J; i11++) {
            View I = oVar.I(i11);
            int abs = Math.abs((iVar.g(I) + (iVar.e(I) / 2)) - m10);
            if (abs < i10) {
                view = I;
                i10 = abs;
            }
        }
        return view;
    }

    private i n(RecyclerView.o oVar) {
        i iVar = this.f4795e;
        if (iVar == null || iVar.f4791a != oVar) {
            this.f4795e = i.a(oVar);
        }
        return this.f4795e;
    }

    private i o(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar);
        }
        if (!oVar.k()) {
            return null;
        }
        return n(oVar);
    }

    private i p(RecyclerView.o oVar) {
        i iVar = this.f4794d;
        if (iVar == null || iVar.f4791a != oVar) {
            this.f4794d = i.c(oVar);
        }
        return this.f4794d;
    }

    private boolean q(RecyclerView.o oVar, int i10, int i11) {
        return oVar.k() ? i10 > 0 : i11 > 0;
    }

    private boolean r(RecyclerView.o oVar) {
        PointF a10;
        int Y = oVar.Y();
        if (!(oVar instanceof RecyclerView.z.b) || (a10 = ((RecyclerView.z.b) oVar).a(Y - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected g e(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new a(this.f4802a.getContext());
    }

    @Override // androidx.recyclerview.widget.n
    public View g(RecyclerView.o oVar) {
        i n10;
        if (oVar.l()) {
            n10 = p(oVar);
        } else if (!oVar.k()) {
            return null;
        } else {
            n10 = n(oVar);
        }
        return m(oVar, n10);
    }

    @Override // androidx.recyclerview.widget.n
    public int h(RecyclerView.o oVar, int i10, int i11) {
        i o10;
        int Y = oVar.Y();
        if (Y == 0 || (o10 = o(oVar)) == null) {
            return -1;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int J = oVar.J();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < J; i14++) {
            View I = oVar.I(i14);
            if (I != null) {
                int l10 = l(oVar, I, o10);
                if (l10 <= 0 && l10 > i12) {
                    view2 = I;
                    i12 = l10;
                }
                if (l10 >= 0 && l10 < i13) {
                    view = I;
                    i13 = l10;
                }
            }
        }
        boolean q10 = q(oVar, i10, i11);
        if (q10 && view != null) {
            return oVar.h0(view);
        }
        if (!q10 && view2 != null) {
            return oVar.h0(view2);
        }
        if (q10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h02 = oVar.h0(view) + (r(oVar) == q10 ? -1 : 1);
        if (h02 >= 0 && h02 < Y) {
            return h02;
        }
        return -1;
    }
}
