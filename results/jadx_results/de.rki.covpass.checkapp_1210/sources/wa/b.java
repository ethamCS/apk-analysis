package wa;

import hc.t;
import io.ktor.utils.io.h;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Loa/b;", "Lio/ktor/utils/io/h;", "content", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {
    public static final oa.b a(oa.b bVar, h hVar) {
        t.e(bVar, "<this>");
        t.e(hVar, "content");
        na.a d10 = bVar.d();
        if (d10 != null) {
            return new a(d10, hVar, bVar);
        }
        throw new IllegalStateException("Fail to create response observer in different native thread.".toString());
    }
}
