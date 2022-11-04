package df;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, d2 = {"E", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlin/Function1;", "Ltb/e0;", "onUndeliveredElement", "Ldf/i;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l {
    public static final <E> i<E> a(int i10, h hVar, gc.l<? super E, tb.e0> lVar) {
        int i11 = 1;
        if (i10 == -2) {
            if (hVar == h.SUSPEND) {
                i11 = i.f8923b.a();
            }
            return new g(i11, hVar, lVar);
        } else if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? (i10 == 1 && hVar == h.DROP_OLDEST) ? new t(lVar) : new g(i10, hVar, lVar) : new v(lVar) : hVar == h.SUSPEND ? new c0(lVar) : new g(1, hVar, lVar);
        } else {
            if (hVar != h.SUSPEND) {
                i11 = 0;
            }
            if (i11 == 0) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            return new t(lVar);
        }
    }

    public static /* synthetic */ i b(int i10, h hVar, gc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            hVar = h.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, hVar, lVar);
    }
}
