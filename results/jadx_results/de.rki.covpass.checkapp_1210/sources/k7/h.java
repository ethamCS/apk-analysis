package k7;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lk7/h;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "T", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ltb/e0;", "w", "Landroidx/fragment/app/Fragment;", "parent", "<init>", "(Landroidx/fragment/app/Fragment;)V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class h<T extends RecyclerView.d0> extends RecyclerView.g<T> {

    /* renamed from: c */
    private final Fragment f14657c;

    public h(Fragment fragment) {
        hc.t.e(fragment, "parent");
        this.f14657c = fragment;
    }

    public void w(RecyclerView recyclerView) {
        hc.t.e(recyclerView, "recyclerView");
        j.a(this.f14657c, this, recyclerView);
    }
}
