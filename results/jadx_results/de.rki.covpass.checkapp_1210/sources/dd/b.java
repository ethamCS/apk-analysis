package dd;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    public static final b f8472a = new b();

    /* renamed from: b */
    private static a f8473b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Method f8474a;

        /* renamed from: b */
        private final Method f8475b;

        /* renamed from: c */
        private final Method f8476c;

        /* renamed from: d */
        private final Method f8477d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f8474a = method;
            this.f8475b = method2;
            this.f8476c = method3;
            this.f8477d = method4;
        }

        public final Method a() {
            return this.f8475b;
        }

        public final Method b() {
            return this.f8477d;
        }

        public final Method c() {
            return this.f8476c;
        }

        public final Method d() {
            return this.f8474a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f8473b;
        if (aVar == null) {
            a a10 = a();
            f8473b = a10;
            return a10;
        }
        return aVar;
    }

    public final Class<?>[] c(Class<?> cls) {
        hc.t.e(cls, "clazz");
        Method a10 = b().a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(cls, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    public final Object[] d(Class<?> cls) {
        hc.t.e(cls, "clazz");
        Method b10 = b().b();
        if (b10 == null) {
            return null;
        }
        return (Object[]) b10.invoke(cls, new Object[0]);
    }

    public final Boolean e(Class<?> cls) {
        hc.t.e(cls, "clazz");
        Method c10 = b().c();
        if (c10 == null) {
            return null;
        }
        Object invoke = c10.invoke(cls, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    public final Boolean f(Class<?> cls) {
        hc.t.e(cls, "clazz");
        Method d10 = b().d();
        if (d10 == null) {
            return null;
        }
        Object invoke = d10.invoke(cls, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
