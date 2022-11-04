package rc;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¨\u0006\u0003"}, d2 = {"Ljava/lang/Class;", "Lcd/k;", "a", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    private static final ConcurrentMap<k0, WeakReference<cd.k>> f20587a = new ConcurrentHashMap();

    public static final cd.k a(Class<?> cls) {
        hc.t.e(cls, "<this>");
        ClassLoader f10 = dd.d.f(cls);
        k0 k0Var = new k0(f10);
        ConcurrentMap<k0, WeakReference<cd.k>> concurrentMap = f20587a;
        WeakReference<cd.k> weakReference = concurrentMap.get(k0Var);
        if (weakReference != null) {
            cd.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k0Var, weakReference);
        }
        cd.k a10 = cd.k.Companion.a(f10);
        while (true) {
            try {
                ConcurrentMap<k0, WeakReference<cd.k>> concurrentMap2 = f20587a;
                WeakReference<cd.k> putIfAbsent = concurrentMap2.putIfAbsent(k0Var, new WeakReference<>(a10));
                if (putIfAbsent == null) {
                    return a10;
                }
                cd.k kVar2 = putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k0Var, putIfAbsent);
            } finally {
                k0Var.a(null);
            }
        }
    }
}
