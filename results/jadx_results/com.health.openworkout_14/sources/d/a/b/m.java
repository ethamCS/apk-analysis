package d.a.b;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m extends j {

    /* renamed from: a */
    private final d.a.b.w.h<String, j> f3743a = new d.a.b.w.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f3743a.equals(this.f3743a));
    }

    public void h(String str, j jVar) {
        if (jVar == null) {
            jVar = l.f3742a;
        }
        this.f3743a.put(str, jVar);
    }

    public int hashCode() {
        return this.f3743a.hashCode();
    }

    public Set<Map.Entry<String, j>> i() {
        return this.f3743a.entrySet();
    }
}
