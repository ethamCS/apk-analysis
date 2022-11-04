package le;

import fd.c;
import gc.l;
import hc.k0;
import hc.p;
import hc.t;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ke.j;
import ke.l;
import ke.o;
import ke.r;
import ke.s;
import ke.v;
import ne.n;
import oc.f;
import ub.u;
import ub.v;
import uc.k;
import xc.h0;
import xc.m0;
import xc.n0;
import yd.g;
/* loaded from: classes3.dex */
public final class b implements uc.a {

    /* renamed from: a */
    private final d f15959a = new d();

    /* loaded from: classes3.dex */
    /* synthetic */ class a extends p implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // hc.h
        public final f e0() {
            return k0.b(d.class);
        }

        @Override // hc.h
        public final String g0() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "loadResource";
        }

        /* renamed from: i0 */
        public final InputStream invoke(String str) {
            t.e(str, "p0");
            return ((d) this.f11756d).a(str);
        }
    }

    @Override // uc.a
    public m0 a(n nVar, h0 h0Var, Iterable<? extends zc.b> iterable, zc.c cVar, zc.a aVar, boolean z10) {
        t.e(nVar, "storageManager");
        t.e(h0Var, "builtInsModule");
        t.e(iterable, "classDescriptorFactories");
        t.e(cVar, "platformDependentDeclarationFilter");
        t.e(aVar, "additionalClassPartsProvider");
        return b(nVar, h0Var, k.f23464x, iterable, cVar, aVar, z10, new a(this.f15959a));
    }

    public final m0 b(n nVar, h0 h0Var, Set<wd.c> set, Iterable<? extends zc.b> iterable, zc.c cVar, zc.a aVar, boolean z10, l<? super String, ? extends InputStream> lVar) {
        int s10;
        List h10;
        t.e(nVar, "storageManager");
        t.e(h0Var, "module");
        t.e(set, "packageFqNames");
        t.e(iterable, "classDescriptorFactories");
        t.e(cVar, "platformDependentDeclarationFilter");
        t.e(aVar, "additionalClassPartsProvider");
        t.e(lVar, "loadResource");
        s10 = v.s(set, 10);
        ArrayList<c> arrayList = new ArrayList(s10);
        for (wd.c cVar2 : set) {
            String n10 = le.a.f15958n.n(cVar2);
            InputStream invoke = lVar.invoke(n10);
            if (invoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + n10);
            }
            arrayList.add(c.Companion.a(cVar2, nVar, h0Var, invoke, z10));
        }
        n0 n0Var = new n0(arrayList);
        xc.k0 k0Var = new xc.k0(nVar, h0Var);
        l.a aVar2 = l.a.f15081a;
        o oVar = new o(n0Var);
        le.a aVar3 = le.a.f15958n;
        ke.d dVar = new ke.d(h0Var, k0Var, aVar3);
        v.a aVar4 = v.a.f15104a;
        r rVar = r.f15098a;
        t.d(rVar, "DO_NOTHING");
        c.a aVar5 = c.a.f10155a;
        s.a aVar6 = s.a.f15099a;
        j a10 = j.Companion.a();
        g e10 = aVar3.e();
        h10 = u.h();
        ke.k kVar = new ke.k(nVar, h0Var, aVar2, oVar, dVar, n0Var, aVar4, rVar, aVar5, aVar6, iterable, k0Var, a10, aVar, cVar, e10, null, new ge.b(nVar, h10), null, null, 851968, null);
        for (c cVar3 : arrayList) {
            cVar3.U0(kVar);
        }
        return n0Var;
    }
}
