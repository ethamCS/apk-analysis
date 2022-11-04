package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a */
    protected final RecyclerView.o f1803a;

    /* renamed from: b */
    private int f1804b;

    /* renamed from: c */
    final Rect f1805c;

    /* loaded from: classes.dex */
    public static class a extends q {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.q
        public int d(View view) {
            return this.f1803a.U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1803a.T(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1803a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int g(View view) {
            return this.f1803a.R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int h() {
            return this.f1803a.p0();
        }

        @Override // androidx.recyclerview.widget.q
        public int i() {
            return this.f1803a.p0() - this.f1803a.g0();
        }

        @Override // androidx.recyclerview.widget.q
        public int j() {
            return this.f1803a.g0();
        }

        @Override // androidx.recyclerview.widget.q
        public int k() {
            return this.f1803a.q0();
        }

        @Override // androidx.recyclerview.widget.q
        public int l() {
            return this.f1803a.Y();
        }

        @Override // androidx.recyclerview.widget.q
        public int m() {
            return this.f1803a.f0();
        }

        @Override // androidx.recyclerview.widget.q
        public int n() {
            return (this.f1803a.p0() - this.f1803a.f0()) - this.f1803a.g0();
        }

        @Override // androidx.recyclerview.widget.q
        public int p(View view) {
            this.f1803a.o0(view, true, this.f1805c);
            return this.f1805c.right;
        }

        @Override // androidx.recyclerview.widget.q
        public int q(View view) {
            this.f1803a.o0(view, true, this.f1805c);
            return this.f1805c.left;
        }

        @Override // androidx.recyclerview.widget.q
        public void r(int i) {
            this.f1803a.D0(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends q {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.q
        public int d(View view) {
            return this.f1803a.P(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1803a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1803a.T(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int g(View view) {
            return this.f1803a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int h() {
            return this.f1803a.X();
        }

        @Override // androidx.recyclerview.widget.q
        public int i() {
            return this.f1803a.X() - this.f1803a.e0();
        }

        @Override // androidx.recyclerview.widget.q
        public int j() {
            return this.f1803a.e0();
        }

        @Override // androidx.recyclerview.widget.q
        public int k() {
            return this.f1803a.Y();
        }

        @Override // androidx.recyclerview.widget.q
        public int l() {
            return this.f1803a.q0();
        }

        @Override // androidx.recyclerview.widget.q
        public int m() {
            return this.f1803a.h0();
        }

        @Override // androidx.recyclerview.widget.q
        public int n() {
            return (this.f1803a.X() - this.f1803a.h0()) - this.f1803a.e0();
        }

        @Override // androidx.recyclerview.widget.q
        public int p(View view) {
            this.f1803a.o0(view, true, this.f1805c);
            return this.f1805c.bottom;
        }

        @Override // androidx.recyclerview.widget.q
        public int q(View view) {
            this.f1803a.o0(view, true, this.f1805c);
            return this.f1805c.top;
        }

        @Override // androidx.recyclerview.widget.q
        public void r(int i) {
            this.f1803a.E0(i);
        }
    }

    private q(RecyclerView.o oVar) {
        this.f1804b = Integer.MIN_VALUE;
        this.f1805c = new Rect();
        this.f1803a = oVar;
    }

    /* synthetic */ q(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static q a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static q b(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            return c(oVar);
        }
        return a(oVar);
    }

    public static q c(RecyclerView.o oVar) {
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
        if (Integer.MIN_VALUE == this.f1804b) {
            return 0;
        }
        return n() - this.f1804b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f1804b = n();
    }
}
