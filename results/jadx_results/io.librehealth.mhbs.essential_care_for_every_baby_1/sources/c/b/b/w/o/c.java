package c.b.b.w.o;

import c.b.b.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: d */
    private static Class f587d;

    /* renamed from: b */
    private final Object f588b = d();

    /* renamed from: c */
    private final Field f589c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f587d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c.b.b.w.o.b
    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f588b != null && this.f589c != null) {
            try {
                f587d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f588b, accessibleObject, Long.valueOf(((Long) f587d.getMethod("objectFieldOffset", Field.class).invoke(this.f588b, this.f589c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
