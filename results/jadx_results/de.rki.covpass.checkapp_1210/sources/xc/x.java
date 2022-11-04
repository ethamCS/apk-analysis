package xc;

import java.util.List;
/* loaded from: classes.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.p implements gc.l<wd.b, wd.b> {
        public static final a Y3 = new a();

        a() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return hc.k0.b(wd.b.class);
        }

        @Override // hc.h
        public final String g0() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "getOuterClassId";
        }

        /* renamed from: i0 */
        public final wd.b invoke(wd.b bVar) {
            hc.t.e(bVar, "p0");
            return bVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<wd.b, Integer> {

        /* renamed from: c */
        public static final b f25595c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Integer invoke(wd.b bVar) {
            hc.t.e(bVar, "it");
            return 0;
        }
    }

    public static final e a(h0 h0Var, wd.b bVar) {
        hc.t.e(h0Var, "<this>");
        hc.t.e(bVar, "classId");
        h b10 = b(h0Var, bVar);
        if (b10 instanceof e) {
            return (e) b10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final xc.h b(xc.h0 r10, wd.b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.x.b(xc.h0, wd.b):xc.h");
    }

    public static final e c(h0 h0Var, wd.b bVar, k0 k0Var) {
        af.h k10;
        af.h z10;
        List<Integer> F;
        hc.t.e(h0Var, "<this>");
        hc.t.e(bVar, "classId");
        hc.t.e(k0Var, "notFoundClasses");
        e a10 = a(h0Var, bVar);
        if (a10 != null) {
            return a10;
        }
        k10 = af.n.k(bVar, a.Y3);
        z10 = af.p.z(k10, b.f25595c);
        F = af.p.F(z10);
        return k0Var.d(bVar, F);
    }

    public static final e1 d(h0 h0Var, wd.b bVar) {
        hc.t.e(h0Var, "<this>");
        hc.t.e(bVar, "classId");
        h b10 = b(h0Var, bVar);
        if (b10 instanceof e1) {
            return (e1) b10;
        }
        return null;
    }
}
