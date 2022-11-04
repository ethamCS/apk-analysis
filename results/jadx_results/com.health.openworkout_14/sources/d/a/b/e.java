package d.a.b;

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
    private static final d.a.b.x.a<?> k = d.a.b.x.a.a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<d.a.b.x.a<?>, f<?>>> f3730a;

    /* renamed from: b */
    private final Map<d.a.b.x.a<?>, t<?>> f3731b;

    /* renamed from: c */
    private final d.a.b.w.c f3732c;

    /* renamed from: d */
    private final d.a.b.w.n.d f3733d;

    /* renamed from: e */
    final List<u> f3734e;

    /* renamed from: f */
    final boolean f3735f;

    /* renamed from: g */
    final boolean f3736g;

    /* renamed from: h */
    final boolean f3737h;
    final boolean i;
    final boolean j;

    /* loaded from: classes.dex */
    public class a extends t<Number> {
        a(e eVar) {
        }

        /* renamed from: e */
        public Double b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Double.valueOf(aVar.n0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m0();
                return;
            }
            e.d(number.doubleValue());
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    public class b extends t<Number> {
        b(e eVar) {
        }

        /* renamed from: e */
        public Float b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Float.valueOf((float) aVar.n0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m0();
                return;
            }
            e.d(number.floatValue());
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends t<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Long.valueOf(aVar.p0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            if (number == null) {
                cVar.m0();
            } else {
                cVar.z0(number.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends t<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ t f3738a;

        d(t tVar) {
            this.f3738a = tVar;
        }

        /* renamed from: e */
        public AtomicLong b(d.a.b.y.a aVar) {
            return new AtomicLong(((Number) this.f3738a.b(aVar)).longValue());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, AtomicLong atomicLong) {
            this.f3738a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: d.a.b.e$e */
    /* loaded from: classes.dex */
    public static class C0106e extends t<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ t f3739a;

        C0106e(t tVar) {
            this.f3739a = tVar;
        }

        /* renamed from: e */
        public AtomicLongArray b(d.a.b.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.i0()) {
                arrayList.add(Long.valueOf(((Number) this.f3739a.b(aVar)).longValue()));
            }
            aVar.f0();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, AtomicLongArray atomicLongArray) {
            cVar.k();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f3739a.d(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.f0();
        }
    }

    /* loaded from: classes.dex */
    public static class f<T> extends t<T> {

        /* renamed from: a */
        private t<T> f3740a;

        f() {
        }

        @Override // d.a.b.t
        public T b(d.a.b.y.a aVar) {
            t<T> tVar = this.f3740a;
            if (tVar != null) {
                return tVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // d.a.b.t
        public void d(d.a.b.y.c cVar, T t) {
            t<T> tVar = this.f3740a;
            if (tVar != null) {
                tVar.d(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(t<T> tVar) {
            if (this.f3740a == null) {
                this.f3740a = tVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(d.a.b.w.d.f3768h, d.a.b.c.f3723b, Collections.emptyMap(), false, false, false, true, false, false, false, s.f3746b, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    e(d.a.b.w.d dVar, d.a.b.d dVar2, Map<Type, d.a.b.f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s sVar, String str, int i, int i2, List<u> list, List<u> list2, List<u> list3) {
        this.f3730a = new ThreadLocal<>();
        this.f3731b = new ConcurrentHashMap();
        d.a.b.w.c cVar = new d.a.b.w.c(map);
        this.f3732c = cVar;
        this.f3735f = z;
        this.f3736g = z3;
        this.f3737h = z4;
        this.i = z5;
        this.j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.a.b.w.n.n.Y);
        arrayList.add(d.a.b.w.n.h.f3828b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(d.a.b.w.n.n.D);
        arrayList.add(d.a.b.w.n.n.m);
        arrayList.add(d.a.b.w.n.n.f3866g);
        arrayList.add(d.a.b.w.n.n.i);
        arrayList.add(d.a.b.w.n.n.k);
        t<Number> n = n(sVar);
        arrayList.add(d.a.b.w.n.n.b(Long.TYPE, Long.class, n));
        arrayList.add(d.a.b.w.n.n.b(Double.TYPE, Double.class, e(z7)));
        arrayList.add(d.a.b.w.n.n.b(Float.TYPE, Float.class, f(z7)));
        arrayList.add(d.a.b.w.n.n.x);
        arrayList.add(d.a.b.w.n.n.o);
        arrayList.add(d.a.b.w.n.n.q);
        arrayList.add(d.a.b.w.n.n.a(AtomicLong.class, b(n)));
        arrayList.add(d.a.b.w.n.n.a(AtomicLongArray.class, c(n)));
        arrayList.add(d.a.b.w.n.n.s);
        arrayList.add(d.a.b.w.n.n.z);
        arrayList.add(d.a.b.w.n.n.F);
        arrayList.add(d.a.b.w.n.n.H);
        arrayList.add(d.a.b.w.n.n.a(BigDecimal.class, d.a.b.w.n.n.B));
        arrayList.add(d.a.b.w.n.n.a(BigInteger.class, d.a.b.w.n.n.C));
        arrayList.add(d.a.b.w.n.n.J);
        arrayList.add(d.a.b.w.n.n.L);
        arrayList.add(d.a.b.w.n.n.P);
        arrayList.add(d.a.b.w.n.n.R);
        arrayList.add(d.a.b.w.n.n.W);
        arrayList.add(d.a.b.w.n.n.N);
        arrayList.add(d.a.b.w.n.n.f3863d);
        arrayList.add(d.a.b.w.n.c.f3819b);
        arrayList.add(d.a.b.w.n.n.U);
        arrayList.add(d.a.b.w.n.k.f3848b);
        arrayList.add(d.a.b.w.n.j.f3846b);
        arrayList.add(d.a.b.w.n.n.S);
        arrayList.add(d.a.b.w.n.a.f3813c);
        arrayList.add(d.a.b.w.n.n.f3861b);
        arrayList.add(new d.a.b.w.n.b(cVar));
        arrayList.add(new d.a.b.w.n.g(cVar, z2));
        d.a.b.w.n.d dVar3 = new d.a.b.w.n.d(cVar);
        this.f3733d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(d.a.b.w.n.n.Z);
        arrayList.add(new d.a.b.w.n.i(cVar, dVar2, dVar, dVar3));
        this.f3734e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, d.a.b.y.a aVar) {
        if (obj != null) {
            try {
                if (aVar.w0() == d.a.b.y.b.END_DOCUMENT) {
                    return;
                }
                throw new k("JSON document was not fully consumed.");
            } catch (d.a.b.y.d e2) {
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
        return new C0106e(tVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private t<Number> e(boolean z) {
        return z ? d.a.b.w.n.n.v : new a(this);
    }

    private t<Number> f(boolean z) {
        return z ? d.a.b.w.n.n.u : new b(this);
    }

    private static t<Number> n(s sVar) {
        return sVar == s.f3746b ? d.a.b.w.n.n.t : new c();
    }

    public <T> T g(d.a.b.y.a aVar, Type type) {
        boolean j0 = aVar.j0();
        boolean z = true;
        aVar.B0(true);
        try {
            try {
                try {
                    aVar.w0();
                    z = false;
                    T b2 = k(d.a.b.x.a.b(type)).b(aVar);
                    aVar.B0(j0);
                    return b2;
                } catch (IOException e2) {
                    throw new r(e2);
                } catch (IllegalStateException e3) {
                    throw new r(e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new r(e4);
                }
                aVar.B0(j0);
                return null;
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e5.getMessage(), e5);
            }
        } catch (Throwable th) {
            aVar.B0(j0);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) {
        d.a.b.y.a o = o(reader);
        T t = (T) g(o, type);
        a(t, o);
        return t;
    }

    public <T> T i(String str, Class<T> cls) {
        return (T) d.a.b.w.k.c(cls).cast(j(str, cls));
    }

    public <T> T j(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> t<T> k(d.a.b.x.a<T> aVar) {
        t<T> tVar = (t<T>) this.f3731b.get(aVar == null ? k : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<d.a.b.x.a<?>, f<?>> map = this.f3730a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f3730a.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (u uVar : this.f3734e) {
                t tVar2 = (t<T>) uVar.b(this, aVar);
                if (tVar2 != null) {
                    fVar2.e(tVar2);
                    this.f3731b.put(aVar, tVar2);
                    return tVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f3730a.remove();
            }
        }
    }

    public <T> t<T> l(Class<T> cls) {
        return k(d.a.b.x.a.a(cls));
    }

    public <T> t<T> m(u uVar, d.a.b.x.a<T> aVar) {
        if (!this.f3734e.contains(uVar)) {
            uVar = this.f3733d;
        }
        boolean z = false;
        for (u uVar2 : this.f3734e) {
            if (z) {
                t<T> b2 = uVar2.b(this, aVar);
                if (b2 != null) {
                    return b2;
                }
            } else if (uVar2 == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public d.a.b.y.a o(Reader reader) {
        d.a.b.y.a aVar = new d.a.b.y.a(reader);
        aVar.B0(this.j);
        return aVar;
    }

    public d.a.b.y.c p(Writer writer) {
        if (this.f3736g) {
            writer.write(")]}'\n");
        }
        d.a.b.y.c cVar = new d.a.b.y.c(writer);
        if (this.i) {
            cVar.s0("  ");
        }
        cVar.u0(this.f3735f);
        return cVar;
    }

    public String q(j jVar) {
        StringWriter stringWriter = new StringWriter();
        u(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        return obj == null ? q(l.f3742a) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(j jVar, d.a.b.y.c cVar) {
        boolean j0 = cVar.j0();
        cVar.t0(true);
        boolean i0 = cVar.i0();
        cVar.r0(this.f3737h);
        boolean h0 = cVar.h0();
        cVar.u0(this.f3735f);
        try {
            try {
                d.a.b.w.l.b(jVar, cVar);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            cVar.t0(j0);
            cVar.r0(i0);
            cVar.u0(h0);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f3735f + ",factories:" + this.f3734e + ",instanceCreators:" + this.f3732c + "}";
    }

    public void u(j jVar, Appendable appendable) {
        try {
            t(jVar, p(d.a.b.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public void v(Object obj, Type type, d.a.b.y.c cVar) {
        t k2 = k(d.a.b.x.a.b(type));
        boolean j0 = cVar.j0();
        cVar.t0(true);
        boolean i0 = cVar.i0();
        cVar.r0(this.f3737h);
        boolean h0 = cVar.h0();
        cVar.u0(this.f3735f);
        try {
            try {
                k2.d(cVar, obj);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            cVar.t0(j0);
            cVar.r0(i0);
            cVar.u0(h0);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, p(d.a.b.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }
}
