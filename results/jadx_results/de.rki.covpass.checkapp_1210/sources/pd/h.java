package pd;
/* loaded from: classes.dex */
public final class h implements ke.h {

    /* renamed from: a */
    private final o f19108a;

    /* renamed from: b */
    private final g f19109b;

    public h(o oVar, g gVar) {
        hc.t.e(oVar, "kotlinClassFinder");
        hc.t.e(gVar, "deserializedDescriptorResolver");
        this.f19108a = oVar;
        this.f19109b = gVar;
    }

    @Override // ke.h
    public ke.g a(wd.b bVar) {
        hc.t.e(bVar, "classId");
        q b10 = p.b(this.f19108a, bVar);
        if (b10 == null) {
            return null;
        }
        hc.t.a(b10.i(), bVar);
        return this.f19109b.i(b10);
    }
}
