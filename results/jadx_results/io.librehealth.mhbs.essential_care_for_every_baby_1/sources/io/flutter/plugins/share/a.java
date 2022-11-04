package io.flutter.plugins.share;

import d.a.c.a.h;
import d.a.c.a.i;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class a implements i.c {

    /* renamed from: a */
    private b f1233a;

    public a(b bVar) {
        this.f1233a = bVar;
    }

    private void a(h hVar) {
        if (hVar.f696b instanceof Map) {
            return;
        }
        throw new IllegalArgumentException("Map argument expected");
    }

    @Override // d.a.c.a.i.c
    public void g(h hVar, i.d dVar) {
        String str = hVar.f695a;
        str.hashCode();
        if (!str.equals("shareFiles")) {
            if (!str.equals("share")) {
                dVar.c();
                return;
            }
            a(hVar);
            this.f1233a.k((String) hVar.a("text"), (String) hVar.a("subject"));
            dVar.b(null);
            return;
        }
        a(hVar);
        try {
            this.f1233a.l((List) hVar.a("paths"), (List) hVar.a("mimeTypes"), (String) hVar.a("text"), (String) hVar.a("subject"));
            dVar.b(null);
        } catch (IOException e2) {
            dVar.a(e2.getMessage(), null, null);
        }
    }
}
