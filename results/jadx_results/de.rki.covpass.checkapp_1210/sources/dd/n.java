package dd;

import dd.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class n extends z implements nd.j {

    /* renamed from: b */
    private final Type f8509b;

    /* renamed from: c */
    private final nd.i f8510c;

    public n(Type type) {
        nd.i iVar;
        hc.t.e(type, "reflectType");
        this.f8509b = type;
        Type X = X();
        if (X instanceof Class) {
            iVar = new l((Class) X);
        } else if (X instanceof TypeVariable) {
            iVar = new a0((TypeVariable) X);
        } else if (!(X instanceof ParameterizedType)) {
            throw new IllegalStateException("Not a classifier type (" + X.getClass() + "): " + X);
        } else {
            Type rawType = ((ParameterizedType) X).getRawType();
            hc.t.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new l((Class) rawType);
        }
        this.f8510c = iVar;
    }

    @Override // nd.j
    public List<nd.x> A() {
        int s10;
        List<Type> d10 = d.d(X());
        z.a aVar = z.f8521a;
        s10 = ub.v.s(d10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Type type : d10) {
            arrayList.add(aVar.a(type));
        }
        return arrayList;
    }

    @Override // nd.j
    public String D() {
        return X().toString();
    }

    @Override // nd.j
    public boolean V() {
        Type X = X();
        if (X instanceof Class) {
            TypeVariable[] typeParameters = ((Class) X).getTypeParameters();
            hc.t.d(typeParameters, "getTypeParameters()");
            return (typeParameters.length == 0) ^ true;
        }
        return false;
    }

    @Override // nd.j
    public String W() {
        throw new UnsupportedOperationException("Type not found: " + X());
    }

    @Override // dd.z
    public Type X() {
        return this.f8509b;
    }

    @Override // nd.j
    public nd.i f() {
        return this.f8510c;
    }

    @Override // dd.z, nd.d
    public nd.a h(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        return null;
    }

    @Override // nd.d
    public Collection<nd.a> j() {
        List h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // nd.d
    public boolean v() {
        return false;
    }
}
