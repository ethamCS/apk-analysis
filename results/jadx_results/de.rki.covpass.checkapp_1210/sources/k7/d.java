package k7;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lk7/d;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Ltb/e0;", "Q", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "R", "()Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class d extends FragmentStateAdapter {

    /* renamed from: k */
    private final Fragment f14646k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment) {
        super(fragment);
        hc.t.e(fragment, "parent");
        this.f14646k = fragment;
    }

    public void Q(ViewPager2 viewPager2) {
        hc.t.e(viewPager2, "viewPager");
        j.c(this.f14646k, this, viewPager2);
    }

    public final Fragment R() {
        return this.f14646k;
    }
}
