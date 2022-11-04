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
    static a f977c = new a();

    /* renamed from: a */
    private final Map<Class, C0041a> f978a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Boolean> f979b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0041a {

        /* renamed from: a */
        final Map<e.a, List<b>> f980a = new HashMap();

        /* renamed from: b */
        final Map<b, e.a> f981b;

        C0041a(Map<b, e.a> map) {
            this.f981b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f980a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f980a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(hVar, aVar, obj);
                }
            }
        }

        public void a(h hVar, e.a aVar, Object obj) {
            a(this.f980a.get(aVar), hVar, aVar, obj);
            a(this.f980a.get(e.a.ON_ANY), hVar, aVar, obj);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int f982a;

        /* renamed from: b */
        final Method f983b;

        b(int i, Method method) {
            this.f982a = i;
            this.f983b = method;
            method.setAccessible(true);
        }

        void a(h hVar, e.a aVar, Object obj) {
            try {
                int i = this.f982a;
                if (i == 0) {
                    this.f983b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f983b.invoke(obj, hVar);
                } else if (i != 2) {
                } else {
                    this.f983b.invoke(obj, hVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
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
            return this.f982a == bVar.f982a && this.f983b.getName().equals(bVar.f983b.getName());
        }

        public int hashCode() {
            return (this.f982a * 31) + this.f983b.getName().hashCode();
        }
    }

    a() {
    }

    private C0041a a(Class cls, Method[] methodArr) {
        int i;
        C0041a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (a2 = a(superclass)) != null) {
            hashMap.putAll(a2.f981b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : a(cls2).f981b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(h.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                e.a value = oVar.value();
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
                a(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0041a c0041a = new C0041a(hashMap);
        this.f978a.put(cls, c0041a);
        this.f979b.put(cls, Boolean.valueOf(z));
        return c0041a;
    }

    private void a(Map<b, e.a> map, b bVar, e.a aVar, Class cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 != null) {
                return;
            }
            map.put(bVar, aVar);
            return;
        }
        Method method = bVar.f983b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public C0041a a(Class cls) {
        C0041a c0041a = this.f978a.get(cls);
        return c0041a != null ? c0041a : a(cls, null);
    }

    public boolean b(Class cls) {
        Boolean bool = this.f979b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((o) method.getAnnotation(o.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f979b.put(cls, false);
        return false;
    }
}
