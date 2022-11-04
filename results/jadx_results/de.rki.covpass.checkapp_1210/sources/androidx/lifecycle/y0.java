package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a */
    private final HashMap<String, s0> f4407a = new HashMap<>();

    public final void a() {
        for (s0 s0Var : this.f4407a.values()) {
            s0Var.a();
        }
        this.f4407a.clear();
    }

    public final s0 b(String str) {
        return this.f4407a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.f4407a.keySet());
    }

    public final void d(String str, s0 s0Var) {
        s0 put = this.f4407a.put(str, s0Var);
        if (put != null) {
            put.d();
        }
    }
}
