package e.a.a.e.h;

import android.content.Context;
import e.a.a.g.m;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: a */
    public String f808a;

    /* renamed from: b */
    public String f809b;

    /* renamed from: c */
    public String f810c;

    /* renamed from: d */
    public Boolean f811d;

    /* renamed from: e */
    public Boolean f812e;
    public e.a.a.e.e.a f;

    @Override // e.a.a.e.h.b
    public /* bridge */ /* synthetic */ b b(Map map) {
        k(map);
        return this;
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put("key", this.f808a);
        hashMap.put("icon", this.f809b);
        hashMap.put("label", this.f810c);
        e.a.a.e.e.a aVar = this.f;
        if (aVar == null) {
            aVar = e.a.a.e.e.a.Default;
        }
        hashMap.put("buttonType", aVar.toString());
        hashMap.put("enabled", this.f811d);
        hashMap.put("autoCancel", this.f812e);
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        if (!m.c(this.f808a).booleanValue()) {
            if (m.c(this.f810c).booleanValue()) {
                throw new e.a.a.e.f.a("Button label cannot be null or empty");
            }
            return;
        }
        throw new e.a.a.e.f.a("Button action key cannot be null or empty");
    }

    /* renamed from: j */
    public c a(String str) {
        return (c) super.e(str);
    }

    public c k(Map<String, Object> map) {
        this.f808a = (String) b.d(map, "key", String.class);
        this.f809b = (String) b.d(map, "icon", String.class);
        this.f810c = (String) b.d(map, "label", String.class);
        this.f = (e.a.a.e.e.a) b.c(map, "buttonType", e.a.a.e.e.a.class, e.a.a.e.e.a.values());
        this.f811d = (Boolean) b.d(map, "enabled", Boolean.class);
        this.f812e = (Boolean) b.d(map, "autoCancel", Boolean.class);
        return this;
    }
}
