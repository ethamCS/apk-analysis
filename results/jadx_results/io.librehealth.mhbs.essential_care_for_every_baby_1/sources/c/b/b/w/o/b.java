package c.b.b.w.o;

import c.b.b.w.e;
import java.lang.reflect.AccessibleObject;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private static final b f586a;

    static {
        f586a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f586a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
