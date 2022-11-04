package fb;

import java.util.Iterator;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lfb/b;", "other", "Ltb/e0;", "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {
    public static final void a(b bVar, b bVar2) {
        hc.t.e(bVar, "<this>");
        hc.t.e(bVar2, "other");
        Iterator<T> it = bVar2.f().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            bVar.a(aVar, bVar2.c(aVar));
        }
    }
}
