package io.flutter.embedding.engine.h;

import android.content.Context;
import io.flutter.plugin.platform.g;
import io.flutter.view.e;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: io.flutter.embedding.engine.h.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0051a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Context f982a;

        /* renamed from: b */
        private final d.a.c.a.b f983b;

        public b(Context context, io.flutter.embedding.engine.a aVar, d.a.c.a.b bVar, e eVar, g gVar, AbstractC0051a abstractC0051a) {
            this.f982a = context;
            this.f983b = bVar;
        }

        public Context a() {
            return this.f982a;
        }

        public d.a.c.a.b b() {
            return this.f983b;
        }
    }

    void e(b bVar);

    void h(b bVar);
}
