package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.b;
import o1.c;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    private static volatile a f5038d;

    /* renamed from: e */
    private static final Object f5039e = new Object();

    /* renamed from: c */
    final Context f5042c;

    /* renamed from: b */
    final Set<Class<? extends o1.a<?>>> f5041b = new HashSet();

    /* renamed from: a */
    final Map<Class<?>, Object> f5040a = new HashMap();

    a(Context context) {
        this.f5042c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends o1.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (p1.a.d()) {
            try {
                p1.a.a(cls.getSimpleName());
            } finally {
                p1.a.b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f5040a.containsKey(cls)) {
                set.add(cls);
                o1.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends o1.a<?>>> a10 = newInstance.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends o1.a<?>> cls2 : a10) {
                        if (!this.f5040a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.b(this.f5042c);
                set.remove(cls);
                this.f5040a.put(cls, t10);
            } else {
                t10 = (T) this.f5040a.get(cls);
            }
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public static a e(Context context) {
        if (f5038d == null) {
            synchronized (f5039e) {
                if (f5038d == null) {
                    f5038d = new a(context);
                }
            }
        }
        return f5038d;
    }

    public void a() {
        try {
            try {
                p1.a.a("Startup");
                b(this.f5042c.getPackageManager().getProviderInfo(new ComponentName(this.f5042c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            p1.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f5042c.getString(b.a_res_0x7f1000a6);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (o1.a.class.isAssignableFrom(cls)) {
                            this.f5041b.add(cls);
                        }
                    }
                }
                for (Class<? extends o1.a<?>> cls2 : this.f5041b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    <T> T c(Class<? extends o1.a<?>> cls) {
        T t10;
        synchronized (f5039e) {
            t10 = (T) this.f5040a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends o1.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends o1.a<?>> cls) {
        return this.f5041b.contains(cls);
    }
}
