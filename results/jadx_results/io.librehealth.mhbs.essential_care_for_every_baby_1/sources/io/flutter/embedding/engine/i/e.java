package io.flutter.embedding.engine.i;

import d.a.c.a.q;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public final d.a.c.a.a<String> f1000a;

    public e(io.flutter.embedding.engine.e.a aVar) {
        this.f1000a = new d.a.c.a.a<>(aVar, "flutter/lifecycle", q.f712b);
    }

    public void a() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f1000a.c("AppLifecycleState.detached");
    }

    public void b() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f1000a.c("AppLifecycleState.inactive");
    }

    public void c() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f1000a.c("AppLifecycleState.paused");
    }

    public void d() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f1000a.c("AppLifecycleState.resumed");
    }
}
