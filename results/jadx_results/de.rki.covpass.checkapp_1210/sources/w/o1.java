package w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class o1<C> {

    /* renamed from: a */
    private Set<C> f24553a = new HashSet();

    public void a(List<C> list) {
        this.f24553a.addAll(list);
    }

    /* renamed from: b */
    public abstract o1<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f24553a));
    }
}
