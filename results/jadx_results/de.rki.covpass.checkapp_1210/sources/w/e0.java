package w;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    private final Object f24442a = new Object();

    /* renamed from: b */
    private final Map<String, d0> f24443b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<d0> f24444c = new HashSet();

    public LinkedHashSet<d0> a() {
        LinkedHashSet<d0> linkedHashSet;
        synchronized (this.f24442a) {
            linkedHashSet = new LinkedHashSet<>(this.f24443b.values());
        }
        return linkedHashSet;
    }

    public void b(a0 a0Var) {
        synchronized (this.f24442a) {
            try {
                try {
                    for (String str : a0Var.c()) {
                        androidx.camera.core.s1.a("CameraRepository", "Added camera: " + str);
                        this.f24443b.put(str, a0Var.a(str));
                    }
                } catch (androidx.camera.core.u e10) {
                    throw new androidx.camera.core.r1(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
