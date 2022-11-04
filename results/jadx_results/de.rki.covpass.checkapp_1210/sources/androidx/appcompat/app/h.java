package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
class h {

    /* renamed from: a */
    private static Field f797a;

    /* renamed from: b */
    private static boolean f798b;

    /* renamed from: c */
    private static Class<?> f799c;

    /* renamed from: d */
    private static boolean f800d;

    /* renamed from: e */
    private static Field f801e;

    /* renamed from: f */
    private static boolean f802f;

    /* renamed from: g */
    private static Field f803g;

    /* renamed from: h */
    private static boolean f804h;

    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f798b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f797a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f798b = true;
        }
        Object obj = null;
        Field field = f797a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        d(obj);
    }

    private static void c(Resources resources) {
        Object obj;
        if (!f804h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f803g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f804h = true;
        }
        Field field = f803g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f798b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f797a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f798b = true;
        }
        Field field2 = f797a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 == null) {
            return;
        }
        d(obj2);
    }

    private static void d(Object obj) {
        if (!f800d) {
            try {
                f799c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f800d = true;
        }
        Class<?> cls = f799c;
        if (cls == null) {
            return;
        }
        if (!f802f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f801e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f802f = true;
        }
        Field field = f801e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray == null) {
            return;
        }
        longSparseArray.clear();
    }
}
