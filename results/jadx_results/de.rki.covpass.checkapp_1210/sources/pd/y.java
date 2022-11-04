package pd;

import java.util.Collection;
import oe.e0;
/* loaded from: classes.dex */
public interface y<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T> String a(y<? extends T> yVar, xc.e eVar) {
            hc.t.e(eVar, "classDescriptor");
            return null;
        }

        public static <T> e0 b(y<? extends T> yVar, e0 e0Var) {
            hc.t.e(e0Var, "kotlinType");
            return null;
        }
    }

    String a(xc.e eVar);

    void b(e0 e0Var, xc.e eVar);

    e0 c(e0 e0Var);

    e0 d(Collection<e0> collection);

    T e(xc.e eVar);

    String f(xc.e eVar);
}
