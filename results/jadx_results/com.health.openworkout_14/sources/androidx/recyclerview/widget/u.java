package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class u extends RecyclerView.r {

    /* renamed from: a */
    RecyclerView f1811a;

    /* renamed from: b */
    private Scroller f1812b;

    /* renamed from: c */
    private final RecyclerView.t f1813c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {

        /* renamed from: a */
        boolean f1814a = false;

        a() {
            u.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i != 0 || !this.f1814a) {
                return;
            }
            this.f1814a = false;
            u.this.l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f1814a = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(context);
            u.this = r1;
        }

        @Override // androidx.recyclerview.widget.m, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            u uVar = u.this;
            RecyclerView recyclerView = uVar.f1811a;
            if (recyclerView == null) {
                return;
            }
            int[] c2 = uVar.c(recyclerView.getLayoutManager(), view);
            int i = c2[0];
            int i2 = c2[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w <= 0) {
                return;
            }
            aVar.d(i, i2, w, this.j);
        }

        @Override // androidx.recyclerview.widget.m
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f1811a.d1(this.f1813c);
        this.f1811a.setOnFlingListener(null);
    }

    private void j() {
        if (this.f1811a.getOnFlingListener() == null) {
            this.f1811a.l(this.f1813c);
            this.f1811a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.z e2;
        int i3;
        if (!(oVar instanceof RecyclerView.z.b) || (e2 = e(oVar)) == null || (i3 = i(oVar, i, i2)) == -1) {
            return false;
        }
        e2.p(i3);
        oVar.K1(e2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.f1811a.getLayoutManager();
        if (layoutManager == null || this.f1811a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f1811a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && k(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1811a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f1811a = recyclerView;
        if (recyclerView == null) {
            return;
        }
        j();
        this.f1812b = new Scroller(this.f1811a.getContext(), new DecelerateInterpolator());
        l();
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i, int i2) {
        this.f1812b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f1812b.getFinalX(), this.f1812b.getFinalY()};
    }

    protected RecyclerView.z e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @Deprecated
    protected m f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f1811a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i, int i2);

    void l() {
        RecyclerView.o layoutManager;
        View h2;
        RecyclerView recyclerView = this.f1811a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h2 = h(layoutManager)) == null) {
            return;
        }
        int[] c2 = c(layoutManager, h2);
        if (c2[0] == 0 && c2[1] == 0) {
            return;
        }
        this.f1811a.q1(c2[0], c2[1]);
    }
}
