package wa;

import hc.t;
import io.ktor.utils.io.h;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwa/a;", "Loa/b;", "Lna/a;", "client", "Lio/ktor/utils/io/h;", "content", "originCall", "<init>", "(Lna/a;Lio/ktor/utils/io/h;Loa/b;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a extends oa.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(na.a aVar, h hVar, oa.b bVar) {
        super(aVar);
        t.e(aVar, "client");
        t.e(hVar, "content");
        t.e(bVar, "originCall");
        m(new c(this, bVar.f()));
        n(new d(this, hVar, bVar.g()));
    }
}
