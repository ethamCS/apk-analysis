package gj;

import gg.v;
import java.util.HashMap;
import java.util.Map;
import nh.a0;
import nh.c0;
import nh.x;
import org.bouncycastle.crypto.r;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
class b {

    /* renamed from: a */
    private static Map<String, v> f11007a = new HashMap();

    /* renamed from: b */
    private static Map<v, String> f11008b = new HashMap();

    static {
        Map<String, v> map = f11007a;
        v vVar = ug.b.f23635c;
        map.put("SHA-256", vVar);
        Map<String, v> map2 = f11007a;
        v vVar2 = ug.b.f23639e;
        map2.put("SHA-512", vVar2);
        Map<String, v> map3 = f11007a;
        v vVar3 = ug.b.f23655m;
        map3.put("SHAKE128", vVar3);
        Map<String, v> map4 = f11007a;
        v vVar4 = ug.b.f23657n;
        map4.put("SHAKE256", vVar4);
        f11008b.put(vVar, "SHA-256");
        f11008b.put(vVar2, "SHA-512");
        f11008b.put(vVar3, "SHAKE128");
        f11008b.put(vVar4, "SHAKE256");
    }

    public static r a(v vVar) {
        if (vVar.s(ug.b.f23635c)) {
            return new x();
        }
        if (vVar.s(ug.b.f23639e)) {
            return new a0();
        }
        if (vVar.s(ug.b.f23655m)) {
            return new c0(128);
        }
        if (vVar.s(ug.b.f23657n)) {
            return new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + vVar);
    }
}
