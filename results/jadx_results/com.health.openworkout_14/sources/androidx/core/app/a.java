package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
/* loaded from: classes.dex */
public class a extends b.g.d.a {

    /* renamed from: c */
    private static c f874c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0014a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String[] f875b;

        /* renamed from: c */
        final /* synthetic */ Activity f876c;

        /* renamed from: d */
        final /* synthetic */ int f877d;

        RunnableC0014a(String[] strArr, Activity activity, int i) {
            this.f875b = strArr;
            this.f876c = activity;
            this.f877d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f875b.length];
            PackageManager packageManager = this.f876c.getPackageManager();
            String packageName = this.f876c.getPackageName();
            int length = this.f875b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f875b[i], packageName);
            }
            ((b) this.f876c).onRequestPermissionsResult(this.f877d, this.f875b, iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Activity activity, String[] strArr, int i);

        boolean b(Activity activity, int i, int i2, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface d {
        void b(int i);
    }

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c g() {
        return f874c;
    }

    public static void h(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && androidx.core.app.c.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void i(Activity activity, String[] strArr, int i) {
        c cVar = f874c;
        if (cVar == null || !cVar.a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).b(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (!(activity instanceof b)) {
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC0014a(strArr, activity, i));
            }
        }
    }

    public static <T extends View> T j(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i);
        }
        T t = (T) activity.findViewById(i);
        if (t == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Activity");
        }
        return t;
    }

    public static void k(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
