package fb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001aH\u0010\r\u001a\u00020\f2\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\t0\b2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\t0\bH\u0002\u001a0\u0010\u0011\u001a\u00020\u000f2\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\t0\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lfb/v;", BuildConfig.FLAVOR, "Ltb/r;", BuildConfig.FLAVOR, "f", "Lfb/w;", "builder", "c", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "b", BuildConfig.FLAVOR, "d", "entries", BuildConfig.FLAVOR, "seed", "e", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class z {
    public static final w c(w wVar, w wVar2) {
        hc.t.e(wVar, "<this>");
        hc.t.e(wVar2, "builder");
        Iterator<T> it = wVar2.f().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            wVar.c((String) entry.getKey(), (List) entry.getValue());
        }
        return wVar;
    }

    public static final boolean d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return hc.t.a(set, set2);
    }

    public static final int e(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i10) {
        return (i10 * 31) + set.hashCode();
    }

    public static final List<tb.r<String, String>> f(v vVar) {
        int s10;
        hc.t.e(vVar, "<this>");
        Set<Map.Entry<String, List<String>>> a10 = vVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a10.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable<String> iterable = (Iterable) entry.getValue();
            s10 = ub.v.s(iterable, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (String str : iterable) {
                arrayList2.add(tb.x.a(entry.getKey(), str));
            }
            ub.z.x(arrayList, arrayList2);
        }
        return arrayList;
    }
}
