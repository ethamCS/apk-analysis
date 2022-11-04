package pd;

import java.util.List;
import ke.l;
import ke.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.w;
import wc.f;
import xc.h0;
import xc.k0;
import zc.a;
import zc.c;
/* loaded from: classes.dex */
public final class e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ke.k f19098a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: pd.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0307a {

            /* renamed from: a */
            private final e f19099a;

            /* renamed from: b */
            private final g f19100b;

            public C0307a(e eVar, g gVar) {
                hc.t.e(eVar, "deserializationComponentsForJava");
                hc.t.e(gVar, "deserializedDescriptorResolver");
                this.f19099a = eVar;
                this.f19100b = gVar;
            }

            public final e a() {
                return this.f19099a;
            }

            public final g b() {
                return this.f19100b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0307a a(o oVar, o oVar2, gd.o oVar3, String str, ke.r rVar, md.b bVar) {
            jd.f b10;
            List h10;
            List k10;
            hc.t.e(oVar, "kotlinClassFinder");
            hc.t.e(oVar2, "jvmBuiltInsKotlinClassFinder");
            hc.t.e(oVar3, "javaClassFinder");
            hc.t.e(str, "moduleName");
            hc.t.e(rVar, "errorReporter");
            hc.t.e(bVar, "javaSourceElementFactory");
            ne.f fVar = new ne.f("DeserializationComponentsForJava.ModuleData");
            wc.f fVar2 = new wc.f(fVar, f.a.FROM_DEPENDENCIES);
            wd.f o10 = wd.f.o('<' + str + '>');
            hc.t.d(o10, "special(\"<$moduleName>\")");
            ad.x xVar = new ad.x(o10, fVar, fVar2, null, null, null, 56, null);
            fVar2.D0(xVar);
            fVar2.I0(xVar, true);
            g gVar = new g();
            jd.j jVar = new jd.j();
            k0 k0Var = new k0(fVar, xVar);
            b10 = f.b(oVar3, xVar, fVar, k0Var, oVar, gVar, rVar, bVar, jVar, (r21 & 512) != 0 ? w.a.f19140a : null);
            e a10 = f.a(xVar, fVar, k0Var, b10, oVar, gVar, rVar);
            gVar.m(a10);
            hd.g gVar2 = hd.g.f11812a;
            hc.t.d(gVar2, "EMPTY");
            fe.c cVar = new fe.c(b10, gVar2);
            jVar.c(cVar);
            wc.g H0 = fVar2.H0();
            wc.g H02 = fVar2.H0();
            l.a aVar = l.a.f15081a;
            pe.m a11 = pe.l.Companion.a();
            h10 = ub.u.h();
            wc.h hVar = new wc.h(fVar, oVar2, xVar, k0Var, H0, H02, aVar, a11, new ge.b(fVar, h10));
            xVar.h1(xVar);
            k10 = ub.u.k(cVar.a(), hVar);
            xVar.b1(new ad.i(k10, "CompositeProvider@RuntimeModuleData for " + xVar));
            return new C0307a(a10, gVar);
        }
    }

    public e(ne.n nVar, h0 h0Var, ke.l lVar, h hVar, c cVar, jd.f fVar, k0 k0Var, ke.r rVar, fd.c cVar2, ke.j jVar, pe.l lVar2, re.a aVar) {
        List h10;
        List h11;
        zc.a aVar2;
        hc.t.e(nVar, "storageManager");
        hc.t.e(h0Var, "moduleDescriptor");
        hc.t.e(lVar, "configuration");
        hc.t.e(hVar, "classDataFinder");
        hc.t.e(cVar, "annotationAndConstantLoader");
        hc.t.e(fVar, "packageFragmentProvider");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(rVar, "errorReporter");
        hc.t.e(cVar2, "lookupTracker");
        hc.t.e(jVar, "contractDeserializer");
        hc.t.e(lVar2, "kotlinTypeChecker");
        hc.t.e(aVar, "typeAttributeTranslators");
        uc.h x10 = h0Var.x();
        wc.f fVar2 = x10 instanceof wc.f ? (wc.f) x10 : null;
        v.a aVar3 = v.a.f15104a;
        i iVar = i.f19110a;
        h10 = ub.u.h();
        zc.a aVar4 = (fVar2 == null || (aVar2 = fVar2.H0()) == null) ? a.C0474a.f26602a : aVar2;
        zc.c cVar3 = (fVar2 == null || (cVar3 = fVar2.H0()) == null) ? c.b.f26604a : cVar3;
        yd.g a10 = vd.i.f24018a.a();
        h11 = ub.u.h();
        this.f19098a = new ke.k(nVar, h0Var, lVar, hVar, cVar, fVar, aVar3, rVar, cVar2, iVar, h10, k0Var, jVar, aVar4, cVar3, a10, lVar2, new ge.b(nVar, h11), null, aVar.a(), 262144, null);
    }

    public final ke.k a() {
        return this.f19098a;
    }
}
