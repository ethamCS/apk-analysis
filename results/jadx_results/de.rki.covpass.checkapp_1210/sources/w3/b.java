package w3;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static final List<Class> f24672a = new ArrayList();

    public static synchronized void a(Class cls) {
        synchronized (b.class) {
            if (!a.class.isAssignableFrom(cls)) {
                String simpleName = a.class.getSimpleName();
                throw new RuntimeException("Expected a class derived from " + simpleName);
            }
            f24672a.add(cls);
        }
    }
}
