package d.a.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: b */
    private final List<j> f3741b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f3741b.equals(this.f3741b));
    }

    public void h(j jVar) {
        if (jVar == null) {
            jVar = l.f3742a;
        }
        this.f3741b.add(jVar);
    }

    public int hashCode() {
        return this.f3741b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f3741b.iterator();
    }
}
