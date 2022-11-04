package y8;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import hc.k0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.w;
import org.conscrypt.BuildConfig;
import s4.b1;
import s4.l0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ly8/d;", "Lk7/d;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Ltb/e0;", "Q", BuildConfig.FLAVOR, "e", "position", "Landroidx/fragment/app/Fragment;", "y", "Lkotlinx/coroutines/flow/w;", "currentFragment", "Lkotlinx/coroutines/flow/w;", "T", "()Lkotlinx/coroutines/flow/w;", BuildConfig.FLAVOR, "fragments", "Ljava/util/List;", "U", "()Ljava/util/List;", "parent", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/List;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d extends k7.d {

    /* renamed from: l */
    private final l0<Fragment> f25964l;

    /* renamed from: m */
    private final w<Fragment> f25965m;

    /* renamed from: n */
    private final List<Fragment> f25966n;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ ViewPager2 f25967c;

        /* renamed from: d */
        final /* synthetic */ b f25968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ViewPager2 viewPager2, b bVar) {
            super(0);
            this.f25967c = viewPager2;
            this.f25968d = bVar;
        }

        public final void b() {
            this.f25967c.n(this.f25968d);
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"y8/d$b", "Landroidx/viewpager2/widget/ViewPager2$i;", BuildConfig.FLAVOR, "position", "Ltb/e0;", "c", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends ViewPager2.i {

        /* renamed from: b */
        final /* synthetic */ ViewPager2 f25970b;

        b(ViewPager2 viewPager2) {
            d.this = r1;
            this.f25970b = viewPager2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            super.c(i10);
            d.this.f25964l.setValue(d.this.U().get(this.f25970b.getCurrentItem()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, List<? extends Fragment> list) {
        super(fragment);
        int s10;
        Object obj;
        t.e(fragment, "parent");
        t.e(list, "fragments");
        l0<Fragment> b10 = b1.b(null, null, 2, null);
        this.f25964l = b10;
        this.f25965m = kotlinx.coroutines.flow.f.a(b10);
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Fragment fragment2 : list) {
            List<Fragment> x02 = fragment.S().x0();
            t.d(x02, "parent.childFragmentManager.fragments");
            Iterator<T> it = x02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (t.a(k0.b(((Fragment) obj).getClass()), k0.b(fragment2.getClass()))) {
                    break;
                }
            }
            Fragment fragment3 = (Fragment) obj;
            if (fragment3 != null) {
                fragment2 = fragment3;
            }
            arrayList.add(fragment2);
        }
        this.f25966n = arrayList;
    }

    @Override // k7.d
    public void Q(ViewPager2 viewPager2) {
        t.e(viewPager2, "viewPager");
        super.Q(viewPager2);
        b bVar = new b(viewPager2);
        viewPager2.g(bVar);
        com.ensody.reactivestate.android.e.h(R(), new a(viewPager2, bVar));
    }

    public final w<Fragment> T() {
        return this.f25965m;
    }

    public final List<Fragment> U() {
        return this.f25966n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f25966n.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment y(int i10) {
        return this.f25966n.get(i10);
    }
}
