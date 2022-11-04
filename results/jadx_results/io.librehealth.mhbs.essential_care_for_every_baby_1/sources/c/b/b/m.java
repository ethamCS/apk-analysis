package c.b.b;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m extends j {

    /* renamed from: a */
    private final c.b.b.w.h<String, j> f459a = new c.b.b.w.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f459a.equals(this.f459a));
    }

    public void h(String str, j jVar) {
        if (jVar == null) {
            jVar = l.f458a;
        }
        this.f459a.put(str, jVar);
    }

    public int hashCode() {
        return this.f459a.hashCode();
    }

    public Set<Map.Entry<String, j>> i() {
        return this.f459a.entrySet();
    }
}
