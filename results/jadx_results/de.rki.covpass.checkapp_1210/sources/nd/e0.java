package nd;

import java.util.Iterator;
/* loaded from: classes.dex */
public interface e0 extends d {

    /* loaded from: classes.dex */
    public static final class a {
        public static nd.a a(e0 e0Var, wd.c cVar) {
            Object obj;
            hc.t.e(cVar, "fqName");
            Iterator<T> it = e0Var.j().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                wd.b i10 = ((nd.a) next).i();
                if (i10 != null) {
                    obj = i10.b();
                }
                if (hc.t.a(obj, cVar)) {
                    obj = next;
                    break;
                }
            }
            return (nd.a) obj;
        }
    }
}
