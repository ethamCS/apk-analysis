package io.flutter.embedding.engine.i;

import android.os.Build;
import d.a.c.a.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public final d.a.c.a.i f1001a;

    /* renamed from: b */
    private b f1002b;

    /* renamed from: c */
    public final i.c f1003c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.c {
        a() {
            f.this = r1;
        }

        @Override // d.a.c.a.i.c
        public void g(d.a.c.a.h hVar, i.d dVar) {
            if (f.this.f1002b == null) {
                return;
            }
            String str = hVar.f695a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) hVar.b();
            try {
                dVar.b(f.this.f1002b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e2) {
                dVar.a("error", e2.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public f(io.flutter.embedding.engine.e.a aVar) {
        a aVar2 = new a();
        this.f1003c = aVar2;
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/localization", d.a.c.a.e.f694a);
        this.f1001a = iVar;
        iVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        d.a.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            d.a.b.e("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f1001a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f1002b = bVar;
    }
}
