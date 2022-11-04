package c.b.b.w.n;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes.dex */
public final class n {
    public static final c.b.b.t<String> A;
    public static final c.b.b.u D;
    public static final c.b.b.t<StringBuilder> E;
    public static final c.b.b.u F;
    public static final c.b.b.t<StringBuffer> G;
    public static final c.b.b.u H;
    public static final c.b.b.t<URL> I;
    public static final c.b.b.u J;
    public static final c.b.b.t<URI> K;
    public static final c.b.b.u L;
    public static final c.b.b.t<InetAddress> M;
    public static final c.b.b.u N;
    public static final c.b.b.t<UUID> O;
    public static final c.b.b.u P;
    public static final c.b.b.t<Currency> Q;
    public static final c.b.b.u R;
    public static final c.b.b.t<Calendar> T;
    public static final c.b.b.u U;
    public static final c.b.b.t<Locale> V;
    public static final c.b.b.u W;
    public static final c.b.b.t<c.b.b.j> X;
    public static final c.b.b.u Y;

    /* renamed from: a */
    public static final c.b.b.t<Class> f564a;

    /* renamed from: b */
    public static final c.b.b.u f565b;

    /* renamed from: c */
    public static final c.b.b.t<BitSet> f566c;

    /* renamed from: d */
    public static final c.b.b.u f567d;

    /* renamed from: e */
    public static final c.b.b.t<Boolean> f568e;
    public static final c.b.b.u g;
    public static final c.b.b.t<Number> h;
    public static final c.b.b.u i;
    public static final c.b.b.t<Number> j;
    public static final c.b.b.u k;
    public static final c.b.b.t<Number> l;
    public static final c.b.b.u m;
    public static final c.b.b.t<AtomicInteger> n;
    public static final c.b.b.u o;
    public static final c.b.b.t<AtomicBoolean> p;
    public static final c.b.b.u q;
    public static final c.b.b.t<AtomicIntegerArray> r;
    public static final c.b.b.u s;
    public static final c.b.b.t<Number> w;
    public static final c.b.b.u x;
    public static final c.b.b.t<Character> y;
    public static final c.b.b.u z;
    public static final c.b.b.t<Boolean> f = new d0();
    public static final c.b.b.t<Number> t = new b();
    public static final c.b.b.t<Number> u = new c();
    public static final c.b.b.t<Number> v = new d();
    public static final c.b.b.t<BigDecimal> B = new h();
    public static final c.b.b.t<BigInteger> C = new i();
    public static final c.b.b.u S = new r();
    public static final c.b.b.u Z = new w();

