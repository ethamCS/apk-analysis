package androidx.camera.core;

import android.os.Build;
import android.util.Log;
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a */
    private static int f2487a = 3;

    public static void a(String str, String str2) {
        String j10 = j(str);
        if (g(j10, 3)) {
            Log.d(j10, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        String j10 = j(str);
        if (g(j10, 3)) {
            Log.d(j10, str2, th2);
        }
    }

    public static void c(String str, String str2) {
        String j10 = j(str);
        if (g(j10, 6)) {
            Log.e(j10, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        String j10 = j(str);
        if (g(j10, 6)) {
            Log.e(j10, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        String j10 = j(str);
        if (g(j10, 4)) {
            Log.i(j10, str2);
        }
    }

    public static boolean f(String str) {
        return g(j(str), 3);
    }

    private static boolean g(String str, int i10) {
        return f2487a <= i10 || Log.isLoggable(str, i10);
    }

    public static void h() {
        f2487a = 3;
    }

    public static void i(int i10) {
        f2487a = i10;
    }

    private static String j(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void k(String str, String str2) {
        String j10 = j(str);
        if (g(j10, 5)) {
            Log.w(j10, str2);
        }
    }

    public static void l(String str, String str2, Throwable th2) {
        String j10 = j(str);
        if (g(j10, 5)) {
            Log.w(j10, str2, th2);
        }
    }
}
