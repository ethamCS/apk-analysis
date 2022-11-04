package gf;

import gc.l;
import hc.t;
import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lgf/b;", "from", "Lkotlin/Function1;", "Lgf/c;", "Ltb/e0;", "builderAction", "a", "kotlinx-serialization-cbor"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final b a(b bVar, l<? super c, e0> lVar) {
        t.e(bVar, "from");
        t.e(lVar, "builderAction");
        c cVar = new c(bVar);
        lVar.invoke(cVar);
        return new d(cVar.a(), cVar.b(), cVar.c());
    }

    public static /* synthetic */ b b(b bVar, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b.f10775d;
        }
        return a(bVar, lVar);
    }
}
