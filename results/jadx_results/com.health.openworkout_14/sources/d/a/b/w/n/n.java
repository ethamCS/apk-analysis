package d.a.b.w.n;

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
    public static final d.a.b.t<String> A;
    public static final d.a.b.u D;
    public static final d.a.b.t<StringBuilder> E;
    public static final d.a.b.u F;
    public static final d.a.b.t<StringBuffer> G;
    public static final d.a.b.u H;
    public static final d.a.b.t<URL> I;
    public static final d.a.b.u J;
    public static final d.a.b.t<URI> K;
    public static final d.a.b.u L;
    public static final d.a.b.t<InetAddress> M;
    public static final d.a.b.u N;
    public static final d.a.b.t<UUID> O;
    public static final d.a.b.u P;
    public static final d.a.b.t<Currency> Q;
    public static final d.a.b.u R;
    public static final d.a.b.t<Calendar> T;
    public static final d.a.b.u U;
    public static final d.a.b.t<Locale> V;
    public static final d.a.b.u W;
    public static final d.a.b.t<d.a.b.j> X;
    public static final d.a.b.u Y;

    /* renamed from: a */
    public static final d.a.b.t<Class> f3860a;

    /* renamed from: b */
    public static final d.a.b.u f3861b;

    /* renamed from: c */
    public static final d.a.b.t<BitSet> f3862c;

    /* renamed from: d */
    public static final d.a.b.u f3863d;

    /* renamed from: e */
    public static final d.a.b.t<Boolean> f3864e;

    /* renamed from: g */
    public static final d.a.b.u f3866g;

    /* renamed from: h */
    public static final d.a.b.t<Number> f3867h;
    public static final d.a.b.u i;
    public static final d.a.b.t<Number> j;
    public static final d.a.b.u k;
    public static final d.a.b.t<Number> l;
    public static final d.a.b.u m;
    public static final d.a.b.t<AtomicInteger> n;
    public static final d.a.b.u o;
    public static final d.a.b.t<AtomicBoolean> p;
    public static final d.a.b.u q;
    public static final d.a.b.t<AtomicIntegerArray> r;
    public static final d.a.b.u s;
    public static final d.a.b.t<Number> w;
    public static final d.a.b.u x;
    public static final d.a.b.t<Character> y;
    public static final d.a.b.u z;

    /* renamed from: f */
    public static final d.a.b.t<Boolean> f3865f = new d0();
    public static final d.a.b.t<Number> t = new b();
    public static final d.a.b.t<Number> u = new c();
    public static final d.a.b.t<Number> v = new d();
    public static final d.a.b.t<BigDecimal> B = new h();
    public static final d.a.b.t<BigInteger> C = new i();
    public static final d.a.b.u S = new r();
    public static final d.a.b.u Z = new w();

    /* loaded from: classes.dex */
    static class a extends d.a.b.t<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray b(d.a.b.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.i0()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.o0()));
                } catch (NumberFormatException e2) {
                    throw new d.a.b.r(e2);
                }
            }
            aVar.f0();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.k();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.w0(atomicIntegerArray.get(i));
            }
            cVar.f0();
        }
    }

    /* loaded from: classes.dex */
    public static class a0 implements d.a.b.u {

        /* renamed from: b */
        final /* synthetic */ Class f3868b;

        /* renamed from: c */
        final /* synthetic */ d.a.b.t f3869c;

        /* loaded from: classes.dex */
        class a extends d.a.b.t<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f3870a;

            a(Class cls) {
                a0.this = r1;
                this.f3870a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // d.a.b.t
            public T1 b(d.a.b.y.a aVar) {
                ?? b2 = a0.this.f3869c.b(aVar);
                if (b2 == 0 || this.f3870a.isInstance(b2)) {
                    return b2;
                }
                throw new d.a.b.r("Expected a " + this.f3870a.getName() + " but was " + b2.getClass().getName());
            }

            @Override // d.a.b.t
            public void d(d.a.b.y.c cVar, T1 t1) {
                a0.this.f3869c.d(cVar, t1);
            }
        }

        a0(Class cls, d.a.b.t tVar) {
            this.f3868b = cls;
            this.f3869c = tVar;
        }

        @Override // d.a.b.u
        public <T2> d.a.b.t<T2> b(d.a.b.e eVar, d.a.b.x.a<T2> aVar) {
            Class<? super T2> c2 = aVar.c();
            if (!this.f3868b.isAssignableFrom(c2)) {
                return null;
            }
            return new a(c2);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f3868b.getName() + ",adapter=" + this.f3869c + "]";
        }
    }

    /* loaded from: classes.dex */
    static class b extends d.a.b.t<Number> {
        b() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Long.valueOf(aVar.p0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3872a;

        static {
            int[] iArr = new int[d.a.b.y.b.values().length];
            f3872a = iArr;
            try {
                iArr[d.a.b.y.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3872a[d.a.b.y.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3872a[d.a.b.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3872a[d.a.b.y.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3872a[d.a.b.y.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3872a[d.a.b.y.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3872a[d.a.b.y.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3872a[d.a.b.y.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3872a[d.a.b.y.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3872a[d.a.b.y.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends d.a.b.t<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Float.valueOf((float) aVar.n0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class c0 extends d.a.b.t<Boolean> {
        c0() {
        }

        /* renamed from: e */
        public Boolean b(d.a.b.y.a aVar) {
            d.a.b.y.b w0 = aVar.w0();
            if (w0 != d.a.b.y.b.NULL) {
                return w0 == d.a.b.y.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.u0())) : Boolean.valueOf(aVar.m0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Boolean bool) {
            cVar.x0(bool);
        }
    }

    /* loaded from: classes.dex */
    static class d extends d.a.b.t<Number> {
        d() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Double.valueOf(aVar.n0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class d0 extends d.a.b.t<Boolean> {
        d0() {
        }

        /* renamed from: e */
        public Boolean b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return Boolean.valueOf(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Boolean bool) {
            cVar.z0(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: classes.dex */
    static class e extends d.a.b.t<Number> {
        e() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            d.a.b.y.b w0 = aVar.w0();
            int i = b0.f3872a[w0.ordinal()];
            if (i == 1 || i == 3) {
                return new d.a.b.w.g(aVar.u0());
            }
            if (i == 4) {
                aVar.s0();
                return null;
            }
            throw new d.a.b.r("Expecting number, got: " + w0);
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class e0 extends d.a.b.t<Number> {
        e0() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.o0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class f extends d.a.b.t<Character> {
        f() {
        }

        /* renamed from: e */
        public Character b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            String u0 = aVar.u0();
            if (u0.length() == 1) {
                return Character.valueOf(u0.charAt(0));
            }
            throw new d.a.b.r("Expecting character, got: " + u0);
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Character ch) {
            cVar.z0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: classes.dex */
    static class f0 extends d.a.b.t<Number> {
        f0() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.o0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class g extends d.a.b.t<String> {
        g() {
        }

        /* renamed from: e */
        public String b(d.a.b.y.a aVar) {
            d.a.b.y.b w0 = aVar.w0();
            if (w0 != d.a.b.y.b.NULL) {
                return w0 == d.a.b.y.b.BOOLEAN ? Boolean.toString(aVar.m0()) : aVar.u0();
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, String str) {
            cVar.z0(str);
        }
    }

    /* loaded from: classes.dex */
    static class g0 extends d.a.b.t<Number> {
        g0() {
        }

        /* renamed from: e */
        public Number b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.o0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Number number) {
            cVar.y0(number);
        }
    }

    /* loaded from: classes.dex */
    static class h extends d.a.b.t<BigDecimal> {
        h() {
        }

        /* renamed from: e */
        public BigDecimal b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return new BigDecimal(aVar.u0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, BigDecimal bigDecimal) {
            cVar.y0(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    static class h0 extends d.a.b.t<AtomicInteger> {
        h0() {
        }

        /* renamed from: e */
        public AtomicInteger b(d.a.b.y.a aVar) {
            try {
                return new AtomicInteger(aVar.o0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, AtomicInteger atomicInteger) {
            cVar.w0(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    static class i extends d.a.b.t<BigInteger> {
        i() {
        }

        /* renamed from: e */
        public BigInteger b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return new BigInteger(aVar.u0());
            } catch (NumberFormatException e2) {
                throw new d.a.b.r(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, BigInteger bigInteger) {
            cVar.y0(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    static class i0 extends d.a.b.t<AtomicBoolean> {
        i0() {
        }

        /* renamed from: e */
        public AtomicBoolean b(d.a.b.y.a aVar) {
            return new AtomicBoolean(aVar.m0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, AtomicBoolean atomicBoolean) {
            cVar.A0(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    static class j extends d.a.b.t<StringBuilder> {
        j() {
        }

        /* renamed from: e */
        public StringBuilder b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return new StringBuilder(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, StringBuilder sb) {
            cVar.z0(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: classes.dex */
    private static final class j0<T extends Enum<T>> extends d.a.b.t<T> {

        /* renamed from: a */
        private final Map<String, T> f3873a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f3874b = new HashMap();

        public j0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    d.a.b.v.c cVar = (d.a.b.v.c) cls.getField(name).getAnnotation(d.a.b.v.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f3873a.put(str, t);
                        }
                    }
                    this.f3873a.put(name, t);
                    this.f3874b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public T b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return this.f3873a.get(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, T t) {
            cVar.z0(t == null ? null : this.f3874b.get(t));
        }
    }

    /* loaded from: classes.dex */
    static class k extends d.a.b.t<Class> {
        k() {
        }

        @Override // d.a.b.t
        public /* bridge */ /* synthetic */ Class b(d.a.b.y.a aVar) {
            e(aVar);
            throw null;
        }

        @Override // d.a.b.t
        public /* bridge */ /* synthetic */ void d(d.a.b.y.c cVar, Class cls) {
            f(cVar, cls);
            throw null;
        }

        public Class e(d.a.b.y.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void f(d.a.b.y.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes.dex */
    static class l extends d.a.b.t<StringBuffer> {
        l() {
        }

        /* renamed from: e */
        public StringBuffer b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return new StringBuffer(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, StringBuffer stringBuffer) {
            cVar.z0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes.dex */
    static class m extends d.a.b.t<URL> {
        m() {
        }

        /* renamed from: e */
        public URL b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            String u0 = aVar.u0();
            if (!"null".equals(u0)) {
                return new URL(u0);
            }
            return null;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, URL url) {
            cVar.z0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: d.a.b.w.n.n$n */
    /* loaded from: classes.dex */
    static class C0111n extends d.a.b.t<URI> {
        C0111n() {
        }

        /* renamed from: e */
        public URI b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                String u0 = aVar.u0();
                if (!"null".equals(u0)) {
                    return new URI(u0);
                }
                return null;
            } catch (URISyntaxException e2) {
                throw new d.a.b.k(e2);
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, URI uri) {
            cVar.z0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* loaded from: classes.dex */
    static class o extends d.a.b.t<InetAddress> {
        o() {
        }

        /* renamed from: e */
        public InetAddress b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return InetAddress.getByName(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, InetAddress inetAddress) {
            cVar.z0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    static class p extends d.a.b.t<UUID> {
        p() {
        }

        /* renamed from: e */
        public UUID b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return UUID.fromString(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, UUID uuid) {
            cVar.z0(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes.dex */
    static class q extends d.a.b.t<Currency> {
        q() {
        }

        /* renamed from: e */
        public Currency b(d.a.b.y.a aVar) {
            return Currency.getInstance(aVar.u0());
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Currency currency) {
            cVar.z0(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    static class r implements d.a.b.u {

        /* loaded from: classes.dex */
        class a extends d.a.b.t<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ d.a.b.t f3875a;

            a(r rVar, d.a.b.t tVar) {
                this.f3875a = tVar;
            }

            /* renamed from: e */
            public Timestamp b(d.a.b.y.a aVar) {
                Date date = (Date) this.f3875a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: f */
            public void d(d.a.b.y.c cVar, Timestamp timestamp) {
                this.f3875a.d(cVar, timestamp);
            }
        }

        r() {
        }

        @Override // d.a.b.u
        public <T> d.a.b.t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(this, eVar.l(Date.class));
        }
    }

    /* loaded from: classes.dex */
    static class s extends d.a.b.t<Calendar> {
        s() {
        }

        /* renamed from: e */
        public Calendar b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            aVar.c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.w0() != d.a.b.y.b.END_OBJECT) {
                String q0 = aVar.q0();
                int o0 = aVar.o0();
                if ("year".equals(q0)) {
                    i = o0;
                } else if ("month".equals(q0)) {
                    i2 = o0;
                } else if ("dayOfMonth".equals(q0)) {
                    i3 = o0;
                } else if ("hourOfDay".equals(q0)) {
                    i4 = o0;
                } else if ("minute".equals(q0)) {
                    i5 = o0;
                } else if ("second".equals(q0)) {
                    i6 = o0;
                }
            }
            aVar.g0();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.m0();
                return;
            }
            cVar.I();
            cVar.k0("year");
            cVar.w0(calendar.get(1));
            cVar.k0("month");
            cVar.w0(calendar.get(2));
            cVar.k0("dayOfMonth");
            cVar.w0(calendar.get(5));
            cVar.k0("hourOfDay");
            cVar.w0(calendar.get(11));
            cVar.k0("minute");
            cVar.w0(calendar.get(12));
            cVar.k0("second");
            cVar.w0(calendar.get(13));
            cVar.g0();
        }
    }

    /* loaded from: classes.dex */
    static class t extends d.a.b.t<Locale> {
        t() {
        }

        /* renamed from: e */
        public Locale b(d.a.b.y.a aVar) {
            String str = null;
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.u0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Locale locale) {
            cVar.z0(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes.dex */
    static class u extends d.a.b.t<d.a.b.j> {
        u() {
        }

        /* renamed from: e */
        public d.a.b.j b(d.a.b.y.a aVar) {
            switch (b0.f3872a[aVar.w0().ordinal()]) {
                case 1:
                    return new d.a.b.o(new d.a.b.w.g(aVar.u0()));
                case 2:
                    return new d.a.b.o(Boolean.valueOf(aVar.m0()));
                case 3:
                    return new d.a.b.o(aVar.u0());
                case 4:
                    aVar.s0();
                    return d.a.b.l.f3742a;
                case 5:
                    d.a.b.g gVar = new d.a.b.g();
                    aVar.a();
                    while (aVar.i0()) {
                        gVar.h(b(aVar));
                    }
                    aVar.f0();
                    return gVar;
                case 6:
                    d.a.b.m mVar = new d.a.b.m();
                    aVar.c();
                    while (aVar.i0()) {
                        mVar.h(aVar.q0(), b(aVar));
                    }
                    aVar.g0();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, d.a.b.j jVar) {
            if (jVar == null || jVar.e()) {
                cVar.m0();
            } else if (jVar.g()) {
                d.a.b.o c2 = jVar.c();
                if (c2.q()) {
                    cVar.y0(c2.m());
                } else if (c2.o()) {
                    cVar.A0(c2.h());
                } else {
                    cVar.z0(c2.n());
                }
            } else if (jVar.d()) {
                cVar.k();
                Iterator<d.a.b.j> it = jVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.f0();
            } else if (!jVar.f()) {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            } else {
                cVar.I();
                for (Map.Entry<String, d.a.b.j> entry : jVar.b().i()) {
                    cVar.k0(entry.getKey());
                    d(cVar, entry.getValue());
                }
                cVar.g0();
            }
        }
    }

    /* loaded from: classes.dex */
    static class v extends d.a.b.t<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.o0() != 0) goto L22;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet b(d.a.b.y.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                d.a.b.y.b r1 = r8.w0()
                r2 = 0
                r3 = 0
            Le:
                d.a.b.y.b r4 = d.a.b.y.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = d.a.b.w.n.n.b0.f3872a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.u0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                d.a.b.r r8 = new d.a.b.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                d.a.b.r r8 = new d.a.b.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.m0()
                goto L69
            L63:
                int r1 = r8.o0()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                d.a.b.y.b r1 = r8.w0()
                goto Le
            L75:
                r8.f0()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.b.w.n.n.v.b(d.a.b.y.a):java.util.BitSet");
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, BitSet bitSet) {
            cVar.k();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.w0(bitSet.get(i) ? 1L : 0L);
            }
            cVar.f0();
        }
    }

    /* loaded from: classes.dex */
    static class w implements d.a.b.u {
        w() {
        }

        @Override // d.a.b.u
        public <T> d.a.b.t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
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
    public static class x implements d.a.b.u {

        /* renamed from: b */
        final /* synthetic */ Class f3876b;

        /* renamed from: c */
        final /* synthetic */ d.a.b.t f3877c;

        x(Class cls, d.a.b.t tVar) {
            this.f3876b = cls;
            this.f3877c = tVar;
        }

        @Override // d.a.b.u
        public <T> d.a.b.t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() == this.f3876b) {
                return this.f3877c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3876b.getName() + ",adapter=" + this.f3877c + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class y implements d.a.b.u {

        /* renamed from: b */
        final /* synthetic */ Class f3878b;

        /* renamed from: c */
        final /* synthetic */ Class f3879c;

        /* renamed from: d */
        final /* synthetic */ d.a.b.t f3880d;

        y(Class cls, Class cls2, d.a.b.t tVar) {
            this.f3878b = cls;
            this.f3879c = cls2;
            this.f3880d = tVar;
        }

        @Override // d.a.b.u
        public <T> d.a.b.t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            Class<? super T> c2 = aVar.c();
            if (c2 == this.f3878b || c2 == this.f3879c) {
                return this.f3880d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3879c.getName() + "+" + this.f3878b.getName() + ",adapter=" + this.f3880d + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class z implements d.a.b.u {

        /* renamed from: b */
        final /* synthetic */ Class f3881b;

        /* renamed from: c */
        final /* synthetic */ Class f3882c;

        /* renamed from: d */
        final /* synthetic */ d.a.b.t f3883d;

        z(Class cls, Class cls2, d.a.b.t tVar) {
            this.f3881b = cls;
            this.f3882c = cls2;
            this.f3883d = tVar;
        }

        @Override // d.a.b.u
        public <T> d.a.b.t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            Class<? super T> c2 = aVar.c();
            if (c2 == this.f3881b || c2 == this.f3882c) {
                return this.f3883d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3881b.getName() + "+" + this.f3882c.getName() + ",adapter=" + this.f3883d + "]";
        }
    }

    static {
        d.a.b.t<Class> a2 = new k().a();
        f3860a = a2;
        f3861b = a(Class.class, a2);
        d.a.b.t<BitSet> a3 = new v().a();
        f3862c = a3;
        f3863d = a(BitSet.class, a3);
        c0 c0Var = new c0();
        f3864e = c0Var;
        f3866g = b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f3867h = e0Var;
        i = b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        j = f0Var;
        k = b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        l = g0Var;
        m = b(Integer.TYPE, Integer.class, g0Var);
        d.a.b.t<AtomicInteger> a4 = new h0().a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        d.a.b.t<AtomicBoolean> a5 = new i0().a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        d.a.b.t<AtomicIntegerArray> a6 = new a().a();
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
        C0111n c0111n = new C0111n();
        K = c0111n;
        L = a(URI.class, c0111n);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        d.a.b.t<Currency> a7 = new q().a();
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
        Y = d(d.a.b.j.class, uVar);
    }

    public static <TT> d.a.b.u a(Class<TT> cls, d.a.b.t<TT> tVar) {
        return new x(cls, tVar);
    }

    public static <TT> d.a.b.u b(Class<TT> cls, Class<TT> cls2, d.a.b.t<? super TT> tVar) {
        return new y(cls, cls2, tVar);
    }

    public static <TT> d.a.b.u c(Class<TT> cls, Class<? extends TT> cls2, d.a.b.t<? super TT> tVar) {
        return new z(cls, cls2, tVar);
    }

    public static <T1> d.a.b.u d(Class<T1> cls, d.a.b.t<T1> tVar) {
        return new a0(cls, tVar);
    }
}
