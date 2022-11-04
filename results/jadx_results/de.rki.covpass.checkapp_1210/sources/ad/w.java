package ad;

import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: a */
    private final List<x> f406a;

    /* renamed from: b */
    private final Set<x> f407b;

    /* renamed from: c */
    private final List<x> f408c;

    /* renamed from: d */
    private final Set<x> f409d;

    public w(List<x> list, Set<x> set, List<x> list2, Set<x> set2) {
        hc.t.e(list, "allDependencies");
        hc.t.e(set, "modulesWhoseInternalsAreVisible");
        hc.t.e(list2, "directExpectedByDependencies");
        hc.t.e(set2, "allExpectedByDependencies");
        this.f406a = list;
        this.f407b = set;
        this.f408c = list2;
        this.f409d = set2;
    }

    @Override // ad.v
    public Set<x> a() {
        return this.f407b;
    }

    @Override // ad.v
    public List<x> b() {
        return this.f406a;
    }

    @Override // ad.v
    public List<x> c() {
        return this.f408c;
    }
}
