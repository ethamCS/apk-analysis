package ng;

import ak.q;
import bk.f;
import gg.v;
import ih.i;
import ih.j;
import ih.k;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import ti.e;
import ti.x;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    static j f17017a = new C0267a();

    /* renamed from: b */
    static j f17018b = new b();

    /* renamed from: c */
    static final Hashtable f17019c = new Hashtable();

    /* renamed from: d */
    static final Hashtable f17020d = new Hashtable();

    /* renamed from: e */
    static final Hashtable f17021e = new Hashtable();

    /* renamed from: ng.a$a */
    /* loaded from: classes3.dex */
    static class C0267a extends j {
        C0267a() {
        }

        @Override // ih.j
        protected i a() {
            BigInteger g10 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger g11 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger g12 = a.g("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger g13 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e10 = a.e(new e.f(g10, g11, g12, g13, valueOf));
            return new i(e10, a.d(e10, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), g13, valueOf, null);
        }
    }

    /* loaded from: classes3.dex */
    static class b extends j {
        b() {
        }

        @Override // ih.j
        protected i a() {
            BigInteger g10 = a.g("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger g11 = a.g("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger g12 = a.g("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger g13 = a.g("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e10 = a.e(new e.f(g10, g11, g12, g13, valueOf));
            return new i(e10, a.d(e10, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), g13, valueOf, null);
        }
    }

    static {
        f("wapip192v1", ng.b.J, f17018b);
        f("sm2p256v1", ng.b.F, f17017a);
    }

    public static k d(e eVar, String str) {
        k kVar = new k(eVar, f.b(str));
        x.c(kVar.l());
        return kVar;
    }

    public static e e(e eVar) {
        return eVar;
    }

    static void f(String str, v vVar, j jVar) {
        f17019c.put(q.g(str), vVar);
        f17021e.put(vVar, str);
        f17020d.put(vVar, jVar);
    }

    public static BigInteger g(String str) {
        return new BigInteger(1, f.b(str));
    }

    public static i h(String str) {
        v l10 = l(str);
        if (l10 == null) {
            return null;
        }
        return i(l10);
    }

    public static i i(v vVar) {
        j jVar = (j) f17020d.get(vVar);
        if (jVar == null) {
            return null;
        }
        return jVar.b();
    }

    public static String j(v vVar) {
        return (String) f17021e.get(vVar);
    }

    public static Enumeration k() {
        return f17021e.elements();
    }

    public static v l(String str) {
        return (v) f17019c.get(q.g(str));
    }
}
