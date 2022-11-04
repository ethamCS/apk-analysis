package io.flutter.plugins.b;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.a.c.a.i;
import io.flutter.embedding.engine.h.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class h implements io.flutter.embedding.engine.h.a, i.c {

    /* renamed from: a */
    private Context f1227a;

    /* renamed from: b */
    private d.a.c.a.i f1228b;

    /* renamed from: c */
    private final Executor f1229c = new b(null);

    /* renamed from: d */
    private final Executor f1230d;

    /* loaded from: classes.dex */
    public class a implements c.b.a.d.a.b<T> {

        /* renamed from: a */
        final /* synthetic */ i.d f1231a;

        a(h hVar, i.d dVar) {
            this.f1231a = dVar;
        }

        @Override // c.b.a.d.a.b
        public void a(Throwable th) {
            this.f1231a.a(th.getClass().getName(), th.getMessage(), null);
        }

        @Override // c.b.a.d.a.b
        public void b(T t) {
            this.f1231a.b(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements Executor {

        /* renamed from: a */
        private final Handler f1232a;

        private b() {
            this.f1232a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1232a.post(runnable);
        }
    }

    public h() {
        c.b.a.d.a.h hVar = new c.b.a.d.a.h();
        hVar.e("path-provider-background-%d");
        hVar.f(5);
        this.f1230d = Executors.newSingleThreadExecutor(hVar.b());
    }

    private <T> void a(final Callable<T> callable, i.d dVar) {
        final c.b.a.d.a.g E = c.b.a.d.a.g.E();
        c.b.a.d.a.c.a(E, new a(this, dVar), this.f1229c);
        this.f1230d.execute(new Runnable() { // from class: io.flutter.plugins.b.a
            @Override // java.lang.Runnable
            public final void run() {
                h.k(c.b.a.d.a.g.this, callable);
            }
        });
    }

    /* renamed from: b */
    public String v() {
        return d.a.d.a.c(this.f1227a);
    }

    /* renamed from: c */
    public String n() {
        return d.a.d.a.b(this.f1227a);
    }

    /* renamed from: d */
    public List<String> r() {
        File[] externalCacheDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f1227a.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f1227a.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<String> t(String str) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f1227a.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f1227a.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public String p() {
        File externalFilesDir = this.f1227a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: j */
    public String l() {
        return this.f1227a.getCacheDir().getPath();
    }

    public static /* synthetic */ void k(c.b.a.d.a.g gVar, Callable callable) {
        try {
            gVar.C(callable.call());
        } catch (Throwable th) {
            gVar.D(th);
        }
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        this.f1228b.e(null);
        this.f1228b = null;
    }

    @Override // d.a.c.a.i.c
    public void g(d.a.c.a.h hVar, i.d dVar) {
        Callable callable;
        String str = hVar.f695a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1832373352:
                if (str.equals("getApplicationSupportDirectory")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1208689078:
                if (str.equals("getExternalCacheDirectories")) {
                    c2 = 1;
                    break;
                }
                break;
            case 299667825:
                if (str.equals("getExternalStorageDirectories")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1200320591:
                if (str.equals("getApplicationDocumentsDirectory")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1252916648:
                if (str.equals("getStorageDirectory")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1711844626:
                if (str.equals("getTemporaryDirectory")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                callable = new Callable() { // from class: io.flutter.plugins.b.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.w();
                    }
                };
                break;
            case 1:
                callable = new Callable() { // from class: io.flutter.plugins.b.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.s();
                    }
                };
                break;
            case 2:
                final String a2 = i.a((Integer) hVar.a("type"));
                a(new Callable() { // from class: io.flutter.plugins.b.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.u(a2);
                    }
                }, dVar);
                return;
            case 3:
                callable = new Callable() { // from class: io.flutter.plugins.b.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.o();
                    }
                };
                break;
            case 4:
                callable = new Callable() { // from class: io.flutter.plugins.b.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.q();
                    }
                };
                break;
            case 5:
                callable = new Callable() { // from class: io.flutter.plugins.b.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.m();
                    }
                };
                break;
            default:
                dVar.c();
                return;
        }
        a(callable, dVar);
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        this.f1228b = new d.a.c.a.i(bVar.b(), "plugins.flutter.io/path_provider");
        this.f1227a = bVar.a();
        this.f1228b.e(this);
    }
}
