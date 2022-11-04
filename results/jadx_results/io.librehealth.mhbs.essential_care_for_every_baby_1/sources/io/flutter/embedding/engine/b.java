package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: b */
    private static b f932b;

    /* renamed from: a */
    private final Map<String, a> f933a = new HashMap();

    b() {
    }

    public static b b() {
        if (f932b == null) {
            f932b = new b();
        }
        return f932b;
    }

    public a a(String str) {
        return this.f933a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f933a.put(str, aVar);
        } else {
            this.f933a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
