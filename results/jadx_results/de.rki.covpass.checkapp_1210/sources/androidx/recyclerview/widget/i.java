package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    protected final RecyclerView.o f4791a;

    /* renamed from: b */
    private int f4792b;

    /* renamed from: c */
    final Rect f4793c;

    /* loaded from: classes.dex */
    public static class a extends i {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4791a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4791a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4791a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4791a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4791a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4791a.o0() - this.f4791a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4791a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4791a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4791a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4791a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4791a.o0() - this.f4791a.e0()) - this.f4791a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4791a.n0(view, true, this.f4793c);
            return this.f4793c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4791a.n0(view, true, this.f4793c);
            return this.f4793c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f4791a.C0(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4791a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4791a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4791a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4791a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4791a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4791a.W() - this.f4791a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4791a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4791a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4791a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4791a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4791a.W() - this.f4791a.g0()) - this.f4791a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4791a.n0(view, true, this.f4793c);
            return this.f4793c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4791a.n0(view, true, this.f4793c);
            return this.f4793c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f4791a.D0(i10);
        }
    }

    private i(RecyclerView.o oVar) {
        this.f4792b = Integer.MIN_VALUE;
        this.f4793c = new Rect();
        this.f4791a = oVar;
    }

    /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            return c(oVar);
        }
        return a(oVar);
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f4792b) {
            return 0;
        }
        return n() - this.f4792b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f4792b = n();
    }
}
