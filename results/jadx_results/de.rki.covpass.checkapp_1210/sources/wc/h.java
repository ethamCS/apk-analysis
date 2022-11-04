package wc;

import fd.c;
import hc.t;
import java.io.InputStream;
import java.util.List;
import ke.k;
import ke.l;
import ke.p;
import ke.r;
import ke.s;
import ke.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.n;
import pd.o;
import ub.u;
import xc.h0;
import xc.k0;
/* loaded from: classes.dex */
public final class h extends ke.a {
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, o oVar, h0 h0Var, k0 k0Var, zc.a aVar, zc.c cVar, l lVar, pe.l lVar2, ge.a aVar2) {
        super(nVar, oVar, h0Var);
        List k10;
        t.e(nVar, "storageManager");
        t.e(oVar, "finder");
        t.e(h0Var, "moduleDescriptor");
        t.e(k0Var, "notFoundClasses");
        t.e(aVar, "additionalClassPartsProvider");
        t.e(cVar, "platformDependentDeclarationFilter");
        t.e(lVar, "deserializationConfiguration");
        t.e(lVar2, "kotlinTypeChecker");
        t.e(aVar2, "samConversionResolver");
        ke.o oVar2 = new ke.o(this);
        le.a aVar3 = le.a.f15958n;
        ke.d dVar = new ke.d(h0Var, k0Var, aVar3);
        v.a aVar4 = v.a.f15104a;
        r rVar = r.f15098a;
        t.d(rVar, "DO_NOTHING");
        c.a aVar5 = c.a.f10155a;
        s.a aVar6 = s.a.f15099a;
        k10 = u.k(new vc.a(nVar, h0Var), new e(nVar, h0Var, null, 4, null));
        i(new k(nVar, h0Var, lVar, oVar2, dVar, this, aVar4, rVar, aVar5, aVar6, k10, k0Var, ke.j.Companion.a(), aVar, cVar, aVar3.e(), lVar2, aVar2, null, null, 786432, null));
    }

    @Override // ke.a
    protected p d(wd.c cVar) {
        t.e(cVar, "fqName");
        InputStream c10 = f().c(cVar);
        if (c10 != null) {
            return le.c.Companion.a(cVar, h(), g(), c10, false);
        }
        return null;
    }
}
