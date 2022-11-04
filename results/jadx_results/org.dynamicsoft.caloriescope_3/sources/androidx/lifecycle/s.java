package androidx.lifecycle;

import java.util.HashMap;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    private final HashMap<String, q> f999a = new HashMap<>();

    public final q a(String str) {
        return this.f999a.get(str);
    }

    public final void a() {
        for (q qVar : this.f999a.values()) {
            qVar.a();
        }
        this.f999a.clear();
    }

    public final void a(String str, q qVar) {
        q put = this.f999a.put(str, qVar);
        if (put != null) {
            put.b();
        }
    }
}
