package ke;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.y0;
import xc.h0;
import xc.l0;
import xc.p0;
/* loaded from: classes3.dex */
public abstract class a implements p0 {

    /* renamed from: a */
    private final ne.n f15003a;

    /* renamed from: b */
    private final u f15004b;

    /* renamed from: c */
    private final h0 f15005c;

    /* renamed from: d */
    protected k f15006d;

    /* renamed from: e */
    private final ne.h<wd.c, l0> f15007e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ke.a$a */
    /* loaded from: classes3.dex */
    public static final class C0223a extends hc.v implements gc.l<wd.c, l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0223a() {
            super(1);
            a.this = r1;
        }

        /* renamed from: b */
        public final l0 invoke(wd.c cVar) {
            hc.t.e(cVar, "fqName");
            p d10 = a.this.d(cVar);
            if (d10 != null) {
                d10.U0(a.this.e());
                return d10;
            }
            return null;
        }
    }

    public a(ne.n nVar, u uVar, h0 h0Var) {
        hc.t.e(nVar, "storageManager");
        hc.t.e(uVar, "finder");
        hc.t.e(h0Var, "moduleDescriptor");
        this.f15003a = nVar;
        this.f15004b = uVar;
        this.f15005c = h0Var;
        this.f15007e = nVar.i(new C0223a());
    }

    @Override // xc.m0
    public List<l0> a(wd.c cVar) {
        List<l0> l10;
        hc.t.e(cVar, "fqName");
        l10 = ub.u.l(this.f15007e.invoke(cVar));
        return l10;
    }

    @Override // xc.p0
    public void b(wd.c cVar, Collection<l0> collection) {
        hc.t.e(cVar, "fqName");
        hc.t.e(collection, "packageFragments");
        ye.a.a(collection, this.f15007e.invoke(cVar));
    }

    @Override // xc.p0
    public boolean c(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        return (this.f15007e.V(cVar) ? this.f15007e.invoke(cVar) : d(cVar)) == null;
    }

    protected abstract p d(wd.c cVar);

    protected final k e() {
        k kVar = this.f15006d;
        if (kVar != null) {
            return kVar;
        }
        hc.t.s("components");
        return null;
    }

    public final u f() {
        return this.f15004b;
    }

    public final h0 g() {
        return this.f15005c;
    }

    public final ne.n h() {
        return this.f15003a;
    }

    public final void i(k kVar) {
        hc.t.e(kVar, "<set-?>");
        this.f15006d = kVar;
    }

    @Override // xc.m0
    public Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar) {
        Set b10;
        hc.t.e(cVar, "fqName");
        hc.t.e(lVar, "nameFilter");
        b10 = y0.b();
        return b10;
    }
}
