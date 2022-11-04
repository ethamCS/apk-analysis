package k7;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/w;", "Ltb/e0;", "b", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l {
    public static final void b(final androidx.fragment.app.w wVar) {
        hc.t.e(wVar, "<this>");
        wVar.l(new w.n() { // from class: k7.k
            @Override // androidx.fragment.app.w.n
            public final void a() {
                l.c(androidx.fragment.app.w.this);
            }
        });
    }

    public static final void c(androidx.fragment.app.w wVar) {
        boolean z10;
        hc.t.e(wVar, "$this_setupForAccessibility");
        List<Fragment> x02 = wVar.x0();
        hc.t.d(x02, "fragments");
        ListIterator<Fragment> listIterator = x02.listIterator(x02.size());
        while (listIterator.hasPrevious()) {
            Fragment previous = listIterator.previous();
            if (previous.x0() != null) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                for (Fragment fragment : wVar.x0()) {
                    boolean a10 = hc.t.a(fragment, previous);
                    View x03 = fragment.x0();
                    if (a10) {
                        if (x03 != null) {
                            x03.setImportantForAccessibility(1);
                        }
                    } else if (x03 != null) {
                        x03.setImportantForAccessibility(4);
                    }
                }
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }
}
