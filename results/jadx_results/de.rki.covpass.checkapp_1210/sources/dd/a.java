package dd;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class a {

    /* renamed from: a */
    public static final a f8467a = new a();

    /* renamed from: b */
    private static C0131a f8468b;

    /* renamed from: dd.a$a */
    /* loaded from: classes.dex */
    public static final class C0131a {

        /* renamed from: a */
        private final Method f8469a;

        /* renamed from: b */
        private final Method f8470b;

        public C0131a(Method method, Method method2) {
            this.f8469a = method;
            this.f8470b = method2;
        }

        public final Method a() {
            return this.f8470b;
        }

        public final Method b() {
            return this.f8469a;
        }
    }

    private a() {
    }

    private final C0131a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0131a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C0131a(null, null);
        }
    }

    private final C0131a b(Object obj) {
        C0131a c0131a = f8468b;
        if (c0131a == null) {
            C0131a a10 = a(obj);
            f8468b = a10;
            return a10;
        }
        return c0131a;
    }

    public final Method c(Object obj) {
        hc.t.e(obj, "recordComponent");
        Method a10 = b(obj).a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(obj, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public final Class<?> d(Object obj) {
        hc.t.e(obj, "recordComponent");
        Method b10 = b(obj).b();
        if (b10 == null) {
            return null;
        }
        Object invoke = b10.invoke(obj, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
