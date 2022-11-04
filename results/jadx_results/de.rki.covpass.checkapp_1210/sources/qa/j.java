package qa;

import bb.o0;
import bb.p;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.p0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\" \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lya/d;", "request", "Ltb/e0;", "c", "Lkotlinx/coroutines/p0;", "CALL_COROUTINE", "Lkotlinx/coroutines/p0;", "b", "()Lkotlinx/coroutines/p0;", "getCALL_COROUTINE$annotations", "()V", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private static final p0 f19769a = new p0("call-context");

    public static final /* synthetic */ void a(ya.d dVar) {
        c(dVar);
    }

    public static final p0 b() {
        return f19769a;
    }

    public static final void c(ya.d dVar) {
        Set<String> names = dVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : names) {
            if (p.f5855a.k().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        throw new o0(arrayList.toString());
    }
}
