package io.flutter.plugins.share;

import android.app.Activity;
import android.content.Context;
import d.a.c.a.i;
import io.flutter.embedding.engine.h.a;
/* loaded from: classes.dex */
public class c implements io.flutter.embedding.engine.h.a, io.flutter.embedding.engine.h.c.a {

    /* renamed from: a */
    private a f1236a;

    /* renamed from: b */
    private b f1237b;

    /* renamed from: c */
    private i f1238c;

    private void d(Context context, Activity activity, d.a.c.a.b bVar) {
        i iVar = new i(bVar, "plugins.flutter.io/share");
        this.f1238c = iVar;
        b bVar2 = new b(context, activity);
        this.f1237b = bVar2;
        a aVar = new a(bVar2);
        this.f1236a = aVar;
        iVar.e(aVar);
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void a() {
        this.f1237b.j(null);
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void b(io.flutter.embedding.engine.h.c.c cVar) {
        this.f1237b.j(cVar.b());
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void c(io.flutter.embedding.engine.h.c.c cVar) {
        b(cVar);
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        this.f1238c.e(null);
        this.f1238c = null;
        this.f1237b = null;
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void f() {
        a();
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        d(bVar.a(), null, bVar.b());
    }
}
