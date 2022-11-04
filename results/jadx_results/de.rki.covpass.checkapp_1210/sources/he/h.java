package he;

import hc.t;
import hc.v;
import java.util.Collection;
import java.util.Set;
import ub.y0;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public interface h extends k {
    public static final a Companion = a.f11870a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f11870a = new a();

        /* renamed from: b */
        private static final gc.l<wd.f, Boolean> f11871b = C0180a.f11872c;

        /* renamed from: he.h$a$a */
        /* loaded from: classes3.dex */
        static final class C0180a extends v implements gc.l<wd.f, Boolean> {

            /* renamed from: c */
            public static final C0180a f11872c = new C0180a();

            C0180a() {
                super(1);
            }

            /* renamed from: b */
            public final Boolean invoke(wd.f fVar) {
                t.e(fVar, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        public final gc.l<wd.f, Boolean> a() {
            return f11871b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends i {

        /* renamed from: a */
        public static final b f11873a = new b();

        private b() {
        }

        @Override // he.i, he.h
        public Set<wd.f> c() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }

        @Override // he.i, he.h
        public Set<wd.f> d() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }

        @Override // he.i, he.h
        public Set<wd.f> g() {
            Set<wd.f> b10;
            b10 = y0.b();
            return b10;
        }
    }

    Collection<? extends u0> a(wd.f fVar, fd.b bVar);

    Collection<? extends z0> b(wd.f fVar, fd.b bVar);

    Set<wd.f> c();

    Set<wd.f> d();

    Set<wd.f> g();
}
