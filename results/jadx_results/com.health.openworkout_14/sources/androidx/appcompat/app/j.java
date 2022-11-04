package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* loaded from: classes.dex */
class j {

    /* renamed from: a */
    private static Field f192a;

    /* renamed from: b */
    private static boolean f193b;

    /* renamed from: c */
    private static Class<?> f194c;

    /* renamed from: d */
    private static boolean f195d;

    /* renamed from: e */
    private static Field f196e;

    /* renamed from: f */
    private static boolean f197f;

    /* renamed from: g */
    private static Field f198g;

    /* renamed from: h */
    private static boolean f199h;

    public static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            d(resources);
        } else if (i >= 23) {
            c(resources);
        } else if (i < 21) {
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f193b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f192a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f193b = true;
        }
        Field field = f192a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map == null) {
                return;
            }
            map.clear();
        }
    }

    private static void c(Resources resources) {
        if (!f193b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f192a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f193b = true;
        }
        Object obj = null;
        Field field = f192a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f199h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f198g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f199h = true;
        }
        Field field = f198g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f193b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f192a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f193b = true;
        }
        Field field2 = f192a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 == null) {
            return;
        }
        e(obj2);
    }

    private static void e(Object obj) {
        if (!f195d) {
            try {
                f194c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f195d = true;
        }
        Class<?> cls = f194c;
        if (cls == null) {
            return;
        }
        if (!f197f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f196e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f197f = true;
        }
        Field field = f196e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray == null) {
            return;
        }
        longSparseArray.clear();
    }
}
