package cd;

import hc.t;
import java.util.List;
import ke.r;
/* loaded from: classes.dex */
public final class j implements r {

    /* renamed from: b */
    public static final j f6440b = new j();

    private j() {
    }

    @Override // ke.r
    public void a(xc.b bVar) {
        t.e(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    @Override // ke.r
    public void b(xc.e eVar, List<String> list) {
        t.e(eVar, "descriptor");
        t.e(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
