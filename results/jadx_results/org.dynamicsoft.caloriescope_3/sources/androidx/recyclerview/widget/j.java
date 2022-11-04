package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    protected final RecyclerView.o f1132a;

    /* renamed from: b */
    private int f1133b;

    /* renamed from: c */
    final Rect f1134c;

    /* loaded from: classes.dex */
    public static class a extends j {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int a() {
            return this.f1132a.r();
        }

        @Override // androidx.recyclerview.widget.j
        public int a(View view) {
            return this.f1132a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public void a(int i) {
            this.f1132a.e(i);
        }

        @Override // androidx.recyclerview.widget.j
        public int b() {
            return this.f1132a.r() - this.f1132a.p();
        }

        @Override // androidx.recyclerview.widget.j
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1132a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int c() {
            return this.f1132a.p();
        }

        @Override // androidx.recyclerview.widget.j
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1132a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int d() {
            return this.f1132a.s();
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f1132a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e() {
            return this.f1132a.i();
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            this.f1132a.a(view, true, this.f1134c);
            return this.f1134c.right;
        }

        @Override // androidx.recyclerview.widget.j
        public int f() {
            return this.f1132a.o();
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            this.f1132a.a(view, true, this.f1134c);
            return this.f1134c.left;
        }

        @Override // androidx.recyclerview.widget.j
        public int g() {
            return (this.f1132a.r() - this.f1132a.o()) - this.f1132a.p();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int a() {
            return this.f1132a.h();
        }

        @Override // androidx.recyclerview.widget.j
        public int a(View view) {
            return this.f1132a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public void a(int i) {
            this.f1132a.f(i);
        }

        @Override // androidx.recyclerview.widget.j
        public int b() {
            return this.f1132a.h() - this.f1132a.n();
        }

        @Override // androidx.recyclerview.widget.j
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1132a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int c() {
            return this.f1132a.n();
        }

        @Override // androidx.recyclerview.widget.j
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1132a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int d() {
            return this.f1132a.i();
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f1132a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e() {
            return this.f1132a.s();
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            this.f1132a.a(view, true, this.f1134c);
            return this.f1134c.bottom;
        }

        @Override // androidx.recyclerview.widget.j
        public int f() {
            return this.f1132a.q();
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            this.f1132a.a(view, true, this.f1134c);
            return this.f1134c.top;
        }

        @Override // androidx.recyclerview.widget.j
        public int g() {
            return (this.f1132a.h() - this.f1132a.q()) - this.f1132a.n();
        }
    }

    private j(RecyclerView.o oVar) {
        this.f1133b = RecyclerView.UNDEFINED_DURATION;
        this.f1134c = new Rect();
        this.f1132a = oVar;
    }

    /* synthetic */ j(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static j a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static j a(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            return b(oVar);
        }
        return a(oVar);
    }

    public static j b(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f1133b) {
            return 0;
        }
        return g() - this.f1133b;
    }

    public void i() {
        this.f1133b = g();
    }
}
