package m7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "T", "Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "skip", "Lkotlin/Function1;", "action", "a", "(Landroidx/fragment/app/Fragment;ILgc/l;)Ljava/lang/Object;", "b", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {
    public static final <T> T a(Fragment fragment, int i10, gc.l<Object, ? extends T> lVar) {
        hc.t.e(fragment, "<this>");
        hc.t.e(lVar, "action");
        T t10 = (T) b(fragment, i10, lVar);
        if (t10 != null) {
            return t10;
        }
        throw new y("Element not found.");
    }

    public static final <T> T b(Fragment fragment, int i10, gc.l<Object, ? extends T> lVar) {
        hc.t.e(fragment, "<this>");
        hc.t.e(lVar, "action");
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.h0()) {
            T invoke = lVar.invoke(fragment2);
            if (invoke != null) {
                if (i10 == 0) {
                    return invoke;
                }
                i10--;
            }
        }
        if (i10 == 0) {
            androidx.fragment.app.j R1 = fragment.R1();
            hc.t.d(R1, "requireActivity()");
            return lVar.invoke(R1);
        }
        return null;
    }
}
