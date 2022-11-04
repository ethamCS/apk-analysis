package ke;

import java.util.List;
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a */
    private final k f15082a;

    /* renamed from: b */
    private final td.c f15083b;

    /* renamed from: c */
    private final xc.m f15084c;

    /* renamed from: d */
    private final td.g f15085d;

    /* renamed from: e */
    private final td.h f15086e;

    /* renamed from: f */
    private final td.a f15087f;

    /* renamed from: g */
    private final me.f f15088g;

    /* renamed from: h */
    private final d0 f15089h;

    /* renamed from: i */
    private final w f15090i;

    public m(k kVar, td.c cVar, xc.m mVar, td.g gVar, td.h hVar, td.a aVar, me.f fVar, d0 d0Var, List<rd.s> list) {
        String str;
        hc.t.e(kVar, "components");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(mVar, "containingDeclaration");
        hc.t.e(gVar, "typeTable");
        hc.t.e(hVar, "versionRequirementTable");
        hc.t.e(aVar, "metadataVersion");
        hc.t.e(list, "typeParameters");
        this.f15082a = kVar;
        this.f15083b = cVar;
        this.f15084c = mVar;
        this.f15085d = gVar;
        this.f15086e = hVar;
        this.f15087f = aVar;
        this.f15088g = fVar;
        this.f15089h = new d0(this, d0Var, list, "Deserializer for \"" + mVar.getName() + '\"', (fVar == null || (str = fVar.c()) == null) ? "[container not found]" : str);
        this.f15090i = new w(this);
    }

    public static /* synthetic */ m b(m mVar, xc.m mVar2, List list, td.c cVar, td.g gVar, td.h hVar, td.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = mVar.f15083b;
        }
        td.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = mVar.f15085d;
        }
        td.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = mVar.f15086e;
        }
        td.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            aVar = mVar.f15087f;
        }
        return mVar.a(mVar2, list, cVar2, gVar2, hVar2, aVar);
    }

    public final m a(xc.m mVar, List<rd.s> list, td.c cVar, td.g gVar, td.h hVar, td.a aVar) {
        hc.t.e(mVar, "descriptor");
        hc.t.e(list, "typeParameterProtos");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(gVar, "typeTable");
        td.h hVar2 = hVar;
        hc.t.e(hVar2, "versionRequirementTable");
        hc.t.e(aVar, "metadataVersion");
        k kVar = this.f15082a;
        if (!td.i.b(aVar)) {
            hVar2 = this.f15086e;
        }
        return new m(kVar, cVar, mVar, gVar, hVar2, aVar, this.f15088g, this.f15089h, list);
    }

    public final k c() {
        return this.f15082a;
    }

    public final me.f d() {
        return this.f15088g;
    }

    public final xc.m e() {
        return this.f15084c;
    }

    public final w f() {
        return this.f15090i;
    }

    public final td.c g() {
        return this.f15083b;
    }

    public final ne.n h() {
        return this.f15082a.u();
    }

    public final d0 i() {
        return this.f15089h;
    }

    public final td.g j() {
        return this.f15085d;
    }

    public final td.h k() {
        return this.f15086e;
    }
}
