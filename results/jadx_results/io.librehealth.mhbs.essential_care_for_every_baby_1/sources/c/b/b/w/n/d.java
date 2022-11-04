package c.b.b.w.n;

import c.b.b.q;
import c.b.b.t;
import c.b.b.u;
/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a */
    private final c.b.b.w.c f530a;

    public d(c.b.b.w.c cVar) {
        this.f530a = cVar;
    }

    @Override // c.b.b.u
    public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
        c.b.b.v.b bVar = (c.b.b.v.b) aVar.c().getAnnotation(c.b.b.v.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) b(this.f530a, eVar, aVar, bVar);
    }

    public t<?> b(c.b.b.w.c cVar, c.b.b.e eVar, c.b.b.x.a<?> aVar, c.b.b.v.b bVar) {
        t<?> tVar;
        Object a2 = cVar.a(c.b.b.x.a.a(bVar.value())).a();
        if (a2 instanceof t) {
            tVar = (t) a2;
        } else if (a2 instanceof u) {
            tVar = ((u) a2).a(eVar, aVar);
        } else {
            boolean z = a2 instanceof q;
            if (!z && !(a2 instanceof c.b.b.i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a2.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c.b.b.i iVar = null;
            q qVar = z ? (q) a2 : null;
            if (a2 instanceof c.b.b.i) {
                iVar = (c.b.b.i) a2;
            }
            tVar = new l<>(qVar, iVar, eVar, aVar, null);
        }
        return (tVar == null || !bVar.nullSafe()) ? tVar : tVar.a();
    }
}
