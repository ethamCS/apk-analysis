package io.flutter.embedding.engine.i;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    public final d.a.c.a.a<Object> f1074a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final d.a.c.a.a<Object> f1075a;

        /* renamed from: b */
        private Map<String, Object> f1076b = new HashMap();

        a(d.a.c.a.a<Object> aVar) {
            this.f1075a = aVar;
        }

        public void a() {
            d.a.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f1076b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f1076b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f1076b.get("platformBrightness"));
            this.f1075a.c(this.f1076b);
        }

        public a b(b bVar) {
            this.f1076b.put("platformBrightness", bVar.f1080a);
            return this;
        }

        public a c(float f) {
            this.f1076b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        public a d(boolean z) {
            this.f1076b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: a */
        public String f1080a;

        b(String str) {
            this.f1080a = str;
        }
    }

    public l(io.flutter.embedding.engine.e.a aVar) {
        this.f1074a = new d.a.c.a.a<>(aVar, "flutter/settings", d.a.c.a.d.f693a);
    }

    public a a() {
        return new a(this.f1074a);
    }
}
