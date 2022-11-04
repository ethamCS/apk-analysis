package pe;

import java.util.Collection;
import oe.e0;
import oe.e1;
import xc.h0;
/* loaded from: classes3.dex */
public abstract class g extends oe.i {

    /* loaded from: classes3.dex */
    public static final class a extends g {

        /* renamed from: a */
        public static final a f19148a = new a();

        private a() {
        }

        @Override // pe.g
        public xc.e b(wd.b bVar) {
            hc.t.e(bVar, "classId");
            return null;
        }

        @Override // pe.g
        public <S extends he.h> S c(xc.e eVar, gc.a<? extends S> aVar) {
            hc.t.e(eVar, "classDescriptor");
            hc.t.e(aVar, "compute");
            return aVar.invoke();
        }

        @Override // pe.g
        public boolean d(h0 h0Var) {
            hc.t.e(h0Var, "moduleDescriptor");
            return false;
        }

        @Override // pe.g
        public boolean e(e1 e1Var) {
            hc.t.e(e1Var, "typeConstructor");
            return false;
        }

        @Override // pe.g
        public Collection<e0> g(xc.e eVar) {
            hc.t.e(eVar, "classDescriptor");
            Collection<e0> l10 = eVar.r().l();
            hc.t.d(l10, "classDescriptor.typeConstructor.supertypes");
            return l10;
        }

        @Override // pe.g
        /* renamed from: h */
        public e0 a(se.i iVar) {
            hc.t.e(iVar, "type");
            return (e0) iVar;
        }

        /* renamed from: i */
        public xc.e f(xc.m mVar) {
            hc.t.e(mVar, "descriptor");
            return null;
        }
    }

    public abstract xc.e b(wd.b bVar);

    public abstract <S extends he.h> S c(xc.e eVar, gc.a<? extends S> aVar);

    public abstract boolean d(h0 h0Var);

    public abstract boolean e(e1 e1Var);

    public abstract xc.h f(xc.m mVar);

    public abstract Collection<e0> g(xc.e eVar);

    public abstract e0 h(se.i iVar);
}
