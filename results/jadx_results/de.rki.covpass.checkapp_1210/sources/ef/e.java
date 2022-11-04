package ef;

import hc.q0;
import kotlin.Metadata;
import kotlinx.coroutines.internal.f0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/e;", "Lxb/g;", "emitContext", "d", "V", "newContext", "value", BuildConfig.FLAVOR, "countOrElement", "Lkotlin/Function2;", "Lxb/d;", "block", "b", "(Lxb/g;Ljava/lang/Object;Ljava/lang/Object;Lgc/p;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final /* synthetic */ kotlinx.coroutines.flow.e a(kotlinx.coroutines.flow.e eVar, xb.g gVar) {
        return d(eVar, gVar);
    }

    public static final <T, V> Object b(xb.g gVar, V v10, Object obj, gc.p<? super V, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        Object c10;
        Object c11 = f0.c(gVar, obj);
        try {
            Object u10 = ((gc.p) q0.d(pVar, 2)).u(v10, new q(dVar, gVar));
            f0.a(gVar, c11);
            c10 = yb.d.c();
            if (u10 == c10) {
                zb.h.c(dVar);
            }
            return u10;
        } catch (Throwable th2) {
            f0.a(gVar, c11);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(xb.g gVar, Object obj, Object obj2, gc.p pVar, xb.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = f0.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.e<T> d(kotlinx.coroutines.flow.e<? super T> eVar, xb.g gVar) {
        return eVar instanceof p ? true : eVar instanceof k ? eVar : new r(eVar, gVar);
    }
}
