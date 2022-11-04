package io.flutter.embedding.engine.i;

import java.util.HashMap;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    public final d.a.c.a.a<Object> f1081a;

    public m(io.flutter.embedding.engine.e.a aVar) {
        this.f1081a = new d.a.c.a.a<>(aVar, "flutter/system", d.a.c.a.d.f693a);
    }

    public void a() {
        d.a.b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f1081a.c(hashMap);
    }
}
