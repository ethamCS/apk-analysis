package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a */
    private final Map<String, Object> f4377a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f4378b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f4379c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void a() {
        this.f4379c = true;
        Map<String, Object> map = this.f4377a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f4377a.values()) {
                    b(obj);
                }
            }
        }
        Set<Closeable> set = this.f4378b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.f4378b) {
                    b(closeable);
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f4377a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f4377a.get(str);
        }
        return t10;
    }

    public void d() {
    }

    public <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f4377a) {
            obj = this.f4377a.get(str);
            if (obj == null) {
                this.f4377a.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = obj;
        }
        if (this.f4379c) {
            b(t10);
        }
        return t10;
    }
}
