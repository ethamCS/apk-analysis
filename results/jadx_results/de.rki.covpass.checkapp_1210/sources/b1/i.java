package b1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb1/i;", "Lb1/h;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: d */
    private final ViewGroup f5444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        t.e(fragment, "fragment");
        t.e(viewGroup, "container");
        this.f5444d = viewGroup;
    }
}
