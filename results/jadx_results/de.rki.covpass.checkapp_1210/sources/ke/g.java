package ke;

import xc.a1;
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a */
    private final td.c f15048a;

    /* renamed from: b */
    private final rd.c f15049b;

    /* renamed from: c */
    private final td.a f15050c;

    /* renamed from: d */
    private final a1 f15051d;

    public g(td.c cVar, rd.c cVar2, td.a aVar, a1 a1Var) {
        hc.t.e(cVar, "nameResolver");
        hc.t.e(cVar2, "classProto");
        hc.t.e(aVar, "metadataVersion");
        hc.t.e(a1Var, "sourceElement");
        this.f15048a = cVar;
        this.f15049b = cVar2;
        this.f15050c = aVar;
        this.f15051d = a1Var;
    }

    public final td.c a() {
        return this.f15048a;
    }

    public final rd.c b() {
        return this.f15049b;
    }

    public final td.a c() {
        return this.f15050c;
    }

    public final a1 d() {
        return this.f15051d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return hc.t.a(this.f15048a, gVar.f15048a) && hc.t.a(this.f15049b, gVar.f15049b) && hc.t.a(this.f15050c, gVar.f15050c) && hc.t.a(this.f15051d, gVar.f15051d);
    }

    public int hashCode() {
        return (((((this.f15048a.hashCode() * 31) + this.f15049b.hashCode()) * 31) + this.f15050c.hashCode()) * 31) + this.f15051d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f15048a + ", classProto=" + this.f15049b + ", metadataVersion=" + this.f15050c + ", sourceElement=" + this.f15051d + ')';
    }
}
