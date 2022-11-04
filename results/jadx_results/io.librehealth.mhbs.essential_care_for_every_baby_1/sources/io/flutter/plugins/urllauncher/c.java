package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.embedding.engine.h.a;
/* loaded from: classes.dex */
public final class c implements io.flutter.embedding.engine.h.a, io.flutter.embedding.engine.h.c.a {

    /* renamed from: a */
    private a f1255a;

    /* renamed from: b */
    private b f1256b;

    @Override // io.flutter.embedding.engine.h.c.a
    public void a() {
        if (this.f1255a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f1256b.d(null);
        }
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void b(io.flutter.embedding.engine.h.c.c cVar) {
        if (this.f1255a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f1256b.d(cVar.b());
        }
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void c(io.flutter.embedding.engine.h.c.c cVar) {
        b(cVar);
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        a aVar = this.f1255a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.f();
        this.f1255a = null;
        this.f1256b = null;
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void f() {
        a();
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f1256b = bVar2;
        a aVar = new a(bVar2);
        this.f1255a = aVar;
        aVar.e(bVar.b());
    }
}
