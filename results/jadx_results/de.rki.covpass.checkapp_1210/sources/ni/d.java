package ni;

import gg.v;
import java.util.HashMap;
import java.util.Map;
import zg.q;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    private static Map<v, String> f17326a;

    static {
        HashMap hashMap = new HashMap();
        f17326a = hashMap;
        hashMap.put(q.F1, "MD2");
        f17326a.put(q.G1, "MD4");
        f17326a.put(q.H1, "MD5");
        f17326a.put(yg.b.f26294i, "SHA-1");
        f17326a.put(ug.b.f23641f, "SHA-224");
        f17326a.put(ug.b.f23635c, "SHA-256");
        f17326a.put(ug.b.f23637d, "SHA-384");
        f17326a.put(ug.b.f23639e, "SHA-512");
        f17326a.put(ug.b.f23643g, "SHA-512(224)");
        f17326a.put(ug.b.f23645h, "SHA-512(256)");
        f17326a.put(ch.b.f6574c, "RIPEMD-128");
        f17326a.put(ch.b.f6573b, "RIPEMD-160");
        f17326a.put(ch.b.f6575d, "RIPEMD-128");
        f17326a.put(rg.a.f21206d, "RIPEMD-128");
        f17326a.put(rg.a.f21205c, "RIPEMD-160");
        f17326a.put(lg.a.f16018b, "GOST3411");
        f17326a.put(og.a.f18398g, "Tiger");
        f17326a.put(rg.a.f21207e, "Whirlpool");
        f17326a.put(ug.b.f23647i, "SHA3-224");
        f17326a.put(ug.b.f23649j, "SHA3-256");
        f17326a.put(ug.b.f23651k, "SHA3-384");
        f17326a.put(ug.b.f23653l, "SHA3-512");
        f17326a.put(ug.b.f23655m, "SHAKE128");
        f17326a.put(ug.b.f23657n, "SHAKE256");
        f17326a.put(ng.b.f17025b0, "SM3");
    }

    public static String a(v vVar) {
        String str = f17326a.get(vVar);
        return str != null ? str : vVar.H();
    }
}
