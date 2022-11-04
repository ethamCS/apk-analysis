package dd;

import dd.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class k extends z implements nd.f {

    /* renamed from: b */
    private final Type f8500b;

    /* renamed from: c */
    private final z f8501c;

    /* renamed from: d */
    private final Collection<nd.a> f8502d;

    /* renamed from: e */
    private final boolean f8503e;

    public k(Type type) {
        z.a aVar;
        Type componentType;
        String str;
        List h10;
        hc.t.e(type, "reflectType");
        this.f8500b = type;
        Type X = X();
        if (!(X instanceof GenericArrayType)) {
            if (X instanceof Class) {
                Class cls = (Class) X;
                if (cls.isArray()) {
                    aVar = z.f8521a;
                    componentType = cls.getComponentType();
                    str = "getComponentType()";
                }
            }
            throw new IllegalArgumentException("Not an array type (" + X().getClass() + "): " + X());
        }
        aVar = z.f8521a;
        componentType = ((GenericArrayType) X).getGenericComponentType();
        str = "genericComponentType";
        hc.t.d(componentType, str);
        this.f8501c = aVar.a(componentType);
        h10 = ub.u.h();
        this.f8502d = h10;
    }

    @Override // dd.z
    protected Type X() {
        return this.f8500b;
    }

    /* renamed from: Y */
    public z w() {
        return this.f8501c;
    }

    @Override // nd.d
    public Collection<nd.a> j() {
        return this.f8502d;
    }

    @Override // nd.d
    public boolean v() {
        return this.f8503e;
    }
}
