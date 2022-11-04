package oa;

import hc.k0;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loa/k;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Ldb/a;", "content", "<init>", "(Ldb/a;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(db.a aVar) {
        super(t.l("Failed to write body: ", k0.b(aVar.getClass())));
        t.e(aVar, "content");
    }
}
