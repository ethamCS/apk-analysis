package jd;

import gd.x;
import hc.t;
import hc.v;
import kotlin.Lazy;
import nd.z;
import tb.o;
import xc.m;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: jd.a$a */
    /* loaded from: classes.dex */
    public static final class C0208a extends v implements gc.a<x> {

        /* renamed from: c */
        final /* synthetic */ g f14284c;

        /* renamed from: d */
        final /* synthetic */ xc.g f14285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0208a(g gVar, xc.g gVar2) {
            super(0);
            this.f14284c = gVar;
            this.f14285d = gVar2;
        }

        /* renamed from: b */
        public final x invoke() {
            return a.g(this.f14284c, this.f14285d.j());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<x> {

        /* renamed from: c */
        final /* synthetic */ g f14286c;

        /* renamed from: d */
        final /* synthetic */ yc.g f14287d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, yc.g gVar2) {
            super(0);
            this.f14286c = gVar;
            this.f14287d = gVar2;
        }

        /* renamed from: b */
        public final x invoke() {
            return a.g(this.f14286c, this.f14287d);
        }
    }

    public static final g a(g gVar, k kVar) {
        t.e(gVar, "<this>");
        t.e(kVar, "typeParameterResolver");
        return new g(gVar.a(), kVar, gVar.c());
    }

    private static final g b(g gVar, m mVar, z zVar, int i10, Lazy<x> lazy) {
        return new g(gVar.a(), zVar != null ? new h(gVar, mVar, zVar, i10) : gVar.f(), lazy);
    }

    public static final g c(g gVar, xc.g gVar2, z zVar, int i10) {
        Lazy b10;
        t.e(gVar, "<this>");
        t.e(gVar2, "containingDeclaration");
        b10 = tb.m.b(o.NONE, new C0208a(gVar, gVar2));
        return b(gVar, gVar2, zVar, i10, b10);
    }

    public static /* synthetic */ g d(g gVar, xc.g gVar2, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c(gVar, gVar2, zVar, i10);
    }

    public static final g e(g gVar, m mVar, z zVar, int i10) {
        t.e(gVar, "<this>");
        t.e(mVar, "containingDeclaration");
        t.e(zVar, "typeParameterOwner");
        return b(gVar, mVar, zVar, i10, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, m mVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(gVar, mVar, zVar, i10);
    }

    public static final x g(g gVar, yc.g gVar2) {
        t.e(gVar, "<this>");
        t.e(gVar2, "additionalAnnotations");
        return gVar.a().a().c(gVar.b(), gVar2);
    }

    public static final g h(g gVar, yc.g gVar2) {
        Lazy b10;
        t.e(gVar, "<this>");
        t.e(gVar2, "additionalAnnotations");
        if (gVar2.isEmpty()) {
            return gVar;
        }
        jd.b a10 = gVar.a();
        k f10 = gVar.f();
        b10 = tb.m.b(o.NONE, new b(gVar, gVar2));
        return new g(a10, f10, b10);
    }

    public static final g i(g gVar, jd.b bVar) {
        t.e(gVar, "<this>");
        t.e(bVar, "components");
        return new g(bVar, gVar.f(), gVar.c());
    }
}
