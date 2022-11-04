package kotlinx.coroutines;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"T", "Lxb/d;", "delegate", "Lkotlinx/coroutines/q;", "b", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/internal/o;", "node", "Ltb/e0;", "c", "Lkotlinx/coroutines/h1;", "handle", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s {
    public static final void a(p<?> pVar, h1 h1Var) {
        pVar.N(new i1(h1Var));
    }

    public static final <T> q<T> b(xb.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.f)) {
            return new q<>(dVar, 1);
        }
        q<T> j10 = ((kotlinx.coroutines.internal.f) dVar).j();
        if (j10 != null) {
            if (!j10.J()) {
                j10 = null;
            }
            if (j10 != null) {
                return j10;
            }
        }
        return new q<>(dVar, 2);
    }

    public static final void c(p<?> pVar, kotlinx.coroutines.internal.o oVar) {
        pVar.N(new r2(oVar));
    }
}
