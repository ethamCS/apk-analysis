package t3;

import a3.d;
import b3.c;
import b3.e;
import b3.f;
import b3.i;
import b3.j;
import c4.g;
import c4.h;
import c4.k;
import c4.l;
import c4.q;
import y3.b;
/* loaded from: classes.dex */
public class a {
    public static <T extends q<T>> d<T> a(Class<T> cls, b bVar) {
        d<T> dVar;
        if (cls == c4.a.class) {
            dVar = new b3.a();
        } else if (cls == c4.b.class) {
            dVar = new b3.b();
        } else if (cls == l.class) {
            dVar = new f();
        } else if (cls == k.class) {
            dVar = new e();
        } else if (cls == g.class) {
            dVar = new c();
        } else if (cls != h.class) {
            String c10 = c(cls);
            throw new RuntimeException("Unknown image type: " + c10);
        } else {
            dVar = new b3.d();
        }
        if (bVar != null) {
            dVar.a(n3.g.a(bVar, cls));
        }
        return dVar;
    }

    public static <T extends q<T>> d<T> b(Class<T> cls) {
        if (cls == c4.a.class) {
            return new b3.g();
        }
        if (cls == l.class) {
            return new b3.k();
        }
        if (cls == g.class) {
            return new b3.h();
        }
        if (cls == k.class) {
            return new j();
        }
        if (cls == h.class) {
            return new i();
        }
        String c10 = c(cls);
        throw new RuntimeException("Unknown image type: " + c10);
    }

    private static String c(Class cls) {
        return cls == null ? "null" : cls.getName();
    }
}
