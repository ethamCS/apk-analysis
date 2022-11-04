package ab;

import fb.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u0000\u001a\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0002H\u0000¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, "K", "V", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {
    public static final <V> List<V> a() {
        return u.f10140a.c() ? new io.ktor.util.collections.b() : new ArrayList();
    }

    public static final <K, V> Map<K, V> b() {
        return u.f10140a.c() ? new io.ktor.util.collections.c(null, 0, 3, null) : new LinkedHashMap();
    }
}
