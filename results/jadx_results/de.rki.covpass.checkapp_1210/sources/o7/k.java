package o7;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k implements h {

    /* renamed from: a */
    private Collection<h6.a> f17631a;

    /* renamed from: b */
    private Map<h6.e, ?> f17632b;

    /* renamed from: c */
    private String f17633c;

    /* renamed from: d */
    private int f17634d;

    public k() {
    }

    public k(Collection<h6.a> collection, Map<h6.e, ?> map, String str, int i10) {
        this.f17631a = collection;
        this.f17632b = map;
        this.f17633c = str;
        this.f17634d = i10;
    }

    @Override // o7.h
    public g a(Map<h6.e, ?> map) {
        EnumMap enumMap = new EnumMap(h6.e.class);
        enumMap.putAll(map);
        Map<h6.e, ?> map2 = this.f17632b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<h6.a> collection = this.f17631a;
        if (collection != null) {
            enumMap.put((EnumMap) h6.e.POSSIBLE_FORMATS, (h6.e) collection);
        }
        String str = this.f17633c;
        if (str != null) {
            enumMap.put((EnumMap) h6.e.CHARACTER_SET, (h6.e) str);
        }
        h6.k kVar = new h6.k();
        kVar.e(enumMap);
        int i10 = this.f17634d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new g(kVar) : new m(kVar) : new l(kVar) : new g(kVar);
    }
}
