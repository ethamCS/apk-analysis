package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a */
    private final Map<String, Object> f996a = new HashMap();

    private static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void a() {
        Map<String, Object> map = this.f996a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f996a.values()) {
                    a(obj);
                }
            }
        }
        b();
    }

    public void b() {
    }
}
