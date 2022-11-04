package c.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public final class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static Application f2863a;

    /* renamed from: b */
    private static c.a.a.h.a f2864b = new c.a.a.h.a();

    /* renamed from: c */
    private static final Deque<String> f2865c = new ArrayDeque(50);

    /* renamed from: d */
    private static WeakReference<Activity> f2866d = new WeakReference<>(null);

    /* renamed from: e */
    private static boolean f2867e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.a.a.a$a */
    /* loaded from: classes.dex */
    public static class C0069a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f2868a;

        C0069a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2868a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
            if (!a.f2864b.j()) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f2868a;
                if (uncaughtExceptionHandler2 == null) {
                    return;
                }
                uncaughtExceptionHandler2.uncaughtException(thread, th);
                return;
            }
            Log.e("CustomActivityOnCrash", "App has crashed, executing CustomActivityOnCrash's UncaughtExceptionHandler", th);
            if (a.C(a.f2863a)) {
                Log.e("CustomActivityOnCrash", "App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?", th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f2868a;
                if (uncaughtExceptionHandler3 != null) {
                    uncaughtExceptionHandler3.uncaughtException(thread, th);
                    return;
                }
            } else {
                a.I(a.f2863a, new Date().getTime());
                Class<? extends Activity> e2 = a.f2864b.e();
                if (e2 == null) {
                    e2 = a.A(a.f2863a);
                }
                if (a.E(th, e2)) {
                    Log.e("CustomActivityOnCrash", "Your application class or your error activity have crashed, the custom activity will not be launched!");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f2868a;
                    if (uncaughtExceptionHandler4 != null) {
                        uncaughtExceptionHandler4.uncaughtException(thread, th);
                        return;
                    }
                } else if (a.f2864b.a() == 1 || !a.f2867e) {
                    Intent intent = new Intent(a.f2863a, e2);
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    if (stringWriter2.length() > 131071) {
                        stringWriter2 = stringWriter2.substring(0, 131047) + " [stack trace too large]";
                    }
                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", stringWriter2);
                    if (a.f2864b.n()) {
                        StringBuilder sb = new StringBuilder();
                        while (!a.f2865c.isEmpty()) {
                            sb.append((String) a.f2865c.poll());
                        }
                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG", sb.toString());
                    }
                    if (a.f2864b.m() && a.f2864b.i() == null) {
                        a.f2864b.o(a.B(a.f2863a));
                    }
                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", a.f2864b);
                    intent.setFlags(268468224);
                    if (a.f2864b.g() != null) {
                        a.f2864b.g().b();
                    }
                    a.f2863a.startActivity(intent);
                } else if (a.f2864b.a() == 2 && (uncaughtExceptionHandler = this.f2868a) != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
            }
            Activity activity = (Activity) a.f2866d.get();
            if (activity != null) {
                activity.finish();
                a.f2866d.clear();
            }
            a.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        int f2869a = 0;

        /* renamed from: b */
        final DateFormat f2870b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass() != a.f2864b.e()) {
                WeakReference unused = a.f2866d = new WeakReference(activity);
            }
            if (a.f2864b.n()) {
                Deque deque = a.f2865c;
                deque.add(this.f2870b.format(new Date()) + ": " + activity.getClass().getSimpleName() + " created\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (a.f2864b.n()) {
                Deque deque = a.f2865c;
                deque.add(this.f2870b.format(new Date()) + ": " + activity.getClass().getSimpleName() + " destroyed\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (a.f2864b.n()) {
                Deque deque = a.f2865c;
                deque.add(this.f2870b.format(new Date()) + ": " + activity.getClass().getSimpleName() + " paused\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (a.f2864b.n()) {
                Deque deque = a.f2865c;
                deque.add(this.f2870b.format(new Date()) + ": " + activity.getClass().getSimpleName() + " resumed\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            boolean z = true;
            int i = this.f2869a + 1;
            this.f2869a = i;
            if (i != 0) {
                z = false;
            }
            boolean unused = a.f2867e = z;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean z = true;
            int i = this.f2869a - 1;
            this.f2869a = i;
            if (i != 0) {
                z = false;
            }
            boolean unused = a.f2867e = z;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Serializable {
        void b();

        void c();

        void d();
    }

    public static Class<? extends Activity> A(Context context) {
        Class<? extends Activity> u = u(context);
        return u == null ? DefaultErrorActivity.class : u;
    }

    public static Class<? extends Activity> B(Context context) {
        Class<? extends Activity> x = x(context);
        return x == null ? w(context) : x;
    }

    public static boolean C(Context context) {
        long v = v(context);
        long time = new Date().getTime();
        return v <= time && time - v < ((long) f2864b.h());
    }

    public static void D(Context context) {
        try {
            if (context == null) {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
                return;
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                    Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                }
                f2863a = (Application) context.getApplicationContext();
                Thread.setDefaultUncaughtExceptionHandler(new C0069a(defaultUncaughtExceptionHandler));
                f2863a.registerActivityLifecycleCallbacks(new b());
            } else {
                Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
            }
            Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
        } catch (Throwable th) {
            Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th);
        }
    }

    public static boolean E(Throwable th, Class<? extends Activity> cls) {
        StackTraceElement[] stackTrace;
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ((stackTraceElement.getClassName().equals("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("handleBindApplication")) || stackTraceElement.getClassName().equals(cls.getName())) {
                    return true;
                }
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    public static void F() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public static void G(Activity activity, c.a.a.h.a aVar) {
        H(activity, new Intent(activity, aVar.i()), aVar);
    }

    public static void H(Activity activity, Intent intent, c.a.a.h.a aVar) {
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if (aVar.g() != null) {
            aVar.g().d();
        }
        activity.finish();
        activity.startActivity(intent);
        F();
    }

    @SuppressLint({"ApplySharedPref"})
    public static void I(Context context, long j) {
        context.getSharedPreferences("custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", j).commit();
    }

    private static String n(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static void o(Activity activity, c.a.a.h.a aVar) {
        if (aVar.g() != null) {
            aVar.g().c();
        }
        activity.finish();
        F();
    }

    public static String p(Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
    }

    public static String q(Context context, Intent intent) {
        SimpleDateFormat simpleDateFormat;
        Date date = new Date();
        String r = r(context, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US));
        String str = "Build version: " + z(context) + " \n";
        if (r != null) {
            str = str + "Build date: " + r + " \n";
        }
        String str2 = (((str + "Current date: " + simpleDateFormat.format(date) + " \n") + "Device: " + t() + " \n \n") + "Stack trace:  \n") + y(intent);
        String p = p(intent);
        if (p != null) {
            return (str2 + "\nUser actions: \n") + p;
        }
        return str2;
    }

    private static String r(Context context, DateFormat dateFormat) {
        long j;
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            j = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            j = 0;
        }
        if (j > 312764400000L) {
            return dateFormat.format(new Date(j));
        }
        return null;
    }

    public static c.a.a.h.a s(Intent intent) {
        c.a.a.h.a aVar = (c.a.a.h.a) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (aVar.k() && y(intent) != null) {
            Log.e("CustomActivityOnCrash", "The previous app process crashed. This is the stack trace of the crash:\n" + y(intent));
        }
        return aVar;
    }

    private static String t() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return n(str2);
        }
        return n(str) + " " + str2;
    }

    private static Class<? extends Activity> u(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        try {
            return Class.forName(queryIntentActivities.get(0).activityInfo.name);
        } catch (ClassNotFoundException e2) {
            Log.e("CustomActivityOnCrash", "Failed when resolving the error activity class via intent filter, stack trace follows!", e2);
            return null;
        }
    }

    private static long v(Context context) {
        return context.getSharedPreferences("custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1L);
    }

    private static Class<? extends Activity> w(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
            return null;
        }
        try {
            return Class.forName(launchIntentForPackage.getComponent().getClassName());
        } catch (ClassNotFoundException e2) {
            Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!", e2);
            return null;
        }
    }

    private static Class<? extends Activity> x(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        try {
            return Class.forName(queryIntentActivities.get(0).activityInfo.name);
        } catch (ClassNotFoundException e2) {
            Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via intent filter, stack trace follows!", e2);
            return null;
        }
    }

    public static String y(Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
    }

    private static String z(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "Unknown";
        }
    }
}
