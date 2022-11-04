package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class f {

    /* renamed from: b */
    int f1129b;

    /* renamed from: c */
    int f1130c;
    int d;
    int e;
    boolean h;
    boolean i;

    /* renamed from: a */
    boolean f1128a = true;
    int f = 0;
    int g = 0;

    public View a(RecyclerView.v vVar) {
        View d = vVar.d(this.f1130c);
        this.f1130c += this.d;
        return d;
    }

    public boolean a(RecyclerView.a0 a0Var) {
        int i = this.f1130c;
        return i >= 0 && i < a0Var.a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1129b + ", mCurrentPosition=" + this.f1130c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
