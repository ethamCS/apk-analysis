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
public final class d {

    /* renamed from: a */
    protected static final Class<?> f3352a;

    /* renamed from: d */
    protected static final Method f3355d;

    /* renamed from: e */
    protected static final Method f3356e;

    /* renamed from: f */
    protected static final Method f3357f;

    /* renamed from: g */
    private static final Handler f3358g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    protected static final Field f3353b = b();

    /* renamed from: c */
    protected static final Field f3354c = f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C0028d f3359c;

        /* renamed from: d */
        final /* synthetic */ Object f3360d;

        a(C0028d c0028d, Object obj) {
            this.f3359c = c0028d;
            this.f3360d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3359c.f3365a = this.f3360d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Application f3361c;

        /* renamed from: d */
        final /* synthetic */ C0028d f3362d;

        b(Application application, C0028d c0028d) {
            this.f3361c = application;
            this.f3362d = c0028d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3361c.unregisterActivityLifecycleCallbacks(this.f3362d);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Object f3363c;

        /* renamed from: d */
        final /* synthetic */ Object f3364d;

        c(Object obj, Object obj2) {
            this.f3363c = obj;
            this.f3364d = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f3355d;
                if (method != null) {
                    method.invoke(this.f3363c, this.f3364d, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f3356e.invoke(this.f3363c, this.f3364d, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.d$d */
    /* loaded from: classes.dex */
    public static final class C0028d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f3365a;

        /* renamed from: b */
        private Activity f3366b;

        /* renamed from: c */
        private final int f3367c;

        /* renamed from: d */
        private boolean f3368d = false;

        /* renamed from: e */
        private boolean f3369e = false;

        /* renamed from: f */
        private boolean f3370f = false;

        C0028d(Activity activity) {
            this.f3366b = activity;
            this.f3367c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3366b == activity) {
                this.f3366b = null;
                this.f3369e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3369e || this.f3370f || this.f3368d || !d.h(this.f3365a, this.f3367c, activity)) {
                return;
            }
            this.f3370f = true;
            this.f3365a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3366b == activity) {
                this.f3368d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f3352a = a10;
        f3355d = d(a10);
        f3356e = c(a10);
        f3357f = e(a10);
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
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3354c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3358g.postAtFrontOfQueue(new c(f3353b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f3357f == null) {
            return false;
        } else {
            if (f3356e == null && f3355d == null) {
                return false;
            }
            try {
                Object obj2 = f3354c.get(activity);
                if (obj2 == null || (obj = f3353b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0028d c0028d = new C0028d(activity);
                application.registerActivityLifecycleCallbacks(c0028d);
                Handler handler = f3358g;
                handler.post(new a(c0028d, obj2));
                if (g()) {
                    Method method = f3357f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0028d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
