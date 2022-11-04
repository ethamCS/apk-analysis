package c.b.a.c;

import c.b.a.a.i;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes.dex */
public abstract class b<T> extends a<T> implements Serializable {

    /* renamed from: a */
    private final Type f402a;

    public b() {
        Type a2 = a();
        this.f402a = a2;
        i.k(!(a2 instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a2);
    }

    public final Type b() {
        return this.f402a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f402a.equals(((b) obj).f402a);
        }
        return false;
    }

    public int hashCode() {
        return this.f402a.hashCode();
    }

    public String toString() {
        return c.a(this.f402a);
    }
}
