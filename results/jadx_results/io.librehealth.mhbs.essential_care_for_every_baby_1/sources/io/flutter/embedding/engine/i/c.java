package io.flutter.embedding.engine.i;

import d.a.c.a.i;
import d.a.c.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final d.a.c.a.i f991a;

    /* renamed from: b */
    private io.flutter.embedding.engine.f.a f992b = d.a.a.c().a();

    /* renamed from: c */
    private Map<String, List<i.d>> f993c = new HashMap();

    /* renamed from: d */
    final i.c f994d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.c {
        a() {
            c.this = r1;
        }

        @Override // d.a.c.a.i.c
        public void g(d.a.c.a.h hVar, i.d dVar) {
            String str;
            if (c.this.f992b == null) {
                return;
            }
            String str2 = hVar.f695a;
            Map map = (Map) hVar.b();
            d.a.b.e("DeferredComponentChannel", "Received '" + str2 + "' message.");
            int intValue = ((Integer) map.get("loadingUnitId")).intValue();
            String str3 = (String) map.get("componentName");
            str2.hashCode();
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1004447972:
                    if (str2.equals("uninstallDeferredComponent")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 399701758:
                    if (str2.equals("getDeferredComponentInstallState")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 520962947:
                    if (str2.equals("installDeferredComponent")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    c.this.f992b.c(intValue, str3);
                    str = null;
                    break;
                case 1:
                    str = c.this.f992b.a(intValue, str3);
                    break;
                case 2:
                    c.this.f992b.b(intValue, str3);
                    if (!c.this.f993c.containsKey(str3)) {
                        c.this.f993c.put(str3, new ArrayList());
                    }
                    ((List) c.this.f993c.get(str3)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.b(str);
        }
    }

    public c(io.flutter.embedding.engine.e.a aVar) {
        a aVar2 = new a();
        this.f994d = aVar2;
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/deferredcomponent", p.f709b);
        this.f991a = iVar;
        iVar.e(aVar2);
    }

    public void c(io.flutter.embedding.engine.f.a aVar) {
        this.f992b = aVar;
    }
}
