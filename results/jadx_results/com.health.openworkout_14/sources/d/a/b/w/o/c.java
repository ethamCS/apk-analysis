package d.a.b.w.o;

import d.a.b.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: d */
    private static Class f3886d;

    /* renamed from: b */
    private final Object f3887b = d();

    /* renamed from: c */
    private final Field f3888c = c();

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
            f3886d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // d.a.b.w.o.b
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
        if (this.f3887b != null && this.f3888c != null) {
            try {
                f3886d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f3887b, accessibleObject, Long.valueOf(((Long) f3886d.getMethod("objectFieldOffset", Field.class).invoke(this.f3887b, this.f3888c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
