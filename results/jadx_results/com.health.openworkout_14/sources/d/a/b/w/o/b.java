package d.a.b.w.o;

import d.a.b.w.e;
import java.lang.reflect.AccessibleObject;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private static final b f3885a;

    static {
        f3885a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f3885a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
