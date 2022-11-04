package b.c.a;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    static final StringBuilder f1286a = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    /* loaded from: classes.dex */
    public static class b {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(12)
    /* loaded from: classes.dex */
    public static class c {
        static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* loaded from: classes.dex */
    private static class d extends Thread {
        public d(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes.dex */
    static class e implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new d(runnable);
        }
    }

    public static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) a(context, "activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    public static int a(Resources resources, v vVar) {
        Uri uri;
        if (vVar.e != 0 || (uri = vVar.d) == null) {
            return vVar.e;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + vVar.d);
        }
        List<String> pathSegments = vVar.d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + vVar.d);
        } else if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + vVar.d);
            }
        } else if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        } else {
            throw new FileNotFoundException("More than two path segments: " + vVar.d);
        }
    }

    public static int a(Bitmap bitmap) {
        int a2 = Build.VERSION.SDK_INT >= 12 ? c.a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (a2 >= 0) {
            return a2;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    public static Resources a(Context context, v vVar) {
        Uri uri;
        if (vVar.e != 0 || (uri = vVar.d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + vVar.d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + vVar.d);
        }
    }

    public static <T> T a(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String a(b.c.a.c cVar) {
        return a(cVar, "");
    }

    public static String a(b.c.a.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        b.c.a.a b2 = cVar.b();
        if (b2 != null) {
            sb.append(b2.f1268b.d());
        }
        List<b.c.a.a> c2 = cVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || b2 != null) {
                    sb.append(", ");
                }
                sb.append(c2.get(i).f1268b.d());
            }
        }
        return sb.toString();
    }

    public static String a(v vVar) {
        String a2 = a(vVar, f1286a);
        f1286a.setLength(0);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String a(b.c.a.v r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f
            r1 = 50
            if (r0 == 0) goto L14
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f
        L10:
            r5.append(r0)
            goto L2d
        L14:
            android.net.Uri r0 = r4.d
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L10
        L25:
            r5.ensureCapacity(r1)
            int r0 = r4.e
            r5.append(r0)
        L2d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.m
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L5e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.m
            r5.append(r1)
            boolean r1 = r4.p
            if (r1 == 0) goto L5b
            r1 = 64
            r5.append(r1)
            float r1 = r4.n
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.o
            r5.append(r1)
        L5b:
            r5.append(r0)
        L5e:
            boolean r1 = r4.c()
            if (r1 == 0) goto L79
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.h
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.i
            r5.append(r1)
            r5.append(r0)
        L79:
            boolean r1 = r4.j
            if (r1 == 0) goto L86
            java.lang.String r1 = "centerCrop"
        L7f:
            r5.append(r1)
            r5.append(r0)
            goto L8d
        L86:
            boolean r1 = r4.k
            if (r1 == 0) goto L8d
            java.lang.String r1 = "centerInside"
            goto L7f
        L8d:
            java.util.List<b.c.a.b0> r1 = r4.g
            if (r1 == 0) goto Lad
            r2 = 0
            int r1 = r1.size()
        L96:
            if (r2 >= r1) goto Lad
            java.util.List<b.c.a.b0> r3 = r4.g
            java.lang.Object r3 = r3.get(r2)
            b.c.a.b0 r3 = (b.c.a.b0) r3
            java.lang.String r3 = r3.a()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L96
        Lad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.d0.a(b.c.a.v, java.lang.StringBuilder):java.lang.String");
    }

    public static void a() {
        if (b()) {
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    public static void a(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    public static void a(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0])) {
                return false;
            }
            return Integer.parseInt(split[1]) == 304;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean b(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    public static j c(Context context) {
        return new c0(context);
    }

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean d(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
