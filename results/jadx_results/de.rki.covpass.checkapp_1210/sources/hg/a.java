package hg;

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
    static j f11906a = new C0181a();

    /* renamed from: b */
    static final Hashtable f11907b = new Hashtable();

    /* renamed from: c */
    static final Hashtable f11908c = new Hashtable();

    /* renamed from: d */
    static final Hashtable f11909d = new Hashtable();

    /* renamed from: hg.a$a */
    /* loaded from: classes3.dex */
    static class C0181a extends j {
        C0181a() {
        }

        @Override // ih.j
        protected i a() {
            BigInteger g10 = a.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger g11 = a.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger g12 = a.g("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger g13 = a.g("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e10 = a.e(new e.f(g10, g11, g12, g13, valueOf));
            return new i(e10, a.d(e10, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), g13, valueOf, null);
        }
    }

    static {
        f("FRP256v1", b.f11910a, f11906a);
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
        f11907b.put(q.g(str), vVar);
        f11909d.put(vVar, str);
        f11908c.put(vVar, jVar);
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
        j jVar = (j) f11908c.get(vVar);
        if (jVar == null) {
            return null;
        }
        return jVar.b();
    }

    public static String j(v vVar) {
        return (String) f11909d.get(vVar);
    }

    public static Enumeration k() {
        return f11909d.elements();
    }

    public static v l(String str) {
        return (v) f11907b.get(q.g(str));
    }
}
