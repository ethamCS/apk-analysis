package ei;

import gg.v;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import zh.c0;
import zh.y;
/* loaded from: classes3.dex */
public class i {

    /* renamed from: b */
    private static final Map<String, v> f9681b = Collections.unmodifiableMap(new a());

    /* renamed from: c */
    private static final Map<String, String> f9682c = Collections.unmodifiableMap(new b());

    /* renamed from: d */
    private static HashMap<ti.e, String> f9683d = new c();

    /* renamed from: a */
    private static final Map<v, String> f9680a = Collections.unmodifiableMap(new d());

    /* loaded from: classes3.dex */
    static class a extends HashMap<String, v> {
        a() {
            put("nistp256", bh.d.H);
            put("nistp384", bh.d.A);
            put("nistp521", bh.d.B);
            put("nistk163", bh.d.f6061b);
            put("nistp192", bh.d.G);
            put("nistp224", bh.d.f6085z);
            put("nistk233", bh.d.f6078s);
            put("nistb233", bh.d.f6079t);
            put("nistk283", bh.d.f6072m);
            put("nistk409", bh.d.C);
            put("nistb409", bh.d.D);
            put("nistt571", bh.d.E);
        }
    }

    /* loaded from: classes3.dex */
    static class b extends HashMap<String, String> {
        b() {
            String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
            for (int i10 = 0; i10 != 12; i10++) {
                String[] strArr2 = strArr[i10];
                put(strArr2[0], strArr2[1]);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class c extends HashMap<ti.e, String> {
        c() {
            Enumeration l10 = oh.a.l();
            while (l10.hasMoreElements()) {
                String str = (String) l10.nextElement();
                put(oh.a.i(str).l(), str);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class d extends HashMap<v, String> {
        d() {
            for (String str : i.f9681b.keySet()) {
                put(i.f9681b.get(str), str);
            }
        }
    }

    public static v b(String str) {
        return f9681b.get(str);
    }

    public static String c(v vVar) {
        return f9680a.get(vVar);
    }

    public static String d(ti.e eVar) {
        return f9682c.get(f9683d.get(eVar));
    }

    public static String e(y yVar) {
        return yVar instanceof c0 ? c(((c0) yVar).j()) : d(yVar.a());
    }

    public static ih.i f(v vVar) {
        return ug.a.c(vVar);
    }
}
