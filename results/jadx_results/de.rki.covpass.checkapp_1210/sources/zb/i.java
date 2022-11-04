package zb;

import hc.t;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lzb/i;", BuildConfig.FLAVOR, "Lzb/a;", "continuation", "Lzb/i$a;", "a", BuildConfig.FLAVOR, "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final i f26594a = new i();

    /* renamed from: b */
    private static final a f26595b = new a(null, null, null);

    /* renamed from: c */
    private static a f26596c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzb/i$a;", BuildConfig.FLAVOR, "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f26597a;

        /* renamed from: b */
        public final Method f26598b;

        /* renamed from: c */
        public final Method f26599c;

        public a(Method method, Method method2, Method method3) {
            this.f26597a = method;
            this.f26598b = method2;
            this.f26599c = method3;
        }
    }

    private i() {
    }

    private final a a(zb.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f26596c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f26595b;
            f26596c = aVar3;
            return aVar3;
        }
    }

    public final String b(zb.a aVar) {
        t.e(aVar, "continuation");
        a aVar2 = f26596c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f26595b) {
            return null;
        }
        Method method = aVar2.f26597a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f26598b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f26599c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (!(invoke3 instanceof String)) {
            return null;
        }
        return (String) invoke3;
    }
}
