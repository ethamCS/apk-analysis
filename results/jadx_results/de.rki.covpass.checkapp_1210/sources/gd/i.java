package gd;

import java.util.Collection;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final i f10730a = new i();

    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final a f10731c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(i.f10730a.b(bVar));
        }
    }

    private i() {
    }

    private final boolean c(xc.b bVar) {
        boolean N;
        N = ub.c0.N(g.f10698a.c(), ee.a.d(bVar));
        if (!N || !bVar.o().isEmpty()) {
            if (!uc.h.f0(bVar)) {
                return false;
            }
            Collection<? extends xc.b> f10 = bVar.f();
            hc.t.d(f10, "overriddenDescriptors");
            if (!f10.isEmpty()) {
                for (xc.b bVar2 : f10) {
                    i iVar = f10730a;
                    hc.t.d(bVar2, "it");
                    if (iVar.b(bVar2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String a(xc.b bVar) {
        wd.f fVar;
        hc.t.e(bVar, "<this>");
        uc.h.f0(bVar);
        xc.b c10 = ee.a.c(ee.a.o(bVar), false, a.f10731c, 1, null);
        if (c10 == null || (fVar = g.f10698a.a().get(ee.a.h(c10))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean b(xc.b bVar) {
        hc.t.e(bVar, "callableMemberDescriptor");
        if (!g.f10698a.d().contains(bVar.getName())) {
            return false;
        }
        return c(bVar);
    }
}
