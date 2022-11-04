package zc;

import hc.t;
import java.util.Collection;
import java.util.List;
import oe.e0;
import ub.u;
import wd.f;
import xc.z0;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: zc.a$a */
    /* loaded from: classes.dex */
    public static final class C0474a implements a {

        /* renamed from: a */
        public static final C0474a f26602a = new C0474a();

        private C0474a() {
        }

        @Override // zc.a
        public Collection<e0> a(xc.e eVar) {
            List h10;
            t.e(eVar, "classDescriptor");
            h10 = u.h();
            return h10;
        }

        @Override // zc.a
        public Collection<f> b(xc.e eVar) {
            List h10;
            t.e(eVar, "classDescriptor");
            h10 = u.h();
            return h10;
        }

        @Override // zc.a
        public Collection<xc.d> c(xc.e eVar) {
            List h10;
            t.e(eVar, "classDescriptor");
            h10 = u.h();
            return h10;
        }

        @Override // zc.a
        public Collection<z0> e(f fVar, xc.e eVar) {
            List h10;
            t.e(fVar, "name");
            t.e(eVar, "classDescriptor");
            h10 = u.h();
            return h10;
        }
    }

    Collection<e0> a(xc.e eVar);

    Collection<f> b(xc.e eVar);

    Collection<xc.d> c(xc.e eVar);

    Collection<z0> e(f fVar, xc.e eVar);
}
