package ua;

import hc.t;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Lua/d;", "a", "ktor-client-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {
    public static final d a() {
        List F0;
        Object obj;
        ServiceLoader load = ServiceLoader.load(d.class);
        t.d(load, "load(JsonSerializer::class.java)");
        F0 = c0.F0(load);
        if (!F0.isEmpty()) {
            Iterator it = F0.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    d dVar = (d) next;
                    Comparable comparable = "javaClass";
                    do {
                        Object next2 = it.next();
                        d dVar2 = (d) next2;
                        if (comparable.compareTo("javaClass") < 0) {
                            comparable = "javaClass";
                            next = next2;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            t.b(obj);
            return (d) obj;
        }
        throw new IllegalStateException("Fail to find serializer. Consider to add one of the following dependencies: \n - ktor-client-gson\n - ktor-client-json\n - ktor-client-serialization".toString());
    }
}
