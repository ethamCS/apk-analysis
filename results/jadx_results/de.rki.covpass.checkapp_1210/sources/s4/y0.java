package s4;

import kotlin.Metadata;
import kotlinx.coroutines.sync.b;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a'\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/b;", "Ltb/e0;", "a", "T", "Lkotlin/Function0;", "block", "b", "(Lkotlinx/coroutines/sync/b;Lgc/a;)Ljava/lang/Object;", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class y0 {
    public static final void a(kotlinx.coroutines.sync.b bVar) {
        hc.t.e(bVar, "<this>");
        do {
        } while (!b.a.a(bVar, null, 1, null));
    }

    public static final <T> T b(kotlinx.coroutines.sync.b bVar, gc.a<? extends T> aVar) {
        hc.t.e(bVar, "<this>");
        hc.t.e(aVar, "block");
        a(bVar);
        try {
            return aVar.invoke();
        } finally {
            b.a.b(bVar, null, 1, null);
        }
    }
}
