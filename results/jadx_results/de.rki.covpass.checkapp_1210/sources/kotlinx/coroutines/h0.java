package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Ltb/s;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "onCancellation", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Lgc/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "caller", "c", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)Ljava/lang/Object;", "state", "Lxb/d;", "uCont", "a", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h0 {
    public static final <T> Object a(Object obj, xb.d<? super T> dVar) {
        if (obj instanceof d0) {
            s.a aVar = tb.s.Companion;
            obj = tb.t.a(((d0) obj).f15325a);
        } else {
            s.a aVar2 = tb.s.Companion;
        }
        return tb.s.c(obj);
    }

    public static final <T> Object b(Object obj, gc.l<? super Throwable, tb.e0> lVar) {
        Throwable g10 = tb.s.g(obj);
        return g10 == null ? lVar != null ? new e0(obj, lVar) : obj : new d0(g10, false, 2, null);
    }

    public static final <T> Object c(Object obj, p<?> pVar) {
        Throwable g10 = tb.s.g(obj);
        return g10 == null ? obj : new d0(g10, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, gc.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
