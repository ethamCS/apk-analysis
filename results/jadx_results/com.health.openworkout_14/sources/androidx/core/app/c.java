package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    protected static final Class<?> f878a;

    /* renamed from: d */
    protected static final Method f881d;

    /* renamed from: e */
    protected static final Method f882e;

    /* renamed from: f */
    protected static final Method f883f;

    /* renamed from: g */
    private static final Handler f884g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    protected static final Field f879b = b();

    /* renamed from: c */
    protected static final Field f880c = f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ d f885b;

        /* renamed from: c */
        final /* synthetic */ Object f886c;

        a(d dVar, Object obj) {
            this.f885b = dVar;
            this.f886c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f885b.f891a = this.f886c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Application f887b;

        /* renamed from: c */
        final /* synthetic */ d f888c;

        b(Application application, d dVar) {
            this.f887b = application;
            this.f888c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f887b.unregisterActivityLifecycleCallbacks(this.f888c);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0015c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f889b;

        /* renamed from: c */
        final /* synthetic */ Object f890c;

        RunnableC0015c(Object obj, Object obj2) {
            this.f889b = obj;
            this.f890c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = c.f881d;
                if (method != null) {
                    method.invoke(this.f889b, this.f890c, bool, "AppCompat recreation");
                } else {
                    c.f882e.invoke(this.f889b, this.f890c, bool);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f891a;

        /* renamed from: b */
        private Activity f892b;

        /* renamed from: c */
        private boolean f893c = false;

        /* renamed from: d */
        private boolean f894d = false;

        /* renamed from: e */
        private boolean f895e = false;

        d(Activity activity) {
            this.f892b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f892b == activity) {
                this.f892b = null;
                this.f894d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f894d || this.f895e || this.f893c || !c.h(this.f891a, activity)) {
                return;
            }
            this.f895e = true;
            this.f891a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f892b == activity) {
                this.f893c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a2 = a();
        f878a = a2;
        f881d = d(a2);
        f882e = c(a2);
        f883f = e(a2);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = f880c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f884g.postAtFrontOfQueue(new RunnableC0015c(f879b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f883f == null) {
            return false;
        } else {
            if (f882e == null && f881d == null) {
                return false;
            }
            try {
                Object obj2 = f880c.get(activity);
                if (obj2 == null || (obj = f879b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f884g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f883f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
