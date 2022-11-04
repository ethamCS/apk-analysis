package hc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class q0 {
    public static Collection a(Object obj) {
        if ((obj instanceof ic.a) && !(obj instanceof ic.b)) {
            n(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static List b(Object obj) {
        if ((obj instanceof ic.a) && !(obj instanceof ic.c)) {
            n(obj, "kotlin.collections.MutableList");
        }
        return f(obj);
    }

    public static Set c(Object obj) {
        if ((obj instanceof ic.a) && !(obj instanceof ic.e)) {
            n(obj, "kotlin.collections.MutableSet");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i10) {
        if (obj != null && !i(obj, i10)) {
            n(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static List f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static Set g(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof o) {
            return ((o) obj).getArity();
        }
        if (obj instanceof gc.a) {
            return 0;
        }
        if (obj instanceof gc.l) {
            return 1;
        }
        if (obj instanceof gc.p) {
            return 2;
        }
        if (obj instanceof gc.q) {
            return 3;
        }
        if (obj instanceof gc.r) {
            return 4;
        }
        if (obj instanceof gc.s) {
            return 5;
        }
        if (obj instanceof gc.t) {
            return 6;
        }
        if (obj instanceof gc.u) {
            return 7;
        }
        if (obj instanceof gc.v) {
            return 8;
        }
        if (obj instanceof gc.w) {
            return 9;
        }
        if (obj instanceof gc.b) {
            return 10;
        }
        if (obj instanceof gc.c) {
            return 11;
        }
        if (obj instanceof gc.d) {
            return 12;
        }
        if (obj instanceof gc.e) {
            return 13;
        }
        if (obj instanceof gc.f) {
            return 14;
        }
        if (obj instanceof gc.g) {
            return 15;
        }
        if (obj instanceof gc.h) {
            return 16;
        }
        if (obj instanceof gc.i) {
            return 17;
        }
        if (obj instanceof gc.j) {
            return 18;
        }
        if (obj instanceof gc.k) {
            return 19;
        }
        if (obj instanceof gc.m) {
            return 20;
        }
        if (obj instanceof gc.n) {
            return 21;
        }
        return obj instanceof gc.o ? 22 : -1;
    }

    public static boolean i(Object obj, int i10) {
        return (obj instanceof tb.g) && h(obj) == i10;
    }

    public static boolean j(Object obj) {
        return (obj instanceof List) && (!(obj instanceof ic.a) || (obj instanceof ic.c));
    }

    public static boolean k(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof ic.a) || (obj instanceof ic.d));
    }

    private static <T extends Throwable> T l(T t10) {
        return (T) t.k(t10, q0.class.getName());
    }

    public static ClassCastException m(ClassCastException classCastException) {
        throw ((ClassCastException) l(classCastException));
    }

    public static void n(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        o(name + " cannot be cast to " + str);
    }

    public static void o(String str) {
        throw m(new ClassCastException(str));
    }
}
