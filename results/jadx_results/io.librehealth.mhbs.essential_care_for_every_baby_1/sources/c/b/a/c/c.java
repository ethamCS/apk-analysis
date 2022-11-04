package c.b.a.c;

import c.b.a.a.d;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
final class c {
    static {
        d.a(", ").b("null");
    }

    public static String a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
