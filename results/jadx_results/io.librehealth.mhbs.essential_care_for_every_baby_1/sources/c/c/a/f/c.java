package c.c.a.f;

import d.a.c.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends c.c.a.f.a {

    /* renamed from: a */
    final Map<String, Object> f664a;

    /* renamed from: b */
    final a f665b = new a(this);

    /* renamed from: c */
    final boolean f666c;

    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a */
        Object f667a;

        /* renamed from: b */
        String f668b;

        /* renamed from: c */
        String f669c;

        /* renamed from: d */
        Object f670d;

        public a(c cVar) {
        }

        @Override // c.c.a.f.g
        public void a(String str, String str2, Object obj) {
            this.f668b = str;
            this.f669c = str2;
            this.f670d = obj;
        }

        @Override // c.c.a.f.g
        public void b(Object obj) {
            this.f667a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z) {
        this.f664a = map;
        this.f666c = z;
    }

    @Override // c.c.a.f.f
    public <T> T c(String str) {
        return (T) this.f664a.get(str);
    }

    @Override // c.c.a.f.b, c.c.a.f.f
    public boolean e() {
        return this.f666c;
    }

    @Override // c.c.a.f.a
    public g k() {
        return this.f665b;
    }

    public String l() {
        return (String) this.f664a.get("method");
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f665b.f668b);
        hashMap2.put("message", this.f665b.f669c);
        hashMap2.put("data", this.f665b.f670d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f665b.f667a);
        return hashMap;
    }

    public void o(i.d dVar) {
        a aVar = this.f665b;
        dVar.a(aVar.f668b, aVar.f669c, aVar.f670d);
    }

    public void p(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(m());
        }
    }

    public void q(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(n());
        }
    }
}
