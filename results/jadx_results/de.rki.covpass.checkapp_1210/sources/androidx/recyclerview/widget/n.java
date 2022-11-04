package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class n extends RecyclerView.r {

    /* renamed from: a */
    RecyclerView f4802a;

    /* renamed from: b */
    private Scroller f4803b;

    /* renamed from: c */
    private final RecyclerView.t f4804c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {

        /* renamed from: a */
        boolean f4805a = false;

        a() {
            n.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 != 0 || !this.f4805a) {
                return;
            }
            this.f4805a = false;
            n.this.k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4805a = true;
        }
    }

    private void f() {
        this.f4802a.Y0(this.f4804c);
        this.f4802a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f4802a.getOnFlingListener() == null) {
            this.f4802a.l(this.f4804c);
            this.f4802a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean j(RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.z d10;
        int h10;
        if (!(oVar instanceof RecyclerView.z.b) || (d10 = d(oVar)) == null || (h10 = h(oVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(h10);
        oVar.J1(d10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f4802a.getLayoutManager();
        if (layoutManager == null || this.f4802a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4802a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && j(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4802a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f4802a = recyclerView;
        if (recyclerView == null) {
            return;
        }
        i();
        this.f4803b = new Scroller(this.f4802a.getContext(), new DecelerateInterpolator());
        k();
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.z d(RecyclerView.o oVar) {
        return e(oVar);
    }

    @Deprecated
    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i10, int i11);

    void k() {
        RecyclerView.o layoutManager;
        View g10;
        RecyclerView recyclerView = this.f4802a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (g10 = g(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, g10);
        if (c10[0] == 0 && c10[1] == 0) {
            return;
        }
        this.f4802a.l1(c10[0], c10[1]);
    }
}
