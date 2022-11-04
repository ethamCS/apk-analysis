package fe;

import java.util.Collection;
import java.util.List;
import ub.u;
import xc.z0;
/* loaded from: classes3.dex */
public interface f {
    public static final a Companion = a.f10196a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f10196a = new a();

        /* renamed from: b */
        private static final fe.a f10197b;

        static {
            List h10;
            h10 = u.h();
            f10197b = new fe.a(h10);
        }

        private a() {
        }

        public final fe.a a() {
            return f10197b;
        }
    }

    void a(xc.e eVar, wd.f fVar, Collection<z0> collection);

    void b(xc.e eVar, List<xc.d> list);

    List<wd.f> c(xc.e eVar);

    List<wd.f> d(xc.e eVar);

    void e(xc.e eVar, wd.f fVar, Collection<z0> collection);
}
