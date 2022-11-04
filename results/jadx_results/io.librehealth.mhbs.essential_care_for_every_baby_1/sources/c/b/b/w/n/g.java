package c.b.b.w.n;

import c.b.b.o;
import c.b.b.r;
import c.b.b.t;
import c.b.b.u;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a */
    private final c.b.b.w.c f531a;

    /* renamed from: b */
    final boolean f532b;

    /* loaded from: classes.dex */
    private final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: a */
        private final t<K> f533a;

        /* renamed from: b */
        private final t<V> f534b;

        /* renamed from: c */
        private final c.b.b.w.i<? extends Map<K, V>> f535c;

        public a(c.b.b.e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, c.b.b.w.i<? extends Map<K, V>> iVar) {
            g.this = r1;
            this.f533a = new m(eVar, tVar, type);
            this.f534b = new m(eVar, tVar2, type2);
            this.f535c = iVar;
        }

        private String e(c.b.b.j jVar) {
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
        public Map<K, V> b(c.b.b.y.a aVar) {
            c.b.b.y.b x = aVar.x();
            if (x == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            Map<K, V> a2 = this.f535c.a();
            if (x == c.b.b.y.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.j()) {
                    aVar.a();
                    K b2 = this.f533a.b(aVar);
                    if (a2.put(b2, this.f534b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b2);
                    }
                    aVar.f();
                }
                aVar.f();
            } else {
                aVar.b();
                while (aVar.j()) {
                    c.b.b.w.f.f495a.a(aVar);
                    K b3 = this.f533a.b(aVar);
                    if (a2.put(b3, this.f534b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b3);
                    }
                }
                aVar.g();
            }
            return a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void d(c.b.b.y.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.m();
            } else if (!g.this.f532b) {
                cVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.k(String.valueOf(entry.getKey()));
                    this.f534b.d(cVar, entry.getValue());
                }
                cVar.g();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    c.b.b.j c2 = this.f533a.c(entry2.getKey());
                    arrayList.add(c2);
                    arrayList2.add(entry2.getValue());
                    z |= c2.d() || c2.f();
                }
                if (!z) {
                    cVar.d();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.k(e((c.b.b.j) arrayList.get(i)));
                        this.f534b.d(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.g();
                    return;
                }
                cVar.c();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.c();
                    c.b.b.w.l.b((c.b.b.j) arrayList.get(i), cVar);
                    this.f534b.d(cVar, arrayList2.get(i));
                    cVar.f();
                    i++;
                }
                cVar.f();
            }
        }
    }

    public g(c.b.b.w.c cVar, boolean z) {
        this.f531a = cVar;
        this.f532b = z;
    }

    private t<?> b(c.b.b.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f : eVar.j(c.b.b.x.a.b(type));
    }

    @Override // c.b.b.u
    public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j = c.b.b.w.b.j(e2, c.b.b.w.b.k(e2));
        return new a(eVar, j[0], b(eVar, j[0]), j[1], eVar.j(c.b.b.x.a.b(j[1])), this.f531a.a(aVar));
    }
}
