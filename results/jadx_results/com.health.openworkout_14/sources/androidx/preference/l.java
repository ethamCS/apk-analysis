package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class l extends RecyclerView.d0 {
    private final SparseArray<View> t;
    private boolean u;
    private boolean v;

    public l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.t = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = p.a_res_0x7f0900e2;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    public View M(int i) {
        View view = this.t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f1551a.findViewById(i);
        if (findViewById != null) {
            this.t.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean N() {
        return this.u;
    }

    public boolean O() {
        return this.v;
    }

    public void P(boolean z) {
        this.u = z;
    }

    public void Q(boolean z) {
        this.v = z;
    }
}
