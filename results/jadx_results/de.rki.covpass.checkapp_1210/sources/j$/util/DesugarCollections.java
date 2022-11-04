package j$.util;

import j$.util.List;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f13230a;

    /* renamed from: b */
    static final Class f13231b = Collections.synchronizedList(new LinkedList()).getClass();

    /* renamed from: c */
    private static final Field f13232c;

    /* renamed from: d */
    private static final Field f13233d;

    /* renamed from: e */
    private static final Constructor f13234e;

    /* renamed from: f */
    private static final Constructor f13235f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f13230a = cls;
        Constructor constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f13232c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = f13230a.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f13233d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f13235f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = f13230a.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f13234e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    public static void c(Iterable iterable, Consumer consumer) {
        Field field = f13232c;
        if (field == null) {
            try {
                Collection$EL.a((Collection) f13233d.get(iterable), consumer);
                return;
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(iterable)) {
                Collection$EL.a((Collection) f13233d.get(iterable), consumer);
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection forEach.", e11);
        }
    }

    public static boolean d(Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f13232c;
        if (field == null) {
            try {
                return Collection$EL.removeIf((Collection) f13233d.get(collection), predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                removeIf = Collection$EL.removeIf((Collection) f13233d.get(collection), predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    public static void e(java.util.List list, java.util.Comparator comparator) {
        Field field = f13232c;
        if (field == null) {
            try {
                List.EL.sort((java.util.List) f13233d.get(list), comparator);
                return;
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(list)) {
                List.EL.sort((java.util.List) f13233d.get(list), comparator);
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized list sort.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0497e(map);
    }
}
