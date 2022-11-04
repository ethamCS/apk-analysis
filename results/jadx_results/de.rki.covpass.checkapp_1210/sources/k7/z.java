package k7;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001av\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00032\u001c\b\u0002\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¨\u0006\u0010"}, d2 = {"Ls1/a;", "T", "Lk7/g;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", BuildConfig.FLAVOR, "bindingInflater", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ltb/e0;", BuildConfig.FLAVOR, "invalidateOn", "cleanUp", "Lkc/c;", "a", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class z {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.q implements gc.l<gc.a<? extends e0>, h1> {
        a(Object obj) {
            super(1, obj, com.ensody.reactivestate.android.e.class, "onDestroyView", "onDestroyView(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/DisposableHandle;", 1);
        }

        /* renamed from: i0 */
        public final h1 invoke(gc.a<e0> aVar) {
            hc.t.e(aVar, "p0");
            return com.ensody.reactivestate.android.e.f((Fragment) this.f11756d, aVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/a;", "T", "it", "Ltb/e0;", "b", "(Ls1/a;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l {

        /* renamed from: c */
        public static final b f14691c = new b();

        b() {
            super(1);
        }

        public final void b(s1.a aVar) {
            hc.t.e(aVar, "it");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((s1.a) obj);
            return e0.f22152a;
        }
    }

    public static final <T extends s1.a> kc.c<g, T> a(g gVar, gc.q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, gc.l<? super gc.a<e0>, ? extends Object> lVar, gc.l<? super T, e0> lVar2) {
        hc.t.e(gVar, "<this>");
        hc.t.e(qVar, "bindingInflater");
        hc.t.e(lVar, "invalidateOn");
        hc.t.e(lVar2, "cleanUp");
        return new y(gVar, qVar, lVar, lVar2);
    }

    public static /* synthetic */ kc.c b(g gVar, gc.q qVar, gc.l lVar, gc.l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new a(gVar);
        }
        if ((i10 & 4) != 0) {
            lVar2 = b.f14691c;
        }
        return a(gVar, qVar, lVar, lVar2);
    }
}
