package kd;

import hc.t;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import nd.n;
import nd.r;
import nd.w;
import ub.u;
import ub.y0;
/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a */
        public static final a f14879a = new a();

        private a() {
        }

        @Override // kd.b
        public n b(wd.f fVar) {
            t.e(fVar, "name");
            return null;
        }

        @Override // kd.b
        public Set<wd.f> c() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }

        @Override // kd.b
        public w d(wd.f fVar) {
            t.e(fVar, "name");
            return null;
        }

        @Override // kd.b
        public Set<wd.f> e() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }

        @Override // kd.b
        public Set<wd.f> f() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }

        /* renamed from: g */
        public List<r> a(wd.f fVar) {
            List<r> h10;
            t.e(fVar, "name");
            h10 = u.h();
            return h10;
        }
    }

    Collection<r> a(wd.f fVar);

    n b(wd.f fVar);

    Set<wd.f> c();

    w d(wd.f fVar);

    Set<wd.f> e();

    Set<wd.f> f();
}
