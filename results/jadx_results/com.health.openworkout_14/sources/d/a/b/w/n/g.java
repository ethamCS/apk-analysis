package d.a.b.w.n;

import d.a.b.o;
import d.a.b.r;
import d.a.b.t;
import d.a.b.u;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: b */
    private final d.a.b.w.c f3822b;

    /* renamed from: c */
    final boolean f3823c;

    /* loaded from: classes.dex */
    private final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: a */
        private final t<K> f3824a;

        /* renamed from: b */
        private final t<V> f3825b;

        /* renamed from: c */
        private final d.a.b.w.i<? extends Map<K, V>> f3826c;

        public a(d.a.b.e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, d.a.b.w.i<? extends Map<K, V>> iVar) {
            g.this = r1;
            this.f3824a = new m(eVar, tVar, type);
            this.f3825b = new m(eVar, tVar2, type2);
            this.f3826c = iVar;
        }

        private String e(d.a.b.j jVar) {
            if (!jVar.g()) {
                if (!jVar.e()) {
                    throw new AssertionError();
                }
                return "null";
            }
            o c2 = jVar.c();
            if (c2.q()) {
                return String.valueOf(c2.m());
            }
            if (c2.o()) {
                return Boolean.toString(c2.h());
            }
            if (!c2.s()) {
                throw new AssertionError();
            }
            return c2.n();
        }

        /* renamed from: f */
        public Map<K, V> b(d.a.b.y.a aVar) {
            d.a.b.y.b w0 = aVar.w0();
            if (w0 == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            Map<K, V> a2 = this.f3826c.a();
            if (w0 == d.a.b.y.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.i0()) {
                    aVar.a();
                    K b2 = this.f3824a.b(aVar);
                    if (a2.put(b2, this.f3825b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b2);
                    }
                    aVar.f0();
                }
                aVar.f0();
            } else {
                aVar.c();
                while (aVar.i0()) {
                    d.a.b.w.f.f3782a.a(aVar);
                    K b3 = this.f3824a.b(aVar);
                    if (a2.put(b3, this.f3825b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b3);
                    }
                }
                aVar.g0();
            }
            return a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void d(d.a.b.y.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.m0();
            } else if (!g.this.f3823c) {
                cVar.I();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.k0(String.valueOf(entry.getKey()));
                    this.f3825b.d(cVar, entry.getValue());
                }
                cVar.g0();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    d.a.b.j c2 = this.f3824a.c(entry2.getKey());
                    arrayList.add(c2);
                    arrayList2.add(entry2.getValue());
                    z |= c2.d() || c2.f();
                }
                if (!z) {
                    cVar.I();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.k0(e((d.a.b.j) arrayList.get(i)));
                        this.f3825b.d(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.g0();
                    return;
                }
                cVar.k();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.k();
                    d.a.b.w.l.b((d.a.b.j) arrayList.get(i), cVar);
                    this.f3825b.d(cVar, arrayList2.get(i));
                    cVar.f0();
                    i++;
                }
                cVar.f0();
            }
        }
    }

    public g(d.a.b.w.c cVar, boolean z) {
        this.f3822b = cVar;
        this.f3823c = z;
    }

    private t<?> a(d.a.b.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f3865f : eVar.k(d.a.b.x.a.b(type));
    }

    @Override // d.a.b.u
    public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j = d.a.b.w.b.j(e2, d.a.b.w.b.k(e2));
        return new a(eVar, j[0], a(eVar, j[0]), j[1], eVar.k(d.a.b.x.a.b(j[1])), this.f3822b.a(aVar));
    }
}
