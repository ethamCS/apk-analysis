package androidx.lifecycle;

import androidx.lifecycle.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
final class c {

    /* renamed from: c */
    static c f4303c = new c();

    /* renamed from: a */
    private final Map<Class<?>, a> f4304a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4305b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map<m.b, List<b>> f4306a = new HashMap();

        /* renamed from: b */
        final Map<b, m.b> f4307b;

        a(Map<b, m.b> map) {
            this.f4307b = map;
            for (Map.Entry<b, m.b> entry : map.entrySet()) {
                m.b value = entry.getValue();
                List<b> list = this.f4306a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4306a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, v vVar, m.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(vVar, bVar, obj);
                }
            }
        }

        public void a(v vVar, m.b bVar, Object obj) {
            b(this.f4306a.get(bVar), vVar, bVar, obj);
            b(this.f4306a.get(m.b.ON_ANY), vVar, bVar, obj);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f4308a;

        /* renamed from: b */
        final Method f4309b;

        b(int i10, Method method) {
            this.f4308a = i10;
            this.f4309b = method;
            method.setAccessible(true);
        }

        void a(v vVar, m.b bVar, Object obj) {
            try {
                int i10 = this.f4308a;
                if (i10 == 0) {
                    this.f4309b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f4309b.invoke(obj, vVar);
                } else if (i10 != 2) {
                } else {
                    this.f4309b.invoke(obj, vVar, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4308a == bVar.f4308a && this.f4309b.getName().equals(bVar.f4309b.getName());
        }

        public int hashCode() {
            return (this.f4308a * 31) + this.f4309b.getName().hashCode();
        }
    }

    c() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f4307b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, m.b> entry : c(cls2).f4307b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            f0 f0Var = (f0) method.getAnnotation(f0.class);
            if (f0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(v.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                m.b value = f0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(m.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != m.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f4304a.put(cls, aVar);
        this.f4305b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, m.b> map, b bVar, m.b bVar2, Class<?> cls) {
        m.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 != null) {
                return;
            }
            map.put(bVar, bVar2);
            return;
        }
        Method method = bVar.f4309b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    public a c(Class<?> cls) {
        a aVar = this.f4304a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f4305b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((f0) method.getAnnotation(f0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f4305b.put(cls, Boolean.FALSE);
        return false;
    }
}
