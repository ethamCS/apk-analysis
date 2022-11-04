package lf;

import hc.t;
import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0007"}, d2 = {"Llf/a;", "from", "Lkotlin/Function1;", "Llf/c;", "Ltb/e0;", "builderAction", "a", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l {
    public static final a a(a aVar, gc.l<? super c, e0> lVar) {
        t.e(aVar, "from");
        t.e(lVar, "builderAction");
        c cVar = new c(aVar);
        lVar.invoke(cVar);
        return new k(cVar.a(), cVar.b());
    }

    public static /* synthetic */ a b(a aVar, gc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a.f15961d;
        }
        return a(aVar, lVar);
    }
}
