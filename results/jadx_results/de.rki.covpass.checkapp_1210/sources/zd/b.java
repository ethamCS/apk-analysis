package zd;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
import ub.a0;
import xc.f1;
import xc.l0;
/* loaded from: classes3.dex */
public interface b {

    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a */
        public static final a f26612a = new a();

        private a() {
        }

        @Override // zd.b
        public String a(xc.h hVar, zd.c cVar) {
            t.e(hVar, "classifier");
            t.e(cVar, "renderer");
            if (hVar instanceof f1) {
                wd.f name = ((f1) hVar).getName();
                t.d(name, "classifier.name");
                return cVar.v(name, false);
            }
            wd.d m10 = ae.d.m(hVar);
            t.d(m10, "getFqName(classifier)");
            return cVar.u(m10);
        }
    }

    /* renamed from: zd.b$b */
    /* loaded from: classes3.dex */
    public static final class C0475b implements b {

        /* renamed from: a */
        public static final C0475b f26613a = new C0475b();

        private C0475b() {
        }

        @Override // zd.b
        public String a(xc.h hVar, zd.c cVar) {
            boolean z10;
            List H;
            t.e(hVar, "classifier");
            t.e(cVar, "renderer");
            if (hVar instanceof f1) {
                wd.f name = ((f1) hVar).getName();
                t.d(name, "classifier.name");
                return cVar.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            xc.h hVar2 = hVar;
            do {
                arrayList.add(hVar2.getName());
                xc.m b10 = hVar2.b();
                z10 = b10 instanceof xc.e;
                hVar2 = b10;
            } while (z10);
            H = a0.H(arrayList);
            return n.c(H);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a */
        public static final c f26614a = new c();

        private c() {
        }

        private final String b(xc.h hVar) {
            wd.f name = hVar.getName();
            t.d(name, "descriptor.name");
            String b10 = n.b(name);
            if (hVar instanceof f1) {
                return b10;
            }
            xc.m b11 = hVar.b();
            t.d(b11, "descriptor.containingDeclaration");
            String c10 = c(b11);
            if (c10 == null || t.a(c10, BuildConfig.FLAVOR)) {
                return b10;
            }
            return c10 + '.' + b10;
        }

        private final String c(xc.m mVar) {
            if (mVar instanceof xc.e) {
                return b((xc.h) mVar);
            }
            if (!(mVar instanceof l0)) {
                return null;
            }
            wd.d j10 = ((l0) mVar).d().j();
            t.d(j10, "descriptor.fqName.toUnsafe()");
            return n.a(j10);
        }

        @Override // zd.b
        public String a(xc.h hVar, zd.c cVar) {
            t.e(hVar, "classifier");
            t.e(cVar, "renderer");
            return b(hVar);
        }
    }

    String a(xc.h hVar, zd.c cVar);
}
