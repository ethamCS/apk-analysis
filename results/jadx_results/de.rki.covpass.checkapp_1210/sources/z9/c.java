package z9;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.x;
import ub.q0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a<\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0007"}, d2 = {"T", "G", BuildConfig.FLAVOR, "Lkotlin/Function1;", "block", BuildConfig.FLAVOR, "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    public static final <T, G> Map<G, T> a(Collection<? extends T> collection, gc.l<? super T, ? extends G> lVar) {
        int s10;
        Map<G, T> q10;
        t.e(collection, "<this>");
        t.e(lVar, "block");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (T t10 : collection) {
            arrayList.add(x.a(lVar.invoke(t10), t10));
        }
        q10 = q0.q(arrayList);
        return q10;
    }
}
