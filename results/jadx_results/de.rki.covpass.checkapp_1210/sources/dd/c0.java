package dd;

import dd.z;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class c0 extends z implements nd.c0 {

    /* renamed from: b */
    private final WildcardType f8486b;

    /* renamed from: c */
    private final Collection<nd.a> f8487c;

    /* renamed from: d */
    private final boolean f8488d;

    public c0(WildcardType wildcardType) {
        List h10;
        hc.t.e(wildcardType, "reflectType");
        this.f8486b = wildcardType;
        h10 = ub.u.h();
        this.f8487c = h10;
    }

    @Override // nd.c0
    public boolean K() {
        Object B;
        Type[] upperBounds = X().getUpperBounds();
        hc.t.d(upperBounds, "reflectType.upperBounds");
        B = ub.m.B(upperBounds);
        return !hc.t.a(B, Object.class);
    }

    /* renamed from: Y */
    public z t() {
        Object U;
        Object U2;
        Type[] upperBounds = X().getUpperBounds();
        Type[] lowerBounds = X().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + X());
        } else if (lowerBounds.length == 1) {
            z.a aVar = z.f8521a;
            hc.t.d(lowerBounds, "lowerBounds");
            U2 = ub.m.U(lowerBounds);
            hc.t.d(U2, "lowerBounds.single()");
            return aVar.a((Type) U2);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            hc.t.d(upperBounds, "upperBounds");
            U = ub.m.U(upperBounds);
            Type type = (Type) U;
            if (hc.t.a(type, Object.class)) {
                return null;
            }
            z.a aVar2 = z.f8521a;
            hc.t.d(type, "ub");
            return aVar2.a(type);
        }
    }

    /* renamed from: Z */
    public WildcardType X() {
        return this.f8486b;
    }

    @Override // nd.d
    public Collection<nd.a> j() {
        return this.f8487c;
    }

    @Override // nd.d
    public boolean v() {
        return this.f8488d;
    }
}
