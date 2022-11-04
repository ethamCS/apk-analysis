package w;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    private static final Object f24612a = new Object();

    /* renamed from: b */
    private static final Map<Object, w> f24613b = new HashMap();

    public static w a(Object obj) {
        w wVar;
        synchronized (f24612a) {
            wVar = f24613b.get(obj);
        }
        return wVar == null ? w.f24605a : wVar;
    }
}
