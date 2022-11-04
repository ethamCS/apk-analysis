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
final class b {
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    protected static final Class<?> f830a = a();

    /* renamed from: b */
    protected static final Field f831b = b();

    /* renamed from: c */
    protected static final Field f832c = c();
    protected static final Method d = b(f830a);
    protected static final Method e = a(f830a);
    protected static final Method f = c(f830a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ d f833b;

        /* renamed from: c */
        final /* synthetic */ Object f834c;

        a(d dVar, Object obj) {
            this.f833b = dVar;
            this.f834c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f833b.f839a = this.f834c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    public static class RunnableC0038b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Application f835b;

        /* renamed from: c */
        final /* synthetic */ d f836c;

        RunnableC0038b(Application application, d dVar) {
            this.f835b = application;
            this.f836c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f835b.unregisterActivityLifecycleCallbacks(this.f836c);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f837b;

        /* renamed from: c */
        final /* synthetic */ Object f838c;

        c(Object obj, Object obj2) {
            this.f837b = obj;
            this.f838c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.d != null) {
                    b.d.invoke(this.f837b, this.f838c, false, "AppCompat recreation");
                } else {
                    b.e.invoke(this.f837b, this.f838c, false);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
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
        Object f839a;

        /* renamed from: b */
        private Activity f840b;

        /* renamed from: c */
        private boolean f841c = false;
        private boolean d = false;
        private boolean e = false;

        d(Activity activity) {
            this.f840b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f840b == activity) {
                this.f840b = null;
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.d || this.e || this.f841c || !b.a(this.f839a, activity)) {
                return;
            }
            this.e = true;
            this.f839a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f840b == activity) {
                this.f841c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
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

    public static boolean a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (d() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = f832c.get(activity);
                if (obj2 == null || (obj = f831b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                g.post(new a(dVar, obj2));
                if (d()) {
                    f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                g.post(new RunnableC0038b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = f832c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new c(f831b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
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

    private static Method b(Class<?> cls) {
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

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
