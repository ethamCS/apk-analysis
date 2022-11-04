package io.flutter.embedding.engine.i;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    public final d.a.c.a.i f1009a;

    public h(io.flutter.embedding.engine.e.a aVar) {
        this.f1009a = new d.a.c.a.i(aVar, "flutter/navigation", d.a.c.a.e.f694a);
    }

    public void a() {
        d.a.b.e("NavigationChannel", "Sending message to pop route.");
        this.f1009a.c("popRoute", null);
    }

    public void b(String str) {
        d.a.b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f1009a.c("pushRoute", str);
    }

    public void c(String str) {
        d.a.b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f1009a.c("setInitialRoute", str);
    }
}
