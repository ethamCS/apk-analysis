package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001aJ\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/a2;", "parent", "Lkotlinx/coroutines/b0;", "a", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", BuildConfig.FLAVOR, "block", "c", "(Lgc/p;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class y2 {
    public static final b0 a(a2 a2Var) {
        return new x2(a2Var);
    }

    public static /* synthetic */ b0 b(a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a2Var = null;
        }
        return a(a2Var);
    }

    public static final <R> Object c(gc.p<? super q0, ? super xb.d<? super R>, ? extends Object> pVar, xb.d<? super R> dVar) {
        Object c10;
        w2 w2Var = new w2(dVar.b(), dVar);
        Object b10 = ff.b.b(w2Var, w2Var, pVar);
        c10 = yb.d.c();
        if (b10 == c10) {
            zb.h.c(dVar);
        }
        return b10;
    }
}
