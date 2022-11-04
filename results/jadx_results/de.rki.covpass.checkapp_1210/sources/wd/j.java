package wd;

import hc.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nc.m;
import tb.r;
import tb.x;
import ub.p0;
import ub.v;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private static final c f24876a;

    /* renamed from: b */
    private static final c f24877b;

    static {
        c cVar = new c("java.lang");
        f24876a = cVar;
        c c10 = cVar.c(f.j("annotation"));
        t.d(c10, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f24877b = c10;
    }

    public static final b j(String str) {
        return new b(i.f24825a.b(), f.j(str));
    }

    public static final b k(String str) {
        return new b(i.f24825a.e(), f.j(str));
    }

    public static final b l(String str) {
        return new b(i.f24825a.c(), f.j(str));
    }

    public static final b m(String str) {
        return new b(i.f24825a.d(), f.j(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> n(Map<K, ? extends V> map) {
        int s10;
        int d10;
        int b10;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        s10 = v.s(entrySet, 10);
        d10 = p0.d(s10);
        b10 = m.b(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r a10 = x.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a10.e(), a10.f());
        }
        return linkedHashMap;
    }

    public static final b o(f fVar) {
        i iVar = i.f24825a;
        c h10 = iVar.a().h();
        return new b(h10, f.j(fVar.g() + iVar.a().j().g()));
    }

    public static final b p(String str) {
        return new b(i.f24825a.f(), f.j(str));
    }

    public static final b q(String str) {
        return new b(i.f24825a.g(), f.j(str));
    }

    public static final b r(b bVar) {
        c e10 = i.f24825a.e();
        return new b(e10, f.j('U' + bVar.j().g()));
    }
}
