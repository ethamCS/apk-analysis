package gd;

import oe.m0;
import xc.t0;
import xc.u0;
import xc.z0;
/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final a f10703c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(i.f10730a.b(ee.a.o(bVar)));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final b f10704c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(e.f10688m.j((z0) bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final c f10705c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(uc.h.f0(bVar) && f.m(bVar) != null);
        }
    }

    public static final boolean a(xc.b bVar) {
        hc.t.e(bVar, "<this>");
        return d(bVar) != null;
    }

    public static final String b(xc.b bVar) {
        xc.b o10;
        wd.f i10;
        hc.t.e(bVar, "callableMemberDescriptor");
        xc.b c10 = c(bVar);
        if (c10 == null || (o10 = ee.a.o(c10)) == null) {
            return null;
        }
        if (o10 instanceof u0) {
            return i.f10730a.a(o10);
        }
        if ((o10 instanceof z0) && (i10 = e.f10688m.i((z0) o10)) != null) {
            return i10.b();
        }
        return null;
    }

    private static final xc.b c(xc.b bVar) {
        if (uc.h.f0(bVar)) {
            return d(bVar);
        }
        return null;
    }

    public static final <T extends xc.b> T d(T t10) {
        gc.l lVar;
        hc.t.e(t10, "<this>");
        if (h0.Companion.g().contains(t10.getName()) || g.f10698a.d().contains(ee.a.o(t10).getName())) {
            if (t10 instanceof u0 ? true : t10 instanceof t0) {
                lVar = a.f10703c;
            } else if (!(t10 instanceof z0)) {
                return null;
            } else {
                lVar = b.f10704c;
            }
            return (T) ee.a.c(t10, false, lVar, 1, null);
        }
        return null;
    }

    public static final <T extends xc.b> T e(T t10) {
        hc.t.e(t10, "<this>");
        T t11 = (T) d(t10);
        if (t11 != null) {
            return t11;
        }
        f fVar = f.f10690m;
        wd.f name = t10.getName();
        hc.t.d(name, "name");
        if (fVar.l(name)) {
            return (T) ee.a.c(t10, false, c.f10705c, 1, null);
        }
        return null;
    }

    public static final boolean f(xc.e eVar, xc.a aVar) {
        hc.t.e(eVar, "<this>");
        hc.t.e(aVar, "specialCallableDescriptor");
        xc.m b10 = aVar.b();
        hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        m0 u10 = ((xc.e) b10).u();
        hc.t.d(u10, "specialCallableDescripto…ssDescriptor).defaultType");
        while (true) {
            eVar = ae.d.s(eVar);
            boolean z10 = false;
            if (eVar != null) {
                if (!(eVar instanceof id.c)) {
                    if (pe.u.b(eVar.u(), u10) != null) {
                        z10 = true;
                    }
                    if (z10) {
                        return !uc.h.f0(eVar);
                    }
                }
            } else {
                return false;
            }
        }
    }

    public static final boolean g(xc.b bVar) {
        hc.t.e(bVar, "<this>");
        return ee.a.o(bVar).b() instanceof id.c;
    }

    public static final boolean h(xc.b bVar) {
        hc.t.e(bVar, "<this>");
        return g(bVar) || uc.h.f0(bVar);
    }
}
