package oe;
/* loaded from: classes3.dex */
public final class j extends y0<j> {

    /* renamed from: a */
    private final yc.g f18004a;

    public j(yc.g gVar) {
        hc.t.e(gVar, "annotations");
        this.f18004a = gVar;
    }

    @Override // oe.y0
    public oc.d<? extends j> b() {
        return hc.k0.b(j.class);
    }

    /* renamed from: d */
    public j a(j jVar) {
        return jVar == null ? this : new j(yc.i.a(this.f18004a, jVar.f18004a));
    }

    public final yc.g e() {
        return this.f18004a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return hc.t.a(((j) obj).f18004a, this.f18004a);
    }

    /* renamed from: f */
    public j c(j jVar) {
        if (hc.t.a(jVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f18004a.hashCode();
    }
}
