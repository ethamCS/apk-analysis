package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class l {

    /* renamed from: b */
    int f1793b;

    /* renamed from: c */
    int f1794c;

    /* renamed from: d */
    int f1795d;

    /* renamed from: e */
    int f1796e;

    /* renamed from: h */
    boolean f1799h;
    boolean i;

    /* renamed from: a */
    boolean f1792a = true;

    /* renamed from: f */
    int f1797f = 0;

    /* renamed from: g */
    int f1798g = 0;

    public boolean a(RecyclerView.a0 a0Var) {
        int i = this.f1794c;
        return i >= 0 && i < a0Var.b();
    }

    public View b(RecyclerView.v vVar) {
        View o = vVar.o(this.f1794c);
        this.f1794c += this.f1795d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1793b + ", mCurrentPosition=" + this.f1794c + ", mItemDirection=" + this.f1795d + ", mLayoutDirection=" + this.f1796e + ", mStartLine=" + this.f1797f + ", mEndLine=" + this.f1798g + '}';
    }
}
