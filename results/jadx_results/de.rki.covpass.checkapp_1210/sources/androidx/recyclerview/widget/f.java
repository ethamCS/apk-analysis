package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class f {

    /* renamed from: b */
    int f4774b;

    /* renamed from: c */
    int f4775c;

    /* renamed from: d */
    int f4776d;

    /* renamed from: e */
    int f4777e;

    /* renamed from: h */
    boolean f4780h;

    /* renamed from: i */
    boolean f4781i;

    /* renamed from: a */
    boolean f4773a = true;

    /* renamed from: f */
    int f4778f = 0;

    /* renamed from: g */
    int f4779g = 0;

    public boolean a(RecyclerView.a0 a0Var) {
        int i10 = this.f4775c;
        return i10 >= 0 && i10 < a0Var.b();
    }

    public View b(RecyclerView.v vVar) {
        View o10 = vVar.o(this.f4775c);
        this.f4775c += this.f4776d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4774b + ", mCurrentPosition=" + this.f4775c + ", mItemDirection=" + this.f4776d + ", mLayoutDirection=" + this.f4777e + ", mStartLine=" + this.f4778f + ", mEndLine=" + this.f4779g + '}';
    }
}
