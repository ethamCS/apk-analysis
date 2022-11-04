package hd;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.Collection;
import java.util.Map;
import ne.m;
import oe.m0;
import ub.c0;
import ub.q0;
import xc.a1;
/* loaded from: classes.dex */
public class b implements yc.c, id.g {

    /* renamed from: f */
    static final /* synthetic */ oc.k<Object>[] f11791f = {k0.g(new e0(k0.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final wd.c f11792a;

    /* renamed from: b */
    private final a1 f11793b;

    /* renamed from: c */
    private final ne.i f11794c;

    /* renamed from: d */
    private final nd.b f11795d;

    /* renamed from: e */
    private final boolean f11796e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<m0> {

        /* renamed from: c */
        final /* synthetic */ jd.g f11797c;

        /* renamed from: d */
        final /* synthetic */ b f11798d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(jd.g gVar, b bVar) {
            super(0);
            this.f11797c = gVar;
            this.f11798d = bVar;
        }

        /* renamed from: b */
        public final m0 invoke() {
            m0 u10 = this.f11797c.d().x().o(this.f11798d.d()).u();
            t.d(u10, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return u10;
        }
    }

    public b(jd.g gVar, nd.a aVar, wd.c cVar) {
        a1 a1Var;
        nd.b bVar;
        Collection<nd.b> c10;
        Object W;
        t.e(gVar, "c");
        t.e(cVar, "fqName");
        this.f11792a = cVar;
        if (aVar == null || (a1Var = gVar.a().t().a(aVar)) == null) {
            a1Var = a1.f25519a;
            t.d(a1Var, "NO_SOURCE");
        }
        this.f11793b = a1Var;
        this.f11794c = gVar.e().d(new a(gVar, this));
        if (aVar == null || (c10 = aVar.c()) == null) {
            bVar = null;
        } else {
            W = c0.W(c10);
            bVar = (nd.b) W;
        }
        this.f11795d = bVar;
        boolean z10 = true;
        this.f11796e = (aVar == null || !aVar.a()) ? false : z10;
    }

    @Override // id.g
    public boolean a() {
        return this.f11796e;
    }

    @Override // yc.c
    public Map<wd.f, ce.g<?>> b() {
        Map<wd.f, ce.g<?>> h10;
        h10 = q0.h();
        return h10;
    }

    public final nd.b c() {
        return this.f11795d;
    }

    @Override // yc.c
    public wd.c d() {
        return this.f11792a;
    }

    /* renamed from: e */
    public m0 getType() {
        return (m0) m.a(this.f11794c, this, f11791f[0]);
    }

    @Override // yc.c
    public a1 m() {
        return this.f11793b;
    }
}
