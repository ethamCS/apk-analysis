package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a */
    private final Map<String, Object> f1259a = new HashMap();

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void a() {
        Map<String, Object> map = this.f1259a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f1259a.values()) {
                    b(obj);
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.f1259a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f1259a.get(str);
        }
        return t;
    }

    public void d() {
    }
}
