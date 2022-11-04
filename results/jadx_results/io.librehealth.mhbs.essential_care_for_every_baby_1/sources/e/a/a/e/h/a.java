package e.a.a.e.h;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: a */
    public String f806a;

    /* renamed from: b */
    public Boolean f807b;

    public a() {
    }

    public a(String str) {
        this.f806a = str;
    }

    @Override // e.a.a.e.h.b
    public b b(Map<String, Object> map) {
        this.f806a = (String) b.d(map, "defaultIcon", String.class);
        this.f807b = (Boolean) b.d(map, "FIREBASE_ENABLED", Boolean.class);
        return this;
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put("defaultIcon", this.f806a);
        hashMap.put("FIREBASE_ENABLED", this.f807b);
        return hashMap;
    }

    /* renamed from: j */
    public a a(String str) {
        return (a) super.e(str);
    }
}
