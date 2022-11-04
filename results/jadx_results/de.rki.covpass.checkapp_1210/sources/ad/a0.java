package ad;

import xc.q0;
/* loaded from: classes.dex */
public interface a0 {
    public static final a Companion = a.f254a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f254a = new a();

        /* renamed from: b */
        private static final xc.g0<a0> f255b = new xc.g0<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final xc.g0<a0> a() {
            return f255b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a0 {

        /* renamed from: a */
        public static final b f256a = new b();

        private b() {
        }

        @Override // ad.a0
        public q0 a(x xVar, wd.c cVar, ne.n nVar) {
            hc.t.e(xVar, "module");
            hc.t.e(cVar, "fqName");
            hc.t.e(nVar, "storageManager");
            return new r(xVar, cVar, nVar);
        }
    }

    q0 a(x xVar, wd.c cVar, ne.n nVar);
}
