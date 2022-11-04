package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class a extends a.g.d.a {

    /* renamed from: c */
    private static c f827c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    public static class RunnableC0037a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String[] f828b;

        /* renamed from: c */
        final /* synthetic */ Activity f829c;
        final /* synthetic */ int d;

        RunnableC0037a(String[] strArr, Activity activity, int i) {
            this.f828b = strArr;
            this.f829c = activity;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f828b.length];
            PackageManager packageManager = this.f829c.getPackageManager();
            String packageName = this.f829c.getPackageName();
            int length = this.f828b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f828b[i], packageName);
            }
            ((b) this.f829c).onRequestPermissionsResult(this.d, this.f828b, iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean a(Activity activity, String[] strArr, int i);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i);
    }

    public static c a() {
        return f827c;
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, String[] strArr, int i) {
        c cVar = f827c;
        if (cVar == null || !cVar.a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (!(activity instanceof b)) {
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC0037a(strArr, activity, i));
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && androidx.core.app.b.a(activity)) {
            return;
        }
        activity.recreate();
    }
}
