package gd;

import gd.h0;
/* loaded from: classes.dex */
public final class f extends h0 {

    /* renamed from: m */
    public static final f f10690m = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final a f10691c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(f.f10690m.j(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        public static final b f10692c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf((bVar instanceof xc.y) && f.f10690m.j(bVar));
        }
    }

    private f() {
    }

    public final boolean j(xc.b bVar) {
        boolean N;
        N = ub.c0.N(h0.Companion.e(), pd.v.d(bVar));
        return N;
    }

    @fc.c
    public static final xc.y k(xc.y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        f fVar = f10690m;
        wd.f name = yVar.getName();
        hc.t.d(name, "functionDescriptor.name");
        if (!fVar.l(name)) {
            return null;
        }
        return (xc.y) ee.a.c(yVar, false, a.f10691c, 1, null);
    }

    @fc.c
    public static final h0.b m(xc.b bVar) {
        xc.b c10;
        String d10;
        hc.t.e(bVar, "<this>");
        h0.a aVar = h0.Companion;
        if (!aVar.d().contains(bVar.getName()) || (c10 = ee.a.c(bVar, false, b.f10692c, 1, null)) == null || (d10 = pd.v.d(c10)) == null) {
            return null;
        }
        return aVar.l(d10);
    }

    public final boolean l(wd.f fVar) {
        hc.t.e(fVar, "<this>");
        return h0.Companion.d().contains(fVar);
    }
}
