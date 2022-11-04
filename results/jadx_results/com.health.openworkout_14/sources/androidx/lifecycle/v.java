package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a */
    private final HashMap<String, t> f1262a = new HashMap<>();

    public final void a() {
        for (t tVar : this.f1262a.values()) {
            tVar.a();
        }
        this.f1262a.clear();
    }

    public final t b(String str) {
        return this.f1262a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.f1262a.keySet());
    }

    public final void d(String str, t tVar) {
        t put = this.f1262a.put(str, tVar);
        if (put != null) {
            put.d();
        }
    }
}
