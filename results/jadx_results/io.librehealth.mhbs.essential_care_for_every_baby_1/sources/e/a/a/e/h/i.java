package e.a.a.e.h;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends b {

    /* renamed from: a */
    public boolean f830a = false;

    /* renamed from: b */
    public f f831b;

    /* renamed from: c */
    public h f832c;

    /* renamed from: d */
    public List<c> f833d;

    private static List<c> k(String str, Map<String, Object> map) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof List)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!(obj2 instanceof Map)) {
                return null;
            }
            Map<String, Object> map2 = (Map) obj2;
            if (!map2.isEmpty()) {
                c cVar = new c();
                cVar.k(map2);
                arrayList.add(cVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    private static f l(String str, Map<String, Object> map) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2.isEmpty()) {
            return null;
        }
        f fVar = new f();
        fVar.b(map2);
        return fVar;
    }

    private static h m(String str, Map<String, Object> map) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2.isEmpty()) {
            return null;
        }
        if (map2.containsKey("interval")) {
            g gVar = new g();
            gVar.m(map2);
            return gVar;
        }
        d dVar = new d();
        dVar.m(map2);
        return dVar;
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        if (this.f831b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("content", this.f831b.h());
        h hVar = this.f832c;
        if (hVar != null) {
            hashMap.put("schedule", hVar.h());
        }
        List<c> list = this.f833d;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : this.f833d) {
                arrayList.add(cVar.h());
            }
            hashMap.put("actionButtons", arrayList);
        }
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        f fVar = this.f831b;
        if (fVar != null) {
            fVar.i(context);
            h hVar = this.f832c;
            if (hVar != null) {
                hVar.i(context);
            }
            List<c> list = this.f833d;
            if (list == null) {
                return;
            }
            for (c cVar : list) {
                cVar.i(context);
            }
            return;
        }
        throw new e.a.a.e.f.a("Push Notification content cannot be null or empty");
    }

    public i j() {
        i iVar = new i();
        iVar.b(h());
        return iVar;
    }

    /* renamed from: n */
    public i a(String str) {
        return (i) super.e(str);
    }

    /* renamed from: o */
    public i b(Map<String, Object> map) {
        f l = l("content", map);
        this.f831b = l;
        if (l == null) {
            return null;
        }
        this.f832c = m("schedule", map);
        this.f833d = k("actionButtons", map);
        return this;
    }
}
