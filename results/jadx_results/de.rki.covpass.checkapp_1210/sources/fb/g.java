package fb;

import j$.util.DesugarCollections;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001aP\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"K", "V", "Lkotlin/Function1;", "supplier", "Ltb/e0;", "close", BuildConfig.FLAVOR, "maxSize", BuildConfig.FLAVOR, "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {
    public static final <K, V> Map<K, V> a(gc.l<? super K, ? extends V> lVar, gc.l<? super V, e0> lVar2, int i10) {
        hc.t.e(lVar, "supplier");
        hc.t.e(lVar2, "close");
        Map<K, V> synchronizedMap = DesugarCollections.synchronizedMap(new s(lVar, lVar2, i10));
        hc.t.d(synchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return synchronizedMap;
    }
}
