package gd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.p0;
import ub.q0;
import ub.y0;
import ub.z0;
/* loaded from: classes.dex */
public class h0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final List<a.C0161a> f10706a;

    /* renamed from: b */
    private static final List<String> f10707b;

    /* renamed from: c */
    private static final List<String> f10708c;

    /* renamed from: d */
    private static final Map<a.C0161a, c> f10709d;

    /* renamed from: e */
    private static final Map<String, c> f10710e;

    /* renamed from: f */
    private static final Set<wd.f> f10711f;

    /* renamed from: g */
    private static final Set<String> f10712g;

    /* renamed from: h */
    private static final a.C0161a f10713h;

    /* renamed from: i */
    private static final Map<a.C0161a, wd.f> f10714i;

    /* renamed from: j */
    private static final Map<String, wd.f> f10715j;

    /* renamed from: k */
    private static final List<wd.f> f10716k;

    /* renamed from: l */
    private static final Map<wd.f, wd.f> f10717l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: gd.h0$a$a */
        /* loaded from: classes.dex */
        public static final class C0161a {

            /* renamed from: a */
            private final wd.f f10718a;

            /* renamed from: b */
            private final String f10719b;

            public C0161a(wd.f fVar, String str) {
                hc.t.e(fVar, "name");
                hc.t.e(str, "signature");
                this.f10718a = fVar;
                this.f10719b = str;
            }

            public final wd.f a() {
                return this.f10718a;
            }

            public final String b() {
                return this.f10719b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0161a)) {
                    return false;
                }
                C0161a c0161a = (C0161a) obj;
                return hc.t.a(this.f10718a, c0161a.f10718a) && hc.t.a(this.f10719b, c0161a.f10719b);
            }

            public int hashCode() {
                return (this.f10718a.hashCode() * 31) + this.f10719b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f10718a + ", signature=" + this.f10719b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0161a m(String str, String str2, String str3, String str4) {
            wd.f j10 = wd.f.j(str2);
            hc.t.d(j10, "identifier(name)");
            pd.x xVar = pd.x.f19141a;
            return new C0161a(j10, xVar.k(str, str2 + '(' + str3 + ')' + str4));
        }

        public final wd.f b(wd.f fVar) {
            hc.t.e(fVar, "name");
            return f().get(fVar);
        }

        public final List<String> c() {
            return h0.f10707b;
        }

        public final Set<wd.f> d() {
            return h0.f10711f;
        }

        public final Set<String> e() {
            return h0.f10712g;
        }

        public final Map<wd.f, wd.f> f() {
            return h0.f10717l;
        }

        public final List<wd.f> g() {
            return h0.f10716k;
        }

        public final C0161a h() {
            return h0.f10713h;
        }

        public final Map<String, c> i() {
            return h0.f10710e;
        }

        public final Map<String, wd.f> j() {
            return h0.f10715j;
        }

        public final boolean k(wd.f fVar) {
            hc.t.e(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String str) {
            Object i10;
            hc.t.e(str, "builtinSignature");
            if (c().contains(str)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            i10 = q0.i(i(), str);
            return ((c) i10) == c.f10725d ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        

        /* renamed from: c */
        private final String f10723c;

        /* renamed from: d */
        private final boolean f10724d;

        b(String str, boolean z10) {
            this.f10723c = str;
            this.f10724d = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Enum<c> {

        /* renamed from: c */
        private final Object f10729c;

        /* renamed from: d */
        public static final c f10725d = new c("NULL", 0, null);

        /* renamed from: q */
        public static final c f10726q = new c("INDEX", 1, -1);

        /* renamed from: x */
        public static final c f10727x = new c("FALSE", 2, Boolean.FALSE);

        /* renamed from: y */
        public static final c f10728y = new a("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ c[] U3 = b();

        /* loaded from: classes.dex */
        static final class a extends c {
            a(String str, int i10) {
                super(str, i10, null, null);
            }
        }

        private c(String str, int i10, Object obj) {
            super(str, i10);
            this.f10729c = obj;
        }

        public /* synthetic */ c(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ c[] b() {
            return new c[]{f10725d, f10726q, f10727x, f10728y};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) U3.clone();
        }
    }

    static {
        Set<String> e10;
        int s10;
        int s11;
        int s12;
        Map<a.C0161a, c> k10;
        int d10;
        Set<a.C0161a> h10;
        int s13;
        Set<wd.f> J0;
        int s14;
        Set<String> J02;
        Map<a.C0161a, wd.f> k11;
        int d11;
        int s15;
        int s16;
        int s17;
        int d12;
        int b10;
        e10 = y0.e("containsAll", "removeAll", "retainAll");
        s10 = ub.v.s(e10, 10);
        ArrayList<a.C0161a> arrayList = new ArrayList(s10);
        for (String str : e10) {
            a aVar = Companion;
            String j10 = fe.e.BOOLEAN.j();
            hc.t.d(j10, "BOOLEAN.desc");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", j10));
        }
        f10706a = arrayList;
        s11 = ub.v.s(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (a.C0161a c0161a : arrayList) {
            arrayList2.add(c0161a.b());
        }
        f10707b = arrayList2;
        List<a.C0161a> list = f10706a;
        s12 = ub.v.s(list, 10);
        ArrayList arrayList3 = new ArrayList(s12);
        for (a.C0161a c0161a2 : list) {
            arrayList3.add(c0161a2.a().b());
        }
        f10708c = arrayList3;
        pd.x xVar = pd.x.f19141a;
        a aVar2 = Companion;
        String i10 = xVar.i("Collection");
        fe.e eVar = fe.e.BOOLEAN;
        String j11 = eVar.j();
        hc.t.d(j11, "BOOLEAN.desc");
        a.C0161a m10 = aVar2.m(i10, "contains", "Ljava/lang/Object;", j11);
        c cVar = c.f10727x;
        String i11 = xVar.i("Collection");
        String j12 = eVar.j();
        hc.t.d(j12, "BOOLEAN.desc");
        String i12 = xVar.i("Map");
        String j13 = eVar.j();
        hc.t.d(j13, "BOOLEAN.desc");
        String i13 = xVar.i("Map");
        String j14 = eVar.j();
        hc.t.d(j14, "BOOLEAN.desc");
        String i14 = xVar.i("Map");
        String j15 = eVar.j();
        hc.t.d(j15, "BOOLEAN.desc");
        a.C0161a m11 = aVar2.m(xVar.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f10725d;
        String i15 = xVar.i("List");
        fe.e eVar2 = fe.e.INT;
        String j16 = eVar2.j();
        hc.t.d(j16, "INT.desc");
        a.C0161a m12 = aVar2.m(i15, "indexOf", "Ljava/lang/Object;", j16);
        c cVar3 = c.f10726q;
        String i16 = xVar.i("List");
        String j17 = eVar2.j();
        hc.t.d(j17, "INT.desc");
        k10 = q0.k(tb.x.a(m10, cVar), tb.x.a(aVar2.m(i11, "remove", "Ljava/lang/Object;", j12), cVar), tb.x.a(aVar2.m(i12, "containsKey", "Ljava/lang/Object;", j13), cVar), tb.x.a(aVar2.m(i13, "containsValue", "Ljava/lang/Object;", j14), cVar), tb.x.a(aVar2.m(i14, "remove", "Ljava/lang/Object;Ljava/lang/Object;", j15), cVar), tb.x.a(aVar2.m(xVar.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f10728y), tb.x.a(m11, cVar2), tb.x.a(aVar2.m(xVar.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), tb.x.a(m12, cVar3), tb.x.a(aVar2.m(i16, "lastIndexOf", "Ljava/lang/Object;", j17), cVar3));
        f10709d = k10;
        d10 = p0.d(k10.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        Iterator<T> it = k10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((a.C0161a) entry.getKey()).b(), entry.getValue());
        }
        f10710e = linkedHashMap;
        h10 = z0.h(f10709d.keySet(), f10706a);
        s13 = ub.v.s(h10, 10);
        ArrayList arrayList4 = new ArrayList(s13);
        for (a.C0161a c0161a3 : h10) {
            arrayList4.add(c0161a3.a());
        }
        J0 = ub.c0.J0(arrayList4);
        f10711f = J0;
        s14 = ub.v.s(h10, 10);
        ArrayList arrayList5 = new ArrayList(s14);
        for (a.C0161a c0161a4 : h10) {
            arrayList5.add(c0161a4.b());
        }
        J02 = ub.c0.J0(arrayList5);
        f10712g = J02;
        a aVar3 = Companion;
        fe.e eVar3 = fe.e.INT;
        String j18 = eVar3.j();
        hc.t.d(j18, "INT.desc");
        a.C0161a m13 = aVar3.m("java/util/List", "removeAt", j18, "Ljava/lang/Object;");
        f10713h = m13;
        pd.x xVar2 = pd.x.f19141a;
        String h11 = xVar2.h("Number");
        String j19 = fe.e.BYTE.j();
        hc.t.d(j19, "BYTE.desc");
        String h12 = xVar2.h("Number");
        String j20 = fe.e.SHORT.j();
        hc.t.d(j20, "SHORT.desc");
        String h13 = xVar2.h("Number");
        String j21 = eVar3.j();
        hc.t.d(j21, "INT.desc");
        String h14 = xVar2.h("Number");
        String j22 = fe.e.LONG.j();
        hc.t.d(j22, "LONG.desc");
        String h15 = xVar2.h("Number");
        String j23 = fe.e.FLOAT.j();
        hc.t.d(j23, "FLOAT.desc");
        String h16 = xVar2.h("Number");
        String j24 = fe.e.DOUBLE.j();
        hc.t.d(j24, "DOUBLE.desc");
        String h17 = xVar2.h("CharSequence");
        String j25 = eVar3.j();
        hc.t.d(j25, "INT.desc");
        String j26 = fe.e.CHAR.j();
        hc.t.d(j26, "CHAR.desc");
        k11 = q0.k(tb.x.a(aVar3.m(h11, "toByte", BuildConfig.FLAVOR, j19), wd.f.j("byteValue")), tb.x.a(aVar3.m(h12, "toShort", BuildConfig.FLAVOR, j20), wd.f.j("shortValue")), tb.x.a(aVar3.m(h13, "toInt", BuildConfig.FLAVOR, j21), wd.f.j("intValue")), tb.x.a(aVar3.m(h14, "toLong", BuildConfig.FLAVOR, j22), wd.f.j("longValue")), tb.x.a(aVar3.m(h15, "toFloat", BuildConfig.FLAVOR, j23), wd.f.j("floatValue")), tb.x.a(aVar3.m(h16, "toDouble", BuildConfig.FLAVOR, j24), wd.f.j("doubleValue")), tb.x.a(m13, wd.f.j("remove")), tb.x.a(aVar3.m(h17, "get", j25, j26), wd.f.j("charAt")));
        f10714i = k11;
        d11 = p0.d(k11.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d11);
        Iterator<T> it2 = k11.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(((a.C0161a) entry2.getKey()).b(), entry2.getValue());
        }
        f10715j = linkedHashMap2;
        Set<a.C0161a> keySet = f10714i.keySet();
        s15 = ub.v.s(keySet, 10);
        ArrayList arrayList6 = new ArrayList(s15);
        for (a.C0161a c0161a5 : keySet) {
            arrayList6.add(c0161a5.a());
        }
        f10716k = arrayList6;
        Set<Map.Entry<a.C0161a, wd.f>> entrySet = f10714i.entrySet();
        s16 = ub.v.s(entrySet, 10);
        ArrayList<tb.r> arrayList7 = new ArrayList(s16);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            arrayList7.add(new tb.r(((a.C0161a) entry3.getKey()).a(), entry3.getValue()));
        }
        s17 = ub.v.s(arrayList7, 10);
        d12 = p0.d(s17);
        b10 = nc.m.b(d12, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(b10);
        for (tb.r rVar : arrayList7) {
            linkedHashMap3.put((wd.f) rVar.f(), (wd.f) rVar.e());
        }
        f10717l = linkedHashMap3;
    }
}
