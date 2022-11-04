package oj;

import java.util.HashMap;
import java.util.Map;
import nh.c0;
import org.conscrypt.PSKKeyManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    private static Map<String, gg.v> f18497a = new HashMap();

    /* renamed from: b */
    private static Map<gg.v, String> f18498b = new HashMap();

    static {
        Map<String, gg.v> map = f18497a;
        gg.v vVar = ug.b.f23635c;
        map.put("SHA-256", vVar);
        Map<String, gg.v> map2 = f18497a;
        gg.v vVar2 = ug.b.f23639e;
        map2.put("SHA-512", vVar2);
        Map<String, gg.v> map3 = f18497a;
        gg.v vVar3 = ug.b.f23655m;
        map3.put("SHAKE128", vVar3);
        Map<String, gg.v> map4 = f18497a;
        gg.v vVar4 = ug.b.f23657n;
        map4.put("SHAKE256", vVar4);
        f18498b.put(vVar, "SHA-256");
        f18498b.put(vVar2, "SHA-512");
        f18498b.put(vVar3, "SHAKE128");
        f18498b.put(vVar4, "SHAKE256");
    }

    public static org.bouncycastle.crypto.r a(gg.v vVar) {
        if (vVar.s(ug.b.f23635c)) {
            return new nh.x();
        }
        if (vVar.s(ug.b.f23639e)) {
            return new nh.a0();
        }
        if (vVar.s(ug.b.f23655m)) {
            return new c0(128);
        }
        if (vVar.s(ug.b.f23657n)) {
            return new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + vVar);
    }

    public static String b(gg.v vVar) {
        String str = f18498b.get(vVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + vVar);
    }

    public static gg.v c(String str) {
        gg.v vVar = f18497a.get(str);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
