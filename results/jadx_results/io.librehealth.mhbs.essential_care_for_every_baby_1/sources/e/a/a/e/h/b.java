package e.a.a.e.h;

import android.content.Context;
import e.a.a.g.k;
import e.a.a.g.m;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class b {
    public static <T> T c(Map<String, Object> map, String str, Class<T> cls, T[] tArr) {
        String str2 = (String) k.b(map, str, String.class).d();
        T t = (T) k.b(e.a.a.c.f726a, str, cls).d();
        if (str2 == null) {
            return t;
        }
        for (T t2 : tArr) {
            if (t2.toString().toLowerCase().equals(str2.toLowerCase())) {
                return t2;
            }
        }
        return t;
    }

    public static <T> T d(Map<String, Object> map, String str, Class<T> cls) {
        T t = (T) k.b(map, str, cls).d();
        return t != null ? t : (T) k.b(e.a.a.c.f726a, str, cls).d();
    }

    public abstract b a(String str);

    public abstract b b(Map<String, Object> map);

    public b e(String str) {
        if (m.c(str).booleanValue()) {
            return null;
        }
        return b(e.a.a.g.i.a(str));
    }

    public String f() {
        return e.a.a.g.i.b(h());
    }

    public abstract String g();

    public abstract Map<String, Object> h();

    public abstract void i(Context context);
}
