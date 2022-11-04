package d.a.b.w;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends m {

        /* renamed from: a */
        final /* synthetic */ Method f3808a;

        /* renamed from: b */
        final /* synthetic */ Object f3809b;

        a(Method method, Object obj) {
            this.f3808a = method;
            this.f3809b = obj;
        }

        @Override // d.a.b.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f3808a.invoke(this.f3809b, cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: a */
        final /* synthetic */ Method f3810a;

        /* renamed from: b */
        final /* synthetic */ int f3811b;

        b(Method method, int i) {
            this.f3810a = method;
            this.f3811b = i;
        }

        @Override // d.a.b.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f3810a.invoke(null, cls, Integer.valueOf(this.f3811b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends m {

        /* renamed from: a */
        final /* synthetic */ Method f3812a;

        c(Method method) {
            this.f3812a = method;
        }

        @Override // d.a.b.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f3812a.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends m {
        d() {
        }

        @Override // d.a.b.w.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (!Modifier.isAbstract(modifiers)) {
        } else {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}
