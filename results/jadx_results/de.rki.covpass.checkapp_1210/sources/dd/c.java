package dd;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f8482a = new c();

    /* renamed from: b */
    private static a f8483b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Method f8484a;

        /* renamed from: b */
        private final Method f8485b;

        public a(Method method, Method method2) {
            this.f8484a = method;
            this.f8485b = method2;
        }

        public final Method a() {
            return this.f8485b;
        }

        public final Method b() {
            return this.f8484a;
        }
    }

    private c() {
    }

    public final a a(Member member) {
        hc.t.e(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), d.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List<String> b(Member member) {
        Method a10;
        hc.t.e(member, "member");
        a aVar = f8483b;
        if (aVar == null) {
            synchronized (this) {
                c cVar = f8482a;
                a aVar2 = f8483b;
                if (aVar2 == null) {
                    aVar = cVar.a(member);
                    f8483b = aVar;
                } else {
                    aVar = aVar2;
                }
            }
        }
        Method b10 = aVar.b();
        if (b10 == null || (a10 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b10.invoke(member, new Object[0]);
        hc.t.c(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a10.invoke(obj, new Object[0]);
            hc.t.c(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
