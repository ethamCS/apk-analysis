package dd;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class x extends z implements nd.v {

    /* renamed from: b */
    private final Class<?> f8517b;

    /* renamed from: c */
    private final Collection<nd.a> f8518c;

    /* renamed from: d */
    private final boolean f8519d;

    public x(Class<?> cls) {
        List h10;
        hc.t.e(cls, "reflectType");
        this.f8517b = cls;
        h10 = ub.u.h();
        this.f8518c = h10;
    }

    /* renamed from: Y */
    public Class<?> X() {
        return this.f8517b;
    }

    @Override // nd.v
    public uc.i getType() {
        if (hc.t.a(X(), Void.TYPE)) {
            return null;
        }
        return fe.e.g(X().getName()).r();
    }

    @Override // nd.d
    public Collection<nd.a> j() {
        return this.f8518c;
    }

    @Override // nd.d
    public boolean v() {
        return this.f8519d;
    }
}
