package c.b.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class e {
    private static final c.b.b.x.a<?> k = c.b.b.x.a.a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<c.b.b.x.a<?>, f<?>>> f449a;

    /* renamed from: b */
    private final Map<c.b.b.x.a<?>, t<?>> f450b;

    /* renamed from: c */
    private final c.b.b.w.c f451c;

    /* renamed from: d */
    private final c.b.b.w.n.d f452d;

    /* renamed from: e */
    final List<u> f453e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;

    /* loaded from: classes.dex */
    public class a extends t<Number> {
        a(e eVar) {
        }

        /* renamed from: e */
        public Double b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Double.valueOf(aVar.o());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m();
                return;
            }
            e.d(number.doubleValue());
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    public class b extends t<Number> {
        b(e eVar) {
        }

        /* renamed from: e */
        public Float b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Float.valueOf((float) aVar.o());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m();
                return;
            }
            e.d(number.floatValue());
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends t<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Long.valueOf(aVar.q());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m();
            } else {
                cVar.z(number.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends t<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ t f454a;

        d(t tVar) {
            this.f454a = tVar;
        }

        /* renamed from: e */
        public AtomicLong b(c.b.b.y.a aVar) {
            return new AtomicLong(((Number) this.f454a.b(aVar)).longValue());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, AtomicLong atomicLong) {
            this.f454a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: c.b.b.e$e */
    /* loaded from: classes.dex */
    public static class C0026e extends t<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ t f455a;

        C0026e(t tVar) {
            this.f455a = tVar;
        }

        /* renamed from: e */
        public AtomicLongArray b(c.b.b.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.j()) {
                arrayList.add(Long.valueOf(((Number) this.f455a.b(aVar)).longValue()));
            }
            aVar.f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, AtomicLongArray atomicLongArray) {
            cVar.c();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f455a.d(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.f();
        }
    }

    /* loaded from: classes.dex */
    public static class f<T> extends t<T> {

        /* renamed from: a */
        private t<T> f456a;

        f() {
        }

        @Override // c.b.b.t
        public T b(c.b.b.y.a aVar) {
            t<T> tVar = this.f456a;
            if (tVar != null) {
                return tVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // c.b.b.t
        public void d(c.b.b.y.c cVar, T t) {
            t<T> tVar = this.f456a;
            if (tVar != null) {
                tVar.d(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(t<T> tVar) {
            if (this.f456a == null) {
                this.f456a = tVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(c.b.b.w.d.g, c.b.b.c.f444a, Collections.emptyMap(), false, false, false, true, false, false, false, s.f462a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    e(c.b.b.w.d dVar, c.b.b.d dVar2, Map<Type, c.b.b.f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s sVar, String str, int i, int i2, List<u> list, List<u> list2, List<u> list3) {
        this.f449a = new ThreadLocal<>();
        this.f450b = new ConcurrentHashMap();
        c.b.b.w.c cVar = new c.b.b.w.c(map);
        this.f451c = cVar;
        this.f = z;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.b.b.w.n.n.Y);
        arrayList.add(c.b.b.w.n.h.f537b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(c.b.b.w.n.n.D);
        arrayList.add(c.b.b.w.n.n.m);
        arrayList.add(c.b.b.w.n.n.g);
        arrayList.add(c.b.b.w.n.n.i);
        arrayList.add(c.b.b.w.n.n.k);
        t<Number> m = m(sVar);
        arrayList.add(c.b.b.w.n.n.b(Long.TYPE, Long.class, m));
        arrayList.add(c.b.b.w.n.n.b(Double.TYPE, Double.class, e(z7)));
        arrayList.add(c.b.b.w.n.n.b(Float.TYPE, Float.class, f(z7)));
        arrayList.add(c.b.b.w.n.n.x);
        arrayList.add(c.b.b.w.n.n.o);
        arrayList.add(c.b.b.w.n.n.q);
        arrayList.add(c.b.b.w.n.n.a(AtomicLong.class, b(m)));
        arrayList.add(c.b.b.w.n.n.a(AtomicLongArray.class, c(m)));
        arrayList.add(c.b.b.w.n.n.s);
        arrayList.add(c.b.b.w.n.n.z);
        arrayList.add(c.b.b.w.n.n.F);
        arrayList.add(c.b.b.w.n.n.H);
        arrayList.add(c.b.b.w.n.n.a(BigDecimal.class, c.b.b.w.n.n.B));
        arrayList.add(c.b.b.w.n.n.a(BigInteger.class, c.b.b.w.n.n.C));
        arrayList.add(c.b.b.w.n.n.J);
        arrayList.add(c.b.b.w.n.n.L);
        arrayList.add(c.b.b.w.n.n.P);
        arrayList.add(c.b.b.w.n.n.R);
        arrayList.add(c.b.b.w.n.n.W);
        arrayList.add(c.b.b.w.n.n.N);
        arrayList.add(c.b.b.w.n.n.f567d);
        arrayList.add(c.b.b.w.n.c.f528b);
        arrayList.add(c.b.b.w.n.n.U);
        arrayList.add(c.b.b.w.n.k.f554b);
        arrayList.add(c.b.b.w.n.j.f552b);
        arrayList.add(c.b.b.w.n.n.S);
        arrayList.add(c.b.b.w.n.a.f522c);
        arrayList.add(c.b.b.w.n.n.f565b);
        arrayList.add(new c.b.b.w.n.b(cVar));
        arrayList.add(new c.b.b.w.n.g(cVar, z2));
        c.b.b.w.n.d dVar3 = new c.b.b.w.n.d(cVar);
        this.f452d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(c.b.b.w.n.n.Z);
        arrayList.add(new c.b.b.w.n.i(cVar, dVar2, dVar, dVar3));
        this.f453e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, c.b.b.y.a aVar) {
        if (obj != null) {
            try {
                if (aVar.x() == c.b.b.y.b.END_DOCUMENT) {
                    return;
                }
                throw new k("JSON document was not fully consumed.");
            } catch (c.b.b.y.d e2) {
                throw new r(e2);
            } catch (IOException e3) {
                throw new k(e3);
            }
        }
    }

    private static t<AtomicLong> b(t<Number> tVar) {
        return new d(tVar).a();
    }

    private static t<AtomicLongArray> c(t<Number> tVar) {
        return new C0026e(tVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private t<Number> e(boolean z) {
        return z ? c.b.b.w.n.n.v : new a(this);
    }

    private t<Number> f(boolean z) {
        return z ? c.b.b.w.n.n.u : new b(this);
    }

    private static t<Number> m(s sVar) {
        return sVar == s.f462a ? c.b.b.w.n.n.t : new c();
    }

    public <T> T g(c.b.b.y.a aVar, Type type) {
        boolean k2 = aVar.k();
        boolean z = true;
        aVar.C(true);
        try {
            try {
                try {
                    aVar.x();
                    z = false;
                    T b2 = j(c.b.b.x.a.b(type)).b(aVar);
                    aVar.C(k2);
                    return b2;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                } catch (IllegalStateException e3) {
                    throw new r(e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new r(e4);
                }
                aVar.C(k2);
                return null;
            } catch (IOException e5) {
                throw new r(e5);
            }
        } catch (Throwable th) {
            aVar.C(k2);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) {
        c.b.b.y.a n = n(reader);
        T t = (T) g(n, type);
        a(t, n);
        return t;
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> t<T> j(c.b.b.x.a<T> aVar) {
        t<T> tVar = (t<T>) this.f450b.get(aVar == null ? k : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<c.b.b.x.a<?>, f<?>> map = this.f449a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f449a.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (u uVar : this.f453e) {
                t tVar2 = (t<T>) uVar.a(this, aVar);
                if (tVar2 != null) {
                    fVar2.e(tVar2);
                    this.f450b.put(aVar, tVar2);
                    return tVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f449a.remove();
            }
        }
    }

    public <T> t<T> k(Class<T> cls) {
        return j(c.b.b.x.a.a(cls));
    }

    public <T> t<T> l(u uVar, c.b.b.x.a<T> aVar) {
        if (!this.f453e.contains(uVar)) {
            uVar = this.f452d;
        }
        boolean z = false;
        for (u uVar2 : this.f453e) {
            if (z) {
                t<T> a2 = uVar2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (uVar2 == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public c.b.b.y.a n(Reader reader) {
        c.b.b.y.a aVar = new c.b.b.y.a(reader);
        aVar.C(this.j);
        return aVar;
    }

    public c.b.b.y.c o(Writer writer) {
        if (this.g) {
            writer.write(")]}'\n");
        }
        c.b.b.y.c cVar = new c.b.b.y.c(writer);
        if (this.i) {
            cVar.s("  ");
        }
        cVar.u(this.f);
        return cVar;
    }

    public String p(j jVar) {
        StringWriter stringWriter = new StringWriter();
        t(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        return obj == null ? p(l.f458a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(j jVar, c.b.b.y.c cVar) {
        boolean j = cVar.j();
        cVar.t(true);
        boolean i = cVar.i();
        cVar.r(this.h);
        boolean h = cVar.h();
        cVar.u(this.f);
        try {
            try {
                c.b.b.w.l.b(jVar, cVar);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.t(j);
            cVar.r(i);
            cVar.u(h);
        }
    }

    public void t(j jVar, Appendable appendable) {
        try {
            s(jVar, o(c.b.b.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.f453e + ",instanceCreators:" + this.f451c + "}";
    }

    public void u(Object obj, Type type, c.b.b.y.c cVar) {
        t j = j(c.b.b.x.a.b(type));
        boolean j2 = cVar.j();
        cVar.t(true);
        boolean i = cVar.i();
        cVar.r(this.h);
        boolean h = cVar.h();
        cVar.u(this.f);
        try {
            try {
                j.d(cVar, obj);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.t(j2);
            cVar.r(i);
            cVar.u(h);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            u(obj, type, o(c.b.b.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }
}
