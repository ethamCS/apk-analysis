package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class n extends RecyclerView.r {

    /* renamed from: a */
    RecyclerView f1135a;

    /* renamed from: b */
    private Scroller f1136b;

    /* renamed from: c */
    private final RecyclerView.t f1137c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {

        /* renamed from: a */
        boolean f1138a = false;

        a() {
            n.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i != 0 || !this.f1138a) {
                return;
            }
            this.f1138a = false;
            n.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f1138a = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(context);
            n.this = r1;
        }

        @Override // androidx.recyclerview.widget.g
        protected float a(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            n nVar = n.this;
            RecyclerView recyclerView = nVar.f1135a;
            if (recyclerView == null) {
                return;
            }
            int[] a2 = nVar.a(recyclerView.getLayoutManager(), view);
            int i = a2[0];
            int i2 = a2[1];
            int d = d(Math.max(Math.abs(i), Math.abs(i2)));
            if (d <= 0) {
                return;
            }
            aVar.a(i, i2, d, this.j);
        }
    }

    private void b() {
        this.f1135a.removeOnScrollListener(this.f1137c);
        this.f1135a.setOnFlingListener(null);
    }

    private boolean b(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.z a2;
        int a3;
        if (!(oVar instanceof RecyclerView.z.b) || (a2 = a(oVar)) == null || (a3 = a(oVar, i, i2)) == -1) {
            return false;
        }
        a2.c(a3);
        oVar.b(a2);
        return true;
    }

    private void c() {
        if (this.f1135a.getOnFlingListener() == null) {
            this.f1135a.addOnScrollListener(this.f1137c);
            this.f1135a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public abstract int a(RecyclerView.o oVar, int i, int i2);

    protected RecyclerView.z a(RecyclerView.o oVar) {
        return b(oVar);
    }

    void a() {
        RecyclerView.o layoutManager;
        View c2;
        RecyclerView recyclerView = this.f1135a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c2 = c(layoutManager)) == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        if (a2[0] == 0 && a2[1] == 0) {
            return;
        }
        this.f1135a.smoothScrollBy(a2[0], a2[1]);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1135a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            b();
        }
        this.f1135a = recyclerView;
        if (recyclerView == null) {
            return;
        }
        c();
        this.f1136b = new Scroller(this.f1135a.getContext(), new DecelerateInterpolator());
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.f1135a.getLayoutManager();
        if (layoutManager == null || this.f1135a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f1135a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && b(layoutManager, i, i2);
    }

    public abstract int[] a(RecyclerView.o oVar, View view);

    @Deprecated
    protected g b(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f1135a.getContext());
    }

    public int[] b(int i, int i2) {
        this.f1136b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f1136b.getFinalX(), this.f1136b.getFinalY()};
    }

    public abstract View c(RecyclerView.o oVar);
}
