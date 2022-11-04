package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.m2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/s;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/m2;", "a", BuildConfig.FLAVOR, "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/m2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a */
    public static final s f15456a;

    /* renamed from: b */
    private static final boolean f15457b = c0.e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final m2 f15458c;

    static {
        s sVar = new s();
        f15456a = sVar;
        f15458c = sVar.a();
    }

    private s() {
    }

    private final m2 a() {
        List<r> list;
        Object obj;
        m2 e10;
        af.h c10;
        try {
            if (f15457b) {
                list = h.f15429a.c();
            } else {
                c10 = af.n.c(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator());
                list = af.p.F(c10);
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c11 = ((r) obj).c();
                    do {
                        Object next = it.next();
                        int c12 = ((r) next).c();
                        if (c11 < c12) {
                            obj = next;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            }
            r rVar = (r) obj;
            return (rVar == null || (e10 = t.e(rVar, list)) == null) ? t.b(null, null, 3, null) : e10;
        } catch (Throwable th2) {
            return t.b(th2, null, 2, null);
        }
    }
}
