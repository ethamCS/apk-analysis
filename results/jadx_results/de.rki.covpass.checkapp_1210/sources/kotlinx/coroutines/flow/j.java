package kotlinx.coroutines.flow;

import ef.i;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, d2 = {"T", "Lkotlinx/coroutines/flow/d;", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "a", "c", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class j {
    public static final <T> d<T> a(d<? extends T> dVar, int i10, df.h hVar) {
        df.h hVar2;
        int i11;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && hVar != df.h.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            hVar2 = df.h.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            hVar2 = hVar;
        }
        return dVar instanceof ef.i ? i.a.a((ef.i) dVar, null, i11, hVar2, 1, null) : new ef.g(dVar, null, i11, hVar2, 2, null);
    }

    public static /* synthetic */ d b(d dVar, int i10, df.h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            hVar = df.h.SUSPEND;
        }
        return f.b(dVar, i10, hVar);
    }

    public static final <T> d<T> c(d<? extends T> dVar) {
        d<T> b10;
        b10 = b(dVar, -1, null, 2, null);
        return b10;
    }
}
