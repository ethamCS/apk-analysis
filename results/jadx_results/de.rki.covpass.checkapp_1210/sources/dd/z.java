package dd;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.x;
/* loaded from: classes.dex */
public abstract class z implements nd.x {

    /* renamed from: a */
    public static final a f8521a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(Type type) {
            hc.t.e(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new k(type) : type instanceof WildcardType ? new c0((WildcardType) type) : new n(type);
        }
    }

    protected abstract Type X();

    public boolean equals(Object obj) {
        return (obj instanceof z) && hc.t.a(X(), ((z) obj).X());
    }

    @Override // nd.d
    public nd.a h(wd.c cVar) {
        return x.a.a(this, cVar);
    }

    public int hashCode() {
        return X().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + X();
    }
}
