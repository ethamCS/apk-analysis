package io.flutter.embedding.engine.g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private boolean f971a;

    /* renamed from: b */
    private C0050c f972b;

    /* renamed from: c */
    private long f973c;

    /* renamed from: d */
    private io.flutter.embedding.engine.g.b f974d;

    /* renamed from: e */
    private FlutterJNI f975e;
    Future<b> f;

    /* loaded from: classes.dex */
    public class a implements Callable<b> {

        /* renamed from: a */
        final /* synthetic */ Context f976a;

        /* renamed from: io.flutter.embedding.engine.g.c$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0049a implements Runnable {
            RunnableC0049a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f975e.prefetchDefaultFontManager();
            }
        }

        a(Context context) {
            c.this = r1;
            this.f976a = context;
        }

        /* renamed from: a */
        public b call() {
            d h = c.this.h(this.f976a);
            c.this.f975e.loadLibrary();
            Executors.newSingleThreadExecutor().execute(new RunnableC0049a());
            if (h == null) {
                return new b(d.a.d.a.c(this.f976a), d.a.d.a.a(this.f976a), d.a.d.a.b(this.f976a), null);
            }
            h.a();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final String f979a;

        /* renamed from: b */
        final String f980b;

        private b(String str, String str2, String str3) {
            this.f979a = str;
            this.f980b = str2;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    /* renamed from: io.flutter.embedding.engine.g.c$c */
    /* loaded from: classes.dex */
    public static class C0050c {

        /* renamed from: a */
        private String f981a;

        public String a() {
            return this.f981a;
        }
    }

    public c() {
        this(new FlutterJNI());
    }

    public c(FlutterJNI flutterJNI) {
        this.f971a = false;
        this.f975e = flutterJNI;
    }

    private String f(String str) {
        return this.f974d.f967b + File.separator + str;
    }

    public d h(Context context) {
        return null;
    }

    public boolean c() {
        return this.f974d.f970e;
    }

    public void d(Context context, String[] strArr) {
        if (this.f971a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f972b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            b bVar = this.f.get();
            ArrayList arrayList = new ArrayList();
            arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
            StringBuilder sb = new StringBuilder();
            sb.append("--icu-native-lib-path=");
            sb.append(this.f974d.f969d);
            String str = File.separator;
            sb.append(str);
            sb.append("libflutter.so");
            arrayList.add(sb.toString());
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            arrayList.add("--aot-shared-library-name=" + this.f974d.f966a);
            arrayList.add("--aot-shared-library-name=" + this.f974d.f969d + str + this.f974d.f966a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("--cache-dir-path=");
            sb2.append(bVar.f980b);
            arrayList.add(sb2.toString());
            if (this.f974d.f968c != null) {
                arrayList.add("--domain-network-policy=" + this.f974d.f968c);
            }
            if (this.f972b.a() != null) {
                arrayList.add("--log-tag=" + this.f972b.a());
            }
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
            if (i == 0) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                double d2 = memoryInfo.totalMem;
                Double.isNaN(d2);
                i = (int) ((d2 / 1000000.0d) / 2.0d);
            }
            arrayList.add("--old-gen-heap-size=" + i);
            if (bundle != null && bundle.getBoolean("io.flutter.embedding.android.EnableSkParagraph")) {
                arrayList.add("--enable-skparagraph");
            }
            this.f975e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f979a, bVar.f980b, SystemClock.uptimeMillis() - this.f973c);
            this.f971a = true;
        } catch (Exception e2) {
            d.a.b.c("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public String e() {
        return this.f974d.f967b;
    }

    public String g(String str) {
        return f(str);
    }

    public void i(Context context) {
        j(context, new C0050c());
    }

    public void j(Context context, C0050c c0050c) {
        if (this.f972b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Context applicationContext = context.getApplicationContext();
        this.f972b = c0050c;
        this.f973c = SystemClock.uptimeMillis();
        this.f974d = io.flutter.embedding.engine.g.a.e(applicationContext);
        f.b((WindowManager) applicationContext.getSystemService("window")).c();
        this.f = Executors.newSingleThreadExecutor().submit(new a(applicationContext));
    }
}
