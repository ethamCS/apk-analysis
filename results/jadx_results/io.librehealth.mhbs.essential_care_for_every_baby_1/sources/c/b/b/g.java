package c.b.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: a */
    private final List<j> f457a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f457a.equals(this.f457a));
    }

    public void h(j jVar) {
        if (jVar == null) {
            jVar = l.f458a;
        }
        this.f457a.add(jVar);
    }

    public int hashCode() {
        return this.f457a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f457a.iterator();
    }
}