    /* loaded from: classes.dex */
    static class a extends c.b.b.t<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray b(c.b.b.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.j()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.p()));
                } catch (NumberFormatException e2) {
                    throw new c.b.b.r(e2);
                }
            }
            aVar.f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.c();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.w(atomicIntegerArray.get(i));
            }
            cVar.f();
        }
    }

    /* loaded from: classes.dex */
    public static class a0 implements c.b.b.u {

        /* renamed from: a */
        final /* synthetic */ Class f569a;

        /* renamed from: b */
        final /* synthetic */ c.b.b.t f570b;

        /* loaded from: classes.dex */
        class a extends c.b.b.t<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f571a;

            a(Class cls) {
                a0.this = r1;
                this.f571a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // c.b.b.t
            public T1 b(c.b.b.y.a aVar) {
                ?? b2 = a0.this.f570b.b(aVar);
                if (b2 == 0 || this.f571a.isInstance(b2)) {
                    return b2;
                }
                throw new c.b.b.r("Expected a " + this.f571a.getName() + " but was " + b2.getClass().getName());
            }

            @Override // c.b.b.t
            public void d(c.b.b.y.c cVar, T1 t1) {
                a0.this.f570b.d(cVar, t1);
            }
        }

        a0(Class cls, c.b.b.t tVar) {
            this.f569a = cls;
            this.f570b = tVar;
        }

        @Override // c.b.b.u
        public <T2> c.b.b.t<T2> a(c.b.b.e eVar, c.b.b.x.a<T2> aVar) {
            Class<? super T2> c2 = aVar.c();
            if (!this.f569a.isAssignableFrom(c2)) {
                return null;
            }
            return new a(c2);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f569a.getName() + ",adapter=" + this.f570b + "]";
        }
    }

    /* loaded from: classes.dex */
    static class b extends c.b.b.t<Number> {
        b() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return Long.valueOf(aVar.q());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f573a;

        static {
            int[] iArr = new int[c.b.b.y.b.values().length];
            f573a = iArr;
            try {
                iArr[c.b.b.y.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f573a[c.b.b.y.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f573a[c.b.b.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f573a[c.b.b.y.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f573a[c.b.b.y.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f573a[c.b.b.y.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f573a[c.b.b.y.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f573a[c.b.b.y.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f573a[c.b.b.y.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f573a[c.b.b.y.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends c.b.b.t<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Float.valueOf((float) aVar.o());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class c0 extends c.b.b.t<Boolean> {
        c0() {
        }

        /* renamed from: e */
        public Boolean b(c.b.b.y.a aVar) {
            c.b.b.y.b x = aVar.x();
            if (x != c.b.b.y.b.NULL) {
                return x == c.b.b.y.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
            }
            aVar.t();
            return null;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Boolean bool) {
            cVar.x(bool);
        }
    }

    /* loaded from: classes.dex */
    static class d extends c.b.b.t<Number> {
        d() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Double.valueOf(aVar.o());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class d0 extends c.b.b.t<Boolean> {
        d0() {
        }

        /* renamed from: e */
        public Boolean b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return Boolean.valueOf(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Boolean bool) {
            cVar.z(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: classes.dex */
    static class e extends c.b.b.t<Number> {
        e() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            c.b.b.y.b x = aVar.x();
            int i = b0.f573a[x.ordinal()];
            if (i == 1 || i == 3) {
                return new c.b.b.w.g(aVar.v());
            }
            if (i == 4) {
                aVar.t();
                return null;
            }
            throw new c.b.b.r("Expecting number, got: " + x);
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class e0 extends c.b.b.t<Number> {
        e0() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.p());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class f extends c.b.b.t<Character> {
        f() {
        }

        /* renamed from: e */
        public Character b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            String v = aVar.v();
            if (v.length() == 1) {
                return Character.valueOf(v.charAt(0));
            }
            throw new c.b.b.r("Expecting character, got: " + v);
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Character ch) {
            cVar.z(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: classes.dex */
    static class f0 extends c.b.b.t<Number> {
        f0() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.p());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class g extends c.b.b.t<String> {
        g() {
        }

        /* renamed from: e */
        public String b(c.b.b.y.a aVar) {
            c.b.b.y.b x = aVar.x();
            if (x != c.b.b.y.b.NULL) {
                return x == c.b.b.y.b.BOOLEAN ? Boolean.toString(aVar.n()) : aVar.v();
            }
            aVar.t();
            return null;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, String str) {
            cVar.z(str);
        }
    }

    /* loaded from: classes.dex */
    static class g0 extends c.b.b.t<Number> {
        g0() {
        }

        /* renamed from: e */
        public Number b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return Integer.valueOf(aVar.p());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Number number) {
            cVar.y(number);
        }
    }

    /* loaded from: classes.dex */
    static class h extends c.b.b.t<BigDecimal> {
        h() {
        }

        /* renamed from: e */
        public BigDecimal b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return new BigDecimal(aVar.v());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, BigDecimal bigDecimal) {
            cVar.y(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    static class h0 extends c.b.b.t<AtomicInteger> {
        h0() {
        }

        /* renamed from: e */
        public AtomicInteger b(c.b.b.y.a aVar) {
            try {
                return new AtomicInteger(aVar.p());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, AtomicInteger atomicInteger) {
            cVar.w(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    static class i extends c.b.b.t<BigInteger> {
        i() {
        }

        /* renamed from: e */
        public BigInteger b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                return new BigInteger(aVar.v());
            } catch (NumberFormatException e2) {
                throw new c.b.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, BigInteger bigInteger) {
            cVar.y(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    static class i0 extends c.b.b.t<AtomicBoolean> {
        i0() {
        }

        /* renamed from: e */
        public AtomicBoolean b(c.b.b.y.a aVar) {
            return new AtomicBoolean(aVar.n());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, AtomicBoolean atomicBoolean) {
            cVar.A(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    static class j extends c.b.b.t<StringBuilder> {
        j() {
        }

        /* renamed from: e */
        public StringBuilder b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return new StringBuilder(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, StringBuilder sb) {
            cVar.z(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: classes.dex */
    private static final class j0<T extends Enum<T>> extends c.b.b.t<T> {

        /* renamed from: a */
        private final Map<String, T> f574a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f575b = new HashMap();

        public j0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    c.b.b.v.c cVar = (c.b.b.v.c) cls.getField(name).getAnnotation(c.b.b.v.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f574a.put(str, t);
                        }
                    }
                    this.f574a.put(name, t);
                    this.f575b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public T b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return this.f574a.get(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, T t) {
            cVar.z(t == null ? null : this.f575b.get(t));
        }
    }

    /* loaded from: classes.dex */
    static class k extends c.b.b.t<Class> {
        k() {
        }

        @Override // c.b.b.t
        public /* bridge */ /* synthetic */ Class b(c.b.b.y.a aVar) {
            e(aVar);
            throw null;
        }

        @Override // c.b.b.t
        public /* bridge */ /* synthetic */ void d(c.b.b.y.c cVar, Class cls) {
            f(cVar, cls);
            throw null;
        }

        public Class e(c.b.b.y.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void f(c.b.b.y.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes.dex */
    static class l extends c.b.b.t<StringBuffer> {
        l() {
        }

        /* renamed from: e */
        public StringBuffer b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return new StringBuffer(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, StringBuffer stringBuffer) {
            cVar.z(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes.dex */
    static class m extends c.b.b.t<URL> {
        m() {
        }

        /* renamed from: e */
        public URL b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            String v = aVar.v();
            if (!"null".equals(v)) {
                return new URL(v);
            }
            return null;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, URL url) {
            cVar.z(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: c.b.b.w.n.n$n */
    /* loaded from: classes.dex */
    static class C0031n extends c.b.b.t<URI> {
        C0031n() {
        }

        /* renamed from: e */
        public URI b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            try {
                String v = aVar.v();
                if (!"null".equals(v)) {
                    return new URI(v);
                }
                return null;
            } catch (URISyntaxException e2) {
                throw new c.b.b.k(e2);
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, URI uri) {
            cVar.z(uri == null ? null : uri.toASCIIString());
        }
    }

    /* loaded from: classes.dex */
    static class o extends c.b.b.t<InetAddress> {
        o() {
        }

        /* renamed from: e */
        public InetAddress b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return InetAddress.getByName(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, InetAddress inetAddress) {
            cVar.z(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    static class p extends c.b.b.t<UUID> {
        p() {
        }

        /* renamed from: e */
        public UUID b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return UUID.fromString(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, UUID uuid) {
            cVar.z(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes.dex */
    static class q extends c.b.b.t<Currency> {
        q() {
        }

        /* renamed from: e */
        public Currency b(c.b.b.y.a aVar) {
            return Currency.getInstance(aVar.v());
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Currency currency) {
            cVar.z(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    static class r implements c.b.b.u {

        /* loaded from: classes.dex */
        class a extends c.b.b.t<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ c.b.b.t f576a;

            a(r rVar, c.b.b.t tVar) {
                this.f576a = tVar;
            }

            /* renamed from: e */
            public Timestamp b(c.b.b.y.a aVar) {
                Date date = (Date) this.f576a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: f */
            public void d(c.b.b.y.c cVar, Timestamp timestamp) {
                this.f576a.d(cVar, timestamp);
            }
        }

        r() {
        }

        @Override // c.b.b.u
        public <T> c.b.b.t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(this, eVar.k(Date.class));
        }
    }

    /* loaded from: classes.dex */
    static class s extends c.b.b.t<Calendar> {
        s() {
        }

        /* renamed from: e */
        public Calendar b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            aVar.b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.x() != c.b.b.y.b.END_OBJECT) {
                String r = aVar.r();
                int p = aVar.p();
                if ("year".equals(r)) {
                    i = p;
                } else if ("month".equals(r)) {
                    i2 = p;
                } else if ("dayOfMonth".equals(r)) {
                    i3 = p;
                } else if ("hourOfDay".equals(r)) {
                    i4 = p;
                } else if ("minute".equals(r)) {
                    i5 = p;
                } else if ("second".equals(r)) {
                    i6 = p;
                }
            }
            aVar.g();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.m();
                return;
            }
            cVar.d();
            cVar.k("year");
            cVar.w(calendar.get(1));
            cVar.k("month");
            cVar.w(calendar.get(2));
            cVar.k("dayOfMonth");
            cVar.w(calendar.get(5));
            cVar.k("hourOfDay");
            cVar.w(calendar.get(11));
            cVar.k("minute");
            cVar.w(calendar.get(12));
            cVar.k("second");
            cVar.w(calendar.get(13));
            cVar.g();
        }
    }

    /* loaded from: classes.dex */
    static class t extends c.b.b.t<Locale> {
        t() {
        }

        /* renamed from: e */
        public Locale b(c.b.b.y.a aVar) {
            String str = null;
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.v(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Locale locale) {
            cVar.z(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes.dex */
    static class u extends c.b.b.t<c.b.b.j> {
        u() {
        }

        /* renamed from: e */
        public c.b.b.j b(c.b.b.y.a aVar) {
            switch (b0.f573a[aVar.x().ordinal()]) {
                case 1:
                    return new c.b.b.o(new c.b.b.w.g(aVar.v()));
                case 2:
                    return new c.b.b.o(Boolean.valueOf(aVar.n()));
                case 3:
                    return new c.b.b.o(aVar.v());
                case 4:
                    aVar.t();
                    return c.b.b.l.f458a;
                case 5:
                    c.b.b.g gVar = new c.b.b.g();
                    aVar.a();
                    while (aVar.j()) {
                        gVar.h(b(aVar));
                    }
                    aVar.f();
                    return gVar;
                case 6:
                    c.b.b.m mVar = new c.b.b.m();
                    aVar.b();
                    while (aVar.j()) {
                        mVar.h(aVar.r(), b(aVar));
                    }
                    aVar.g();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, c.b.b.j jVar) {
            if (jVar == null || jVar.e()) {
                cVar.m();
            } else if (jVar.g()) {
                c.b.b.o c2 = jVar.c();
                if (c2.q()) {
                    cVar.y(c2.m());
                } else if (c2.o()) {
                    cVar.A(c2.h());
                } else {
                    cVar.z(c2.n());
                }
            } else if (jVar.d()) {
                cVar.c();
                Iterator<c.b.b.j> it = jVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.f();
            } else if (!jVar.f()) {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            } else {
                cVar.d();
                for (Map.Entry<String, c.b.b.j> entry : jVar.b().i()) {
                    cVar.k(entry.getKey());
                    d(cVar, entry.getValue());
                }
                cVar.g();
            }
        }
    }

    /* loaded from: classes.dex */
    static class v extends c.b.b.t<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.p() != 0) goto L22;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet b(c.b.b.y.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                c.b.b.y.b r1 = r8.x()
                r2 = 0
                r3 = 0
            Le:
                c.b.b.y.b r4 = c.b.b.y.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = c.b.b.w.n.n.b0.f573a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.v()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                c.b.b.r r8 = new c.b.b.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                c.b.b.r r8 = new c.b.b.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.n()
                goto L69
            L63:
                int r1 = r8.p()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                c.b.b.y.b r1 = r8.x()
                goto Le
            L75:
                r8.f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c.b.b.w.n.n.v.b(c.b.b.y.a):java.util.BitSet");
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, BitSet bitSet) {
            cVar.c();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.w(bitSet.get(i) ? 1L : 0L);
            }
            cVar.f();
        }
    }

    /* loaded from: classes.dex */
    static class w implements c.b.b.u {
        w() {
        }

        @Override // c.b.b.u
        public <T> c.b.b.t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            Class c2 = aVar.c();
            if (!Enum.class.isAssignableFrom(c2) || c2 == Enum.class) {
                return null;
            }
            if (!c2.isEnum()) {
                c2 = (Class<? super Object>) c2.getSuperclass();
            }
            return new j0(c2);
        }
    }

    /* loaded from: classes.dex */
    public static class x implements c.b.b.u {

        /* renamed from: a */
        final /* synthetic */ Class f577a;

        /* renamed from: b */
        final /* synthetic */ c.b.b.t f578b;

        x(Class cls, c.b.b.t tVar) {
            this.f577a = cls;
            this.f578b = tVar;
        }

        @Override // c.b.b.u
        public <T> c.b.b.t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            if (aVar.c() == this.f577a) {
                return this.f578b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f577a.getName() + ",adapter=" + this.f578b + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class y implements c.b.b.u {

        /* renamed from: a */
        final /* synthetic */ Class f579a;

        /* renamed from: b */
        final /* synthetic */ Class f580b;

        /* renamed from: c */
        final /* synthetic */ c.b.b.t f581c;

        y(Class cls, Class cls2, c.b.b.t tVar) {
            this.f579a = cls;
            this.f580b = cls2;
            this.f581c = tVar;
        }

        @Override // c.b.b.u
        public <T> c.b.b.t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            Class<? super T> c2 = aVar.c();
            if (c2 == this.f579a || c2 == this.f580b) {
                return this.f581c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f580b.getName() + "+" + this.f579a.getName() + ",adapter=" + this.f581c + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class z implements c.b.b.u {

        /* renamed from: a */
        final /* synthetic */ Class f582a;

        /* renamed from: b */
        final /* synthetic */ Class f583b;

        /* renamed from: c */
        final /* synthetic */ c.b.b.t f584c;

        z(Class cls, Class cls2, c.b.b.t tVar) {
            this.f582a = cls;
            this.f583b = cls2;
            this.f584c = tVar;
        }

        @Override // c.b.b.u
        public <T> c.b.b.t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            Class<? super T> c2 = aVar.c();
            if (c2 == this.f582a || c2 == this.f583b) {
                return this.f584c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f582a.getName() + "+" + this.f583b.getName() + ",adapter=" + this.f584c + "]";
        }
    }

    static {
        c.b.b.t<Class> a2 = new k().a();
        f564a = a2;
        f565b = a(Class.class, a2);
        c.b.b.t<BitSet> a3 = new v().a();
        f566c = a3;
        f567d = a(BitSet.class, a3);
        c0 c0Var = new c0();
        f568e = c0Var;
        g = b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        h = e0Var;
        i = b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        j = f0Var;
        k = b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        l = g0Var;
        m = b(Integer.TYPE, Integer.class, g0Var);
        c.b.b.t<AtomicInteger> a4 = new h0().a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        c.b.b.t<AtomicBoolean> a5 = new i0().a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        c.b.b.t<AtomicIntegerArray> a6 = new a().a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        C0031n c0031n = new C0031n();
        K = c0031n;
        L = a(URI.class, c0031n);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        c.b.b.t<Currency> a7 = new q().a();
        Q = a7;
        R = a(Currency.class, a7);
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(c.b.b.j.class, uVar);
    }

    public static <TT> c.b.b.u a(Class<TT> cls, c.b.b.t<TT> tVar) {
        return new x(cls, tVar);
    }

    public static <TT> c.b.b.u b(Class<TT> cls, Class<TT> cls2, c.b.b.t<? super TT> tVar) {
        return new y(cls, cls2, tVar);
    }

    public static <TT> c.b.b.u c(Class<TT> cls, Class<? extends TT> cls2, c.b.b.t<? super TT> tVar) {
        return new z(cls, cls2, tVar);
    }

    public static <T1> c.b.b.u d(Class<T1> cls, c.b.b.t<T1> tVar) {
        return new a0(cls, tVar);
    }
}
