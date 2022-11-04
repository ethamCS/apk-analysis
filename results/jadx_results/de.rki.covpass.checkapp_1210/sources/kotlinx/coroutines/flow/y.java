package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"T", "value", "Lkotlinx/coroutines/flow/p;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/flow/w;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d;", "d", "Lkotlinx/coroutines/internal/b0;", "Lkotlinx/coroutines/internal/b0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a */
    private static final kotlinx.coroutines.internal.b0 f15387a = new kotlinx.coroutines.internal.b0("NONE");

    /* renamed from: b */
    private static final kotlinx.coroutines.internal.b0 f15388b = new kotlinx.coroutines.internal.b0("PENDING");

    public static final <T> p<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) ef.l.f9571a;
        }
        return new x(t10);
    }

    public static final <T> d<T> d(w<? extends T> wVar, xb.g gVar, int i10, df.h hVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && hVar == df.h.DROP_OLDEST) ? wVar : u.e(wVar, gVar, i10, hVar);
    }
}
