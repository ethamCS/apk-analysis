package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class a {

    /* renamed from: c */
    static a f1222c = new a();

    /* renamed from: a */
    private final Map<Class<?>, C0019a> f1223a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f1224b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0019a {

        /* renamed from: a */
        final Map<e.a, List<b>> f1225a = new HashMap();

        /* renamed from: b */
        final Map<b, e.a> f1226b;

        C0019a(Map<b, e.a> map) {
            this.f1226b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f1225a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1225a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, i iVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, aVar, obj);
                }
            }
        }

        public void a(i iVar, e.a aVar, Object obj) {
            b(this.f1225a.get(aVar), iVar, aVar, obj);
            b(this.f1225a.get(e.a.ON_ANY), iVar, aVar, obj);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int f1227a;

        /* renamed from: b */
        final Method f1228b;

        b(int i, Method method) {
            this.f1227a = i;
            this.f1228b = method;
            method.setAccessible(true);
        }

        void a(i iVar, e.a aVar, Object obj) {
            try {
                int i = this.f1227a;
                if (i == 0) {
                    this.f1228b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1228b.invoke(obj, iVar);
                } else if (i != 2) {
                } else {
                    this.f1228b.invoke(obj, iVar, aVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1227a == bVar.f1227a && this.f1228b.getName().equals(bVar.f1228b.getName());
        }

        public int hashCode() {
            return (this.f1227a * 31) + this.f1228b.getName().hashCode();
        }
    }

    a() {
    }

    private C0019a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0019a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.f1226b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : c(cls2).f1226b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            p pVar = (p) method.getAnnotation(p.class);
            if (pVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(i.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                e.a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0019a c0019a = new C0019a(hashMap);
        this.f1223a.put(cls, c0019a);
        this.f1224b.put(cls, Boolean.valueOf(z));
        return c0019a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, e.a> map, b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 != null) {
                return;
            }
            map.put(bVar, aVar);
            return;
        }
        Method method = bVar.f1228b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public C0019a c(Class<?> cls) {
        C0019a c0019a = this.f1223a.get(cls);
        return c0019a != null ? c0019a : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f1224b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method method : b2) {
            if (((p) method.getAnnotation(p.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f1224b.put(cls, Boolean.FALSE);
        return false;
    }
}
