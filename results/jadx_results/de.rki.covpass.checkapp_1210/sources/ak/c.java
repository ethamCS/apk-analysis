package ak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class c<T> implements o<T>, Iterable {

    /* renamed from: c */
    private Collection<T> f556c;

    public c(Collection<T> collection) {
        this.f556c = new ArrayList(collection);
    }

    @Override // ak.o
    public Collection<T> getMatches(n<T> nVar) {
        if (nVar == null) {
            return new ArrayList(this.f556c);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : this.f556c) {
            if (nVar.z(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return getMatches(null).iterator();
    }
}
