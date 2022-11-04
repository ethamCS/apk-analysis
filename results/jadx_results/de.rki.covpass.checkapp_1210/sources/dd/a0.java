package dd;

import dd.h;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a0 extends p implements h, nd.y {

    /* renamed from: a */
    private final TypeVariable<?> f8471a;

    public a0(TypeVariable<?> typeVariable) {
        hc.t.e(typeVariable, "typeVariable");
        this.f8471a = typeVariable;
    }

    @Override // dd.h
    public AnnotatedElement U() {
        TypeVariable<?> typeVariable = this.f8471a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    /* renamed from: X */
    public e h(wd.c cVar) {
        return h.a.a(this, cVar);
    }

    /* renamed from: Y */
    public List<e> j() {
        return h.a.b(this);
    }

    /* renamed from: Z */
    public List<n> getUpperBounds() {
        Object u02;
        List<n> h10;
        Type[] bounds = this.f8471a.getBounds();
        hc.t.d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        u02 = ub.c0.u0(arrayList);
        n nVar = (n) u02;
        if (hc.t.a(nVar != null ? nVar.X() : null, Object.class)) {
            h10 = ub.u.h();
            return h10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && hc.t.a(this.f8471a, ((a0) obj).f8471a);
    }

    @Override // nd.t
    public wd.f getName() {
        wd.f j10 = wd.f.j(this.f8471a.getName());
        hc.t.d(j10, "identifier(typeVariable.name)");
        return j10;
    }

    public int hashCode() {
        return this.f8471a.hashCode();
    }

    public String toString() {
        return a0.class.getName() + ": " + this.f8471a;
    }

    @Override // nd.d
    public boolean v() {
        return h.a.c(this);
    }
}
