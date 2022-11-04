package d.a.b.w.n;

import d.a.b.q;
import d.a.b.t;
import d.a.b.u;
/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: b */
    private final d.a.b.w.c f3821b;

    public d(d.a.b.w.c cVar) {
        this.f3821b = cVar;
    }

    public t<?> a(d.a.b.w.c cVar, d.a.b.e eVar, d.a.b.x.a<?> aVar, d.a.b.v.b bVar) {
        t<?> tVar;
        Object a2 = cVar.a(d.a.b.x.a.a(bVar.value())).a();
        if (a2 instanceof t) {
            tVar = (t) a2;
        } else if (a2 instanceof u) {
            tVar = ((u) a2).b(eVar, aVar);
        } else {
            boolean z = a2 instanceof q;
            if (!z && !(a2 instanceof d.a.b.i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a2.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            d.a.b.i iVar = null;
            q qVar = z ? (q) a2 : null;
            if (a2 instanceof d.a.b.i) {
                iVar = (d.a.b.i) a2;
            }
            tVar = new l<>(qVar, iVar, eVar, aVar, null);
        }
        return (tVar == null || !bVar.nullSafe()) ? tVar : tVar.a();
    }

    @Override // d.a.b.u
    public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
        d.a.b.v.b bVar = (d.a.b.v.b) aVar.c().getAnnotation(d.a.b.v.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f3821b, eVar, aVar, bVar);
    }
}
