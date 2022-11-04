package nb;

import hc.t;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "T", "value", "Lkc/c;", "b", "(Ljava/lang/Object;)Lkc/c;", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final <T> kc.c<Object, T> b(final T t10) {
        t.e(t10, "value");
        return new kc.c() { // from class: nb.a
            @Override // kc.c
            public final Object a(Object obj, k kVar) {
                Object c10;
                c10 = c.c(t10, obj, kVar);
                return c10;
            }
        };
    }

    public static final Object c(Object obj, Object obj2, k kVar) {
        t.e(obj, "$value");
        t.e(obj2, "thisRef");
        t.e(kVar, "property");
        return obj;
    }
}
